package t83;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_screen.impl.prompts.merchant_redirect.MerchantRedirectPromptScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MerchantRedirectPromptScreenContract$InputData f268821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f268822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f268823c;

    public d(c cVar, b bVar, MerchantRedirectPromptScreenContract$InputData merchantRedirectPromptScreenContract$InputData) {
        this.f268821a = merchantRedirectPromptScreenContract$InputData;
        int i = 23;
        this.f268822b = e4m.b.b(new sac.a(this, 1, i));
        this.f268823c = e4m.b.b(new sac.a(this, 0, i));
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
