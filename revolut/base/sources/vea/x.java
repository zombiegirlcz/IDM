package vea;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.commodity.order_flow.api.domain.PocketDescriptor;
import com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig;
import com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowDestination;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import grl.k9;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements m {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f288243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f288244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.b f288245c;
    public final jid.z d;
    public final rea.m e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final she.g f288246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nw5.a f288247h;
    public final f01.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y91.b f288248j;
    public final wa7.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f288249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f288250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o97.m0 f288251n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zsc.g f288252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j0 f288253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f288254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o97.v f288255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o97.v f288256t;
    public final o97.v u;
    public final o97.v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o97.v f288257w;

    public x(wsg.n walletInteractor, ang.f userInteractor, t70.b currencyLocalization, jid.z delistedPocketsInteractor, rea.m pocketDetailsInteractor, gte.a featureToggleInteractor, she.g productAccountDestinationResolver, nw5.a cryptoCommodityRateInteractor, f01.c uiKitResources, y91.b accountsProductFeatureChecker, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateInteractor, "cryptoCommodityRateInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f288243a = walletInteractor;
        this.f288244b = userInteractor;
        this.f288245c = currencyLocalization;
        this.d = delistedPocketsInteractor;
        this.e = pocketDetailsInteractor;
        this.f = featureToggleInteractor;
        this.f288246g = productAccountDestinationResolver;
        this.f288247h = cryptoCommodityRateInteractor;
        this.i = uiKitResources;
        this.f288248j = accountsProductFeatureChecker;
        this.k = hiddenAccountsInteractor;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f288249l = bVarE;
        this.f288255s = new o97.v(new TextLocalisedClause(R$string.search_block_account_action_statement, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "statement");
        this.f288256t = new o97.v(new TextLocalisedClause(R$string.search_block_account_action_exchange, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "exchange");
        this.u = new o97.v(new TextLocalisedClause(R$string.search_block_account_action_buy, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "buy");
        this.v = new o97.v(new TextLocalisedClause(R$string.search_block_account_action_sell, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "sell");
        this.f288257w = new o97.v(new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.search_block_account_action_details, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "ACTION_ID_DETAILS");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zsc.q c(vea.q r8, boolean r9, com.revolut.core.model.account.AccountId r10, do3.n r11, zsc.m r12) {
        /*
            r7 = this;
            dj0.d r0 = r8.f288231b
            long r0 = r0.f115082a
            io3.d r2 = r8.f288230a
            io3.k r3 = r2.f
            io3.k r4 = io3.k.DELISTED
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L10
            r3 = r6
            goto L11
        L10:
            r3 = r5
        L11:
            xi0.a r4 = xi0.b.Companion
            java.lang.String r2 = r2.f163147c
            boolean r2 = h30.l.D(r4, r2)
            boolean r10 = r10 instanceof com.revolut.core.model.account.AccountId.Joint
            if (r10 == 0) goto L24
            boolean r10 = te0.w.V(r11)
            if (r10 == 0) goto L24
            r5 = r6
        L24:
            r10 = 0
            if (r2 == 0) goto L38
            if (r3 == 0) goto L35
            com.revolut.feature.pockets.api.PocketsUIApi$Toggles$DisableDelistedAccountDetails r11 = com.revolut.feature.pockets.api.PocketsUIApi$Toggles.DisableDelistedAccountDetails.f80766c
            gte.a r4 = r7.f
            jte.d r4 = (jte.d) r4
            boolean r11 = r4.c(r11)
            if (r11 != 0) goto L38
        L35:
            o97.v r11 = r7.f288257w
            goto L39
        L38:
            r11 = r10
        L39:
            if (r2 == 0) goto L42
            if (r5 != 0) goto L42
            if (r3 != 0) goto L42
            o97.v r3 = r7.f288256t
            goto L43
        L42:
            r3 = r10
        L43:
            y91.b r4 = r7.f288248j
            java.lang.String r5 = "STATEMENTS.account_statement"
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L50
            o97.v r4 = r7.f288255s
            goto L51
        L50:
            r4 = r10
        L51:
            if (r2 != 0) goto L60
            boolean r5 = r8.d
            if (r5 == 0) goto L60
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L60
            o97.v r0 = r7.v
            goto L61
        L60:
            r0 = r10
        L61:
            if (r2 != 0) goto L66
            o97.v r1 = r7.u
            goto L67
        L66:
            r1 = r10
        L67:
            o97.v[] r11 = new o97.v[]{r11, r3, r4, r0, r1}
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.List r11 = kotlin.collections.d.L(r11)
            java.lang.String r0 = "searchProcessor"
            if (r9 == 0) goto L94
            zsc.g r9 = r7.f288252p
            if (r9 == 0) goto L90
            java.lang.String r10 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r10)
            java.lang.String r10 = "subEntities"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r10)
            zsc.q r10 = new zsc.q
            java.util.ArrayList r9 = r9.b(r11, r12)
            r10.<init>(r8, r11, r9)
            return r10
        L90:
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r10
        L94:
            zsc.g r9 = r7.f288252p
            if (r9 == 0) goto L9d
            zsc.q r8 = r9.a(r12, r8, r11)
            return r8
        L9d:
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vea.x.c(vea.q, boolean, com.revolut.core.model.account.AccountId, do3.n, zsc.m):zsc.q");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final efm.d0 d(String listId, o97.y searchPayload) {
        AccountStatementProduct jointCurrent;
        FeatureCommand featureCommandF;
        FeatureCommand featureCommandF2;
        ProductId productId;
        ProductId productId2;
        boolean z;
        FeatureConfig buy;
        FeatureCommand featureCommandF3;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        String str = this.o;
        Integer num = null;
        if (str == null) {
            Intrinsics.r("sectionListId");
            throw null;
        }
        boolean zF = Intrinsics.f(listId, str);
        o97.e eVar = o97.e.f223096a;
        if (zF) {
            pfm.z zVarD = new pfm.h(new ty7.b(this, 15), 2).D(eVar);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        Object obj2 = searchPayload.f223136b;
        s sVar = obj2 instanceof s ? (s) obj2 : null;
        if (sVar == null) {
            ufm.b bVarM = efm.d0.m(eVar);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        io3.d dVar = sVar.f288236b;
        AccountId accountId = sVar.f288235a;
        xi0.a aVar = xi0.b.Companion;
        String str2 = dVar.f163147c;
        long j2 = dVar.i;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        String str3 = searchPayload.f223137c;
        if (str3 != null) {
            int iHashCode = str3.hashCode();
            AccountId.Personal personal = AccountId.Personal.f51414a;
            gte.a aVar2 = this.f;
            switch (iHashCode) {
                case -2085148305:
                    if (str3.equals("statement")) {
                        Set setB = y0.b(z92.f.l(dVar));
                        if (accountId instanceof AccountId.Personal) {
                            jointCurrent = AccountStatementProduct.PersonalCurrent.f88237a;
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jointCurrent = new AccountStatementProduct.JointCurrent((AccountId.Joint) accountId);
                        }
                        ufm.b bVarM2 = efm.d0.m(new o97.l(new FeatureCommand(new AccountsStatementFeatureConfig(null, jointCurrent, setB, false))));
                        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                        return bVarM2;
                    }
                    break;
                case -1152620377:
                    if (str3.equals("ACTION_ID_DETAILS")) {
                        ufm.b bVarM3 = efm.d0.m(new o97.d(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, accountId, true, true, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4080))));
                        Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                        return bVarM3;
                    }
                    break;
                case 97926:
                    if (str3.equals("buy")) {
                        if (cp5.d.y(bVarA) && accountId.equals(personal)) {
                            m6j.a aVar3 = m6j.a.BUY;
                            m6j.b bVar = m6j.b.MARKET;
                            l6j.c cVar = l6j.c.RETAIL_POCKET;
                            featureCommandF = u0.f(new CommodityOrderFlowDestination(new CommodityOrderFlowConfig(aVar3, bVar, new PocketDescriptor.FullPocketDescriptor(bVarA, cVar), null, y0.b(cVar)), null));
                        } else {
                            featureCommandF = ((jte.d) aVar2).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.CurrencyAccount(bVarA), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, 4), (Set) null, 6), null)) : new FeatureCommand(new ExchangeFeatureConfig.Buy(null, bVarA, null, null, null, accountId, false, null, 4061));
                        }
                        ufm.b bVarM4 = efm.d0.m(new o97.l(featureCommandF));
                        Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
                        return bVarM4;
                    }
                    break;
                case 3526482:
                    if (str3.equals("sell")) {
                        if (cp5.d.y(bVarA) && accountId.equals(personal)) {
                            m6j.a aVar4 = m6j.a.SELL;
                            m6j.b bVar2 = m6j.b.MARKET;
                            l6j.c cVar2 = l6j.c.RETAIL_POCKET;
                            featureCommandF2 = u0.f(new CommodityOrderFlowDestination(new CommodityOrderFlowConfig(aVar4, bVar2, new PocketDescriptor.FullPocketDescriptor(bVarA, cVar2), new PocketDescriptor.PocketTypeDescriptor(cVar2), y0.b(cVar2)), null));
                        } else {
                            featureCommandF2 = ((jte.d) aVar2).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.CurrencyAccount(bVarA), com.revolut.shared.feature.move_money.api.navigation.a.SOURCE, 4), (Set) null, 6), null)) : new FeatureCommand(new ExchangeFeatureConfig.Sell(bVarA, null, null, null, null, accountId, null, 4030));
                        }
                        ufm.b bVarM5 = efm.d0.m(new o97.l(featureCommandF2));
                        Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
                        return bVarM5;
                    }
                    break;
                case 337225264:
                    if (str3.equals("account_details")) {
                        xi0.b bVarA2 = xi0.a.a(str2);
                        if (!cp5.d.A(bVarA2)) {
                            ufm.b bVarM6 = efm.d0.m(new o97.l(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(bVarA2, null, null, null, 62))));
                            Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
                            return bVarM6;
                        }
                        if (accountId instanceof AccountId.Personal) {
                            productId = ProductId.CURRENCY;
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            productId = ProductId.JOINT;
                        }
                        return te0.w.o0(skm.p0.f264003c, new u(this, new ProductAccountDescriptor$Value.Main(new ProductAccountId(dVar.f163145a, null), productId), null));
                    }
                    break;
                case 1749187998:
                    int i = 0;
                    if (str3.equals("create_open_account_details")) {
                        xi0.b bVarA3 = xi0.a.a(str2);
                        if (!cp5.d.A(bVarA3)) {
                            ufm.b bVarM7 = efm.d0.m(new o97.l(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(bVarA3, null, null, null, 62))));
                            Intrinsics.checkNotNullExpressionValue(bVarM7, "just(...)");
                            return bVarM7;
                        }
                        if (accountId instanceof AccountId.Personal) {
                            productId2 = ProductId.CURRENCY;
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            productId2 = ProductId.JOINT;
                        }
                        ufm.i iVar = new ufm.i(this.e.g(accountId, io3.l.CURRENT, bVarA3), new vdl.s(25, new eye.d(productId2, 1)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return new ufm.i(l89.e.b(iVar), new vdl.s(26, new p(this, i)), 0);
                    }
                    break;
                case 1989774883:
                    if (str3.equals("exchange")) {
                        if (((jte.d) aVar2).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
                            featureCommandF3 = u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.CurrencyAccount(bVarA), j2 > 0 ? com.revolut.shared.feature.move_money.api.navigation.a.SOURCE : com.revolut.shared.feature.move_money.api.navigation.a.TARGET, 4), (Set) null, 6), null));
                            z = false;
                        } else {
                            if (j2 > 0) {
                                z = false;
                                buy = new ExchangeFeatureConfig.Sell(bVarA, null, null, null, null, accountId, null, 4030);
                            } else {
                                z = false;
                                buy = new ExchangeFeatureConfig.Buy(null, bVarA, null, null, null, accountId, false, null, 4061);
                            }
                            featureCommandF3 = gc0.c.f(buy);
                        }
                        k9 k9Var = k9.Accounts;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        ufm.b bVarM8 = efm.d0.m(new o97.l(new FeatureCommand(new KompotOverlayFeatureConfig(new ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination(featureCommandF3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), z), yhi.b.SOLID, num, 12))));
                        Intrinsics.checkNotNullExpressionValue(bVarM8, "just(...)");
                        return bVarM8;
                    }
                    break;
            }
        }
        ufm.b bVarM9 = efm.d0.m(eVar);
        Intrinsics.checkNotNullExpressionValue(bVarM9, "just(...)");
        return bVarM9;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList e(java.util.List r19, xi0.b r20, java.util.ArrayList r21, java.util.Set r22, java.util.List r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vea.x.e(java.util.List, xi0.b, java.util.ArrayList, java.util.Set, java.util.List, java.util.List):java.util.ArrayList");
    }
}
