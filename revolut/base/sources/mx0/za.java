package mx0;

/* JADX INFO: loaded from: classes20.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f210146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210147b;

    public za(boolean z, boolean z3) {
        this.f210146a = z;
        this.f210147b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof za)) {
            return false;
        }
        za zaVar = (za) obj2;
        return this.f210146a == zaVar.f210146a && this.f210147b == zaVar.f210147b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210147b) + (Boolean.hashCode(this.f210146a) * 31);
    }
}
