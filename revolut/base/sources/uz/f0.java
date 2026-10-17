package uz;

import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f284514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f284515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f284516c;
    public final rz.u d;
    public final float e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f284517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f284518h;

    public f0(y maskState, j faceDetectionState, Path computedFaceMaskPath, rz.u viewLocationOnScreen, float f, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(maskState, "maskState");
        Intrinsics.checkNotNullParameter(faceDetectionState, "faceDetectionState");
        Intrinsics.checkNotNullParameter(computedFaceMaskPath, "computedFaceMaskPath");
        Intrinsics.checkNotNullParameter(viewLocationOnScreen, "viewLocationOnScreen");
        this.f284514a = maskState;
        this.f284515b = faceDetectionState;
        this.f284516c = computedFaceMaskPath;
        this.d = viewLocationOnScreen;
        this.e = f;
        this.f = i;
        this.f284517g = i2;
        this.f284518h = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f284514a == f0Var.f284514a && Intrinsics.f(this.f284515b, f0Var.f284515b) && Intrinsics.f(this.f284516c, f0Var.f284516c) && Intrinsics.f(this.d, f0Var.d) && Float.compare(this.e, f0Var.e) == 0 && this.f == f0Var.f && this.f284517g == f0Var.f284517g && this.f284518h == f0Var.f284518h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284518h) + j6.a.b(this.f284517g, j6.a.b(this.f, m72.b.b(this.e, (this.d.hashCode() + ((this.f284516c.hashCode() + ((this.f284515b.hashCode() + (this.f284514a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31);
    }
}
