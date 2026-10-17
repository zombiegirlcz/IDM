package hm9;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f153575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f153576c;
    public final Object d;

    public /* synthetic */ k(b bVar, Object obj2, int i) {
        this.f153574a = i;
        this.f153575b = bVar;
        this.d = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f153574a) {
            case 0:
                this.f153576c = viewController;
                break;
            default:
                this.f153576c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f153574a) {
            case 0:
                s.h(this.f153576c, ViewController.class);
                return new l(this.f153575b, (g) this.d);
            default:
                s.h(this.f153576c, ViewController.class);
                return new l(this.f153575b, (e) this.d);
        }
    }
}
