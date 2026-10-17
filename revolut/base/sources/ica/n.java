package ica;

import cli.y;
import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreenContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends oki.h implements i {
    public final PixRefundReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f160230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f8a.a f160231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zof.f f160232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f160233s;

    public n(PixRefundReviewScreenContract$InputData inputData, wj0.a idempotencyKeyHolder, f8a.a pixAreaInteractor, zof.f transferFeatureScreensProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(pixAreaInteractor, "pixAreaInteractor");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f160230p = idempotencyKeyHolder;
        this.f160231q = pixAreaInteractor;
        this.f160232r = transferFeatureScreensProvider;
        dj0.d dVar = inputData.f80739a;
        String str = inputData.f;
        String str2 = inputData.f80741c;
        this.f160233s = mra.d.b(this, new g(dVar, inputData.d, str, inputData.f80740b, str2, inputData.e), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f160230p.a("revert_transfer");
    }

    public final void I2() {
        C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(this.o.f80740b), null, null, null, 126))));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f160233s;
    }
}
