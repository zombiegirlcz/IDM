package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f10397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f10398b;

    public k9() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj2;
        return Intrinsics.f(this.f10397a, k9Var.f10397a) && Intrinsics.f(this.f10398b, k9Var.f10398b);
    }

    public final int hashCode() {
        c cVar = this.f10397a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f10398b;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public k9(c cVar, c cVar2, int i) {
        cVar = (i & 1) != 0 ? null : cVar;
        cVar2 = (i & 2) != 0 ? null : cVar2;
        this.f10397a = cVar;
        this.f10398b = cVar2;
    }
}
