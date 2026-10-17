package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f227806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f227807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f227808c;

    public b(dj0.d dVar, dj0.d dVar2, d state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f227806a = dVar;
        this.f227807b = dVar2;
        this.f227808c = state;
    }

    @Override // oq9.e
    public final dj0.d a() {
        dj0.d dVar = this.f227806a;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("oweAmount is null");
    }

    @Override // oq9.e
    public final dj0.d b() {
        dj0.d dVar = this.f227807b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException("owedAmount is null");
    }

    @Override // oq9.e
    public final d c() {
        return this.f227808c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f227806a, bVar.f227806a) && Intrinsics.f(this.f227807b, bVar.f227807b) && this.f227808c == bVar.f227808c;
    }

    public final int hashCode() {
        dj0.d dVar = this.f227806a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f227807b;
        return this.f227808c.hashCode() + ((iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }
}
