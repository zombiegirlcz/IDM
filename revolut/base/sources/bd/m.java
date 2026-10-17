package bd;

import java.security.GeneralSecurityException;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd.n f14490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd.m f14491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd.c f14492c;
    public static final hd.a d;

    static {
        od.a aVarB = hd.w.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f14490a = new hd.n(k.class);
        f14491b = new hd.m(aVarB);
        f14492c = new hd.c(i.class);
        d = new hd.a(aVarB, new a0.b(22));
    }

    public static j a(w2 w2Var) throws GeneralSecurityException {
        int i = l.f14489a[w2Var.ordinal()];
        if (i == 1) {
            return j.f14476c;
        }
        if (i == 2 || i == 3) {
            return j.d;
        }
        if (i == 4) {
            return j.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + w2Var.getNumber());
    }
}
