package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class a3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4119c;
    public EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ a3(b bVar, Object obj2, int i) {
        this.f4117a = i;
        this.f4118b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4117a) {
            case 0:
                this.f4119c = viewController;
                break;
            default:
                this.f4119c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4117a) {
            case 0:
                vc.s.h(this.f4119c, ViewController.class);
                vc.s.h(this.d, EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData.class);
                return new b3(this.f4118b, (t0) this.e, this.d);
            default:
                vc.s.h(this.f4119c, ViewController.class);
                vc.s.h(this.d, EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData.class);
                return new b3(this.f4118b, (c) this.e, this.d);
        }
    }
}
