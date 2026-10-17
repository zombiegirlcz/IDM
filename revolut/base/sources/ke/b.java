package ke;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f182925c;
    public final String d;
    public final String e;
    public final long f;

    public b(long j2, String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f182924b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f182925c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str4;
        this.f = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof n) {
            b bVar = (b) ((n) obj2);
            if (this.f182924b.equals(bVar.f182924b) && this.f182925c.equals(bVar.f182925c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f == bVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f182924b.hashCode() ^ 1000003) * 1000003) ^ this.f182925c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j2 = this.f;
        return iHashCode ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb6.append(this.f182924b);
        sb6.append(", parameterKey=");
        sb6.append(this.f182925c);
        sb6.append(", parameterValue=");
        sb6.append(this.d);
        sb6.append(", variantId=");
        sb6.append(this.e);
        sb6.append(", templateVersion=");
        return a0.d.j(this.f, "}", sb6);
    }
}
