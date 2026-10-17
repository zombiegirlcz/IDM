package h5f;

import kotlin.jvm.internal.Intrinsics;
import z0h.t1;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements t1h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f149547a;

    public a(t1 wealthDisclaimersData) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        this.f149547a = wealthDisclaimersData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f149547a, ((a) obj2).f149547a);
    }

    public final int hashCode() {
        return this.f149547a.hashCode();
    }
}
