package ke;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class m implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f182947c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f182948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f182949b;

    public m(File file) {
        this.f182948a = file;
    }

    public final void a() {
        File file = this.f182948a;
        if (this.f182949b == null) {
            try {
                this.f182949b = new l(file);
            } catch (IOException e) {
                String str = "Could not open log file: " + file;
            }
        }
    }

    @Override // ke.d
    public final void g(long j2, String str) {
        a();
        if (this.f182949b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f182949b.d(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f182947c));
            while (!this.f182949b.h() && this.f182949b.n() > 65536) {
                this.f182949b.k();
            }
        } catch (IOException e) {
        }
    }

    @Override // ke.d
    public final void h() {
        ie.g.b(this.f182949b, "There was a problem closing the Crashlytics log file.");
        this.f182949b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // ke.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j() {
        /*
            r7 = this;
            java.io.File r0 = r7.f182948a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r2
            goto L3a
        Lc:
            r7.a()
            ke.l r0 = r7.f182949b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.n()
            byte[] r0 = new byte[r0]
            ke.l r4 = r7.f182949b     // Catch: java.io.IOException -> L29
            ke.f r5 = new ke.f     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.g(r5)     // Catch: java.io.IOException -> L29
            goto L2f
        L29:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r6 = "FirebaseCrashlytics"
        L2f:
            icm.m r4 = new icm.m
            r3 = r3[r1]
            r4.<init>()
            r4.f160343b = r0
            r4.f160342a = r3
        L3a:
            if (r4 != 0) goto L3e
            r3 = r2
            goto L49
        L3e:
            int r0 = r4.f160342a
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f160343b
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L49:
            if (r3 == 0) goto L53
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = ke.m.f182947c
            r0.<init>(r3, r1)
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.m.j():java.lang.String");
    }
}
