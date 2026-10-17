package yoc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public static dj0.d a(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        long jK = cp5.d.k(money.f115083b);
        return dj0.d.c(money, g4i.a.s(((jK / ((long) 2)) + money.f115082a) - 1, jK), null, 2);
    }
}
