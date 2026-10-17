package ff;

import r10.v;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f134680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f134681c;

    public b(String str, long j2, f fVar) {
        this.f134679a = str;
        this.f134680b = j2;
        this.f134681c = fVar;
    }

    public static v a() {
        v vVar = new v(16);
        vVar.f250864c = 0L;
        return vVar;
    }

    public final f b() {
        return this.f134681c;
    }

    public final String c() {
        return this.f134679a;
    }

    public final long d() {
        return this.f134680b;
    }

    public final boolean equals(Object obj2) {
        f fVar;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof b) {
            b bVar = (b) obj2;
            f fVar2 = bVar.f134681c;
            String str = bVar.f134679a;
            String str2 = this.f134679a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f134680b == bVar.f134680b && ((fVar = this.f134681c) != null ? fVar.equals(fVar2) : fVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f134679a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f134680b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        f fVar = this.f134681c;
        return (fVar != null ? fVar.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f134679a + ", tokenExpirationTimestamp=" + this.f134680b + ", responseCode=" + this.f134681c + "}";
    }
}
