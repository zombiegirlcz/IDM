package ise;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationController;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$ModalStep;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ThreeDsVerificationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ThreeDsVerificationController threeDsVerificationController, Continuation continuation) {
        super(2, continuation);
        this.v = threeDsVerificationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InsufficientFunds insufficientFunds;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i0 i0VarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) i0VarE3;
        cli.y yVar = dVar.M;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        AddMoneyMethod topUp = obj3 instanceof AddMoneyMethod.MoveMoney ? (AddMoneyMethod) obj3 : obj3 instanceof TopupMethod ? new AddMoneyMethod.TopUp((TopupMethod) obj3) : null;
        if (topUp != null) {
            com.revolut.kompot.navigable.vc.modal.a aVar2 = dVar.N;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) ((j0) j2Var.getValue()).f168201b.getContent();
            dj0.d dVar2 = (threeDSTransaction == null || (insufficientFunds = threeDSTransaction.o) == null) ? null : insufficientFunds.f60531a;
            if (dVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            n0 n0Var = (n0) ((j0) j2Var2.getValue()).f168202c.getContent();
            h93.f0 f0Var = n0Var != null ? n0Var.f168219a : null;
            if (f0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object content = ((j0) j2Var2.getValue()).f168204h.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            oki.h.v2(aVar2, new ThreeDsVerificationScreenContract$ModalStep.SelectAddMoneyMethod(dVar2, f0Var, (AccountWrapper) content, topUp), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
