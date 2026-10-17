package xf6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f305130c;
    public IbanScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w0(t tVar, Object obj2, int i) {
        this.f305128a = i;
        this.f305129b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f305128a) {
            case 0:
                this.f305130c = viewController;
                break;
            case 1:
                this.f305130c = viewController;
                break;
            default:
                this.f305130c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f305128a) {
            case 0:
                vc.s.h(this.f305130c, ViewController.class);
                vc.s.h(this.d, IbanScreenContract$InputData.class);
                return new x0(this.f305129b, (h0) this.e, this.d);
            case 1:
                vc.s.h(this.f305130c, ViewController.class);
                vc.s.h(this.d, IbanScreenContract$InputData.class);
                return new x0(this.f305129b, (q) this.e, this.d);
            default:
                vc.s.h(this.f305130c, ViewController.class);
                vc.s.h(this.d, IbanScreenContract$InputData.class);
                return new x0(this.f305129b, (s) this.e, this.d);
        }
    }
}
