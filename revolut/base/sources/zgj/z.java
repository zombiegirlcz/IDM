package zgj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarMenuItem f322188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f322189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f322190c;

    public z(NavBarMenuItem navBarMenuItem, CountryImage countryImage, TextLocalisedClause textLocalisedClause) {
        this.f322188a = navBarMenuItem;
        this.f322189b = countryImage;
        this.f322190c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f322188a, zVar.f322188a) && Intrinsics.f(this.f322189b, zVar.f322189b) && Intrinsics.f(this.f322190c, zVar.f322190c);
    }

    public final int hashCode() {
        NavBarMenuItem navBarMenuItem = this.f322188a;
        int iHashCode = (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode()) * 31;
        Image image = this.f322189b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.f322190c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
