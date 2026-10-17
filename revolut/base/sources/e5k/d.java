package e5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements yqi.f {
    public static yqi.d a(c validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f122828a.getError() != null) {
            return new yqi.d(validationData, d5k.f.f111426a);
        }
        if (validationData.f122829b.getError() != null) {
            return new yqi.d(validationData, d5k.c.f111423a);
        }
        if (validationData.d > 0 && validationData.f122830c == null) {
            return new yqi.d(validationData, d5k.e.f111425a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((c) obj2);
    }
}
