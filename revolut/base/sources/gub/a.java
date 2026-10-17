package gub;

import aii.e;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsEarnOptionsScreenApi$InputData f146898a;

    public a(RevPointsEarnOptionsScreenApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f146898a = inputData;
    }

    public final RevPointsEarnOptionsScreenApi$InputData b() {
        return this.f146898a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f146898a, ((a) obj2).f146898a);
    }

    public final int hashCode() {
        return this.f146898a.hashCode();
    }
}
