package com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal;

import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import ebg.o;
import eh3.s;
import eq4.f;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.z;
import q06.l;
import vkm.j2;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends h implements eq4.b {
    public final vt4.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f69155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lt4.d f69156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f69157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CreditCardWithdrawalFlowContract$InputData f69158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f69159t;
    public final wie.a u;
    public final qki.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f69160w;

    public d(vt4.b creditCardDialogMapper, z creditCardCancellationInteractor, lt4.d creditCardDialogModelMapper, l deeplinkRouter, CreditCardWithdrawalFlowContract$InputData inputData, wj0.a idempotencyKeyHolder, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardCancellationInteractor, "creditCardCancellationInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogModelMapper, "creditCardDialogModelMapper");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.o = creditCardDialogMapper;
        this.f69155p = creditCardCancellationInteractor;
        this.f69156q = creditCardDialogModelMapper;
        this.f69157r = deeplinkRouter;
        this.f69158s = inputData;
        this.f69159t = idempotencyKeyHolder;
        this.u = creditAccountDestinationResolver;
        this.v = e.b(this, CreditCardWithdrawalFlowContract$State.Loading.f69151a);
        this.f69160w = d8l.d.a(this, new s(this, 17));
    }

    public final CreditCardWithdrawalFlowContract$State.Content I2() {
        Object value = ((j2) this.v.f22677a).getValue();
        Intrinsics.i(value, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract.State.Content");
        return (CreditCardWithdrawalFlowContract$State.Content) value;
    }

    public final void J2(CreditCardModelAction creditCardModelAction) {
        if (creditCardModelAction instanceof CreditCardModelAction.Deeplink) {
            n2(new f(this, (CreditCardModelAction.Deeplink) creditCardModelAction, null), new whi.b(6));
            return;
        }
        boolean z = creditCardModelAction instanceof CreditCardModelAction.Contextual;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        i iVar = this.f69160w;
        if (!z) {
            if (creditCardModelAction instanceof CreditCardModelAction.Dialogue) {
                h.w2(iVar, new CreditCardWithdrawalFlowContract$Step.Dialog(((CreditCardModelAction.Dialogue) creditCardModelAction).f68850a), bottom_dialog);
                return;
            }
            if (creditCardModelAction != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (iVar.c()) {
                iVar.e(false);
                return;
            } else {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                iVar.n();
                return;
            }
        }
        tl4.b bVar = ((CreditCardModelAction.Contextual) creditCardModelAction).f68847a;
        int i = eq4.d.f128241a[bVar.ordinal()];
        if (i == 1) {
            h.w2(iVar, new CreditCardWithdrawalFlowContract$Step.Dialog(I2().f69150a.f68703b.f68705b), bottom_dialog);
            return;
        }
        if (i == 2) {
            l2(new b(this, null), new yi5.b(26));
            return;
        }
        if (i == 3 || i == 4) {
            h.D2(iVar);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported ContextualValue: " + bVar);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // yki.j
    public final void M0() {
        this.f69159t.a("CREDIT_CARD_DEACTIVATION_IDEMPOTENCY_TAG");
        n2(new o(this, null, 23), new eif.c(1, this, d.class, "handleErrorEndQuit", "handleErrorEndQuit(Ljava/lang/Throwable;)Z", 0, 11));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69160w;
    }
}
