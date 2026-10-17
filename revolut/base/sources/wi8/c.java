package wi8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.JuniorCardProfileScreenContract;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cj8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorCardProfileScreenContract.Input f297842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f297843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f297844c;

    public c(e eVar, a aVar, JuniorCardProfileScreenContract.Input input) {
        this.f297843b = eVar;
        this.f297842a = input;
        this.f297844c = e4m.b.b(new b(eVar, aVar, this));
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
