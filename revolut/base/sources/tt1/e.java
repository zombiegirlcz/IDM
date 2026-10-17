package tt1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {
    public static yqi.b a(long j2, e7l.b bVar) {
        if (j2 == 0) {
            return null;
        }
        dj0.d dVar = bVar.f123351a;
        if (j2 < dVar.f115082a) {
            return new urf.b(dVar);
        }
        dj0.d dVar2 = bVar.f123352b;
        if (j2 > dVar2.f115082a) {
            return new urf.a(dVar2);
        }
        return null;
    }

    public static yqi.d b(c validationData) {
        yqi.b bVarA;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        long j2 = validationData.f274190a;
        e7l.c cVar = validationData.f274192c;
        if (cVar == null) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        int i = d.f274193a[validationData.f274191b.ordinal()];
        if (i == 1) {
            bVarA = a(j2, cVar.f123354a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVarA = a(j2, cVar.f123355b);
        }
        if (bVarA != null) {
            return new yqi.d(validationData, bVarA);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return b((c) obj2);
    }
}
