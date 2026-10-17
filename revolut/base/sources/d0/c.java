package d0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.ViewKt;
import androidx.lifecycle.Observer;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ConditionVariable;
import com.google.common.base.Function;
import com.hcaptcha.sdk.HCaptchaError;
import com.hcaptcha.sdk.HCaptchaException;
import com.hcaptcha.sdk.HCaptchaWebView;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.data.model.Data;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import dw.j;
import dw.o;
import e0.e;
import fc.g;
import fci.u;
import flm.h;
import flm.i;
import i4b.f;
import ie.r;
import ii.k;
import io.fotoapparat.view.CameraView;
import ip0.r5;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import jxl.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import nii.t0;
import nii.y0;
import r10.q;
import r10.t;
import tfm.z0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f110275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110276c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f110274a = i;
        this.f110275b = obj2;
        this.f110276c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f110274a;
        Object obj2 = this.f110276c;
        Object obj3 = this.f110275b;
        switch (i) {
            case 0:
                ((TakePictureRequest) obj3).lambda$onError$0((ImageCaptureException) obj2);
                break;
            case 1:
                f fVar = (f) obj2;
                try {
                    fVar.m(((Callable) obj3).call());
                } catch (Exception e) {
                    fVar.n(e);
                    return;
                }
                break;
            case 2:
                dw.a effect = (dw.a) obj2;
                j jVar = ((dw.b) obj3).f118163a;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(effect, "effect");
                jVar.e = effect;
                o oVar = jVar.i;
                if (oVar != null) {
                    int i2 = effect != dw.a.NONE ? jVar.f118189h : jVar.f118188g;
                    oVar.f118204g = i2;
                    if (i2 == oVar.f118202b) {
                        oVar.f118205h = System.currentTimeMillis();
                    }
                }
                break;
            case 3:
                CameraPresenceProvider.removeCameraStateObserver$lambda$0$0((CameraInternal) obj3, (Observer) obj2);
                break;
            case 4:
                CameraPresenceProvider.addCameraPresenceListener$lambda$0((CameraPresenceProvider) obj3, (CameraPresenceListener) obj2);
                break;
            case 5:
                CameraPresenceProvider.setupCameraStateObserver$lambda$0$1((CameraInfoInternal) obj3, (e) obj2);
                break;
            case 6:
                ((CameraRepository) obj3).lambda$deinit$1((CameraInternal) obj2);
                break;
            case 7:
                ((ConstantObservable) obj3).lambda$addObserver$0((Observable.Observer) obj2);
                break;
            case 8:
                ((DeferrableSurface) obj3).lambda$new$2((String) obj2);
                break;
            case 9:
                ((LiveDataObservable) obj3).lambda$fetchData$0((CallbackToFutureAdapter.Completer) obj2);
                break;
            case 10:
                LiveDataObservable.lambda$enableInternalObserver$3((Map.Entry) obj3, (LiveDataObservable.Result) obj2);
                break;
            case 11:
                ((LiveDataObservable) obj3).lambda$addObserver$2((Observable.Observer) obj2);
                break;
            case 12:
                ((BaseScrollerFlow) obj3).W2((fki.c) obj2);
                break;
            case 13:
                Threads.lambda$runOnMainSync$0((Runnable) obj3, (CountDownLatch) obj2);
                break;
            case 14:
                ((t0) ((t) obj3).f250858b).h((y0) obj2);
                break;
            case 15:
                u uVar = (u) obj3;
                uVar.removeView((ImageView) obj2);
                uVar.f133816b = null;
                break;
            case 16:
                ((h) ((i) obj3)).j((flm.b) obj2, Unit.f186387a);
                break;
            case 17:
                fu0.e eVar = (fu0.e) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                int i3 = fu0.e.f138054m;
                eVar.k = null;
                eVar.i = false;
                ViewParent parent = eVar.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(eVar);
                }
                viewGroup.addView(eVar);
                break;
            case 18:
                AudioManagerCompat.lambda$getAudioManager$0((Context) obj3, (ConditionVariable) obj2);
                break;
            case 19:
                CameraView this$0 = (CameraView) obj3;
                uam.i resolution = (uam.i) obj2;
                int i5 = CameraView.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(resolution, "$resolution");
                this$0.f162988b = resolution;
                this$0.requestLayout();
                break;
            case 20:
                ((r) obj3).a((g) obj2);
                break;
            case 21:
                ((ii.g) obj3).f161499c.onSuccess((String) obj2);
                break;
            case 22:
                ((ii.g) obj3).f161499c.a(new HCaptchaException((HCaptchaError) obj2, null));
                break;
            case 23:
                q qVar = (q) ((ay8.a) obj3).f11110c;
                ((HCaptchaWebView) qVar.d).removeJavascriptInterface("JSInterface");
                ((HCaptchaWebView) qVar.d).removeJavascriptInterface("JSDI");
                ((k) qVar.f250850c).a(new HCaptchaException(HCaptchaError.INSECURE_HTTP_REQUEST_ERROR, "Insecure resource " + ((Uri) obj2) + " requested"));
                break;
            case 24:
                ((r5) obj3).f.scrollBy(-((Ref$IntRef) obj2).f186408a, 0);
                break;
            case 25:
                ((BackgroundThreadStateHandler) obj3).lambda$updateStateAsync$1((Function) obj2);
                break;
            case 26:
                ((z0) obj3).c(new Data(ViewKt.drawToBitmap((NewRevolutCardView) obj2, Bitmap.Config.ARGB_8888), null, false, 6, null));
                break;
            case 27:
                View view = (View) obj3;
                if (Intrinsics.f(view.getForeground(), (RevolutShimmerDrawable) obj2)) {
                    view.setForeground(null);
                }
                break;
            case 28:
                jr0.h hVar = (jr0.h) obj3;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                if (hVar.getParent() == viewGroup3) {
                    viewGroup3.removeView(hVar);
                }
                break;
            default:
                d.c((d) obj3, (nxl.b) obj2);
                break;
        }
    }
}
