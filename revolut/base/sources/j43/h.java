package j43;

import aii.q;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import h93.f0;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;
import rp0.k1;
import s6e.z;
import yhm.o;
import zh9.u0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a f171285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f171286x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar, f0 f0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171285w = aVar;
        this.f171286x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f171285w, this.f171286x, continuation, 0);
            case 1:
                return new h(this.f171285w, this.f171286x, continuation, 1);
            default:
                return new h(this.f171285w, this.f171286x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar2 = this.f171285w;
                    l93.f fVar = aVar2.f65277p;
                    x xVar = (x) fVar;
                    pfm.a aVarE = new pfm.h(xVar.K(this.f171286x.f150110a, i93.d.POCKETS, u.c(aVar2.o.f65273a.f65523a.f163145a)), 4).e(ue0.e.r(((z) aVar2.f65279r).y(SubaccountType.Personal.f88963a), h0.f322473a));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar4 = this.f171285w;
                    h hVar = new h(aVar4, this.f171286x, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar4, hVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar5 = this.f171285w;
                g1 g1Var = aVar5.f65280s;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                Continuation continuation = null;
                if (i3 == 0) {
                    o.b(obj2);
                    h hVar2 = new h(aVar5, this.f171286x, continuation, 1);
                    this.v = 1;
                    if (u0.b0(aVar5.X(), "GO_TO_BUTTON_TAG", hVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        aVar5.C2(q.f5292a);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                aVar5.f65278q.getClass();
                ((k1) g1Var).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "DIALOG_ID_SHOT_SUCCESS", new TextLocalisedClause(R$string.card_link_card_cards_list_clipboard_success, null, null, 14), null, null, null, 60));
                ihm.f fVar2 = ((k1) g1Var).d;
                this.v = 2;
                if (nim.a.c(fVar2, this) == aVar6) {
                    return aVar6;
                }
                aVar5.C2(q.f5292a);
                return Unit.f186387a;
        }
    }
}
