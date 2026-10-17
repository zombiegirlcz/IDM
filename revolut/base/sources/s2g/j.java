package s2g;

import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.g f259312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pyf.c f259313c;
    public final pyf.d d;
    public final TravelExperienceOptionSelectionV2 e;
    public final boolean f;

    public j(List paymentOptionDetailsExpandedList, lk0.g gVar, pyf.c dateFilter, pyf.d visitorsFilter, TravelExperienceOptionSelectionV2 optionSelection, boolean z) {
        Intrinsics.checkNotNullParameter(paymentOptionDetailsExpandedList, "paymentOptionDetailsExpandedList");
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        Intrinsics.checkNotNullParameter(visitorsFilter, "visitorsFilter");
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        this.f259311a = paymentOptionDetailsExpandedList;
        this.f259312b = gVar;
        this.f259313c = dateFilter;
        this.d = visitorsFilter;
        this.e = optionSelection;
        this.f = z;
    }

    public static j a(j jVar, List list, lk0.g gVar, pyf.c cVar, pyf.d dVar, TravelExperienceOptionSelectionV2 travelExperienceOptionSelectionV2, boolean z, int i) {
        if ((i & 1) != 0) {
            list = jVar.f259311a;
        }
        List paymentOptionDetailsExpandedList = list;
        if ((i & 2) != 0) {
            gVar = jVar.f259312b;
        }
        lk0.g gVar2 = gVar;
        if ((i & 4) != 0) {
            cVar = jVar.f259313c;
        }
        pyf.c dateFilter = cVar;
        if ((i & 8) != 0) {
            dVar = jVar.d;
        }
        pyf.d visitorsFilter = dVar;
        if ((i & 16) != 0) {
            travelExperienceOptionSelectionV2 = jVar.e;
        }
        TravelExperienceOptionSelectionV2 optionSelection = travelExperienceOptionSelectionV2;
        if ((i & 32) != 0) {
            z = jVar.f;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(paymentOptionDetailsExpandedList, "paymentOptionDetailsExpandedList");
        Intrinsics.checkNotNullParameter(dateFilter, "dateFilter");
        Intrinsics.checkNotNullParameter(visitorsFilter, "visitorsFilter");
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        return new j(paymentOptionDetailsExpandedList, gVar2, dateFilter, visitorsFilter, optionSelection, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f259311a, jVar.f259311a) && Intrinsics.f(this.f259312b, jVar.f259312b) && Intrinsics.f(this.f259313c, jVar.f259313c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f259311a.hashCode() * 31;
        lk0.g gVar = this.f259312b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f259313c.f240824b.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31)) * 31)) * 31)) * 31);
    }
}
