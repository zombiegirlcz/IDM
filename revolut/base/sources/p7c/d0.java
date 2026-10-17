package p7c;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements jdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f233595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f233596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233597c;

    public d0(r rVar, j jVar) {
        this.f233595a = rVar;
        this.f233596b = jVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233597c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233597c, ViewController.class);
        return new e0(this.f233595a, this.f233596b);
    }
}
