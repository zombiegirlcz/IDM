package zzb;

import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandsResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationBrandsResponse f326652a;

    public i(RevPointsPersonalisationBrandsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f326652a = response;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f326652a, ((i) obj2).f326652a);
    }

    public final int hashCode() {
        return this.f326652a.hashCode();
    }
}
