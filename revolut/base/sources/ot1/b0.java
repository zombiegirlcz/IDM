package ot1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends jki.g implements jki.h {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BizumTransferReviewContract$InputData f229387p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x02.d f229388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f229389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rt1.a f229390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qt1.a f229391t;
    public final qt1.n u;
    public final i5k.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f229392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yof.a f229393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f229394y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(BizumTransferReviewContract$InputData inputData, x02.d router, o interactor, rt1.a transferDataObserver, qt1.a transferExtension, qt1.n transferResultExtension, i5k.a appFraudCheckExtension, j60.a bottomDialogExtension, yof.a recipientTrustMapper, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f229387p = inputData;
        this.f229388q = router;
        this.f229389r = interactor;
        this.f229390s = transferDataObserver;
        this.f229391t = transferExtension;
        this.u = transferResultExtension;
        this.v = appFraudCheckExtension;
        this.f229392w = bottomDialogExtension;
        this.f229393x = recipientTrustMapper;
        this.f229394y = new b(inputData.f61626a, inputData.f61628c, inputData.f61627b, null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(vkm.q.q(new olf.e(q2(), 7)), new r0(2, continuation, this)), null, new oli.f(this, continuation, 20), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f229394y;
    }

    public final c y2() {
        c cVar = ((b) t2()).d;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
