package hul;

import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlowContract$Step;
import com.revolut.feature.cash_topup.api.declaration.CashTopUpFlowDestination;
import com.revolut.feature.credit.application.plugins.api.models.config.ScreenConfig;
import com.revolut.feature.credit.card.impl.ui.statement_financing.flow.CreditCardStatementFinancingFlowContract$Step;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action.PetRenewalActionContract$RenewalOptInAction;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlowContract$State;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlowContract$Step;
import com.revolut.feature.rev_points.models.TermsToReview;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import ft3.j1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import jz8.c1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kx7.y0;
import mv2.e;
import om4.x2;
import org.joda.time.LocalDate;
import vkm.j2;
import yhm.m;
import zw7.k1;
import zw7.r0;
import zw7.s0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f155769c;

    public /* synthetic */ v(e93.b bVar, hy2.f fVar, b93.b bVar2) {
        this.f155767a = 10;
        this.f155768b = bVar;
        this.f155769c = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hul.v.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2) {
        i25.g gVar = (i25.g) this.f155768b;
        sfe.a aVar = (sfe.a) this.f155769c;
        List pockets = (List) obj2;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        if (pockets.isEmpty()) {
            return zi0.c.i(zhm.f0.f322471a);
        }
        return boh.f.e(nim.a.v(vkm.q.q(((x2) gVar.d).l(c8g.c.C(aVar))), new i0k.f(19)), new v(gVar, pockets, 29));
    }

    private final Object c(Object obj2) {
        i25.g gVar = (i25.g) this.f155768b;
        io3.d dVar = (io3.d) this.f155769c;
        od0.i facility = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(facility, "facility");
        if (facility.d()) {
            return nim.a.v(gVar.e.a(((CreditCard) facility.c()).f69792a, w4l.h.f294642c), new hsa.l(gVar, 10, dVar, facility));
        }
        throw new ProductAccountNotFoundException("CollateralSubaccountProductDataSource: Cannot find SECURED facility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        efm.b bVarV;
        TextLocalisedClause textLocalisedClause;
        Iterable iterableL;
        i93.k kVar;
        int i;
        int i2 = this.f155767a;
        int i3 = 4;
        int i5 = 3;
        int i6 = 15;
        int i21 = 26;
        boolean z = false;
        int i22 = 1;
        int i32 = 6;
        ?? r142 = 0;
        String text = null;
        jz8.n nVar = null;
        Object obj3 = this.f155769c;
        Object obj4 = this.f155768b;
        switch (i2) {
            case 0:
                OrderQuoteResult orderQuoteResult = (OrderQuoteResult) obj2;
                Intrinsics.checkNotNullParameter(orderQuoteResult, "orderQuoteResult");
                bul.k kVar2 = ((com.revolut.trading.orders.ui.invest.placement.screens.review.o) obj4).S;
                OrderQuote orderQuote = orderQuoteResult.f106859b;
                kVar2.getClass();
                return bul.k.a(orderQuote, (SourcePocketWrapper) obj3);
            case 1:
                wrl.a nbbo = (wrl.a) obj2;
                csl.k kVar3 = ((com.revolut.trading.orders.ui.invest.placement.screens.review.o) obj4).f106985p;
                String ticker = ((nel.n) obj3).e;
                Intrinsics.h(nbbo);
                csl.n nVar2 = (csl.n) kVar3;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(ticker, "ticker");
                Intrinsics.checkNotNullParameter(nbbo, "nbbo");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_nbbo_title, null, null, 14);
                int i33 = R$string.wealth_indicative_price_description_pattern;
                int i43 = R$string.wealth_nbbo_last_sale_pattern;
                wrl.b bVar = nbbo.f299630c;
                String str = bVar.f299631a;
                MoneyClause moneyClauseE = csl.n.e(bVar.f299632b);
                jul.o oVar = nVar2.f108546b;
                lzl.a aVar = lzl.a.THREE_DIGITS_SEPARATED;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i43, zhm.v.k(str, moneyClauseE, oVar.g(aVar, Long.valueOf(bVar.f299633c))), null, 12);
                int i59 = R$string.wealth_nbbo_bid_pattern;
                wrl.b bVar2 = nbbo.f299629b;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i59, zhm.v.k(bVar2.f299631a, csl.n.e(bVar2.f299632b), oVar.g(aVar, Long.valueOf(bVar2.f299633c))), null, 12);
                int i66 = R$string.wealth_nbbo_ask_pattern;
                wrl.b bVar3 = nbbo.f299628a;
                return csl.n.d(new rp0.t(textLocalisedClause2, new TextLocalisedClause(i33, zhm.v.k(ticker, textLocalisedClause3, textLocalisedClause4, new TextLocalisedClause(i66, zhm.v.k(bVar3.f299631a, csl.n.e(bVar3.f299632b), oVar.g(aVar, Long.valueOf(bVar3.f299633c))), null, 12)), null, 12), null, 28));
            case 2:
                com.revolut.feature.card.verification.impl.flow.card_verification.a aVar2 = (com.revolut.feature.card.verification.impl.flow.card_verification.a) obj4;
                yki.l lVar = (yki.l) obj3;
                mv2.e result = (mv2.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof mv2.f) {
                    oki.h.t2(aVar2, lVar, new CardVerificationFlowContract$Step.Info(((mv2.f) result).f209099a), true, null, false, 12);
                } else if (result instanceof e.a) {
                    oki.h.D2(lVar);
                    aVar2.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, null, 31)));
                } else {
                    if (!(result instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(lVar);
                }
                return Unit.f186387a;
            case 3:
                j1 productType = (j1) obj3;
                do3.n it8 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                sv3.a aVar3 = ((hw3.e) obj4).f156061b;
                wi0.b countryCode = do3.q.y(it8);
                j24.b bVar4 = (j24.b) aVar3;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(productType, "productType");
                ufm.c cVar = new ufm.c(new a9j.k(bVar4, 11, productType, countryCode), 0 == true ? 1 : 0);
                Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
                return cVar;
            case 4:
                ju3.a aVar4 = (ju3.a) obj4;
                hw3.e eVar = (hw3.e) obj3;
                ju3.c config = (ju3.c) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                ScreenConfig screenConfig = (ScreenConfig) config.f178573b.get(aVar4);
                if (screenConfig != null) {
                    return screenConfig;
                }
                throw new IllegalAccessException("Can't find screen config by id: " + aVar4 + ", " + eVar);
            case 5:
                com.revolut.feature.credit.card.impl.ui.statement_financing.flow.a aVar5 = (com.revolut.feature.credit.card.impl.ui.statement_financing.flow.a) obj4;
                yki.l lVar2 = (yki.l) obj3;
                iw4.m result2 = (iw4.m) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(aVar5, lVar2, new CreditCardStatementFinancingFlowContract$Step.Confirm(result2.f168951a), true, null, false, 12);
                return Unit.f186387a;
            case 6:
                yki.l lVar3 = (yki.l) obj4;
                com.revolut.feature.kyc.impl.idnow.video_ident.flow.a aVar6 = (com.revolut.feature.kyc.impl.idnow.video_ident.flow.a) obj3;
                d67.u result3 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if ((result3 instanceof d67.p) || Intrinsics.f(result3, d67.r.f111463a) || Intrinsics.f(result3, d67.t.f111465a)) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = new IllegalStateException("Result: " + result3 + " is not handled");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    break;
                } else if (Intrinsics.f(result3, d67.q.f111462a)) {
                    aVar6.C2(zs8.b.f324826a);
                } else {
                    if (!Intrinsics.f(result3, d67.s.f111464a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar6, lVar3, IdnowVideoIdentFlowContract$Step.RequestPermissions.f77786a, false, null, false, 12);
                }
                return Unit.f186387a;
            case 7:
                AccountId accountId = (AccountId) obj3;
                String pocketId = (String) obj2;
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                wsg.n nVar3 = ((com.revolut.feature.topup_screen.impl.flow.topup_methods.d) obj4).f90664t;
                efm.d0 d0VarW = nVar3.w(accountId);
                d0VarW.getClass();
                return new pfm.h(d0VarW, 4).f(nVar3.z(accountId, pocketId));
            case 8:
                com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar = (com.revolut.feature.topup_screen.impl.flow.topup_methods.d) obj4;
                yki.l lVar4 = (yki.l) obj3;
                z0f.x result4 = (z0f.x) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                Continuation continuation = null;
                if (result4 instanceof z0f.w) {
                    z0f.w wVar = (z0f.w) result4;
                    TopupMethod topupMethod = wVar.f318287a;
                    String str2 = wVar.f318288b;
                    TopupMethodsFlowContract$InputData topupMethodsFlowContract$InputData = dVar.o;
                    yki.a aVar7 = dVar.D;
                    if (topupMethod instanceof TopupMethod.OtherMethod) {
                        TopupMethod.OtherMethod otherMethod = (TopupMethod.OtherMethod) topupMethod;
                        switch (hwe.n.f156151b[otherMethod.f60440a.ordinal()]) {
                            case 1:
                                if (!yoj.b.k(((cpj.b) dVar.f90666x).g(yoj.c.US_CASH_DEPOSIT, yoj.d.DISABLED))) {
                                    oki.h.t2(dVar, aVar7, new TopupMethodsFlowContract$Step.CashTopupSelection(otherMethod, str2), true, null, false, 12);
                                } else {
                                    dVar.C1(new CashTopUpFlowDestination(cb3.a.US_FLOW, false));
                                }
                                break;
                            case 2:
                                dVar.l2(new hwe.w(dVar, topupMethod, str2, continuation, 0), new yi5.b(i21));
                                break;
                            case 3:
                                dVar.l2(new com.revolut.feature.topup_screen.impl.flow.topup_methods.b(dVar, topupMethod, str2, null), new yi5.b(i21));
                                break;
                            case 4:
                                dVar.C2(new hwe.i(topupMethod, str2));
                                if (!((jte.d) dVar.C).c(TopupApi$Toggles.PayByBank.f90470c) || !Intrinsics.f(topupMethodsFlowContract$InputData.f, str2)) {
                                    oki.h.D2(aVar7);
                                }
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                dVar.C2(new hwe.i(topupMethod, str2));
                                oki.h.D2(aVar7);
                                break;
                            case 20:
                                dVar.n2(new hwe.r(dVar, str2, continuation, i22), new whi.b(i32));
                                break;
                            case 21:
                                dVar.n2(new hwe.r(dVar, str2, continuation, 0 == true ? 1 : 0), new whi.b(i32));
                                break;
                            case 22:
                                dVar.C2(new hwe.h(str2));
                                break;
                            case 23:
                                dVar.l2(new hwe.x(dVar, null), new yi5.b(i21));
                                break;
                            case 24:
                                dVar.n2(new gvc.m(dVar, continuation, 29), new whi.b(i32));
                                break;
                            case 25:
                                dVar.n2(new hwe.u(dVar, null), new whi.b(i32));
                                break;
                            case 26:
                                dVar.n2(new hwe.y(dVar, null), new whi.b(i32));
                                break;
                            case 27:
                                dVar.n2(new hbg.h(dVar, continuation, 25), new whi.b(i32));
                                break;
                            case 28:
                                xi0.b.Companion.getClass();
                                oki.h.t2(dVar, aVar7, new TopupMethodsFlowContract$Step.SelectInstitution(new dj0.d(0L, xi0.a.a(str2)), e1f.c.d(topupMethodsFlowContract$InputData.f90634c)), true, null, false, 12);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else if (!(topupMethod instanceof TopupMethod.StoredMethod)) {
                        if (!(topupMethod instanceof TopupMethod.SuggestedMethod)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("Suggested method " + topupMethod + " shouldn't be available for manual selection");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else if (((TopupMethod.StoredMethod) topupMethod) instanceof TopupMethod.StoredMethod.Card) {
                        dVar.l2(new hwe.w(dVar, topupMethod, str2, continuation, 1), new yi5.b(i21));
                    } else {
                        dVar.C2(new hwe.i(topupMethod, str2));
                        oki.h.D2(aVar7);
                    }
                } else if (result4 instanceof z0f.u) {
                    z0f.u uVar = (z0f.u) result4;
                    TopupMethod.StoredMethod storedMethod = uVar.f318284a;
                    String str3 = uVar.f318285b;
                    yki.a aVar8 = dVar.D;
                    if (storedMethod instanceof TopupMethod.StoredMethod.Card) {
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.ExternalCardDetails(((TopupMethod.StoredMethod.Card) storedMethod).f60455a, str3), true, null, false, 12);
                    } else if (storedMethod instanceof TopupMethod.StoredMethod.Openbanking) {
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.StoredMethodDetails(((TopupMethod.StoredMethod.Openbanking) storedMethod).f60481a, null), true, null, false, 12);
                    } else if (storedMethod instanceof TopupMethod.StoredMethod.PayTo) {
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.StoredMethodDetails(((TopupMethod.StoredMethod.PayTo) storedMethod).f60490a, yte.m.PAY_TO), true, null, false, 12);
                    } else if (storedMethod instanceof TopupMethod.StoredMethod.NetBanking) {
                        TopupMethod.StoredMethod.NetBanking netBanking = (TopupMethod.StoredMethod.NetBanking) storedMethod;
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.StoredMethodDetails(netBanking.f60475a, netBanking.f60480j ? yte.m.MCY_NET_BANKING : yte.m.NET_BANKING), true, null, false, 12);
                    } else if (storedMethod instanceof TopupMethod.StoredMethod.UpiApp) {
                        TopupMethod.StoredMethod.UpiApp upiApp = (TopupMethod.StoredMethod.UpiApp) storedMethod;
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.StoredMethodDetails(upiApp.f60502a, upiApp.f60507j ? yte.m.MCY_UPI_APP : yte.m.UPI_APP), true, null, false, 12);
                    } else if (storedMethod instanceof TopupMethod.StoredMethod.PixSmartTransfer) {
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.BrazilStoredMethodDetails(((TopupMethod.StoredMethod.PixSmartTransfer) storedMethod).f60496a), true, null, false, 12);
                    } else if (storedMethod instanceof TopupMethod.StoredMethod.Akahu) {
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.StoredMethodDetails(((TopupMethod.StoredMethod.Akahu) storedMethod).f60449a, yte.m.AKAHU), true, null, false, 12);
                    } else {
                        if (!(storedMethod instanceof TopupMethod.StoredMethod.GmoPgBankDirect)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(dVar, aVar8, new TopupMethodsFlowContract$Step.StoredMethodDetails(((TopupMethod.StoredMethod.GmoPgBankDirect) storedMethod).f60467a, yte.m.GMO_PG_BANK_DIRECT), true, null, false, 12);
                    }
                } else if (result4 instanceof z0f.t) {
                    z0f.t tVar = (z0f.t) result4;
                    oki.h.w2(lVar4, new TopupMethodsFlowContract$Step.CurrencyChooser(tVar.f318282a, tVar.f318283b), ModalDestination.Style.POPUP.f98311a);
                } else if (result4 instanceof z0f.v) {
                    dVar.C2(new hwe.h(((z0f.v) result4).f318286a));
                } else {
                    boolean z3 = result4 instanceof z0f.r;
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (z3) {
                        oki.h.w2(lVar4, new TopupMethodsFlowContract$Step.CardBlockedDialog(((z0f.r) result4).f318280a), bottom_dialog);
                    } else {
                        if (!(result4 instanceof z0f.s)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.w2(lVar4, new TopupMethodsFlowContract$Step.CrossProfileRestrictedCardDialog(((z0f.s) result4).f318281a), bottom_dialog);
                    }
                }
                return Unit.f186387a;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                v6l.s sVar = ((hy2.f) obj4).f156704a;
                String cardId = ((h93.f0) obj3).f150110a;
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                efm.d0<n6l.u> physicalCardDesignByCardId = sVar.f286495a.getPhysicalCardDesignByCardId(cardId);
                v6l.k kVar4 = new v6l.k(i5, new v6e.d(sVar, i6));
                physicalCardDesignByCardId.getClass();
                ufm.i iVar = new ufm.i(physicalCardDesignByCardId, kVar4, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return te0.w.i0(iVar);
            case 10:
                e93.b bVar5 = (e93.b) obj4;
                b93.b bVar6 = (b93.b) obj3;
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                od0.h hVar = od0.i.Companion;
                Iterator it9 = designs.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        e93.f fVar = (e93.f) next;
                        if (kotlin.text.a0.z(fVar.c().f13615a, bVar6.f13615a, true) && fVar.b() == bVar5) {
                            r142 = next;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a((e93.f) r142);
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                ue0.c cVar2 = ((hz5.a) obj4).f157033a;
                Type type = hz5.b.f157035a.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                List list = (List) cVar2.T2((String) obj3, type);
                return list == null ? zhm.f0.f322471a : list;
            case 12:
                hz7.b bVar7 = (hz7.b) obj4;
                PetRenewalActionContract$RenewalOptInAction action = (PetRenewalActionContract$RenewalOptInAction) obj3;
                zw7.d0 pet = (zw7.d0) obj2;
                Intrinsics.checkNotNullParameter(pet, "pet");
                s0 s0Var = pet.o;
                Intrinsics.checkNotNullParameter(s0Var, "<this>");
                r0 r0Var = (r0) s0Var;
                k1 k1Var = r0Var.f325848p;
                LocalDate localDate = k1Var != null ? k1Var.f325808a : null;
                fx7.l lVar5 = bVar7.f157055c;
                String policyId = r0Var.f325839a;
                String str4 = action.f76338b;
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                kx7.k0 k0Var = lVar5.f138770c;
                k0Var.getClass();
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                pfm.a aVarE = te0.w.g0(k0Var.f190469a.optInForRenewal(policyId, new jx7.c(wp5.y.u(k0Var.f190470b, "toString(...)"), str4))).e(ue0.e.v(((y0) lVar5.f138768a).a().g(Unit.f186387a, false)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                boolean z4 = action.f76339c;
                efm.b bVarA = pfm.m.f235744a;
                if (z4) {
                    efm.r rVarSkipWhile = bVar7.f157054b.a().skipWhile(new hy2.l(new hy2.k(13), i6));
                    Intrinsics.checkNotNullExpressionValue(rVarSkipWhile, "skipWhile(...)");
                    efm.b bVarIgnoreElements = mo3.a.n(rVarSkipWhile).ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                    bVarV = ue0.e.v(bVarIgnoreElements);
                } else {
                    Intrinsics.checkNotNullExpressionValue(bVarA, "complete(...)");
                    bVarV = bVarA;
                }
                pfm.a aVarE2 = aVarE.e(bVarV);
                if (action.d) {
                    g3l.a aVar9 = bVar7.d;
                    Intrinsics.checkNotNullParameter(pet, "pet");
                    Intrinsics.checkNotNullParameter(action, "action");
                    bj0.b bVarB = pet.e.b();
                    int i74 = com.revolut.feature.insurance_pet.impl.R$string.pets_renewal_opt_in_success_title;
                    String str5 = pet.d;
                    TextLocalisedGenderClause textLocalisedGenderClause = new TextLocalisedGenderClause(bVarB, i74, zhm.u.c(str5));
                    if (localDate != null) {
                        int i92 = com.revolut.feature.insurance_pet.impl.R$string.pets_renewal_opt_in_success_description;
                        long jB = jli.b.b(localDate);
                        TimeClause.Format.INSTANCE.getClass();
                        textLocalisedClause = new TextLocalisedClause(i92, zhm.v.k(str5, new TimeClause(jB, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                    } else {
                        textLocalisedClause = null;
                    }
                    bVarA = aVar9.c0(new StatusViewConfiguration.Success("SUCCESSFUL_OPT_IN_FOR_RENEWAL_STATUS_VIEW", textLocalisedGenderClause, textLocalisedClause, action, SuccessType.Simple.f104398a, 1904));
                } else {
                    NaviCommand naviCommand = action.e;
                    if (naviCommand != null) {
                        bVarA = bVar7.e.a(naviCommand);
                    } else {
                        Intrinsics.checkNotNullExpressionValue(bVarA, "complete(...)");
                    }
                }
                return aVarE2.e(bVarA);
            case 13:
                ((hz8.b) obj4).f157057b.insert((SQLiteConnection) obj2, (jz8.o) obj3);
                return null;
            case 14:
                hz8.h hVar2 = (hz8.h) obj4;
                RoomDatabase roomDatabase = hVar2.f157071a;
                List coursesWithLessons = (List) obj3;
                Intrinsics.checkNotNullParameter(coursesWithLessons, "coursesWithLessons");
                List list2 = coursesWithLessons;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList.add(((jz8.m) it10.next()).f179639a);
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(((jz8.m) it11.next()).f179640b);
                }
                ArrayList arrayListU = zhm.w.u(arrayList2);
                DBUtil.performBlocking(roomDatabase, false, true, new hz8.d(hVar2, arrayList, i22));
                DBUtil.performBlocking(roomDatabase, false, true, new v(hVar2, arrayListU, i6));
                return Unit.f186387a;
            case 15:
                ((hz8.h) obj4).f157072b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 16:
                ((hz8.k) obj4).f157079b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 17:
                String str6 = (String) obj3;
                ((hz8.k) obj4).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM glossary_terms WHERE `glossaryItemId` = ?");
                try {
                    if (str6 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str6);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "glossaryItemId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "term");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "definition");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productDomain");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "index");
                    if (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        }
                        nVar = new jz8.n(text2, text3, text4, gz8.c.b(text), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                    }
                    sQLiteStatementPrepare.close();
                    return nVar;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare.close();
                    throw th11;
                }
            case 18:
                ((hz8.l) obj4).f157082b.insert((SQLiteConnection) obj2, (c1) obj3);
                return null;
            case 19:
                CardDeferredCvvFlowContract$Step cardDeferredCvvFlowContract$Step = (CardDeferredCvvFlowContract$Step) obj4;
                com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar3 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c) obj3;
                oxe.j result5 = (oxe.j) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (((CardDeferredCvvFlowContract$Step.Cvv) cardDeferredCvvFlowContract$Step).f90977a != null) {
                    cVar3.l2(new f0(cVar3, new com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.a(cVar3, cardDeferredCvvFlowContract$Step, result5, null), r142, i21), new hze.c(cVar3, 2));
                } else {
                    cVar3.l2(new hy2.e(new hib.n((Object) cVar3, (Object) result5, (Continuation) r142, 19), r142, i3), new hze.c(cVar3, i22));
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar4 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c) obj4;
                yki.b bVar8 = (yki.b) obj3;
                com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a result6 = (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 instanceof dze.f) {
                    cVar4.C2(ste.h.f265563a);
                } else if (result6 instanceof dze.e) {
                    cVar4.C2(new ste.g(((dze.e) result6).f121330a));
                } else if (Intrinsics.f(result6, a.C0560a.f90958a)) {
                    oki.h.D2(bVar8);
                } else {
                    if (!Intrinsics.f(result6, a.b.f90959a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot return IdealTopupFinished in this flow");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                }
                return Unit.f186387a;
            case 21:
                WalletLimit limit = (WalletLimit) obj2;
                Intrinsics.checkNotNullParameter(limit, "limit");
                hzj.b bVarP = ((hzj.j) obj4).f157212a.p(limit, (yt8.i) obj3);
                if (bVarP != null) {
                    return new Pair(bVarP, limit);
                }
                return null;
            case 22:
                h93.f0 f0Var = (h93.f0) obj3;
                List cardPaymentMethodWidget = (List) obj2;
                Intrinsics.checkNotNullParameter(cardPaymentMethodWidget, "cardPaymentMethodWidget");
                aim.e eVarB = zhm.u.b();
                eVarB.addAll(cardPaymentMethodWidget);
                u03.j jVar = ((i03.c) obj4).f157284b;
                eVarB.addAll(yp0.b.i(u03.j.b(f0Var), new ListSubheaderDelegate.Model("CUSTOMISE_SECTION_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_section_customise, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                if (!ifk.b.m(f0Var)) {
                    RowDelegate.Model modelE = u03.j.e(f0Var);
                    if (modelE != null) {
                        eVarB.addAll(yp0.b.i(modelE, new ListSubheaderDelegate.Model("CVV_SECTION_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_section_cvv, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                    }
                    i93.c cVar5 = f0Var.f150113g;
                    if (cVar5 == null || (kVar = cVar5.f159551c) == null) {
                        iterableL = zhm.f0.f322471a;
                    } else {
                        i93.i[] elements = {kVar.d, kVar.f159567c, kVar.f159566b, kVar.f159565a, kVar.e, kVar.f};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        iterableL = kotlin.collections.d.L(elements);
                    }
                    Iterable iterable = iterableL;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(iterable, 10));
                    Iterator it12 = iterable.iterator();
                    while (it12.hasNext()) {
                        arrayList3.add(u03.j.g(u03.l.a((i93.i) it12.next(), f0Var.v)));
                    }
                    eVarB.addAll(arrayList3.isEmpty() ? zhm.f0.f322471a : yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("SECURITY_SETTINGS_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_section_security, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                }
                List listK = zhm.v.k(new RowDelegate.Model("REGENERATE_CARD_DETAILS_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exchange, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, 0 == true ? 1 : 0, i32), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_action_regenerate_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_action_regenerate_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("REMOVE_CARD_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), 0 == true ? 1 : 0, 0 == true ? 1 : 0, i32), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_remove_placeholder_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_remove_placeholder_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return zi0.c.P(zhm.u.a(eVarB), false, null, 3);
            case 23:
                i06.g update = (i06.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List list3 = ((i06.g) ((j2) ((i06.q) obj4).f157307r.f22677a).getValue()).f157291b;
                int i96 = ((i06.i) obj3).f157294b;
                ArrayList arrayListF1 = zhm.d0.f1(list3);
                arrayListF1.set(i96, 0);
                return i06.g.a(update, false, arrayListF1, false, null, false, 29);
            case 24:
                return a(obj2);
            case 25:
                com.revolut.feature.rev_points.impl.ui.terms_review.flow.a aVar10 = (com.revolut.feature.rev_points.impl.ui.terms_review.flow.a) obj4;
                yki.b bVar9 = (yki.b) obj3;
                l0c.n result7 = (l0c.n) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                qki.d dVar2 = aVar10.f83847q;
                int i99 = ((RevPointsTermsReviewFlowContract$State) ((j2) dVar2.f22677a).getValue()).f83844a;
                if (Intrinsics.f(result7, l0c.m.f191216a)) {
                    i = i99 + 1;
                } else {
                    if (!Intrinsics.f(result7, l0c.l.f191215a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = i99 - 1;
                }
                if (i < 0) {
                    oki.h.D2(bVar9);
                } else {
                    TermsToReview termsToReview = (TermsToReview) zhm.d0.e0(i, aVar10.o.f83546a);
                    if (termsToReview != null) {
                        aVar10.H2(dVar2, new a5g.i(i, 21));
                        oki.h.t2(aVar10, bVar9, new RevPointsTermsReviewFlowContract$Step.ReadTerms(termsToReview), false, i > i99 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                    } else {
                        aVar10.n2(new hy2.e(aVar10, r142, i32), new whi.b(i32));
                    }
                }
                return Unit.f186387a;
            case 26:
                return WindowInsetsHolder.Companion.current$lambda$0$0((WindowInsetsHolder) obj4, (View) obj3, (DisposableEffectScope) obj2);
            case 27:
                return b(obj2);
            case 28:
                return c(obj2);
            default:
                i25.g gVar = (i25.g) obj4;
                List list4 = (List) obj3;
                od0.i creditCard = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(creditCard, "creditCard");
                return creditCard.d() ? nim.a.v(gVar.e.a(((CreditCard) creditCard.c()).f69792a, w4l.h.f294642c), new hsa.l(list4, 9, gVar, creditCard)) : zi0.c.i(zhm.f0.f322471a);
        }
    }

    public /* synthetic */ v(Object obj2, Object obj3, int i) {
        this.f155767a = i;
        this.f155768b = obj2;
        this.f155769c = obj3;
    }
}
