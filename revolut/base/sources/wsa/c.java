package wsa;

import kotlin.jvm.internal.Intrinsics;
import yqi.d;
import yqi.f;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {
    public static d a(b validationData) {
        dj0.d dVarO;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        long j2 = validationData.f299683b;
        long j3 = validationData.f299682a;
        kqa.a aVar = validationData.f299684c;
        if (aVar != null && (dVarO = pyd.c.O(aVar.f188350a, aVar.a())) != null) {
            j2 = dVarO.f115082a;
        }
        if (j2 > j3) {
            return new d(validationData, a.f299681a);
        }
        d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ d validate(Object obj2) {
        return a((b) obj2);
    }
}
