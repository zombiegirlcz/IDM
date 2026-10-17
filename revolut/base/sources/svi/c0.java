package svi;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265889a;

    public c0(int i) {
        this.f265889a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && this.f265889a == ((c0) obj2).f265889a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265889a);
    }
}
