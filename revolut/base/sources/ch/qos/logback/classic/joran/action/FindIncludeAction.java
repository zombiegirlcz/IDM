package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.joran.action.ConditionalIncludeAction;
import ch.qos.logback.core.joran.action.IncludeAction;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class FindIncludeAction extends IncludeAction {
    private static final int EVENT_OFFSET = 1;

    public FindIncludeAction() {
        setEventOffset(1);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
    }

    @Override // ch.qos.logback.core.joran.action.IncludeAction
    public SaxEventRecorder createRecorder(InputStream inputStream, URL url2) {
        return new SaxEventRecorder(getContext());
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
        if (interpretationContext.isEmpty() || !(interpretationContext.peekObject() instanceof ConditionalIncludeAction.State)) {
            return;
        }
        URL url2 = ((ConditionalIncludeAction.State) interpretationContext.popObject()).getUrl();
        if (url2 == null) {
            addInfo("No paths found from includes");
            return;
        }
        addInfo("Path found [" + url2.toString() + "]");
        try {
            processInclude(interpretationContext, url2);
        } catch (JoranException e) {
            addError("Failed to process include [" + url2.toString() + "]", e);
        }
    }
}
