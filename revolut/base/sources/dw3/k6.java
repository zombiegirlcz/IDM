package dw3;

import com.revolut.feature.credit.autopay.ui.screen.set_date.SetDateContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class k6 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f119131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SetDateContract$InputData f119132c;
    public final Object d;
    public final Object e;

    public /* synthetic */ k6(Object obj2, Object obj3, int i) {
        this.f119130a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f119130a) {
            case 0:
                this.f119131b = baseScreen;
                break;
            case 1:
                this.f119131b = baseScreen;
                break;
            default:
                this.f119131b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f119130a) {
            case 0:
                vc.s.h(this.f119131b, BaseScreen.class);
                vc.s.h(this.f119132c, SetDateContract$InputData.class);
                return new l6((c1) this.d, (d1) this.e, this.f119131b, this.f119132c);
            case 1:
                vc.s.h(this.f119131b, BaseScreen.class);
                vc.s.h(this.f119132c, SetDateContract$InputData.class);
                return new l6((jm4.a3) this.d, (jm4.j0) this.e, this.f119131b, this.f119132c);
            default:
                vc.s.h(this.f119131b, BaseScreen.class);
                vc.s.h(this.f119132c, SetDateContract$InputData.class);
                return new l6((jm4.a3) this.d, (jm4.l2) this.e, this.f119131b, this.f119132c);
        }
    }
}
