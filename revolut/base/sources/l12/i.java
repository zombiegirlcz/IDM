package l12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements yqi.f {
    public static yqi.d a(h validationData) {
        r02.d dVar;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        long j2 = validationData.f191424a;
        r02.e eVar = validationData.f191426c;
        if (eVar == null) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        yqi.b aVar = null;
        if (j2 != 0) {
            dj0.d dVar2 = eVar.f250682a;
            if (dVar2 == null || j2 >= dVar2.f115082a) {
                dj0.d dVar3 = eVar.f250683b;
                if (dVar3 != null) {
                    dj0.d dVar4 = eVar.f250684c;
                    if (j2 + (dVar4 != null ? dVar4.f115082a : 0L) > dVar3.f115082a) {
                        aVar = (dVar4 == null || (dVar = eVar.d) == r02.d.UNKNOWN) ? new urf.a(dVar3) : new b(dVar3, dVar, eVar.e, dVar4);
                    }
                }
            } else {
                aVar = new urf.b(dVar2);
            }
        }
        if (aVar != null) {
            return new yqi.d(validationData, aVar);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((h) obj2);
    }
}
