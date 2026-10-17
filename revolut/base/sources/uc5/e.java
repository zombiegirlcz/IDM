package uc5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_locked_transactions.StakingLockedTransactionsDialogController;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ofm.q;
import tof.a3;
import yhm.o;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StakingLockedTransactionsDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StakingLockedTransactionsDialogController stakingLockedTransactionsDialogController, Continuation continuation) {
        super(2, continuation);
        this.v = stakingLockedTransactionsDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.U.getValue();
        Object obj3 = model.u;
        g gVar = (g) cVar;
        gVar.getClass();
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            l.j2(gVar, gVar.e1(new rhf.f(q.P(a3Var), rhf.d.CRYPTO, h0.f322473a)), ModalDestination.Style.POPUP.f98311a, null, 2);
        }
        return Unit.f186387a;
    }
}
