package bx0;

import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Video f19396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19398c;
    public final boolean d;
    public final boolean e;

    public b0(Video video, int i, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f19396a = video;
        this.f19397b = i;
        this.f19398c = z;
        this.d = z3;
        this.e = z4;
    }

    @Override // bx0.c0
    public final int a() {
        return this.f19397b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f19396a, b0Var.f19396a) && this.f19397b == b0Var.f19397b && this.f19398c == b0Var.f19398c && this.d == b0Var.d && this.e == b0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.b(this.f19397b, this.f19396a.hashCode() * 31, 31), 31, this.f19398c), 31, this.d);
    }
}
