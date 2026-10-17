package qnk;

import cli.j;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f247960a;

    public c(int i) {
        this.f247960a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f247960a == ((c) obj2).f247960a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f247960a);
    }
}
