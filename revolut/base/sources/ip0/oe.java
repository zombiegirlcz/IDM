package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165656b;

    public oe(boolean z, boolean z3) {
        this.f165655a = z;
        this.f165656b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj2;
        return this.f165655a == oeVar.f165655a && this.f165656b == oeVar.f165656b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165656b) + (Boolean.hashCode(this.f165655a) * 31);
    }
}
