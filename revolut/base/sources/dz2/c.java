package dz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreenContract$InputData;
import dw3.q8;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardIssuanceAgreementsScreenContract$InputData f121221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f121222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f121223c;

    public c(a aVar, b bVar, CardIssuanceAgreementsScreenContract$InputData cardIssuanceAgreementsScreenContract$InputData) {
        this.f121221a = cardIssuanceAgreementsScreenContract$InputData;
        this.f121222b = e4m.b.b(new q8(aVar, bVar, this, 1, 24));
        this.f121223c = e4m.b.b(new q8(aVar, bVar, this, 0, 24));
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
