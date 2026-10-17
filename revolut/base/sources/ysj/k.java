package ysj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316489c;
    public final String d;
    public final long e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f316490g;

    public k(String id10, String incomeSorterId, String state, String sourceTransactionId, long j2, List destinations, j jVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sourceTransactionId, "sourceTransactionId");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f316487a = id10;
        this.f316488b = incomeSorterId;
        this.f316489c = state;
        this.d = sourceTransactionId;
        this.e = j2;
        this.f = destinations;
        this.f316490g = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f316487a, kVar.f316487a) && Intrinsics.f(this.f316488b, kVar.f316488b) && Intrinsics.f(this.f316489c, kVar.f316489c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f316490g, kVar.f316490g);
    }

    public final int hashCode() {
        int iD = p.a.d(a0.d.c(p.a.c(p.a.c(p.a.c(this.f316487a.hashCode() * 31, 31, this.f316488b), 31, this.f316489c), 31, this.d), 31, this.e), 31, this.f);
        j jVar = this.f316490g;
        return iD + (jVar == null ? 0 : jVar.hashCode());
    }
}
