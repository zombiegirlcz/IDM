package yic;

import au0.b1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.k f314282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f314283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f314284c;
    public final Clause d;
    public final NavBarMenuItem e;
    public final Image f;

    public f(aw0.k kVar, TextLocalisedClause title, b1 titleStyle, TextLocalisedClause textLocalisedClause, LabelNavBarMenuItem labelNavBarMenuItem, CdnImage backgroundImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.f314282a = kVar;
        this.f314283b = title;
        this.f314284c = titleStyle;
        this.d = textLocalisedClause;
        this.e = labelNavBarMenuItem;
        this.f = backgroundImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f314282a, fVar.f314282a) && this.f314283b.equals(fVar.f314283b) && this.f314284c == fVar.f314284c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        aw0.k kVar = this.f314282a;
        int iHashCode = (this.f314284c.hashCode() + t61.a.a((kVar == null ? 0 : kVar.hashCode()) * 31, 31, this.f314283b)) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        NavBarMenuItem navBarMenuItem = this.e;
        return this.f.hashCode() + ((iHashCode2 + (navBarMenuItem != null ? navBarMenuItem.hashCode() : 0)) * 31);
    }
}
