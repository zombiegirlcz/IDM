package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163604b;

    public bg(boolean z, boolean z3) {
        this.f163603a = z;
        this.f163604b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj2;
        return this.f163603a == bgVar.f163603a && this.f163604b == bgVar.f163604b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163604b) + (Boolean.hashCode(this.f163603a) * 31);
    }
}
