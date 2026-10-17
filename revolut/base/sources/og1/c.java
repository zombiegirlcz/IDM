package og1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardSecurityPromptScreenContract$InputData f224960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f224961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224962c;
    public final e4m.e d;
    public final e4m.e e;

    public c(i iVar, ViewController viewController, CardSecurityPromptScreenContract$InputData cardSecurityPromptScreenContract$InputData) {
        this.f224960a = cardSecurityPromptScreenContract$InputData;
        this.f224961b = viewController;
        int i = 25;
        this.f224962c = e4m.b.b(new o41.b(iVar, this, 1, i));
        this.d = e4m.b.b(new o41.b(iVar, this, 2, i));
        this.e = e4m.b.b(new o41.b(iVar, this, 0, i));
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
