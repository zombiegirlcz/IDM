package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au0.r2;
import aw0.v1;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.framelayout.NestedScrollableHost;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/views/TickerTapeView;", "Landroid/widget/FrameLayout;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/revolut/core/ui_kit/views/TickerTapeView$TickerDelegate$Model;", "items", "", "setModel", "(Ljava/util/List;)V", "TickerDelegate", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TickerTapeView extends FrameLayout implements ur0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TickerDelegate f58903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4l.j f58904b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/TickerTapeView$TickerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/TickerTapeView$TickerDelegate$Model;", "Lcom/revolut/core/ui_kit/views/x;", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TickerDelegate extends BaseRecyclerViewDelegate<Model, x> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f58905c;
        public final ihm.f d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/TickerTapeView$TickerDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {
        }

        public TickerDelegate(int i) {
            super(R$layout.internal_delegate_ticker, new mv5.h(11));
            this.f58905c = i;
            this.d = v0.a.d("create(...)");
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new x(kotlin.jvm.internal.s.r(parent, this.f98535a));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        /* JADX INFO: renamed from: j */
        public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
            p((x) viewHolder, i, list);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        /* JADX INFO: renamed from: m */
        public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
            p((x) bVar, i, list);
        }

        public final void p(x holder, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object obj2 = null;
            Intrinsics.checkNotNullParameter(null, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, null, i, payloads);
            TextView textView = holder.f59768g;
            TextView textView2 = holder.f;
            boolean zIsEmpty = payloads.isEmpty();
            Iterator it8 = payloads.iterator();
            while (it8.hasNext()) {
                it8.next();
            }
            if (zIsEmpty) {
                Intrinsics.checkNotNullExpressionValue(textView2, "<get-labelView>(...)");
                throw null;
            }
            if (zIsEmpty) {
                Intrinsics.checkNotNullExpressionValue(textView, "<get-disabledLabelView>(...)");
                throw null;
            }
            textView2.setTextColor(this.f58905c);
            textView.setTextColor(this.f58905c);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.m.a(itemView);
            itemView.setOnClickListener(new r2(obj2, this, 19));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TickerTapeView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f58903a.f58905c = kli.a.s(colorScheme.a(), context);
        this.f58904b.notifyDataSetChanged();
    }

    public final void setModel(@NotNull List<TickerDelegate.Model> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f58904b.c(items);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerTapeView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TickerDelegate tickerDelegate = new TickerDelegate(kli.a.s(R$attr.uikit_colorForeground, context));
        this.f58903a = tickerDelegate;
        z4l.j jVar = new z4l.j(7, zhm.u.c(tickerDelegate), false);
        this.f58904b = jVar;
        AsyncDiffRecyclerView asyncDiffRecyclerView = new AsyncDiffRecyclerView(context, null, 6, 0);
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(context, null, 6, 0);
        nestedScrollableHost.addView(asyncDiffRecyclerView, new ViewGroup.LayoutParams(-1, -2));
        addView(nestedScrollableHost, new FrameLayout.LayoutParams(-2, -2, 17));
        asyncDiffRecyclerView.setClipToPadding(false);
        asyncDiffRecyclerView.setOverScrollMode(2);
        asyncDiffRecyclerView.setAdapter(jVar);
        asyncDiffRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        int iW = kli.a.w(R$attr.uikit_dp8, context);
        asyncDiffRecyclerView.setPadding(iW, 0, iW, 0);
    }
}
