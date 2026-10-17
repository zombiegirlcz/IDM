package q0i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f241297a;

    public g(dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f241297a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f241297a, ((g) obj2).f241297a);
    }

    @Override // q0i.h
    public final xi0.b getCurrency() {
        return this.f241297a.f115083b;
    }

    public final int hashCode() {
        return this.f241297a.hashCode();
    }
}
