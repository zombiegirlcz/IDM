package ni1;

import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexImage.Regular f215625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f215626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f215627c;

    public g(ComplexImage.Regular image, Clause title, Clause subtitle) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f215625a = image;
        this.f215626b = title;
        this.f215627c = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f215625a.equals(gVar.f215625a) && Intrinsics.f(this.f215626b, gVar.f215626b) && Intrinsics.f(this.f215627c, gVar.f215627c);
    }

    public final int hashCode() {
        return this.f215627c.hashCode() + p.a.a(this.f215625a.f55837a.hashCode() * 31, 31, this.f215626b);
    }
}
