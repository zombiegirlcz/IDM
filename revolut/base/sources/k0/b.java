package k0;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.core.CameraState;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.util.Consumer;
import androidx.media3.exoplayer.CodecParameters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.primitives.Bytes;
import com.revolut.carousel_with_sheet.shared.ui.screen.CarouselWithBottomSheetScreen;
import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.core.ui_kit.views.CardPersonalisationDrawingView;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.o;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListScreen;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.kompot.common.bottom_sheet.status.StatusSheetController;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.connexion.BatteryLevelListener;
import com.youTransactor.uCube.connexion.BleService;
import com.youTransactor.uCube.connexion.ConnectionStatus;
import com.youTransactor.uCube.connexion.ResponseListener;
import com.youTransactor.uCube.connexion.SVPPRestartListener;
import defpackage.j0;
import defpackage.r;
import defpackage.t1;
import defpackage.v0;
import et0.p0;
import ix0.f2;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ky4.f;
import lt0.v;
import mv0.i;
import mx0.d4;
import nii.k1;
import nii.q1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f179882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f179883c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f179881a = i;
        this.f179882b = obj2;
        this.f179883c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws ProcessingException {
        j0 j0Var;
        Intent intent;
        int i;
        switch (this.f179881a) {
            case 0:
                ((DefaultSurfaceProcessor) this.f179882b).lambda$onOutputSurface$4((SurfaceOutput) this.f179883c);
                return;
            case 1:
                ((DefaultSurfaceProcessor) this.f179882b).lambda$onInputSurface$2((SurfaceRequest) this.f179883c);
                return;
            case 2:
                ((SurfaceProcessorWithExecutor) this.f179882b).lambda$onInputSurface$0((SurfaceRequest) this.f179883c);
                return;
            case 3:
                ((SurfaceProcessorWithExecutor) this.f179882b).lambda$onOutputSurface$1((SurfaceOutput) this.f179883c);
                return;
            case 4:
                khe.d dVar = (khe.d) this.f179882b;
                TotalWealthCategoryListScreen totalWealthCategoryListScreen = (TotalWealthCategoryListScreen) this.f179883c;
                KProperty[] kPropertyArr = TotalWealthCategoryListScreen.X;
                boolean z = dVar.f184099b;
                int i2 = dVar.f184098a;
                if (z) {
                    ((tki.b) totalWealthCategoryListScreen.f3()).f271959b.h().smoothScrollToPosition(i2);
                    return;
                } else {
                    ((tki.b) totalWealthCategoryListScreen.f3()).f271959b.h().scrollToPosition(i2);
                    return;
                }
            case 5:
                kp0.j0 j0Var2 = (kp0.j0) this.f179882b;
                j0Var2.c((Image) this.f179883c);
                j0Var2.f188024a.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
                return;
            case 6:
                kp0.j0 j0Var3 = (kp0.j0) this.f179882b;
                j0Var3.b((ResourceImage) this.f179883c);
                j0Var3.f188027g = null;
                return;
            case 7:
                j0Var = (j0) this.f179882b;
                intent = (Intent) this.f179883c;
                String action = intent.getAction();
                action.getClass();
                i = 2;
                switch (action) {
                    case "com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_STATE_CONNECTED":
                        v0 v0Var = j0Var.f169899b;
                        BluetoothDevice remoteDevice = v0Var.f284694j.getRemoteDevice(v0Var.f284690b.getAddress());
                        if (remoteDevice != null && remoteDevice.getBondState() == 12) {
                            v0 v0Var2 = j0Var.f169899b;
                            if (v0Var2.G == 5) {
                                v0Var2.a();
                                return;
                            }
                            return;
                        }
                        return;
                    case "com.youtransactor.ucube.le.ACTION_GATT_CLOSED":
                        v0 v0Var3 = j0Var.f169899b;
                        v0Var3.A = null;
                        v0Var3.j();
                        v0.d(j0Var.f169899b);
                        return;
                    case "com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR":
                        j0Var.f169899b.c(ConnectionStatus.ERROR_CONNECTION_FAILED);
                        return;
                    case "com.youtransactor.ucube.le.ACTION_GATT_WRITE_ERROR":
                        j0Var.f169899b.g(false);
                        return;
                    case "com.youtransactor.ucube.le.ACTION_GATT_DISCONNECTED":
                        v0 v0Var4 = j0Var.f169899b;
                        t1.b(" Device disconnected", new Exception[0]);
                        v0Var4.f();
                        return;
                    case "com.youtransactor.ucube.le.ACTION_DEVICE_GET_STUCK":
                        v0 v0Var5 = j0Var.f169899b;
                        t1.b("Device get Stuck, SVPP Restart", new Exception[0]);
                        v0Var5.f();
                        SVPPRestartListener sVPPRestartListener = v0Var5.C;
                        if (sVPPRestartListener != null) {
                            sVPPRestartListener.onSVPPRestart();
                            return;
                        }
                        return;
                    case "com.youtransactor.ucube.le.ACTION_GATT_BATTERY_LEVEL_RECEIVED":
                        int intExtra = intent.getIntExtra("BatteryLevel", -1);
                        if (intExtra < 0) {
                            return;
                        }
                        v0 v0Var6 = j0Var.f169899b;
                        t1.a("Battery level: " + intExtra);
                        v0Var6.v = Integer.valueOf(intExtra);
                        BatteryLevelListener batteryLevelListener = v0Var6.i;
                        if (batteryLevelListener != null) {
                            batteryLevelListener.onLevelChanged(intExtra);
                            return;
                        }
                        return;
                    case "com.youtransactor.ucube.le.ACTION_GATT_RX_RECEIVED":
                        byte[] byteArrayExtra = intent.getByteArrayExtra("RX");
                        t1.a("RX Data : " + Tools.bytesToHex(byteArrayExtra));
                        v0 v0Var7 = j0Var.f169899b;
                        synchronized (v0Var7) {
                            if (byteArrayExtra != null) {
                                try {
                                    if (byteArrayExtra.length != 0) {
                                        byte[] bArr = v0Var7.f284704x;
                                        boolean z3 = bArr.length == 0;
                                        v0Var7.f284704x = Bytes.concat(bArr, byteArrayExtra);
                                        if (z3) {
                                            byte[] bArrE = d8l.d.e(byteArrayExtra);
                                            t1.a("START receiving response, first buffer: " + Tools.bytesToHex(bArrE));
                                            ResponseListener responseListener = v0Var7.f;
                                            if (responseListener != null) {
                                                responseListener.onStart(bArrE);
                                            }
                                        } else {
                                            Timer timer = v0Var7.f284689a;
                                            if (timer != null) {
                                                timer.cancel();
                                                v0Var7.f284689a.purge();
                                            }
                                        }
                                        byte[] bArr2 = v0Var7.f284704x;
                                        if (bArr2[bArr2.length - 2] != 14 || (bArr2[bArr2.length - 1] != 14 && bArr2[bArr2.length - 1] != 15)) {
                                            try {
                                                Timer timer2 = new Timer();
                                                v0Var7.f284689a = timer2;
                                                timer2.schedule(new r(v0Var7, i), 2000L);
                                            } catch (IllegalArgumentException | IllegalStateException e) {
                                                e.printStackTrace();
                                            }
                                            break;
                                        } else {
                                            byte[] bArrE2 = d8l.d.e(bArr2);
                                            v0Var7.f284704x = new byte[0];
                                            t1.a("response: " + Tools.bytesToHex(bArrE2));
                                            ResponseListener responseListener2 = v0Var7.f;
                                            if (responseListener2 != null) {
                                                responseListener2.onSuccess(bArrE2);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                } catch (Throwable th10) {
                                    throw th10;
                                }
                            }
                            t1.b("Ignore! Response is 'empty'", new Exception[0]);
                            return;
                        }
                    case "com.youtransactor.ucube.le.ACTION_GATT_CONNECTED":
                        v0 v0Var8 = j0Var.f169899b;
                        synchronized (v0Var8.f284698p) {
                            try {
                                if (v0Var8.o) {
                                    v0Var8.a();
                                } else {
                                    t1.b("GATT Connected: No connection is running", new Exception[0]);
                                }
                            } finally {
                            }
                        }
                        return;
                    case "com.youtransactor.ucube.le.ACTION_GATT_WRITE_DONE":
                        j0Var.f169899b.g(true);
                        return;
                    default:
                        return;
                }
            case 8:
                ((DualSurfaceProcessor) this.f179882b).lambda$onInputSurface$1((SurfaceRequest) this.f179883c);
                return;
            case 9:
                ((DualSurfaceProcessor) this.f179882b).lambda$onOutputSurface$3((SurfaceOutput) this.f179883c);
                return;
            case 10:
                ((ViewTransition) this.f179882b).lambda$applyTransition$0((View[]) this.f179883c);
                return;
            case 11:
                v vVar = (v) this.f179882b;
                MultiTargetFanChartView multiTargetFanChartView = (MultiTargetFanChartView) this.f179883c;
                float f = vVar.b().x;
                ViewParent parent = multiTargetFanChartView.getParent();
                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                vVar.g(f, parent);
                multiTargetFanChartView.invalidate();
                return;
            case 12:
                ((i) this.f179882b).f209076b.setVideoSurface((Surface) this.f179883c);
                return;
            case 13:
                com.revolut.core.ui_kit.views.e eVar = (com.revolut.core.ui_kit.views.e) this.f179882b;
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f179883c;
                TextView textView = eVar.i;
                textView.setText(spannableStringBuilder);
                TextView textView2 = eVar.f59054h;
                textView2.setTextSize(0, Float.min(eVar.f59056l, textView.getTextSize()));
                textView2.setText(spannableStringBuilder);
                return;
            case 14:
                CardPersonalisationDrawingView cardPersonalisationDrawingView = (CardPersonalisationDrawingView) this.f179882b;
                List list = (List) this.f179883c;
                CardPersonalisationDrawingView.Companion aVar = CardPersonalisationDrawingView.INSTANCE;
                Path path = new Path();
                int i3 = 0;
                for (Object obj2 : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    PointF pointF = (PointF) obj2;
                    if (i3 == 0) {
                        path.moveTo(pointF.x, pointF.y);
                    } else {
                        path.lineTo(pointF.x, pointF.y);
                    }
                    i3 = i5;
                }
                path.close();
                cardPersonalisationDrawingView.F = path;
                Path path2 = new Path();
                path2.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                path2.lineTo(cardPersonalisationDrawingView.getMeasuredWidth(), BitmapDescriptorFactory.HUE_RED);
                path2.lineTo(cardPersonalisationDrawingView.getMeasuredWidth(), cardPersonalisationDrawingView.getMeasuredHeight());
                path2.lineTo(BitmapDescriptorFactory.HUE_RED, cardPersonalisationDrawingView.getMeasuredHeight());
                path2.close();
                Path path3 = cardPersonalisationDrawingView.F;
                Intrinsics.h(path3);
                path2.op(path3, Path.Op.DIFFERENCE);
                cardPersonalisationDrawingView.E = path2;
                Path path4 = cardPersonalisationDrawingView.F;
                if (path4 != null) {
                    RectF rectF = new RectF();
                    path4.computeBounds(rectF, false);
                    cardPersonalisationDrawingView.I = rectF.centerX();
                    cardPersonalisationDrawingView.J = rectF.centerY();
                }
                cardPersonalisationDrawingView.h();
                cardPersonalisationDrawingView.invalidate();
                return;
            case 15:
                CardPersonalisationView.f0((CardPersonalisationView) this.f179882b, (List) this.f179883c);
                return;
            case 16:
                ChatInputView chatInputView = (ChatInputView) this.f179882b;
                et0.a aVar2 = (et0.a) this.f179883c;
                p0 p0Var = chatInputView.f58471w;
                if (p0Var == null) {
                    Intrinsics.r("handsFreePopupView");
                    throw null;
                }
                p0Var.setVisibility(8);
                f2 f2Var = aVar2.d;
                View view = f2Var.f169234a;
                if (f2Var.d) {
                    f2Var.d = false;
                    view.removeOnAttachStateChangeListener(f2Var);
                    f2Var.onViewDetachedFromWindow(view);
                    return;
                }
                return;
            case 17:
                ChatInputView chatInputView2 = (ChatInputView) this.f179882b;
                d4 d4Var = (d4) this.f179883c;
                chatInputView2.f58456k0 = null;
                chatInputView2.Z(d4Var, false);
                return;
            case 18:
                ViewGroup viewGroup = (ViewGroup) this.f179882b;
                kge.d dVar2 = (kge.d) this.f179883c;
                viewGroup.setVisibility(8);
                ((o) dVar2.f183974b).getEmbeddedContentActivator$ui_kit_components_release().d(dVar2);
                return;
            case 19:
                ((Consumer) this.f179882b).accept((CameraState) this.f179883c);
                return;
            case 20:
                ((PlayerView) this.f179882b).lambda$onImageAvailable$1((Bitmap) this.f179883c);
                return;
            case 21:
                q1 q1Var = (q1) this.f179882b;
                StatusSheetController statusSheetController = (StatusSheetController) this.f179883c;
                if (Intrinsics.f(q1Var.e, statusSheetController)) {
                    q1Var.e = null;
                    q1Var.g(new k1(statusSheetController.d3()));
                    return;
                }
                return;
            case 22:
                ((com.revolut.core.ui_kit_core.displayers.haptic.b) ((xy0.a) this.f179882b)).a(new Haptic.Effect((com.revolut.core.ui_kit_core.displayers.haptic.c) this.f179883c, true));
                return;
            case 23:
                noi.c cVar = (noi.c) this.f179882b;
                Toast.makeText(cVar.f218048a, (String) this.f179883c, 1).show();
                cVar.f218049b = jli.b.d();
                return;
            case 24:
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.f179882b;
                TransportLocationChooserScreen transportLocationChooserScreen = (TransportLocationChooserScreen) this.f179883c;
                KProperty[] kPropertyArr2 = TransportLocationChooserScreen.c0;
                navBarWithToolbar.E0();
                View currentFocus = transportLocationChooserScreen.m2().getCurrentFocus();
                if (currentFocus != null) {
                    kli.c.d(currentFocus, 0L);
                    return;
                }
                return;
            case 25:
                ((CarouselWithBottomSheetScreen) this.f179882b).d3(((o10.b) this.f179883c).k());
                return;
            case 26:
                ((AudioRendererEventListener.EventDispatcher) this.f179882b).lambda$decoderReleased$5((String) this.f179883c);
                return;
            case 27:
                ((AudioRendererEventListener.EventDispatcher) this.f179882b).lambda$audioCodecParametersChanged$13((CodecParameters) this.f179883c);
                return;
            case 28:
                f fVar = (f) this.f179882b;
                r5.c cVar2 = (r5.c) this.f179883c;
                fVar.invoke();
                cVar2.invoke();
                return;
            default:
                ((BleService) this.f179882b).b((byte[]) this.f179883c);
                return;
        }
    }
}
