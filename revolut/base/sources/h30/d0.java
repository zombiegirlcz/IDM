package h30;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 implements f50.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f148878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f148879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f148880c;

    public d0(n nVar, o oVar) {
        this.f148878a = nVar;
        this.f148879b = oVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f148880c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f148880c, ViewController.class);
        return new e0(this.f148878a, this.f148879b, this.f148880c);
    }
}
