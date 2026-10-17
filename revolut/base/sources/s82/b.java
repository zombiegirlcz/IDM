package s82;

import kotlin.jvm.internal.Intrinsics;
import urf.g;
import yqi.f;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements f {
    public static yqi.d a(a validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f260877c == hrf.f.INCOMING) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        long j2 = validationData.f260876b;
        long j3 = validationData.f260875a;
        if (j2 == 0) {
            return new yqi.d(validationData, g.f282312a);
        }
        if (j2 > j3) {
            return new yqi.d(validationData, srf.a.f265206a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((a) obj2);
    }
}
