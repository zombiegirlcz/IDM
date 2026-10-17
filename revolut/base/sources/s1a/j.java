package s1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {
    public static dj0.d a(int i, dj0.d billAmount) {
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        if (i > 0) {
            return new dj0.d(billAmount.a().f115082a / ((long) i), billAmount.f115083b);
        }
        throw new IllegalArgumentException(a0.d.n("peopleCount must be positive, but was ", i).toString());
    }
}
