package androidx.camera.viewfinder;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
abstract class ViewfinderImplementation {

    @NonNull
    protected final FrameLayout mParent;
    protected Size mResolution;

    @NonNull
    private final ViewfinderTransformation mViewfinderTransformation;
    private boolean mWasSurfaceProvided = false;

    public ViewfinderImplementation(@NonNull FrameLayout frameLayout, @NonNull ViewfinderTransformation viewfinderTransformation) {
        this.mParent = frameLayout;
        this.mViewfinderTransformation = viewfinderTransformation;
    }

    public Bitmap getBitmap() {
        Bitmap viewfinderBitmap = getViewfinderBitmap();
        if (viewfinderBitmap == null) {
            return null;
        }
        return this.mViewfinderTransformation.createTransformedBitmap(viewfinderBitmap, new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection());
    }

    public abstract View getViewfinder();

    public abstract Bitmap getViewfinderBitmap();

    public abstract void onAttachedToWindow();

    public abstract void onDetachedFromWindow();

    public void onSurfaceProvided() {
        this.mWasSurfaceProvided = true;
        redrawViewfinder();
    }

    public abstract void onSurfaceRequested(@NonNull ViewfinderSurfaceRequest viewfinderSurfaceRequest);

    public void redrawViewfinder() {
        View viewfinder = getViewfinder();
        if (viewfinder == null || !this.mWasSurfaceProvided) {
            return;
        }
        this.mViewfinderTransformation.transformView(new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection(), viewfinder);
    }
}
