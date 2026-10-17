package nml;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f217381a;

    public h(wi0.b countrySelected) {
        Intrinsics.checkNotNullParameter(countrySelected, "countrySelected");
        this.f217381a = countrySelected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f217381a, ((h) obj2).f217381a);
    }

    public final int hashCode() {
        return this.f217381a.f297794a.hashCode();
    }
}
