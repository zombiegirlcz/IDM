package rk3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f254737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f254738c;
    public final Clause d;
    public final List e;

    public k(Clause navBarDescription, Clause navBarTitle, Image image, List items, List suggestions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f254736a = items;
        this.f254737b = image;
        this.f254738c = navBarDescription;
        this.d = navBarTitle;
        this.e = suggestions;
    }

    @Override // cli.p
    public final List c() {
        return this.f254736a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f254736a, kVar.f254736a) && Intrinsics.f(this.f254737b, kVar.f254737b) && Intrinsics.f(this.f254738c, kVar.f254738c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f254736a.hashCode() * 31;
        Image image = this.f254737b;
        return this.e.hashCode() + p.a.a(p.a.a((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f254738c), 31, this.d);
    }
}
