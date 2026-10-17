package io.grpc.okhttp.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f162994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f162995c;
    public boolean d;

    public b(boolean z) {
        this.f162993a = z;
    }

    public final void a(a... aVarArr) {
        if (!this.f162993a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            strArr[i] = aVarArr[i].javaName;
        }
        this.f162994b = strArr;
    }

    public final void b(o... oVarArr) {
        if (!this.f162993a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (oVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[oVarArr.length];
        for (int i = 0; i < oVarArr.length; i++) {
            strArr[i] = oVarArr[i].javaName;
        }
        this.f162995c = strArr;
    }

    public b(c cVar) {
        this.f162993a = cVar.f162996a;
        this.f162994b = cVar.f162997b;
        this.f162995c = cVar.f162998c;
        this.d = cVar.d;
    }
}
