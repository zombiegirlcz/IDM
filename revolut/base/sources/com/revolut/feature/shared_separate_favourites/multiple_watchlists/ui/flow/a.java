package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.r;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.MultipleWatchlistsFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wgd.g;
import wgd.h;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements n {

    @NotNull
    public static final C0544a Companion = new C0544a();

    /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.a$a, reason: collision with other inner class name */
    public static final class C0544a {
        private C0544a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        q qVar;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<MultipleWatchlistsFlowContract$PagerItem> list = domainState.f297313c;
        ArrayList arrayList = new ArrayList();
        for (MultipleWatchlistsFlowContract$PagerItem multipleWatchlistsFlowContract$PagerItem : list) {
            if (multipleWatchlistsFlowContract$PagerItem instanceof MultipleWatchlistsFlowContract$PagerItem.Content) {
                MultipleWatchlistsFlowContract$PagerItem.Content content = (MultipleWatchlistsFlowContract$PagerItem.Content) multipleWatchlistsFlowContract$PagerItem;
                qVar = new q(content.f86911a, new t(new TextClause(content.f86912b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 58);
            } else {
                if (!(multipleWatchlistsFlowContract$PagerItem instanceof MultipleWatchlistsFlowContract$PagerItem.Error) && !Intrinsics.f(multipleWatchlistsFlowContract$PagerItem, MultipleWatchlistsFlowContract$PagerItem.Loading.f86914a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qVar = null;
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList = d0.F0(new q("add-tab-list-id", new r(R$drawable.uikit_icn_16_plus_circle), 58), arrayList);
        }
        return new h(domainState.f297311a, arrayList);
    }
}
