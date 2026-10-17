package n8f;

import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarLargeCentred.Model f213375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f213376b;

    public k(NavBarLargeCentred.Model navBarModel, Image image) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f213375a = navBarModel;
        this.f213376b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f213375a, kVar.f213375a) && Intrinsics.f(this.f213376b, kVar.f213376b);
    }

    public final int hashCode() {
        return this.f213376b.hashCode() + (this.f213375a.hashCode() * 31);
    }
}
