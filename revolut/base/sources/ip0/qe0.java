package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qe0 extends ve0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f165969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f165970b;

    public qe0(int i, Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f165969a = image;
        this.f165970b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qe0)) {
            return false;
        }
        qe0 qe0Var = (qe0) obj2;
        return Intrinsics.f(this.f165969a, qe0Var.f165969a) && this.f165970b == qe0Var.f165970b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f165970b) + (this.f165969a.hashCode() * 31);
    }
}
