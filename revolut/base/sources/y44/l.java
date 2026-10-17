package y44;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f310781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f310782c;
    public final Image d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f310783g;

    public l(List items, TextLocalisedClause navBarTitle, TextLocalisedClause textLocalisedClause, Image image, Clause navBarSecondDescription, Clause buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarSecondDescription, "navBarSecondDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f310780a = items;
        this.f310781b = navBarTitle;
        this.f310782c = textLocalisedClause;
        this.d = image;
        this.e = navBarSecondDescription;
        this.f = buttonText;
        this.f310783g = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f310780a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f310780a, lVar.f310780a) && this.f310781b.equals(lVar.f310781b) && Intrinsics.f(this.f310782c, lVar.f310782c) && Intrinsics.f(this.d, lVar.d) && this.e.equals(lVar.e) && this.f.equals(lVar.f) && this.f310783g == lVar.f310783g;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f310780a.hashCode() * 31, 31, this.f310781b);
        Clause clause = this.f310782c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        return Boolean.hashCode(this.f310783g) + p.a.b(p.a.b((iHashCode + (image != null ? image.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }
}
