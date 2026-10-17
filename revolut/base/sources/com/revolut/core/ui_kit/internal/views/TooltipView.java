package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class TooltipView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4l.j f56467a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/TooltipView$HeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lqw0/b;", "Lcom/revolut/core/ui_kit/internal/views/m;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HeaderDelegate extends BaseRecyclerViewDelegate<qw0.b, m> {
        public HeaderDelegate() {
            super(R$layout.internal_tooltip_view_header, new mqg.a(12));
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        public static void p(m holder, qw0.b data, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            int size = payloads.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!(payloads.get(i) instanceof qw0.a)) {
                    payloads = null;
                    break;
                }
                i++;
            }
            boolean zN = ue0.e.n(payloads);
            if (payloads != null) {
                int size2 = payloads.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zN = zN || ((qw0.a) payloads.get(i2)).f249724a;
                }
            }
            if (zN) {
                View view = holder.itemView;
                ty0.c.b(h30.l.x(view, "itemView", view), data.f249726b, holder.f, null, null, 12);
            }
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new m(parent);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        /* JADX INFO: renamed from: j */
        public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
            p((m) viewHolder, (qw0.b) jVar, list);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        /* JADX INFO: renamed from: m */
        public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
            p((m) bVar, (qw0.b) jVar, list);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/TooltipView$LineDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lqw0/d;", "Lcom/revolut/core/ui_kit/internal/views/n;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LineDelegate extends BaseRecyclerViewDelegate<qw0.d, n> {
        public LineDelegate() {
            super(R$layout.internal_tooltip_view_row, new mqg.a(13));
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        public static void p(n holder, qw0.d data, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            int size = payloads.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!(payloads.get(i) instanceof qw0.c)) {
                    payloads = null;
                    break;
                }
                i++;
            }
            boolean zN = ue0.e.n(payloads);
            boolean zN2 = ue0.e.n(payloads);
            if (payloads != null) {
                int size2 = payloads.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    qw0.c cVar = (qw0.c) payloads.get(i2);
                    zN = zN || cVar.f249727a;
                    zN2 = zN2 || cVar.f249728b;
                }
            }
            View view = holder.itemView;
            ty0.c cVarX = h30.l.x(view, "itemView", view);
            if (zN) {
                ty0.c.b(cVarX, data.f249730b, holder.f, null, null, 12);
            }
            if (zN2) {
                ty0.c.b(cVarX, data.f249731c, holder.f57237g, null, null, 12);
            }
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new n(parent);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        /* JADX INFO: renamed from: j */
        public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
            p((n) viewHolder, (qw0.d) jVar, list);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        /* JADX INFO: renamed from: m */
        public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
            p((n) bVar, (qw0.d) jVar, list);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(@NotNull List<? extends qw0.e> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f56467a.c(items);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        z4l.j jVar = new z4l.j(7, v.k(new HeaderDelegate(), new LineDelegate()), false);
        this.f56467a = jVar;
        setAdapter(jVar);
        setLayoutManager(new LinearLayoutManager(context));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setBackgroundResource(R$drawable.internal_background_rounded_popover);
        int iW = kli.a.w(R$attr.uikit_dp12, context);
        setPadding(iW, kli.a.w(R$attr.uikit_dp4, context), iW, iW);
        setMinimumWidth(context.getResources().getDimensionPixelSize(R$dimen.tooltip_min_width));
        setOverScrollMode(2);
    }

    public /* synthetic */ TooltipView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
