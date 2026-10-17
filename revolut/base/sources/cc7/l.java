package cc7;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import dp4.y0;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.t;
import vkm.q;
import vy5.b1;
import vy5.c1;
import vy5.d1;
import vy5.w;
import wli.x;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f22955l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f22956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f22957n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f22958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f22959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f22960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f22961s;

    public l(j60.a bottomExpandableDialogControllerExtension, oqk.k transactionsWidgetActionExtension) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        this.f22956m = bottomExpandableDialogControllerExtension;
        this.f22957n = transactionsWidgetActionExtension;
        this.o = new RowDelegate(null, null, 7);
        this.f22958p = new TwinHorizontalButtonDelegate();
        this.f22961s = new LargeActionButtonDelegate();
        this.f22959q = new ListCellDelegate();
        this.f22960r = new SuggestionsBarDelegate();
    }

    public static final void Z2(l host) {
        cua.a aVar = (cua.a) host.f22961s;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(host, "host");
        yji.n.l2(host, q.k(new cua.c(host, aVar, null)), null, new xjl.g(host, (Continuation) null, 25), 3);
    }

    @Override // yji.n
    public void D2() {
        int i = this.f22955l;
        Object obj2 = this.o;
        Continuation continuation = null;
        Object obj3 = this.f22956m;
        Object obj4 = this.f22960r;
        Object obj5 = this.f22961s;
        Object obj6 = this.f22958p;
        Object obj7 = this.f22959q;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                RateEmojiDelegate rateEmojiDelegate = (RateEmojiDelegate) obj2;
                ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) obj4;
                ActionsDelegate actionsDelegate = (ActionsDelegate) obj6;
                InputTextDelegate inputTextDelegate = (InputTextDelegate) obj7;
                LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) obj5;
                Intrinsics.checkNotNullParameter(sb7.c.Companion, "<this>");
                Intrinsics.checkNotNullParameter(rateEmojiDelegate, "rateEmojiDelegate");
                Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
                Intrinsics.checkNotNullParameter(actionsDelegate, "actionsDelegate");
                Intrinsics.checkNotNullParameter(inputTextDelegate, "inputTextDelegate");
                Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
                ((j60.a) obj3).d(v.k(rateEmojiDelegate, listSubheaderDelegate, actionsDelegate, inputTextDelegate, largeActionButtonDelegate));
                break;
            case 2:
                LargeActionButtonDelegate largeActionButtonDelegate2 = (LargeActionButtonDelegate) obj5;
                SuggestionsBarDelegate suggestionsBarDelegate = (SuggestionsBarDelegate) obj4;
                ((j60.a) obj3).d(v.k((RowDelegate) obj2, (TwinHorizontalButtonDelegate) obj6, (ListCellDelegate) obj7, largeActionButtonDelegate2, suggestionsBarDelegate));
                r rVarMerge = r.merge(v.k(suggestionsBarDelegate.p().d, largeActionButtonDelegate2.d.f121375b));
                Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
                yji.n.j2(this, rd0.e.b(rVarMerge), null, new s09.c(this, continuation, 19), 3);
                break;
            case 3:
                yji.n.j2(this, rd0.e.b(((AccountCellItemDelegate) obj7).f51551c.f53218h), null, new b1(this, null), 3);
                TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = (TwinHorizontalButtonDelegate) obj6;
                yji.n.j2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new c1(this, continuation, i3), 3);
                yji.n.j2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new c1(this, continuation, i2), 3);
                LargeActionButtonDelegate largeActionButtonDelegate3 = (LargeActionButtonDelegate) obj5;
                yji.n.j2(this, rd0.e.b(largeActionButtonDelegate3.d.f121375b), null, new d1(this, null), 3);
                r rVarMerge2 = r.merge(v.k(((SuggestionsBarDelegate) obj4).p().d, largeActionButtonDelegate3.d.f121375b));
                Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
                yji.n.j2(this, rd0.e.b(rVarMerge2), null, new vnl.o(this, continuation, 16), 3);
                ((j60.a) obj3).d(v.k(new RowDelegate(null, null, 7), new ListCellDelegate(), (LargeActionButtonDelegate) obj5, (TwinHorizontalButtonDelegate) obj6, (AccountCellItemDelegate) obj7, (SuggestionsBarDelegate) obj4));
                break;
        }
    }

    @Override // yji.n
    public void H2() {
        switch (this.f22955l) {
            case 0:
                Continuation continuation = null;
                yji.n.l2(this, rd0.e.b(((RateEmojiDelegate) this.o).f53143c), null, new i(this, continuation, 0), 3);
                yji.n.l2(this, rd0.e.b(((ActionsDelegate) this.f22958p).f51611c.f121375b), null, new i(this, continuation, 1), 3);
                yji.n.l2(this, rd0.e.b(((InputTextDelegate) this.f22959q).e.f121375b), null, new j(this, null), 3);
                yji.n.l2(this, rd0.e.b(((LargeActionButtonDelegate) this.f22961s).d.f121375b), null, new k(this, null), 3);
                break;
            case 4:
                V2(new y0((yji.n) this, (Continuation) null, 21), new yi5.b(29));
                break;
        }
    }

    public l(j60.a bottomDialogControllerExtension, sb7.b modelExtension) {
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f22956m = bottomDialogControllerExtension;
        this.f22957n = modelExtension;
        this.o = new RateEmojiDelegate();
        this.f22958p = new ActionsDelegate();
        this.f22959q = new InputTextDelegate(null);
        this.f22960r = new ListSubheaderDelegate();
        this.f22961s = new LargeActionButtonDelegate();
    }

    public l(lnh.d popularAssetsNavigationProvider, onh.b topMoversAssetsNavigationProvider, t collectionsAssetsNavigationProvider, mnh.d recentlyViewedAssetsNavigationProvider, nnh.a screenerAssetsNavigationProvider, by5.a metaCollectionAssetsNavigationProvider, g9h.c assetDetailsNotAvailableProvider) {
        Intrinsics.checkNotNullParameter(popularAssetsNavigationProvider, "popularAssetsNavigationProvider");
        Intrinsics.checkNotNullParameter(topMoversAssetsNavigationProvider, "topMoversAssetsNavigationProvider");
        Intrinsics.checkNotNullParameter(collectionsAssetsNavigationProvider, "collectionsAssetsNavigationProvider");
        Intrinsics.checkNotNullParameter(recentlyViewedAssetsNavigationProvider, "recentlyViewedAssetsNavigationProvider");
        Intrinsics.checkNotNullParameter(screenerAssetsNavigationProvider, "screenerAssetsNavigationProvider");
        Intrinsics.checkNotNullParameter(metaCollectionAssetsNavigationProvider, "metaCollectionAssetsNavigationProvider");
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        this.f22956m = popularAssetsNavigationProvider;
        this.f22957n = topMoversAssetsNavigationProvider;
        this.o = collectionsAssetsNavigationProvider;
        this.f22958p = recentlyViewedAssetsNavigationProvider;
        this.f22959q = screenerAssetsNavigationProvider;
        this.f22960r = metaCollectionAssetsNavigationProvider;
        this.f22961s = assetDetailsNotAvailableProvider;
    }

    public l(py3.b ratingEligibilityChecker, yta.b ratingActionHandler, x deeplinkHandler, yp.b appStoreNavigationFactory, dqk.f ratingPromptConfiguration, toh.d appRatingShownDateValidator, cua.a appRatingDisplayer) {
        Intrinsics.checkNotNullParameter(ratingEligibilityChecker, "ratingEligibilityChecker");
        Intrinsics.checkNotNullParameter(ratingActionHandler, "ratingActionHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        Intrinsics.checkNotNullParameter(ratingPromptConfiguration, "ratingPromptConfiguration");
        Intrinsics.checkNotNullParameter(appRatingShownDateValidator, "appRatingShownDateValidator");
        Intrinsics.checkNotNullParameter(appRatingDisplayer, "appRatingDisplayer");
        this.f22956m = ratingEligibilityChecker;
        this.f22957n = ratingActionHandler;
        this.o = deeplinkHandler;
        this.f22958p = appStoreNavigationFactory;
        this.f22959q = ratingPromptConfiguration;
        this.f22960r = appRatingShownDateValidator;
        this.f22961s = appRatingDisplayer;
    }

    public l(w actionsHandler, oqk.k transactionsWidgetActionExtension, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f22957n = actionsHandler;
        this.o = transactionsWidgetActionExtension;
        this.f22956m = bottomDialogExtension;
        this.f22958p = new TwinHorizontalButtonDelegate();
        this.f22961s = new LargeActionButtonDelegate();
        this.f22959q = new AccountCellItemDelegate();
        this.f22960r = new SuggestionsBarDelegate();
    }
}
