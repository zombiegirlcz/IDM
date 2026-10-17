package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import aw0.v1;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ix0.e0;
import ix0.e1;
import ix0.h0;
import ix0.j0;
import ix0.l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CutoutImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lix0/h0;", "Lqp0/a;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lix0/j0;", "t", "Lix0/j0;", "getCutoutReceiverController", "()Lix0/j0;", "cutoutReceiverController", "getDynamicContext", "()Landroid/content/Context;", "dynamicContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CutoutImageView extends AppCompatImageView implements h0, qp0.a, ur0.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a5h.g f56151r;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final j0 cutoutReceiverController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // qp0.a
    @NotNull
    public Context getDynamicContext() {
        return this.f56151r.m0();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        e0 e0Var = l0.Companion;
        j0 cutoutReceiverController = getCutoutReceiverController();
        List listB = cutoutReceiverController.b();
        e0Var.getClass();
        e0.b(canvas, listB);
        super.onDraw(canvas);
        e0.a(cutoutReceiverController, canvas);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f56151r.b(colorScheme);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        getCutoutReceiverController().a().a(e1.MASKED_DRAWABLE, drawable instanceof yy0.n);
        super.setImageDrawable(drawable);
    }

    @Override // qp0.a
    public final void x() {
        Image imageD = u.k(this).Q().d(this);
        if (imageD == null) {
            return;
        }
        u.k(this).Q().b(this);
        yy0.f.e(u.k(this).Q(), imageD, this, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ix0.h0
    @NotNull
    public j0 getCutoutReceiverController() {
        return this.cutoutReceiverController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56151r = new a5h.g(this);
        this.cutoutReceiverController = new j0(this);
    }

    public /* synthetic */ CutoutImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
