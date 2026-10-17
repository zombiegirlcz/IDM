package mw0;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fu9.h f209286a;

    public d(fu9.h hVar) {
        this.f209286a = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f209286a.equals(((d) obj2).f209286a);
    }

    public final int hashCode() {
        return this.f209286a.hashCode();
    }
}
