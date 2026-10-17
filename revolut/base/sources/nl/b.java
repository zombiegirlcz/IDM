package nl;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.workflow.internal.ui.LivenessConfirmationScreen;
import com.onfido.workflow.internal.ui.processor.CaptureDocumentHelper$ShowCaptureScreenException;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements igm.p, igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f216874b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f216875c = new b(1);
    public static final b d = new b(2);
    public static final b e = new b(3);
    public static final b f = new b(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f216876g = new b(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f216877h = new b(6);
    public static final b i = new b(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f216878j = new b(8);
    public static final b k = new b(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f216879l = new b(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f216880m = new b(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f216881n = new b(12);
    public static final b o = new b(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f216882p = new b(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f216883q = new b(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f216884r = new b(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f216885s = new b(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f216886t = new b(18);
    public static final b u = new b(19);
    public static final b v = new b(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f216887w = new b(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f216888x = new b(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f216889y = new b(23);
    public static final b z = new b(24);
    public static final b A = new b(25);
    public static final b B = new b(26);
    public static final b C = new b(27);
    public static final b D = new b(28);
    public static final b E = new b(29);

    public /* synthetic */ b(int i2) {
        this.f216890a = i2;
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f216890a) {
            case 2:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return error instanceof h ? Observable.just(r.f216942a) : Observable.error(error);
            case 11:
                Intrinsics.checkNotNullParameter((ml.g0) obj2, "it");
                return r.f216942a;
            case 14:
                tl.h it8 = (tl.h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f271985a;
            case 18:
                Intrinsics.checkNotNullParameter((ml.c0) obj2, "it");
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((ml.r) obj2, "it");
                return w.f216960b;
        }
    }

    @Override // igm.p
    public boolean test(Object it8) {
        switch (this.f216890a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.s;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.r;
            case 2:
            case 11:
            case 14:
            case 18:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.a0;
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.x;
            case 4:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.q;
            case 5:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof tl.b;
            case 6:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.y;
            case 7:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof DocumentCaptureScreen.DocumentCaptureResult.Completed;
            case 8:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.v;
            case 9:
                Throwable error = (Throwable) it8;
                Intrinsics.checkNotNullParameter(error, "error");
                return error instanceof CaptureDocumentHelper$ShowCaptureScreenException;
            case 10:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.g0;
            case 12:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.b0;
            case 13:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof SelfieCaptureScreen.SelfieCaptureResult.Completed;
            case 15:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.q;
            case 16:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof tl.h;
            case 17:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.c0;
            case 19:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.e0;
            case 20:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof MotionHostFragment.AvcHostResult.Completed;
            case 21:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.z;
            case 22:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof LivenessCaptureScreen.LivenessCaptureResult.Completed;
            case 23:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.r;
            case 24:
                ml.r it9 = (ml.r) it8;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zhm.d0.o0(it9.f206545a) instanceof LivenessConfirmationScreen;
            case 26:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.q;
            case 27:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof tl.i;
            case 28:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.w;
        }
    }
}
