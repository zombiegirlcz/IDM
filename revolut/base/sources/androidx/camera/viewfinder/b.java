package androidx.camera.viewfinder;

import android.view.PixelCopy;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements PixelCopy.OnPixelCopyFinishedListener {
    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        SurfaceViewImplementation.lambda$getViewfinderBitmap$2(i);
    }
}
