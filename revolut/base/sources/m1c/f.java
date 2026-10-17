package m1c;

import com.revolut.feature.rev_points.models.RevPointsRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsRichText f201360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f201361c;

    public f(String label, RevPointsRichText value, Double d) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f201359a = label;
        this.f201360b = value;
        this.f201361c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f201359a, fVar.f201359a) && Intrinsics.f(this.f201360b, fVar.f201360b) && Intrinsics.f(this.f201361c, fVar.f201361c);
    }

    public final int hashCode() {
        int iHashCode = (this.f201360b.hashCode() + (this.f201359a.hashCode() * 31)) * 31;
        Double d = this.f201361c;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
