package kem;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f183223a;

    static {
        Character[] elements = {Character.valueOf(CoreConstants.LEFT_PARENTHESIS_CHAR), Character.valueOf(CoreConstants.RIGHT_PARENTHESIS_CHAR), '<', '>', '@', Character.valueOf(CoreConstants.COMMA_CHAR), ';', Character.valueOf(CoreConstants.COLON_CHAR), Character.valueOf(CoreConstants.ESCAPE_CHAR), Character.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR), '/', '[', ']', '?', '=', Character.valueOf(CoreConstants.CURLY_LEFT), Character.valueOf(CoreConstants.CURLY_RIGHT), Character.valueOf(zsc.p.SPACE_CHAR), '\t', '\n', '\r'};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f183223a = kotlin.collections.d.y0(elements);
    }

    public static final boolean a(String str) {
        if (str.length() != 0) {
            if (str.length() >= 2 && kotlin.text.f0.P0(str) == '\"' && kotlin.text.f0.S0(str) == '\"') {
                int i = 1;
                do {
                    int iS = kotlin.text.d0.S(str, CoreConstants.DOUBLE_QUOTE_CHAR, i, 4);
                    if (iS == kotlin.text.d0.P(str)) {
                        break;
                    }
                    int i2 = 0;
                    for (int i3 = iS - 1; str.charAt(i3) == '\\'; i3--) {
                        i2++;
                    }
                    if (i2 % 2 != 0) {
                        i = iS + 1;
                    }
                } while (i < str.length());
                return false;
            }
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                if (!f183223a.contains(Character.valueOf(str.charAt(i5)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final String b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb6 = new StringBuilder("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb6.append("\\t");
            } else if (cCharAt == '\n') {
                sb6.append("\\n");
            } else if (cCharAt == '\r') {
                sb6.append("\\r");
            } else if (cCharAt == '\"') {
                sb6.append("\\\"");
            } else if (cCharAt != '\\') {
                sb6.append(cCharAt);
            } else {
                sb6.append("\\\\");
            }
        }
        sb6.append("\"");
        return sb6.toString();
    }
}
