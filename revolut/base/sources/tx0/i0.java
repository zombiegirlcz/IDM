package tx0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f275157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f275158b;

    public i0(Image image, h0 size) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f275157a = image;
        this.f275158b = size;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f275157a, i0Var.f275157a) && this.f275158b == i0Var.f275158b;
    }

    public final int hashCode() {
        return this.f275158b.hashCode() + (this.f275157a.hashCode() * 31);
    }
}
