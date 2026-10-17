package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.material.imageview.ShapeableImageView;
import ix0.e0;
import ix0.e1;
import ix0.h0;
import ix0.j0;
import ix0.l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CutoutShapeableImageView;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lix0/h0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lix0/j0;", "r", "Lix0/j0;", "getCutoutReceiverController", "()Lix0/j0;", "cutoutReceiverController", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CutoutShapeableImageView extends ShapeableImageView implements h0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final j0 cutoutReceiverController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutShapeableImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        e0 e0Var = l0.Companion;
        j0 cutoutReceiverController = getCutoutReceiverController();
        List list = cutoutReceiverController.f169246c;
        e0Var.getClass();
        e0.b(canvas, list);
        super.onDraw(canvas);
        e0.a(cutoutReceiverController, canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutShapeableImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ix0.h0
    @NotNull
    public j0 getCutoutReceiverController() {
        return this.cutoutReceiverController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutShapeableImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cutoutReceiverController = new j0(this);
        getCutoutReceiverController().f169245b.a(e1.SHAPEABLE_IMAGE_VIEW, true);
    }

    public /* synthetic */ CutoutShapeableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
