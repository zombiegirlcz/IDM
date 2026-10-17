package bbb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.v;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends iri.a implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f14238l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f14239b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f14240c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f14241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f14242h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f14243j;
    public final te0.j k;

    static {
        h0 h0Var = new h0(m.class, "scope", "getScope()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f14238l = new KProperty[]{p0Var.j(h0Var), p.a.y(m.class, "email", "getEmail()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "phone", "getPhone()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "currentVerification", "getCurrentVerification()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "requestSms", "getRequestSms()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "biometricDisabled", "getBiometricDisabled()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "emailVerificationCode", "getEmailVerificationCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "securityScopes", "getSecurityScopes()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "trackTwoFa", "getTrackTwoFa()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(m.class, "auth", "getAuth()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public m() {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter("", "default");
        this.f14240c = new te0.j("");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.d = new te0.j("");
        this.e = new te0.j();
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f = new te0.j(bool);
        Boolean bool2 = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(bool2, "default");
        this.f14241g = new te0.j(bool2);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f14242h = new te0.j("");
        this.i = new te0.j(f0.f322471a);
        Intrinsics.checkNotNullParameter(bool2, "default");
        this.f14243j = new te0.j(bool2);
        this.k = new te0.j();
    }

    @Override // zab.h
    public final te0.e E() {
        return this.k.getValue(this, f14238l[9]);
    }

    @Override // zab.h
    public final te0.e F() {
        return this.f.getValue(this, f14238l[4]);
    }

    @Override // zab.h
    public final v getEmail() {
        return this.f14240c.getValue(this, f14238l[1]);
    }

    @Override // zab.h
    public final te0.e getPhone() {
        return this.d.getValue(this, f14238l[2]);
    }

    @Override // zab.h
    public final te0.e j0() {
        return this.e.getValue(this, f14238l[3]);
    }

    @Override // zab.h
    public final te0.e v() {
        return this.f14242h.getValue(this, f14238l[6]);
    }

    @Override // iri.a
    public final Sequence v0() {
        KProperty[] kPropertyArr = f14238l;
        te0.e[] elements = {this.f14239b.getValue(this, kPropertyArr[0]), this.f14240c.getValue(this, kPropertyArr[1]), this.d.getValue(this, kPropertyArr[2]), this.e.getValue(this, kPropertyArr[3]), this.f.getValue(this, kPropertyArr[4]), this.f14241g.getValue(this, kPropertyArr[5]), this.f14242h.getValue(this, kPropertyArr[6]), this.i.getValue(this, kPropertyArr[7]), this.f14243j.getValue(this, kPropertyArr[8]), this.k.getValue(this, kPropertyArr[9])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // zab.h
    public final te0.e z() {
        return this.i.getValue(this, f14238l[7]);
    }
}
