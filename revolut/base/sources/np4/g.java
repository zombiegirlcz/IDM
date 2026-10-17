package np4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.e f218132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f218133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f218134c;
    public final NavBarMenuItem d;
    public final List e;

    public g(aw0.e actionFooterModel, TextLocalisedClause title, ResourceImage resourceImage, TextNavBarMenuItem textNavBarMenuItem, List items) {
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218132a = actionFooterModel;
        this.f218133b = title;
        this.f218134c = resourceImage;
        this.d = textNavBarMenuItem;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f218132a.equals(gVar.f218132a) && this.f218133b.equals(gVar.f218133b) && this.f218134c.equals(gVar.f218134c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iB = org.bouncycastle.jcajce.provider.digest.a.b(this.f218134c, t61.a.a(this.f218132a.hashCode() * 31, 31, this.f218133b), 31);
        NavBarMenuItem navBarMenuItem = this.d;
        return this.e.hashCode() + ((iB + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode())) * 31);
    }
}
