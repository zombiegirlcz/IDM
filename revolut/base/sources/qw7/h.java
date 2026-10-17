package qw7;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements uw7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f249822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f249823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f249824c;

    public h(e eVar, f fVar) {
        this.f249822a = eVar;
        this.f249823b = fVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f249824c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f249824c, ViewController.class);
        return new i(this.f249822a, this.f249823b);
    }
}
