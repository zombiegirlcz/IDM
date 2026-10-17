package y88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f311633a;

    public a(dj0.d dVar) {
        this.f311633a = dVar;
    }

    @Override // y88.d
    public final dj0.d a() {
        return this.f311633a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f311633a, ((a) obj2).f311633a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f311633a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
