package com.revolut.core.ui_kit.views.buttons;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.models.ActionsToolbarViewModel$ActionItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ifm.b;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import or2.e;
import org.jetbrains.annotations.NotNull;
import ou6.o;
import rp0.l0;
import z92.f;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/ActionsRowView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/revolut/core/ui_kit/models/ActionsToolbarViewModel$ActionItem;", "getHiddenActions", "()Ljava/util/List;", "Lrp0/l0;", "getPopupMenuDisplayer", "()Lrp0/l0;", "items", "moreItem", "", "setActions", "(Ljava/util/List;Lcom/revolut/core/ui_kit/models/ActionsToolbarViewModel$ActionItem;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsRowView extends ViewGroup {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f58970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f58971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58972c;
    public boolean d;
    public l0 e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsRowView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final List<ActionsToolbarViewModel$ActionItem> getHiddenActions() {
        return d0.V(this.f58971b, this.f58972c);
    }

    private final l0 getPopupMenuDisplayer() {
        l0 l0Var = this.e;
        if (l0Var != null) {
            return l0Var;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = f.i(context);
        if (activityI == null) {
            return null;
        }
        l0 l0Var2 = new l0(activityI);
        this.e = l0Var2;
        this.f58970a.a(l0Var2.f256113c.subscribe(new e(new o(this, 19), 24)));
        return l0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        boolean z3 = getLayoutDirection() == 1;
        int i6 = z3 ? i3 - i : 0;
        int i21 = this.f58972c;
        for (int i22 = 0; i22 < i21; i22++) {
            View childAt = getChildAt(i22);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() - measuredHeight) / 2;
            childAt.layout(z3 ? i6 - measuredWidth : i6, measuredHeight2, z3 ? i6 : i6 + measuredWidth, measuredHeight + measuredHeight2);
            if (z3) {
                measuredWidth = -measuredWidth;
            }
            i6 += measuredWidth;
        }
        if (this.d) {
            this.f58971b.getClass();
            View childAt2 = getChildAt(Math.min(0, 3));
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight3 = childAt2.getMeasuredHeight();
            int measuredHeight4 = (getMeasuredHeight() - measuredHeight3) / 2;
            int i32 = z3 ? i6 - measuredWidth2 : i6;
            if (!z3) {
                i6 += measuredWidth2;
            }
            childAt2.layout(i32, measuredHeight4, i6, measuredHeight3 + measuredHeight4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        this.f58971b.getClass();
        View childAt = getChildAt(Math.min(0, 3));
        if (childAt == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        measureChild(childAt, i, i2);
        childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        this.f58971b.getClass();
        this.f58971b.getClass();
        this.f58971b.getClass();
        this.f58972c = 0;
        this.d = false;
        setMeasuredDimension(0, measuredHeight);
    }

    public final void setActions(@NotNull List<ActionsToolbarViewModel$ActionItem> items, @NotNull ActionsToolbarViewModel$ActionItem moreItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(moreItem, "moreItem");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = a.k(context, 44.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = a.k(context2, 12.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(iK, iK));
        appCompatImageView.setPadding(iK2, iK2, iK2, iK2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(a.s(R$attr.uikit_colorSelectableItemBackground, context3)), null, new ShapeDrawable(new OvalShape())));
        u.k(this).Q();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsRowView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsRowView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        v0.a.d("create(...)");
        this.f58970a = new b();
        this.f58971b = f0.f322471a;
    }

    public /* synthetic */ ActionsRowView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
