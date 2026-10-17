package z32;

import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f319121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RawCutoutImageBadge f319122c;
    public final String d;

    public b(aim.e items, Image image, RawCutoutImageBadge badge, String subtitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f319120a = items;
        this.f319121b = image;
        this.f319122c = badge;
        this.d = subtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f319120a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319120a, bVar.f319120a) && Intrinsics.f(this.f319121b, bVar.f319121b) && this.f319122c.equals(bVar.f319122c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a10.b.c(this.f319122c.f58064a, a10.b.c(this.f319121b, this.f319120a.hashCode() * 31, 31), 31);
    }
}
