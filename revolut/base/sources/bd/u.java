package bd;

import java.security.GeneralSecurityException;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd.n f14502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd.m f14503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd.c f14504c;
    public static final hd.a d;

    static {
        od.a aVarB = hd.w.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f14502a = new hd.n(s.class);
        f14503b = new hd.m(aVarB);
        f14504c = new hd.c(r.class);
        d = new hd.a(aVarB, new a0.b(24));
    }

    public static j a(w2 w2Var) throws GeneralSecurityException {
        int i = t.f14501a[w2Var.ordinal()];
        if (i == 1) {
            return j.i;
        }
        if (i == 2 || i == 3) {
            return j.f14479j;
        }
        if (i == 4) {
            return j.k;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + w2Var.getNumber());
    }
}
