package yy0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f317750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f317751b;

    public g(Clause contentDescription, Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f317750a = image;
        this.f317751b = contentDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f317750a, gVar.f317750a) && Intrinsics.f(this.f317751b, gVar.f317751b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getD() {
        return this.f317751b;
    }

    @Override // yy0.l
    public final Image getImage() {
        return this.f317750a;
    }

    public final int hashCode() {
        return this.f317751b.hashCode() + (this.f317750a.hashCode() * 31);
    }
}
