package p5d;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f233098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f233099b;

    public c(boolean z, boolean z3) {
        this.f233098a = z;
        this.f233099b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f233098a == cVar.f233098a && this.f233099b == cVar.f233099b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233099b) + (Boolean.hashCode(this.f233098a) * 31);
    }
}
