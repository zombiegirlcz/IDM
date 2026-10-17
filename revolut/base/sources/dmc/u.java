package dmc;

import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import z0h.s1;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements enc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f116070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f116071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f116072c;
    public PortfolioAllocationsDetailsScreenContract$InputData d;
    public s1 e;

    public u(r rVar, i iVar) {
        this.f116070a = rVar;
        this.f116071b = iVar;
    }

    @Override // enc.a
    public final enc.a E(s1 s1Var) {
        this.e = s1Var;
        return this;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f116072c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f116072c, BaseScreen.class);
        vc.s.h(this.d, PortfolioAllocationsDetailsScreenContract$InputData.class);
        vc.s.h(this.e, s1.class);
        return new v(this.f116070a, this.f116071b, this.f116072c, this.d, this.e);
    }

    @Override // enc.a
    public final enc.a k0(PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData) {
        this.d = portfolioAllocationsDetailsScreenContract$InputData;
        return this;
    }
}
