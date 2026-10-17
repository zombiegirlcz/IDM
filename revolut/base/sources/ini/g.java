package ini;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheetContract$InputData;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f162969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f162970c;
    public OtpResendMethodsBottomSheetContract$InputData d;
    public final Object e;

    public /* synthetic */ g(f fVar, Object obj2, int i) {
        this.f162968a = i;
        this.f162969b = fVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f162968a) {
            case 0:
                this.f162970c = viewController;
                break;
            default:
                this.f162970c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f162968a) {
            case 0:
                s.h(this.f162970c, ViewController.class);
                s.h(this.d, OtpResendMethodsBottomSheetContract$InputData.class);
                return new h(this.f162969b, (a) this.e, this.d);
            default:
                s.h(this.f162970c, ViewController.class);
                s.h(this.d, OtpResendMethodsBottomSheetContract$InputData.class);
                return new h(this.f162969b, (b) this.e, this.d);
        }
    }
}
