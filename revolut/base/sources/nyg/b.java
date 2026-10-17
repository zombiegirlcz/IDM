package nyg;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vyg.c f220870a;

    public b(vyg.c selectedTimeframe) {
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        this.f220870a = selectedTimeframe;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f220870a == ((b) obj2).f220870a;
    }

    public final int hashCode() {
        return this.f220870a.hashCode();
    }
}
