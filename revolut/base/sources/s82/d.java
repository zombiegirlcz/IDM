package s82;

import h02.g;
import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements f {
    public static yqi.d a(c validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        long j2 = validationData.f260878a.f115082a;
        g gVar = validationData.f260879b;
        if (gVar == null) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        yqi.b aVar = null;
        if (j2 != 0) {
            dj0.d dVar = gVar.f148188a;
            if (j2 < dVar.f115082a) {
                aVar = new urf.b(dVar);
            } else {
                dj0.d dVar2 = gVar.f148189b;
                if (j2 > dVar2.f115082a) {
                    aVar = new urf.a(dVar2);
                }
            }
        }
        if (aVar != null) {
            return new yqi.d(validationData, aVar);
        }
        if (j2 % gVar.f148190c != 0) {
            return new yqi.d(validationData, r82.a.f252307a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((c) obj2);
    }
}
