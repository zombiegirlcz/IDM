package hd;

import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f151360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f151361b;

    public p(Class cls, Class cls2) {
        this.f151360a = cls;
        this.f151361b = cls2;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return pVar.f151360a.equals(this.f151360a) && pVar.f151361b.equals(this.f151361b);
    }

    public final int hashCode() {
        return Objects.hash(this.f151360a, this.f151361b);
    }

    public final String toString() {
        return this.f151360a.getSimpleName() + " with primitive type: " + this.f151361b.getSimpleName();
    }
}
