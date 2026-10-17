package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i9 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GiveConsentScreenContract$InputData f118991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8 f118993c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118995h;

    public i9(c1 c1Var, w6 w6Var, BaseScreen baseScreen, GiveConsentScreenContract$InputData giveConsentScreenContract$InputData) {
        this.f118991a = giveConsentScreenContract$InputData;
        this.f118992b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 20;
        q8 q8Var = new q8(c1Var, w6Var, this, 1, i);
        this.f118993c = q8Var;
        this.d = e4m.b.b(q8Var);
        this.e = e4m.b.b(new q8(c1Var, w6Var, this, 0, i));
        this.f = e4m.b.b(this.f118993c);
        this.f118994g = e4m.b.b(new q8(c1Var, w6Var, this, 3, i));
        this.f118995h = e4m.b.b(new q8(c1Var, w6Var, this, 2, i));
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
