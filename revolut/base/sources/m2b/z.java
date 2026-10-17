package m2b;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f201951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f201952c;
    public w3b.e d;
    public final Object e;

    public /* synthetic */ z(v vVar, Object obj2, int i) {
        this.f201950a = i;
        this.f201951b = vVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f201950a) {
            case 0:
                this.f201952c = viewController;
                break;
            default:
                this.f201952c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f201950a) {
            case 0:
                vc.s.h(this.f201952c, ViewController.class);
                vc.s.h(this.d, w3b.e.class);
                return new a0(this.f201951b, (p) this.e, this.d);
            default:
                vc.s.h(this.f201952c, ViewController.class);
                vc.s.h(this.d, w3b.e.class);
                return new a0(this.f201951b, (m) this.e, this.d);
        }
    }
}
