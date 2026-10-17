package bd;

import java.security.GeneralSecurityException;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd.n f14496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd.m f14497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd.c f14498c;
    public static final hd.a d;

    static {
        od.a aVarB = hd.w.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f14496a = new hd.n(o.class);
        f14497b = new hd.m(aVarB);
        f14498c = new hd.c(n.class);
        d = new hd.a(aVarB, new a0.b(23));
    }

    public static j a(w2 w2Var) throws GeneralSecurityException {
        int i = p.f14495a[w2Var.ordinal()];
        if (i == 1) {
            return j.f;
        }
        if (i == 2 || i == 3) {
            return j.f14477g;
        }
        if (i == 4) {
            return j.f14478h;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + w2Var.getNumber());
    }
}
