package jk7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CFACInsuranceSupportingDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cFACInsuranceSupportingDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            default:
                return new e(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j60.a.v(((k) cFACInsuranceSupportingDocumentsScreen.T2()).f175119q, false, null, 3);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cFACInsuranceSupportingDocumentsScreen.m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                knm.b.j(cFACInsuranceSupportingDocumentsScreen, ik7.f.a());
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) cFACInsuranceSupportingDocumentsScreen.T2();
                if (((g) kVar.t2()).f175114b.isEmpty()) {
                    j60.a aVar5 = kVar.f175119q;
                    kVar.f175120r.getClass();
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CONTINUE_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.cfac_claim_supporting_documents_no_documents_action_continue, null, null, 14), false, null, null, null, null, 1000);
                    yp0.b.r(model, 0, 0, 0, 0, 15);
                    LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_UPLOAD_DOCUMENTS_BUTTON", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.cfac_claim_supporting_documents_no_documents_action_cancel, null, null, 14), false, null, null, null, null, 1000);
                    yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
                    aVar5.x(new y(v.k(model, model2), new t(new TextLocalisedClause(R$string.cfac_claim_supporting_documents_no_documents_title, null, null, 14), new TextLocalisedClause(R$string.cfac_claim_supporting_documents_no_documents_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                } else {
                    kVar.v2(new h(((g) kVar.t2()).f175114b));
                }
                break;
        }
        return Unit.f186387a;
    }
}
