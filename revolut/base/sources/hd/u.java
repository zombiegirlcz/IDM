package hd;

import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f151370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f151371b;

    public u(Class cls, Class cls2) {
        this.f151370a = cls;
        this.f151371b = cls2;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return uVar.f151370a.equals(this.f151370a) && uVar.f151371b.equals(this.f151371b);
    }

    public final int hashCode() {
        return Objects.hash(this.f151370a, this.f151371b);
    }

    public final String toString() {
        return this.f151370a.getSimpleName() + " with serialization type: " + this.f151371b.getSimpleName();
    }
}
