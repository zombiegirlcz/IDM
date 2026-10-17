package oai;

import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f223661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AcceptBankTermsScreenContract$InputData f223662c;
    public final Object d;
    public final Object e;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f223660a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f223660a) {
            case 0:
                this.f223661b = viewController;
                break;
            default:
                this.f223661b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f223660a) {
            case 0:
                vc.s.h(this.f223661b, ViewController.class);
                vc.s.h(this.f223662c, AcceptBankTermsScreenContract$InputData.class);
                return new c((i0) this.d, (q) this.e, this.f223662c);
            default:
                vc.s.h(this.f223661b, ViewController.class);
                vc.s.h(this.f223662c, AcceptBankTermsScreenContract$InputData.class);
                return new c((ta9.m) this.d, (ta9.o) this.e, this.f223662c);
        }
    }
}
