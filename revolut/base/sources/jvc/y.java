package jvc;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178853a;

    public y(boolean z) {
        this.f178853a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f178853a == ((y) obj2).f178853a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178853a);
    }
}
