package yra;

import aw0.f4;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends jki.g implements p {
    public final ldd.b A;
    public final bsa.b B;
    public final j C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PushToCardTransferAmountScreenContract$InputData f316199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bsa.i f316200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f316201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vsa.a f316202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xpa.a f316203t;
    public final asa.f u;
    public final n5k.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s5k.a f316204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n60.a f316205x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j60.a f316206y;
    public final w80.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(PushToCardTransferAmountScreenContract$InputData inputData, bsa.i interactor, a router, vsa.a transferDataObserver, xpa.a checksExtension, asa.f extraDataExtension, n5k.b paymentFeesDialogExtension, s5k.a transferWalletLimitsExtension, n60.a keyboardExtension, j60.a bottomDialogExtension, w80.b amountFormatter, ldd.b focusRequesterDelegate, bsa.b balancesFilterInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(checksExtension, "checksExtension");
        Intrinsics.checkNotNullParameter(extraDataExtension, "extraDataExtension");
        Intrinsics.checkNotNullParameter(paymentFeesDialogExtension, "paymentFeesDialogExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f316199p = inputData;
        this.f316200q = interactor;
        this.f316201r = router;
        this.f316202s = transferDataObserver;
        this.f316203t = checksExtension;
        this.u = extraDataExtension;
        this.v = paymentFeesDialogExtension;
        this.f316204w = transferWalletLimitsExtension;
        this.f316205x = keyboardExtension;
        this.f316206y = bottomDialogExtension;
        this.z = amountFormatter;
        this.A = focusRequesterDelegate;
        this.B = balancesFilterInteractor;
        CardOwner f81599a = inputData.getF81599a();
        f0 f0Var = f0.f322471a;
        k kVar = new k(null, f0Var, new hrf.h(f0Var, f0Var, null), null);
        ReferenceData.INSTANCE.getClass();
        this.C = new j(f81599a, null, kVar, 0, new o(ReferenceData.f92119c, null));
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.A;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        l2(new wh3.h(this, (Continuation) null, 27), new yi5.b(26));
    }

    @Override // yji.l
    public final void P1() {
        x2(new s(this, 1));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, vkm.q.Q(vkm.q.q(new y5j.e(q2(), 20)), new x4k.c(null, this)), null, new yk6.m(this, (Continuation) null, 11), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.C;
    }

    public final PushToCardTransferData y2() {
        PushToCardTransferData pushToCardTransferData = ((j) t2()).f316176b;
        if (pushToCardTransferData != null) {
            return pushToCardTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
