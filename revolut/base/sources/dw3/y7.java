package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class y7 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f120240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f120241c;
    public CreditApplicationDocumentsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ y7(Object obj2, Object obj3, int i) {
        this.f120239a = i;
        this.f120240b = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f120239a) {
            case 0:
                this.f120241c = viewController;
                break;
            case 1:
                this.f120241c = viewController;
                break;
            default:
                this.f120241c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f120239a) {
            case 0:
                vc.s.h(this.f120241c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentsScreenContract$InputData.class);
                return new z7((c1) this.f120240b, (t) this.e, this.d);
            case 1:
                vc.s.h(this.f120241c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentsScreenContract$InputData.class);
                return new z7((c1) this.f120240b, (h4) this.e, this.d);
            default:
                vc.s.h(this.f120241c, ViewController.class);
                vc.s.h(this.d, CreditApplicationDocumentsScreenContract$InputData.class);
                return new z7((qz4.a) this.f120240b, (qz4.b) this.e, this.d);
        }
    }
}
