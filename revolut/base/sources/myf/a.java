package myf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogistics;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceVisitors;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f210453c;
    public final TravelExperienceRatings d;
    public final TravelExperienceVisitors e;
    public final TravelExperiencesPricing f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f210454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f210455h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f210456j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TravelExperienceCancellationPolicy.Experience f210457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f210458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f210459n;
    public final TravelExperienceLogistics o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f210460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f210461q;

    public a(String id10, String name, List images, TravelExperienceRatings travelExperienceRatings, TravelExperienceVisitors visitors, TravelExperiencesPricing startingPrice, ArrayList additionalInformation, ArrayList arrayList, ArrayList arrayList2, String description, ArrayList tourSnapshot, TravelExperienceCancellationPolicy.Experience cancellationPolicy, List languages, List locations, TravelExperienceLogistics travelExperienceLogistics, m mVar, b0 b0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(visitors, "visitors");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tourSnapshot, "tourSnapshot");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f210451a = id10;
        this.f210452b = name;
        this.f210453c = images;
        this.d = travelExperienceRatings;
        this.e = visitors;
        this.f = startingPrice;
        this.f210454g = additionalInformation;
        this.f210455h = arrayList;
        this.i = arrayList2;
        this.f210456j = description;
        this.k = tourSnapshot;
        this.f210457l = cancellationPolicy;
        this.f210458m = languages;
        this.f210459n = locations;
        this.o = travelExperienceLogistics;
        this.f210460p = mVar;
        this.f210461q = b0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f210451a, aVar.f210451a) && Intrinsics.f(this.f210452b, aVar.f210452b) && Intrinsics.f(this.f210453c, aVar.f210453c) && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.f210454g.equals(aVar.f210454g) && Intrinsics.f(this.f210455h, aVar.f210455h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f210456j, aVar.f210456j) && this.k.equals(aVar.k) && this.f210457l.equals(aVar.f210457l) && Intrinsics.f(this.f210458m, aVar.f210458m) && Intrinsics.f(this.f210459n, aVar.f210459n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f210460p, aVar.f210460p) && Intrinsics.f(this.f210461q, aVar.f210461q);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f210451a.hashCode() * 31, 31, this.f210452b), 31, this.f210453c);
        TravelExperienceRatings travelExperienceRatings = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f210454g, (this.f.hashCode() + ((this.e.hashCode() + ((iD + (travelExperienceRatings == null ? 0 : travelExperienceRatings.hashCode())) * 31)) * 31)) * 31, 31);
        List list = this.f210455h;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iD2 = p.a.d(p.a.d((this.f210457l.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, p.a.c((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f210456j), 31)) * 31, 31, this.f210458m), 31, this.f210459n);
        TravelExperienceLogistics travelExperienceLogistics = this.o;
        int iHashCode2 = (iD2 + (travelExperienceLogistics == null ? 0 : travelExperienceLogistics.hashCode())) * 31;
        m mVar = this.f210460p;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        b0 b0Var = this.f210461q;
        return iHashCode3 + (b0Var != null ? b0Var.hashCode() : 0);
    }
}
