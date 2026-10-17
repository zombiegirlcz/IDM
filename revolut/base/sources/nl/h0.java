package nl;

import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.workflow.internal.ui.FaceLivenessIntroScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class h0 implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f216914b;

    public /* synthetic */ h0(q0 q0Var, int i) {
        this.f216913a = i;
        this.f216914b = q0Var;
    }

    @Override // igm.a
    public final void run() {
        switch (this.f216913a) {
            case 0:
                q0 this$0 = this.f216914b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f216939a.navigateTo(LivenessCaptureScreen.INSTANCE);
                break;
            case 1:
                q0 this$02 = this.f216914b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.f216939a.navigateTo(new FaceLivenessIntroScreen(true));
                break;
            default:
                q0 this$03 = this.f216914b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                hx7.e.f(this$03.f216939a);
                break;
        }
    }
}
