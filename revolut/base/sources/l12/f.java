package l12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements yqi.f {
    public static yqi.d a(e validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f191423b) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        if (Math.abs(validationData.f191422a.f115082a) % ((long) Math.pow(10.0d, r0.f115083b.c())) != 0) {
            return new yqi.d(validationData, j1l.a.f170634a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((e) obj2);
    }
}
