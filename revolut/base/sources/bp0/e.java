package bp0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5h.g[] f17496a = new a5h.g[3];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f17497b = 1;

    private e() {
    }

    public static a5h.g a(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        int i = f17497b;
        int i2 = i + 3;
        int i3 = i;
        while (true) {
            a5h.g[] gVarArr = f17496a;
            if (i3 >= i2) {
                a5h.g gVar = new a5h.g(locale);
                int i5 = (i + 2) % 3;
                gVarArr[i5] = gVar;
                f17497b = i5;
                return gVar;
            }
            a5h.g gVar2 = gVarArr[i3 % 3];
            if (gVar2 != null && Intrinsics.f((Locale) gVar2.f1406b, locale)) {
                return gVar2;
            }
            i3++;
        }
    }
}
