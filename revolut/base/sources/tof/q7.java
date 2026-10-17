package tof;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273011a;

    public q7(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f273011a = filters;
        if (filters.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("AND filter should contains at least one filter");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar = rd0.c.ERROR;
            rd0.d.a(cVar, null, null, illegalStateException, h0Var);
            rd0.d.a(cVar, null, null, illegalStateException, h0Var);
        }
    }

    public final List a() {
        return this.f273011a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q7) && Intrinsics.f(this.f273011a, ((q7) obj2).f273011a);
    }

    public final int hashCode() {
        return this.f273011a.hashCode();
    }
}
