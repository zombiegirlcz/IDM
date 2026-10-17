package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.event.BodyEvent;
import ch.qos.logback.core.joran.event.EndEvent;
import ch.qos.logback.core.joran.event.StartEvent;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

/* JADX INFO: loaded from: classes.dex */
public class Interpreter {
    private static List<Action> EMPTY_LIST = new Vector(0);

    /* JADX INFO: renamed from: cai, reason: collision with root package name */
    private final CAI_WithLocatorSupport f24068cai;
    private ElementPath elementPath;
    private final InterpretationContext interpretationContext;
    Locator locator;
    private final RuleStore ruleStore;
    ElementPath skip = null;
    private final ArrayList<ImplicitAction> implicitActions = new ArrayList<>(3);
    Stack<List<Action>> actionListStack = new Stack<>();
    EventPlayer eventPlayer = new EventPlayer(this);

    public Interpreter(Context context, RuleStore ruleStore, ElementPath elementPath) {
        this.f24068cai = new CAI_WithLocatorSupport(context, this);
        this.ruleStore = ruleStore;
        this.interpretationContext = new InterpretationContext(context, this);
        this.elementPath = elementPath;
    }

    private void callBodyAction(List<Action> list, String str) {
        if (list == null) {
            return;
        }
        for (Action action : list) {
            try {
                action.body(this.interpretationContext, str);
            } catch (ActionException e) {
                this.f24068cai.addError("Exception in end() methd for action [" + action + "]", e);
            }
        }
    }

    private void callEndAction(List<Action> list, String str) {
        CAI_WithLocatorSupport cAI_WithLocatorSupport;
        StringBuilder sb6;
        if (list == null) {
            return;
        }
        Iterator<Action> it8 = list.iterator();
        while (it8.hasNext()) {
            try {
                it8.next().end(this.interpretationContext, str);
            } catch (ActionException e) {
                e = e;
                cAI_WithLocatorSupport = this.f24068cai;
                sb6 = new StringBuilder("ActionException in Action for tag [");
                sb6.append(str);
                sb6.append("]");
                cAI_WithLocatorSupport.addError(sb6.toString(), e);
            } catch (RuntimeException e2) {
                e = e2;
                cAI_WithLocatorSupport = this.f24068cai;
                sb6 = new StringBuilder("RuntimeException in Action for tag [");
                sb6.append(str);
                sb6.append("]");
                cAI_WithLocatorSupport.addError(sb6.toString(), e);
            }
        }
    }

    private void pushEmptyActionList() {
        this.actionListStack.add(EMPTY_LIST);
    }

    public void addImplicitAction(ImplicitAction implicitAction) {
        this.implicitActions.add(implicitAction);
    }

    public void callBeginAction(List<Action> list, String str, Attributes attributes) {
        CAI_WithLocatorSupport cAI_WithLocatorSupport;
        StringBuilder sb6;
        if (list == null) {
            return;
        }
        Iterator<Action> it8 = list.iterator();
        while (it8.hasNext()) {
            try {
                it8.next().begin(this.interpretationContext, str, attributes);
            } catch (ActionException e) {
                e = e;
                this.skip = this.elementPath.duplicate();
                cAI_WithLocatorSupport = this.f24068cai;
                sb6 = new StringBuilder("ActionException in Action for tag [");
                sb6.append(str);
                sb6.append("]");
                cAI_WithLocatorSupport.addError(sb6.toString(), e);
            } catch (RuntimeException e2) {
                e = e2;
                this.skip = this.elementPath.duplicate();
                cAI_WithLocatorSupport = this.f24068cai;
                sb6 = new StringBuilder("RuntimeException in Action for tag [");
                sb6.append(str);
                sb6.append("]");
                cAI_WithLocatorSupport.addError(sb6.toString(), e);
            }
        }
    }

    public void characters(BodyEvent bodyEvent) {
        setDocumentLocator(bodyEvent.locator);
        String text = bodyEvent.getText();
        List<Action> listPeek = this.actionListStack.peek();
        if (text != null) {
            String strTrim = text.trim();
            if (strTrim.length() > 0) {
                callBodyAction(listPeek, strTrim);
            }
        }
    }

    public void endElement(EndEvent endEvent) {
        setDocumentLocator(endEvent.locator);
        endElement(endEvent.namespaceURI, endEvent.localName, endEvent.qName);
    }

    public List<Action> getApplicableActionList(ElementPath elementPath, Attributes attributes) {
        List<Action> listMatchActions = this.ruleStore.matchActions(elementPath);
        return listMatchActions == null ? lookupImplicitAction(elementPath, attributes, this.interpretationContext) : listMatchActions;
    }

    public EventPlayer getEventPlayer() {
        return this.eventPlayer;
    }

    public InterpretationContext getExecutionContext() {
        return getInterpretationContext();
    }

    public InterpretationContext getInterpretationContext() {
        return this.interpretationContext;
    }

    public Locator getLocator() {
        return this.locator;
    }

    public RuleStore getRuleStore() {
        return this.ruleStore;
    }

    public String getTagName(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    public List<Action> lookupImplicitAction(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        int size = this.implicitActions.size();
        for (int i = 0; i < size; i++) {
            ImplicitAction implicitAction = this.implicitActions.get(i);
            if (implicitAction.isApplicable(elementPath, attributes, interpretationContext)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(implicitAction);
                return arrayList;
            }
        }
        return null;
    }

    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    public void setInterpretationContextPropertiesMap(Map<String, String> map) {
        this.interpretationContext.setPropertiesMap(map);
    }

    public void startDocument() {
    }

    public void startElement(StartEvent startEvent) {
        setDocumentLocator(startEvent.getLocator());
        startElement(startEvent.namespaceURI, startEvent.localName, startEvent.qName, startEvent.attributes);
    }

    private void endElement(String str, String str2, String str3) {
        List<Action> listPop = this.actionListStack.pop();
        ElementPath elementPath = this.skip;
        if (elementPath != null) {
            if (elementPath.equals(this.elementPath)) {
                this.skip = null;
            }
        } else if (listPop != EMPTY_LIST) {
            callEndAction(listPop, getTagName(str2, str3));
        }
        this.elementPath.pop();
    }

    private void startElement(String str, String str2, String str3, Attributes attributes) {
        String tagName = getTagName(str2, str3);
        this.elementPath.push(tagName);
        if (this.skip != null) {
            pushEmptyActionList();
            return;
        }
        List<Action> applicableActionList = getApplicableActionList(this.elementPath, attributes);
        if (applicableActionList != null) {
            this.actionListStack.add(applicableActionList);
            callBeginAction(applicableActionList, tagName, attributes);
            return;
        }
        pushEmptyActionList();
        StringBuilder sbX = a.x("no applicable action for [", tagName, "], current ElementPath  is [");
        sbX.append(this.elementPath);
        sbX.append("]");
        this.f24068cai.addError(sbX.toString());
    }
}
