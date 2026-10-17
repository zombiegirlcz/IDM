package e5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements yqi.f {
    public static yqi.d a(e validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f122831a.contains(z1k.g.CHARGE_BEARER) && !validationData.f122832b) {
            return new yqi.d(validationData, d5k.d.f111424a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((e) obj2);
    }
}
