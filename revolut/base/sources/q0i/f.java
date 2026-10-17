package q0i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.b f241296a;

    public f(dj0.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f241296a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f241296a, ((f) obj2).f241296a);
    }

    @Override // q0i.h
    public final xi0.b getCurrency() {
        return this.f241296a.f115080b;
    }

    public final int hashCode() {
        return this.f241296a.hashCode();
    }
}
