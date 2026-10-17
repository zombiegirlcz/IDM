package tpl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import aw0.o9;
import aw0.x8;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.internal.views.chart.SegmentedChartView;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BackgroundContentView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.card_screen.api.navigation.CardsListDestination;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardCreditLimitCap;
import com.revolut.feature.rev_points.giftcards.impl.ui.model.GiftCardPreview;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.transport.impl.validation.TicketQrCodeException;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.u40;
import ip0.v7;
import ip0.xp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import nii.z;
import ttl.a0;
import ttl.x;
import tx0.a1;
import tx0.u2;
import tx0.x0;
import tx0.x2;
import tx0.z0;
import tx0.z3;
import vkm.y;
import yhm.m;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f273429b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f273428a = i;
        this.f273429b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        ViewGroup.LayoutParams layoutParams;
        int i = this.f273428a;
        int i2 = 18;
        int i3 = 8;
        int i5 = 26;
        int i6 = 6;
        int i21 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i22 = 0;
        Object obj3 = this.f273429b;
        switch (i) {
            case 0:
                s sVar = (s) obj3;
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                sVar.H2(sVar.u, new nd8.l(it8, 9));
                return Boolean.FALSE;
            case 1:
                u uVar = (u) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = zhm.u.c(u.b());
                List listC2 = zhm.u.c(new xp(new CdnImage("revolut_document_passport_1", "mobile/sso/documents/backgrounds", null, null, null, null, Constants.TAG_FC_SPEED_MODE)));
                aim.e eVarB = zhm.u.b();
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    arrayList.add(new pb0(a0.d.n("BOTTOM_SHEET_LOADING_ITEM_", it9.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                IntRange intRange2 = new IntRange(4, 6, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange2, 10));
                vim.f it10 = intRange2.iterator();
                while (it10.f289625c) {
                    arrayList2.add(new pb0(a0.d.n("BOTTOM_SHEET_LOADING_ITEM_", it10.nextInt())));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList2);
                Unit unit = Unit.f186387a;
                return new n(listC, listC2, zhm.u.a(eVarB), uVar.f273438a.a());
            case 2:
                pcd.s it11 = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return nim.a.v(ijb.a.b(((tqg.a) obj3).i, it11.i().f234842b), new tpi.g(i21));
            case 3:
                tqg.i iVar = (tqg.i) obj3;
                qua.p recurringPayment = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                return !qua.u.h(recurringPayment, ((l80.f) iVar.f273564l).k()) ? new pfm.h(((yua.q) iVar.f273566n).f(recurringPayment.f249314a.f160150a), 4) : pfm.m.f235744a;
            case 4:
                zel.h it12 = (zel.h) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ((tqh.i) obj3).f273587n.a(it12.f321803b);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                tr4.p pVar = ((tr4.u) obj3).f273746b;
                aim.e eVarB2 = zhm.u.b();
                v7.C("id_instalment_confirmation_loading_transaction_header", R$attr.uikit_dp16, R$attr.uikit_dp8, 24, eVarB2);
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "id_instalment_confirmation_loading_transaction_item", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(pb0VarB);
                eVarB2.add(new gu("id_instalment_confirmation_loading_repayment_header", R$attr.uikit_dp16, R$attr.uikit_dp8, 24));
                List listK = v.k(new u40("id_instalment_confirmation_loading_repayment_item_1"), new u40("id_instalment_confirmation_loading_repayment_item_2"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                v7.C("id_instalment_confirmation_loading_details_header", R$attr.uikit_dp16, R$attr.uikit_dp8, 24, eVarB2);
                List listK2 = v.k(nb0.b(nb0Var, "id_instalment_confirmation_loading_details_item_1", false, 0, false, 30), nb0.b(nb0Var, "id_instalment_confirmation_loading_details_item_2", false, 0, false, 30), nb0.b(nb0Var, "id_instalment_confirmation_loading_details_item_3", false, 0, false, 30));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK2);
                return new tr4.q(pVar, zhm.u.a(eVarB2), tr4.n.f273739a);
            case 6:
                ty0.a it13 = (ty0.a) obj2;
                int i32 = ChartHeaderView.f56607l;
                Intrinsics.checkNotNullParameter(it13, "it");
                ((ChartHeaderView) obj3).e.onNext(it13);
                return Unit.f186387a;
            case 7:
                HistogramView histogramView = (HistogramView) obj3;
                float fFloatValue = ((Float) obj2).floatValue();
                HistogramView.Companion companion = HistogramView.INSTANCE;
                histogramView.setScaleAnimatorValue(fFloatValue);
                histogramView.invalidate();
                return Unit.f186387a;
            case 8:
                SegmentedChartView segmentedChartView = (SegmentedChartView) obj3;
                float fFloatValue2 = ((Float) obj2).floatValue();
                SegmentedChartView.Companion aVar = SegmentedChartView.INSTANCE;
                segmentedChartView.setScaleAnimatorValue(fFloatValue2);
                segmentedChartView.invalidate();
                return Unit.f186387a;
            case 9:
                ts1.u uVar2 = (ts1.u) obj3;
                uVar2.l2(new rf9.h(i3, objArr == true ? 1 : 0, uVar2, ((Boolean) obj2).booleanValue()), new yi5.b(i5));
                return Unit.f186387a;
            case 10:
                ts5.p pVar2 = (ts5.p) obj3;
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                if (!it14.isEmpty()) {
                    return pVar2.b(new CardsListDestination(new CardListPreSelectedVariant.Tab(n63.c.CRYPTO), b93.d.CRYPTO, 1));
                }
                pfm.h hVar = new pfm.h(new rzc.b(pVar2, u0.b(new FeatureCommand(new CardOrderNewFeatureConfig(SelectedTab.CRYPTO, null, null, null, null, false, null, null, null, null, null, null, 16382))), i2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 11:
                tse.i iVar2 = (tse.i) obj3;
                List tickets = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                if (tickets.isEmpty()) {
                    return new go.g(r0.g(), 2);
                }
                List<TicketDetails> list2 = tickets;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                for (TicketDetails ticketDetails : list2) {
                    arrayList3.add(new tse.c(vkm.q.q(new y(new tqh.j(ticketDetails, objArr2 == true ? 1 : 0, i6), vkm.q.Q(new tse.c(vkm.q.J(vkm.q.q(iVar2.f274114t), iVar2.f274113s), ticketDetails, i22), new tik.b((Continuation) (objArr3 == true ? 1 : 0), (Object) iVar2, i6)))), ticketDetails, i21));
                }
                return new j23.b((Flow[]) d0.d1(arrayList3).toArray(new Flow[0]), i5);
            case 12:
                return Boolean.valueOf(((Boolean) obj2).booleanValue() && ((jte.d) ((tt4.s) obj3).f274231r).c(CreditCardApi$Toggles$CreditCardCreditLimitCap.f68681c));
            case 13:
                ttl.g update = (ttl.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ttl.g.a(update, (k4l.k) obj3, null, null, 6);
            case 14:
                x xVar = (x) obj3;
                InstrumentTicker instrumentTicker = (InstrumentTicker) obj2;
                Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
                return new t38.e(xVar.getState().B(new tsk.j(i3)), i3, xVar, instrumentTicker);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return (List) ((a0) obj3).f274441b.getValue();
            case 16:
                tu2.h hVar2 = (tu2.h) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                ((pu2.e) hVar2.f274527s).getClass();
                yji.l.a1(hVar2, hVar2.X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 4)), null, null, new tk5.c(hVar2, objArr4 == true ? 1 : 0, 16), 3);
                return Boolean.TRUE;
            case 17:
                tv4.o oVar = (tv4.o) obj3;
                vl4.g statement = (vl4.g) obj2;
                Intrinsics.checkNotNullParameter(statement, "statement");
                return nim.a.v(oVar.f274710q.F(oVar.o.f69709a, statement.i, statement.f290260s, null), new o(statement, i2));
            case 18:
                vl4.g gVar = (vl4.g) obj3;
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : transactions) {
                    LocalDate localDateA = ((sv4.i) obj4).a();
                    Object objU = linkedHashMap.get(localDateA);
                    if (objU == null) {
                        objU = h30.l.u(linkedHashMap, localDateA);
                    }
                    ((List) objU).add(obj4);
                }
                return new tv4.d(gVar.f290248a, gVar.f290251g, gVar, linkedHashMap);
            case 19:
                com.revolut.feature.transport.impl.ui.activation.flow.a aVar2 = (com.revolut.feature.transport.impl.ui.activation.flow.a) obj3;
                ly.h result = (ly.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ly.d) {
                    aVar2.L2(((ly.d) result).f200610a);
                } else {
                    if (!(result instanceof ly.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xv.l lVar = ((ly.g) result).getMetadata().f147024a;
                    if (lVar instanceof dx.q) {
                        String str = ((dx.q) lVar).f120512b.f120508a.f51390a;
                        if (str == null) {
                            aVar2.L2(new TicketQrCodeException.NoValue());
                        } else if (((Boolean) aVar2.u.getValue()).booleanValue()) {
                            aVar2.l2(new tvf.g(aVar2, str, null), new yi5.b(i5));
                        } else {
                            aVar2.K2();
                        }
                    } else {
                        aVar2.L2(new TicketQrCodeException.UnsupportedResult());
                    }
                }
                return Unit.f186387a;
            case 20:
                twb.l update2 = (twb.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return twb.l.a(update2, null, null, null, null, false, false, ((uvb.c) ((uvb.e) obj3)).f283348a.f274742b, 191);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                GiftCardPreview giftCardPreview = ((twb.l) obj3).f274990h;
                IntRange intRange3 = new IntRange(0, 3, 1);
                ArrayList arrayList4 = new ArrayList(w.t(intRange3, 10));
                vim.f it15 = intRange3.iterator();
                while (it15.f289625c) {
                    arrayList4.add(nb0.b(pb0.Companion, a0.d.n("SECTION_LOADING_PREFIX", it15.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return giftCardPreview != null ? new twb.r(new twb.n(new TextClause(giftCardPreview.f83696a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), f0.f322471a), i2b.a.o(twb.h0.d(giftCardPreview.f83697b, null, null, null), arrayList4)) : new twb.r(twb.p.f274994a, arrayList4);
            case 22:
                com.revolut.camerakit.revolut.ui.barcode.a aVar3 = (com.revolut.camerakit.revolut.ui.barcode.a) obj3;
                r7a.i permissionFlowOutput = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                if (!(permissionFlowOutput instanceof r7a.e) && !(permissionFlowOutput instanceof r7a.f)) {
                    if (permissionFlowOutput instanceof r7a.h) {
                        aVar3.J2();
                    } else {
                        if (!(permissionFlowOutput instanceof r7a.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        try {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            throw new IllegalStateException("Unhandled secondary click");
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th10) {
                            m.Companion companion3 = yhm.m.INSTANCE;
                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                        }
                    }
                }
                return Unit.f186387a;
            case 23:
                x8 x8Var = (x8) obj2;
                u2 u2Var = ((BackgroundContentView) obj3).d;
                if (u2Var != null) {
                    u2Var.a(x8Var.f10609a, x8Var.f10610b, x8Var.f10611c, x8Var.e);
                }
                return Unit.f186387a;
            case 24:
                ((BasicNavBar) obj3).o.onNext((com.revolut.core.ui_kit.views.navbar.e) obj2);
                return Unit.f186387a;
            case 25:
                MarketingPhotoHeaderContentView marketingPhotoHeaderContentView = (MarketingPhotoHeaderContentView) obj3;
                jv0.m mVar = (jv0.m) obj2;
                MarketingPhotoHeaderContentView.Companion aVar4 = MarketingPhotoHeaderContentView.INSTANCE;
                a1 a1Var = marketingPhotoHeaderContentView.f59252l;
                x0 x0Var = a1Var instanceof x0 ? (x0) a1Var : null;
                z0 z0Var = (x0Var == null || (list = x0Var.f275269b) == null) ? null : (z0) d0.e0(marketingPhotoHeaderContentView.f59253m, list);
                if ((z0Var != null ? z0Var.f275287b : null) != null) {
                    Intrinsics.h(mVar);
                    if (mVar instanceof jv0.o) {
                        jv0.o oVar2 = (jv0.o) mVar;
                        long j2 = oVar2.f178757c;
                        long j3 = oVar2.f178756b;
                        boolean z = oVar2.f178755a;
                        if (marketingPhotoHeaderContentView.f59259t != -1 || z || (j3 <= 0 && j2 >= 0)) {
                            marketingPhotoHeaderContentView.f59257r = z;
                            marketingPhotoHeaderContentView.f59259t = j2;
                            marketingPhotoHeaderContentView.f59258s = j3;
                            marketingPhotoHeaderContentView.c();
                        }
                    } else if (mVar instanceof jv0.p) {
                        marketingPhotoHeaderContentView.a();
                    }
                }
                return Unit.f186387a;
            case 26:
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) obj3;
                NavBarWithContainer.Companion companion4 = NavBarWithContainer.INSTANCE;
                Intrinsics.checkNotNullParameter((Configuration) obj2, "it");
                View view = navBarWithContainer.F;
                if (view != 0 && (view instanceof x2) && (layoutParams = view.getLayoutParams()) != null) {
                    Context context = navBarWithContainer.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ViewGroup.LayoutParams layoutParamsN = ((x2) view).N(context);
                    if (layoutParams.width != layoutParamsN.width || layoutParams.height != layoutParamsN.height) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams2.width = layoutParamsN.width;
                        layoutParams2.height = layoutParamsN.height;
                        view.setLayoutParams(layoutParams2);
                    }
                }
                return Unit.f186387a;
            case 27:
                ObjectCarouselNavBarContentView objectCarouselNavBarContentView = (ObjectCarouselNavBarContentView) obj3;
                ObjectCarouselNavBarContentView.Companion aVar5 = ObjectCarouselNavBarContentView.INSTANCE;
                int i33 = ((z3) obj2).f275295a;
                objectCarouselNavBarContentView.c(i33);
                objectCarouselNavBarContentView.f59423a.onNext(Integer.valueOf(i33));
                objectCarouselNavBarContentView.b();
                return Unit.f186387a;
            case 28:
                Drawable drawable = (Drawable) obj2;
                WallpaperView wallpaperView = ((ScrollerNavBarContentView) obj3).f;
                if (wallpaperView != null) {
                    wallpaperView.setAverageColorAsBackground(drawable);
                }
                return Unit.f186387a;
            default:
                StoryNavBarContentView storyNavBarContentView = (StoryNavBarContentView) obj3;
                int iIntValue = ((Integer) obj2).intValue();
                if (storyNavBarContentView.i && iIntValue != storyNavBarContentView.f59476c) {
                    if (iIntValue >= storyNavBarContentView.e.f319395l.size()) {
                        storyNavBarContentView.f59476c = 0;
                        storyNavBarContentView.post(new t70.x(storyNavBarContentView, 13));
                    } else {
                        storyNavBarContentView.f59476c = iIntValue;
                        storyNavBarContentView.f59475b.c(iIntValue, 5000L);
                        storyNavBarContentView.f59474a.smoothScrollToPosition(storyNavBarContentView.f59476c);
                    }
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ o(twb.h0 h0Var, twb.l lVar) {
        this.f273428a = 21;
        this.f273429b = lVar;
    }
}
