package id;

import hd.w;
import java.security.GeneralSecurityException;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd.n f160358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd.m f160359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd.c f160360c;
    public static final hd.a d;

    static {
        od.a aVarB = w.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f160358a = new hd.n(d.class);
        f160359b = new hd.m(aVarB);
        f160360c = new hd.c(a.class);
        d = new hd.a(aVarB, new h35.c(16));
    }

    public static c a(w2 w2Var) throws GeneralSecurityException {
        int i = e.f160357a[w2Var.ordinal()];
        if (i == 1) {
            return c.f160346c;
        }
        if (i == 2) {
            return c.d;
        }
        if (i == 3) {
            return c.e;
        }
        if (i == 4) {
            return c.f;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + w2Var.getNumber());
    }
}
