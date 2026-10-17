package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements yqi.f {
    public static yqi.d a(i validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (!validationData.f191586c && !Intrinsics.f(validationData.f191584a, validationData.f191585b)) {
            return new yqi.d(validationData, i1l.b.f157645a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((i) obj2);
    }
}
