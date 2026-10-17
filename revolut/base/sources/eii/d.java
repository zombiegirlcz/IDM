package eii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f126650a;

    public d(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f126650a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f126650a, ((d) obj2).f126650a);
    }

    public final int hashCode() {
        return this.f126650a.hashCode();
    }
}
