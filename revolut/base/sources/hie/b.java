package hie;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.common.document.TextDocumentActivity;
import com.revolut.feature.insurance_pet.impl.ui.profile.dochistory.PetDocumentHistoryActivity;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget;
import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import com.revolut.feature.security_hub.impl.ui.flow.m;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderPresenterV2$HintDialogReason;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import g0c.e;
import gwc.f;
import hma.s;
import hp5.o;
import hq7.g;
import hwi.c1;
import hy7.i;
import i2i.r;
import ip0.yt;
import java.util.ArrayList;
import java.util.List;
import jn7.e;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.text.Regex;
import kotlin.text.d0;
import le.u1;
import oki.h;
import pfm.n;
import rp0.y;
import wk5.k;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zC;
        switch (this.f) {
            case 0:
                kkd.c p0 = (kkd.c) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((a) this.receiver).getClass();
                return Boolean.valueOf(d0.J(p0.a(), "theme-customisation", false));
            case 1:
                kkd.c p03 = (kkd.c) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((a) this.receiver).getClass();
                return Boolean.valueOf(new Regex("revolut://app/credit/.+-application.*").f(p03.a()));
            case 2:
                Throwable p010 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return Boolean.valueOf(((sj9.a) ((di9.c) this.receiver)).b3(p010));
            case 3:
                KotlinTypeMarker p011 = (KotlinTypeMarker) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                return ((KotlinTypePreparator) this.receiver).prepareType(p011);
            case 4:
                List p012 = (List) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                s sVar = (s) this.receiver;
                return new e(rd0.e.b(((ji5.e) sVar.d).f()), sVar, p012, 20);
            case 5:
                List p013 = (List) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                gte.a aVar = ((s) this.receiver).f;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : p013) {
                    int i = hma.q.f153616a[((soa.b) obj3).f264801a.ordinal()];
                    if (i == 3) {
                        zC = ((d) aVar).c(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget.f84601c);
                    } else if (i != 4) {
                        zC = true;
                    } else {
                        zC = ((d) aVar).c(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails.f84599c);
                    }
                    if (zC) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 6:
                k p014 = (k) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return o.b((o) this.receiver, p014);
            case 7:
                k p015 = (k) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                return o.b((o) this.receiver, p015);
            case 8:
                k p016 = (k) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                return o.b((o) this.receiver, p016);
            case 9:
                k p017 = (k) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                return o.b((o) this.receiver, p017);
            case 10:
                jn7.e p018 = (jn7.e) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                hq7.k kVar = (hq7.k) this.receiver;
                kVar.getClass();
                if (!Intrinsics.f(p018, e.a.f176653a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar.v2(g.b.f154613a);
                return Unit.f186387a;
            case 11:
                f p019 = (f) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                m mVar = (m) this.receiver;
                yki.a aVar2 = mVar.N;
                if (p019 instanceof gwc.c) {
                    gwc.c cVar = (gwc.c) p019;
                    h.t2(mVar, aVar2, new SecurityHubFlowContract$Step.TransactionsLimitChange(cVar.f147306a, cVar.f147307b), true, null, false, 12);
                } else if (p019 instanceof gwc.e) {
                    h.t2(mVar, aVar2, new SecurityHubFlowContract$Step.ProductArticle(rwc.d.a(((gwc.e) p019).f147309a), null, com.revolut.feature.security_hub.impl.ui.flow.a.BACK, false, 8), true, null, false, 12);
                } else {
                    if (!(p019 instanceof gwc.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.L2(((gwc.d) p019).f147308a);
                }
                return Unit.f186387a;
            case 12:
                List p020 = (List) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                c1 c1Var = (c1) this.receiver;
                c1Var.getClass();
                n nVar = new n(new fag.g(c1Var, p020, 11), 1);
                Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                return nVar;
            case 13:
                List p021 = (List) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                c1 c1Var2 = (c1) this.receiver;
                c1Var2.getClass();
                n nVar2 = new n(new fag.g(c1Var2, p021, 11), 1);
                Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
                return nVar2;
            case 14:
                hy7.d p022 = (hy7.d) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                xpi.c cVar2 = (xpi.c) ((i) this.receiver).f156750j;
                cVar2.n0(p022.f156746a);
                cVar2.p0(p022.f156746a);
                return Unit.f186387a;
            case 15:
                hy7.d document = (hy7.d) obj2;
                Intrinsics.checkNotNullParameter(document, "p0");
                ((iy7.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(document, "document");
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
                List list = document.f156747b;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                int i2 = 0;
                for (Object obj4 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList2.add(new ListCellDelegate.Model(a0.d.n("DOCUMENT_PARAGRAPH_CELL_ID_PREFIX_", i2), new j8(resourceImage, yt.TOP), null, new TextLocalisedClause((ResourceId) obj4, (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Clause) null, 26), false, null, null, 0, 0, 0, 0, 4068));
                    i2 = i3;
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 16:
                List p023 = (List) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                ((TextDocumentActivity) ((hy7.e) this.receiver)).setItems(p023);
                return Unit.f186387a;
            case 17:
                q90.i p024 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                return ((t90.g) this.receiver).a(p024);
            case 18:
                q90.i p025 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                return ((t90.g) this.receiver).a(p025);
            case 19:
                q90.i p026 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                return ((t90.g) this.receiver).a(p026);
            case 20:
                q90.i p027 = (q90.i) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                return ((t90.g) this.receiver).a(p027);
            case 21:
                List p028 = (List) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((ihm.f) this.receiver).onNext(p028);
                return Unit.f186387a;
            case 22:
                RevPointsSpareChangeControllerApi$Result p029 = (RevPointsSpareChangeControllerApi$Result) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((com.revolut.feature.rev_points.impl.ui.earn.b) this.receiver).J2(p029);
                return Unit.f186387a;
            case 23:
                com.revolut.feature.rev_points.impl.ui.earn.b.I2((com.revolut.feature.rev_points.impl.ui.earn.b) this.receiver, ((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 24:
                com.revolut.feature.rev_points.impl.ui.earn.b.I2((com.revolut.feature.rev_points.impl.ui.earn.b) this.receiver, ((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 25:
                List p030 = (List) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                ((PetDocumentHistoryActivity) ((i08.c) this.receiver)).setItems(p030);
                return Unit.f186387a;
            case 26:
                rzj.c scope = (rzj.c) obj2;
                Intrinsics.checkNotNullParameter(scope, "p0");
                wzj.b bVar = (wzj.b) ((vzj.a) this.receiver);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(scope, "scope");
                ne0.d dVar = bVar.f301427a;
                wzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(scope, "<this>");
                return (List) dVar.get(u1.g(scope, wzj.b.f301426b));
            case 27:
                r p031 = (r) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar3 = (com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) this.receiver;
                g2i.a aVar4 = aVar3.f96954t;
                l4i.a aVar5 = aVar3.u;
                MarketOrderPresenterV2$HintDialogReason marketOrderPresenterV2$HintDialogReason = p031.f157972a;
                if (marketOrderPresenterV2$HintDialogReason instanceof MarketOrderPresenterV2$HintDialogReason.CryptoUpperLimitError) {
                    Amount amount = ((MarketOrderPresenterV2$HintDialogReason.CryptoUpperLimitError) marketOrderPresenterV2$HintDialogReason).f96945a;
                    if (amount == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    aVar5.getClass();
                    dj0.d limitMoney = l4i.a.b(amount);
                    h2i.c cVar3 = (h2i.c) aVar4;
                    cVar3.getClass();
                    Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
                    ((h2i.d) cVar3.f148822h).getClass();
                    Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
                    y yVarA = h2i.d.a(R$string.cryptobuysell_marketorder_crypto_limit_higher_dialog_title, R$string.cryptobuysell_marketorder_crypto_limit_higher_dialog_message, limitMoney);
                    pfm.h hVar = new pfm.h(new a08.d(cVar3, 27), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    pfm.a aVarE = hVar.e(new pfm.h(new f0d.m(cVar3, yVarA, 28), 2));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "showDialog(...)");
                    return aVarE;
                }
                if (!(marketOrderPresenterV2$HintDialogReason instanceof MarketOrderPresenterV2$HintDialogReason.CryptoLowerLimitError)) {
                    if (marketOrderPresenterV2$HintDialogReason != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pfm.m mVar2 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                Amount amount2 = ((MarketOrderPresenterV2$HintDialogReason.CryptoLowerLimitError) marketOrderPresenterV2$HintDialogReason).f96944a;
                if (amount2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar5.getClass();
                dj0.d limitMoney2 = l4i.a.b(amount2);
                h2i.c cVar4 = (h2i.c) aVar4;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(limitMoney2, "limitMoney");
                ((h2i.d) cVar4.f148822h).getClass();
                Intrinsics.checkNotNullParameter(limitMoney2, "limitMoney");
                y yVarA2 = h2i.d.a(R$string.cryptobuysell_marketorder_crypto_limit_lower_dialog_title, R$string.fx_orders_marketorder_crypto_limit_lower_dialog_message, limitMoney2);
                pfm.h hVar2 = new pfm.h(new a08.d(cVar4, 27), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE2 = hVar2.e(new pfm.h(new f0d.m(cVar4, yVarA2, 28), 2));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "showDialog(...)");
                return aVarE2;
            case 28:
                long jLongValue = ((Number) obj2).longValue();
                g1i.d0 d0Var = (g1i.d0) ((m1i.k) this.receiver);
                d0Var.getClass();
                return d0Var.R3(new g1i.g(d0Var, jLongValue, 0));
            default:
                long jLongValue2 = ((Number) obj2).longValue();
                g1i.d0 d0Var2 = (g1i.d0) ((m1i.k) this.receiver);
                d0Var2.getClass();
                return d0Var2.R3(new g1i.g(d0Var2, jLongValue2, 1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(KotlinTypePreparator kotlinTypePreparator) {
        super(1, 0, KotlinTypePreparator.class, kotlinTypePreparator, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;");
        this.f = 3;
    }
}
