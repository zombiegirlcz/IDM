package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.AbstractIncludeAction;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class ConditionalIncludeAction extends AbstractIncludeAction {

    /* JADX INFO: loaded from: classes16.dex */
    public class State {

        /* JADX INFO: renamed from: url, reason: collision with root package name */
        private URL f24054url;

        public State() {
        }

        public URL getUrl() {
            return this.f24054url;
        }

        public void setUrl(URL url2) {
            this.f24054url = url2;
        }
    }

    private URL peekPath(InterpretationContext interpretationContext) {
        URL url2;
        if (interpretationContext.isEmpty()) {
            return null;
        }
        Object objPeekObject = interpretationContext.peekObject();
        if (!(objPeekObject instanceof State) || (url2 = ((State) objPeekObject).getUrl()) == null) {
            return null;
        }
        return url2;
    }

    private URL pushPath(InterpretationContext interpretationContext, URL url2) {
        State state = new State();
        state.setUrl(url2);
        interpretationContext.pushObject(state);
        return url2;
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        if (peekPath(interpretationContext) != null) {
            return;
        }
        super.begin(interpretationContext, str, attributes);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void handleError(String str, Exception exc2) {
        if (exc2 == null || (exc2 instanceof FileNotFoundException) || (exc2 instanceof UnknownHostException)) {
            addInfo(str);
        } else {
            addWarn(str, exc2);
        }
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction
    public void processInclude(InterpretationContext interpretationContext, URL url2) throws JoranException {
        pushPath(interpretationContext, url2);
    }
}
