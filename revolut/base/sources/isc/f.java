package isc;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import h30.l;
import kotlin.jvm.internal.Intrinsics;
import vrc.k;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f168178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f168179c;
    public final AnalyticsProduct d;
    public final Clause e;

    public f(String legalEntityId, Integer num, k purpose, AnalyticsProduct analyticsProduct, Clause clause) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f168177a = legalEntityId;
        this.f168178b = num;
        this.f168179c = purpose;
        this.d = analyticsProduct;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f168177a, fVar.f168177a) && Intrinsics.f(this.f168178b, fVar.f168178b) && this.f168179c == fVar.f168179c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f168177a.hashCode() * 31;
        Integer num = this.f168178b;
        int iA = l.a((this.f168179c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.d);
        Clause clause = this.e;
        return iA + (clause != null ? clause.hashCode() : 0);
    }
}
