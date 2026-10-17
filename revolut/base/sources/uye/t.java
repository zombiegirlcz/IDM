package uye;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f284321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f284322x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, dj0.d dVar, int i, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f284321w = dVar;
        this.f284322x = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f284321w, this.f284322x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        dj0.d dVar = this.f284321w;
        com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (((jte.d) iVar.f90947q).c(TopupApi$Toggles.TopUpCurrencyChooserImprovements.f90472c)) {
                pfm.r rVarN0 = iVar.E.n0(dVar.f115083b, e1f.c.a(iVar.o.f284275a));
                this.u = 1;
                if (nim.a.a(rVarN0, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        iVar.f90948r.f276169a = true;
        TopUpTarget topUpTarget = iVar.o.f284275a;
        if (!(topUpTarget instanceof TopUpTarget.Main) && !(topUpTarget instanceof TopUpTarget.Pro) && !(topUpTarget instanceof TopUpTarget.Savings) && !(topUpTarget instanceof TopUpTarget.Joint) && !(topUpTarget instanceof TopUpTarget.RevXFiat)) {
            if (topUpTarget instanceof TopUpTarget.Invest) {
                return yji.l.a1(iVar, iVar.X1(new y0(null, new nii.g0(new TextLocalisedClause(R$string.top_up_pending_title, null, null, 14), new TextLocalisedClause(R$string.topup_transaction_pending_generic_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, null, new up2.q(iVar, dVar, null, 15), 3);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (iVar.O2()) {
            oki.h.D2(iVar.i0);
        } else {
            iVar.l2(new cuc.c0(iVar, dVar, this.f284322x, (Continuation) null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
