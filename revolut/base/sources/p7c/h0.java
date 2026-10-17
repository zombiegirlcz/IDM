package p7c;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 implements qdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f233618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233619c;

    public h0(r rVar, j jVar) {
        this.f233617a = rVar;
        this.f233618b = jVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233619c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233619c, ViewController.class);
        return new i0(this.f233617a, this.f233618b);
    }
}
