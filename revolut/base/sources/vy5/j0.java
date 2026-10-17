package vy5;

import android.content.Intent;
import android.os.Parcelable;
import com.revolut.feature.currency.accounts.api.CurrencyAccountPendingAction;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.pockets.api.model.OpenAccountDetailsRequest;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f293172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oqk.k f293173n;
    public final LinkedHashSet o;

    public j0(w actionsHandler, oqk.k transactionsWidgetActionExtension, cc7.l expandableDelegateControllerExtension) {
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(expandableDelegateControllerExtension, "expandableDelegateControllerExtension");
        this.f293172m = actionsHandler;
        this.f293173n = transactionsWidgetActionExtension;
        yji.n[] elements = {actionsHandler, expandableDelegateControllerExtension, transactionsWidgetActionExtension};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.o = zhm.a1.l(kotlin.collections.d.y0(elements), actionsHandler.Z2());
    }

    @Override // pfe.a
    public final Set Z2() {
        return this.o;
    }

    @Override // pfe.c
    public final Object b3(sfe.s sVar, Continuation continuation) throws Throwable {
        Object objY2;
        String stringExtra;
        Object objZ2;
        boolean z = sVar instanceof sfe.m;
        w wVar = this.f293172m;
        if (z) {
            Object objC3 = wVar.c3((sfe.m) sVar, continuation);
            return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
        }
        if (sVar instanceof sfe.n) {
            Object obj2 = ((sfe.n) sVar).f262423b;
            oqk.k kVar = this.f293173n;
            ssi.k kVarC3 = kVar.c3(obj2);
            if (kVarC3 == null || (objZ2 = kVar.Z2(kVarC3, continuation)) != fim.a.COROUTINE_SUSPENDED) {
                objZ2 = Unit.f186387a;
            }
            return objZ2 == fim.a.COROUTINE_SUSPENDED ? objZ2 : Unit.f186387a;
        }
        if (sVar instanceof sfe.i) {
            sfe.i iVar = (sfe.i) sVar;
            if (iVar.f262412a == 10023 && iVar.f262413b == -1) {
                Intent intent = iVar.f262414c;
                A2(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig((intent == null || (stringExtra = intent.getStringExtra("argPocketId")) == null) ? null : new ProductAccountDescriptor$Value.Main(new ProductAccountId(stringExtra, null), ProductId.CURRENCY), null), null, 4)))));
            }
        } else if (sVar instanceof sfe.p) {
            sfe.p pVar = (sfe.p) sVar;
            TabAccountsInitialPayload tabAccountsInitialPayload = pVar.f262426b;
            TabAccountsInitialPayload.Action action = tabAccountsInitialPayload instanceof TabAccountsInitialPayload.Action ? (TabAccountsInitialPayload.Action) tabAccountsInitialPayload : null;
            Parcelable parcelable = action != null ? action.f89543a : null;
            CurrencyAccountPendingAction currencyAccountPendingAction = parcelable instanceof CurrencyAccountPendingAction ? (CurrencyAccountPendingAction) parcelable : null;
            if (currencyAccountPendingAction != null) {
                String str = currencyAccountPendingAction.f71601a;
                String str2 = pVar.f262425a.f89729a;
                wVar.getClass();
                if (Intrinsics.f(str, "add_money")) {
                    objY2 = wVar.Y2(continuation, new h(new k(wVar, str2, null, 0), wVar, null));
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    if (objY2 != aVar) {
                        objY2 = Unit.f186387a;
                    }
                    if (objY2 != aVar) {
                        objY2 = Unit.f186387a;
                    }
                } else if (!Intrinsics.f(str, "exchange")) {
                    objY2 = Unit.f186387a;
                } else if (((jte.d) wVar.C).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c)) {
                    objY2 = wVar.Y2(continuation, new r(new l(wVar, str2, null), wVar, null));
                    fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                    if (objY2 != aVar2) {
                        objY2 = Unit.f186387a;
                    }
                    if (objY2 != aVar2) {
                        objY2 = Unit.f186387a;
                    }
                } else {
                    yji.n.P2(wVar, wVar.o2(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("merging-exchange-with-move")), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56)), null, new vrl.n(wVar, new k(wVar, str2, null, 1), 18), 1);
                    objY2 = Unit.f186387a;
                }
                return objY2 == fim.a.COROUTINE_SUSPENDED ? objY2 : Unit.f186387a;
            }
        } else if (sVar instanceof sfe.h) {
            sfe.h event = (sfe.h) sVar;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            Object obj3 = event.f262411b;
            OpenAccountDetailsRequest openAccountDetailsRequest = obj3 instanceof OpenAccountDetailsRequest ? (OpenAccountDetailsRequest) obj3 : null;
            if (openAccountDetailsRequest != null) {
                wVar.d3(openAccountDetailsRequest.f80769a);
            }
        }
        return Unit.f186387a;
    }
}
