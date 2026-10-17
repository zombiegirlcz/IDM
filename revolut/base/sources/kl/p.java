package kl;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class p implements igm.o, igm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f185205b = new p(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f185206c = new p(1);
    public static final p d = new p(2);
    public static final p e = new p(3);
    public static final p f = new p(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f185207g = new p(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f185208h = new p(6);
    public static final p i = new p(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f185209j = new p(8);
    public static final p k = new p(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p f185210l = new p(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p f185211m = new p(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p f185212n = new p(12);
    public static final p o = new p(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f185213p = new p(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p f185214q = new p(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f185215r = new p(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f185216s = new p(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p f185217t = new p(18);
    public static final p u = new p(19);
    public static final p v = new p(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p f185218w = new p(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p f185219x = new p(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p f185220y = new p(23);
    public static final p z = new p(24);
    public static final p A = new p(25);
    public static final p B = new p(26);
    public static final p C = new p(27);
    public static final p D = new p(28);
    public static final p E = new p(29);

    public /* synthetic */ p(int i2) {
        this.f185221a = i2;
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f185221a) {
            case 0:
                tl.j p0 = (tl.j) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new ml.q(p0);
            case 4:
                ml.b it8 = (ml.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f206515a;
            default:
                ml.b it9 = (ml.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f206515a;
        }
    }

    @Override // igm.p
    public boolean test(Object it8) {
        switch (this.f185221a) {
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.p0;
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.o0;
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.b;
            case 4:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.s;
            case 5:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.b;
            case 7:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.k;
            case 8:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.l;
            case 9:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.n;
            case 10:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.q;
            case 11:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof tl.f;
            case 12:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.n0;
            case 13:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.y;
            case 14:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof DocumentCaptureScreen.DocumentCaptureResult.Error;
            case 15:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.n0;
            case 16:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.z;
            case 17:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof LivenessCaptureScreen.LivenessCaptureResult.Error;
            case 18:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.n0;
            case 19:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.b0;
            case 20:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof SelfieCaptureScreen.SelfieCaptureResult.Error;
            case 21:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.r;
            case 22:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.q;
            case 23:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof tl.a;
            case 24:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.q;
            case 25:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof tl.g;
            case 26:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof ml.e0;
            case 27:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof MotionHostFragment.AvcHostResult.Error;
            case 28:
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8 instanceof sl.o;
        }
    }
}
