package m1c;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201423c;
    public final RevPointsTextWithLinks d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f201424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f201425h;

    public o(String id10, String title, String subtitle, RevPointsTextWithLinks description, String assetUrl, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        this.f201421a = id10;
        this.f201422b = title;
        this.f201423c = subtitle;
        this.d = description;
        this.e = assetUrl;
        this.f = str;
        this.f201424g = str2;
        this.f201425h = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f201421a, oVar.f201421a) && Intrinsics.f(this.f201422b, oVar.f201422b) && Intrinsics.f(this.f201423c, oVar.f201423c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f201424g, oVar.f201424g) && Intrinsics.f(this.f201425h, oVar.f201425h);
    }

    public final int hashCode() {
        int iC = p.a.c((this.d.hashCode() + p.a.c(p.a.c(this.f201421a.hashCode() * 31, 31, this.f201422b), 31, this.f201423c)) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f201424g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f201425h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
