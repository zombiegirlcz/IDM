package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f227809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f227810b;

    public c(dj0.d amount, d state) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f227809a = amount;
        this.f227810b = state;
    }

    @Override // oq9.e
    public final dj0.d a() {
        return this.f227809a;
    }

    @Override // oq9.e
    public final dj0.d b() {
        return this.f227809a;
    }

    @Override // oq9.e
    public final d c() {
        return this.f227810b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f227809a, cVar.f227809a) && this.f227810b == cVar.f227810b;
    }

    public final int hashCode() {
        return this.f227810b.hashCode() + (this.f227809a.hashCode() * 31);
    }
}
