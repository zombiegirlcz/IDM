package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class v5 implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10572a;

    public v5(int i) {
        this.f10572a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v5) && this.f10572a == ((v5) obj2).f10572a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10572a);
    }
}
