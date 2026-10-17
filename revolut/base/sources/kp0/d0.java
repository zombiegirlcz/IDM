package kp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f187985c;
    public final boolean d;

    public d0(String listId, int i, v20.n nVar, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f187983a = listId;
        this.f187984b = i;
        this.f187985c = nVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f187983a, d0Var.f187983a) && this.f187984b == d0Var.f187984b && Intrinsics.f(this.f187985c, d0Var.f187985c) && this.d == d0Var.d;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f187984b, this.f187983a.hashCode() * 31, 31);
        Object obj2 = this.f187985c;
        return Boolean.hashCode(this.d) + ((iB + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
