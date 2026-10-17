package o8b;

import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private d() {
    }

    public static e a(wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        int i = Integer.MAX_VALUE;
        e eVar = null;
        for (e eVar2 : e.values()) {
            int i2 = 0;
            for (Object obj2 : eVar2.a()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                if (Intrinsics.f((wi0.b) obj2, country) && i2 < i) {
                    eVar = eVar2;
                    i = i2;
                }
                i2 = i3;
            }
        }
        return eVar;
    }
}
