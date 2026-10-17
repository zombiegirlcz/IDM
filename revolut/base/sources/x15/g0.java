package x15;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import zh9.i0;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f302274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f302275b;

    public g0(i0 payLater, Image productIcon) {
        Intrinsics.checkNotNullParameter(payLater, "payLater");
        Intrinsics.checkNotNullParameter(productIcon, "productIcon");
        this.f302274a = payLater;
        this.f302275b = productIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f302274a, g0Var.f302274a) && Intrinsics.f(this.f302275b, g0Var.f302275b);
    }

    public final int hashCode() {
        return this.f302275b.hashCode() + (this.f302274a.hashCode() * 31);
    }
}
