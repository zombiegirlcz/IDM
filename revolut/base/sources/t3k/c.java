package t3k;

import kotlin.jvm.internal.Intrinsics;
import yqi.f;
import z1k.g;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements f {
    public static yqi.d a(b validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f267818a.contains(g.CHARGE_BEARER) && !validationData.f267819b) {
            return new yqi.d(validationData, s3k.b.f259706a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        return a((b) obj2);
    }
}
