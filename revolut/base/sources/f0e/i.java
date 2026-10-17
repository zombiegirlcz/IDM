package f0e;

import android.os.Parcelable;
import android.text.InputFilter;
import aw0.d0;
import aw0.ka;
import aw0.la;
import aw0.o9;
import ba6.j0;
import ba6.l0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.hj;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.og;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.r0;
import com.revolut.core.ui_kit.delegates.s0;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.BusinessBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AvatarByUserIdImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaSCGroup;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.feature.transport.api.R$plurals;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicketValidity;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogControllerContract$ContinueClickParcel;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanAttributes;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanHighlights;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItem;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$Action;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import dx4.q4;
import f5g.l;
import fag.o0;
import fb6.n;
import fci.g0;
import fci.q;
import fci.t0;
import fci.x0;
import ff4.e0;
import ff4.s;
import fij.h0;
import fij.m;
import fij.o;
import ia3.t;
import ip0.ah0;
import ip0.do0;
import ip0.go0;
import ip0.qd0;
import ip0.vd0;
import ip0.xc;
import ip0.zj;
import ip0.zp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.u1;
import m1c.x;
import ms0.h4;
import mx0.f3;
import mx0.h3;
import nr6.c0;
import org.jmrtd.cbeff.ISO781611;
import r10.r;
import ru6.b0;
import ruf.k;
import tof.a3;
import tof.z6;
import whf.j;
import whf.p;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f131117c;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f131115a = i;
        this.f131116b = obj2;
        this.f131117c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x048e  */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object b(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        n nVar = (n) this.f131116b;
        fb6.d dVar = (fb6.d) this.f131117c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        l0 l0Var = (l0) pair.f186385a;
        x xVar = (x) pair.f186386b;
        aim.e eVarB = u.b();
        ArrayList arrayList = l0Var.f13951b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            j0 j0Var = (j0) obj5;
            boolean z = dVar.f133446b == i;
            double dJ = xVar.f201472c.J();
            int i3 = i;
            double d = j0Var.f13937b;
            dj0.d dVar2 = j0Var.f13936a;
            AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(p.a.m(dVar2.f115082a, "id_suggestion_"), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), nub.a.k(j0Var.f13937b, o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED, null, 54), z ? new r0(v.k(Integer.valueOf(nub.a.f219273b), Integer.valueOf(nub.a.f219274c))) : null, dJ < d ? s0.DISABLED : s0.NORMAL, false, Integer.valueOf(i3), null, 416);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
            i = i2;
        }
        eVarB.addAll(n.e(arrayList2));
        Data data = dVar.d;
        koi.j jVarD = xVar.f201472c.J() < ((j0) l0Var.f13951b.get(dVar.f133446b)).f13937b ? n.d(new TextLocalisedClause(R$string.donations_rev_points_donation_insufficient_points_balance, null, null, 14)) : data == null ? n.d(new TextLocalisedClause(R$string.donations_rev_points_donation_no_fees, null, null, 14)) : (qv0.i) iii.c.f(data, new o0(nVar, 14), new l(27), new et6.a(nVar, 19));
        if (jVarD != null) {
            eVarB.add(jVarD);
        }
        return u.a(eVarB);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        boolean z;
        qv0.i model;
        g0 g0Var = (g0) this.f131116b;
        t0 t0Var = (t0) this.f131117c;
        cci.i content = (cci.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        StaggeredGridItemDelegate.Companion companion = StaggeredGridItemDelegate.INSTANCE;
        List list = t0Var.f133814b;
        ArrayList arrayList = content.f23119c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            cci.j jVar = (cci.j) obj5;
            List list2 = g0.f133777b;
            d0 d0Var = (d0) list2.get(i % list2.size());
            d0 d0Var2 = q.f133803b;
            boolean zF = Intrinsics.f(d0Var, d0Var2);
            List list3 = jVar.f23121b;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z = false;
            } else {
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    if (list.contains((String) it8.next())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            String strQ = j6.a.q("purpose_tile_", jVar.f23120a);
            if (zF) {
                model = new VoucherSmallTileDelegate.Model(strQ, new zi(new CdnImage(jVar.e, "mobile/onboarding/poa/main_images", ".png", null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION), go0.PROGRESSIVE_BLUR), new HtmlClause(0, 30, (Integer) null, (Object) null, jVar.f23122c), new hj(3), null, null, null, null, null, null, z ? VoucherSmallTileDelegate.d.C0430d.f53628a : new VoucherSmallTileDelegate.d.a(null), false, new do0(d0Var2), null, jVar.f23121b, 241648);
            } else {
                model = new SmallCardDelegate.Model(strQ, null, new HtmlClause(0, 30, (Integer) null, (Object) null, jVar.f23122c), null, new UrlImage("https://assets.revolut.com/mobile/onboarding/poa/purpose_of_account_small_tile_background.png", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), new og(new ResourceImage(g0Var.f133778a.a(jVar.d), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, jVar.f23121b, z ? SmallCardDelegate.c.b.f53376a : new SmallCardDelegate.c.a(true), 519642);
            }
            qv0.i iVar = model;
            int i3 = R$attr.uikit_dp0;
            yp0.b.l(iVar, i3, i3, i3, i3, null, false, 48);
            arrayList2.add(new ah0(strQ, iVar, false));
            i = i2;
        }
        companion.getClass();
        ArrayList arrayListB = StaggeredGridItemDelegate.Companion.b(arrayList2);
        boolean z3 = !t0Var.f133814b.isEmpty();
        TextClause textClause = new TextClause(content.f23117a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = content.f23118b;
        return new x0(arrayListB, z3, textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        CompositeClause compositeClause;
        CompositeClause compositeClause2;
        Parcelable textClause;
        e0 e0Var = (e0) this.f131116b;
        ff4.i iVar = (ff4.i) this.f131117c;
        bv3.b content = (bv3.b) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        bv3.c cVar = content.f18943a;
        String str = cVar.f18947b;
        TextLocalisedClause textLocalisedClauseA = str != null ? e0.a(str) : null;
        String str2 = cVar.f18948c;
        TextClause textClause2 = str2 != null ? new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
        ResourceImage resourceImage = ff4.d0.f134715a[cVar.f18949g.ordinal()] == 1 ? new ResourceImage(R$drawable.uikit_icn_16_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_action, u.c(new TextClause(cVar.k.f66298a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        List list = cVar.f18950h;
        if (list != null) {
            if ((!list.isEmpty() ? list : null) != null) {
                List<q4> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (q4 q4Var : list2) {
                    dx4.l lVar = q4Var.f120728c;
                    if (lVar != null) {
                        String str3 = q4Var.f120726a;
                        textClause = new TextClause(str3, (Style) new Click(28, (Integer) null, (Object) lVar, str3, false), (Integer) null, false, (o9) null, (List) null, 124);
                    } else {
                        textClause = q4Var.f120727b ? new TextClause(q4Var.f120726a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : new HtmlClause(0, 30, (Integer) null, (Object) null, q4Var.f120726a);
                    }
                    arrayList.add(textClause);
                }
                compositeClause2 = new CompositeClause(arrayList, new DotDividerClause((Integer) null), null, null, 12);
            } else {
                compositeClause2 = null;
            }
            compositeClause = compositeClause2;
        } else {
            compositeClause = null;
        }
        iVar.getClass();
        return new s(e0Var.f134717a.a(cVar, iVar.f134719a), textLocalisedClauseA, null, null, null, textClause2, resourceImage, compositeClause, textLocalisedClause, zBooleanValue, true, null, null, 2076);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        a3 a3Var;
        CircleBadgeModel circleBadgeModel;
        RawCutoutImageBadge rawCutoutImageBadge;
        Object next;
        fhf.e eVar = (fhf.e) this.f131116b;
        fhf.l lVar = (fhf.l) this.f131117c;
        p transactionsContent = (p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        ActionsView.Item item = null;
        if (eVar.d) {
            Iterator it8 = transactionsContent.f297646a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (!k.g1((a3) next)) {
                    break;
                }
            }
            a3Var = (a3) next;
        } else {
            a3Var = null;
        }
        boolean z = eVar.f135215c;
        boolean z3 = false;
        ArrayList arrayListC = ((anf.w) lVar.f135227a).c(transactionsContent, new whf.l(new thf.k(1014, false, true, false, false, false)), z ? new whf.i(false) : j.a.f297643a);
        if (!z) {
            yp0.b.k(arrayListC, 0, 0, 0, 0, 31);
        }
        Image imageB = a3Var != null ? lVar.f135228b.b(a3Var, transactionsContent.f297647b) : null;
        if (a3Var != null) {
            f5j.a aVar = eVar.f135214b;
            z6 z6VarL0 = k.l0(a3Var);
            if (z6VarL0 != null) {
                circleBadgeModel = Intrinsics.f(z6VarL0.e, "BUSINESS") ? BusinessBadge.f58051a : RetailBadge.f58066a;
            } else {
                tof.q cardOwner = a3Var.f272597k0;
                if (cardOwner != null) {
                    Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
                    rawCutoutImageBadge = new RawCutoutImageBadge(mra.b.c(cardOwner.f));
                } else {
                    if (aVar != null) {
                        rawCutoutImageBadge = new RawCutoutImageBadge(lVar.f135229c.b(aVar));
                    }
                    circleBadgeModel = null;
                }
                circleBadgeModel = rawCutoutImageBadge;
            }
        } else {
            circleBadgeModel = null;
        }
        gte.a aVar2 = lVar.d;
        List list = transactionsContent.f297646a;
        if ((list instanceof Collection) && list.isEmpty()) {
            z3 = true;
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (!k.P((a3) it9.next())) {
                    break;
                }
            }
            z3 = true;
        }
        ActionsView.Item item2 = new ActionsView.Item("SPARE_CHANGE_REFUND_ACTION_LIST_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.transactionUI_transaction_refund, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revert_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668);
        if (z3) {
            jte.d dVar = (jte.d) aVar2;
            if (dVar.c(RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe.f84114c) && dVar.c(RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaSCGroup.f84115c)) {
                item = item2;
            }
        }
        return new fhf.g(arrayListC, imageB, circleBadgeModel, v.l(item));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model model;
        qd0 qd0Var;
        EsimDataPlan esimDataPlan;
        List list;
        Object next;
        EsimDataPlan esimDataPlan2;
        Object obj5;
        List list2;
        Iterator it8;
        EsimDataPlan esimDataPlan3;
        Image imageA;
        Image image;
        Click click;
        Object obj6;
        Object qVar;
        Object obj7;
        Object qVar2;
        EsimDataPlan esimDataPlan4;
        EsimDataPlan esimDataPlan5;
        EsimCoverage esimCoverage;
        h0 h0Var = (h0) this.f131116b;
        EsimGetPlanScreenContract$DomainState domainState = (EsimGetPlanScreenContract$DomainState) this.f131117c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List dataPlans = (List) pair.f186385a;
        r rVar = h0Var.f135448b;
        hij.b bVar = (hij.b) rVar.f250852b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(dataPlans, "dataPlans");
        if (!((efj.d) ((cej.b) rVar.f250851a)).a() || !bfj.a.b(dataPlans)) {
            return bVar.a(domainState, dataPlans);
        }
        o oVar = domainState.f100986a;
        if ((oVar instanceof m) || oVar == null) {
            return bVar.a(domainState, dataPlans);
        }
        if (!(oVar instanceof fij.n)) {
            throw new NoWhenBranchMatchedException();
        }
        hij.k kVar = (hij.k) rVar.f250853c;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(dataPlans, "dataPlans");
        ynj.e eVar = kVar.f152619c;
        Intrinsics.checkNotNullParameter(dataPlans, "<this>");
        List list3 = dataPlans;
        ArrayList arrayList = new ArrayList();
        for (Object obj8 : list3) {
            if (((EsimDataPlan) obj8).f100214c == dej.m.MOBILE_PLAN) {
                arrayList.add(obj8);
            }
        }
        fij.n nVar = fij.n.f135450a;
        fij.p pVarC = domainState.c(nVar);
        xc xcVar = null;
        EsimDataPlanCoverageCode f100209b = (pVarC == null || (esimDataPlan5 = pVarC.f135452b) == null || (esimCoverage = esimDataPlan5.f100221p) == null) ? null : esimCoverage.getF100209b();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj9 : arrayList) {
            if (Intrinsics.f(((EsimDataPlan) obj9).f100221p.getF100209b(), f100209b)) {
                arrayList2.add(obj9);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList2.size() < 2) {
                model = null;
            } else {
                EsimDataPlan esimDataPlan6 = (EsimDataPlan) zhm.d0.b0(arrayList2);
                model = new RowDelegate.Model("ID_ITEM_HEADER", new RowDelegate.Model.MainImage.Image40(ynj.e.h(eVar, esimDataPlan6), null, null, false, null, false, 60), eVar.c(esimDataPlan6), null, 0, null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_data_plans_coverage_actions_change, null, null, 14), null, null, pw5.a.k(kVar.f152617a), null, null, 502), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            }
            if (arrayList2.size() < 2) {
                EsimDataPlan esimDataPlan7 = (EsimDataPlan) zhm.d0.b0(arrayList2);
                List listC = u.c(new RowDelegate.Model("ID_TAB_MOBILE_PLANS", new RowDelegate.Model.MainImage.Image40(ynj.e.h(eVar, esimDataPlan7), null, null, false, null, false, 60), kVar.b(esimDataPlan7), null, 0, eVar.c(esimDataPlan7), null, null, 0, hij.k.a(esimDataPlan7), false, null, false, null, null, null, null, null, null, esimDataPlan7, null, 0, 0, 0, 0, 532675544));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                list = listC;
            } else {
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                int i = 0;
                for (Object obj10 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    EsimDataPlan esimDataPlan8 = (EsimDataPlan) obj10;
                    Clause clauseB = kVar.b(esimDataPlan8);
                    String strN = a0.d.n("ID_TAB_MOBILE_PLANS_", i);
                    String str = strN + "_inner";
                    Intrinsics.checkNotNullParameter(esimDataPlan8, "<this>");
                    EsimDataPlanAttributes esimDataPlanAttributes = esimDataPlan8.f100225t;
                    RowDelegate.Model model2 = new RowDelegate.Model(str, null, clauseB, null, 0, pd.b.j(esimDataPlanAttributes != null ? esimDataPlanAttributes.f100228a : null) ? new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_current_plan_subtitle, null, null, 14) : null, null, null, 0, hij.k.a(esimDataPlan8), false, null, false, null, null, null, null, null, null, esimDataPlan8, null, 0, 0, 0, 0, 532675546);
                    vd0 vd0Var = vd0.RADIO;
                    String str2 = esimDataPlan8.f100212a;
                    fij.p pVarC2 = domainState.c(nVar);
                    boolean zF = Intrinsics.f((pVarC2 == null || (esimDataPlan = pVarC2.f135452b) == null) ? null : esimDataPlan.f100212a, str2);
                    if (zF) {
                        qd0Var = qd0.SELECTED;
                    } else {
                        if (zF) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qd0Var = qd0.UNSELECTED;
                    }
                    arrayList3.add(new SelectableDelegate.Model(strN, model2, qd0Var, null, vd0Var, null, false, true, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 4194152));
                    i = i2;
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                list = arrayList3;
            }
            Iterator it9 = list3.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                String str3 = ((EsimDataPlan) next).f100212a;
                fij.p pVarC3 = domainState.c(nVar);
                if (Intrinsics.f(str3, (pVarC3 == null || (esimDataPlan4 = pVarC3.f135452b) == null) ? null : esimDataPlan4.f100212a)) {
                    break;
                }
            }
            EsimDataPlan mobilePlan = (EsimDataPlan) next;
            if (mobilePlan == null) {
                throw new IllegalStateException("EsimMobilePlansContentMapper: Unable to find currently selected mobile plan");
            }
            hij.i iVar = kVar.d;
            Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
            EsimMobilePlanHighlights esimMobilePlanHighlights = mobilePlan.v;
            if (esimMobilePlanHighlights == null || (list2 = esimMobilePlanHighlights.f100297a) == null) {
                esimDataPlan2 = mobilePlan;
                obj5 = f0.f322471a;
            } else {
                List list4 = list2;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                Iterator it10 = list4.iterator();
                int i3 = 0;
                while (it10.hasNext()) {
                    Object next2 = it10.next();
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    EsimMobilePlanSummaryItem esimMobilePlanSummaryItem = (EsimMobilePlanSummaryItem) next2;
                    String strN2 = a0.d.n("PREFIX_ID_PLAN_HIGHLIGHT_ITEM__", i3);
                    String str4 = esimMobilePlanSummaryItem.f100313a;
                    EsimInfoBottomSheetData esimInfoBottomSheetData = esimMobilePlanSummaryItem.f100315c;
                    EsimCoverage esimCoverage2 = esimMobilePlanSummaryItem.e;
                    EsimIcon esimIcon = esimMobilePlanSummaryItem.d;
                    aw0.t0 t0Var = new aw0.t0((Clause) new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30);
                    if (esimIcon == null) {
                        it8 = it10;
                        esimDataPlan3 = mobilePlan;
                        image = null;
                    } else {
                        if (esimIcon instanceof EsimIcon.Url) {
                            it8 = it10;
                            esimDataPlan3 = mobilePlan;
                            imageA = new UrlImage(((EsimIcon.Url) esimIcon).f100282a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
                        } else {
                            it8 = it10;
                            esimDataPlan3 = mobilePlan;
                            if (!(esimIcon instanceof EsimIcon.Id)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            imageA = ResourceImage.a(iVar.f152616a.m(((EsimIcon.Id) esimIcon).f100281a), 0, Integer.valueOf(R$attr.uikit_colorAccent), null, Constants.TAG_BLE_FIRMWARE_VERSION);
                        }
                        image = imageA;
                    }
                    boolean z = ((esimCoverage2 instanceof EsimCoverage.Regional ? (EsimCoverage.Regional) esimCoverage2 : null) == null && esimInfoBottomSheetData == null) ? false : true;
                    String str5 = esimMobilePlanSummaryItem.f100314b;
                    if (z) {
                        String strN3 = a0.d.n("PREFIX_ID_PLAN_HIGHLIGHT_ITEM_click_", i3);
                        if (esimInfoBottomSheetData != null) {
                            qVar2 = new fij.r(esimIcon, esimInfoBottomSheetData);
                        } else if (esimCoverage2 instanceof EsimCoverage.Regional) {
                            qVar2 = new fij.q((EsimCoverage.Regional) esimCoverage2);
                        } else {
                            obj7 = null;
                            click = new Click(28, (Integer) null, obj7, strN3, false);
                        }
                        obj7 = qVar2;
                        click = new Click(28, (Integer) null, obj7, strN3, false);
                    } else {
                        click = null;
                    }
                    TextClause textClause = new TextClause(str5, (Style) click, (Integer) null, false, (o9) null, (List) null, 124);
                    if (esimInfoBottomSheetData != null) {
                        qVar = new fij.r(esimIcon, esimInfoBottomSheetData);
                    } else if (esimCoverage2 instanceof EsimCoverage.Regional) {
                        qVar = new fij.q((EsimCoverage.Regional) esimCoverage2);
                    } else {
                        obj6 = null;
                        arrayList4.add(new CellDetailsDelegate.Model(strN2, t0Var, textClause, null, obj6, null, null, 0, image, false, false, null, null, 31672));
                        i3 = i5;
                        it10 = it8;
                        mobilePlan = esimDataPlan3;
                    }
                    obj6 = qVar;
                    arrayList4.add(new CellDetailsDelegate.Model(strN2, t0Var, textClause, null, obj6, null, null, 0, image, false, false, null, null, 31672));
                    i3 = i5;
                    it10 = it8;
                    mobilePlan = esimDataPlan3;
                }
                esimDataPlan2 = mobilePlan;
                obj5 = arrayList4;
            }
            aim.e eVarB = u.b();
            eVarB.addAll((Collection) obj5);
            aim.e eVarA = u.a(eVarB);
            int i6 = R$attr.uikit_dp16;
            int i21 = R$attr.uikit_dp24;
            yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
            int i22 = R$attr.uikit_dp16;
            boolean zIsEmpty = eVarA.isEmpty();
            List listD = eVarA;
            if (!zIsEmpty) {
                listD = yp0.b.d(eVarA, new ListSubheaderDelegate.Model("planFeaturesSubheaderItemId", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_plan_features_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_plan_features_see_all, null, new Click(30, (Integer) null, (Object) null, "ID_SEE_ALL_ACTION", false), 10), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) esimDataPlan2, (Parcelable) null, 0, 0, 0, 0, 64426), e0Var, i6, i21, i22, i22);
            }
            xcVar = new xc("ID_TAB_MOBILE_PLANS", i2b.a.o(i2b.a.q(model, list), listD), 0, null, null, 0, 0, 0, 1020);
        }
        return v.l(xcVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0cf9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0231  */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r79, java.lang.Object r80, java.lang.Object r81) {
        /*
            Method dump skipped, instruction units count: 3374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0560  */
    /* JADX WARN: Type inference failed for: r62v2 */
    /* JADX WARN: Type inference failed for: r62v3 */
    /* JADX WARN: Type inference failed for: r62v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r93, java.lang.Object r94, java.lang.Object r95) {
        /*
            Method dump skipped, instruction units count: 1570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj2, Object obj3, Object obj4) throws Throwable {
        List listA;
        fkh.l lVar = (fkh.l) this.f131116b;
        fkh.e eVar = (fkh.e) this.f131117c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Optional optional = (Optional) pair.f186385a;
        Optional optional2 = (Optional) pair.f186386b;
        UnsettledDialogInputData unsettledDialogInputData = lVar.f135841c;
        lw0.a aVarB = fkh.l.b(unsettledDialogInputData);
        Boolean bool = eVar.f135829c;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = eVar.d;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        int i = fkh.k.f135838a[unsettledDialogInputData.f95928b.ordinal()];
        if (i == 1) {
            aim.e eVarB = u.b();
            eVarB.addAll(lVar.d(optional2, zBooleanValue, com.revolut.retail.wealth.resources.R$string.wealth_cash_info_dialog_unsettled_sell_orders_recent_section_title));
            eVarB.addAll(lVar.a(optional, zBooleanValue2, com.revolut.retail.wealth.resources.R$string.wealth_cash_info_dialog_unsettled_buy_orders_section_title));
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
            int i2 = R$attr.uikit_dp24;
            int i3 = R$attr.uikit_dp16;
            eVarB.add(new LargeActionButtonDelegate.Model("LIST_ID_UNSETTLED_DIALOG_CONTINUE_BUTTON", defaultFilledButton, null, textLocalisedClause, false, null, UnsettledDialogControllerContract$ContinueClickParcel.f95976a, i2, i2, i3, i3, 368));
            listA = u.a(eVarB);
        } else if (i == 2) {
            listA = lVar.d(optional2, zBooleanValue, com.revolut.retail.wealth.resources.R$string.wealth_cash_info_dialog_unsettled_sell_orders_section_title);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listA = lVar.a(optional, zBooleanValue2, com.revolut.retail.wealth.resources.R$string.wealth_cash_info_dialog_unsettled_buy_orders_section_title);
        }
        return new cii.b(null, listA, aVarB);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object l(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r44v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    private final Object m(Object obj2, Object obj3, Object obj4) {
        LargeActionButtonDelegate.Model model;
        List listL;
        LargeActionButtonDelegate.Model model2;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.b) this.f131116b;
        ia3.r rVar = bVar.f103542a;
        fmk.f fVar = (fmk.f) this.f131117c;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        List list = (List) hVar.f288433a;
        u1 u1Var = (u1) hVar.f288434b;
        m1c.r0 r0Var = (m1c.r0) hVar.f288435c;
        yt8.c cVar = (yt8.c) hVar.d;
        PlanRevPointsCardsScreenContract$RevPointsCardType planRevPointsCardsScreenContract$RevPointsCardType = fVar.f136465a;
        m1c.x0 x0Var = r0Var.f201447a;
        List<h93.f0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (h93.f0 f0Var : list2) {
            arrayList.add(new RowDelegate.Model(f0Var.f150110a, ((t) bVar.f103543b).d(f0Var, true), null, null, m93.f.b(rVar, f0Var, null, null, 14), rVar.m(f0Var, cVar.f316662a, null), null, null, 0, null, true, false, null, null, null, null, null, f0Var, null, 0, 0, 0, 0, 1056960364));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        hha.d dVar = u1Var.f201462c;
        PlanRevPointsCardsScreenContract$Action.IncreaseRate increaseRate = dVar != null ? new PlanRevPointsCardsScreenContract$Action.IncreaseRate(dVar) : null;
        boolean zF = Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Credit.f103532a);
        PlanRevPointsCardsScreenContract$Action.NavigateRevPoints navigateRevPoints = PlanRevPointsCardsScreenContract$Action.NavigateRevPoints.f103530a;
        if (zF) {
            int i = fmk.m.f136475a[x0Var.ordinal()];
            if (i == 1) {
                if (increaseRate != null) {
                    LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("plan_hub.bottom_sheets.cards.credit.action.increase_rate", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_hub_sheet_cards_credit_revpoints_action_increase_rate, null, null, 14), false, null, null, increaseRate, null, 744);
                    yp0.b.r(model3, 0, 0, 0, 0, 15);
                    model2 = model3;
                } else {
                    model2 = null;
                }
                LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("plan_hub.bottom_sheets.cards.credit.action.go_revpoints", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_hub_sheet_cards_credit_revpoints_action_go_revpoints, null, null, 14), false, null, null, navigateRevPoints, null, 744);
                yp0.b.r(model4, 0, 0, 0, 0, 15);
                LargeActionButtonDelegate.Model[] elements = {model2, model4};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL = kotlin.collections.d.L(elements);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                LargeActionButtonDelegate.Model model5 = new LargeActionButtonDelegate.Model("plan_hub.bottom_sheets.cards.credit.action.earn_revpoints", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_hub_sheet_cards_credit_revpoints_action_earn_revpoints, null, null, 14), false, null, null, navigateRevPoints, null, 744);
                yp0.b.r(model5, 0, 0, 0, 0, 15);
                listL = u.c(model5);
            }
        } else {
            if (!Intrinsics.f(planRevPointsCardsScreenContract$RevPointsCardType, PlanRevPointsCardsScreenContract$RevPointsCardType.Debit.f103533a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = fmk.m.f136475a[x0Var.ordinal()];
            if (i2 == 1) {
                if (increaseRate != null) {
                    LargeActionButtonDelegate.Model model6 = new LargeActionButtonDelegate.Model("plan_hub.bottom_sheets.cards.debit.action.increase_rate", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_hub_sheet_cards_debit_revpoints_action_increase_rate, null, null, 14), false, null, null, increaseRate, null, 744);
                    yp0.b.r(model6, 0, 0, 0, 0, 15);
                    model = model6;
                } else {
                    model = null;
                }
                LargeActionButtonDelegate.Model model7 = new LargeActionButtonDelegate.Model("plan_hub.bottom_sheets.cards.debit.action.go_revpoints", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_hub_sheet_cards_debit_revpoints_action_go_revpoints, null, null, 14), false, null, null, navigateRevPoints, null, 744);
                yp0.b.r(model7, 0, 0, 0, 0, 15);
                LargeActionButtonDelegate.Model[] elements2 = {model, model7};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                listL = kotlin.collections.d.L(elements2);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                LargeActionButtonDelegate.Model model8 = new LargeActionButtonDelegate.Model("plan_hub.bottom_sheets.cards.debit.action.earn_revpoints", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_hub_sheet_cards_debit_revpoints_action_earn_revpoints, null, null, 14), false, null, null, navigateRevPoints, null, 744);
                yp0.b.r(model8, 0, 0, 0, 0, 15);
                listL = u.c(model8);
            }
        }
        return zhm.d0.E0(listL, arrayList);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayListF0;
        fo6.s sVar = (fo6.s) this.f131116b;
        fo6.i iVar = (fo6.i) this.f131117c;
        List branches = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(branches, "branches");
        String str = iVar.f136829b;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : branches) {
            if (kotlin.text.d0.J(((se6.h) obj5).f262134b, str, true)) {
                arrayList.add(obj5);
            }
        }
        List<se6.h> listP0 = zhm.d0.P0(arrayList, new fo6.r());
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        for (se6.h hVar : listP0) {
            arrayList2.add(new RowDelegate.Model(hVar.f262133a, new RowDelegate.Model.MainImage.Image40(((di6.a) sVar.f136837a).d(hVar.f262135c), null, null, false, null, false, 60), new TextClause(hVar.f262134b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        List listN = c6d.b.N(arrayList2);
        if (listN != null) {
            RowDelegate.Model model = new RowDelegate.Model("LIST_ID_COUNTRY_NOT_LISTED", null, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_branch_not_in_list, null, null, 14), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
            yp0.b.l(model, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            arrayListF0 = zhm.d0.F0(model, listN);
        } else {
            arrayListF0 = null;
        }
        if (arrayListF0 != null) {
            return arrayListF0;
        }
        FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("LIST_ID_EMPTY_SEARCH", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_search_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_search_no_results_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), new l6(12, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_cross_border_bank_selection_search_no_results_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return u.c(model2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02d0  */
    /* JADX WARN: Type inference failed for: r49v1 */
    /* JADX WARN: Type inference failed for: r49v3 */
    /* JADX WARN: Type inference failed for: r49v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        Clause clauseB;
        TextLocalisedClause textLocalisedClause;
        int i;
        fr8.t tVar = (fr8.t) this.f131116b;
        fr8.l lVar = (fr8.l) this.f131117c;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) hVar.f288433a;
        io3.d dVar = (io3.d) hVar.f288434b;
        io3.d pocket = (io3.d) hVar.f288435c;
        xi0.b targetCurrency = (xi0.b) hVar.d;
        fr8.c cVar = tVar.f137442b;
        JuniorTransferAmountScreenContract$InputData juniorTransferAmountScreenContract$InputData = tVar.f137441a;
        long j2 = lVar.f137416a;
        hrf.h hVar2 = lVar.i;
        boolean zA = hVar2.a();
        c91.a aVar = cVar.f137409b;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        String strD = cVar.f137408a.d(j2, targetCurrency.f306286a);
        dj0.d dVar2 = new dj0.d(j2, targetCurrency);
        String string = u80.o.b(new u80.g(dVar2, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        hrf.f fVar = cVar.e.f77456b;
        int i2 = fr8.b.f137407a[fVar.ordinal()];
        if (i2 == 1) {
            clauseB = ((d91.b) aVar).b(AccountId.Personal.f51414a, pocket);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            if (pocket.f163148g == io3.j.SHARED) {
                clauseB = new TextLocalisedClause(com.revolut.feature.account_name.impl.R$string.account_name_internal_destination_joint, null, null, 14);
            } else {
                io3.l lVar2 = pocket.e;
                if (lVar2 == io3.l.CURRENT) {
                    clauseB = new TextLocalisedClause(com.revolut.feature.account_name.impl.R$string.account_name_internal_destination_current, null, null, 14);
                } else if (lVar2 == io3.l.MERCHANT) {
                    clauseB = new TextLocalisedClause(com.revolut.feature.account_name.impl.R$string.account_name_internal_destination_pro, null, null, 14);
                } else if (lVar2 == io3.l.SAVINGS) {
                    clauseB = new TextLocalisedClause(com.revolut.feature.account_name.impl.R$string.account_name_internal_destination_savings, u.c(new TextClause(pocket.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Using unsupported pocket for Internal destination");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    clauseB = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
            }
        }
        h3 h3Var = (fVar == hrf.f.OUTGOING && zA) ? h3.ERROR : h3.ACTIVE_NOT_CLICKABLE;
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, new bw0.h(strD, string, (TextClause) null, true, ((ppf.c) cVar.f137410c).f238600b, Boolean.TRUE, (List) cVar.d.a(dVar2), false, false, false, false, bw0.e.SuggestionsWhenTextEmptyElseCalculator, (Clause) null, false, 30596), new f3(new CurrencyImage(pocket.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), clauseB, new MoneyClause(io3.h.e(pocket), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), false, h3Var, false), null, null, null, false, false, targetCurrency, null, 1506);
        String note = lVar.f137417b;
        Intrinsics.checkNotNullParameter(note, "note");
        InputTextDelegate.Model modelE = InputTextDelegate.Model.e(yof.d.a(cVar.f137410c, note, new TextLocalisedClause(com.revolut.feature.junior_transfer.impl.R$string.junior_transfer_note_hint, null, null, 14), null, 0, false, new InputFilter.LengthFilter(140), null, null, 220), null, new ResourceImage(R$drawable.uikit_icn_20_keyboard_sticker, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), -4097);
        yp0.b.l(modelE, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        String gifUrl = lVar.f137418c;
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        koi.j[] elements = {model, modelE, kotlin.text.d0.W(gifUrl) ? null : new zp(new UrlImage(gifUrl, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, null, 16, null, 128, 47), null, null, false, false, 507902))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        hrf.f fVar2 = juniorTransferAmountScreenContract$InputData.f77456b;
        int[] iArr = fr8.s.f137440a;
        int i3 = iArr[fVar2.ordinal()];
        if (i3 == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_transfer.impl.R$string.junior_transfer_button_send, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_transfer.impl.R$string.junior_transfer_button_withdraw, null, null, 14);
        }
        fr8.k kVar = new fr8.k(textLocalisedClause, hVar2.b());
        boolean zA2 = hVar2.a();
        TextClause textClause = new TextClause(ta6.a.t(juniorBankingProfile), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i5 = iArr[fVar2.ordinal()];
        if (i5 == 1) {
            i = com.revolut.feature.junior_transfer.impl.R$string.junior_transfer_topup_balance_hint;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.junior_transfer.impl.R$string.junior_transfer_withdrawal_balance_hint;
        }
        return new fr8.o(listL, kVar, new fr8.m(textClause, new TextLocalisedClause(i, u.c(new MoneyClause(io3.h.e(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), (zA2 && fVar2 == hrf.f.INCOMING) ? new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254) : null, 8), new AvatarByUserIdImage(juniorBankingProfile.f77103j, ta6.a.t(juniorBankingProfile), 56.0f, rf8.a.f253707a, 40), h5k.a.e()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.revolut.core.ui_kit.delegates.SelectableDelegate$Model] */
    /* JADX WARN: Type inference failed for: r15v5, types: [koi.j] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.revolut.core.ui_kit.delegates.SelectableDelegate$Model] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v33 */
    private final Object s(Object obj2, Object obj3, Object obj4) {
        fu6.m mVar;
        nr6.i customer;
        ?? r122;
        dj0.d dVar;
        int i;
        nr6.o oVar;
        String str;
        TextLocalisedClause textLocalisedClauseA;
        fu6.t tVar = (fu6.t) this.f131116b;
        fu6.i iVar = (fu6.i) this.f131117c;
        od0.i orderDetailsOptional = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(orderDetailsOptional, "orderDetailsOptional");
        if (!orderDetailsOptional.d()) {
            return new fu6.l(iii.c.b(null, null, 6, true));
        }
        nr6.k kVar = (nr6.k) orderDetailsOptional.c();
        nr6.b order = kVar.f218567a;
        MoneyClause moneyClauseC = qu6.b.c(order);
        dj0.d dVar2 = order.f218549s;
        c0 c0Var = order.d;
        nr6.e channel = order.e;
        Intrinsics.checkNotNullParameter(order, "order");
        fu6.m mVar2 = new fu6.m(moneyClauseC, new TextClause(order.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qu6.b.e(order, true), qu6.b.b(channel, true), qu6.b.a(c0Var));
        aim.e eVarB = u.b();
        hu6.a aVar = (hu6.a) tVar.f138107b;
        Data paymentDetailsData = iVar.d;
        Data accountDetailsData = iVar.f138088a;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(paymentDetailsData, "paymentDetailsData");
        Intrinsics.checkNotNullParameter(accountDetailsData, "accountDetailsData");
        a0.x((List) iii.c.f(paymentDetailsData, new hu1.h0(3), new ht1.l(4), new hb4.n(aVar, order, accountDetailsData)), eVarB);
        dj0.d equivalentAmount = kVar.f218568b;
        if (equivalentAmount != null) {
            Intrinsics.checkNotNullParameter(equivalentAmount, "equivalentAmount");
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIST_EQUIVALENT_AMOUNT", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_equivalent_to, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(equivalentAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        aim.e eVarB2 = u.b();
        Intrinsics.checkNotNullParameter(order, "order");
        CellDetailsDelegate.Model model2 = (c0Var == null || (textLocalisedClauseA = iu6.j.a(c0Var)) == null) ? null : new CellDetailsDelegate.Model("LIST_ID_STATUS", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_status, null, null, 14), textLocalisedClauseA, 0, null, null, null, null, null, false, 0, 0, 32760);
        if (model2 != null) {
            eVarB2.add(model2);
        }
        String str2 = order.f218537a;
        Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
        eVarB2.add(new CellDetailsDelegate.Model("LIST_ID_ORDER_ID", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_order_id_title, null, null, 14), new TextClause(str2, (Style) null, Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, 122), null, null, false, 0, null, new b0(str2), null, null, 1, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, 0, 0, 0, 0, 1035752));
        Intrinsics.checkNotNullParameter(order, "order");
        CellDetailsDelegate.Model model3 = (channel == nr6.e.INVOICE || (str = order.f218540g) == null) ? null : new CellDetailsDelegate.Model("LIST_ID_EXTERNAL_REFERENCE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_external_reference, null, null, 14), new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, 122), null, null, false, 0, null, new ru6.o(str), null, null, 1, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, 0, 0, 0, 0, 1035752);
        if (model3 != null) {
            eVarB2.add(model3);
        }
        ru6.e eVar = (ru6.e) tVar.f138108c;
        Intrinsics.checkNotNullParameter(order, "order");
        aim.e eVarB3 = u.b();
        if (channel != null) {
            mVar = mVar2;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_channel, null, null, 14);
            Intrinsics.checkNotNullParameter(channel, "channel");
            switch (iu6.i.f168522a[channel.ordinal()]) {
                case 1:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_channel_kind_card_reader;
                    break;
                case 2:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_kind_invoice_title;
                    break;
                case 3:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_kind_payment_link_title;
                    break;
                case 4:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_channel_kind_pos;
                    break;
                case 5:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_channel_kind_prestashop;
                    break;
                case 6:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_kind_qr_code_title;
                    break;
                case 7:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_channel_kind_shopify;
                    break;
                case 8:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_channel_kind_shopify;
                    break;
                case 9:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_kind_tap_to_pay;
                    break;
                case 10:
                    i = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_status_channel_kind_woocommerce;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            eVarB3.add(new CellDetailsDelegate.Model("LIST_ID_CHANNEL", textLocalisedClause, new TextLocalisedClause(i, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
            int i2 = ru6.d.f257449a[channel.ordinal()];
            if (i2 == 1) {
                nr6.q qVar = order.f218548r;
                if (qVar != null) {
                    eVarB3.add(new CellDetailsDelegate.Model("LIST_ID_CHANNEL_INVOICE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_kind_invoice_title, null, null, 14), new TextClause(qVar.f218579b, (Style) eVar.f257450a, (Integer) null, false, (o9) null, (List) null, 124), 0, new ru6.b(qVar), null, null, null, null, false, 0, 0, 32744));
                }
            } else if (i2 == 2 && (oVar = order.f218546p) != null) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_kind_payment_link_title, null, null, 14);
                String str3 = oVar.f218577b;
                if (str3 == null) {
                    str3 = "";
                }
                eVarB3.add(new CellDetailsDelegate.Model("LIST_ID_CHANNEL_LINK", textLocalisedClause2, new TextClause(str3, (Style) eVar.f257450a, (Integer) null, false, (o9) null, (List) null, 124), 0, new ru6.c(oVar), null, null, null, null, false, 0, 0, 32744));
            }
        } else {
            mVar = mVar2;
        }
        a0.x(u.a(eVarB3), eVarB2);
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        a0.x(eVarA, eVarB);
        ru6.p pVar = (ru6.p) tVar.e;
        Data lineItemsData = iVar.f138089b;
        Intrinsics.checkNotNullParameter(lineItemsData, "lineItemsData");
        a0.x((List) iii.c.f(lineItemsData, new rsl.c(29), new ru5.m(2), new rd3.x(pVar, 12)), eVarB);
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(paymentDetailsData, "paymentsData");
        ArrayList arrayList = new ArrayList();
        fu6.h hVar = (fu6.h) paymentDetailsData.getContent();
        if (hVar != null) {
            nr6.w wVar = hVar.f138086a;
            if (c0Var == c0.PARTIALLY_PAID) {
                ArrayList arrayList2 = wVar.f218587c;
                dj0.d dVar3 = wVar.d;
                if (arrayList2.isEmpty()) {
                    r122 = 0;
                    dVar = new dj0.d(0L, dVar3.f115083b);
                } else {
                    ArrayList arrayList3 = wVar.f218587c;
                    dj0.d.Companion.getClass();
                    dVar = dj0.d.e;
                    int i3 = 0;
                    for (Object obj5 : arrayList3) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            v.s();
                            throw null;
                        }
                        dVar = i3 == 0 ? ((AcquiringPaymentFee) obj5).f73365a : pyd.c.O(dVar, ((AcquiringPaymentFee) obj5).f73365a);
                        i3 = i5;
                    }
                    r122 = 0;
                }
                arrayList.add(new CellDetailsDelegate.Model("LIST_ID_UNPAID_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_order_summary_unpaid, r122, r122, 14), new MoneyClause(pyd.c.H(pyd.c.H(dVar2, dVar3), dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
        }
        aim.e eVarB4 = u.b();
        dj0.d dVar4 = order.f218551w;
        if (dVar4 != null) {
            eVarB4.add(new CellDetailsDelegate.Model("LIST_ID_SUB_TOTAL_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_order_details_subtotal, null, null, 14), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        dj0.d dVar5 = order.v;
        if (dVar5 != null) {
            eVarB4.add(new CellDetailsDelegate.Model("LIST_ID_DISCOUNTED_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_order_summary_discount, null, null, 14), new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        dj0.d dVar6 = order.f218552x;
        if (dVar6 != null) {
            eVarB4.add(new CellDetailsDelegate.Model("LIST_ID_TAX_TOTAL_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_order_summary_tax, null, null, 14), new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        dj0.d dVar7 = order.f218553y;
        if (dVar7 != null) {
            eVarB4.add(new CellDetailsDelegate.Model("LIST_ID_SERVICE_CHARGE_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_order_summary_service_charge, null, null, 14), new MoneyClause(dVar7, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        eVarB4.add(new CellDetailsDelegate.Model("LIST_ID_TOTAL_AMOUNT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_fee_breakdown_total, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        aim.e eVarA2 = u.a(eVarB4);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        a0.x(zhm.d0.E0(arrayList, eVarA2), eVarB);
        String description = order.f218541h;
        if (description != null) {
            Intrinsics.checkNotNullParameter(description, "description");
            CellDetailsNoteDelegate.Model model4 = new CellDetailsNoteDelegate.Model("LIST_ID_DESCRIPTION", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_description, null, null, 14), null, new TextClause(description, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model4);
        }
        List list = order.f218543l;
        if (list != null && (customer = (nr6.i) zhm.d0.d0(list)) != null) {
            String str4 = customer.f218563b;
            jw6.d dVar8 = ((ru6.k) tVar.d).f257453a;
            Intrinsics.checkNotNullParameter(customer, "customer");
            aim.e eVarB5 = u.b();
            String str5 = customer.d;
            String str6 = customer.f218564c;
            if ((str4 != null && !kotlin.text.d0.W(str4)) || ((str6 != null && !kotlin.text.d0.W(str6)) || (str5 != null && !kotlin.text.d0.W(str5)))) {
                eVarB5.add(new ListSubheaderDelegate.Model("LIST_ID_CUSTOMER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_customer_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                aim.e eVarB6 = u.b();
                if (str4 != null) {
                    eVarB6.add(dVar8.b(str4));
                }
                if (str6 != null) {
                    eVarB6.add(dVar8.a(str6));
                }
                if (str5 != null) {
                    eVarB6.add(dVar8.c(str5));
                }
                aim.e eVarA3 = u.a(eVarB6);
                yp0.b.k(eVarA3, 0, 0, 0, 0, 31);
                a0.x(eVarA3, eVarB5);
            }
            a0.x(u.a(eVarB5), eVarB);
        }
        String customerNote = order.f218542j;
        if (customerNote != null) {
            Intrinsics.checkNotNullParameter(customerNote, "customerNote");
            CellDetailsNoteDelegate.Companion companion = CellDetailsNoteDelegate.INSTANCE;
            CellDetailsNoteDelegate.Model model5 = new CellDetailsNoteDelegate.Model("LIST_ID_CUSTOMER_NOTE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_customer_note_title, null, null, 14), null, null, null, false, null, null, null, null, null, 0, 131060);
            List listC = u.c(new CellDetailsStandaloneNoteDelegate.Model("LIST_ID_CUSTOMER_NOTE_VALUE", new ru6.i(customerNote), new TextClause(customerNote, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, null, 0, 0, 1992));
            companion.getClass();
            ArrayList arrayListA = CellDetailsNoteDelegate.Companion.a(model5, listC);
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            a0.x(arrayListA, eVarB);
        }
        List customFields = order.k;
        if (customFields != null) {
            Intrinsics.checkNotNullParameter(customFields, "customFields");
            aim.e eVarB7 = u.b();
            int i6 = 0;
            for (Object obj6 : customFields) {
                int i21 = i6 + 1;
                if (i6 < 0) {
                    v.s();
                    throw null;
                }
                nr6.g gVar = (nr6.g) obj6;
                CellDetailsNoteDelegate.Companion companion2 = CellDetailsNoteDelegate.INSTANCE;
                CellDetailsNoteDelegate.Model model6 = new CellDetailsNoteDelegate.Model(a0.d.n("LIST_ID_CUSTOM_FIELD_", i6), new TextClause(gVar.f218558a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, null, null, null, 0, 131060);
                String strN = a0.d.n("LIST_ID_CUSTOM_FIELD_NOTE_", i6);
                TextClause textClause = new TextClause(gVar.f218559b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                String value = gVar.f218559b;
                Intrinsics.checkNotNullParameter(value, "value");
                List listC2 = u.c(new CellDetailsStandaloneNoteDelegate.Model(strN, new ru6.g(value), textClause, null, resourceImage, true, null, 0, 0, 1992));
                companion2.getClass();
                ArrayList arrayListA2 = CellDetailsNoteDelegate.Companion.a(model6, listC2);
                yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
                a0.x(arrayListA2, eVarB7);
                i6 = i21;
            }
            a0.x(u.a(eVarB7), eVarB);
        }
        ru6.w wVar2 = (ru6.w) tVar.f;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(paymentDetailsData, "paymentDetailsData");
        List listD = (List) iii.c.f(paymentDetailsData, new ru6.r(0), new ru5.m(3), new rbe.c(order, wVar2, 13));
        yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
        int i22 = R$attr.uikit_dp8;
        int i32 = R$attr.uikit_dp16;
        if (!listD.isEmpty()) {
            listD = yp0.b.d(listD, new ListSubheaderDelegate.Model("LIST_ID_PAYMENTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_payment_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i22, i22, i32, i32);
        }
        a0.x(listD, eVarB);
        return new fu6.k(mVar, u.a(eVarB));
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        fui.j jVar = (fui.j) this.f131116b;
        fui.e eVar = (fui.e) this.f131117c;
        CheckoutRevPayControllerExtensionContract$CheckoutPrice price = (CheckoutRevPayControllerExtensionContract$CheckoutPrice) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(price, "price");
        return RowDelegate.Model.x(dec.q.c(jVar.f138225a, eVar.f138217a, true, ofm.q.c(eVar, price.f98824b) ? dec.o.DEFAULT : dec.o.INSUFFICIENT_FUNDS, false, 24), null, null, null, null, null, 0, null, false, null, price.f98825c, 0, 0, 0, 0, null, -4194305, 15);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) throws Throwable {
        Data data;
        int i;
        TextLocalisedClause textLocalisedClause;
        cul.v vVar = (cul.v) this.f131116b;
        twg.c cVar = (twg.c) this.f131117c;
        nel.n instrument = (nel.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Data data2 = vVar.N;
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((TradingLegalEntityInformation) content).f105106a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        hel.b bVar = (hel.b) data.getContent();
        wul.o oVar = ((ful.j) cVar.f275019c).f138294a;
        bfl.g tradeSide = vVar.f109175a;
        k4l.r0 orderType = vVar.f109176b;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        switch (bVar == null ? -1 : ful.i.f138291a[bVar.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                int i2 = ful.i.f138292b[orderType.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    Clause clauseB = ful.j.b(instrument, orderType);
                    int i3 = ful.i.f138293c[tradeSide.ordinal()];
                    if (i3 == 1) {
                        i = com.revolut.retail.wealth.resources.R$string.wealth_stock_buy_title;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.retail.wealth.resources.R$string.wealth_stock_sell_title;
                    }
                    textLocalisedClause = new TextLocalisedClause(i, u.c(clauseB), null, 12);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = oVar.l(tradeSide, orderType, ful.j.b(instrument, orderType), null, instrument.f214597c);
                }
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                textLocalisedClause = oVar.l(tradeSide, orderType, ful.j.b(instrument, orderType), null, instrument.f214597c);
                break;
        }
        return ful.j.c(textLocalisedClause, tradeSide);
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        fv4.u uVar = (fv4.u) this.f131116b;
        fv4.f fVar = (fv4.f) this.f131117c;
        fv4.e content = (fv4.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        String str = fVar.f138326b;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        fv4.p pVarA = uVar.a(content.f138324b);
        List<vl4.i> list = content.f138323a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (vl4.i iVar : list) {
            String string = iVar.f290264b.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(new com.revolut.core.ui_kit.views.q(string, new com.revolut.core.ui_kit.views.t(new TimeClause(oc.c.F(iVar.f290263a), new TimeClause.Format.MonthAndYear(ka.SHORT, la.SHORT), null, null, 12)), 58));
        }
        return new fv4.q(pVarA, new fv4.o(str, arrayList));
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        List listA;
        ListSubheaderDelegate.Model model;
        RowDelegate.Model modelA;
        fwc.j jVar = (fwc.j) this.f131116b;
        ac4.g gVar = (ac4.g) this.f131117c;
        fwc.i combinedContent = (fwc.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(combinedContent, "combinedContent");
        List limits = combinedContent.f138604a;
        List<WalletLimit.CounterLimit> walletLimits = combinedContent.f138605b;
        TransactionsLimitsScreenContract$LimitFlowType limitType = jVar.f138607b;
        if (limitType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        hwc.g gVar2 = (hwc.g) gVar.f3032c;
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(limits, "limits");
        if (limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.Singapore) {
            listA = gVar2.b(limits, limitType);
            yp0.b.k(listA, 0, 0, 0, 0, 31);
        } else if (limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj5 : limits) {
                cuc.e eVar = ((OutboundTransactionLimit) obj5).f85480j;
                Object arrayList = linkedHashMap.get(eVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(eVar, arrayList);
                }
                ((List) arrayList).add(obj5);
            }
            aim.e eVarB = u.b();
            TransactionsLimitsScreenContract$LimitFlowType.SepaExtended sepaExtended = (TransactionsLimitsScreenContract$LimitFlowType.SepaExtended) limitType;
            gVar2.a(eVarB, (List) linkedHashMap.get(cuc.e.CARD), sepaExtended, new ListSubheaderDelegate.Model("CARD_LIMIT_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_card_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            gVar2.a(eVarB, (List) linkedHashMap.get(cuc.e.ATM), sepaExtended, new ListSubheaderDelegate.Model("ATM_LIMIT_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_atm_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            gVar2.a(eVarB, (List) linkedHashMap.get(cuc.e.TOP_UP), sepaExtended, new ListSubheaderDelegate.Model("TOP_UP_LIMIT_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_top_up_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            gVar2.a(eVarB, (List) linkedHashMap.get(cuc.e.TRANSFER), sepaExtended, new ListSubheaderDelegate.Model("TRANSFER_LIMIT_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_transfer_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            gVar2.a(eVarB, (List) linkedHashMap.get(cuc.e.SEPA_INSTANT), sepaExtended, new ListSubheaderDelegate.Model("SEPA_INSTANT_LIMIT_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_section_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) ListSubheaderDelegate.Model.a.C0411a.f52724a, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458));
            gVar2.a(eVarB, (List) linkedHashMap.get(cuc.e.BALANCE), sepaExtended, new ListSubheaderDelegate.Model("BALANCE_LIMIT_SUBHEADER_LIST_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_balance_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            listA = u.a(eVarB);
        } else {
            if (!(limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.WalletLimits)) {
                throw new NoWhenBranchMatchedException();
            }
            listA = f0.f322471a;
        }
        hwc.j jVar2 = (hwc.j) gVar.f3031b;
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        if (limitType.equals(TransactionsLimitsScreenContract$LimitFlowType.Singapore.f85737a)) {
            model = new ListSubheaderDelegate.Model("OUTBOUND_LIMIT_SECTION_TITLE_ITEM_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_cell_subheader_other_limits, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        } else {
            if (!(limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended) && !(limitType instanceof TransactionsLimitsScreenContract$LimitFlowType.WalletLimits)) {
                throw new NoWhenBranchMatchedException();
            }
            model = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (WalletLimit.CounterLimit counterLimit : walletLimits) {
            int i = hwc.i.f156129a[counterLimit.f94844a.ordinal()];
            if (i == 1) {
                modelA = jVar2.a("TRANSFER_DAILY_LIST_ITEM_ID", com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_cell_daily, R$drawable.uikit_icn_24_calendar_date, counterLimit);
            } else if (i == 2) {
                modelA = jVar2.a("TRANSFER_WEEKLY_LIST_ITEM_ID", com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_cell_weekly, R$drawable.uikit_icn_24_calendar_week, counterLimit);
            } else if (i != 3) {
                modelA = i != 4 ? i != 5 ? null : jVar2.a("YEARLY_OUTBOUND_LIMIT_LIST_ID", com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_cell_yearly, R$drawable.uikit_icn_24_calendar, counterLimit) : jVar2.a("WALLET_BALANCE_LIMIT_LIST_ID", com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_cell_wallet_balance, R$drawable.uikit_icn_24_wallet, counterLimit);
            } else {
                modelA = new RowDelegate.Model("MONETISATION_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_credit, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_jp_cell_monetisable_balance, null, null, 14), null, 0, rwc.b.a(counterLimit.f94846c), null, null, 0, null, false, null, false, null, null, null, null, null, null, counterLimit, null, 0, 0, 0, 0, 532676568);
            }
            if (modelA != null) {
                arrayList2.add(modelA);
            }
        }
        if (model != null) {
            arrayList2 = yp0.b.g(arrayList2, model, null, 0, 0, 126);
        } else {
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        }
        return new fwc.s(zhm.d0.E0(arrayList2, listA));
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        LargeActionButtonDelegate.Model model;
        aim.e eVar;
        FullScreenStateDelegate.Model model2;
        boolean z;
        CircleBadgeModel inactiveCircleBadge;
        CircleBadgeModel circleBadgeModel;
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        PurchasedTransitTicket.Activated activated;
        nvf.o oVar;
        TextLocalisedClause textLocalisedClauseB;
        TextLocalisedClause textLocalisedClause3;
        fwf.u uVar = (fwf.u) this.f131116b;
        fwf.f fVar = (fwf.f) this.f131117c;
        fwf.g content = (fwf.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        LocalDateTime now = fVar.f138621b;
        nvf.c cVar = uVar.f138637a;
        ArrayList arrayList = content.f138622a;
        ArrayList arrayList2 = content.f138623b;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : arrayList) {
            PurchasedTransitTicketValidity purchasedTransitTicketValidity = ((PurchasedTransitTicket.Activated) obj5).f92643t;
            purchasedTransitTicketValidity.getClass();
            Intrinsics.checkNotNullParameter(now, "now");
            if (purchasedTransitTicketValidity.f92701a.isAfter(now)) {
                arrayList3.add(obj5);
            } else {
                arrayList4.add(obj5);
            }
        }
        List<PurchasedTransitTicket.Activated> listP0 = zhm.d0.P0(arrayList4, new fwf.p());
        ArrayList arrayList5 = new ArrayList(w.t(listP0, 10));
        for (PurchasedTransitTicket.Activated ticket : listP0) {
            nvf.o oVar2 = cVar.f219585a;
            Intrinsics.checkNotNullParameter(ticket, "ticket");
            Intrinsics.checkNotNullParameter(now, "now");
            ruf.g gVarA = ruf.h.a(ticket, oi0.d.R(now));
            int i = gVarA.f257550c;
            String str = ticket.f92630a;
            String strQ = j6.a.q("ACTIVE_TOP_", str);
            TextClause textClause = new TextClause(ticket.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            CompositeClause compositeClauseA = nvf.a.a(ticket);
            TextClause textClauseB = nvf.a.b(ticket.f92634h);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(ruf.d.a(ticket.e), null, ProgressStyle.Companion.c(ProgressStyle.INSTANCE, gVarA.f257549b, i), false, null, false, 56);
            Intrinsics.checkNotNullParameter(ticket, "ticket");
            Intrinsics.checkNotNullParameter(now, "now");
            k.a aVarC = ruf.k.c(ticket.f92643t.f92702b, now);
            if (aVarC instanceof ruf.i) {
                activated = ticket;
                textLocalisedClauseB = ruf.k.a(i, ((ruf.i) aVarC).f257551a);
                oVar = oVar2;
            } else {
                activated = ticket;
                if (aVarC instanceof ruf.j) {
                    oVar = oVar2;
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_details_time_time_left_accessory_left, u.c(new TextLocalisedQuantityClause(R$plurals.transport_ticket_details_time_time_left_days, Long.valueOf(((ruf.j) aVarC).f257552a), (List) null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 12)), new Custom(Integer.valueOf(i), false, null, false, null, 254), 8);
                } else {
                    oVar = oVar2;
                    if (aVarC instanceof ruf.l) {
                        textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_details_time_time_left_accessory_left, u.c(new TextLocalisedQuantityClause(R$plurals.transport_ticket_details_time_time_left_hours, Long.valueOf(((ruf.l) aVarC).f257554a), (List) null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 12)), new Custom(Integer.valueOf(i), false, null, false, null, 254), 8);
                    } else {
                        if (!aVarC.equals(k.a.C1426a.f257553a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClauseB = ruf.k.b(i);
                    }
                }
                textLocalisedClauseB = textLocalisedClause3;
            }
            RowDelegate.Model model3 = new RowDelegate.Model(strQ, image40, textClause, null, 0, compositeClauseA, textClauseB, null, 0, new RowDelegate.Model.c.b(textLocalisedClauseB, null, null, false, 126), false, null, false, null, null, null, null, null, null, activated, null, 0, R$attr.uikit_dp0, 0, 0, 499121048);
            PurchasedTransitTicket.Activated activated2 = activated;
            QRCodeDelegate.Model model4 = new QRCodeDelegate.Model(j6.a.q("ACTIVE_BOTTOM_", str), nvf.o.a(activated2.f92636l.f92599b), oVar.b(activated2.f92642s), null, null, activated2, 0, 0, 0, 0, 32472);
            int i2 = R$attr.uikit_dp16;
            int i3 = R$attr.uikit_dp0;
            yp0.b.p(model4, i2, i2, i3, i3);
            List listK = v.k(model3, model4);
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            arrayList5.add(listK);
        }
        ArrayList arrayListU = w.u(arrayList5);
        List listP02 = zhm.d0.P0(content.f138624c, new fwf.q());
        ArrayList arrayList6 = new ArrayList(w.t(listP02, 10));
        for (Iterator it9 = listP02.iterator(); it9.hasNext(); it9 = it9) {
            PurchasedTransitTicket.Pending ticket2 = (PurchasedTransitTicket.Pending) it9.next();
            Intrinsics.checkNotNullParameter(ticket2, "ticket");
            arrayList6.add(new RowDelegate.Model(j6.a.q("PENDING_ID_", ticket2.f92670a), new RowDelegate.Model.MainImage.Image40(ruf.d.a(ticket2.e), null, null, false, null, false, 60), new TextClause(ticket2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, nvf.a.a(ticket2), nvf.a.b(ticket2.f92674h), null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_details_status_pending, null, null, 14), null, null, false, 126), false, null, false, null, null, null, null, null, null, ticket2, null, 0, 0, 0, 0, 532675480));
        }
        List listP03 = zhm.d0.P0(arrayList3, new fwf.r());
        ArrayList arrayList7 = new ArrayList(w.t(listP03, 10));
        Iterator it10 = listP03.iterator();
        while (it10.hasNext()) {
            PurchasedTransitTicket.Activated ticket3 = (PurchasedTransitTicket.Activated) it10.next();
            Intrinsics.checkNotNullParameter(ticket3, "ticket");
            Intrinsics.checkNotNullParameter(now, "now");
            String strQ2 = j6.a.q("PURCHASED_ID_", ticket3.f92630a);
            TextClause textClause2 = new TextClause(ticket3.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            CompositeClause compositeClauseA2 = nvf.a.a(ticket3);
            RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(ruf.d.a(ticket3.e), null, null, false, null, false, 60);
            LocalDateTime validFrom = ticket3.f92643t.f92701a;
            Intrinsics.checkNotNullParameter(validFrom, "validFrom");
            Intrinsics.checkNotNullParameter(now, "now");
            Duration durationBetween = Duration.between(now, validFrom);
            if (durationBetween.toDays() > 15) {
                int i5 = com.revolut.feature.transport.api.R$string.transport_ticket_details_time_time_until_accessory_label_from;
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                it8 = it10;
                Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
                textLocalisedClause = new TextLocalisedClause(i5, u.c(new TimeClause(oi0.d.Q(validFrom, zoneIdSystemDefault), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
            } else {
                it8 = it10;
                if (durationBetween.toDays() > 0) {
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_details_time_time_until_accessory_label_short, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, 0, (int) durationBetween.toDays(), 0, 0, 0, 59), null)), null, 12);
                } else if (durationBetween.toHours() > 1) {
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_details_time_time_until_accessory_label_short, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, 0, 0, (int) durationBetween.toHours(), 0, 0, 55), null)), null, 12);
                } else if (durationBetween.toMinutes() > 0) {
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_ticket_details_time_time_until_accessory_label_short, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, 0, 0, 0, (int) durationBetween.toMinutes(), 0, 47), null)), null, 12);
                } else {
                    textLocalisedClause = null;
                }
                textLocalisedClause = textLocalisedClause2;
            }
            arrayList7.add(new RowDelegate.Model(strQ2, image402, textClause2, null, 0, compositeClauseA2, null, null, 0, new RowDelegate.Model.c.b(textLocalisedClause, null, null, false, 126), false, null, false, null, null, null, null, null, null, ticket3, null, 0, 0, 0, 0, 532675544));
            it10 = it8;
        }
        List<PurchasedTransitTicket.ToBeActivated> listP04 = zhm.d0.P0(arrayList2, new fwf.s());
        ArrayList arrayList8 = new ArrayList(w.t(listP04, 10));
        for (PurchasedTransitTicket.ToBeActivated ticket4 : listP04) {
            Intrinsics.checkNotNullParameter(ticket4, "ticket");
            Intrinsics.checkNotNullParameter(now, "now");
            com.revolut.feature.transport.models.transit.d status = ticket4.a(now);
            Clause clauseD = nvf.a.d(status);
            if (clauseD == null) {
                clauseD = nvf.a.b(ticket4.f92686h);
            }
            Clause clause = clauseD;
            TextLocalisedClause textLocalisedClauseC = nvf.a.c(status);
            Intrinsics.checkNotNullParameter(status, "status");
            boolean z3 = status instanceof com.revolut.feature.transport.models.transit.a;
            LocalDateTime localDateTime = now;
            if (z3 || (status instanceof com.revolut.feature.transport.models.transit.c)) {
                z = true;
            } else {
                if (!(status instanceof com.revolut.feature.transport.models.transit.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            pf pfVar = new pf(textLocalisedClauseC, null, null, z, null, null, 502);
            String strQ3 = j6.a.q("PURCHASED_ID_", ticket4.f92682a);
            TextClause textClause3 = new TextClause(ticket4.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            CompositeClause compositeClauseA3 = nvf.a.a(ticket4);
            LayeredImage layeredImageA = ruf.d.a(ticket4.e);
            Intrinsics.checkNotNullParameter(status, "status");
            if (z3) {
                circleBadgeModel = null;
            } else {
                if (status instanceof com.revolut.feature.transport.models.transit.c) {
                    inactiveCircleBadge = new WarningCircleBadge(dw0.a.Suspicious);
                } else {
                    if (!(status instanceof com.revolut.feature.transport.models.transit.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    inactiveCircleBadge = new InactiveCircleBadge(dw0.a.Locked);
                }
                circleBadgeModel = inactiveCircleBadge;
            }
            arrayList8.add(new RowDelegate.Model(strQ3, new RowDelegate.Model.MainImage.Image40(layeredImageA, circleBadgeModel, null, false, null, false, 60), textClause3, null, 0, compositeClauseA3, clause, null, 0, pfVar, false, null, false, null, null, null, null, null, null, ticket4, null, 0, 0, 0, 0, 532675480));
            now = localDateTime;
        }
        aim.e eVarB = u.b();
        yp0.b.k(arrayList6, R$attr.uikit_dp16, 0, 0, 0, 30);
        eVarB.addAll(arrayList6);
        yp0.b.k(arrayList7, R$attr.uikit_dp16, 0, 0, 0, 30);
        eVarB.addAll(arrayList7);
        int i6 = R$attr.uikit_dp16;
        yp0.b.k(arrayList8, i6, i6, 0, 0, 28);
        eVarB.addAll(arrayList8);
        aim.e eVarA = u.a(eVarB);
        aim.e eVarB2 = u.b();
        eVarB2.addAll(content.d);
        eVarB2.addAll(content.e);
        List listP05 = zhm.d0.P0(u.a(eVarB2), new fwf.t());
        ListSubheaderDelegate.Model model5 = new ListSubheaderDelegate.Model("EXPIRED_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_hub_tab_tickets_section_expired_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        if (listP05.size() > 3) {
            fwf.e eVar2 = fwf.e.SEE_ALL_EXPIRED;
            model = new LargeActionButtonDelegate.Model(eVar2.name(), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_hub_tab_tickets_section_action_see_all, null, null, 14), false, null, null, eVar2, null, 744);
        } else {
            model = null;
        }
        List<PurchasedTransitTicket> listV0 = zhm.d0.V0(listP05, 3);
        ArrayList arrayList9 = new ArrayList();
        for (PurchasedTransitTicket purchasedTransitTicket : listV0) {
            RowDelegate.Model modelA = purchasedTransitTicket instanceof PurchasedTransitTicket.Expired ? cVar.a((PurchasedTransitTicket.Expired) purchasedTransitTicket) : purchasedTransitTicket instanceof PurchasedTransitTicket.NotPurchased ? cVar.b((PurchasedTransitTicket.NotPurchased) purchasedTransitTicket) : null;
            if (modelA != null) {
                arrayList9.add(modelA);
            }
        }
        if (arrayList9.isEmpty()) {
            eVar = null;
        } else {
            aim.e eVarB3 = u.b();
            eVarB3.addAll(arrayList9);
            if (model != null) {
                eVarB3.add(model);
            }
            aim.e eVarA2 = u.a(eVarB3);
            yp0.b.k(eVarA2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            eVar = eVarA2;
        }
        if (content.f138622a.isEmpty() && arrayList2.isEmpty()) {
            FullScreenStateDelegate.Model model6 = new FullScreenStateDelegate.Model("WIDGET_EMPTY_ID", new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_hub_tab_tickets_widget_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_hub_tab_tickets_widget_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D144", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
            yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
            model2 = model6;
        } else {
            model2 = null;
        }
        aim.e eVarB4 = u.b();
        if (model2 != null) {
            eVarB4.add(model2);
        }
        eVarB4.addAll(arrayListU);
        eVarB4.addAll(eVarA);
        if (eVar != null) {
            eVarB4.add(model5);
            eVarB4.addAll(eVar);
        }
        eVarB4.add(nvf.l.a());
        return u.a(eVarB4);
    }

    private final Object y(Object obj2, Object obj3, Object obj4) {
        fxc.p pVar;
        Iterator it8;
        Clause textLocalisedClause;
        int[] iArr;
        t61.g gVar;
        char c2;
        Clause clauseW;
        Image resourceImage;
        fxc.p pVar2 = (fxc.p) this.f131116b;
        fxc.i iVar = (fxc.i) this.f131117c;
        fxc.h content = (fxc.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f138791a;
        t61.g gVar2 = iVar.f138794b;
        wi0.b bVar = content.f138792b;
        boolean z = iVar.f138795c;
        aim.e eVarB = u.b();
        Boolean boolValueOf = null;
        if (list.isEmpty()) {
            eVarB.addAll(yp0.b.g(u.c(new RowDelegate.Model("no_cards-item", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D097", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_select_card_empty_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 532674552)), new ListSubheaderDelegate.Model("EXTERNAL_CARDS_SECTION_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_select_card_cards_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        } else {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                t61.g gVar3 = (t61.g) it9.next();
                boolean zF = Intrinsics.f(gVar3.f268137a, gVar2 != null ? gVar2.f268137a : boolValueOf);
                String strQ = j6.a.q("EXTERNAL_CARD_ID_PREFIX", gVar3.f268137a);
                boolean z3 = !zF;
                fxc.b bVar2 = pVar2.f138801b;
                n3i.b bVar3 = pVar2.f138800a;
                t61.j jVar = gVar3.f268142j;
                if (jVar != null) {
                    boolValueOf = Boolean.valueOf(kotlin.text.d0.W(tz4.d.l(jVar)));
                }
                if (Intrinsics.f(boolValueOf, Boolean.FALSE)) {
                    textLocalisedClause = new TextClause(tz4.d.l(jVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    pVar = pVar2;
                    it8 = it9;
                } else {
                    pVar = pVar2;
                    it8 = it9;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_select_card_undefined_bank_title, null, null, 14);
                }
                Clause clause = textLocalisedClause;
                bVar2.getClass();
                fxc.a aVarA = fxc.b.a(gVar3, bVar, z);
                int[] iArr2 = fxc.o.f138799a;
                int i = iArr2[aVarA.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        iArr = iArr2;
                        gVar = gVar2;
                        clauseW = yoj.b.w(yoj.b.w(new TextClause(bVar3.b("··", gVar3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_select_card_expired_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10));
                    } else if (i == 3) {
                        iArr = iArr2;
                        gVar = gVar2;
                        clauseW = yoj.b.w(yoj.b.w(new TextClause(bVar3.b("··", gVar3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_select_card_unavailable_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10));
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        clauseW = new TextClause(bVar3.b("··", gVar3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        iArr = iArr2;
                        gVar = gVar2;
                    }
                    c2 = '\n';
                } else {
                    iArr = iArr2;
                    gVar = gVar2;
                    c2 = '\n';
                    clauseW = yoj.b.w(yoj.b.w(new TextClause(bVar3.b("··", gVar3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null)), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_select_card_unverified_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
                }
                Image imageC = bVar3.c(jVar != null ? jVar.f268160c : null);
                if (zF) {
                    resourceImage = LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_check, R$attr.uikit_colorAccent, R$attr.uikit_colorBackground, null, 4.0f, 2.0f, null, 72);
                } else {
                    int i2 = iArr[fxc.b.a(gVar3, bVar, z).ordinal()];
                    if (i2 == 1) {
                        resourceImage = new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    } else if (i2 == 2 || i2 == 3) {
                        resourceImage = new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        resourceImage = null;
                    }
                }
                arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(imageC, resourceImage, null, false, 28), clause, null, 0, clauseW, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true), z3, null, false, null, null, null, null, null, null, gVar3, null, 0, 0, 0, 0, 532673496));
                pVar2 = pVar;
                it9 = it8;
                gVar2 = gVar;
                boolValueOf = null;
            }
            eVarB.addAll(yp0.b.g(arrayList, new ListSubheaderDelegate.Model("EXTERNAL_CARDS_SECTION_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_select_card_cards_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        return new fxc.m(u.a(eVarB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0788  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r81, java.lang.Object r82, java.lang.Object r83) {
        /*
            Method dump skipped, instruction units count: 3316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0e.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
