package com.revolut.camerakit.ui.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.n1;
import org.jetbrains.annotations.NotNull;
import rz.u;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/revolut/camerakit/ui/views/view/CameraKitPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lrz/u;", "getAbsolutePreviewLocation", "()Lrz/u;", "Landroidx/camera/view/PreviewView;", "value", "c", "Landroidx/camera/view/PreviewView;", "getCurrentPreview$camera_kit_ui_views_release", "()Landroidx/camera/view/PreviewView;", "currentPreview", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitPreviewView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile u f50856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f50857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public PreviewView currentPreview;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitPreviewView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: getAbsolutePreviewLocation, reason: from getter */
    public final u getF50856a() {
        return this.f50856a;
    }

    /* JADX INFO: renamed from: getCurrentPreview$camera_kit_ui_views_release, reason: from getter */
    public final PreviewView getCurrentPreview() {
        return this.currentPreview;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitPreviewView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitPreviewView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50857b = new int[2];
        getViewTreeObserver().addOnGlobalLayoutListener(new n1(this, 2));
    }

    public /* synthetic */ CameraKitPreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
