package com.revolut.camerakit.ui.views.view.debug;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.camerakit.ui.models.R$id;
import com.revolut.camerakit.ui.models.R$layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/revolut/camerakit/ui/views/view/debug/CameraKitDebugOverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "visible", "", "setVisibility", "(Z)V", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitDebugOverlayView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitDebugOverlayHeaderView f50894b;
    public final CameraKitDebugRectsView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final TextView textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitDebugOverlayView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final TextView getTextView() {
        return this.textView;
    }

    public final void setVisibility(boolean visible) {
        int i = visible ? 0 : 8;
        this.textView.setVisibility(i);
        this.f.setVisibility(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitDebugOverlayView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitDebugOverlayView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.camera_kit_debug_overlay_view, this);
        View viewFindViewById = findViewById(R$id.cameraKitDebugHeaderView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50894b = (CameraKitDebugOverlayHeaderView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.cameraKitDebugRectsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (CameraKitDebugRectsView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.cameraKitDebugTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.textView = (TextView) viewFindViewById3;
    }

    public /* synthetic */ CameraKitDebugOverlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
