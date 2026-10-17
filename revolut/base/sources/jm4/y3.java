package jm4;

import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class y3 implements yq4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f176456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f176457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CreditCardDescriptionScreenContract$InputData f176458c;

    public y3(a3 a3Var) {
        this.f176456a = a3Var;
    }

    @Override // yq4.c
    public final yq4.c O(CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData) {
        this.f176458c = creditCardDescriptionScreenContract$InputData;
        return this;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f176457b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f176457b, BaseScreen.class);
        vc.s.h(this.f176458c, CreditCardDescriptionScreenContract$InputData.class);
        return new w3(this.f176456a, this.f176458c);
    }
}
