package xf6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f305045c;
    public BranchesScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ s0(t tVar, Object obj2, int i) {
        this.f305043a = i;
        this.f305044b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f305043a) {
            case 0:
                this.f305045c = viewController;
                break;
            case 1:
                this.f305045c = viewController;
                break;
            default:
                this.f305045c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f305043a) {
            case 0:
                vc.s.h(this.f305045c, ViewController.class);
                vc.s.h(this.d, BranchesScreenContract$InputData.class);
                return new t0(this.f305044b, (s) this.e, this.d);
            case 1:
                vc.s.h(this.f305045c, ViewController.class);
                vc.s.h(this.d, BranchesScreenContract$InputData.class);
                return new t0(this.f305044b, (h0) this.e, this.d);
            default:
                vc.s.h(this.f305045c, ViewController.class);
                vc.s.h(this.d, BranchesScreenContract$InputData.class);
                return new t0(this.f305044b, (z) this.e, this.d);
        }
    }
}
