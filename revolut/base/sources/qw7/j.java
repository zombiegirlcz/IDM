package qw7;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements uw7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f249828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f249829b;

    public j(e eVar) {
        this.f249828a = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f249829b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f249829b, ViewController.class);
        return new i(this.f249828a);
    }
}
