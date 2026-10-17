package ef;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f125241h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f125243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125244c;
    public final String d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f125245g;

    static {
        oe.c cVar = new oe.c();
        cVar.f = 0L;
        cVar.o(c.ATTEMPT_MIGRATION);
        cVar.e = 0L;
        cVar.d();
    }

    public a(String str, c cVar, String str2, String str3, long j2, long j3, String str4) {
        this.f125242a = str;
        this.f125243b = cVar;
        this.f125244c = str2;
        this.d = str3;
        this.e = j2;
        this.f = j3;
        this.f125245g = str4;
    }

    public final oe.c a() {
        oe.c cVar = new oe.c();
        cVar.f224497a = this.f125242a;
        cVar.f224498b = this.f125243b;
        cVar.f224499c = this.f125244c;
        cVar.d = this.d;
        cVar.e = Long.valueOf(this.e);
        cVar.f = Long.valueOf(this.f);
        cVar.f224500g = this.f125245g;
        return cVar;
    }

    public final boolean equals(Object obj2) {
        String str;
        String str2;
        String str3;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            String str4 = aVar.f125245g;
            String str5 = aVar.d;
            String str6 = aVar.f125244c;
            String str7 = aVar.f125242a;
            String str8 = this.f125242a;
            if (str8 != null ? str8.equals(str7) : str7 == null) {
                if (this.f125243b.equals(aVar.f125243b) && ((str = this.f125244c) != null ? str.equals(str6) : str6 == null) && ((str2 = this.d) != null ? str2.equals(str5) : str5 == null) && this.e == aVar.e && this.f == aVar.f && ((str3 = this.f125245g) != null ? str3.equals(str4) : str4 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f125242a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f125243b.hashCode()) * 1000003;
        String str2 = this.f125244c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j2 = this.e;
        int i = (iHashCode3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f;
        int i2 = (i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f125245g;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb6.append(this.f125242a);
        sb6.append(", registrationStatus=");
        sb6.append(this.f125243b);
        sb6.append(", authToken=");
        sb6.append(this.f125244c);
        sb6.append(", refreshToken=");
        sb6.append(this.d);
        sb6.append(", expiresInSecs=");
        sb6.append(this.e);
        sb6.append(", tokenCreationEpochInSecs=");
        sb6.append(this.f);
        sb6.append(", fisError=");
        return v0.a.i(sb6, this.f125245g, "}");
    }
}
