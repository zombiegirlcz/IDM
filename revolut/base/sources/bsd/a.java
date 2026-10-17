package bsd;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18162a;

    public a(int i) {
        this.f18162a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f18162a == ((a) obj2).f18162a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18162a);
    }
}
