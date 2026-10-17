package androidx.camera.core.internal;

import androidx.camera.core.ZoomState;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ImmutableZoomState implements ZoomState {
    public static ZoomState create(float f, float f4, float f5, float f6) {
        return new AutoValue_ImmutableZoomState(f, f4, f5, f6);
    }

    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();
}
