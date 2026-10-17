package qsa;

import cli.y;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends oki.h implements k {
    public final aqf.b A;
    public final bsf.i B;
    public final y C;
    public final PushToCardTransferReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p56.a f248788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vsa.a f248789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tsa.a f248790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zof.f f248791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final usa.d f248792t;
    public final usa.h u;
    public final i5k.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f248793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yof.a f248794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tga.k f248795y;
    public final vrf.h z;

    public u(PushToCardTransferReviewScreenContract$InputData inputData, p56.a interactor, vsa.a transferDataObserver, tsa.a extrasMapper, zof.f transferFeatureScreensProvider, usa.d transferExtension, usa.h transferResultExtension, i5k.a appFraudCheckExtension, j60.a bottomDialogExtension, yof.a recipientTrustMapper, tga.k pricingPlanUpgradeEntryPointItemProvider, vrf.h sectionFactory, aqf.b transferExecutionLoadingController, bsf.i transferReasonLauncherExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(extrasMapper, "extrasMapper");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(pricingPlanUpgradeEntryPointItemProvider, "pricingPlanUpgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        Intrinsics.checkNotNullParameter(transferExecutionLoadingController, "transferExecutionLoadingController");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f248788p = interactor;
        this.f248789q = transferDataObserver;
        this.f248790r = extrasMapper;
        this.f248791s = transferFeatureScreensProvider;
        this.f248792t = transferExtension;
        this.u = transferResultExtension;
        this.v = appFraudCheckExtension;
        this.f248793w = bottomDialogExtension;
        this.f248794x = recipientTrustMapper;
        this.f248795y = pricingPlanUpgradeEntryPointItemProvider;
        this.z = sectionFactory;
        this.A = transferExecutionLoadingController;
        this.B = transferReasonLauncherExtension;
        this.C = mra.d.b(this, new i(inputData.f81620a, inputData.f81621b, null, null, f0.f322471a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, mo3.a.g(vkm.q.Q(this.C.B(new qpb.i(29)), new s(0, continuation, this)), null, new qjj.g(29), 1), null, null, new t(0, continuation, this), 3);
    }

    public final j I2() {
        j jVar = ((i) ((j2) this.C.f22677a).getValue()).f248771c;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void T1(long j2) {
        p pVar = new p(0);
        y yVar = this.C;
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(new t0(vkm.q.q(yVar.B(pVar)), 1), new gs.n(continuation, this, 4)), null, new t(1, continuation, this), 3);
        yji.l.b1(this, vkm.q.Q(yVar.B(new p(1)), new s(1, continuation, this)), null, new t(2, continuation, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
