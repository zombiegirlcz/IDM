package dw3;

import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class c2 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f118494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DirectDebitAccountConfirmationScreenContract$InputData f118495c;
    public final Object d;
    public final Object e;

    public /* synthetic */ c2(Object obj2, Object obj3, int i) {
        this.f118493a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f118493a) {
            case 0:
                this.f118494b = baseScreen;
                break;
            case 1:
                this.f118494b = baseScreen;
                break;
            default:
                this.f118494b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f118493a) {
            case 0:
                vc.s.h(this.f118494b, BaseScreen.class);
                vc.s.h(this.f118495c, DirectDebitAccountConfirmationScreenContract$InputData.class);
                return new d2((c1) this.d, (h2) this.e, this.f118495c);
            case 1:
                vc.s.h(this.f118494b, BaseScreen.class);
                vc.s.h(this.f118495c, DirectDebitAccountConfirmationScreenContract$InputData.class);
                return new d2((jm4.a3) this.d, (jm4.a4) this.e, this.f118495c);
            default:
                vc.s.h(this.f118494b, BaseScreen.class);
                vc.s.h(this.f118495c, DirectDebitAccountConfirmationScreenContract$InputData.class);
                return new d2((u45.h) this.d, (u45.p) this.e, this.f118495c);
        }
    }
}
