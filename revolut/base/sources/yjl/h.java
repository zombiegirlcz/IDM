package yjl;

import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.Identifier;
import java.util.Iterator;
import java.util.Set;
import jkl.a0;
import jkl.b0;
import jkl.c0;
import jkl.d0;
import jkl.e0;
import jkl.f0;
import jkl.h0;
import jkl.i0;
import jkl.j0;
import jkl.j4;
import jkl.x;
import jkl.y;
import jkl.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h {
    public static final b0 a(b0.Companion companion, String value) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = b0.a().iterator();
        Object obj2 = null;
        boolean z = false;
        Object obj3 = null;
        while (true) {
            if (it8.hasNext()) {
                Object next = it8.next();
                if (Intrinsics.f(((b0) next).getValue(), value)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj3 = next;
                }
            } else if (z) {
                obj2 = obj3;
            }
        }
        b0 b0Var = (b0) obj2;
        return b0Var == null ? b0.UNKNOWN : b0Var;
    }

    public static final Claim b(Identifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "<this>");
        if (identifier instanceof Identifier.Email) {
            String value = ((Identifier.Email) identifier).f106149a;
            Intrinsics.checkNotNullParameter(value, "value");
            return new Claim.Email(value);
        }
        if (!(identifier instanceof Identifier.Phone)) {
            throw new NoWhenBranchMatchedException();
        }
        Identifier.Phone phone = (Identifier.Phone) identifier;
        String value2 = hx7.a.J(phone.f106151b) + phone.f106150a;
        Intrinsics.checkNotNullParameter(value2, "value");
        return new Claim.Phone(value2);
    }

    public static final gkl.m c(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        switch (g.f314544b[b0Var.ordinal()]) {
            case 1:
                return gkl.m.APPLE;
            case 2:
                return gkl.m.BIO_PUBLIC_KEY;
            case 3:
                return gkl.m.EMAIL;
            case 4:
                return gkl.m.GOOGLE;
            case 5:
                return gkl.m.IDENTITY_ID;
            case 6:
                return gkl.m.PASSWORD;
            case 7:
                return gkl.m.PHONE;
            case 8:
                return gkl.m.PIN;
            case 9:
                return gkl.m.PUBLIC_KEY;
            case 10:
                return gkl.m.WEBAUTHN;
            case 11:
                return gkl.m.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final b0 d(gkl.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        switch (g.f314543a[mVar.ordinal()]) {
            case 1:
                return b0.APPLE;
            case 2:
                return b0.BIO_PUBLIC_KEY;
            case 3:
                return b0.EMAIL;
            case 4:
                return b0.GOOGLE;
            case 5:
                return b0.IDENTITY_ID;
            case 6:
                return b0.PASSWORD;
            case 7:
                return b0.PHONE;
            case 8:
                return b0.PIN;
            case 9:
                return b0.PUBLIC_KEY;
            case 10:
                return b0.WEBAUTHN;
            case 11:
                return b0.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final i0 e(Claim claim) {
        Intrinsics.checkNotNullParameter(claim, "<this>");
        if (claim instanceof Claim.BioPublicKey) {
            Claim.BioPublicKey bioPublicKey = (Claim.BioPublicKey) claim;
            return new jkl.x(new x.a(bioPublicKey.f106125a, bioPublicKey.f106126b));
        }
        if (claim instanceof Claim.Email) {
            return new y(((Claim.Email) claim).f106127a);
        }
        if (claim instanceof Claim.Google) {
            return new z(((Claim.Google) claim).f106128a);
        }
        if (claim instanceof Claim.IdentityId) {
            return new a0(((Claim.IdentityId) claim).f106129a);
        }
        if (claim instanceof Claim.Password) {
            return new c0(((Claim.Password) claim).f106130a);
        }
        if (claim instanceof Claim.Phone) {
            return new d0(((Claim.Phone) claim).f106131a);
        }
        if (claim instanceof Claim.Pin) {
            return new e0(((Claim.Pin) claim).f106132a);
        }
        if (claim instanceof Claim.PublicKey) {
            Claim.PublicKey publicKey = (Claim.PublicKey) claim;
            return new f0(new f0.a(publicKey.f106133a, publicKey.f106134b, publicKey.f106135c, publicKey.d));
        }
        if (!(claim instanceof Claim.WebAuthn)) {
            throw new NoWhenBranchMatchedException();
        }
        Claim.WebAuthn webAuthn = (Claim.WebAuthn) claim;
        return new h0(webAuthn.f106136a, webAuthn.f106137b, webAuthn.f106138c, webAuthn.d);
    }

    public static final j0 f(gkl.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        switch (g.f314545c[nVar.ordinal()]) {
            case 1:
                return j0.BANK_ID;
            case 2:
                return j0.BIO_PUBLIC_KEY;
            case 3:
                return j0.DAP;
            case 4:
                return j0.GOOGLE;
            case 5:
                return j0.PUBLIC_KEY;
            case 6:
                return j0.UAE_PASS;
            case 7:
                return j0.WEBAUTHN;
            case 8:
                return j0.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final j4 g(Claim claim, Evidence evidence, Set set) {
        Intrinsics.checkNotNullParameter(claim, "<this>");
        if (claim instanceof Claim.Email) {
            return new j4(b0.EMAIL, ((Claim.Email) claim).f106127a, null, set);
        }
        if (claim instanceof Claim.Google) {
            return new j4(b0.GOOGLE, null, evidence != null ? o.a(evidence) : null, null);
        }
        if (claim instanceof Claim.IdentityId) {
            throw new IllegalStateException("Submit of IdentityId claim is not supported");
        }
        if (claim instanceof Claim.Password) {
            return new j4(b0.PASSWORD, ((Claim.Password) claim).f106130a, null, null);
        }
        if (claim instanceof Claim.Phone) {
            return new j4(b0.PHONE, ((Claim.Phone) claim).f106131a, null, set);
        }
        if (claim instanceof Claim.Pin) {
            return new j4(b0.PIN, ((Claim.Pin) claim).f106132a, null, null);
        }
        if (claim instanceof Claim.BioPublicKey) {
            p0 p0Var = o0.f186429a;
            throw new IllegalStateException(("Submit of " + p0Var.b(Claim.BioPublicKey.class).m() + " claim type is not supported.\nUse " + p0Var.b(Claim.BioPublicKey.class).m() + " dto type instead").toString());
        }
        if (claim instanceof Claim.PublicKey) {
            p0 p0Var2 = o0.f186429a;
            throw new IllegalStateException(("Submit of " + p0Var2.b(Claim.PublicKey.class).m() + " claim type is not supported.\nUse " + p0Var2.b(Claim.PublicKey.class).m() + " dto type instead").toString());
        }
        if (!(claim instanceof Claim.WebAuthn)) {
            throw new NoWhenBranchMatchedException();
        }
        p0 p0Var3 = o0.f186429a;
        throw new IllegalStateException(("Submit of " + p0Var3.b(Claim.WebAuthn.class).m() + " claim type is not supported.\nUse " + p0Var3.b(Claim.WebAuthn.class).m() + " dto type instead").toString());
    }
}
