package k2e;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180557a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f180558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f180559c;

    public u(j jVar, l lVar) {
        this.f180558b = jVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f180557a) {
            case 0:
                this.f180559c = viewController;
                break;
            default:
                this.f180559c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f180557a) {
            case 0:
                vc.s.h(this.f180559c, ViewController.class);
                v vVar = new v(0);
                int i = 16;
                j jVar = this.f180558b;
                vVar.f180561b = e4m.b.b(new jqa.h(jVar, vVar, 1, i));
                vVar.f180562c = e4m.b.b(new jqa.h(jVar, vVar, 0, i));
                vVar.d = e4m.b.b(new jqa.h(jVar, vVar, 3, i));
                vVar.e = e4m.b.b(new jqa.h(jVar, vVar, 2, i));
                vVar.f = e4m.b.b(new jqa.h(jVar, vVar, 4, i));
                return vVar;
            default:
                vc.s.h(this.f180559c, ViewController.class);
                v vVar2 = new v(1);
                int i2 = 17;
                j jVar2 = this.f180558b;
                vVar2.f180561b = e4m.b.b(new jqa.h(jVar2, vVar2, 1, i2));
                vVar2.f180562c = e4m.b.b(new jqa.h(jVar2, vVar2, 0, i2));
                vVar2.d = e4m.b.b(new jqa.h(jVar2, vVar2, 3, i2));
                vVar2.e = e4m.b.b(new jqa.h(jVar2, vVar2, 2, i2));
                vVar2.f = e4m.b.b(new jqa.h(jVar2, vVar2, 4, i2));
                return vVar2;
        }
    }

    public u(j jVar) {
        this.f180558b = jVar;
    }
}
