package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.FormatInfo;

/* JADX INFO: loaded from: classes.dex */
public class IntegerTokenConverter extends DynamicConverter<Object> implements MonoTypedConverter {
    public static final String CONVERTER_KEY = "i";

    public String convert(int i) {
        String string = Integer.toString(i);
        FormatInfo formattingInfo = getFormattingInfo();
        if (formattingInfo == null) {
            return string;
        }
        int min = formattingInfo.getMin();
        StringBuilder sb6 = new StringBuilder();
        for (int length = string.length(); length < min; length++) {
            sb6.append('0');
        }
        sb6.append(string);
        return sb6.toString();
    }

    @Override // ch.qos.logback.core.rolling.helper.MonoTypedConverter
    public boolean isApplicable(Object obj2) {
        return obj2 instanceof Integer;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(Object obj2) {
        if (obj2 == null) {
            throw new IllegalArgumentException("Null argument forbidden");
        }
        if (obj2 instanceof Integer) {
            return convert(((Integer) obj2).intValue());
        }
        throw new IllegalArgumentException("Cannot convert " + obj2 + " of type" + obj2.getClass().getName());
    }
}
