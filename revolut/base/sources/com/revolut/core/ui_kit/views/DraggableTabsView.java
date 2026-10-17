package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.delegates.tabs.InternalTabDelegate;
import es0.f0;
import ip0.o60;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.i5;
import mx0.j5;
import mx0.jc;
import mx0.k5;
import mx0.l5;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u0019J/\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u0010J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010\u0010J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0010R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/revolut/core/ui_kit/views/DraggableTabsView;", "Landroid/widget/FrameLayout;", "Les0/r;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "manualEditEndMode", "", "setManualEditEndMode", "(Z)V", "reorderingEnabled", "setReorderingEnabled", "", "Lcom/revolut/core/ui_kit/views/q;", "newItems", "", "selectedId", "setItemsWithDiffing", "(Ljava/util/List;Ljava/lang/String;)V", "getSelectedTabId", "()Ljava/lang/String;", "setItems", "position", "", "positionOffset", "updateSelectedText", "updateIndicatorPosition", "setScrollPosition", "(IFZZ)V", "Lmx0/jc;", "gravity", "setTabsGravity", "(Lmx0/jc;)V", "value", "setFitsReadableArea", "setReadableAreaGuidelinesEnabled", "enabled", "setRecyclerAnimationsEnabled", "Les0/c;", "l", "Lkotlin/Lazy;", "getItemDraggableDragHelper", "()Les0/c;", "itemDraggableDragHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "m", "getTouchHelper", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "touchHelper", "Lcom/revolut/core/ui_kit/views/Tabs;", "n", "Le8/q;", "getDraggableTabs_tabs", "()Lcom/revolut/core/ui_kit/views/Tabs;", "draggableTabs_tabs", "Landroidx/recyclerview/widget/RecyclerView;", "o", "getDraggableTabs_recycler_view", "()Landroidx/recyclerview/widget/RecyclerView;", "draggableTabs_recycler_view", "getFitsReadableArea", "()Z", "fitsReadableArea", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DraggableTabsView extends FrameLayout implements es0.r, ny0.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f58519q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f58520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InternalTabDelegate f58521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4l.j f58522c;
    public Object d;
    public final es0.d e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f58523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f58524h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f58525j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f58526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f58527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q draggableTabs_tabs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q draggableTabs_recycler_view;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f0 f58529p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableTabsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(DraggableTabsView draggableTabsView, int i, int i2) {
        if (draggableTabsView.getDraggableTabs_recycler_view().getVisibility() == 8) {
            int i3 = i2 - i;
            draggableTabsView.getDraggableTabs_recycler_view().scrollBy(i3 < 0 ? Math.abs(i3) : -i3, (int) draggableTabsView.getDraggableTabs_recycler_view().getY());
        }
    }

    public static Unit c(DraggableTabsView draggableTabsView, String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        draggableTabsView.f58523g = true;
        ihm.f fVar = draggableTabsView.f58525j;
        Unit unit = Unit.f186387a;
        fVar.onNext(unit);
        draggableTabsView.l(draggableTabsView.getDraggableTabs_tabs().getI(), draggableTabsView.getDraggableTabs_tabs().getCurrentTabs$ui_kit_components_release(), true);
        draggableTabsView.getDraggableTabs_recycler_view().setVisibility(0);
        draggableTabsView.getDraggableTabs_tabs().setVisibility(8);
        return unit;
    }

    public static Unit d(DraggableTabsView draggableTabsView, int i, int i2) {
        Context context = draggableTabsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (io3.h.m(context)) {
            draggableTabsView.performHapticFeedback(1, 2);
        }
        draggableTabsView.setRecyclerAnimationsEnabled(true);
        ArrayList arrayListF1 = d0.f1((Collection) draggableTabsView.d);
        ar0.e eVar = (ar0.e) arrayListF1.get(i);
        ar0.e eVar2 = (ar0.e) arrayListF1.get(i2);
        arrayListF1.set(i2, eVar);
        arrayListF1.set(i, eVar2);
        z4l.j jVar = draggableTabsView.f58522c;
        if (jVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        jVar.c(d0.d1(arrayListF1));
        draggableTabsView.d = arrayListF1;
        draggableTabsView.k.onNext(eVar.f8486c);
        return Unit.f186387a;
    }

    public static ItemTouchHelper f(DraggableTabsView draggableTabsView) {
        return new ItemTouchHelper(draggableTabsView.getItemDraggableDragHelper());
    }

    public static Unit g(DraggableTabsView draggableTabsView, ar0.h holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Context context = draggableTabsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (io3.h.m(context)) {
            draggableTabsView.performHapticFeedback(1, 2);
        }
        draggableTabsView.getTouchHelper().startDrag(holder);
        return Unit.f186387a;
    }

    private final RecyclerView getDraggableTabs_recycler_view() {
        return (RecyclerView) this.draggableTabs_recycler_view.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Tabs getDraggableTabs_tabs() {
        return (Tabs) this.draggableTabs_tabs.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final es0.c getItemDraggableDragHelper() {
        return (es0.c) this.f58526l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ItemTouchHelper getTouchHelper() {
        return (ItemTouchHelper) this.f58527m.getValue();
    }

    public static Unit h(DraggableTabsView draggableTabsView) {
        boolean z = draggableTabsView.f;
        es0.d dVar = draggableTabsView.e;
        Object listTabs = draggableTabsView.d;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listTabs, "listTabs");
        Iterable iterable = (Iterable) listTabs;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ar0.e) it8.next()).f8486c);
        }
        draggableTabsView.f58524h.onNext(arrayList);
        if (!z) {
            draggableTabsView.getDraggableTabs_tabs().getTabLayout$ui_kit_components_release().f128791c = false;
            draggableTabsView.getDraggableTabs_tabs().setItemsAfterReordering$ui_kit_components_release(arrayList, draggableTabsView.getDraggableTabs_tabs().getI());
            draggableTabsView.l(draggableTabsView.getDraggableTabs_tabs().getI(), draggableTabsView.getDraggableTabs_tabs().getCurrentTabs$ui_kit_components_release(), false);
            draggableTabsView.getDraggableTabs_tabs().getTabLayout$ui_kit_components_release().scrollTo(draggableTabsView.getDraggableTabs_recycler_view().computeHorizontalScrollOffset(), draggableTabsView.getDraggableTabs_recycler_view().computeVerticalScrollOffset());
            draggableTabsView.j();
            draggableTabsView.getDraggableTabs_tabs().getTabLayout$ui_kit_components_release().f128791c = true;
            draggableTabsView.setRecyclerAnimationsEnabled(draggableTabsView.f);
            draggableTabsView.f58523g = false;
        }
        return Unit.f186387a;
    }

    public static /* synthetic */ void setItems$default(DraggableTabsView draggableTabsView, List list, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        draggableTabsView.setItems(list, str);
    }

    private final void setRecyclerAnimationsEnabled(boolean enabled) {
        if (enabled && getDraggableTabs_recycler_view().getItemAnimator() == null) {
            getDraggableTabs_recycler_view().setItemAnimator(new DefaultItemAnimator());
        } else {
            if (enabled) {
                return;
            }
            getDraggableTabs_recycler_view().setItemAnimator(null);
        }
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return this.f58520a;
    }

    public final String getSelectedTabId() {
        return getDraggableTabs_tabs().getI();
    }

    public final void j() {
        setRecyclerAnimationsEnabled(this.f);
        getDraggableTabs_recycler_view().setVisibility(8);
        getDraggableTabs_tabs().setVisibility(0);
    }

    public final void k(ViewPager2 viewPager2) {
        f0 f0Var = this.f58529p;
        if (f0Var != null) {
            ViewPager2 viewPager22 = (ViewPager2) f0Var.f128829a.get();
            if (!Intrinsics.f(viewPager22, viewPager2)) {
                if (viewPager22 != null) {
                    viewPager22.unregisterOnPageChangeCallback(f0Var);
                }
                getDraggableTabs_tabs().setOnTabPositionChangedCallback(null);
                this.f58529p = null;
            }
        }
        if (this.f58529p != null || viewPager2 == null) {
            return;
        }
        f0 f0Var2 = new f0(this, viewPager2);
        this.f58529p = f0Var2;
        viewPager2.registerOnPageChangeCallback(f0Var2);
        getDraggableTabs_tabs().setOnTabPositionChangedCallback(new mqi.a(viewPager2, 27));
    }

    public final void l(String str, List list, boolean z) {
        if (this.f && this.f58523g && z) {
            if (str == null) {
                str = "";
            }
            this.e.getClass();
            ArrayList arrayListA = es0.d.a(0, str, list, z);
            z4l.j jVar = this.f58522c;
            if (jVar == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            jVar.c(arrayListA);
            this.d = arrayListA;
            return;
        }
        Tabs draggableTabs_tabs = getDraggableTabs_tabs();
        ard.t action = new ard.t(this, str, list, z, 18);
        draggableTabs_tabs.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        AutoFitTabLayout tabLayout$ui_kit_components_release = draggableTabs_tabs.getTabLayout$ui_kit_components_release();
        if (!tabLayout$ui_kit_components_release.isLaidOut() || tabLayout$ui_kit_components_release.isLayoutRequested()) {
            tabLayout$ui_kit_components_release.addOnLayoutChangeListener(new cli.u(action, 11));
        } else {
            action.invoke(0);
        }
    }

    public final efm.r m() {
        return getDraggableTabs_tabs().f58882b;
    }

    public final ihm.f n() {
        return getDraggableTabs_tabs().n();
    }

    public final void o(String itemId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Tabs.u(getDraggableTabs_tabs(), itemId, true, false, z3, 4);
        l(itemId, getDraggableTabs_tabs().getCurrentTabs$ui_kit_components_release(), false);
    }

    public void setFitsReadableArea(boolean value) {
        if (this.f58520a == value) {
            return;
        }
        this.f58520a = value;
        requestLayout();
    }

    public final void setItems(@NotNull List<q> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        getDraggableTabs_tabs().setItems(newItems, selectedId);
        l(selectedId, newItems, getDraggableTabs_recycler_view().getVisibility() == 0);
        j();
    }

    public final void setItemsWithDiffing(@NotNull List<q> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        getDraggableTabs_tabs().setItemsWithDiffing(newItems, selectedId);
        l(selectedId, newItems, getDraggableTabs_recycler_view().getVisibility() == 0);
        if (this.f) {
            return;
        }
        j();
    }

    public final void setManualEditEndMode(boolean manualEditEndMode) {
        this.f = manualEditEndMode;
        setRecyclerAnimationsEnabled(manualEditEndMode);
        InternalTabDelegate internalTabDelegate = this.f58521b;
        if (internalTabDelegate != null) {
            internalTabDelegate.f = false;
        } else {
            Intrinsics.r("tabDelegate");
            throw null;
        }
    }

    public void setReadableAreaGuidelinesEnabled(boolean value) {
        getDraggableTabs_tabs().setReadableAreaGuidelinesEnabled(value);
    }

    public final void setReorderingEnabled(boolean reorderingEnabled) {
        if (reorderingEnabled) {
            getDraggableTabs_tabs().setOnLongTabClickListener$ui_kit_components_release(new i5(this, 0));
        } else {
            getDraggableTabs_tabs().setOnLongTabClickListener$ui_kit_components_release(null);
        }
    }

    @Override // es0.r
    public void setScrollPosition(int position, float positionOffset, boolean updateSelectedText, boolean updateIndicatorPosition) {
        getDraggableTabs_tabs().getTabLayout$ui_kit_components_release().setScrollPosition(position, positionOffset, updateSelectedText, updateIndicatorPosition);
    }

    public final void setTabsGravity(@NotNull jc gravity) {
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        getDraggableTabs_tabs().setTabsGravity(gravity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableTabsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableTabsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58520a = true;
        this.d = zhm.f0.f322471a;
        this.e = new es0.d();
        this.f58524h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f58525j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        yhm.k kVar = yhm.k.NONE;
        this.f58526l = yhm.j.c(kVar, new j5(this, 0));
        int i2 = 1;
        this.f58527m = yhm.j.c(kVar, new j5(this, i2));
        this.draggableTabs_tabs = kli.a.J(R$id.draggableTabs_tabs, this);
        this.draggableTabs_recycler_view = kli.a.J(R$id.draggableTabs_recycler_view, this);
        k5 k5Var = new k5(this);
        View.inflate(context, R$layout.internal_view_draggable_tabs, this);
        InternalTabDelegate internalTabDelegate = new InternalTabDelegate(new i5(this, i2), new l5(1, 0, es0.c.class, getItemDraggableDragHelper(), "onRelease", "onRelease(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V"), new i5(this, 2));
        this.f58521b = internalTabDelegate;
        this.f58522c = new z4l.j(7, zhm.u.c(internalTabDelegate), false);
        getDraggableTabs_recycler_view().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView draggableTabs_recycler_view = getDraggableTabs_recycler_view();
        z4l.j jVar = this.f58522c;
        if (jVar != null) {
            draggableTabs_recycler_view.setAdapter(jVar);
            getDraggableTabs_recycler_view().setHasFixedSize(true);
            getTouchHelper().attachToRecyclerView(getDraggableTabs_recycler_view());
            getDraggableTabs_recycler_view().addOnScrollListener(k5Var);
            getDraggableTabs_tabs().getTabLayout$ui_kit_components_release().setOnScrollChangeListener(new o60(this, 1));
            setClipToPadding(false);
            setClipChildren(false);
            return;
        }
        Intrinsics.r("adapter");
        throw null;
    }

    public /* synthetic */ DraggableTabsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
