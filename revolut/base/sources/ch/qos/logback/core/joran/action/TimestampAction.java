package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;
import v0.a;

/* JADX INFO: loaded from: classes.dex */
public class TimestampAction extends Action {
    boolean inError = false;
    static String CONTEXT_BIRTH = "contextBirth";
    static String TIME_REFERENCE_ATTRIBUTE = "timeReference";
    static String DATE_PATTERN_ATTRIBUTE = "datePattern";

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        long jCurrentTimeMillis;
        String value = attributes.getValue("key");
        if (OptionHelper.isEmpty(value)) {
            addError("Attribute named [key] cannot be empty");
            this.inError = true;
        }
        String value2 = attributes.getValue(DATE_PATTERN_ATTRIBUTE);
        if (OptionHelper.isEmpty(value2)) {
            addError("Attribute named [" + DATE_PATTERN_ATTRIBUTE + "] cannot be empty");
            this.inError = true;
        }
        if (CONTEXT_BIRTH.equalsIgnoreCase(attributes.getValue(TIME_REFERENCE_ATTRIBUTE))) {
            addInfo("Using context birth as time reference.");
            jCurrentTimeMillis = this.context.getBirthTime();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            addInfo("Using current interpretation time, i.e. now, as time reference.");
        }
        if (this.inError) {
            return;
        }
        ActionUtil.Scope scopeStringToScope = ActionUtil.stringToScope(attributes.getValue("scope"));
        String str2 = new CachingDateFormatter(value2).format(jCurrentTimeMillis);
        StringBuilder sbM = a.m("Adding property to the context with key=\"", value, "\" and value=\"", str2, "\" to the ");
        sbM.append(scopeStringToScope);
        sbM.append(" scope");
        addInfo(sbM.toString());
        ActionUtil.setProperty(interpretationContext, value, str2, scopeStringToScope);
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws ActionException {
    }
}
