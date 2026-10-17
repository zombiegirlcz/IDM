package tof;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class oa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272973a;

    public oa(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f272973a = filters;
        if (filters.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("Or filter should contains at least one filter");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
    }

    public final List a() {
        return this.f272973a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof oa) && Intrinsics.f(this.f272973a, ((oa) obj2).f272973a);
    }

    public final int hashCode() {
        return this.f272973a.hashCode();
    }
}
