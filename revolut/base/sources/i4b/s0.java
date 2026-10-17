package i4b;

import com.revolut.feature.retail.cfd.api.domain.models.Fee;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f158377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f158378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f158379c;
    public final j60.a d;
    public final l4b.q e;
    public final l4b.d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4b.m f158380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l4b.a f158381h;
    public final l4b.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f158382j;
    public Fee k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f158383l;

    public s0(f binder, q modelApi, i0 delegates, j60.a dialogView, l4b.a breakdownDescriptionDialogMapper, l4b.c expiryOrderDialogMapper, l4b.m feeBreakdownDialogMapper, l4b.q overnightFeeDialogMapper, l4b.d0 underlyingAssetRateDialogMapper) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(modelApi, "modelApi");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(overnightFeeDialogMapper, "overnightFeeDialogMapper");
        Intrinsics.checkNotNullParameter(underlyingAssetRateDialogMapper, "underlyingAssetRateDialogMapper");
        Intrinsics.checkNotNullParameter(feeBreakdownDialogMapper, "feeBreakdownDialogMapper");
        Intrinsics.checkNotNullParameter(breakdownDescriptionDialogMapper, "breakdownDescriptionDialogMapper");
        Intrinsics.checkNotNullParameter(expiryOrderDialogMapper, "expiryOrderDialogMapper");
        this.f158377a = binder;
        this.f158378b = modelApi;
        this.f158379c = delegates;
        this.d = dialogView;
        this.e = overnightFeeDialogMapper;
        this.f = underlyingAssetRateDialogMapper;
        this.f158380g = feeBreakdownDialogMapper;
        this.f158381h = breakdownDescriptionDialogMapper;
        this.i = expiryOrderDialogMapper;
    }

    public final void a(rp0.y yVar) {
        i0 i0Var = this.f158379c;
        List listK = zhm.v.k(i0Var.f158346a, i0Var.f158347b, i0Var.f158348c);
        j60.a aVar = this.d;
        aVar.d(listK);
        aVar.x(yVar);
    }
}
