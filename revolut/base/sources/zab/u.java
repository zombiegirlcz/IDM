package zab;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends iri.a implements h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f320632j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f320633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f320634c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f320635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f320636h;
    public final te0.j i;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(u.class, "email", "getEmail()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f320632j = new KProperty[]{p0Var.j(h0Var), p.a.y(u.class, "phone", "getPhone()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "currentVerification", "getCurrentVerification()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "requestSms", "getRequestSms()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "emailVerificationCode", "getEmailVerificationCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "securityScopes", "getSecurityScopes()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "trackTwoFa", "getTrackTwoFa()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "auth", "getAuth()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public u() {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter("", "default");
        this.f320633b = new te0.j("");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f320634c = new te0.j("");
        this.d = new te0.j();
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.e = new te0.j(bool);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f = new te0.j("");
        this.f320635g = new te0.j(zhm.f0.f322471a);
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f320636h = new te0.j(bool);
        this.i = new te0.j();
    }

    @Override // zab.h
    public final te0.e E() {
        return this.i.getValue(this, f320632j[7]);
    }

    @Override // zab.h
    public final te0.e F() {
        return this.e.getValue(this, f320632j[3]);
    }

    @Override // zab.h
    public final te0.v getEmail() {
        return this.f320633b.getValue(this, f320632j[0]);
    }

    @Override // zab.h
    public final te0.e getPhone() {
        return this.f320634c.getValue(this, f320632j[1]);
    }

    @Override // zab.h
    public final te0.e j0() {
        return this.d.getValue(this, f320632j[2]);
    }

    @Override // zab.h
    public final te0.e v() {
        return this.f.getValue(this, f320632j[4]);
    }

    @Override // iri.a
    public final Sequence v0() {
        KProperty[] kPropertyArr = f320632j;
        te0.e[] elements = {this.f320633b.getValue(this, kPropertyArr[0]), this.f320634c.getValue(this, kPropertyArr[1]), this.d.getValue(this, kPropertyArr[2]), this.e.getValue(this, kPropertyArr[3]), this.f.getValue(this, kPropertyArr[4]), this.f320635g.getValue(this, kPropertyArr[5]), this.f320636h.getValue(this, kPropertyArr[6]), this.i.getValue(this, kPropertyArr[7])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // zab.h
    public final te0.e z() {
        return this.f320635g.getValue(this, f320632j[5]);
    }
}
