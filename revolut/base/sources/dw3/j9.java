package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j9 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestConsentScreenContract$InputData f119059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8 f119061c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119063h;

    public j9(c1 c1Var, u6 u6Var, BaseScreen baseScreen, RequestConsentScreenContract$InputData requestConsentScreenContract$InputData) {
        this.f119059a = requestConsentScreenContract$InputData;
        this.f119060b = e4m.b.b(e4m.c.a(baseScreen));
        q8 q8Var = new q8(c1Var, u6Var, this, 1, 21);
        this.f119061c = q8Var;
        this.d = e4m.b.b(q8Var);
        this.e = e4m.b.b(new q8(c1Var, u6Var, this, 0, 21));
        this.f = e4m.b.b(this.f119061c);
        this.f119062g = e4m.b.b(new q8(c1Var, u6Var, this, 3, 21));
        this.f119063h = e4m.b.b(new q8(c1Var, u6Var, this, 2, 21));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
