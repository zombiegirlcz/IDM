package an;

import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0.a f6506a;

    public h(p0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f6506a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f6506a, ((h) obj2).f6506a);
    }

    public final int hashCode() {
        return this.f6506a.hashCode();
    }
}
