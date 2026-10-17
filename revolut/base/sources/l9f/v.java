package l9f;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f193229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f193230c;
    public eaf.g d;
    public final Object e;

    public /* synthetic */ v(k kVar, Object obj2, int i) {
        this.f193228a = i;
        this.f193229b = kVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f193228a) {
            case 0:
                this.f193230c = viewController;
                break;
            default:
                this.f193230c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f193228a) {
            case 0:
                vc.s.h(this.f193230c, ViewController.class);
                vc.s.h(this.d, eaf.g.class);
                return new w(this.f193229b, (o) this.e, this.d);
            default:
                vc.s.h(this.f193230c, ViewController.class);
                vc.s.h(this.d, eaf.g.class);
                return new w(this.f193229b, (i) this.e, this.d);
        }
    }
}
