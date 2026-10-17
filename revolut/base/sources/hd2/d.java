package hd2;

import cli.j;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151379a;

    public d(int i) {
        this.f151379a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f151379a == ((d) obj2).f151379a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151379a);
    }
}
