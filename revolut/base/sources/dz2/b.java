package dz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.cardagreements.flow.CardIssuanceAgreementFlowContract$InputData;
import dw3.f6;
import e4m.e;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardIssuanceAgreementFlowContract$InputData f121218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f121219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f121220c = this;
    public final e d;
    public final e e;

    public b(a aVar, CardIssuanceAgreementFlowContract$InputData cardIssuanceAgreementFlowContract$InputData) {
        this.f121219b = aVar;
        this.f121218a = cardIssuanceAgreementFlowContract$InputData;
        int i = 4;
        this.d = e4m.b.b(new f6(this, 1, i));
        this.e = e4m.b.b(new f6(this, 0, i));
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
