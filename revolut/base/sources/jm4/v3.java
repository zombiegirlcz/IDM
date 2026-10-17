package jm4;

import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class v3 implements yq4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f176407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f176408c;
    public CreditCardDescriptionScreenContract$InputData d;

    public v3(a3 a3Var, k0 k0Var) {
        this.f176406a = a3Var;
        this.f176407b = k0Var;
    }

    @Override // yq4.c
    public final yq4.c O(CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData) {
        this.d = creditCardDescriptionScreenContract$InputData;
        return this;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f176408c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f176408c, BaseScreen.class);
        vc.s.h(this.d, CreditCardDescriptionScreenContract$InputData.class);
        return new w3(this.f176406a, this.f176407b, this.d);
    }
}
