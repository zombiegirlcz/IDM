package zyf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFeature;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import myf.j;
import qzf.t;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f326456a = r0.k(new Pair("EQUIPMENT", j.EQUIPMENT), new Pair("FOOD_AND_DRINK", j.FOOD_AND_DRINK), new Pair("TRANSPORT_AMENITIES", j.TRANSPORT_AMENITIES), new Pair("FEES_AND_TAXES", j.FEES_AND_TAXES), new Pair("SOUVENIRS", j.SOUVENIRS), new Pair("OTHER", j.OTHER));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperienceFeature a(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        return new TravelExperienceFeature((j) u1.u(tVar.getCategory(), f326456a), tVar.getLabel(), tVar.getQuantity());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperienceFeature b(rzf.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new TravelExperienceFeature((j) u1.u(jVar.getCategory(), f326456a), jVar.getLabel(), jVar.getQuantity());
    }
}
