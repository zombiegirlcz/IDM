package b0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsetsAnimation;
import android.widget.ImageSwitcher;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.MappingRedirectableLiveData;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.ScrollingView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkerParameters;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncherImpl;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1bSDK;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX;
import com.revolut.camerakit.core.settings.WatermarkConfig;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.uicomponent.toolbar.app_bar.ToolbarShadow;
import com.revolut.uicomponent.toolbar.app_bar.ToolbarShadowBehavior;
import dw.s;
import dw.u;
import ie.r;
import ie.t;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.sb;
import mx0.y9;
import tw0.d0;
import tw0.e0;
import tw0.l0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11505c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(BufferedAudioStream bufferedAudioStream, AudioStream.AudioStreamCallback audioStreamCallback, Executor executor) {
        this.f11503a = 26;
        this.f11504b = bufferedAudioStream;
        this.d = audioStreamCallback;
        this.f11505c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        int i = this.f11503a;
        Object obj2 = this.d;
        Object obj3 = this.f11505c;
        Object obj4 = this.f11504b;
        switch (i) {
            case 0:
                ((ImageCapture) obj4).lambda$takePicture$1((Executor) obj3, (ImageCapture.OnImageCapturedCallback) obj2);
                break;
            case 1:
                ((AFb1rSDK) obj4).AFInAppEventType((Context) obj3, (Intent) obj2);
                break;
            case 2:
                AFd1bSDK.AFInAppEventType((AFd1bSDK) obj4, (Throwable) obj3, (String) obj2);
                break;
            case 3:
                CameraX.start$lambda$0((CameraX) obj4, (OnfidoCamera.CameraFacing) obj3, (Function1) obj2);
                break;
            case 4:
                ((ToolbarShadowBehavior) obj4).updateView((ScrollingView) obj3, (ToolbarShadow) obj2);
                break;
            case 5:
                String nonce = (String) obj3;
                WatermarkConfig config = (WatermarkConfig) obj2;
                s sVar = ((u) obj4).f118223a;
                Intrinsics.checkNotNullParameter(nonce, "nonce");
                Intrinsics.checkNotNullParameter(config, "config");
                if (!sVar.f118213c) {
                    sVar.o = new dw.q(nonce, config);
                    sVar.d();
                    break;
                }
                break;
            case 6:
                CameraPresenceProvider.clearAllCameraStateObservers$lambda$2$0((ArrayList) obj4, (Observer) obj3, (String) obj2);
                break;
            case 7:
                MappingRedirectableLiveData.redirectTo$lambda$0((LiveData) obj4, (MappingRedirectableLiveData) obj3, (LiveData) obj2);
                break;
            case 8:
                ((hyl.h) obj4).e.invoke((String) obj3, (String) obj2);
                break;
            case 9:
                Throwable th10 = (Throwable) obj3;
                Map map = (Map) obj2;
                ie.n nVar = ((r) obj4).f160558g;
                Thread threadCurrentThread = Thread.currentThread();
                nVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                t tVar = nVar.f160545n;
                if (tVar == null || !tVar.e.get()) {
                    long j2 = jCurrentTimeMillis / 1000;
                    String strE = nVar.e();
                    if (strE != null) {
                        ke.c cVar = new ke.c(strE, j2, map);
                        oe.c cVar2 = nVar.f160544m;
                        cVar2.getClass();
                        String str = "Persisting non-fatal event for session " + strE;
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        }
                        cVar2.j(th10, threadCurrentThread, "error", cVar, false);
                    }
                }
                break;
            case 10:
                ((DefaultSurfaceProcessor) obj4).lambda$executeSafely$12((Runnable) obj3, (Runnable) obj2);
                break;
            case 11:
                ((InternalImageProcessor) obj4).lambda$safeProcess$0((ImageProcessor.Request) obj3, (CallbackToFutureAdapter.Completer) obj2);
                break;
            case 12:
                ((SurfaceProcessorNode) obj4).lambda$sendSurfaceOutputs$0((SurfaceEdge) obj3, (Map.Entry) obj2);
                break;
            case 13:
                ((DualSurfaceProcessor) obj4).lambda$executeSafely$8((Runnable) obj3, (Runnable) obj2);
                break;
            case 14:
                int i2 = LabelView.f56193x;
                ofm.q.e((yy0.f) obj4, (Image) obj3, (ImageSwitcher) obj2);
                break;
            case 15:
                y9 y9Var = (y9) obj3;
                lki.s sVar2 = (lki.s) obj2;
                ((View) obj4).setVisibility(8);
                y9 y9Var2 = (y9) y9Var.f210127c.f183975c;
                if (c6d.b.b(y9Var2) == 0) {
                    y9Var2.setVisibility(8);
                }
                if (c6d.b.b(y9Var) == 0) {
                    y9Var.d.a();
                    y9Var.f210125a.getContentContainer$ui_kit_components_release().setBackground(null);
                }
                sVar2.invoke();
                break;
            case 16:
                ScrollingPagerIndicatorView scrollingPagerIndicatorView = (ScrollingPagerIndicatorView) obj4;
                scrollingPagerIndicatorView.f58859l = -1;
                scrollingPagerIndicatorView.c(obj3, (sb) obj2);
                break;
            case 17:
                ((AudioRendererEventListener.EventDispatcher) obj4).lambda$inputFormatChanged$2((Format) obj3, (DecoderReuseEvaluation) obj2);
                break;
            case 18:
                AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$1((AudioTrack) obj4, (Handler) obj3, (ListenerSet) obj2);
                break;
            case 19:
                ((DrmSessionEventListener.EventDispatcher) obj4).lambda$drmSessionManagerError$2((DrmSessionEventListener) obj3, (Exception) obj2);
                break;
            case 20:
                ((DrmSessionEventListener.EventDispatcher) obj4).lambda$drmKeysLoaded$1((DrmSessionEventListener) obj3, (KeyRequestInfo) obj2);
                break;
            case 21:
                ((qod.e) obj4).d.invoke((String) obj3, (String) obj2);
                break;
            case 22:
                WorkLauncherImpl.startWork$lambda$0((WorkLauncherImpl) obj4, (StartStopToken) obj3, (WorkerParameters.RuntimeExtras) obj2);
                break;
            case 23:
                VideoCapture.lambda$setupSurfaceUpdateNotifier$5((AtomicBoolean) obj4, (SessionConfig.Builder) obj3, (CameraCaptureCallback) obj2);
                break;
            case 24:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = "Login success with accountID: " + str2 + " & datasourceID: " + str3;
                ((sh4.f) obj2).d.invoke(str2, str3);
                break;
            case 25:
                ((AudioSource) obj4).lambda$setAudioSourceCallback$6((Executor) obj3, (AudioSource.AudioSourceCallback) obj2);
                break;
            case 26:
                ((BufferedAudioStream) obj4).lambda$setCallback$3((AudioStream.AudioStreamCallback) obj2, (Executor) obj3);
                break;
            case 27:
                tv0.e eVar = (tv0.e) obj4;
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) obj3;
                WindowInsetsAnimation.Bounds bounds = (WindowInsetsAnimation.Bounds) obj2;
                if (eVar.f == windowInsetsAnimation) {
                    eVar.f274666a.dispatchWindowInsetsAnimationStart(windowInsetsAnimation, bounds);
                    ValueAnimator valueAnimator = eVar.f274667b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
                break;
            case 28:
                View view = (View) obj4;
                d0 d0Var = (d0) obj3;
                Function0 function0 = (Function0) obj2;
                ViewPropertyAnimator interpolator = view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).setStartDelay(0L).setInterpolator(d0Var.f274800b);
                Intrinsics.checkNotNullExpressionValue(interpolator, "setInterpolator(...)");
                ViewPropertyAnimator listener = interpolator.setListener(new e0(function0, d0Var, view, function0));
                Intrinsics.checkNotNullExpressionValue(listener, "setListener(...)");
                listener.start();
                break;
            default:
                ((l0) obj4).a((RecyclerView) obj3, (koi.h) obj2, true);
                break;
        }
    }

    public /* synthetic */ d(Object obj2, int i, Object obj3, Object obj4) {
        this.f11503a = i;
        this.f11504b = obj2;
        this.f11505c = obj3;
        this.d = obj4;
    }
}
