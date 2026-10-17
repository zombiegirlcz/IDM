package hog;

import cli.j;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gog.a f154285a;

    public b(gog.a aVar) {
        this.f154285a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f154285a == ((b) obj2).f154285a;
    }

    public final int hashCode() {
        gog.a aVar = this.f154285a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
