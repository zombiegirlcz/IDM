package cxd;

import cul.r1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements zwd.e {
    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        g validationData = (g) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        return validationData.d.k() ? zwd.f.d(validationData, new r1(22), new r1(23)) : zwd.f.d(validationData, new r1(20), new r1(21));
    }
}
