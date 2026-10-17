package bd;

import java.security.GeneralSecurityException;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd.n f14506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd.m f14507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd.c f14508c;
    public static final hd.a d;

    static {
        od.a aVarB = hd.w.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f14506a = new hd.n(w.class);
        f14507b = new hd.m(aVarB);
        f14508c = new hd.c(v.class);
        d = new hd.a(aVarB, new a0.b(25));
    }

    public static j a(w2 w2Var) throws GeneralSecurityException {
        int i = x.f14505a[w2Var.ordinal()];
        if (i == 1) {
            return j.f14480l;
        }
        if (i == 2 || i == 3) {
            return j.f14481m;
        }
        if (i == 4) {
            return j.f14482n;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + w2Var.getNumber());
    }
}
