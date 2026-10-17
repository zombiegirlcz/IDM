package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentDetailsScreenContract$InputData f304903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f304904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304905c;
    public final e4m.e d;

    public j2(w2 w2Var, x2 x2Var, ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData) {
        this.f304904b = w2Var;
        this.f304903a = consentDetailsScreenContract$InputData;
        int i = 3;
        this.f304905c = e4m.b.b(new a1(this, 1, i));
        this.d = e4m.b.b(new a1(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
