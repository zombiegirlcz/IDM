package dy0;

import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableViewTarget f121006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HomeOverlayConfig f121008c;

    public p0(ParcelableViewTarget target, boolean z, HomeOverlayConfig homeOverlayConfig) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f121006a = target;
        this.f121007b = z;
        this.f121008c = homeOverlayConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f121006a.equals(p0Var.f121006a) && this.f121007b == p0Var.f121007b && Intrinsics.f(this.f121008c, p0Var.f121008c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f121006a.hashCode() * 31, 31, this.f121007b);
        HomeOverlayConfig homeOverlayConfig = this.f121008c;
        return iC + (homeOverlayConfig == null ? 0 : Boolean.hashCode(homeOverlayConfig.f59655a));
    }
}
