package ry5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce9.p f258227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258228b;

    public f() {
        this((ce9.p) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f258227a, fVar.f258227a) && Intrinsics.f(this.f258228b, fVar.f258228b);
    }

    public final int hashCode() {
        return this.f258228b.hashCode() + (this.f258227a.hashCode() * 31);
    }

    public f(ce9.p pagingState, String query) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f258227a = pagingState;
        this.f258228b = query;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(ce9.p pVar, int i) {
        pVar = (i & 1) != 0 ? new ce9.p(null, null, 61) : pVar;
        m70.a.c(t0.f186434a);
        this(pVar, "");
    }
}
