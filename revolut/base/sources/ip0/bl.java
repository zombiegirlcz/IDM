package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163622c;

    public bl(boolean z, boolean z3, boolean z4) {
        this.f163620a = z;
        this.f163621b = z3;
        this.f163622c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj2;
        return this.f163620a == blVar.f163620a && this.f163621b == blVar.f163621b && this.f163622c == blVar.f163622c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163622c) + j6.a.c(Boolean.hashCode(this.f163620a) * 31, 31, this.f163621b);
    }
}
