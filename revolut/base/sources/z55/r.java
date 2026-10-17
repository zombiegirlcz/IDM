package z55;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f319507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f319508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f319509c;
    public final Clause d;

    public r(LayeredImage image, Clause title, Clause toolbarTitle, Clause description) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f319507a = image;
        this.f319508b = title;
        this.f319509c = toolbarTitle;
        this.d = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f319507a.equals(rVar.f319507a) && this.f319508b.equals(rVar.f319508b) && this.f319509c.equals(rVar.f319509c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b(p.a.b(this.f319507a.hashCode() * 31, 31, this.f319508b), 31, this.f319509c);
    }
}
