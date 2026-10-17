package m2b;

import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import i4b.i0;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f201776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f201777c;
    public CfdOrderReviewScreenContract$InputData d;
    public i4b.f e;
    public g5b.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f201778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f201779h;

    public /* synthetic */ b0(v vVar, Object obj2, int i) {
        this.f201775a = i;
        this.f201776b = vVar;
        this.f201779h = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f201775a) {
            case 0:
                this.f201777c = baseScreen;
                break;
            default:
                this.f201777c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f201775a) {
            case 0:
                vc.s.h(this.f201777c, BaseScreen.class);
                vc.s.h(this.d, CfdOrderReviewScreenContract$InputData.class);
                vc.s.h(this.e, i4b.f.class);
                vc.s.h(this.f, g5b.d.class);
                vc.s.h(this.f201778g, i0.class);
                return new c0(this.f201776b, (p) this.f201779h, this.d, this.e, this.f, this.f201778g);
            default:
                vc.s.h(this.f201777c, BaseScreen.class);
                vc.s.h(this.d, CfdOrderReviewScreenContract$InputData.class);
                vc.s.h(this.e, i4b.f.class);
                vc.s.h(this.f, g5b.d.class);
                vc.s.h(this.f201778g, i0.class);
                return new c0(this.f201776b, (m) this.f201779h, this.d, this.e, this.f, this.f201778g);
        }
    }
}
