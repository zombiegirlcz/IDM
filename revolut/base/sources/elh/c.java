package elh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignDestination;
import com.revolut.retail.wealth.resources.R$string;
import eed.j;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import tzg.m;
import z87.d;
import zel.f;
import zsc.h;
import zsc.p;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements d {

    @NotNull
    public static final b Companion = new b();
    public static final int[] d = {R$string.search_block_screener_name, R$string.search_block_screener_cell_title, R$string.search_block_screener_keyword_filters, R$string.search_block_screener_keyword_filtering, R$string.search_block_screener_keyword_screening, R$string.search_block_screener_keyword_scanner, R$string.search_block_screener_keyword_finder, R$string.search_block_screener_keyword_selector, R$string.search_block_screener_keyword_picker, R$string.search_block_screener_keyword_explorer, R$string.search_block_screener_keyword_research_tools, R$string.search_block_screener_keyword_analyze, R$string.search_block_screener_keyword_analysis, R$string.search_block_screener_keyword_stock_screener, R$string.search_block_screener_keyword_custom_filter, R$string.search_block_screener_keyword_advanced_filters, R$string.search_block_screener_keyword_metrics_search};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f127458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f127459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f127460c;

    public c(a screenerSearchMapper, m wealthAccountsInteractor, f01.c uikitResources) {
        Intrinsics.checkNotNullParameter(screenerSearchMapper, "screenerSearchMapper");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        this.f127458a = wealthAccountsInteractor;
        this.f127459b = r.WEALTH_STOCKS_SCREENER;
        this.f127460c = new h(new Pair(new atc.d(uikitResources, d), p.WORD_PREFIX));
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        return e.c(nim.a.v(m.c(this.f127458a, null, null, 3), new j(this, searchQuery, 20)), g.f186406a);
    }

    @Override // z87.f
    public final r h() {
        return this.f127459b;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        return Intrinsics.f(str, "ADVANCED_SEARCH_ITEM_ID") ? new o97.d(new ScreenerRedesignDestination((f) null, 2)) : o97.e.f223096a;
    }
}
