package com.revolut.core.ui_kit.internal.views.swipeablecards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardCoverItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardInnerRecyclerItemDelegate;
import com.revolut.core.ui_kit.internal.views.stories.TouchNavigatedViewPager;
import ihm.f;
import java.util.ArrayList;
import java.util.List;
import koi.a;
import koi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ru0.i;
import uu0.b;
import uu0.c;
import uu0.e;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/swipeablecards/SwipeableCardViewPager;", "Landroid/widget/FrameLayout;", "Lru0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lz4l/j;", "value", "getAdapter", "()Lz4l/j;", "setAdapter", "(Lz4l/j;)V", "adapter", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "currentItem", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardViewPager extends FrameLayout implements i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f57604g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPager2 f57605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f57606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f57607c;
    public final c d;
    public final f e;
    public final List f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardViewPager(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru0.i
    public final void a() {
    }

    @Override // ru0.i
    public final void b() {
        if (getCurrentItem() < getAdapter().getItemCount() - 1) {
            setCurrentItem(getCurrentItem() + 1);
        }
    }

    @Override // ru0.i
    public final boolean c(MotionEvent event) {
        ArrayList<View> touchables;
        int childAdapterPosition;
        RecyclerView.Adapter adapter;
        koi.c cVar;
        Intrinsics.checkNotNullParameter(event, "e");
        RecyclerView.LayoutManager layoutManager = this.f57606b.getLayoutManager();
        View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(getCurrentItem()) : null;
        Intrinsics.checkNotNullParameter(event, "event");
        if (viewFindViewByPosition != null && (touchables = viewFindViewByPosition.getTouchables()) != null) {
            int size = touchables.size();
            for (int i = 0; i < size; i++) {
                View view = touchables.get(i);
                if (view.isClickable()) {
                    float rawX = event.getRawX();
                    float rawY = event.getRawY();
                    Object obj2 = u.f228038a;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    int[] tmpLocation = this.f57607c;
                    Intrinsics.checkNotNullParameter(tmpLocation, "tmpLocation");
                    view.getLocationOnScreen(tmpLocation);
                    int i2 = tmpLocation[0];
                    int i3 = tmpLocation[1];
                    if (rawX >= i2 && rawX <= view.getWidth() + i2 && rawY >= i3 && rawY <= view.getHeight() + i3) {
                        ViewParent parent = view.getParent();
                        if (!(parent instanceof RecyclerView)) {
                            parent = null;
                        }
                        RecyclerView recyclerView = (RecyclerView) parent;
                        if (recyclerView != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != -1 && (adapter = recyclerView.getAdapter()) != null) {
                            int itemViewType = adapter.getItemViewType(childAdapterPosition);
                            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                            if (!(adapter2 instanceof a)) {
                                adapter2 = null;
                            }
                            a aVar = (a) adapter2;
                            k kVarD = (aVar == null || (cVar = aVar.f) == null) ? null : cVar.d(itemViewType);
                            if (kVarD != null) {
                                List list = this.f;
                                int size2 = list.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    if (((KClass) list.get(i5)).l(kVarD)) {
                                        break;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ru0.i
    public final void d() {
        if (getCurrentItem() > 0) {
            setCurrentItem(getCurrentItem() - 1);
        }
    }

    @Override // ru0.i
    public final void e() {
    }

    @Override // ru0.i
    public final void f() {
    }

    @NotNull
    public final j getAdapter() {
        RecyclerView.Adapter adapter = this.f57605a.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
        return (j) adapter;
    }

    public final int getCurrentItem() {
        return this.f57605a.getCurrentItem();
    }

    public final void setAdapter(@NotNull j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f57605a.setAdapter(value);
    }

    public final void setCurrentItem(int i) {
        this.f57605a.setCurrentItem(i, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardViewPager(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableCardViewPager(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TouchNavigatedViewPager touchNavigatedViewPager = new TouchNavigatedViewPager(context, null, 6, 0);
        ViewPager2 pager = touchNavigatedViewPager.getPager();
        this.f57605a = pager;
        View view = ViewGroupKt.get(pager, 0);
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) view;
        this.f57606b = recyclerView;
        this.f57607c = new int[2];
        c cVar = new c(new sii.a(this, 6));
        this.d = cVar;
        int i2 = 0;
        e eVar = new e(new su0.c(1, this, SwipeableCardViewPager.class, "findContainerAt", "findContainerAt(I)Lcom/revolut/core/ui_kit/internal/views/swipeablecards/container/SwipeableCardContainerView;", i2, 1));
        b bVar = new b(new su0.c(1, this, SwipeableCardViewPager.class, "findContainerAt", "findContainerAt(I)Lcom/revolut/core/ui_kit/internal/views/swipeablecards/container/SwipeableCardContainerView;", i2, 0));
        this.e = v0.a.d("create(...)");
        p0 p0Var = o0.f186429a;
        this.f = v.k(p0Var.b(SwipeableCardInnerRecyclerItemDelegate.class), p0Var.b(SwipeableCardCoverItemDelegate.class), p0Var.b(SimpleMediaDelegate.class));
        setClipToPadding(false);
        setClipChildren(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        touchNavigatedViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        touchNavigatedViewPager.setTopClickPadding(0);
        touchNavigatedViewPager.setBottomClickPadding(0);
        touchNavigatedViewPager.setTouchNavigationListener(this);
        addView(touchNavigatedViewPager);
        pager.setClipToPadding(false);
        pager.setClipChildren(false);
        pager.setOffscreenPageLimit(1);
        pager.setPageTransformer(new su0.a(kli.a.k(context, 16.0f)));
        pager.registerOnPageChangeCallback(cVar);
        pager.registerOnPageChangeCallback(eVar);
        pager.registerOnPageChangeCallback(bVar);
        pager.registerOnPageChangeCallback(new su0.b(this, context));
    }

    public /* synthetic */ SwipeableCardViewPager(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
