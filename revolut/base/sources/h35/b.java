package h35;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerDelegate.Model f149036a;

    public b(BannerDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f149036a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f149036a, ((b) obj2).f149036a);
    }

    public final int hashCode() {
        return this.f149036a.hashCode();
    }
}
