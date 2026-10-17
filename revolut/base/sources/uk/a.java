package uk;

import android.animation.ValueAnimator;
import android.graphics.BitmapShader;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.camera.camera2.pipe.config.ThreadConfigModule;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import az0.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.internal.navigation.CommandQueue;
import com.onfido.android.sdk.capture.internal.navigation.NavigationCommand;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import hoi.k;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import wl0.m;
import wl0.o;
import xl0.b;
import xp0.c;
import xp0.f;
import xp0.g;
import xr0.d;
import xr0.i;
import xv0.l;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f280636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f280637c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f280635a = i;
        this.f280636b = obj2;
        this.f280637c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f280635a) {
            case 0:
                CommandQueue.executeCommands$lambda$0((CommandQueue) this.f280636b, (NavigationCommand[]) this.f280637c);
                return;
            case 1:
                AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) this.f280636b;
                accountsNavBarContentView.i(accountsNavBarContentView.i.m((Throwable) this.f280637c));
                return;
            case 2:
                ((EncoderImpl) this.f280636b).lambda$acquireInputBuffer$14((CallbackToFutureAdapter.Completer) this.f280637c);
                return;
            case 3:
                ThreadConfigModule.provideThreads$lambda$6((Ref$ObjectRef) this.f280636b, (Ref$ObjectRef) this.f280637c);
                return;
            case 4:
                b bVar = (b) this.f280636b;
                bVar.f306895a.a(new m(this.f280637c, (o) bVar.e.getValue()));
                return;
            case 5:
                f fVar = (f) this.f280636b;
                BitmapShader bitmapShader = (BitmapShader) this.f280637c;
                View view = fVar.f307876a;
                if (!view.isLaidOut()) {
                    fVar.b();
                    return;
                }
                g gVar = fVar.d;
                c cVar = new c(fVar, 0);
                ValueAnimator valueAnimator = fVar.e;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                valueAnimatorOfFloat.setDuration(gVar.a());
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new k(gVar, fVar, view, bitmapShader, 1));
                valueAnimatorOfFloat.addListener(new o0(cVar, fVar, 15));
                valueAnimatorOfFloat.start();
                fVar.e = valueAnimatorOfFloat;
                return;
            case 6:
                i iVar = (i) this.f280636b;
                Object obj2 = this.f280637c;
                iVar.e = new d(obj2);
                iVar.f308197c.invoke(obj2);
                return;
            case 7:
                View view2 = (View) this.f280636b;
                l lVar = (l) this.f280637c;
                view2.setHasTransientState(false);
                view2.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
                lVar.f309153b.invoke(xv0.k.END);
                return;
            case 8:
                ((VideoRendererEventListener.EventDispatcher) this.f280636b).lambda$videoCodecParametersChanged$10((CodecParameters) this.f280637c);
                return;
            case 9:
                ((VideoRendererEventListener.EventDispatcher) this.f280636b).lambda$videoCodecError$9((Exception) this.f280637c);
                return;
            case 10:
                ((VideoRendererEventListener.EventDispatcher) this.f280636b).lambda$decoderReleased$7((String) this.f280637c);
                return;
            case 11:
                ((SphericalGLSurfaceView) this.f280636b).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.f280637c);
                return;
            default:
                uvl.c this$0 = (uvl.c) this.f280636b;
                byte[] data = (byte[]) this.f280637c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(data, "$data");
                synchronized (((LinkedHashSet) this$0.f283492b)) {
                    this$0.j(data);
                    Unit unit = Unit.f186387a;
                }
                return;
        }
    }
}
