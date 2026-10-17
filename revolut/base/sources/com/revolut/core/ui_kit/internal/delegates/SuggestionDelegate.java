package com.revolut.core.ui_kit.internal.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.internal.views.SuggestionView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.flexbox.FlexboxLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ihm.f;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import op0.r3;
import org.jetbrains.annotations.NotNull;
import pof.e;
import pq0.m;
import py0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/SuggestionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/internal/delegates/SuggestionDelegate$b;", "Lpq0/m;", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuggestionDelegate extends BaseRecyclerViewDelegate<b, m> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55847c;
    public final f d;

    public static final class a {
        private a() {
        }
    }

    public static abstract class b implements j {
        private b() {
        }

        public abstract SuggestionsBarDelegate.Suggestion a();

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF53492a() {
            return a().f53492a;
        }
    }

    public SuggestionDelegate() {
        this(false);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = s.r(parent, R$layout.internal_suggestion_view);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        m mVar = new m(itemView);
        if (this.f55847c) {
            return mVar;
        }
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 4.0f);
        marginLayoutParams.setMargins(iK, iK, iK, iK);
        itemView.setLayoutParams(marginLayoutParams);
        return mVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, j jVar, int i, List list) {
        p((m) viewHolder, (b) jVar, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, j jVar, int i, List list) {
        p((m) bVar, (b) jVar, list);
    }

    public final void p(m holder, b data, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        SuggestionsBarDelegate.Suggestion suggestionA = data.a();
        if (data instanceof com.revolut.core.ui_kit.internal.delegates.b) {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            FlexboxLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof FlexboxLayoutManager.LayoutParams ? (FlexboxLayoutManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.d = 1.0f / 0;
            }
        } else {
            if (!(data instanceof com.revolut.core.ui_kit.internal.delegates.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup.LayoutParams layoutParams3 = holder.itemView.getLayoutParams();
            FlexboxLayoutManager.LayoutParams layoutParams4 = layoutParams3 instanceof FlexboxLayoutManager.LayoutParams ? (FlexboxLayoutManager.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.d = -1.0f;
            }
            holder.itemView.getLayoutParams().width = -2;
        }
        View view = holder.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.SuggestionView");
        SuggestionView suggestionView = (SuggestionView) view;
        boolean z = suggestionA.f;
        Clause clause = suggestionA.f53493b;
        suggestionView.setApplyColorFilterToIcon(z);
        suggestionView.g0(suggestionA.e);
        suggestionView.setIcon(suggestionA.f53494c);
        suggestionView.setText(clause);
        c cVar = clause != null ? new c(clause) : null;
        or0.m.a(suggestionView);
        suggestionView.setOnClickListener(new r3(suggestionA, cVar, this, suggestionA, 3));
        suggestionView.setEnabled(suggestionA.f53495g);
    }

    public SuggestionDelegate(boolean z) {
        super(R$layout.internal_suggestion_view, new e(8));
        this.f55847c = z;
        this.d = v0.a.d("create(...)");
    }
}
