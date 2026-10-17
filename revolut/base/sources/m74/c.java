package m74;

import ip0.vd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f203311a;

    public c(vd clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f203311a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f203311a, ((c) obj2).f203311a);
    }

    public final int hashCode() {
        return this.f203311a.hashCode();
    }
}
