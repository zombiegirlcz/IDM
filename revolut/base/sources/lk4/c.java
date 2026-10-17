package lk4;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak4.a f196209a;

    public c(ak4.a aVar) {
        this.f196209a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f196209a == ((c) obj2).f196209a;
    }

    public final int hashCode() {
        ak4.a aVar = this.f196209a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
