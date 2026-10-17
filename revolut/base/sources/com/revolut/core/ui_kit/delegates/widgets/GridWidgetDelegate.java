package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import java.util.List;
import koi.b;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\n\b\t\n\u000b\f\r\u000e\u000f\u0007\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate;", "Lkoi/j;", "T", "Lkoi/b;", "VH", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/e2;", "com/revolut/core/ui_kit/delegates/widgets/c2", "com/revolut/core/ui_kit/delegates/widgets/b2", "com/revolut/core/ui_kit/delegates/widgets/d2", "op0/b2", "Model", "a", "op0/a2", "op0/c2", "SpanningGridLayoutManager", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GridWidgetDelegate<T extends koi.j, VH extends koi.b> extends BaseDraggableWidgetDelegate<Model, e2> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bB\t\b\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "Lqv0/p;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Model extends BaseDraggableWidgetDelegate.Model implements tw0.y, qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f55151b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f55152c = -1;

        public abstract a E();

        public abstract List F();

        /* JADX INFO: renamed from: G */
        public abstract Clause getF();

        /* JADX INFO: renamed from: H */
        public abstract boolean getF55242h();

        /* JADX INFO: renamed from: I */
        public float getO() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: renamed from: J */
        public float getF54959q() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: renamed from: K */
        public float getF54958p() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public float L() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public int getF55152c() {
            return this.f55152c;
        }

        /* JADX INFO: renamed from: N */
        public abstract int getI();

        /* JADX INFO: renamed from: O */
        public abstract op0.c2 getF54953h();

        /* JADX INFO: renamed from: P, reason: from getter */
        public boolean getF55151b() {
            return this.f55151b;
        }

        @Override // tw0.y
        /* JADX INFO: renamed from: e */
        public final boolean getF55088h() {
            return getF55242h();
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: x */
        public boolean getF54941g() {
            return getF55151b();
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            boolean z3 = !Intrinsics.f(getF(), model.getF());
            boolean z4 = !Intrinsics.f(F(), model.F());
            boolean z6 = false;
            boolean z11 = getE() != model.getE();
            if (getI() != model.getI()) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            return new op0.b2(z3, z4, z11, z6, getF55152c() != model.getF55152c() ? true : z, !Intrinsics.f(E(), model.E()), getF55242h() != model.getF55242h() ? true : z, (L() == model.L() && getF54958p() == model.getF54958p() && getF54959q() == model.getF54959q() && getO() == model.getO()) ? z : true, !Intrinsics.f(getF54953h(), model.getF54953h()), getF55151b() != model.getF55151b() ? true : z);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate$a$a, reason: collision with other inner class name */
        public static final class C0432a extends a {
            private C0432a() {
            }
        }

        private a() {
        }
    }

    public static int s(int i, Context context, Model data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        tw0.g1.Companion.getClass();
        tw0.g1 g1VarA = tw0.b1.a(context);
        return (g1VarA.equals(tw0.d1.f274801a) && g1VarA.a(data.getE()) == g1VarA.getColumnCount()) ? i + 1 : i;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        List listT = t();
        e2 e2Var = new e2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_grid), listT, new ood.k(this, listT, 9), new om4.m1(1, this, GridWidgetDelegate.class, "getGridSpacing", "getGridSpacing(Landroid/content/Context;)Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$GridSpacing;", 0, 4));
        p(e2Var, true);
        return e2Var;
    }

    public abstract List t();

    public op0.a2 u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 4.0f);
        return new op0.a2(iK, iK);
    }

    public int v(Context context, Model data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        return s(data.getI(), context, data);
    }

    public abstract efm.r w(List list, Function0 function0);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0179  */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.widgets.e2 r27, com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.Model r28, int r29, java.util.List r30) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate.p(com.revolut.core.ui_kit.delegates.widgets.e2, com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate$Model, int, java.util.List):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GridWidgetDelegate$SpanningGridLayoutManager;", "Lcom/revolut/recyclerkit/AdaptiveGridLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpanningGridLayoutManager extends AdaptiveGridLayoutManager {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f55153c;
        public final int d;
        public final boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpanningGridLayoutManager(Context context, ky4.f spanCountProvider, int i, int i2, boolean z) {
            super(context, spanCountProvider);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spanCountProvider, "spanCountProvider");
            this.f55153c = i;
            this.d = i2;
            this.e = z;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* JADX INFO: renamed from: canScrollHorizontally */
        public final boolean getF53278a() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollVertically() {
            return false;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
            boolean zCheckLayoutParams = super.checkLayoutParams(layoutParams);
            if (zCheckLayoutParams && layoutParams != null && this.e) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = m();
            }
            return zCheckLayoutParams;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
            RecyclerView.LayoutParams layoutParamsGenerateDefaultLayoutParams = super.generateDefaultLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateDefaultLayoutParams, "generateDefaultLayoutParams(...)");
            if (this.e) {
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateDefaultLayoutParams).height = m();
            }
            return layoutParamsGenerateDefaultLayoutParams;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final RecyclerView.LayoutParams generateLayoutParams(Context c2, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(c2, "c");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(c2, attrs);
            Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateLayoutParams, "generateLayoutParams(...)");
            if (this.e) {
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateLayoutParams).height = m();
            }
            return layoutParamsGenerateLayoutParams;
        }

        public final int m() {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            return rim.d.c((height - ((r1 - 1) * this.d)) / this.f55153c);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            ViewGroup.LayoutParams layoutParams;
            if (this.e) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null) {
                        layoutParams.height = m();
                    }
                }
            }
            super.onLayoutChildren(recycler, state);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp10) {
            Intrinsics.checkNotNullParameter(lp10, "lp");
            RecyclerView.LayoutParams layoutParamsGenerateLayoutParams = super.generateLayoutParams(lp10);
            Intrinsics.checkNotNullExpressionValue(layoutParamsGenerateLayoutParams, "generateLayoutParams(...)");
            if (this.e) {
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateLayoutParams).height = m();
            }
            return layoutParamsGenerateLayoutParams;
        }
    }
}
