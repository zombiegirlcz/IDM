package pcj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncj.d f234920a;

    public b(ncj.d priceTargetChartType) {
        Intrinsics.checkNotNullParameter(priceTargetChartType, "priceTargetChartType");
        this.f234920a = priceTargetChartType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f234920a == ((b) obj2).f234920a;
    }

    public final int hashCode() {
        return this.f234920a.hashCode();
    }
}
