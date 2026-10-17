package io.fotoapparat.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import hbm.a;
import hbm.b;
import hbm.c;
import hbm.d;
import hbm.e;
import io.fotoapparat.exception.camera.UnavailableSurfaceException;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uam.i;
import uam.j;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/fotoapparat/view/CameraView;", "Landroid/widget/FrameLayout;", "Lhbm/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lhbm/c;", "getPreviewAfterLatch", "()Lhbm/c;", "Luam/j;", "scaleType", "", "setScaleType", "(Luam/j;)V", "Luam/i;", "resolution", "setPreviewResolution", "(Luam/i;)V", "Lhbm/d;", "getPreview", "()Lhbm/d;", "fotoapparat_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CameraView extends FrameLayout implements a {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f162987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f162988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f162989c;
    public SurfaceTexture d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final c getPreviewAfterLatch() throws InterruptedException {
        this.f162987a.await();
        SurfaceTexture surfaceTexture = this.d;
        if (surfaceTexture == null) {
            throw new UnavailableSurfaceException();
        }
        Intrinsics.checkNotNullParameter(surfaceTexture, "<this>");
        return new c(surfaceTexture);
    }

    @Override // hbm.a
    @NotNull
    public d getPreview() {
        SurfaceTexture surfaceTexture = this.d;
        if (surfaceTexture == null) {
            return getPreviewAfterLatch();
        }
        Intrinsics.checkNotNullParameter(surfaceTexture, "<this>");
        return new c(surfaceTexture);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f162987a.countDown();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        i iVar;
        j jVar;
        if (isInEditMode() || (iVar = this.f162988b) == null || (jVar = this.f162989c) == null) {
            super.onLayout(z, i, i2, i3, i5);
            return;
        }
        int i6 = iVar.f278699b;
        int i21 = iVar.f278698a;
        int i22 = b.f150759a[jVar.ordinal()];
        if (i22 == 1) {
            float f = i21;
            float f4 = i6;
            float fMin = Math.min(getMeasuredWidth() / f, getMeasuredHeight() / f4);
            int i32 = (int) (f * fMin);
            int i33 = (int) (f4 * fMin);
            int iMax = Math.max(0, getMeasuredWidth() - i32) / 2;
            int iMax2 = Math.max(0, getMeasuredHeight() - i33) / 2;
            yoj.b.o(this, new Rect(iMax, iMax2, i32 + iMax, i33 + iMax2));
            Unit unit = Unit.f186387a;
            return;
        }
        if (i22 == 2) {
            float f5 = i21;
            float f6 = i6;
            float fMax = Math.max(getMeasuredWidth() / f5, getMeasuredHeight() / f6);
            int i43 = (int) (f5 * fMax);
            int i59 = (int) (f6 * fMax);
            int iMax3 = Math.max(0, i43 - getMeasuredWidth());
            int iMax4 = Math.max(0, i59 - getMeasuredHeight());
            yoj.b.o(this, new Rect((-iMax3) / 2, (-iMax4) / 2, i43 - (iMax3 / 2), i59 - (iMax4 / 2)));
            Unit unit2 = Unit.f186387a;
            return;
        }
        if (i22 != 3) {
            return;
        }
        float f32 = i21;
        float f35 = i6;
        float fMax2 = Math.max(getMeasuredWidth() / f32, getMeasuredHeight() / f35);
        int i66 = (int) (f32 * fMax2);
        int i74 = (int) (f35 * fMax2);
        int iMax5 = Math.max(0, i66 - getMeasuredWidth());
        yoj.b.o(this, new Rect((-iMax5) / 2, 0, i66 - (iMax5 / 2), i74));
        Unit unit3 = Unit.f186387a;
    }

    @Override // hbm.a
    public void setPreviewResolution(@NotNull i resolution) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        post(new d0.c(this, resolution, 19));
    }

    @Override // hbm.a
    public void setScaleType(@NotNull j scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f162989c = scaleType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CameraView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f162987a = new CountDownLatch(1);
        TextureView textureView = new TextureView(context);
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture == null) {
            textureView.setSurfaceTextureListener(new e(new c2m.b(this, 3)));
            surfaceTexture = null;
        }
        this.d = surfaceTexture;
        addView(textureView);
    }
}
