package ru6;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.youTransactor.uCube.rpc.Constants;
import ip0.nb0;
import ip0.pb0;
import ip0.sx;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mif.e0;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.f0;
import zhm.h0;
import zw7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257456a;

    public /* synthetic */ r(int i) {
        this.f257456a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f257456a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return iii.c.c(3);
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                sx sxVar = new sx("price-target-chart-loading-listId");
                yp0.b.l(sxVar, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(sxVar);
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return f0.f322471a;
            case 3:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                sx sxVar2 = new sx("analysts-ratings-chart-loading-listId");
                yp0.b.l(sxVar2, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(sxVar2);
            case 4:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return f0.f322471a;
            case 5:
                vf0.y yVar = (vf0.y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                rr6.j jVar = (rr6.j) yVar.f288491a;
                rr6.n nVar = (rr6.n) yVar.f288492b;
                List list = (List) yVar.f288493c;
                od0.i iVar = (od0.i) yVar.d;
                whf.p pVar = (whf.p) yVar.e;
                whf.p pVar2 = (whf.p) yVar.f;
                rr6.o oVar = (rr6.o) iVar.g();
                return new rv6.p(jVar, nVar, list, oVar != null ? oVar.getValue() : null, pVar, pVar2);
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 7:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return rv7.k.a((List) getDefaultLoadingItems2.invoke(), true);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                IntRange intRangeO = kotlin.ranges.f.o(0, 10);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it13 = intRangeO.iterator();
                while (it13.f289625c) {
                    arrayList.add(new pb0(a0.d.n("LOADING_STATE_ITEM_LIST_ID_PREFIX_", it13.nextInt())));
                }
                return yp0.b.g(arrayList, rva.h.a(null), null, R$attr.uikit_dp0, R$attr.uikit_dp16, 114);
            case 9:
                LargeActionButtonDelegate.Model it14 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj3 = it14.i;
                if (obj3 instanceof PurchasedTransitTicket.ToBeActivated) {
                    return (PurchasedTransitTicket.ToBeActivated) obj3;
                }
                return null;
            case 10:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                yl ylVar = new yl("analyst-ratings-header-list-id", 0, 30);
                yp0.b.l(ylVar, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(ylVar);
            case 11:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                yl ylVar2 = new yl("index-sentiment-header-list-id", 0, 30);
                yp0.b.l(ylVar2, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(ylVar2);
            case 12:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                yl ylVar3 = new yl("technical-insights-header-list-id", 0, 30);
                yp0.b.l(ylVar3, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(ylVar3);
            case 13:
                LargeActionButtonDelegate.Model it18 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f52613a, "SECURITY_DEPOSIT_GO_TO_CREDIT"));
            case 14:
                zm3.j account = (zm3.j) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new PeerToPeerTransferBridgeFeatureConfig(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(account), hrf.f.OUTGOING, TransferFlowType.Default.f92257b, new TransferMoneyPocket(null, null, 3), new TransferScheduleData(0L, (jli.c) null, 7), m1l.a.SCHEDULE_ENABLED, false, null, null, null, new FlowExtras(new FinishCommand(null, null, null, 7)), null, null, null, null, 128960))));
            case 15:
                m1c.z it19 = (m1c.z) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                m1c.y yVar2 = it19 instanceof m1c.y ? (m1c.y) it19 : null;
                if (yVar2 != null) {
                    return yVar2.f201475a;
                }
                return null;
            case 16:
                yhm.r it20 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                VoucherProductGroupDetails voucherProductGroupDetails = (VoucherProductGroupDetails) it20.f314202b;
                m1c.x xVar = (m1c.x) it20.f314201a;
                tvb.b bVar = tvb.c.Companion;
                Address address = ((do3.n) it20.f314203c).k;
                wi0.b bVarG = address != null ? nz8.d.g(address) : null;
                bVar.getClass();
                return new kwb.b(voucherProductGroupDetails, xVar, null, tvb.b.a(bVarG));
            case 17:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 2, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it21 = intRangeU.iterator();
                while (it21.f289625c) {
                    arrayList2.add(nb0.b(pb0.Companion, a0.d.n("SECTION_LOADING_PREFIX", it21.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 18:
                rx5.a it22 = (rx5.a) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f258025a;
            case 19:
                Function0 it23 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                IntRange intRangeO2 = kotlin.ranges.f.o(0, 10);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRangeO2, 10));
                vim.f it24 = intRangeO2.iterator();
                while (it24.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("RateSmallCardLoading_", it24.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return arrayList3;
            case 20:
                List it25 = (List) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                List list2 = it25;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (e0.r((FreelancerInvoice) obj4)) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list2) {
                    if (((FreelancerInvoice) obj5).f73378h != sr6.n.DRAFT) {
                        arrayList5.add(obj5);
                    }
                }
                return new rx6.n(arrayList4, arrayList5);
            case 21:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters, f0.f322471a, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 22:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters2, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters2, null, null, f0.f322471a, null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 23:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters3, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters3, null, null, null, null, null, null, null, 239);
            case 24:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters4 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters4, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters4, null, null, null, null, null, null, null, 159);
            case 25:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters5 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters5, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters5, null, null, null, null, null, null, h0.f322473a, CertificateBody.profileType);
            case 26:
                rx6.m update = (rx6.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                rx6.l lVar = rx6.m.Companion;
                com.revolut.feature.freelancer.api.navigation.c cVar = update.f258044a;
                lVar.getClass();
                return rx6.m.a(update, rx6.l.a(cVar), false, null, null, false, 49);
            case 27:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 28:
                vf0.y yVar3 = (vf0.y) obj2;
                Intrinsics.checkNotNullParameter(yVar3, "<destruct>");
                c0 c0Var = (c0) yVar3.f288491a;
                zw7.h hVar = (zw7.h) yVar3.f288492b;
                return new sx7.b(c0Var, hVar, ce9.m.B((List) yVar3.f288493c, hVar, (PetBreedDetailsContract$BreedParam) yVar3.d), (AmountData) yVar3.e, ((Boolean) yVar3.f).booleanValue());
            default:
                al0.a networkState = (al0.a) obj2;
                Intrinsics.checkNotNullParameter(networkState, "networkState");
                return Boolean.valueOf(networkState == al0.a.ONLINE);
        }
    }

    public /* synthetic */ r(Object obj2, int i) {
        this.f257456a = i;
    }
}
