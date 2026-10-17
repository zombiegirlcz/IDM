package z2j;

import ch.qos.logback.core.CoreConstants;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    private e() {
    }

    public static String a(BankFieldDefinition definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        String strB = b(definition);
        if (strB.equals("[..................................................]")) {
            return null;
        }
        StringBuilder sb6 = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < strB.length(); i++) {
            char cCharAt = strB.charAt(i);
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
        return sb6.toString();
    }

    public static String b(BankFieldDefinition definition) {
        String str;
        Intrinsics.checkNotNullParameter(definition, "definition");
        int i = d.f319092a[definition.f60273c.ordinal()];
        return i != 1 ? i != 2 ? (i == 3 && (str = definition.f) != null) ? str : "[..................................................]" : "[00]{-}[00]{-}[00]" : "[____]{ }[____]{ }[____]{ }[____]{ }[____]{ }[----]{ }[----]{ }[----]";
    }
}
