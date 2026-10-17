package id;

import hd.w;
import java.security.GeneralSecurityException;
import md.i1;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hd.n f160369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd.m f160370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hd.c f160371c;
    public static final hd.a d;

    static {
        od.a aVarB = w.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f160369a = new hd.n(l.class);
        f160370b = new hd.m(aVarB);
        f160371c = new hd.c(j.class);
        d = new hd.a(aVarB, new h35.c(18));
    }

    public static c a(i1 i1Var) throws GeneralSecurityException {
        int i = m.f160367a[i1Var.ordinal()];
        if (i == 1) {
            return c.f160347g;
        }
        if (i == 2) {
            return c.f160348h;
        }
        if (i == 3) {
            return c.i;
        }
        if (i == 4) {
            return c.f160349j;
        }
        if (i == 5) {
            return c.k;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + i1Var.getNumber());
    }

    public static c b(w2 w2Var) throws GeneralSecurityException {
        int i = m.f160368b[w2Var.ordinal()];
        if (i == 1) {
            return c.f160350l;
        }
        if (i == 2) {
            return c.f160351m;
        }
        if (i == 3) {
            return c.f160352n;
        }
        if (i == 4) {
            return c.o;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + w2Var.getNumber());
    }
}
