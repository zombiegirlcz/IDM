package km9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq8.f f185734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq8.b f185735b;

    public c(kq8.f owner, kq8.b payee) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(payee, "payee");
        this.f185734a = owner;
        this.f185735b = payee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f185734a, cVar.f185734a) && Intrinsics.f(this.f185735b, cVar.f185735b);
    }

    public final int hashCode() {
        return this.f185735b.hashCode() + (this.f185734a.hashCode() * 31);
    }
}
