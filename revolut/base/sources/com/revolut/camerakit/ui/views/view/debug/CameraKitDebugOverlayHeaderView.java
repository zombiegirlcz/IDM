package com.revolut.camerakit.ui.views.view.debug;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.GestureDetectorCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ukm.f;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/camerakit/ui/views/view/debug/CameraKitDebugOverlayHeaderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitDebugOverlayHeaderView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f50892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GestureDetectorCompat f50893b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitDebugOverlayHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f50893b.onTouchEvent(event);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitDebugOverlayHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitDebugOverlayHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50892a = q.b(0, 2, f.DROP_OLDEST);
        this.f50893b = new GestureDetectorCompat(context, new bx0.q(this, 11), new Handler(Looper.getMainLooper()));
    }

    public /* synthetic */ CameraKitDebugOverlayHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
