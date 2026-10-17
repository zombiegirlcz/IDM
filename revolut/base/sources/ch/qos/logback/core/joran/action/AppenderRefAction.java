package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.util.OptionHelper;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.HashMap;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class AppenderRefAction<E> extends Action {
    boolean inError = false;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        this.inError = false;
        Object objPeekObject = interpretationContext.peekObject();
        if (!(objPeekObject instanceof AppenderAttachable)) {
            StringBuilder sbX = a.x("Could not find an AppenderAttachable at the top of execution stack. Near [", str, "] line ");
            sbX.append(getLineNumber(interpretationContext));
            String string = sbX.toString();
            this.inError = true;
            addError(string);
            return;
        }
        AppenderAttachable appenderAttachable = (AppenderAttachable) objPeekObject;
        String strSubst = interpretationContext.subst(attributes.getValue("ref"));
        if (OptionHelper.isEmpty(strSubst)) {
            this.inError = true;
            addError("Missing appender ref attribute in <appender-ref> tag.");
            return;
        }
        Appender<E> appender = (Appender) ((HashMap) interpretationContext.getObjectMap().get("APPENDER_BAG")).get(strSubst);
        if (appender == null) {
            String strP = p.a.p("Could not find an appender named [", strSubst, "]. Did you define it below instead of above in the configuration file?");
            this.inError = true;
            addError(strP);
            addError("See http://logback.qos.ch/codes.html#appender_order for more details.");
            return;
        }
        addInfo("Attaching appender named [" + strSubst + "] to " + appenderAttachable);
        appenderAttachable.addAppender(appender);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }
}
