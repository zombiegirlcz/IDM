package kp0;

import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f188007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188008c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(Object obj2, long j2, Object obj3, Object obj4, int i) {
        this.f188006a = i;
        this.f188008c = obj2;
        this.d = obj3;
        this.f188007b = j2;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f188006a) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f188008c;
                j0 j0Var = (j0) this.d;
                LottieAnimationView lottieAnimationView = j0Var.f188024a;
                Function0 function0 = (Function0) this.e;
                if (!ref$BooleanRef.f186407a && !lottieAnimationView.isAnimating()) {
                    if (this.f188007b == j0Var.f) {
                        or0.u.k(lottieAnimationView).Q().b(lottieAnimationView);
                        function0.invoke();
                        j0Var.e = null;
                    }
                    break;
                }
                break;
            case 1:
                ((Request.Listener) this.f188008c).mo7onFailedCcXjc1I((RequestMetadata) this.d, this.f188007b, (RequestFailure) this.e);
                break;
            default:
                ((Request.Listener) this.f188008c).mo16onPartialCaptureResultCcXjc1I((RequestMetadata) this.d, this.f188007b, (FrameMetadata) this.e);
                break;
        }
    }
}
