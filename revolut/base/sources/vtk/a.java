package vtk;

import kotlin.jvm.internal.Intrinsics;
import mel.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f292128a;

    public a(e ratingsDistribution) {
        Intrinsics.checkNotNullParameter(ratingsDistribution, "ratingsDistribution");
        this.f292128a = ratingsDistribution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f292128a, ((a) obj2).f292128a);
    }

    public final int hashCode() {
        return this.f292128a.hashCode();
    }
}
