package hul;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.R$string;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreen;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;
import yhm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InvestOrderReviewScreen f155715w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InvestOrderReviewScreen investOrderReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155715w = investOrderReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f155715w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f155715w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f155715w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((sa) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i;
        Integer numValueOf;
        TextLocalisedClause textLocalisedClause;
        int i2 = this.u;
        InvestOrderReviewScreen investOrderReviewScreen = this.f155715w;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i2) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = investOrderReviewScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) pVarE3;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                String str = clickData.f275445a;
                if (Intrinsics.f(obj3, "US_DISCLOSURES_PARCEL")) {
                    oVar.B.getClass();
                    oVar.C1(u0.c(DisclosuresFeatureConfig.TradingDisclosuresFeatureConfig.f95197a));
                } else if (Intrinsics.f(obj3, k.f155737a)) {
                    oki.h.v2(oVar.f106983h0, InvestOrderReviewScreenContract$ModalStep.OngoingFees.f106958a, ModalDestination.Style.POPUP.f98311a);
                } else if (obj3 instanceof l) {
                    oVar.A1(new f0(oVar, (l) obj3, null, 3), new yi5.b(25));
                } else if (Intrinsics.f(obj3, j.f155735a) && str.length() > 0) {
                    oVar.C1(new ExternalDestination.Browser(str, null));
                }
                return Unit.f186387a;
            case 1:
                Object obj4 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String f55860a = ((koi.j) obj4).getF52222a();
                Object f55862c = ((qv0.p) obj4).getF55191g();
                KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                if (Intrinsics.f(f55860a, "PRICE_ROW_ID")) {
                    p pVarE32 = investOrderReviewScreen.R2();
                    xul.e eVar = f55862c instanceof xul.e ? (xul.e) f55862c : null;
                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar2 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) pVarE32;
                    oVar2.getClass();
                    oVar2.n2(new f0(oVar2, eVar, null, 2), new whi.b(6));
                } else {
                    int i3 = 0;
                    if (Intrinsics.f(f55860a, "DAY_TRADES")) {
                        com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar3 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                        ((csl.n) oVar3.f106985p).getClass();
                        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_trading_orders_review_pdt_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_orders_review_pdt_description, null, null, 14), null, 28);
                        LargeActionButtonDelegate.Model modelA = esl.a.a(csl.n.c(), 0, R$attr.uikit_dp8, 13);
                        csl.l.Companion.getClass();
                        oVar3.A.x(new rp0.y(zhm.v.k(modelA, esl.a.a(new LargeActionButtonDelegate.Model("EXPANDABLE_DIALOG_LARGE_BUTTON_LEARN_MORE", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), false, null, null, null, null, 1000), R$attr.uikit_dp8, 0, 14)), tVar, null, null, null, null, 1020));
                    } else if (Intrinsics.f(f55860a, "SETTLEMENT_DATE_ID")) {
                        com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar4 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                        oVar4.getClass();
                        oVar4.n2(new g0(oVar4, null, 4), new whi.b(6));
                    } else {
                        int i5 = 1;
                        if (Intrinsics.f(f55860a, "LIST_ID_UNIFIED_FEE")) {
                            com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar5 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                            oVar5.getClass();
                            oVar5.n2(new h0(oVar5, f55862c, objArr2 == true ? 1 : 0, i5), new whi.b(6));
                        } else if (Intrinsics.f(f55860a, "TIME_IN_FORCE_ID")) {
                            com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar6 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                            csl.k kVar = oVar6.f106985p;
                            cli.y yVar = oVar6.g0;
                            ZonedDateTime expirationDate = ((h) ((j2) yVar.f22677a).getValue()).f155719a.k.f104647a;
                            r0 tradingOrderType = ((h) ((j2) yVar.f22677a).getValue()).f155719a.f106848b;
                            csl.n nVar = (csl.n) kVar;
                            nVar.getClass();
                            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
                            Intrinsics.checkNotNullParameter(tradingOrderType, "tradingOrderType");
                            oVar6.A.x(csl.n.d(nVar.b(expirationDate, tradingOrderType)));
                        } else if (Intrinsics.f(f55860a, "SHARES_ROW_ID")) {
                            xul.h sharesCellParcel = f55862c instanceof xul.h ? (xul.h) f55862c : null;
                            if (sharesCellParcel != null) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar7 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar7.getClass();
                                Intrinsics.checkNotNullParameter(sharesCellParcel, "sharesCellParcel");
                                csl.k kVar2 = oVar7.f106985p;
                                r0 orderType = ((h) ((j2) oVar7.g0.f22677a).getValue()).f155719a.f106848b;
                                ((csl.n) kVar2).getClass();
                                Intrinsics.checkNotNullParameter(orderType, "orderType");
                                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                int i6 = csl.m.f108544b[orderType.ordinal()];
                                if (i6 == 1) {
                                    textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                } else if (i6 == 2) {
                                    textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                } else {
                                    try {
                                        m.Companion companion = yhm.m.INSTANCE;
                                        throw new IllegalStateException(("Order type " + orderType + " is not supported.").toString());
                                    } catch (CancellationException e) {
                                        throw e;
                                    } catch (Throwable th10) {
                                        m.Companion companion2 = yhm.m.INSTANCE;
                                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                                        if (thA != null) {
                                            hx7.e.n(thA);
                                        }
                                        textLocalisedClause = null;
                                    }
                                }
                                oVar7.A.x(csl.n.d(new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28)));
                            }
                        } else if (Intrinsics.f(f55860a, "TOTAL_VALUE_ROW_ID")) {
                            xul.a amountCellParcel = f55862c instanceof xul.a ? (xul.a) f55862c : null;
                            if (amountCellParcel != null) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar8 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar8.getClass();
                                Intrinsics.checkNotNullParameter(amountCellParcel, "amountCellParcel");
                                csl.k kVar3 = oVar8.f106985p;
                                cli.y yVar2 = oVar8.g0;
                                r0 orderType2 = ((h) ((j2) yVar2.f22677a).getValue()).f155719a.f106848b;
                                bfl.g tradeSide = ((h) ((j2) yVar2.f22677a).getValue()).f155719a.f106847a;
                                ((csl.n) kVar3).getClass();
                                Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                int i21 = csl.m.f108543a[tradeSide.ordinal()];
                                if (i21 == 1) {
                                    i = R$string.trading_orders_estimated_total_cost;
                                } else {
                                    if (i21 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i = R$string.trading_orders_estimated_total_credit;
                                }
                                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, null, null, 14);
                                r0 r0Var = r0.LIMIT;
                                if (orderType2 == r0Var && tradeSide == bfl.g.SELL) {
                                    numValueOf = Integer.valueOf(R$string.trading_orders_estimated_total_credit_info_limit_order);
                                } else if (orderType2 == r0Var && tradeSide == bfl.g.BUY) {
                                    numValueOf = Integer.valueOf(R$string.trading_orders_estimated_total_cost_info_limit_order);
                                } else {
                                    r0 r0Var2 = r0.STOP;
                                    numValueOf = (orderType2 == r0Var2 && tradeSide == bfl.g.SELL) ? Integer.valueOf(R$string.trading_orders_estimated_total_credit_info_stop_order) : (orderType2 == r0Var2 && tradeSide == bfl.g.BUY) ? Integer.valueOf(R$string.trading_orders_estimated_total_cost_info_stop_order) : null;
                                }
                                oVar8.A.x(csl.n.d(new rp0.t(textLocalisedClause3, numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null, null, 28)));
                            }
                        } else if (Intrinsics.f(f55860a, "LIST_ID_EXCHANGED_HEADER_ITEM")) {
                            com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar9 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                            oVar9.getClass();
                            oVar9.l2(new g0(oVar9, null, 2), new yi5.b(26));
                        } else if (kotlin.text.a0.H(f55860a, "LIST_ID_EXCHANGED_ITEM_", false)) {
                            OrderQuote orderQuote = f55862c instanceof OrderQuote ? (OrderQuote) f55862c : null;
                            if (orderQuote != null) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar10 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar10.getClass();
                                Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                                oVar10.n2(new f0(oVar10, orderQuote, null, 1), new whi.b(6));
                            }
                        } else if (f55860a.equals("LIST_ID_EXCHANGE_FEES_ITEM")) {
                            com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar11 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                            oVar11.getClass();
                            oVar11.n2(new h0(oVar11, f55862c, objArr == true ? 1 : 0, i3), new whi.b(6));
                        } else if (f55860a.equals("LIST_ID_REVOLUT_CUSTODY_FEE")) {
                            com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar12 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                            oVar12.getClass();
                            oVar12.n2(new g0(oVar12, null, 0), new whi.b(6));
                        } else if (f55860a.equals("LIST_ID_ORDER_CANCELLATION_DEADLINE")) {
                            Instant deadline = f55862c instanceof Instant ? (Instant) f55862c : null;
                            if (deadline != null) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar13 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar13.getClass();
                                Intrinsics.checkNotNullParameter(deadline, "deadline");
                                oVar13.n2(new f0(oVar13, deadline, null, 0), new whi.b(6));
                            }
                        } else {
                            boolean zEquals = f55860a.equals("LIST_ID_ORDER_NOTE_TRADE_DATE");
                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                            if (zEquals) {
                                oki.h.v2(((com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2()).f106983h0, InvestOrderReviewScreenContract$ModalStep.NoteTradeDateDialog.f106957a, bottom_dialog);
                            } else if (f55860a.equals("LIST_ID_ORDER_NOTE_ISSUE_DATE")) {
                                oki.h.v2(((com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2()).f106983h0, InvestOrderReviewScreenContract$ModalStep.NoteIssueDateDialog.f106956a, bottom_dialog);
                            } else if (f55860a.equals("LIST_ID_NOTE_FEE")) {
                                k4l.k0 limits = f55862c instanceof k4l.k0 ? (k4l.k0) f55862c : null;
                                if (limits != null) {
                                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar14 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                    oVar14.getClass();
                                    Intrinsics.checkNotNullParameter(limits, "limits");
                                    oki.h.v2(oVar14.f106983h0, new InvestOrderReviewScreenContract$ModalStep.NoteFeesBreakdownDialog(limits), bottom_dialog);
                                }
                            } else if (f55860a.equals("LIST_ID_ESTIMATED_SETTLEMENT_DATE")) {
                                bfl.g tradeSide2 = f55862c instanceof bfl.g ? (bfl.g) f55862c : null;
                                if (tradeSide2 != null) {
                                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar15 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                    oVar15.getClass();
                                    Intrinsics.checkNotNullParameter(tradeSide2, "tradeSide");
                                    oVar15.n2(new f0(oVar15, tradeSide2, null, 4), new whi.b(6));
                                }
                            } else if (f55860a.equals("LIST_ID_HARD_LOCKUP")) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar16 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar16.getClass();
                                oVar16.n2(new g0(oVar16, null, 3), new whi.b(6));
                            } else if (f55860a.equals("LIST_ID_SOFT_LOCKUP")) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar17 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar17.getClass();
                                oVar17.n2(new g0(oVar17, null, 7), new whi.b(6));
                            } else if (f55860a.equals("LIST_ID_EARLY_REDEMPTION_FEE")) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar18 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar18.getClass();
                                oVar18.n2(new g0(oVar18, null, 1), new whi.b(6));
                            } else if (f55860a.equals("SET_SCHEDULE_SETTINGS_ITEM")) {
                                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar19 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                                oVar19.getClass();
                                oVar19.n2(new g0(oVar19, null, 6), new whi.b(6));
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("Handler is not implemented for id: ".concat(f55860a));
                                zhm.h0 h0Var = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                            }
                        }
                    }
                }
                return Unit.f186387a;
            default:
                sa saVar = (sa) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(saVar.i, m.f155745a)) {
                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar20 = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.R2();
                    oVar20.getClass();
                    oVar20.n2(new g0(oVar20, null, 5), new whi.b(6));
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException(a0.d.m(saVar.i, "Unsupported parcel item with parcel = "));
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                }
                return Unit.f186387a;
        }
    }
}
