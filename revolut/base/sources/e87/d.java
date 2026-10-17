package e87;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f123608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f123610c;
    public final Clause d;
    public final TextClause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f123611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InstrumentImage f123612h;

    public d(ArrayList tabs, String str, TextClause title, TextClause textClause, TextClause toolbarTitle, Clause toolbarSubtitle, List navBarMenuIcons, InstrumentImage image) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(navBarMenuIcons, "navBarMenuIcons");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f123608a = tabs;
        this.f123609b = str;
        this.f123610c = title;
        this.d = textClause;
        this.e = toolbarTitle;
        this.f = toolbarSubtitle;
        this.f123611g = navBarMenuIcons;
        this.f123612h = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f123608a.equals(dVar.f123608a) && Intrinsics.f(this.f123609b, dVar.f123609b) && this.f123610c.equals(dVar.f123610c) && Intrinsics.f(this.d, dVar.d) && this.e.equals(dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f123611g, dVar.f123611g) && this.f123612h.equals(dVar.f123612h);
    }

    public final int hashCode() {
        int iHashCode = this.f123608a.hashCode() * 31;
        String str = this.f123609b;
        int iB = v7.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123610c);
        Clause clause = this.d;
        return this.f123612h.hashCode() + p.a.d(p.a.a(v7.b((iB + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.f123611g);
    }
}
