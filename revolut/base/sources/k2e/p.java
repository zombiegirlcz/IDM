package k2e;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180541a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f180542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f180543c;

    public p(j jVar, l lVar) {
        this.f180542b = jVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f180541a) {
            case 0:
                this.f180543c = viewController;
                break;
            default:
                this.f180543c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f180541a) {
            case 0:
                vc.s.h(this.f180543c, ViewController.class);
                q qVar = new q(0);
                int i = 12;
                j jVar = this.f180542b;
                qVar.f180545b = e4m.b.b(new jqa.h(jVar, qVar, 1, i));
                qVar.f180546c = e4m.b.b(new jqa.h(jVar, qVar, 0, i));
                qVar.d = e4m.b.b(new jqa.h(jVar, qVar, 3, i));
                qVar.e = e4m.b.b(new jqa.h(jVar, qVar, 2, i));
                qVar.f = e4m.b.b(new jqa.h(jVar, qVar, 4, i));
                return qVar;
            default:
                vc.s.h(this.f180543c, ViewController.class);
                q qVar2 = new q(1);
                int i2 = 13;
                j jVar2 = this.f180542b;
                qVar2.f180545b = e4m.b.b(new jqa.h(jVar2, qVar2, 1, i2));
                qVar2.f180546c = e4m.b.b(new jqa.h(jVar2, qVar2, 0, i2));
                qVar2.d = e4m.b.b(new jqa.h(jVar2, qVar2, 3, i2));
                qVar2.e = e4m.b.b(new jqa.h(jVar2, qVar2, 2, i2));
                qVar2.f = e4m.b.b(new jqa.h(jVar2, qVar2, 4, i2));
                return qVar2;
        }
    }

    public p(j jVar) {
        this.f180542b = jVar;
    }
}
