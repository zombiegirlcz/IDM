package cwi;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class e1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f109666c;
    public final Object d;

    public /* synthetic */ e1(h0 h0Var, Object obj2, int i) {
        this.f109664a = i;
        this.f109665b = h0Var;
        this.d = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f109664a) {
            case 0:
                this.f109666c = viewController;
                break;
            default:
                this.f109666c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f109664a) {
            case 0:
                vc.s.h(this.f109666c, ViewController.class);
                return new f1(this.f109665b, (q0) this.d, this.f109666c);
            default:
                vc.s.h(this.f109666c, ViewController.class);
                return new f1(this.f109665b, (b0) this.d, this.f109666c);
        }
    }
}
