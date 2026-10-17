package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.internal.views.FilterButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.a6;
import mx0.c6;
import mx0.s2;
import mx0.z5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0003\u000b\u0011\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/views/FiltersView;", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lmx0/c6;", "items", "", "setItems", "(Ljava/util/List;)V", "Companion", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FiltersView extends ShimmerFrameLayout {
    public final b d;

    public static final class b extends FrameLayout {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f58545h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f58546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f58547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ihm.f f58548c;
        public final ifm.b d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f58549g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f58546a = kli.a.k(context, 8.0f);
            this.f58547b = 0.5f;
            this.f58548c = v0.a.d("create(...)");
            this.d = new ifm.b();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
            boolean z3 = getLayoutDirection() == 1;
            this.f = 0;
            this.f58549g = 0;
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                int i21 = this.e;
                int i22 = this.f;
                int i32 = this.f58546a;
                int i33 = i21 - (i22 + i32);
                if (i22 != 0 && i33 < childAt.getMeasuredWidth() * this.f58547b) {
                    this.f = 0;
                    this.f58549g = childAt.getMeasuredHeight() + i32 + this.f58549g;
                }
                int i43 = this.f;
                int i59 = this.f58549g;
                if (z3) {
                    int width = getWidth() - i43;
                    childAt.layout(width - childAt.getMeasuredWidth(), i59, width, childAt.getMeasuredHeight() + i59);
                } else {
                    childAt.layout(i43, i59, childAt.getMeasuredWidth() + i43, childAt.getMeasuredHeight() + i59);
                }
                this.f = childAt.getMeasuredWidth() + i32 + this.f;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.e = View.MeasureSpec.getSize(i);
            this.f = 0;
            this.f58549g = 0;
            int childCount = getChildCount();
            int i3 = 0;
            int iMax = 0;
            int i5 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int i6 = this.e;
                int i21 = this.f;
                int i22 = this.f58546a;
                int i32 = i6 - (i21 + i22);
                if (i21 != 0 && i32 < childAt.getMeasuredWidth() * this.f58547b) {
                    this.f = 0;
                    this.f58549g = childAt.getMeasuredHeight() + i22 + this.f58549g;
                }
                int i33 = this.f;
                int i43 = this.f58549g;
                iMax = Math.max(iMax, childAt.getMeasuredWidth() + i33);
                int measuredHeight = childAt.getMeasuredHeight() + i43;
                this.f = childAt.getMeasuredWidth() + i22 + this.f;
                i3++;
                i5 = measuredHeight;
            }
            setMeasuredDimension(iMax, i5);
        }

        public final void setItems(@NotNull List<? extends c6> items) {
            FilterButton filterButton;
            Intrinsics.checkNotNullParameter(items, "items");
            ifm.b bVar = this.d;
            bVar.d();
            int size = items.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                c6 c6Var = items.get(i2);
                if (i2 < getChildCount()) {
                    View childAt = getChildAt(i2);
                    Intrinsics.i(childAt, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.FilterButton");
                    filterButton = (FilterButton) childAt;
                } else {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    filterButton = new FilterButton(context, null, 6, i);
                    filterButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    addView(filterButton);
                }
                filterButton.setModel(c6Var);
                te0.w.j0(bVar, filterButton.f56177h.subscribe(new s2(new mt9.c(this, c6Var, 12), 13)));
            }
            if (items.size() < getChildCount()) {
                removeViews(items.size(), getChildCount() - items.size());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiltersView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setItems(@NotNull List<? extends c6> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        b bVar = this.d;
        bVar.setItems(items);
        bVar.requestLayout();
        if (!items.isEmpty()) {
            int size = items.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    c6 c6Var = items.get(i);
                    if (!(c6Var instanceof z5) && !(c6Var instanceof a6)) {
                        break;
                    } else {
                        i++;
                    }
                } else if (jo0.m.f176851h) {
                    if (this.f26154c) {
                        return;
                    }
                    this.f26154c = true;
                    e();
                    return;
                }
            }
        }
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiltersView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = new b(context);
        bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.d = bVar;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.addView(bVar);
        addView(horizontalScrollView);
        horizontalScrollView.setClipToPadding(false);
        int iK = kli.a.k(context, 16.0f);
        horizontalScrollView.setPadding(iK, horizontalScrollView.getPaddingTop(), iK, horizontalScrollView.getPaddingBottom());
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
    }

    public /* synthetic */ FiltersView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
