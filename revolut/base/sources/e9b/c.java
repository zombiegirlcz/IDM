package e9b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f123940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final isi.a f123941b;

    public c(dj0.d amount, isi.a source) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f123940a = amount;
        this.f123941b = source;
    }

    public final dj0.d a() {
        return this.f123940a;
    }

    public final isi.a b() {
        return this.f123941b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f123940a, cVar.f123940a) && this.f123941b == cVar.f123941b;
    }

    public final int hashCode() {
        return this.f123941b.hashCode() + (this.f123940a.hashCode() * 31);
    }
}
