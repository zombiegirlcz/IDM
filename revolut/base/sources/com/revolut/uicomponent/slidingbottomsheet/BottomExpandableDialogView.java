package com.revolut.uicomponent.slidingbottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$dimen;
import com.revolut.uicomponent.R$drawable;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import koi.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.n1;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yhm.d;
import z4l.j;
import zhm.f0;
import zyl.b;
import zyl.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 N2\u00020\u0001:\u0004\u0012O/PB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0019\u001a\u00020\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJI\u0010\u0019\u001a\u00020\f2 \u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u001c0\u00162\u000e\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001eJ)\u0010$\u001a\u00020\f2\u0010\u0010!\u001a\f\u0012\b\u0012\u00060\u001fj\u0002` 0\u00162\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020)¢\u0006\u0004\b.\u0010,J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J!\u00104\u001a\u00020\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f02¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\f2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\f02¢\u0006\u0004\b8\u00105R\"\u0010>\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010,R\"\u0010B\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010,R\"\u0010F\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010,R#\u0010M\u001a\n H*\u0004\u0018\u00010G0G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006Q"}, d2 = {"Lcom/revolut/uicomponent/slidingbottomsheet/BottomExpandableDialogView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Lz4l/j;", "Lcom/revolut/uicomponent/recycler/DiffAdapter;", "adapter", "Lzyl/b;", "headerInflater", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "itemAnimator", "", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "decorations", "setupRecyclerView", "(Lz4l/j;Lzyl/b;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;Ljava/util/List;)V", "Lkoi/k;", "Lcom/revolut/uicomponent/recycler/RecyclerViewDelegate;", "adapterDelegates", "(Ljava/util/List;Lzyl/b;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V", "Lkoi/j;", "Lcom/revolut/uicomponent/recycler/ListItem;", "items", "Lzyl/a;", "headerItem", "setItems", "(Ljava/util/List;Lzyl/a;)V", "offset", "setAnchoredStateOffset", "(I)V", "", "hideable", "setHideable", "(Z)V", "hasCollapsedState", "setHasCollapsedState", "Lzyl/c;", "getState", "()Lzyl/c;", "Lkotlin/Function1;", "listener", "setStateListener", "(Lkotlin/jvm/functions/Function1;)V", "", "offsetChangeListener", "setOnOffsetChangeListener", "k", "Z", "getDisableExpandingForShortContent", "()Z", "setDisableExpandingForShortContent", "disableExpandingForShortContent", "l", "getCalculateHeightOnce", "setCalculateHeightOnce", "calculateHeightOnce", "m", "getNeedDrawToolbarShadow", "setNeedDrawToolbarShadow", "needDrawToolbarShadow", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "o", "Lkotlin/Lazy;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Companion", "com/revolut/uicomponent/slidingbottomsheet/a", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class BottomExpandableDialogView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f107230b;
    public Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f107231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Parcelable f107232h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f107233j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean disableExpandingForShortContent;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean calculateHeightOnce;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean needDrawToolbarShadow;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f107236n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MiddleStateBottomSheetBehavior f107237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n1 f107238q;

    /* JADX INFO: renamed from: com.revolut.uicomponent.slidingbottomsheet.BottomExpandableDialogView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomExpandableDialogView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(BottomExpandableDialogView bottomExpandableDialogView) {
        Object parent = bottomExpandableDialogView.getParent();
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = bottomExpandableDialogView.f107237p;
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        int measuredHeight = ((View) parent).getMeasuredHeight() + bottomExpandableDialogView.i;
        if (measuredHeight != bottomExpandableDialogView.getMeasuredHeight()) {
            bottomExpandableDialogView.getLayoutParams().height = measuredHeight;
            bottomExpandableDialogView.setLayoutParams(bottomExpandableDialogView.getLayoutParams());
            bottomExpandableDialogView.requestLayout();
        }
        if (bottomExpandableDialogView.disableExpandingForShortContent) {
            if (bottomExpandableDialogView.f107236n && bottomExpandableDialogView.calculateHeightOnce) {
                return;
            }
            int iComputeVerticalScrollRange = bottomExpandableDialogView.getRecyclerView().computeVerticalScrollRange();
            int i = bottomExpandableDialogView.i;
            int i2 = iComputeVerticalScrollRange + i;
            int i3 = bottomExpandableDialogView.f107233j;
            if (i2 < measuredHeight - i3) {
                int i5 = (measuredHeight - i2) - i;
                if (i5 != middleStateBottomSheetBehavior.f) {
                    middleStateBottomSheetBehavior.k = false;
                    middleStateBottomSheetBehavior.d(i5);
                }
            } else {
                middleStateBottomSheetBehavior.k = true;
                middleStateBottomSheetBehavior.d(i3);
            }
            bottomExpandableDialogView.f107236n = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.o.getValue();
    }

    public static c h0(int i) {
        switch (i) {
            case 1:
                return c.DRAGGING;
            case 2:
                return c.SETTLING;
            case 3:
                return c.EXPANDED;
            case 4:
                return c.COLLAPSED;
            case 5:
                return c.HIDDEN;
            case 6:
                return c.ANCHORED;
            default:
                throw new IllegalStateException(a0.d.n("Unknown state ", i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setupRecyclerView$default(BottomExpandableDialogView bottomExpandableDialogView, j jVar, b bVar, RecyclerView.ItemAnimator itemAnimator, List list, int i, Object obj2) {
        if ((i & 4) != 0) {
            itemAnimator = new DefaultItemAnimator();
        }
        if ((i & 8) != 0) {
            list = f0.f322471a;
        }
        bottomExpandableDialogView.setupRecyclerView(jVar, bVar, itemAnimator, list);
    }

    public final boolean getCalculateHeightOnce() {
        return this.calculateHeightOnce;
    }

    public final boolean getDisableExpandingForShortContent() {
        return this.disableExpandingForShortContent;
    }

    public final boolean getNeedDrawToolbarShadow() {
        return this.needDrawToolbarShadow;
    }

    @NotNull
    public final c getState() {
        return h0(this.f107237p.f107246m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f107238q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f107238q);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Intrinsics.i(parcelable, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        Parcelable parcelable3 = bundle.getParcelable("recycler");
        super.onRestoreInstanceState(parcelable2);
        this.f107232h = parcelable3;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Parcelable parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        Parcelable parcelableOnSaveInstanceState2 = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState2 != null) {
            bundle.putParcelable("super", parcelableOnSaveInstanceState2);
        }
        if (parcelableOnSaveInstanceState != null) {
            bundle.putParcelable("recycler", parcelableOnSaveInstanceState);
        }
        return bundle;
    }

    public final void setAnchoredStateOffset(int offset) {
        this.f107233j = offset;
        this.f107237p.d(offset);
    }

    public final void setCalculateHeightOnce(boolean z) {
        this.calculateHeightOnce = z;
    }

    public final void setDisableExpandingForShortContent(boolean z) {
        this.disableExpandingForShortContent = z;
    }

    public final void setHasCollapsedState(boolean hasCollapsedState) {
        this.f107237p.f107245l = !hasCollapsedState;
    }

    public final void setHideable(boolean hideable) {
        this.f107237p.f107244j = hideable;
    }

    public final void setItems(@NotNull List<? extends koi.j> items, zyl.a headerItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        j jVar = this.f107231g;
        if (jVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        jVar.c(items);
        Intrinsics.i(null, "null cannot be cast to non-null type com.revolut.uicomponent.slidingbottomsheet.BottomExpandableDialogView.HeaderInflater<com.revolut.uicomponent.slidingbottomsheet.BottomExpandableDialogView.HeaderViewHolder, com.revolut.uicomponent.slidingbottomsheet.BottomExpandableDialogHeaderItem>");
        boolean z = getState() == c.EXPANDED;
        if (headerItem != null) {
            Intrinsics.checkNotNullExpressionValue(LayoutInflater.from(getContext()), "from(...)");
            throw null;
        }
        findViewById(R$id.shadowView).setAlpha(z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        Parcelable parcelable = this.f107232h;
        if (parcelable != null) {
            RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(parcelable);
            }
            this.f107232h = null;
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        if (!(params instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalStateException("BottomExpandableDialogView must be a direct child of Coordinator layout");
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) params;
        CoordinatorLayout.Behavior behavior = layoutParams.getBehavior();
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.f107237p;
        if (behavior != null && !Intrinsics.f(layoutParams.getBehavior(), middleStateBottomSheetBehavior)) {
            throw new IllegalStateException("BottomExpandableDialogView has behavior inside, you don't have to set it explicitly");
        }
        layoutParams.setBehavior(middleStateBottomSheetBehavior);
        super.setLayoutParams(params);
    }

    public final void setNeedDrawToolbarShadow(boolean z) {
        this.needDrawToolbarShadow = z;
    }

    public final void setOnOffsetChangeListener(@NotNull Function1<? super Float, Unit> offsetChangeListener) {
        Intrinsics.checkNotNullParameter(offsetChangeListener, "offsetChangeListener");
        this.f107230b = offsetChangeListener;
    }

    public final void setStateListener(@NotNull Function1<? super c, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = listener;
    }

    public final void setupRecyclerView(@NotNull j adapter, @NotNull b headerInflater, @NotNull RecyclerView.ItemAnimator itemAnimator, @NotNull List<? extends RecyclerView.ItemDecoration> decorations) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(headerInflater, "headerInflater");
        Intrinsics.checkNotNullParameter(itemAnimator, "itemAnimator");
        Intrinsics.checkNotNullParameter(decorations, "decorations");
        this.f107231g = adapter;
        getRecyclerView().setAdapter(adapter);
        getRecyclerView().setItemAnimator(itemAnimator);
        Iterator<T> it8 = decorations.iterator();
        while (it8.hasNext()) {
            getRecyclerView().addItemDecoration((RecyclerView.ItemDecoration) it8.next());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomExpandableDialogView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomExpandableDialogView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = context.getResources().getDimensionPixelSize(R$dimen.bottom_sheet_anchor_view_height);
        this.f107233j = kli.a.k(context, 200.0f);
        this.needDrawToolbarShadow = true;
        this.o = w.y0(new zh0.b(this, 25));
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = new MiddleStateBottomSheetBehavior(context, attributeSet);
        this.f107237p = middleStateBottomSheetBehavior;
        this.f107238q = new n1(this, 3);
        LayoutInflater.from(context).inflate(R$layout.view_bottom_expandable_dialog, (ViewGroup) this, true);
        setBackgroundResource(R$drawable.background_top_rounded_corners);
        middleStateBottomSheetBehavior.setPeekHeight(this.i);
        middleStateBottomSheetBehavior.f107245l = true;
        middleStateBottomSheetBehavior.f107251s = new WeakReference(getRecyclerView());
        middleStateBottomSheetBehavior.f107255y = this.i;
        middleStateBottomSheetBehavior.f107252t.add(new a(this));
        middleStateBottomSheetBehavior.setState(5);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(context));
        getRecyclerView().addItemDecoration(new o31.b());
    }

    public static /* synthetic */ void setupRecyclerView$default(BottomExpandableDialogView bottomExpandableDialogView, List list, b bVar, RecyclerView.ItemAnimator itemAnimator, int i, Object obj2) {
        if ((i & 4) != 0) {
            itemAnimator = new DefaultItemAnimator();
        }
        bottomExpandableDialogView.setupRecyclerView(list, bVar, itemAnimator);
    }

    public final void setupRecyclerView(@NotNull List<? extends k> adapterDelegates, @NotNull b headerInflater, @NotNull RecyclerView.ItemAnimator itemAnimator) {
        Intrinsics.checkNotNullParameter(adapterDelegates, "adapterDelegates");
        Intrinsics.checkNotNullParameter(headerInflater, "headerInflater");
        Intrinsics.checkNotNullParameter(itemAnimator, "itemAnimator");
        koi.c cVar = new koi.c(0);
        cVar.b(adapterDelegates);
        setupRecyclerView$default(this, new j(cVar, false, 14), headerInflater, itemAnimator, null, 8, null);
    }

    public /* synthetic */ BottomExpandableDialogView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
