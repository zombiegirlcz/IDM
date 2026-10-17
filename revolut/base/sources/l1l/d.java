package l1l;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements yqi.f {
    public static yqi.d a(c validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        Data data = validationData.f191578b;
        dj0.d dVar = validationData.f191577a;
        hrf.e eVar = (hrf.e) data.getContent();
        if (validationData.f191578b.getLoading() || eVar == null) {
            return new yqi.d(validationData, trf.a.f273792a);
        }
        long j2 = dVar.f115082a;
        Long l2 = eVar.f154816c;
        Long lValueOf = null;
        if (l2 != null) {
            if (l2.longValue() == 0) {
                l2 = null;
            }
            if (l2 != null) {
                lValueOf = Long.valueOf(Math.abs(l2.longValue()));
            }
        }
        if (j2 != 0 && lValueOf != null && j2 % lValueOf.longValue() != 0) {
            return new yqi.d(validationData, new k1l.a(new dj0.d(lValueOf.longValue(), dVar.f115083b)));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((c) obj2);
    }
}
