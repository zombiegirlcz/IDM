package vea;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements a {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f288204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.b f288205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.b f288206c;
    public final z71.a d;
    public final f01.c e;
    public final zfe.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.f f288207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s99.i f288208h;
    public final wa7.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nw5.a f288209j;
    public final gte.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f288210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f288211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function1 f288212n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o97.m0 f288213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zsc.g f288214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j0 f288215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o97.v f288216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o97.v f288217t;
    public final o97.v u;

    public l(wsg.n walletInteractor, t70.b currencyLocalization, fk3.b configurationRepository, z71.a repository, afa.j pocketsListDialogMapper, f01.c uiKitResources, zfe.e newAccountDestinationResolver, ang.f userInteractor, s99.i exchangeGlobalAccessInteractor, wa7.m hiddenAccountsInteractor, nw5.a cryptoCommodityRateInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pocketsListDialogMapper, "pocketsListDialogMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateInteractor, "cryptoCommodityRateInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f288204a = walletInteractor;
        this.f288205b = currencyLocalization;
        this.f288206c = configurationRepository;
        this.d = repository;
        this.e = uiKitResources;
        this.f = newAccountDestinationResolver;
        this.f288207g = userInteractor;
        this.f288208h = exchangeGlobalAccessInteractor;
        this.i = hiddenAccountsInteractor;
        this.f288209j = cryptoCommodityRateInteractor;
        this.k = featureToggleInteractor;
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f288210l = bVarE;
        this.f288216s = new o97.v(new TextLocalisedClause(R$string.search_block_account_action_buy, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "buy");
        this.f288217t = new o97.v(new TextLocalisedClause(R$string.search_block_account_action_exchange, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_exchange, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "exchange");
        this.u = new o97.v(new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.search_block_account_action_get, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_new_account, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "ACTION_ID_GET");
    }

    public static o97.j g(AccountId accountId, io3.d dVar) {
        return new o97.j(u0.f(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, accountId, true, true, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4080))));
    }

    public final ufm.i b(String str, String str2, o97.y yVar, Function0 function0) {
        ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new uxe.l(this, null, 17)), new vdl.s(17, new sc7.b(yVar, str2, str, function0, 15)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i c(xi0.b bVar, AccountId accountId) {
        ufm.i iVar = new ufm.i(l89.e.b(z71.a.c(this.d, bVar, accountId, 4)), new vdl.s(19, new c(this, accountId, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r3.equals("exchange") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        if (r3.equals("buy") == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (((jte.d) r18.k).c(com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        r2 = zh9.u0.f(new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination(new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData(new com.revolut.shared.feature.move_money.api.navigation.Action.MoveMoney(new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket.CurrencyAccount(r9), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, 4), (java.util.Set) null, 6), null));
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        r1 = false;
        r2 = gc0.c.f(new com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig.Buy(null, r9, null, null, null, r14, false, null, 4061));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        r9 = grl.k9.Accounts;
        r10 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR;
        r1 = efm.d0.m(new o97.l(new com.revolut.retail.core.navigation.FeatureCommand(new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig(new com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination(r2, com.google.android.gms.internal.mlkit_vision_face.a.h(r9, "value", r9), r1), yhi.b.SOLID, r4, 12))));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "just(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
    
        return r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 d(java.lang.String r19, o97.y r20) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vea.l.d(java.lang.String, o97.y):efm.d0");
    }

    public final void e(Function1 currencyFilter, Function1 shouldDisplayCurrencyForExistingPocket, o97.m0 sourceIdentifier, String sectionListId, Set keywords, j0 j0Var) {
        Intrinsics.checkNotNullParameter(currencyFilter, "currencyFilter");
        Intrinsics.checkNotNullParameter(shouldDisplayCurrencyForExistingPocket, "shouldDisplayCurrencyForExistingPocket");
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(sectionListId, "sectionListId");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        btc.a aVar = new btc.a(this.f288205b, 0);
        zsc.p pVar = zsc.p.WORD_PREFIX;
        zsc.h hVar = new zsc.h(new Pair(aVar, pVar), new Pair(new atc.c(keywords), pVar));
        zsc.h hVar2 = new zsc.h(new Pair(new btc.a(this.e), pVar));
        this.o = sectionListId;
        this.f288213p = sourceIdentifier;
        this.f288211m = currencyFilter;
        this.f288212n = shouldDisplayCurrencyForExistingPocket;
        this.f288215r = j0Var;
        this.f288214q = new zsc.g(hVar, hVar2);
    }

    public final boolean f(String str, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, Set set, Set set2, boolean z) {
        io3.d dVar = (io3.d) linkedHashMap.get(str);
        if (!linkedHashSet.contains(str)) {
            return false;
        }
        Function1 function1 = this.f288211m;
        if (function1 == null) {
            Intrinsics.r("currencyFilter");
            throw null;
        }
        if (!((Boolean) function1.invoke(str)).booleanValue()) {
            return false;
        }
        if (zhm.d0.T(set, dVar != null ? dVar.f163145a : null)) {
            return false;
        }
        if (!z && this.f288215r != null && set2.contains(str)) {
            return false;
        }
        if (z || dVar == null) {
            return true;
        }
        Function1 function12 = this.f288212n;
        if (function12 != null) {
            return ((Boolean) function12.invoke(dVar)).booleanValue();
        }
        Intrinsics.r("pocketToIncludeFilter");
        throw null;
    }
}
