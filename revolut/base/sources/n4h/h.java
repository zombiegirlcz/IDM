package n4h;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f212446a;

    public h(hel.b bVar) {
        this.f212446a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f212446a == ((h) obj2).f212446a;
    }

    public final int hashCode() {
        hel.b bVar = this.f212446a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
