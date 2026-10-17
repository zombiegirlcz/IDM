package t8e;

import c12.t0;
import c12.u0;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.qvik.impl.ui.pay.QvikPayFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$ModalStep;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$SheetPagerItem;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.image_gallery.flow.ImageGalleryFlowContract$Step;
import com.revolut.feature.pix.api.model.PixKeys;
import com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$InputData;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoContract$Step;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$ModalStep;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$SubaccountInfo;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewControllerContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OpenPortingStatusParcel;
import com.revolut.retail.feature.features.api.exception.JuniorAccountFeatureDisabledException;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dej.s0;
import dej.t1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nq.i0;
import s56.d0;
import skm.p0;
import t8j.h;
import tcg.q;
import tch.f0;
import tdc.r;
import te0.w;
import th6.y;
import tjf.a0;
import tjf.e0;
import tjf.l0;
import tjf.q0;
import tjf.s;
import tjf.v;
import tjf.z;
import tof.fc;
import tof.i7;
import tof.va;
import vkm.j2;
import xu3.g0;
import y9a.i;
import y9a.j;
import y9a.k;
import y9a.m;
import yki.l;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f268883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f268884c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f268882a = i;
        this.f268883b = obj2;
        this.f268884c = obj3;
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        Object value;
        EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress;
        int i = this.f268882a;
        int i2 = 18;
        int i3 = 29;
        int i5 = 2;
        boolean z = false;
        z = false;
        int i6 = 1;
        Continuation continuation = null;
        Object obj3 = this.f268884c;
        Object obj4 = this.f268883b;
        switch (i) {
            case 0:
                com.revolut.feature.subaccount.impl.ui.qr_link.a aVar = (com.revolut.feature.subaccount.impl.ui.qr_link.a) obj4;
                em2.g result = (em2.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                SubaccountQRLinkScreenContract$ModalStep.ChangeWallpaper changeWallpaper = (SubaccountQRLinkScreenContract$ModalStep.ChangeWallpaper) ((SubaccountQRLinkScreenContract$ModalStep) obj3);
                aVar.l2(new d0(aVar, changeWallpaper.f89109b, changeWallpaper.f89108a, changeWallpaper.f89110c, result.f127587a, (Continuation) null), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                String subaccountName = (String) obj3;
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                SubaccountQRLinkScreenContract$SubaccountInfo subaccountQRLinkScreenContract$SubaccountInfo = ((a) ((j2) ((com.revolut.feature.subaccount.impl.ui.qr_link.a) obj4).f89118t.f22677a).getValue()).f268879a;
                SubaccountType subaccountType = subaccountQRLinkScreenContract$SubaccountInfo.f89111a;
                xi0.b subaccountCurrency = subaccountQRLinkScreenContract$SubaccountInfo.f89112b;
                String subaccountId = subaccountQRLinkScreenContract$SubaccountInfo.d;
                Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
                Intrinsics.checkNotNullParameter(subaccountCurrency, "subaccountCurrency");
                Intrinsics.checkNotNullParameter(subaccountName, "subaccountName");
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                return a.a(update, new SubaccountQRLinkScreenContract$SubaccountInfo(subaccountType, subaccountName, subaccountId, subaccountCurrency), null, 6);
            case 2:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((h) obj4).getClass();
                return h.c((Integer) obj3);
            case 3:
                com.revolut.feature.pix.impl.flow.automatico.a aVar2 = (com.revolut.feature.pix.impl.flow.automatico.a) obj4;
                l lVar = (l) obj3;
                m result2 = (m) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof j) {
                    oki.h.t2(aVar2, lVar, PixAutomaticoContract$Step.PastAuthorisations.f80606a, true, null, false, 12);
                } else if (result2 instanceof y9a.l) {
                    aVar2.C1(new PixAuthorisationNavigation$Destination(new PixAuthorisationNavigation$InputData.Request(((y9a.l) result2).f311820a, null)));
                } else if (result2 instanceof k) {
                    oki.h.w2(lVar, new PixAutomaticoContract$Step.PaymentDetails(((k) result2).f311819a), ModalDestination.Style.POPUP.f98311a);
                } else {
                    if (!(result2 instanceof i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar2, lVar, PixAutomaticoContract$Step.OpenQrScanner.f80605a, true, null, false, 12);
                }
                return Unit.f186387a;
            case 4:
                PixKeys keys = (PixKeys) obj4;
                taa.e eVar = (taa.e) obj2;
                if (((taa.k) obj3).o.f80665a && keys.f80417b.size() < 5) {
                    z = true;
                }
                eVar.getClass();
                Intrinsics.checkNotNullParameter(keys, "keys");
                return new taa.e(keys, z);
            case 5:
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) obj4;
                SummaryScreenContract$ModalStep.RevolutAccountDetails revolutAccountDetails = (SummaryScreenContract$ModalStep.RevolutAccountDetails) obj3;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.f) {
                    g0 g0Var = revolutAccountDetails.f67738a.f308906c;
                    if (g0Var == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    oki.h.v2(hVar.f67751s, new SummaryScreenContract$ModalStep.RevokeRevolutAccount(g0Var), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    if (!(outputData instanceof dii.e) && !(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i21 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) obj4;
                SummaryScreenContract$ModalStep.TransactionManagement transactionManagement = (SummaryScreenContract$ModalStep.TransactionManagement) obj3;
                eii.k outputData2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof eii.i) {
                    Object obj5 = ((eii.i) outputData2).f126655a;
                    if (Intrinsics.f(obj5, "transaction-management-view-details-action")) {
                        hVar2.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.g(transactionManagement.f67741b), null, null, null, 126))));
                    } else if (Intrinsics.f(obj5, "transaction-management-remove-action")) {
                        hVar2.n2(new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.g(hVar2, transactionManagement, null), new whi.b(6));
                    }
                } else {
                    if (!(outputData2 instanceof eii.d) && !(outputData2 instanceof eii.e) && !(outputData2 instanceof eii.f) && !(outputData2 instanceof eii.g) && !(outputData2 instanceof eii.h) && !(outputData2 instanceof eii.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 7:
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h hVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h) obj4;
                SummaryScreenContract$ModalStep.RemoveDocumentConfirmation removeDocumentConfirmation = (SummaryScreenContract$ModalStep.RemoveDocumentConfirmation) obj3;
                dii.g outputData3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof dii.f) {
                    hVar3.n2(new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.c(hVar3, removeDocumentConfirmation, null), new whi.b(6));
                } else {
                    if (!(outputData3 instanceof dii.e) && !(outputData3 instanceof dii.b) && !(outputData3 instanceof dii.c) && !(outputData3 instanceof dii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i32 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 8:
                tb9.g gVar = (tb9.g) obj4;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                gVar.f269511p.c(((i0) obj3).f());
                gVar.f269513r.getClass();
                yji.l.a1(gVar, gVar.X1(ds.a.d()), null, null, new tb9.f(gVar, continuation, z ? 1 : 0), 3);
                return Boolean.TRUE;
            case 9:
                QvikPayFlowContract$Step.Transfer transfer = (QvikPayFlowContract$Step.Transfer) obj4;
                com.revolut.feature.apm.qvik.impl.ui.pay.a aVar3 = (com.revolut.feature.apm.qvik.impl.ui.pay.a) obj3;
                u0 result3 = (u0) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if ((result3 instanceof t0) && (str = transfer.f62820b) != null) {
                    aVar3.l2(new tc2.h(aVar3, str, null), new yi5.b(26));
                }
                oki.h.D2(aVar3.f62825t);
                return Unit.f186387a;
            case 10:
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar4 = (com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a) obj4;
                RecurringDepositDetailsViewControllerContract$ModalStep recurringDepositDetailsViewControllerContract$ModalStep = (RecurringDepositDetailsViewControllerContract$ModalStep) obj3;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.f) {
                    aVar4.l2(new sma.f(aVar4, ((RecurringDepositDetailsViewControllerContract$ModalStep.DeactivationDialog) recurringDepositDetailsViewControllerContract$ModalStep).f95638a, k4l.d0.INACTIVE, (Continuation) null, 16), new f0(aVar4, i5));
                }
                return Unit.f186387a;
            case 11:
                com.revolut.feature.image_gallery.flow.a aVar5 = (com.revolut.feature.image_gallery.flow.a) obj4;
                l lVar2 = (l) obj3;
                vd7.e output2 = (vd7.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof vd7.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar5, lVar2, new ImageGalleryFlowContract$Step.Pager(((vd7.d) output2).f287811a), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                return Unit.f186387a;
            case 12:
                PaymentMethod paymentMethod = (PaymentMethod) obj3;
                tdc.m update2 = (tdc.m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                ((r) obj4).f269964m.getClass();
                return tdc.m.a(update2, paymentMethod != null ? new tdc.c(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.b(paymentMethod), com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.d(paymentMethod)) : tdc.a.f269948a, null, false, null, null, 30);
            case 13:
                tdc.m update3 = (tdc.m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return tdc.m.a(update3, null, null, false, ((q6c.h) obj4).f242537a, (String) obj3, 7);
            case 14:
                kbb.c cVar = (kbb.c) obj4;
                w4l.k loadingStrategy = (w4l.k) obj3;
                Boolean juniorFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (!juniorFeatureEnabled.booleanValue()) {
                    return w.h(new Data(null, new JuniorAccountFeatureDisabledException(0), false, 5, null));
                }
                ff8.i iVar = (ff8.i) ((ff8.e) cVar.f182549b);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(nim.a.v(iVar.e.b(Unit.f186387a, loadingStrategy), new fe9.f(11)), kotlin.coroutines.g.f186406a);
            case 15:
                te8.d0 d0Var = (te8.d0) obj4;
                Set set = (Set) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fo3.c cVar2 = (fo3.c) pair.f186385a;
                List list = (List) pair.f186386b;
                xi0.b bVar = cVar2.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    io3.d dVar = (io3.d) obj6;
                    if (dVar.f == io3.k.ACTIVE && set.contains(dVar.e)) {
                        arrayList.add(obj6);
                    }
                }
                efm.r map = osg.b.m(d0Var.f270061a, arrayList, bVar).map(new q(i2, new ou5.a(22, bVar)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 16:
                tf9.f fVar = (tf9.f) obj4;
                BillFormField billFormField = (BillFormField) obj3;
                jg9.f fVar2 = (jg9.f) obj2;
                if (fVar2 instanceof jg9.e) {
                    Biller biller = ((jg9.e) fVar2).f173941a;
                    fVar.q3(billFormField.f61274a, biller.f61145a);
                    String str2 = billFormField.f61274a;
                    j2 j2Var = fVar.f270277q;
                    do {
                        value = j2Var.getValue();
                    } while (!j2Var.h(value, tf9.g.a((tf9.g) value, biller, null, null, null, 30)));
                    int i33 = 27;
                    fVar.T2(new sx2.r(fVar, str2, continuation, i33), new yi5.b(i33));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown search form output: ", fVar2 != null ? fVar2.a() : null));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                }
                return Unit.f186387a;
            case 17:
                tgf.f fVar3 = (tgf.f) obj3;
                tgf.h update4 = (tgf.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                List list2 = ((tgf.h) ((j2) ((tgf.l) obj4).o.f22677a).getValue()).f271175a;
                TransactionsListFilterType.SelectableFilterSection section = fVar3.f271172b;
                TransactionsListFilterType.TransactionFilterItem filterItem = fVar3.f271171a;
                Intrinsics.checkNotNullParameter(list2, "<this>");
                Intrinsics.checkNotNullParameter(section, "section");
                Intrinsics.checkNotNullParameter(filterItem, "filterItem");
                List<TransactionsListFilterType.TransactionFilterItem> list3 = section.f92016a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                for (TransactionsListFilterType.TransactionFilterItem transactionFilterItemA : list3) {
                    boolean zF = Intrinsics.f(transactionFilterItemA, filterItem);
                    int i43 = ngf.a.f215144a[section.f92018c.ordinal()];
                    if (i43 != 1) {
                        if (i43 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        transactionFilterItemA = TransactionsListFilterType.TransactionFilterItem.a(transactionFilterItemA, zF);
                    } else if (zF) {
                        transactionFilterItemA = TransactionsListFilterType.TransactionFilterItem.a(transactionFilterItemA, !transactionFilterItemA.f92019a);
                    }
                    arrayList2.add(transactionFilterItemA);
                }
                TransactionsListFilterType.SelectableFilterSection selectableFilterSectionA = TransactionsListFilterType.SelectableFilterSection.a(section, arrayList2);
                int iIndexOf = list2.indexOf(section);
                ArrayList arrayListF1 = zhm.d0.f1(list2);
                arrayListF1.set(iIndexOf, selectableFilterSectionA);
                List filters = zhm.d0.d1(arrayListF1);
                update4.getClass();
                Intrinsics.checkNotNullParameter(filters, "filters");
                return new tgf.h(filters);
            case 18:
                ne0.j jVar = (ne0.j) obj3;
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                y yVar = (y) ((th6.w) obj4).f271299b;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                List listA = yVar.a();
                if (listA == null) {
                    listA = zhm.f0.f322471a;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : listA) {
                    if (!Intrinsics.f(((ai6.b) obj7).getId(), id10)) {
                        arrayList3.add(obj7);
                    }
                }
                yVar.b(arrayList3);
                Iterable iterable = (List) jVar.get("MANDATE_LIST_KEY");
                if (iterable == null) {
                    iterable = zhm.f0.f322471a;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : iterable) {
                    if (!Intrinsics.f(((Mandate) obj8).f72224a, id10)) {
                        arrayList4.add(obj8);
                    }
                }
                jVar.f("MANDATE_LIST_KEY", arrayList4);
                return Unit.f186387a;
            case 19:
                t1 t1Var = (t1) obj3;
                EsimDescriptorValue descriptorValue = (EsimDescriptorValue) obj2;
                Intrinsics.checkNotNullParameter(descriptorValue, "descriptorValue");
                ((tij.f) obj4).getClass();
                if (!(descriptorValue instanceof EsimDescriptorValue.Link)) {
                    if (!(descriptorValue instanceof EsimDescriptorValue.Action)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((EsimDescriptorValue.Action) descriptorValue).f100252a == s0.TRACK_PORTABILITY) {
                        String str3 = t1Var.e.f;
                        List list4 = t1Var.K;
                        if (list4 == null) {
                            return null;
                        }
                        Iterator it9 = list4.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = ((EsimSubscriptionPhoneNumber) it9.next()).i;
                                esimPhoneNumberPortingProgress = esimSubscriptionPhoneNumberPorting != null ? esimSubscriptionPhoneNumberPorting.i : null;
                                if (esimPhoneNumberPortingProgress != null) {
                                }
                            } else {
                                esimPhoneNumberPortingProgress = null;
                            }
                        }
                        if (esimPhoneNumberPortingProgress != null) {
                            return new EsimSubscriptionsScreenContract$OpenPortingStatusParcel(esimPhoneNumberPortingProgress, str3);
                        }
                        return null;
                    }
                }
                return descriptorValue;
            case 20:
                tjf.c cVar3 = (tjf.c) obj4;
                l0 l0Var = cVar3.f271640a;
                String str4 = (String) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return ue0.e.E(nim.a.w(shf.a.a(l0Var, fc.a(cVar3.e, fc.c(cVar3.f, cVar3.f271643g)), str4, 4, null, null, SyslogConstants.LOG_CLOCK), new td1.f(cVar3, i3)), l0Var.b(R$string.search_block_credit_payments_title, "CREDIT_PAYMENTS_SECTION_LIST_ID"));
                }
                efm.r rVarJust = efm.r.just(zi0.c.P(zhm.f0.f322471a, false, null, 3));
                Intrinsics.h(rVarJust);
                return rVarJust;
            case 21:
                tjf.j jVar2 = (tjf.j) obj4;
                String str5 = (String) obj3;
                od0.i jaOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(jaOptional, "jaOptional");
                n38.a aVar6 = (n38.a) jaOptional.f224257a;
                if (aVar6 == null) {
                    return zi0.c.j(zhm.f0.f322471a);
                }
                efm.r map2 = pd.b.r(jVar2.f271665b.S(w4l.h.f294642c, zhm.d0.i1(io3.k.a()), io3.l.CURRENT, io3.i.INTERNAL, l38.a.c(aVar6)), new tjf.d(jVar2, str5, aVar6, z ? 1 : 0)).map(new tid.a(new tjf.d(jVar2, str5, aVar6, i6), 14));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2;
            case 22:
                v vVar = (v) obj4;
                Set pocketIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
                return shf.a.a(vVar.f271705a, fc.a(vVar.f271706b, new va(pocketIds)), (String) obj3, 3, null, null, SyslogConstants.LOG_CLOCK).map(new tid.a(new s(vVar, i6), i2));
            case 23:
                z zVar = (z) obj4;
                Set pocketIds2 = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketIds2, "pocketIds");
                return nim.a.w(shf.a.a(zVar.f271711a, fc.a(zVar.f271712b, new va(pocketIds2)), (String) obj3, 3, null, null, SyslogConstants.LOG_CLOCK), new tjf.w(zVar, i6));
            case 24:
                tjf.d0 d0Var2 = (tjf.d0) obj4;
                Set pocketIds3 = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketIds3, "pocketIds");
                return nim.a.w(shf.a.a(d0Var2.f271648a, fc.a(d0Var2.f271650c, new va(pocketIds3)), (String) obj3, 3, null, null, SyslogConstants.LOG_CLOCK), new a0(d0Var2, i6));
            case 25:
                tjf.h0 h0Var3 = (tjf.h0) obj4;
                Set pocketIds4 = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketIds4, "pocketIds");
                return nim.a.w(shf.a.a(h0Var3.f271660a, fc.a(h0Var3.f271661b, new va(pocketIds4)), (String) obj3, 4, null, null, SyslogConstants.LOG_CLOCK), new e0(h0Var3, i6));
            case 26:
                String str6 = (String) obj4;
                q0 q0Var = (q0) obj3;
                Set pocketIds5 = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketIds5, "pocketIds");
                l0.Companion.getClass();
                i7 i7VarA = fc.a(l0.i, new va(pocketIds5));
                q0Var.f271697h = str6;
                q0Var.f271696g = i7VarA;
                aoi.h hVarE = q0Var.e.e(q0.f271691l);
                hVarE.start();
                return new sfm.b(w.o0(p0.f264003c, new tjf.p0(q0Var, continuation, z ? 1 : 0)), new tid.a(new sc7.b((Object) q0Var, (Object) new su9.c(hVarE), str6, (Serializable) i7VarA, 5), i3), i5);
            case 27:
                bih.h updateState = (bih.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return bih.h.a(updateState, tjh.h0.O, null, null, ((bih.h) ((tjh.h0) obj4).b3()).f15496a, ((RowDelegate.Model) obj3).f53228a, 38);
            case 28:
                WealthAccount wealthAccount = (WealthAccount) obj4;
                tjh.h0 h0Var4 = (tjh.h0) obj3;
                od0.i accountOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(accountOptional, "accountOptional");
                TradingAccount tradingAccount = (TradingAccount) accountOptional.f224257a;
                if (tradingAccount != null && !(wealthAccount instanceof WealthAccount.Commodities)) {
                    if (wealthAccount instanceof WealthAccount.Margin) {
                        return h0Var4.A.a(tradingAccount);
                    }
                    if (wealthAccount instanceof WealthAccount.Securities) {
                        return h0Var4.B.a(tradingAccount);
                    }
                    if ((wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) || (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) || (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea)) {
                        return h0Var4.C.a(tradingAccount);
                    }
                    if (wealthAccount instanceof WealthAccount.Robo) {
                        return h0Var4.D.a(tradingAccount);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return zi0.c.i(zhm.f0.f322471a);
            default:
                ArrayList pagerItems = (ArrayList) obj4;
                tk5.d update5 = (tk5.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                String str7 = ((CryptoMultichainInfoControllerContract$SheetPagerItem) obj3).f70974b;
                update5.getClass();
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new tk5.d(str7, pagerItems);
        }
    }
}
