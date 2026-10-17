package com.revolut.core.ui_kit.internal.views.badge;

import a5h.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import aw0.v1;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import dw0.b;
import ip0.v7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import os0.c;
import qp0.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/badge/UserStatusBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lqp0/a;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldw0/b;", "model", "", "setModel", "(Ldw0/b;)V", "getDynamicContext", "()Landroid/content/Context;", "dynamicContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserStatusBadgeView extends AppCompatImageView implements a, ur0.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f56518r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f56519t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserStatusBadgeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(b bVar) {
        Drawable drawable;
        Drawable drawableMutate;
        Context dynamicContext = getDynamicContext();
        int i = c.f229216a[bVar.ordinal()];
        if (i == 1) {
            GradientDrawable gradientDrawableK = v7.k(1);
            int iK = kli.a.k(dynamicContext, 16.0f);
            gradientDrawableK.setSize(iK, iK);
            gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorStatusSuccess_10, dynamicContext));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(kli.a.s(R$attr.uikit_colorStatusSuccess, dynamicContext));
            LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawableK, gradientDrawable});
            int iK2 = kli.a.k(dynamicContext, 2.0f);
            layerDrawable.setLayerInset(1, iK2, iK2, iK2, iK2);
            drawable = layerDrawable;
        } else if (i == 2) {
            Drawable drawable2 = dynamicContext.getDrawable(R$drawable.uikit_icn_16_minus_circle);
            if (drawable2 == null || (drawableMutate = drawable2.mutate()) == null) {
                drawable = null;
            } else {
                drawableMutate.setTint(kli.a.s(R$attr.uikit_colorStatusWarning, dynamicContext));
                drawable = drawableMutate;
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(0);
            gradientDrawable2.setStroke(kli.a.k(dynamicContext, 2.0f), kli.a.s(R$attr.uikit_colorStatusInactive, dynamicContext));
            LayerDrawable layerDrawable2 = new LayerDrawable(new GradientDrawable[]{gradientDrawable2});
            int iK3 = kli.a.k(dynamicContext, 2.0f);
            layerDrawable2.setLayerInset(0, iK3, iK3, iK3, iK3);
            drawable = layerDrawable2;
        }
        setImageDrawable(drawable);
    }

    @Override // qp0.a
    @NotNull
    public Context getDynamicContext() {
        return (Context) this.f56519t.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kli.a.k(context, 16.0f), 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f56519t.b(colorScheme);
    }

    public final void setModel(@NotNull b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (this.f56518r == model) {
            return;
        }
        this.f56518r = model;
        a(model);
    }

    @Override // qp0.a
    public final void x() {
        b bVar = this.f56518r;
        if (bVar != null) {
            a(bVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserStatusBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusBadgeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56519t = new g(this);
        if (isInEditMode()) {
            setModel(b.BUSY);
        }
    }

    public /* synthetic */ UserStatusBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
