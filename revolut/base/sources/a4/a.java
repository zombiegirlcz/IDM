package a4;

import abm.c;
import abm.d;
import abm.e;
import abm.f;
import agh.h;
import aie.g;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.Preview;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactionExecutor;
import androidx.view.ComponentActivity;
import androidx.view.OnBackPressedDispatcher;
import au0.o;
import az0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import com.google.firebase.messaging.n;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMBridgeContext;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.feature.tab.accounts.impl.ui.spaces.i;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import io.fotoapparat.exception.UnableToDecodeBitmapException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import laj.b;
import nd.k;
import org.json.JSONObject;
import v8.l;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1182c;

    public /* synthetic */ a(CaptureActivity captureActivity, String str) {
        this.f1180a = 18;
        this.f1182c = captureActivity;
        this.f1181b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1180a;
        int i2 = 0;
        Object obj2 = this.f1182c;
        Object obj3 = this.f1181b;
        switch (i) {
            case 0:
                FragmentStrictMode.handlePolicyViolation$lambda$1((String) obj3, (Violation) obj2);
                break;
            case 1:
                e this$0 = (e) obj3;
                k kVar = this$0.f2994b;
                b callback = (b) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                try {
                    f function = new f(new c(callback, this$0.a(), i2));
                    ExecutorService executorService = qam.f.f244072a;
                    Intrinsics.checkNotNullParameter(function, "function");
                    qam.f.f244073b.post(new o6.a(function));
                } catch (UnableToDecodeBitmapException unused) {
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter("Couldn't decode bitmap from byte array", "message");
                    f function2 = new f(new d(callback, i2));
                    ExecutorService executorService2 = qam.f.f244072a;
                    Intrinsics.checkNotNullParameter(function2, "function");
                    qam.f.f244073b.post(new o6.a(function2));
                    return;
                } catch (InterruptedException unused2) {
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter("Couldn't deliver pending result: Camera stopped before delivering result.", "message");
                    return;
                } catch (CancellationException unused3) {
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter("Couldn't deliver pending result: Camera operation was cancelled.", "message");
                    return;
                } catch (ExecutionException unused4) {
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter("Couldn't deliver pending result: Operation failed internally.", "message");
                    f function3 = new f(new d(callback, 1));
                    ExecutorService executorService3 = qam.f.f244072a;
                    Intrinsics.checkNotNullParameter(function3, "function");
                    qam.f.f244073b.post(new o6.a(function3));
                    return;
                }
                break;
            case 2:
                AccountSpacesScreen accountSpacesScreen = (AccountSpacesScreen) obj3;
                KProperty[] kPropertyArr = AccountSpacesScreen.Y;
                aie.f fVar = ((g) obj2).f5240a;
                int i3 = fVar.f5238a;
                if (i3 != -1) {
                    RecyclerView.LayoutManager layoutManager = ((tki.b) accountSpacesScreen.k()).f271959b.h().getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                        if (iFindFirstCompletelyVisibleItemPosition <= i3 && i3 <= iFindLastCompletelyVisibleItemPosition) {
                            i iVar = (i) accountSpacesScreen.k3();
                            iVar.K2();
                            iVar.H2(iVar.I, new h(26));
                        }
                    }
                    ((tki.b) accountSpacesScreen.k()).f271959b.h().post(new a(fVar, accountSpacesScreen, 3));
                    break;
                }
                break;
            case 3:
                aie.f fVar2 = (aie.f) obj3;
                AccountSpacesScreen accountSpacesScreen2 = (AccountSpacesScreen) obj2;
                KProperty[] kPropertyArr2 = AccountSpacesScreen.Y;
                boolean z = fVar2.f5239b;
                int i5 = fVar2.f5238a;
                if (!z) {
                    ((tki.b) accountSpacesScreen2.k()).f271959b.h().scrollToPosition(i5);
                } else {
                    ((tki.b) accountSpacesScreen2.k()).f271959b.h().smoothScrollToPosition(i5);
                }
                break;
            case 4:
                ((ali.f) obj3).a(((oki.a) obj2).getF79629b());
                break;
            case 5:
                ((ComponentActivity) obj3).addObserverForBackInvoker((OnBackPressedDispatcher) obj2);
                break;
            case 6:
                ((DispatchQueue) obj3).enqueue((Runnable) obj2);
                break;
            case 7:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) obj3, (TransactionExecutor) obj2);
                break;
            case 8:
                as0.f fVar3 = (as0.f) obj3;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) obj2;
                fVar3.b(screenContentRecyclerView);
                ArrayList arrayList = fVar3.f;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    as0.c cVar = (as0.c) obj4;
                    if (cVar.f8739b) {
                        Object obj5 = cVar.f8738a;
                        fu0.i iVar2 = obj5 instanceof fu0.i ? (fu0.i) obj5 : null;
                        if (iVar2 != null) {
                            fu0.h highlightTarget = iVar2.getHighlightTarget();
                            highlightTarget.B();
                            cVar.d.set(knm.b.f(highlightTarget.getView(), screenContentRecyclerView), knm.b.h(highlightTarget.getView(), screenContentRecyclerView));
                            cVar.f8740c = highlightTarget.b();
                        }
                        break;
                    }
                    i2++;
                }
                break;
            case 9:
                CollapsingAppBarLayout$Behavior collapsingAppBarLayout$Behavior = (CollapsingAppBarLayout$Behavior) obj3;
                o oVar = (o) obj2;
                collapsingAppBarLayout$Behavior.f = null;
                float fL = oVar.l();
                if (fL >= BitmapDescriptorFactory.HUE_RED && oVar.getLastExpandRatio$ui_kit_components_release() != fL) {
                    collapsingAppBarLayout$Behavior.d(fL);
                    break;
                }
                break;
            case 10:
                com.bumptech.glide.b.d(((v1) obj3).f11367a).m((l) obj2);
                break;
            case 11:
                ((CameraX) obj3).lambda$shutdownInternal$4((CallbackToFutureAdapter.Completer) obj2);
                break;
            case 12:
                ImageAnalysis.lambda$createPipeline$1((SafeCloseImageReaderProxy) obj3, (SafeCloseImageReaderProxy) obj2);
                break;
            case 13:
                ((MetadataImageReader) obj3).lambda$enqueueImageProxy$1((ImageReaderProxy.OnImageAvailableListener) obj2);
                break;
            case 14:
                ((Preview) obj3).lambda$createPipeline$0((CameraInternal) obj2);
                break;
            case 15:
                ((Preview.SurfaceProvider) obj3).onSurfaceRequested((SurfaceRequest) obj2);
                break;
            case 16:
                ((RemovalListener) obj3).onRemoval((RemovalNotification) obj2);
                break;
            case 17:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                try {
                    taskCompletionSource.setResult(((n) obj3).d());
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
                break;
            case 18:
                CaptureActivity.onVideoCaptured$lambda$23((CaptureActivity) obj2, (String) obj3);
                break;
            case 19:
                OverlayView.resetFaceDetectedState$lambda$11((Function0) obj3, (OverlayView) obj2);
                break;
            case 20:
                APMPMBridgeContext.sendBridgeResult$lambda$0((APMPMBridgeContext) obj3, (JSONObject) obj2);
                break;
            case 21:
                BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) obj3;
                Handler handler = (Handler) obj2;
                if (baseDelegatesActivity.getLifecycle().getState() != Lifecycle.State.DESTROYED) {
                    baseDelegatesActivity.getLifecycle().addObserver(new cwl.e(baseDelegatesActivity, handler, i2));
                } else {
                    handler.removeCallbacksAndMessages(null);
                }
                break;
            case 22:
                ((ProcessingRequest) obj3).onPostviewBitmapAvailable((Bitmap) obj2);
                break;
            case 23:
                ((ProcessingRequest) obj3).onFinalResult((ImageProxy) obj2);
                break;
            case 24:
                ((ProcessingRequest) obj3).onFinalResult((ImageCapture.OutputFileResults) obj2);
                break;
            case 25:
                ((ProcessingRequest) obj3).onProcessFailure((ImageCaptureException) obj2);
                break;
            case 26:
                ((TakePictureManagerImpl) obj3).lambda$trackCurrentRequests$1((RequestWithCallback) obj2);
                break;
            case 27:
                ((TakePictureRequest) obj3).lambda$onPostviewBitmapAvailable$4((Bitmap) obj2);
                break;
            case 28:
                ((TakePictureRequest) obj3).lambda$onResult$2((ImageProxy) obj2);
                break;
            default:
                ((TakePictureRequest) obj3).lambda$onResult$1((ImageCapture.OutputFileResults) obj2);
                break;
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f1180a = i;
        this.f1181b = obj2;
        this.f1182c = obj3;
    }
}
