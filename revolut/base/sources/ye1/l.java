package ye1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f312754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextImage f312755c;
    public final TextLocalisedClause d;
    public final boolean e;

    public l(List items, TextLocalisedClause toolbarTitle, TextImage toolbarIcon, TextLocalisedClause ctaTitle, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarIcon, "toolbarIcon");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        this.f312753a = items;
        this.f312754b = toolbarTitle;
        this.f312755c = toolbarIcon;
        this.d = ctaTitle;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f312753a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f312753a, lVar.f312753a) && this.f312754b.equals(lVar.f312754b) && this.f312755c.equals(lVar.f312755c) && this.d.equals(lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a((this.f312755c.hashCode() + t61.a.a(this.f312753a.hashCode() * 31, 31, this.f312754b)) * 31, 31, this.d);
    }
}
