package kyk;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f190966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f190967b;

    public p(q qVar, int i) {
        this.f190966a = qVar;
        this.f190967b = i;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f190967b;
        if (i == 0) {
            q qVar = this.f190966a;
            return new com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.a((o0l.a) qVar.d.get(), qVar.f190968a);
        }
        if (i == 1) {
            return new o0l.b();
        }
        throw new AssertionError(i);
    }
}
