package bi;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f15341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f15342c;
    public int d;
    public int e;
    public e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15343g;

    public c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb6 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c2 = (char) (bytes[i] & UnsignedBytes.MAX_VALUE);
            if (c2 == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb6.append(c2);
        }
        this.f15340a = sb6.toString();
        this.f15341b = f.FORCE_NONE;
        this.f15342c = new StringBuilder(str.length());
        this.e = -1;
    }

    public final char a() {
        return this.f15340a.charAt(this.d);
    }

    public final boolean b() {
        return this.d < this.f15340a.length() - this.f15343g;
    }

    public final void c(int i) {
        e eVar = this.f;
        if (eVar == null || i > eVar.f15348b) {
            this.f = e.e(i, this.f15341b);
        }
    }

    public final void d(char c2) {
        this.f15342c.append(c2);
    }
}
