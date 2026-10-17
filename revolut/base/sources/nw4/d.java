package nw4;

import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {
    public static yqi.d a(c validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        dj0.d dVar = validationData.f219766a;
        if (dVar.compareTo(validationData.f219767b) > 0) {
            return new yqi.d(validationData, b.f219765a);
        }
        if (dVar.compareTo(validationData.f219768c) > 0) {
            return new yqi.d(validationData, a.f219764a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((c) obj2);
    }
}
