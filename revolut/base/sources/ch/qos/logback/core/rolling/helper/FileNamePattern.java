package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FileNamePattern extends ContextAwareBase {
    static final Map<String, String> CONVERTER_MAP;
    Converter<Object> headTokenConverter;
    String pattern;

    static {
        HashMap map = new HashMap();
        CONVERTER_MAP = map;
        map.put("i", IntegerTokenConverter.class.getName());
        map.put("d", DateTokenConverter.class.getName());
    }

    public FileNamePattern(String str, Context context) {
        setPattern(FileFilterUtil.slashify(str));
        setContext(context);
        parse();
        ConverterUtil.startConverters(this.headTokenConverter);
    }

    public String convert(Object obj2) {
        StringBuilder sb6 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            sb6.append(next.convert(obj2));
        }
        return sb6.toString();
    }

    public String convertInt(int i) {
        return convert(Integer.valueOf(i));
    }

    public String convertMultipleArguments(Object... objArr) {
        StringBuilder sb6 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof MonoTypedConverter) {
                MonoTypedConverter monoTypedConverter = (MonoTypedConverter) next;
                for (Object obj2 : objArr) {
                    if (monoTypedConverter.isApplicable(obj2)) {
                        sb6.append(next.convert(obj2));
                    }
                }
            } else {
                sb6.append(next.convert(objArr));
            }
        }
        return sb6.toString();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        String str = this.pattern;
        String str2 = ((FileNamePattern) obj2).pattern;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public String escapeRightParantesis(String str) {
        return this.pattern.replace(")", "\\)");
    }

    public IntegerTokenConverter getIntegerTokenConverter() {
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof IntegerTokenConverter) {
                return (IntegerTokenConverter) next;
            }
        }
        return null;
    }

    public String getPattern() {
        return this.pattern;
    }

    public DateTokenConverter<Object> getPrimaryDateTokenConverter() {
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof DateTokenConverter) {
                DateTokenConverter<Object> dateTokenConverter = (DateTokenConverter) next;
                if (dateTokenConverter.isPrimary()) {
                    return dateTokenConverter;
                }
            }
        }
        return null;
    }

    public boolean hasIntegerTokenCOnverter() {
        return getIntegerTokenConverter() != null;
    }

    public int hashCode() {
        String str = this.pattern;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public void parse() {
        try {
            Parser parser = new Parser(escapeRightParantesis(this.pattern), new AlmostAsIsEscapeUtil());
            parser.setContext(this.context);
            this.headTokenConverter = parser.compile(parser.parse(), CONVERTER_MAP);
        } catch (ScanException e) {
            addError("Failed to parse pattern \"" + this.pattern + "\".", e);
        }
    }

    public void setPattern(String str) {
        if (str != null) {
            this.pattern = str.trim();
        }
    }

    public String toRegex() {
        String regex;
        StringBuilder sb6 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof LiteralConverter) {
                regex = next.convert(null);
            } else if (next instanceof IntegerTokenConverter) {
                regex = "\\d+";
            } else if (next instanceof DateTokenConverter) {
                regex = ((DateTokenConverter) next).toRegex();
            }
            sb6.append(regex);
        }
        return sb6.toString();
    }

    public String toRegexForFixedDate(Date date) {
        String strConvert;
        StringBuilder sb6 = new StringBuilder();
        for (Converter<Object> next = this.headTokenConverter; next != null; next = next.getNext()) {
            if (next instanceof LiteralConverter) {
                strConvert = next.convert(null);
            } else if (next instanceof IntegerTokenConverter) {
                strConvert = "(\\d+)";
            } else if (next instanceof DateTokenConverter) {
                strConvert = next.convert(date);
            }
            sb6.append(strConvert);
        }
        return sb6.toString();
    }

    public String toString() {
        return this.pattern;
    }
}
