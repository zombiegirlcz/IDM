package dcb;

import kotlin.jvm.internal.Intrinsics;
import srf.h;
import urf.g;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements h {
    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        d validationData = (d) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.c().f112853a == 0) {
            return new yqi.d(validationData, g.f282312a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
