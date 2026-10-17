package vge;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f289030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f289031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final skm.a2 f289032c;

    public u2(Object token, b bVar, skm.a2 job2) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(job2, "job");
        this.f289030a = token;
        this.f289031b = bVar;
        this.f289032c = job2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return this.f289030a.equals(u2Var.f289030a) && Intrinsics.f(this.f289031b, u2Var.f289031b) && this.f289032c.equals(u2Var.f289032c);
    }

    public final int hashCode() {
        int iHashCode = this.f289030a.hashCode() * 31;
        b bVar = this.f289031b;
        return this.f289032c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
