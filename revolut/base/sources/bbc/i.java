package bbc;

import cli.k;
import cli.y;
import cli.z;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.DeleteTrackingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements z {
    public final DeleteTrackingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tul.b f14251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f14252q;

    public i(DeleteTrackingScreenContract$InputData inputData, tul.b trackingInteractor, h mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(trackingInteractor, "trackingInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f14251p = trackingInteractor;
        this.f14252q = mra.d.b(this, k.f25028a, mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f14252q;
    }
}
