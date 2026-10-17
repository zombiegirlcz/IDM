package bx0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f19476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19478c;

    public z(int i, Image image, boolean z) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f19476a = image;
        this.f19477b = i;
        this.f19478c = z;
    }

    @Override // bx0.c0
    public final int a() {
        return this.f19477b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f19476a, zVar.f19476a) && this.f19477b == zVar.f19477b && this.f19478c == zVar.f19478c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19478c) + j6.a.b(this.f19477b, this.f19476a.hashCode() * 31, 31);
    }
}
