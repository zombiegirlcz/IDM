package b2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f11959a;

    public a(io3.d dVar) {
        this.f11959a = dVar;
    }

    public final io3.d b() {
        return this.f11959a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f11959a, ((a) obj2).f11959a);
    }

    public final int hashCode() {
        io3.d dVar = this.f11959a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
