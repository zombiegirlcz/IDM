package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/LazyInflatableCachedView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class LazyInflatableCachedView extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f56206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f56207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56208c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyInflatableCachedView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final View a(int i) {
        return c(i, new abf.n(i, this, 20));
    }

    public final View b(int i) {
        return (View) this.f56206a.get(i);
    }

    public final View c(int i, Function1 function1) {
        if (this.f56208c == i) {
            View view = this.f56207b;
            Intrinsics.i(view, "null cannot be cast to non-null type T of com.revolut.core.ui_kit.internal.views.LazyInflatableCachedView.showOrCreateCached");
            return view;
        }
        View view2 = this.f56207b;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        SparseArray sparseArray = this.f56206a;
        View view3 = (View) sparseArray.get(i);
        if (view3 != null) {
            view3.setVisibility(0);
            this.f56207b = view3;
            this.f56208c = i;
            return view3;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view4 = (View) function1.invoke(context);
        view4.setVisibility(0);
        addView(view4);
        sparseArray.put(i, view4);
        this.f56208c = i;
        this.f56207b = view4;
        return view4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyInflatableCachedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyInflatableCachedView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56206a = new SparseArray();
    }

    public /* synthetic */ LazyInflatableCachedView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
