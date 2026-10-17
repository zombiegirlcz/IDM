package ope;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227593a;

    public f(List soleResidencyCountries) {
        Intrinsics.checkNotNullParameter(soleResidencyCountries, "soleResidencyCountries");
        this.f227593a = soleResidencyCountries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f227593a, ((f) obj2).f227593a);
    }

    public final int hashCode() {
        return this.f227593a.hashCode();
    }
}
