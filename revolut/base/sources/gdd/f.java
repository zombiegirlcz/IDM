package gdd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f143160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f143161b;

    public f(a registeredIdentity, j token) {
        Intrinsics.checkNotNullParameter(registeredIdentity, "registeredIdentity");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f143160a = registeredIdentity;
        this.f143161b = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f143160a, fVar.f143160a) && Intrinsics.f(this.f143161b, fVar.f143161b);
    }

    @Override // gdd.g
    public final j getToken() {
        return this.f143161b;
    }

    public final int hashCode() {
        return this.f143161b.hashCode() + (this.f143160a.hashCode() * 31);
    }
}
