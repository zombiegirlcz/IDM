package fo2;

import ch.qos.logback.core.CoreConstants;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes21.dex */
public final class r {
    private r() {
    }

    public static String a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb6 = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < input.length(); i++) {
            char cCharAt = input.charAt(i);
            Character[] elements = {Character.valueOf(CoreConstants.CURLY_LEFT), Character.valueOf(CoreConstants.CURLY_RIGHT)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(Character.valueOf(cCharAt))) {
                Unit unit = Unit.f186387a;
            } else if (cCharAt == '[') {
                Unit unit2 = Unit.f186387a;
                z = true;
            } else if (cCharAt == ']') {
                Unit unit3 = Unit.f186387a;
                z = false;
            } else if (z) {
                Character[] elements2 = {'0', '9'};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                if (kotlin.collections.d.y0(elements2).contains(Character.valueOf(cCharAt))) {
                    sb6.append("#");
                } else {
                    Character[] elements3 = {'A', 'a'};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    if (kotlin.collections.d.y0(elements3).contains(Character.valueOf(cCharAt))) {
                        sb6.append("X");
                    } else {
                        Character[] elements4 = {Character.valueOf(CoreConstants.DASH_CHAR), '_'};
                        Intrinsics.checkNotNullParameter(elements4, "elements");
                        if (kotlin.collections.d.y0(elements4).contains(Character.valueOf(cCharAt))) {
                            sb6.append("∗");
                        } else if (cCharAt == 8230) {
                            m70.a.t(t0.f186434a);
                            sb6.append(" ");
                            sb6.append(cCharAt);
                        } else {
                            sb6.append((char) 8727);
                        }
                    }
                }
            } else {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
