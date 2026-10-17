package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements yqi.f {
    public static yqi.d a(l validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        long j2 = validationData.f191587a.f115082a;
        long j3 = validationData.f191588b;
        if (j3 == 0) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        if (j2 > j3) {
            return new yqi.d(validationData, new i1l.d(new dj0.d(j3, validationData.f191587a.f115083b)));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((l) obj2);
    }
}
