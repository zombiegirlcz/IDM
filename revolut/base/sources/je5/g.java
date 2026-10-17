package je5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce9.p f173216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173217b;

    public g() {
        this((ce9.p) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f173216a, gVar.f173216a) && Intrinsics.f(this.f173217b, gVar.f173217b);
    }

    public final int hashCode() {
        return this.f173217b.hashCode() + (this.f173216a.hashCode() * 31);
    }

    public g(ce9.p pagingState, String query) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f173216a = pagingState;
        this.f173217b = query;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(ce9.p pVar, int i) {
        pVar = (i & 1) != 0 ? new ce9.p(null, null, 61) : pVar;
        m70.a.c(t0.f186434a);
        this(pVar, "");
    }
}
