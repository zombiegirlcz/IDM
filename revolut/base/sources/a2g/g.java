package a2g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencePreview f835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f836c;
    public final boolean d;
    public final h e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f838h;

    public g(Data experience, TravelExperiencePreview travelExperiencePreview, List list, boolean z, h mode, boolean z3, boolean z4, Data reviews) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        this.f834a = experience;
        this.f835b = travelExperiencePreview;
        this.f836c = list;
        this.d = z;
        this.e = mode;
        this.f = z3;
        this.f837g = z4;
        this.f838h = reviews;
    }

    public static g a(g gVar, Data data, List list, boolean z, boolean z3, boolean z4, Data data2, int i) {
        if ((i & 1) != 0) {
            data = gVar.f834a;
        }
        Data experience = data;
        TravelExperiencePreview travelExperiencePreview = gVar.f835b;
        if ((i & 4) != 0) {
            list = gVar.f836c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        boolean z6 = z;
        h mode = gVar.e;
        boolean z11 = (i & 32) != 0 ? gVar.f : z3;
        boolean z12 = (i & 64) != 0 ? gVar.f837g : z4;
        Data reviews = (i & 128) != 0 ? gVar.f838h : data2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        return new g(experience, travelExperiencePreview, list2, z6, mode, z11, z12, reviews);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f834a, gVar.f834a) && Intrinsics.f(this.f835b, gVar.f835b) && Intrinsics.f(this.f836c, gVar.f836c) && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && this.f837g == gVar.f837g && Intrinsics.f(this.f838h, gVar.f838h);
    }

    public final int hashCode() {
        int iHashCode = this.f834a.hashCode() * 31;
        TravelExperiencePreview travelExperiencePreview = this.f835b;
        int iHashCode2 = (iHashCode + (travelExperiencePreview == null ? 0 : travelExperiencePreview.hashCode())) * 31;
        List list = this.f836c;
        return this.f838h.hashCode() + j6.a.c(j6.a.c((this.e.hashCode() + j6.a.c((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f), 31, this.f837g);
    }
}
