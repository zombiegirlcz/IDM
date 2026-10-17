package jcm;

import io.grpc.okhttp.internal.n;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172904c;

    public a(n nVar) {
        String str = (String) nVar.f163017b;
        this.f172902a = (String) nVar.d;
        int i = nVar.f163018c;
        this.f172903b = i == -1 ? str.equals("http") ? 80 : str.equals("https") ? 443 : -1 : i;
        this.f172904c = nVar.toString();
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public final String b() {
        return this.f172902a;
    }

    public final int c() {
        return this.f172903b;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof a) && ((a) obj2).f172904c.equals(this.f172904c);
    }

    public final int hashCode() {
        return this.f172904c.hashCode();
    }

    public final String toString() {
        return this.f172904c;
    }
}
