package ta7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.CreateSecretPhraseFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xki.c, rb7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateSecretPhraseFlowContract$InputData f269116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f269117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f269118c = this;
    public final e4m.e d;

    public c(d dVar, CreateSecretPhraseFlowContract$InputData createSecretPhraseFlowContract$InputData) {
        this.f269117b = dVar;
        this.f269116a = createSecretPhraseFlowContract$InputData;
        this.d = e4m.b.b(new r6e.m(dVar, this, 28));
    }

    @Override // rb7.a
    public final k b() {
        return new k(this.f269117b, this.f269118c, 1);
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
