package dmc;

import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import z0h.s1;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements enc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f116100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f116101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PortfolioAllocationsDetailsScreenContract$InputData f116102c;
    public s1 d;

    public x(r rVar) {
        this.f116100a = rVar;
    }

    @Override // enc.a
    public final enc.a E(s1 s1Var) {
        this.d = s1Var;
        return this;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f116101b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f116101b, BaseScreen.class);
        vc.s.h(this.f116102c, PortfolioAllocationsDetailsScreenContract$InputData.class);
        vc.s.h(this.d, s1.class);
        return new v(this.f116100a, this.f116101b, this.f116102c, this.d);
    }

    @Override // enc.a
    public final enc.a k0(PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData) {
        this.f116102c = portfolioAllocationsDetailsScreenContract$InputData;
        return this;
    }
}
