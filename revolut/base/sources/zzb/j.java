package zzb;

import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationPreferencesResponse f326653a;

    public j(RevPointsPersonalisationPreferencesResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f326653a = response;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f326653a, ((j) obj2).f326653a);
    }

    public final int hashCode() {
        return this.f326653a.hashCode();
    }
}
