package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.spi.SimpleRuleStore;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class GenericConfigurator extends ContextAwareBase {
    protected Interpreter interpreter;

    public static void informContextOfURLUsedForConfiguration(Context context, URL url2) {
        ConfigurationWatchListUtil.setMainWatchURL(context, url2);
    }

    public void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
    }

    public abstract void addImplicitRules(Interpreter interpreter);

    public abstract void addInstanceRules(RuleStore ruleStore);

    public void buildInterpreter() {
        SimpleRuleStore simpleRuleStore = new SimpleRuleStore(this.context);
        addInstanceRules(simpleRuleStore);
        Interpreter interpreter = new Interpreter(this.context, simpleRuleStore, initialElementPath());
        this.interpreter = interpreter;
        InterpretationContext interpretationContext = interpreter.getInterpretationContext();
        interpretationContext.setContext(this.context);
        addImplicitRules(this.interpreter);
        addDefaultNestedComponentRegistryRules(interpretationContext.getDefaultNestedComponentRegistry());
    }

    public final void doConfigure(File file) throws JoranException {
        try {
            URL url2 = file.toURI().toURL();
            informContextOfURLUsedForConfiguration(getContext(), url2);
            doConfigure(new FileInputStream(file), url2.toExternalForm());
        } catch (IOException e) {
            String str = "Could not open [" + file.getPath() + "].";
            addError(str, e);
            throw new JoranException(str, e);
        }
    }

    public ElementPath initialElementPath() {
        return new ElementPath();
    }

    public List<SaxEvent> recallSafeConfiguration() {
        return (List) this.context.getObject("SAFE_JORAN_CONFIGURATION");
    }

    public void registerSafeConfiguration(List<SaxEvent> list) {
        this.context.putObject("SAFE_JORAN_CONFIGURATION", list);
    }

    public final void doConfigure(InputStream inputStream) throws JoranException {
        try {
            doConfigure(new InputSource(inputStream));
            try {
                inputStream.close();
            } catch (IOException e) {
                addError("Could not close the stream", e);
                throw new JoranException("Could not close the stream", e);
            }
        } catch (Throwable th10) {
            try {
                inputStream.close();
                throw th10;
            } catch (IOException e2) {
                addError("Could not close the stream", e2);
                throw new JoranException("Could not close the stream", e2);
            }
        }
    }

    public final void doConfigure(InputStream inputStream, String str) throws JoranException {
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        doConfigure(inputSource);
    }

    public final void doConfigure(String str) throws JoranException {
        doConfigure(new File(str));
    }

    public final void doConfigure(URL url2) throws JoranException {
        try {
            informContextOfURLUsedForConfiguration(getContext(), url2);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection());
            uRLConnection.setUseCaches(false);
            doConfigure(uRLConnection.getInputStream(), url2.toExternalForm());
        } catch (IOException e) {
            String str = "Could not open URL [" + url2 + "].";
            addError(str, e);
            throw new JoranException(str, e);
        }
    }

    public void doConfigure(List<SaxEvent> list) throws JoranException {
        buildInterpreter();
        synchronized (this.context.getConfigurationLock()) {
            this.interpreter.getEventPlayer().play(list);
        }
    }

    private final void doConfigure(InputSource inputSource) throws JoranException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SaxEventRecorder saxEventRecorder = new SaxEventRecorder(this.context);
        saxEventRecorder.recordEvents(inputSource);
        doConfigure(saxEventRecorder.getSaxEventList());
        if (new StatusUtil(this.context).noXMLParsingErrorsOccurred(jCurrentTimeMillis)) {
            addInfo("Registering current configuration as safe fallback point");
            registerSafeConfiguration(saxEventRecorder.getSaxEventList());
        }
    }
}
