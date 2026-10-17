package o17;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.FreelancerOrderTransaction;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import et6.a3;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerSaleDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FreelancerSaleDetailsScreen freelancerSaleDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerSaleDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerAccountDetails freelancerAccountDetails;
        FreelancerPermissions freelancerPermissions;
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = item.f58316a;
        Object obj3 = item.f58324n;
        com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        q17.d dVar = obj3 instanceof q17.d ? (q17.d) obj3 : null;
        if (dVar instanceof q17.b) {
            switch (listId.hashCode()) {
                case -1717162242:
                    if (listId.equals("LIST_ID_ACTION_REFUND")) {
                        FreelancerOrder freelancerOrder = ((q17.b) dVar).f241394a;
                        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.A;
                        a3 a3Var = aVar2.f74126t;
                        j jVar = (j) ((k) ((j2) aVar2.z.f22677a).getValue()).f221325b.getContent();
                        if (jVar == null || (freelancerAccountDetails = jVar.f221321a) == null || (freelancerPermissions = freelancerAccountDetails.f73270b) == null || !freelancerPermissions.f73322b) {
                            oki.h.v2(aVar3, new FreelancerSaleDetailsScreenContract$ModalStep.AccountRestriction(lr6.d.OUTBOUND_BLOCKED), ModalDestination.Style.POPUP.f98311a);
                        } else {
                            p.Companion.getClass();
                            Set set = h.f221317b;
                            a3Var.getClass();
                            FreelancerOrderTransaction freelancerOrderTransaction = (FreelancerOrderTransaction) d0.d0(a3.b(freelancerOrder));
                            if (!d0.T(set, freelancerOrderTransaction != null ? freelancerOrderTransaction.e : null)) {
                                aVar2.C1(new FreelancerBizFeatureConfig.SaleRefund(freelancerOrder, a3Var.a(freelancerOrder)));
                            } else {
                                oki.h.v2(aVar3, new FreelancerSaleDetailsScreenContract$ModalStep.ManualRefund(freelancerOrder), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                        }
                    }
                    break;
                case -1247278171:
                    listId.equals("LIST_ID_ACTION_DUPLICATE");
                    break;
                case -367185664:
                    if (listId.equals("LIST_ID_ACTION_SHARE_LINK")) {
                        aVar2.n2(new u(aVar2, (q17.b) dVar, null, 1), new whi.b(6));
                    }
                    break;
                case 433608310:
                    if (listId.equals("LIST_ID_ACTION_CREATE_NEW_LINK")) {
                        aVar2.C1(new FreelancerBizFeatureConfig.NewSale(cs6.c.PAYMENT_LINK, null));
                    }
                    break;
                case 1971262261:
                    if (listId.equals("LIST_ID_ACTION_VIEW_QR")) {
                        FreelancerOrder freelancerOrder2 = ((q17.b) dVar).f241394a;
                        dj0.d dVar2 = freelancerOrder2.f73294j;
                        String str = freelancerOrder2.i;
                        aVar2.C1(new FreelancerBizFeatureConfig.QrShare(dVar2, str != null ? str : ""));
                    }
                    break;
                case 2144894464:
                    if (listId.equals("LIST_ID_ACTION_CANCEL")) {
                        aVar2.n2(new u(aVar2, (q17.b) dVar, null, 0), new whi.b(6));
                    }
                    break;
            }
        } else if (dVar instanceof q17.c) {
            if (Intrinsics.f(listId, "LIST_ID_ACTION_RECEIPT_SHARE")) {
                String str2 = ((q17.c) dVar).f241395a;
                tqi.g gVar = aVar2.v;
                m70.a.c(t0.f186434a);
                aVar2.C1(u0.b(gVar.f(8378, "", str2)));
            }
        } else if (dVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
