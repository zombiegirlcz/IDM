package androidx.camera.viewfinder;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.viewfinder.ViewfinderSurfaceRequest;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_ViewfinderSurfaceRequest_Result extends ViewfinderSurfaceRequest.Result {
    private final int resultCode;
    private final Surface surface;

    public AutoValue_ViewfinderSurfaceRequest_Result(int i, Surface surface) {
        this.resultCode = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof ViewfinderSurfaceRequest.Result) {
            ViewfinderSurfaceRequest.Result result = (ViewfinderSurfaceRequest.Result) obj2;
            if (this.resultCode == result.getResultCode() && this.surface.equals(result.getSurface())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.viewfinder.ViewfinderSurfaceRequest.Result
    public int getResultCode() {
        return this.resultCode;
    }

    @Override // androidx.camera.viewfinder.ViewfinderSurfaceRequest.Result
    @NonNull
    public Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((this.resultCode ^ 1000003) * 1000003) ^ this.surface.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.resultCode + ", surface=" + this.surface + "}";
    }
}
