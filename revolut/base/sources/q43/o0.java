package q43;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import ip0.ck0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import wtc.b1;
import x33.e;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 extends jki.g implements a0 {

    @NotNull
    public static final f0 Companion = new f0();
    public final i4b.f A;
    public final g1 B;
    public final ihm.b C;
    public final s D;
    public final LinkedHashMap E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y33.a f242033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SelectPaymentMethodInputData f242034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f242035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v43.c f242036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v43.a f242037t;
    public final sh5.d u;
    public final xua.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ang.f f242038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mre.c f242039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b1 f242040y;
    public final y91.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(jki.p stateMapper, y33.a interactor, SelectPaymentMethodInputData inputData, j60.a bottomExpandableDialogControllerExtension, v43.c infoDialogProvider, v43.a confirmDialogProvider, sh5.d cryptoFcaDisclaimerWidget, xua.a recurringPaymentInteractor, ang.f userInteractor, mre.c termsNavigationFactory, b1 wealthProtectionProductInteractor, y91.b accountsProductFeatureChecker, i4b.f legalEntityContextProvider, g1 shotDialogDisplayer) {
        h93.f0 f0Var;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(infoDialogProvider, "infoDialogProvider");
        Intrinsics.checkNotNullParameter(confirmDialogProvider, "confirmDialogProvider");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(wealthProtectionProductInteractor, "wealthProtectionProductInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f242033p = interactor;
        this.f242034q = inputData;
        this.f242035r = bottomExpandableDialogControllerExtension;
        this.f242036s = infoDialogProvider;
        this.f242037t = confirmDialogProvider;
        this.u = cryptoFcaDisclaimerWidget;
        this.v = recurringPaymentInteractor;
        this.f242038w = userInteractor;
        this.f242039x = termsNavigationFactory;
        this.f242040y = wealthProtectionProductInteractor;
        this.z = accountsProductFeatureChecker;
        this.A = legalEntityContextProvider;
        this.B = shotDialogDisplayer;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.C = bVarE;
        Data data = new Data(null, null, true, 3, null);
        b0 b0Var = b0.FIAT;
        List listC = zhm.u.c(b0Var);
        m70.a.c(t0.f186434a);
        AccountId f65249b = inputData.f65244a.getF65249b();
        zhm.h0 h0Var = zhm.h0.f322473a;
        SelectPaymentMethodInputData.UseCase useCase = inputData.f65244a;
        h93.l0 l0Var = null;
        SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings updateExistingCardSettings = useCase instanceof SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings ? (SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings) useCase : null;
        if (updateExistingCardSettings != null && (f0Var = updateExistingCardSettings.f65248a) != null) {
            l0Var = f0Var.G;
        }
        sh5.c.Companion.getClass();
        this.D = new s(f65249b, data, listC, h0Var, b0Var, "", e.b.f302639a, null, sh5.b.a(), l0Var, new Data(null, null, true, 3, null), null);
        this.E = new LinkedHashMap();
    }

    public static final List y2(o0 o0Var, b0[] b0VarArr) {
        SelectPaymentMethodInputData.UseCase useCase = o0Var.f242034q.f65244a;
        if (useCase instanceof SelectPaymentMethodInputData.UseCase.OrderNewCard) {
            SelectPaymentMethodInputData.UseCase.OrderNewCard orderNewCard = (SelectPaymentMethodInputData.UseCase.OrderNewCard) useCase;
            if (orderNewCard.f65246b == com.revolut.feature.card_payment_method.api.declaration.a.CRYPTO) {
                if (orderNewCard.f65247c) {
                    return kotlin.collections.d.n0(new g0(), b0VarArr);
                }
                ArrayList arrayList = new ArrayList();
                for (b0 b0Var : b0VarArr) {
                    if (b0Var == b0.CRYPTO) {
                        arrayList.add(b0Var);
                    }
                }
                return arrayList;
            }
        }
        return kotlin.collections.d.v0(b0VarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(q43.o0 r12, java.lang.String r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q43.o0.z2(q43.o0, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.revolut.feature.cards.models.card.PocketWithSubaccount] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r3v18, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.revolut.feature.cards.models.card.PocketWithSubaccount, java.lang.Object] */
    public final void A2(com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d event) {
        String str;
        Object obj2;
        List list;
        int i;
        List listC;
        md6.e eVar;
        Collection collectionB;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d.e) {
            B2();
            return;
        }
        boolean z = event instanceof d.f;
        v43.c cVar = this.f242036s;
        SelectPaymentMethodInputData selectPaymentMethodInputData = this.f242034q;
        j60.a aVar = this.f242035r;
        ?? r102 = 0;
        Object obj3 = null;
        r102 = 0;
        if (z) {
            Data legalEntityContext = ((s) t2()).k;
            AccountId accountId = selectPaymentMethodInputData.f65244a.getF65249b();
            h93.f0 f0VarA = d43.a.a(selectPaymentMethodInputData.f65244a);
            h93.l0 l0Var = f0VarA != null ? f0VarA.G : null;
            v43.e eVar2 = (v43.e) cVar;
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            zjh.j jVar = eVar2.f285936a;
            if (Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
                eVar = md6.e.CURRENCY;
            } else {
                if (!(accountId instanceof AccountId.Joint)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = md6.e.JOINT;
            }
            List listV = zjh.j.v(jVar, v43.e.a(legalEntityContext, new md6.a(eVar, (xi0.b) null, md6.d.DISCOVERY, (md6.f) null, 58)));
            yp0.b.q(listV, 0, 0, 0, 0, 15);
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_payment_method_info_screen_title_cash, null, null, 14), null, null, 30);
            rp0.l lVar = rp0.l.WINDOW;
            aim.e eVarB = zhm.u.b();
            if (accountId instanceof AccountId.Personal) {
                aim.e eVarB2 = zhm.u.b();
                eVarB2.addAll(v43.e.b(accountId, l0Var));
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("FEES_ITEM_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.card_payment_method_info_fees_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338);
                ck0 ck0Var = new ck0(0);
                int i2 = R$attr.uikit_dp0;
                m70.a.t(t0.f186434a);
                List listK = zhm.v.k(model, new TextDelegate.Model("FEES_ITEM_LIST_ID", new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.card_payment_method_info_cash_fees_description, null, null, 14), new TextLocalisedClause(R$string.card_payment_method_info_cash_description_link, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_TEXT_LIST_ID", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, ck0Var, null, null, i2, 0, 0, 0, 1908));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                collectionB = zhm.u.a(eVarB2);
            } else {
                if (!(accountId instanceof AccountId.Joint)) {
                    throw new NoWhenBranchMatchedException();
                }
                collectionB = v43.e.b(accountId, l0Var);
            }
            eVarB.addAll(collectionB);
            eVarB.add(v43.e.c(listV.isEmpty()));
            eVarB.addAll(listV);
            aVar.x(new rp0.y(zhm.u.a(eVarB), tVar, lVar, null, null, null, 1016));
            return;
        }
        if (event instanceof d.k) {
            Data legalEntityContext2 = ((s) t2()).k;
            h93.f0 f0VarA2 = d43.a.a(selectPaymentMethodInputData.f65244a);
            h93.l0 l0Var2 = f0VarA2 != null ? f0VarA2.G : null;
            v43.e eVar3 = (v43.e) cVar;
            eVar3.getClass();
            Intrinsics.checkNotNullParameter(legalEntityContext2, "legalEntityContext");
            List listV2 = zjh.j.v(eVar3.f285936a, v43.e.a(legalEntityContext2, new md6.a(md6.e.PERSONAL_SUBACCOUNT, (xi0.b) null, md6.d.DISCOVERY, (md6.f) null, 58)));
            yp0.b.q(listV2, 0, 0, 0, 0, 15);
            if (!zhm.d0.T(a.f242003a, l0Var2)) {
                throw new UnsupportedOperationException("Pocket dialogs are not supported for subProductType " + l0Var2);
            }
            int i3 = l0Var2 == null ? -1 : v43.d.f285935a[l0Var2.ordinal()];
            if (i3 == 1) {
                i = R$string.card_payment_method_pockets_info_pocket_local_description;
            } else if (i3 == 2) {
                i = R$string.card_payment_method_pockets_info_pocket_foreign_description;
            } else if (i3 == 3) {
                i = R$string.card_payment_method_pockets_info_pocket_local_description_brazil;
            } else if (i3 == 4) {
                i = R$string.card_payment_method_pockets_info_pocket_foreign_description_brazil;
            } else {
                if (i3 != 5) {
                    throw new IllegalStateException("Missing string resource for " + l0Var2);
                }
                i = R$string.card_payment_method_pockets_info_pocket_foreign_description;
            }
            int i5 = v43.d.f285935a[l0Var2.ordinal()];
            CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
            if (i5 == 1) {
                xi0.b.Companion.getClass();
                listC = zhm.u.c(new CurrencyClause(xi0.b.E, ticker, null, 4));
            } else if (i5 == 3) {
                xi0.b.Companion.getClass();
                listC = zhm.u.c(new CurrencyClause(xi0.b.D, ticker, null, 4));
            } else if (i5 != 5) {
                listC = zhm.f0.f322471a;
            } else {
                xi0.b.Companion.getClass();
                listC = zhm.u.c(new CurrencyClause(xi0.b.z, ticker, null, 4));
            }
            rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.card_payment_method_pockets_info_title, null, null, 14), null, null, 30);
            rp0.l lVar2 = rp0.l.WINDOW;
            ?? B = zhm.u.b();
            PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("INFO_ITEM_LIST_ID", (UrlImage) null, new TextLocalisedClause(R$string.card_payment_method_pockets_info_pocket, null, null, 14), new TextLocalisedClause(i, listC, null, 12), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            B.add(model2);
            B.add(v43.e.c(listV2.isEmpty()));
            B.addAll(listV2);
            aVar.x(new rp0.y(zhm.u.a(B), tVar2, lVar2, null, null, null, 1016));
            return;
        }
        if (event instanceof d.j) {
            u2();
            return;
        }
        if (event instanceof d.l) {
            this.C.onNext(Unit.f186387a);
            return;
        }
        if (event instanceof d.a) {
            x2(new q3d.i(4));
            return;
        }
        if (event instanceof d.b) {
            x2(new q3d.i(3));
            return;
        }
        if (event instanceof w) {
            x2(new q03.h(((w) event).f242052a, 19));
            return;
        }
        if (event instanceof z) {
            x2(new q03.h((z) event, 18));
            return;
        }
        if (event instanceof x) {
            int i6 = ((x) event).f242053a.f268122c;
            List listP0 = zhm.d0.P0(this.E.entrySet(), new m0());
            ListIterator listIterator = listP0.listIterator(listP0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                if (i6 >= ((Number) ((Map.Entry) objPrevious).getValue()).intValue()) {
                    obj3 = objPrevious;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj3;
            if (entry == null) {
                return;
            }
            x2(new q03.h((b0) entry.getKey(), 20));
            return;
        }
        if (event instanceof y) {
            x2(new q03.h(event, 17));
            return;
        }
        if (event instanceof d.c) {
            j60.a.v(aVar, false, null, 3);
            n2(new pwb.p(this, r102, 8), new whi.b(6));
            return;
        }
        if (event instanceof d.g) {
            j60.a.v(aVar, false, null, 3);
            return;
        }
        if (event instanceof d.h) {
            C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.PlanChange(xfa.b.CARDS_TAB_FULL_SCREEN))));
            return;
        }
        if (event instanceof d.C0464d) {
            h93.f0 f0VarA3 = d43.a.a(selectPaymentMethodInputData.f65244a);
            x33.e eVarB3 = ((s) t2()).b();
            x33.f fVar = eVarB3 instanceof x33.f ? (x33.f) eVarB3 : null;
            if (fVar != null && (list = fVar.f302640a) != null) {
                r102 = (PocketWithSubaccount) zhm.d0.b0(list);
            }
            ?? r3 = r102;
            if (r3 == 0 || (obj2 = r3.e) == null) {
                obj2 = zhm.f0.f322471a;
            }
            n2(new of6.d(27, this, r3, f0VarA3, obj2, null), new whi.b(6));
            return;
        }
        if (event instanceof d.i) {
            C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.will-i-be-charged-for-exchanging-foreign-currencies", 2))));
            return;
        }
        if (event instanceof d.m) {
            h93.f0 f0VarA4 = d43.a.a(selectPaymentMethodInputData.f65244a);
            if (f0VarA4 == null || (str = f0VarA4.f150110a) == null) {
                return;
            }
            j60.a.v(aVar, false, new pt4.d(this, str, 21), 1);
            return;
        }
        if (event instanceof v) {
            n2(new l0(this, ((v) event).f242051a, null), new whi.b(6));
            return;
        }
        if (event instanceof u) {
            n2(new k0(this, ((u) event).f242050a, null), new whi.b(6));
        } else {
            if (!(event instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.f(((t) event).f242049a.f275445a, "FOOTER_LEARN_MORE_LIST_ID")) {
                B2();
            }
        }
    }

    public final void B2() {
        Data legalEntityContext = ((s) t2()).k;
        v43.e eVar = (v43.e) this.f242036s;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        List listV = zjh.j.v(eVar.f285936a, v43.e.a(legalEntityContext, new md6.a(md6.e.CRYPTO, (xi0.b) null, md6.d.DISCOVERY, (md6.f) null, 58)));
        yp0.b.q(listV, 0, 0, 0, 0, 15);
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_payment_method_info_screen_title_crypto, null, null, 14), null, null, 30);
        rp0.l lVar = rp0.l.WINDOW;
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        List listK = zhm.v.k(new ListSubheaderDelegate.Model("INFO_ITEM_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.card_payment_method_all_accounts_crypto, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338), new TextDelegate.Model("INFO_ITEM_LIST_ID", new TextLocalisedClause(R$string.card_payment_method_info_crypto_description, null, null, 14), false, new ck0(0), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB2.addAll(listK);
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("FEES_ITEM_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.card_payment_method_info_fees_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338);
        ck0 ck0Var = new ck0(0);
        int i = R$attr.uikit_dp0;
        m70.a.t(t0.f186434a);
        List listK2 = zhm.v.k(model, new TextDelegate.Model("FEES_ITEM_LIST_ID", new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.card_payment_method_info_fees_crypto_card_description, null, null, 14), new TextLocalisedClause(R$string.card_payment_method_info_cash_description_link, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_TEXT_LIST_ID", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, ck0Var, null, null, i, 0, 0, 0, 1908));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        eVarB2.addAll(listK2);
        eVarB.addAll(zhm.u.a(eVarB2));
        eVarB.add(v43.e.c(listV.isEmpty()));
        eVarB.addAll(listV);
        this.f242035r.x(new rp0.y(zhm.u.a(eVarB), tVar, lVar, null, null, null, 1016));
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarSwitchMap = this.C.switchMap(new q3d.c(7, new q2g.h(this, ((gi5.d) this.u).c(null).x(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new n0(this, null), 3);
        yji.l.a1(this, w2(), null, null, new q2e.i0(this, (Continuation) null, 5), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.D;
    }
}
