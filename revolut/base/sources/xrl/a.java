package xrl;

import c02.e;
import cel.d;
import cel.m;
import cel.n;
import com.google.android.gms.common.util.GmsVersion;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$FlowState;
import com.revolut.feature.rev_points.buying.impl.ui.flow.RevPointsBuyingFlowContract$Step;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoFooter;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequested;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequestedDetails;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import hx7.l;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import le.u1;
import nkm.t;
import nkm.y;
import tof.a3;
import wtg.c;
import xs4.i;
import xs4.j;
import xs4.k;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;
import zt1.f;
import zt1.g;
import zt1.h;
import zt1.k;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308374a;

    public /* synthetic */ a(int i) {
        this.f308374a = i;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jo3.a aVarA;
        int i = 10;
        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = null;
        Object next = null;
        switch (this.f308374a) {
            case 0:
                OrderQuote quote = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                return e1.v(quote);
            case 1:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return new k(new j(new TextLocalisedClause(R$string.credit_card_instalment_repay_details_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true), (List) loadingItems.invoke(), new i(null, true, true));
            case 2:
                ty0.a it8 = (ty0.a) obj2;
                KProperty[] kPropertyArr = TransferReasonsAdditionalInfoScreen.T;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!a0.H(it8.f275445a, "ADDITIONAL_INFO_DISCLOSURE_LINK_", false)) {
                    it8 = null;
                }
                Object obj3 = it8 != null ? it8.d : null;
                if (obj3 instanceof AdditionalInfoFooter.Parameter) {
                    return (AdditionalInfoFooter.Parameter) obj3;
                }
                return null;
            case 3:
                SelectableDelegate.Model it9 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TransferReasonsAdditionalInfoScreen.T;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.k;
                if (obj4 instanceof AdditionalInfoField) {
                    return (AdditionalInfoField) obj4;
                }
                return null;
            case 4:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = TransferReasonsAdditionalInfoScreen.T;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj5 = it10.u;
                if (obj5 instanceof AdditionalInfoField) {
                    return (AdditionalInfoField) obj5;
                }
                return null;
            case 5:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (a3) d0.b0(it11);
            case 6:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                long jAbs = Math.abs(k71.k.b(transaction).f115082a);
                long jM = l.m(transaction);
                return new xsi.b(transaction, jAbs, new xsi.a(jM, jAbs - jM, k71.k.b(transaction).f115083b), jM == 0);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 8:
                n data = (n) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return data instanceof d ? y.x(d0.Q(((d) data).f23500a), new a(9)) : data instanceof cel.j ? y.x(d0.Q(((cel.j) data).f23503a), new a(i)) : t.d();
            case 9:
                m it12 = (m) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ((dj0.d) it12.d).f115083b;
            case 10:
                m it13 = (m) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return ((ej0.b) it13.d).f126704b;
            case 11:
                zt1.a it14 = (zt1.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return yt1.a.a(it14);
            case 12:
                h it15 = (h) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                zt1.j jVarC = it15.getRate();
                Intrinsics.checkNotNullParameter(jVarC, "<this>");
                lrf.a aVar = new lrf.a(jVarC.getRate(), jVarC.getFrom(), jVarC.getTo(), jVarC.getTimestamp(), 0L, 0L, 0L, null, null, null, 1008);
                dj0.d dVarO = mo3.a.o(it15.getBillAmount());
                g gVarB = it15.getCharges();
                Intrinsics.checkNotNullParameter(gVarB, "<this>");
                dj0.d dVarO2 = mo3.a.o(gVarB.getTotal());
                zt1.i fee2 = gVarB.getFee();
                Intrinsics.checkNotNullParameter(fee2, "<this>");
                dj0.d dVarO3 = mo3.a.o(fee2.getTotal());
                List<f> breakdown = fee2.getBreakdown();
                ArrayList arrayList = new ArrayList(w.t(breakdown, 10));
                for (f fVar : breakdown) {
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    String shortDescription = fVar.getShortDescription();
                    String title = fVar.getTitle();
                    String description = fVar.getDescription();
                    dj0.d dVarO4 = mo3.a.o(fVar.getAmount());
                    jo3.a amountInBaseCurrency = fVar.getAmountInBaseCurrency();
                    arrayList.add(new c02.g(shortDescription, title, description, dVarO4, amountInBaseCurrency != null ? mo3.a.o(amountInBaseCurrency) : null));
                }
                return new c02.f(aVar, dVarO, new c02.h(dVarO2, new c02.i(dVarO3, arrayList)));
            case 13:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                List<zt1.k> list = it16;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (zt1.k kVar : list) {
                    Object obj6 = yt1.a.f316607a;
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    String strG = kVar.getId();
                    e eVar = (e) u1.u(kVar.getPaymentType(), yt1.a.f316607a);
                    dj0.d dVarO5 = mo3.a.o(kVar.getAmount());
                    k.a aVarE = kVar.getChargesDto();
                    dj0.d dVarO6 = (aVarE == null || (aVarA = aVarE.getTotal()) == null) ? null : mo3.a.o(aVarA);
                    zt1.d dVarH = kVar.getMerchant();
                    Intrinsics.checkNotNullParameter(dVarH, "<this>");
                    String shortName = dVarH.getShortName();
                    String additionalInfo = dVarH.getAdditionalInfo();
                    no3.b address = dVarH.getAddress();
                    arrayList2.add(new c02.j(strG, eVar, dVarO5, dVarO6, new c02.b(address != null ? oo3.a.a(address) : null, shortName, additionalInfo), kVar.getCategory(), kVar.getAuthorizationValidFrom(), kVar.getAuthorizationValidTo(), kVar.getCreatedAt(), kVar.getOrigin()));
                }
                return arrayList2;
            case 14:
                zt1.l it17 = (zt1.l) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.getTransactionId();
            case 15:
                zt1.l it18 = (zt1.l) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.getTransactionId();
            case 16:
                zt1.a it19 = (zt1.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return yt1.a.a(it19);
            case 17:
                List instalments = (List) obj2;
                Intrinsics.checkNotNullParameter(instalments, "instalments");
                return m72.b.x(instalments, od0.i.Companion);
            case 18:
                List instalments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(instalments2, "instalments");
                return m72.b.x(instalments2, od0.i.Companion);
            case 19:
                wtg.f it20 = (wtg.f) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                Intrinsics.checkNotNullParameter(it20, "<this>");
                boolean z = it20.f299949a;
                c cVar = it20.f299950b;
                if (cVar != null) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    accountClosureBackendRequestedDetails = new AccountClosureBackendRequestedDetails(cVar.f299941a, cVar.f299942b, cVar.f299943c);
                }
                return new AccountClosureBackendRequested(z, accountClosureBackendRequestedDetails);
            case 20:
                xti.e currentState = (xti.e) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                return kotlin.text.d0.F0(currentState.f308824a).toString();
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.b(nb0Var, "loadingItemId1", false, 0, false, 30), nb0.b(nb0Var, "loadingItemId2", false, 0, false, 30), nb0.b(nb0Var, "loadingItemId3", false, 0, false, 30), nb0.b(nb0Var, "loadingItemId4", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 22:
                Iterable CameraConfiguration = (Iterable) obj2;
                Intrinsics.checkNotNullParameter(CameraConfiguration, "$this$CameraConfiguration");
                Iterator it21 = CameraConfiguration.iterator();
                if (it21.hasNext()) {
                    next = it21.next();
                    if (it21.hasNext()) {
                        int iAbs = Math.abs(GmsVersion.VERSION_LONGHORN - ((uam.i) next).a());
                        do {
                            Object next2 = it21.next();
                            int iAbs2 = Math.abs(GmsVersion.VERSION_LONGHORN - ((uam.i) next2).a());
                            if (iAbs > iAbs2) {
                                next = next2;
                                iAbs = iAbs2;
                            }
                        } while (it21.hasNext());
                    }
                }
                return (uam.i) next;
            case 23:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                List list2 = config.V0;
                if (list2.isEmpty()) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                MessageType.Sticker sticker = new MessageType.Sticker((String) d0.H0(list2, tim.c.INSTANCE));
                hVar.getClass();
                return od0.h.a(sticker);
            case 24:
                RevPointsBuyingFlowContract$FlowState update = (RevPointsBuyingFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return RevPointsBuyingFlowContract$FlowState.a(update, null, false, null, 3);
            case 25:
                RevPointsBuyingFlowContract$FlowState update2 = (RevPointsBuyingFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return RevPointsBuyingFlowContract$FlowState.a(update2, RevPointsBuyingFlowContract$Step.RecurringBuy.f83562a, false, null, 6);
            case 26:
                RevPointsBuyingFlowContract$FlowState update3 = (RevPointsBuyingFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return RevPointsBuyingFlowContract$FlowState.a(update3, null, true, null, 5);
            case 27:
                RevPointsBuyingFlowContract$FlowState update4 = (RevPointsBuyingFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return RevPointsBuyingFlowContract$FlowState.a(update4, null, true, null, 5);
            case 28:
                RevPointsBuyingFlowContract$FlowState update5 = (RevPointsBuyingFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return RevPointsBuyingFlowContract$FlowState.a(update5, null, true, null, 5);
            default:
                RevPointsBuyingFlowContract$FlowState update6 = (RevPointsBuyingFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return RevPointsBuyingFlowContract$FlowState.a(update6, null, true, null, 5);
        }
    }

    public /* synthetic */ a(cli.n nVar, int i) {
        this.f308374a = i;
    }
}
