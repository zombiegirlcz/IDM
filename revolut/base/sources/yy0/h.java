package yy0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f317752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f317753b;

    public h(Clause contentDescription, Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f317752a = image;
        this.f317753b = contentDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f317752a, hVar.f317752a) && this.f317753b.equals(hVar.f317753b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getD() {
        return this.f317753b;
    }

    @Override // yy0.l
    public final Image getImage() {
        return this.f317752a;
    }

    public final int hashCode() {
        return this.f317753b.hashCode() + (this.f317752a.hashCode() * 31);
    }
}
