package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f209929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountryImage f209930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f209931c;
    public final o7 d;
    public final CdnImage e;
    public final l7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l7 f209932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l7 f209933h;
    public final l7 i;

    public p7(Image background, CountryImage documentCountryIcon, Clause documentType, o7 tag2, CdnImage photo, l7 l7Var, l7 documentNumber, l7 l7Var2, l7 l7Var3) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(documentCountryIcon, "documentCountryIcon");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        this.f209929a = background;
        this.f209930b = documentCountryIcon;
        this.f209931c = documentType;
        this.d = tag2;
        this.e = photo;
        this.f = l7Var;
        this.f209932g = documentNumber;
        this.f209933h = l7Var2;
        this.i = l7Var3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj2;
        return this.f209929a.equals(p7Var.f209929a) && this.f209930b.equals(p7Var.f209930b) && Intrinsics.f(this.f209931c, p7Var.f209931c) && this.d.equals(p7Var.d) && this.e.equals(p7Var.e) && Intrinsics.f(this.f, p7Var.f) && this.f209932g.equals(p7Var.f209932g) && Intrinsics.f(this.f209933h, p7Var.f209933h) && Intrinsics.f(this.i, p7Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + p.a.a((this.f209930b.hashCode() + (this.f209929a.hashCode() * 31)) * 31, 31, this.f209931c)) * 31)) * 31;
        l7 l7Var = this.f;
        int iHashCode2 = (this.f209932g.hashCode() + ((iHashCode + (l7Var == null ? 0 : l7Var.hashCode())) * 31)) * 31;
        l7 l7Var2 = this.f209933h;
        int iHashCode3 = (iHashCode2 + (l7Var2 == null ? 0 : l7Var2.hashCode())) * 31;
        l7 l7Var3 = this.i;
        return iHashCode3 + (l7Var3 != null ? l7Var3.hashCode() : 0);
    }
}
