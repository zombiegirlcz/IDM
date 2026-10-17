package yld;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he3.j f314698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f314699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f314700c;
    public final boolean d;

    public i(he3.j group, Clause title, Image smallIcon, boolean z) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        this.f314698a = group;
        this.f314699b = title;
        this.f314700c = smallIcon;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f314698a, iVar.f314698a) && this.f314699b.equals(iVar.f314699b) && this.f314700c.equals(iVar.f314700c) && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a10.b.c(this.f314700c, p.a.a(this.f314698a.hashCode() * 31, 31, this.f314699b), 31);
    }
}
