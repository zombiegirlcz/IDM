package lpf;

import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f199089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f199090c;
    public ReasonForTransferGoodsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u(i iVar, Object obj2, int i) {
        this.f199088a = i;
        this.f199089b = iVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f199088a) {
            case 0:
                this.f199090c = baseScreen;
                break;
            default:
                this.f199090c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f199088a) {
            case 0:
                vc.s.h(this.f199090c, BaseScreen.class);
                vc.s.h(this.d, ReasonForTransferGoodsScreenContract$InputData.class);
                return new v(this.f199089b, (d) this.e, this.d);
            default:
                vc.s.h(this.f199090c, BaseScreen.class);
                vc.s.h(this.d, ReasonForTransferGoodsScreenContract$InputData.class);
                return new v(this.f199089b, (c) this.e, this.d);
        }
    }
}
