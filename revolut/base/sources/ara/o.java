package ara;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8612b;

    public o(boolean z, boolean z3) {
        this.f8611a = z;
        this.f8612b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f8611a == oVar.f8611a && this.f8612b == oVar.f8612b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8612b) + (Boolean.hashCode(this.f8611a) * 31);
    }
}
