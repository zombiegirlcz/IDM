package cui;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarMenuItem f109019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f109020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f109021c;

    public q(NavBarMenuItem navBarMenuItem, CountryImage countryImage, TextLocalisedClause textLocalisedClause) {
        this.f109019a = navBarMenuItem;
        this.f109020b = countryImage;
        this.f109021c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f109019a, qVar.f109019a) && Intrinsics.f(this.f109020b, qVar.f109020b) && Intrinsics.f(this.f109021c, qVar.f109021c);
    }

    public final int hashCode() {
        NavBarMenuItem navBarMenuItem = this.f109019a;
        int iHashCode = (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode()) * 31;
        Image image = this.f109020b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.f109021c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
