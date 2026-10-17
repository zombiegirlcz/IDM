package srf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements h {
    public static yqi.d a(c validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        xi0.b bVar = validationData.b().d;
        long j2 = validationData.b().f265207a;
        xi0.b bVar2 = validationData.b().f265209c;
        double d = validationData.b().e;
        long j3 = validationData.b().f;
        if (j3 == 0) {
            j3 = pyd.c.K(new dj0.d(j2, bVar), d, bVar2).f115082a;
        }
        if (j3 > validationData.b().f265208b) {
            return new yqi.d(validationData, a.f265206a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((c) obj2);
    }
}
