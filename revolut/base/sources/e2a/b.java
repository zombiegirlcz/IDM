package e2a;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f122044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f122045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f122046c;

    public b(UrlImage left, UrlImage center, UrlImage right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(right, "right");
        this.f122044a = left;
        this.f122045b = center;
        this.f122046c = right;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f122044a.equals(bVar.f122044a) && this.f122045b.equals(bVar.f122045b) && this.f122046c.equals(bVar.f122046c);
    }

    public final int hashCode() {
        return this.f122046c.hashCode() + v7.g(this.f122045b, this.f122044a.hashCode() * 31, 31);
    }
}
