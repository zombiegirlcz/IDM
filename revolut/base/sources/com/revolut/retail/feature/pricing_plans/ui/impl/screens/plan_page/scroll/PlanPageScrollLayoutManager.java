package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.scroll;

import android.content.Context;
import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import enk.h;
import enk.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/scroll/PlanPageScrollLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Companion", "enk/k", "a", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPageScrollLayoutManager extends LinearLayoutManager {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f103622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f103623b;

    public static final class a {
        private a() {
        }
    }

    public final void m() {
        Iterable iterable;
        RecyclerView recyclerView = this.f103623b;
        if (recyclerView == null) {
            return;
        }
        View viewFindViewByPosition = findViewByPosition(h.a(recyclerView, "benefit"));
        if (viewFindViewByPosition == null) {
            RecyclerView recyclerView2 = this.f103623b;
            if (recyclerView2 == null) {
                return;
            }
            Iterator it8 = ViewGroupKt.getChildren(recyclerView2).iterator();
            while (it8.hasNext()) {
                ((View) it8.next()).setAlpha(1.0f);
            }
            return;
        }
        int top = viewFindViewByPosition.getTop();
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fL = kli.a.l(context, 48.0f);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fMin = 1.0f - Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, top - fL) / (kli.a.l(context2, this.f103622a.f127841a) - fL));
        RecyclerView recyclerView3 = this.f103623b;
        if (recyclerView3 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(recyclerView3, "<this>");
        Intrinsics.checkNotNullParameter("benefit", "itemIdPrefix");
        RecyclerView.Adapter adapter = recyclerView3.getAdapter();
        koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
        if (hVar == null) {
            iterable = f0.f322471a;
        } else {
            List listB = hVar.b();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj2 : listB) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                Integer numValueOf = a0.H(((j) obj2).getD(), "benefit", false) ? Integer.valueOf(i) : null;
                if (numValueOf != null) {
                    arrayList.add(numValueOf);
                }
                i = i2;
            }
            iterable = arrayList;
        }
        Iterator it9 = iterable.iterator();
        while (it9.hasNext()) {
            View viewFindViewByPosition2 = findViewByPosition(((Number) it9.next()).intValue());
            if (viewFindViewByPosition2 != null) {
                viewFindViewByPosition2.setAlpha(fMin);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        this.f103623b = view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView view, RecyclerView.Recycler recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.f103623b = null;
        super.onDetachedFromWindow(view, recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        m();
    }
}
