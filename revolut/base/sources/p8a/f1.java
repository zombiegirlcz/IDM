package p8a;

import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class f1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233965c;
    public MyAliasesScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ f1(d0 d0Var, Object obj2, int i) {
        this.f233963a = i;
        this.f233964b = d0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f233963a) {
            case 0:
                this.f233965c = viewController;
                break;
            default:
                this.f233965c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f233963a) {
            case 0:
                vc.s.h(this.f233965c, ViewController.class);
                vc.s.h(this.d, MyAliasesScreenContract$InputData.class);
                return new g1(this.f233964b, (o0) this.e, this.d);
            default:
                vc.s.h(this.f233965c, ViewController.class);
                vc.s.h(this.d, MyAliasesScreenContract$InputData.class);
                return new h1(this.f233964b, (n) this.e, this.d);
        }
    }
}
