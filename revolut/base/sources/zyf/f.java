package zyf;

import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qzf.j0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f326460a = r0.k(new Pair("ADULT", myf.b.ADULT), new Pair("CHILD", myf.b.CHILD), new Pair("INFANT", myf.b.INFANT), new Pair("YOUTH", myf.b.YOUTH), new Pair("SENIOR", myf.b.SENIOR), new Pair("VISITOR", myf.b.VISITOR));

    public static final TravelExperienceRatings a(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        return new TravelExperienceRatings(j0Var.getCount(), j0Var.getAverageScore());
    }
}
