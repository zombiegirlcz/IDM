package ch.qos.logback.core.util;

import java.text.DateFormatSymbols;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes16.dex */
class CharSequenceToRegexMapper {
    DateFormatSymbols symbols = DateFormatSymbols.getInstance();

    public static int[] findMinMaxLengthsInSymbols(String[] strArr) {
        int iMin = Integer.MAX_VALUE;
        int iMax = 0;
        for (String str : strArr) {
            int length = str.length();
            if (length != 0) {
                iMin = Math.min(iMin, length);
                iMax = Math.max(iMax, length);
            }
        }
        return new int[]{iMin, iMax};
    }

    private String getRegexForAmPms() {
        return symbolArrayToRegex(this.symbols.getAmPmStrings());
    }

    private String getRegexForLongDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getWeekdays());
    }

    private String getRegexForLongMonths() {
        return symbolArrayToRegex(this.symbols.getMonths());
    }

    private String getRegexForShortDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getShortWeekdays());
    }

    private String number(int i) {
        return j6.a.l(i, "\\d{", "}");
    }

    private String symbolArrayToRegex(String[] strArr) {
        int[] iArrFindMinMaxLengthsInSymbols = findMinMaxLengthsInSymbols(strArr);
        StringBuilder sb6 = new StringBuilder(".{");
        sb6.append(iArrFindMinMaxLengthsInSymbols[0]);
        sb6.append(",");
        return j6.a.v(sb6, "}", iArrFindMinMaxLengthsInSymbols[1]);
    }

    public String getRegexForShortMonths() {
        return symbolArrayToRegex(this.symbols.getShortMonths());
    }

    public String toRegex(CharSequenceState charSequenceState) {
        int i = charSequenceState.occurrences;
        char c2 = charSequenceState.f24083c;
        if (c2 != 'y') {
            if (c2 == 'z') {
                return ".*";
            }
            switch (c2) {
                case '\'':
                    if (i == 1) {
                        return "";
                    }
                    throw new IllegalStateException("Too many single quotes");
                case '.':
                    return "\\.";
                case 'K':
                case 'S':
                case 'W':
                case 'd':
                case 'h':
                case 'k':
                case LDSFile.EF_DG13_TAG /* 109 */:
                case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                case LDSFile.EF_SOD_TAG /* 119 */:
                    break;
                case 'M':
                    return i <= 2 ? number(i) : i == 3 ? getRegexForShortMonths() : getRegexForLongMonths();
                case 'Z':
                    return "(\\+|-)\\d{4}";
                case '\\':
                    throw new IllegalStateException("Forward slashes are not allowed");
                case 'a':
                    return getRegexForAmPms();
                default:
                    switch (c2) {
                        case 'D':
                        case 'F':
                        case 'H':
                            break;
                        case 'E':
                            return i >= 4 ? getRegexForLongDaysOfTheWeek() : getRegexForShortDaysOfTheWeek();
                        case 'G':
                            return ".*";
                        default:
                            if (i == 1) {
                                return com.google.android.gms.internal.mlkit_vision_face.a.j(c2, "");
                            }
                            return c2 + "{" + i + "}";
                    }
                    break;
            }
        }
        return number(i);
    }
}
