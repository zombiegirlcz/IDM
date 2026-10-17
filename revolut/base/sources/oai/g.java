package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditConsentInputData f223685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f223687c;
    public final e4m.e d;
    public final e4m.e e;

    public g(i0 i0Var, CreditConsentInputData creditConsentInputData) {
        this.f223686b = i0Var;
        this.f223685a = creditConsentInputData;
        int i = 13;
        this.f223687c = e4m.b.b(new o41.b(i0Var, this, 1, i));
        this.d = e4m.b.b(new o41.b(i0Var, this, 0, i));
        this.e = e4m.b.b(new o41.b(i0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
