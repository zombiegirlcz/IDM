package j9;

import com.fasterxml.jackson.core.t;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends t {
    public static final d d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172255c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172254b = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f172253a = new char[32];

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        d = new d(property);
    }

    public d(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            "  ".getChars(0, 2, this.f172253a, i);
            i += 2;
        }
        this.f172255c = str;
    }

    @Override // com.fasterxml.jackson.core.t
    public final void b(g9.c cVar, int i) {
        cVar.v(this.f172255c);
        if (i <= 0) {
            return;
        }
        int length = i * this.f172254b;
        while (true) {
            char[] cArr = this.f172253a;
            if (length <= cArr.length) {
                cVar.S(cArr, length);
                return;
            } else {
                cVar.S(cArr, cArr.length);
                length -= cArr.length;
            }
        }
    }
}
