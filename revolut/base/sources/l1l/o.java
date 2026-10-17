package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements yqi.f {
    public static yqi.d a(n validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        Long l2 = validationData.f191589a;
        long j2 = validationData.f191591c;
        if (l2 != null && j2 > l2.longValue()) {
            return new yqi.d(validationData, new i1l.g(l2.longValue(), validationData.f191590b));
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((n) obj2);
    }
}
