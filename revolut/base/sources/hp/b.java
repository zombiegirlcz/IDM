package hp;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f154355b = {2, 3, 4, 5, 6, 7, 8, 9};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f154356c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f154357a;

    static {
        String[] elements = {"00000000000000", "11111111111111", "22222222222222", "33333333333333", "44444444444444", "55555555555555", "66666666666666", "77777777777777", "88888888888888", "99999999999999"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f154356c = kotlin.collections.d.y0(elements);
    }

    public b(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f154357a = regexMatcher;
    }

    public static int a(int i, String str) {
        int iCharAt;
        if (i >= 0) {
            int i2 = 0;
            iCharAt = 0;
            while (true) {
                iCharAt += (str.charAt(i - i2) - '0') * f154355b[i2 % 8];
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        } else {
            iCharAt = 0;
        }
        int i3 = iCharAt % 11;
        if (i3 < 2) {
            return 0;
        }
        return 11 - i3;
    }

    public final String b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Regex("[-./]").replace(value, "");
    }

    public final boolean c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!((zzl.c) this.f154357a).a("^([A-Z0-9]{2}\\.[A-Z0-9]{3}\\.[A-Z0-9]{3}/[A-Z0-9]{4}-[A-Z0-9]{2}|[A-Z0-9]{14})$", value)) {
            return false;
        }
        String strB = b(value);
        return !f154356c.contains(strB) && Character.isDigit(strB.charAt(12)) && Character.isDigit(strB.charAt(13)) && a(11, strB) == kotlin.text.a.a(strB.charAt(12)) && a(12, strB) == kotlin.text.a.a(strB.charAt(13));
    }
}
