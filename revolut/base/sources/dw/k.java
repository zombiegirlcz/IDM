package dw;

import android.opengl.EGLSurface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f118193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118195c;

    public k(EGLSurface eglSurface, int i, int i2) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        this.f118193a = eglSurface;
        this.f118194b = i;
        this.f118195c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f118193a, kVar.f118193a) && this.f118194b == kVar.f118194b && this.f118195c == kVar.f118195c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f118195c) + j6.a.b(this.f118194b, this.f118193a.hashCode() * 31, 31);
    }
}
