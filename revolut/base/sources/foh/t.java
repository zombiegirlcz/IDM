package foh;

import kotlin.jvm.internal.Intrinsics;
import xzg.l0;
import xzg.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f136981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f136982b;

    public t(l0 timeSpan, n0 filter) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f136981a = timeSpan;
        this.f136982b = filter;
    }

    public static t a(t tVar, l0 timeSpan, n0 filter, int i) {
        if ((i & 1) != 0) {
            timeSpan = tVar.f136981a;
        }
        if ((i & 2) != 0) {
            filter = tVar.f136982b;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new t(timeSpan, filter);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f136981a == tVar.f136981a && this.f136982b == tVar.f136982b;
    }

    public final int hashCode() {
        return this.f136982b.hashCode() + (this.f136981a.hashCode() * 31);
    }
}
