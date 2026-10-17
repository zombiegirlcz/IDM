package dg;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114558c;
    public final String d;
    public final String e;
    public final long f;

    public c(long j2, String str, String str2, String str3, String str4) {
        this.f114557b = str;
        this.f114558c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof e) {
            c cVar = (c) ((e) obj2);
            if (this.f114557b.equals(cVar.f114557b) && this.f114558c.equals(cVar.f114558c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && this.f == cVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f114557b.hashCode() ^ 1000003) * 1000003) ^ this.f114558c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j2 = this.f;
        return iHashCode ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb6.append(this.f114557b);
        sb6.append(", variantId=");
        sb6.append(this.f114558c);
        sb6.append(", parameterKey=");
        sb6.append(this.d);
        sb6.append(", parameterValue=");
        sb6.append(this.e);
        sb6.append(", templateVersion=");
        return a0.d.j(this.f, "}", sb6);
    }
}
