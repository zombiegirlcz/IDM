package hbm;

import android.graphics.SurfaceTexture;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceTexture f150760a;

    public c(SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.f150760a = surfaceTexture;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f150760a, ((c) obj2).f150760a);
    }

    public final int hashCode() {
        return this.f150760a.hashCode();
    }

    public final String toString() {
        return "Texture(surfaceTexture=" + this.f150760a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
