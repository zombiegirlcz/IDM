package axi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarMenuItem f10963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f10964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f10965c;

    public p(NavBarMenuItem navBarMenuItem, CountryImage countryImage, TextLocalisedClause textLocalisedClause) {
        this.f10963a = navBarMenuItem;
        this.f10964b = countryImage;
        this.f10965c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f10963a, pVar.f10963a) && Intrinsics.f(this.f10964b, pVar.f10964b) && Intrinsics.f(this.f10965c, pVar.f10965c);
    }

    public final int hashCode() {
        NavBarMenuItem navBarMenuItem = this.f10963a;
        int iHashCode = (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode()) * 31;
        Image image = this.f10964b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.f10965c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
