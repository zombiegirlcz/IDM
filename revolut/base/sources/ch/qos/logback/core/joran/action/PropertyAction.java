package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes.dex */
public class PropertyAction extends Action {
    static String INVALID_ATTRIBUTES = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
    static final String RESOURCE_ATTRIBUTE = "resource";

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String strSubst;
        StringBuilder sb6;
        StringBuilder sb9;
        if ("substitutionProperty".equals(str)) {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        ActionUtil.Scope scopeStringToScope = ActionUtil.stringToScope(attributes.getValue("scope"));
        if (!checkFileAttributeSanity(attributes)) {
            if (!checkResourceAttributeSanity(attributes)) {
                if (checkValueNameAttributesSanity(attributes)) {
                    ActionUtil.setProperty(interpretationContext, value, interpretationContext.subst(RegularEscapeUtil.basicEscape(value2).trim()), scopeStringToScope);
                    return;
                } else {
                    addError(INVALID_ATTRIBUTES);
                    return;
                }
            }
            strSubst = interpretationContext.subst(attributes.getValue("resource"));
            URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(strSubst);
            if (resourceBySelfClassLoader == null) {
                sb9 = new StringBuilder("Could not find resource [");
                sb9.append(strSubst);
                sb9.append("].");
                addError(sb9.toString());
                return;
            }
            try {
                loadAndSetProperties(interpretationContext, FirebasePerfUrlConnection.openStream(resourceBySelfClassLoader), scopeStringToScope);
                return;
            } catch (IOException e) {
                e = e;
                sb6 = new StringBuilder("Could not read resource file [");
                sb6.append(strSubst);
                sb6.append("].");
                addError(sb6.toString(), e);
            }
        }
        strSubst = interpretationContext.subst(attributes.getValue("file"));
        try {
            loadAndSetProperties(interpretationContext, new FileInputStream(strSubst), scopeStringToScope);
        } catch (FileNotFoundException unused) {
            sb9 = new StringBuilder("Could not find properties file [");
        } catch (IOException e2) {
            e = e2;
            sb6 = new StringBuilder("Could not read properties file [");
            sb6.append(strSubst);
            sb6.append("].");
            addError(sb6.toString(), e);
        }
    }

    public boolean checkFileAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("resource"));
    }

    public boolean checkResourceAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("resource")) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file"));
    }

    public boolean checkValueNameAttributesSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("name")) && !OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue("file")) && OptionHelper.isEmpty(attributes.getValue("resource"));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    public void loadAndSetProperties(InterpretationContext interpretationContext, InputStream inputStream, ActionUtil.Scope scope) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        ActionUtil.setProperties(interpretationContext, properties, scope);
    }
}
