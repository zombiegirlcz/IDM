package yh1;

import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f313728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f313729c;
    public AddressSearchScreenContract$InputData d;
    public sh1.l e;
    public final Object f;

    public /* synthetic */ k(e eVar, Object obj2, int i) {
        this.f313727a = i;
        this.f313728b = eVar;
        this.f = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f313727a) {
            case 0:
                this.f313729c = viewController;
                break;
            default:
                this.f313729c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f313727a) {
            case 0:
                s.h(this.f313729c, ViewController.class);
                s.h(this.d, AddressSearchScreenContract$InputData.class);
                s.h(this.e, sh1.l.class);
                return new l(this.f313728b, (d) this.f, this.d, this.e);
            default:
                s.h(this.f313729c, ViewController.class);
                s.h(this.d, AddressSearchScreenContract$InputData.class);
                s.h(this.e, sh1.l.class);
                return new l(this.f313728b, (f) this.f, this.d, this.e);
        }
    }
}
