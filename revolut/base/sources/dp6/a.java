package dp6;

import gim.c;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lp6.m;
import vkm.d;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    static d a(a aVar, yo6.d referenceType) {
        m mVar = (m) aVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        return mVar.d.c(referenceType.b(), false);
    }

    static /* synthetic */ Object b(a aVar, yo6.d dVar, String str, int i, String str2, ArrayList arrayList, c cVar, int i2) {
        Boolean bool = Boolean.TRUE;
        if ((i2 & 64) != 0) {
            bool = null;
        }
        return ((m) aVar).e(dVar, str, i, str2, arrayList, null, bool, cVar);
    }
}
