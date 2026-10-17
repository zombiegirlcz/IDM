package s02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f258812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258813b;

    public a(b bVar, boolean z) {
        this.f258812a = bVar;
        this.f258813b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f258812a, aVar.f258812a) && this.f258813b == aVar.f258813b;
    }

    public final int hashCode() {
        b bVar = this.f258812a;
        return Boolean.hashCode(this.f258813b) + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }
}
