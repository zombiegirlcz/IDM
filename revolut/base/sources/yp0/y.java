package yp0;

import android.app.Activity;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.recycler.RevStaggeredGridLayoutManager;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yna.j1;

/* JADX INFO: loaded from: classes19.dex */
public abstract class y {
    public static final v a(RecyclerView recyclerView, int i, boolean z, Function1 onPagination) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(onPagination, "onPagination");
        v vVar = new v(i, onPagination, z);
        recyclerView.addOnScrollListener(vVar);
        return vVar;
    }

    public static final tw0.w b(ScreenContentRecyclerView screenContentRecyclerView, Function1 bottomReached) {
        Intrinsics.checkNotNullParameter(screenContentRecyclerView, "<this>");
        Intrinsics.checkNotNullParameter(bottomReached, "bottomReached");
        tw0.w wVar = new tw0.w(bottomReached);
        screenContentRecyclerView.addOnScrollListener(wVar);
        return wVar;
    }

    public static final void c(RecyclerView recyclerView, Function0 positionProvider, d scrollAlignment, Function0 afterScrolling) {
        int i;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(positionProvider, "positionProvider");
        Intrinsics.checkNotNullParameter(scrollAlignment, "scrollAlignment");
        Intrinsics.checkNotNullParameter(afterScrolling, "afterScrolling");
        Object tag2 = recyclerView.getTag(R$id.internal_fast_smooth_scroll_operation_tag);
        k kVar = tag2 instanceof k ? (k) tag2 : null;
        if (kVar != null) {
            kVar.b();
        }
        final k kVar2 = new k(recyclerView, scrollAlignment, positionProvider, afterScrolling, new r5.c(recyclerView, positionProvider, scrollAlignment, afterScrolling, 12));
        recyclerView.setTag(R$id.internal_fast_smooth_scroll_operation_tag, kVar2);
        if (!recyclerView.isAttachedToWindow()) {
            kVar2.c();
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            kVar2.c();
            return;
        }
        int iIntValue = ((Number) positionProvider.invoke()).intValue();
        if (iIntValue < 0 || iIntValue >= linearLayoutManager.getItemCount()) {
            kVar2.c();
            return;
        }
        if (kVar2.d(linearLayoutManager, iIntValue)) {
            kVar2.c();
            afterScrolling.invoke();
            return;
        }
        j jVar = new j(kVar2);
        kVar2.f315742g = jVar;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(jVar);
        }
        es0.k kVar3 = new es0.k(kVar2, 12);
        kVar2.f315743h = kVar3;
        recyclerView.addOnAttachStateChangeListener(kVar3);
        if (linearLayoutManager.findFirstVisibleItemPosition() == -1) {
            int paddingTop = linearLayoutManager.getPaddingTop();
            linearLayoutManager.scrollToPositionWithOffset(iIntValue, (((linearLayoutManager.getHeight() - paddingTop) - linearLayoutManager.getPaddingBottom()) / 2) + paddingTop);
            final int i2 = 1;
            recyclerView.post(new Runnable() { // from class: yp0.f
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            k kVar4 = kVar2;
                            if (!kVar4.f) {
                                int iIntValue2 = ((Number) kVar4.f315741c.invoke()).intValue();
                                if (iIntValue2 >= 0) {
                                    LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                                    if (iIntValue2 < linearLayoutManager2.getItemCount()) {
                                        i iVar = new i(kVar4, kVar4.f315739a.getContext());
                                        iVar.setTargetPosition(iIntValue2);
                                        linearLayoutManager2.startSmoothScroll(iVar);
                                    }
                                }
                                kVar4.b();
                                break;
                            }
                            break;
                        default:
                            k kVar5 = kVar2;
                            if (!kVar5.f) {
                                kVar5.f();
                                kVar5.c();
                                int iIntValue3 = ((Number) kVar5.f315741c.invoke()).intValue();
                                if (iIntValue3 >= 0) {
                                    LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
                                    if (iIntValue3 < linearLayoutManager3.getItemCount() && kVar5.d(linearLayoutManager3, iIntValue3)) {
                                        kVar5.d.invoke();
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        int iFindLastVisibleItemPosition = (linearLayoutManager.findLastVisibleItemPosition() + linearLayoutManager.findFirstVisibleItemPosition()) / 2;
        if (Math.abs(iFindLastVisibleItemPosition - iIntValue) <= 15) {
            int iIntValue2 = ((Number) positionProvider.invoke()).intValue();
            if (iIntValue2 < 0 || iIntValue2 >= linearLayoutManager.getItemCount()) {
                kVar2.b();
                return;
            }
            i iVar = new i(kVar2, recyclerView.getContext());
            iVar.setTargetPosition(iIntValue2);
            linearLayoutManager.startSmoothScroll(iVar);
            return;
        }
        if (iIntValue > iFindLastVisibleItemPosition) {
            i = iIntValue - 15;
            if (i < 0) {
                i = 0;
            }
        } else {
            i = iIntValue + 15;
            int itemCount = linearLayoutManager.getItemCount() - 1;
            if (i > itemCount) {
                i = itemCount;
            }
        }
        linearLayoutManager.scrollToPosition(i);
        final int i3 = 0;
        recyclerView.post(new Runnable() { // from class: yp0.f
            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        k kVar4 = kVar2;
                        if (!kVar4.f) {
                            int iIntValue22 = ((Number) kVar4.f315741c.invoke()).intValue();
                            if (iIntValue22 >= 0) {
                                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                                if (iIntValue22 < linearLayoutManager2.getItemCount()) {
                                    i iVar2 = new i(kVar4, kVar4.f315739a.getContext());
                                    iVar2.setTargetPosition(iIntValue22);
                                    linearLayoutManager2.startSmoothScroll(iVar2);
                                }
                            }
                            kVar4.b();
                            break;
                        }
                        break;
                    default:
                        k kVar5 = kVar2;
                        if (!kVar5.f) {
                            kVar5.f();
                            kVar5.c();
                            int iIntValue3 = ((Number) kVar5.f315741c.invoke()).intValue();
                            if (iIntValue3 >= 0) {
                                LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
                                if (iIntValue3 < linearLayoutManager3.getItemCount() && kVar5.d(linearLayoutManager3, iIntValue3)) {
                                    kVar5.d.invoke();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
    }

    public static /* synthetic */ void d(RecyclerView recyclerView, Function0 function0, d dVar, qg7.k kVar, int i) {
        if ((i & 2) != 0) {
            dVar = d.CENTER;
        }
        Function0 j1Var = kVar;
        if ((i & 8) != 0) {
            j1Var = new j1(3);
        }
        c(recyclerView, function0, dVar, j1Var);
    }

    public static final float e(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        int childCount = recyclerView.getChildCount();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float elevation = ViewCompat.getElevation(childAt);
                if (elevation > f) {
                    f = elevation;
                }
            }
        }
        return f;
    }

    public static final koi.b f(RecyclerView recyclerView, String listId) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(listId, "listId");
        int childCount = recyclerView.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View childAt = recyclerView.getChildAt(childCount);
            if (childAt != null) {
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
                if (bVar != null) {
                    koi.j jVar = bVar.e;
                    if (Intrinsics.f(jVar != null ? jVar.getF51997a() : null, listId)) {
                        return bVar;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static final void g(RecyclerView recyclerView, Activity activity) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (recyclerView.getTag(R$id.internal_recycler_view_hide_keyboard_on_scroll_view_tag) == null) {
            recyclerView.addOnScrollListener(new x(activity));
            recyclerView.setTag(R$id.internal_recycler_view_hide_keyboard_on_scroll_view_tag, Unit.f186387a);
        }
    }

    public static final void h(RecyclerView recyclerView, RecyclerView.Adapter adapter, RecyclerView.LayoutManager layoutManager) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new o31.b());
        recyclerView.setAdapter(adapter);
    }

    public static final void j(RecyclerView recyclerView, RecyclerView.Adapter adapter, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new RevStaggeredGridLayoutManager(i));
        recyclerView.addItemDecoration(new sq0.c(i2, i3));
        recyclerView.setAdapter(adapter);
    }

    public static /* synthetic */ void k(ScreenContentRecyclerView screenContentRecyclerView, koi.a aVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = R$attr.uikit_dp4;
        }
        j(screenContentRecyclerView, aVar, 2, i, R$attr.uikit_dp16);
    }
}
