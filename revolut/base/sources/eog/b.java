package eog;

import s7a.c0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gog.b f127907a;

    public b(gog.b bVar) {
        this.f127907a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f127907a == ((b) obj2).f127907a;
    }

    public final int hashCode() {
        gog.b bVar = this.f127907a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
