package ux0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f283742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f283743b;

    public e(d dVar, IllegalStateException illegalStateException) {
        this.f283742a = dVar;
        this.f283743b = illegalStateException;
    }

    @Override // ux0.i
    public final i a(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return f.f283744a.a(model);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f283742a, eVar.f283742a) && Intrinsics.f(this.f283743b, eVar.f283743b);
    }

    public final int hashCode() {
        d dVar = this.f283742a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Throwable th10 = this.f283743b;
        return iHashCode + (th10 != null ? th10.hashCode() : 0);
    }
}
