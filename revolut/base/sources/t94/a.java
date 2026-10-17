package t94;

import com.revolut.data.model.Data;
import cz4.b;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {
    @Override // cz4.b
    public final efm.b a(String facilityId, String sourceId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // cz4.b
    public final r b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
