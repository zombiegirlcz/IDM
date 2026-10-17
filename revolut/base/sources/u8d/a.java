package u8d;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f278166a;

    public a(boolean z) {
        this.f278166a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f278166a == ((a) obj2).f278166a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278166a) + (Boolean.hashCode(true) * 31);
    }
}
