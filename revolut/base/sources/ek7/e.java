package ek7;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import ej6.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CFACInsuranceReviewClaimScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cFACInsuranceReviewClaimScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarH3 = this.v.T2();
        String listId = model.f52519a;
        p pVar = (p) lVarH3;
        j60.a aVar2 = pVar.f126975s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != -1835663446) {
            if (iHashCode != -379317575) {
                if (iHashCode == 1688055429 && listId.equals("ID_PRIVACY_POLICY_ITEM")) {
                    pVar.x2(new x(23));
                }
            } else if (listId.equals("ID_CONFIRMATION_ITEM")) {
                pVar.x2(new x(21));
            }
        } else if (listId.equals("ID_NON_REFUNDABLE_ITEM")) {
            pVar.x2(new x(22));
        }
        if (aVar2.j()) {
            r rVar = pVar.f126976t;
            i iVar = (i) pVar.t2();
            rVar.getClass();
            aVar2.A(r.a(iVar));
        }
        return Unit.f186387a;
    }
}
