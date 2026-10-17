package bd;

import java.security.GeneralSecurityException;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd.n f14468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd.m f14469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd.c f14470c;
    public static final hd.a d;

    static {
        od.a aVarB = hd.w.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f14468a = new hd.n(b0.class);
        f14469b = new hd.m(aVarB);
        f14470c = new hd.c(a0.class);
        d = new hd.a(aVarB, new a0.b(26));
    }

    public static j a(w2 w2Var) throws GeneralSecurityException {
        int i = c0.f14464a[w2Var.ordinal()];
        if (i == 1) {
            return j.o;
        }
        if (i == 2 || i == 3) {
            return j.f14483p;
        }
        if (i == 4) {
            return j.f14484q;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + w2Var.getNumber());
    }
}
