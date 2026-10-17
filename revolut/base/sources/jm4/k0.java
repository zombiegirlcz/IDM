package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 implements xki.c, yq4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardBeDrivenDescriptionFlowContract$InputData f176162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f176164c = this;
    public final e4m.e d = e4m.b.b(new j1a.k(this, 24));

    public k0(a3 a3Var, CreditCardBeDrivenDescriptionFlowContract$InputData creditCardBeDrivenDescriptionFlowContract$InputData) {
        this.f176163b = a3Var;
        this.f176162a = creditCardBeDrivenDescriptionFlowContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // yq4.d
    public final yq4.c q() {
        return new v3(this.f176163b, this.f176164c);
    }
}
