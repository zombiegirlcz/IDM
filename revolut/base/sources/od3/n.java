package od3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f224284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f224285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f224286c;
    public final CdnImage d;

    public n(Clause navBarTitle, Clause navBarDescription, List navBarActions, CdnImage navBarEndImage) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(navBarActions, "navBarActions");
        Intrinsics.checkNotNullParameter(navBarEndImage, "navBarEndImage");
        this.f224284a = navBarTitle;
        this.f224285b = navBarDescription;
        this.f224286c = navBarActions;
        this.d = navBarEndImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f224284a, nVar.f224284a) && Intrinsics.f(this.f224285b, nVar.f224285b) && Intrinsics.f(this.f224286c, nVar.f224286c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.a(this.f224284a.hashCode() * 31, 31, this.f224285b), 31, this.f224286c);
    }
}
