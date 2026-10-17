package aw7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu7.k f10739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f10740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f10741c;

    public g(bu7.k coverageGroup, Data planComparison, f fVar) {
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        Intrinsics.checkNotNullParameter(planComparison, "planComparison");
        this.f10739a = coverageGroup;
        this.f10740b = planComparison;
        this.f10741c = fVar;
    }

    public static g a(g gVar, Data planComparison, f fVar, int i) {
        bu7.k coverageGroup = gVar.f10739a;
        if ((i & 2) != 0) {
            planComparison = gVar.f10740b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        Intrinsics.checkNotNullParameter(planComparison, "planComparison");
        return new g(coverageGroup, planComparison, fVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f10739a == gVar.f10739a && Intrinsics.f(this.f10740b, gVar.f10740b) && Intrinsics.f(this.f10741c, gVar.f10741c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f10740b, this.f10739a.hashCode() * 31, 31);
        f fVar = this.f10741c;
        return iC + (fVar == null ? 0 : fVar.hashCode());
    }
}
