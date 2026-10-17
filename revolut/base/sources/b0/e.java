package b0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.mlkit.vision.MlKitAnalyzer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Configuration;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.internal.views.NumberlessCardView;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.NoWhenBranchMatchedException;
import tw0.l0;
import tw0.r0;
import tx0.i4;
import tx0.j4;
import tx0.m4;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11508c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f11506a = i;
        this.f11507b = obj2;
        this.f11508c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener, tx0.i4] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11506a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f11508c;
        Object obj5 = this.f11507b;
        switch (i) {
            case 0:
                ((ImageCapture) obj5).lambda$takePicture$2((ImageCapture.OutputFileOptions) obj4, (Executor) obj3, (ImageCapture.OnImageSavedCallback) obj2);
                break;
            case 1:
                ((DefaultSurfaceProcessor) obj5).lambda$initGlRenderer$9((DynamicRange) obj4, (Map) obj3, (CallbackToFutureAdapter.Completer) obj2);
                break;
            case 2:
                oe.c cVar = (oe.c) obj5;
                String str = (String) obj4;
                Map map = (Map) obj3;
                List list = (List) obj2;
                ke.h hVar = (ke.h) cVar.f224498b;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) cVar.f224500g;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    hVar.j(str, (String) atomicMarkableReference.getReference());
                }
                if (!map.isEmpty()) {
                    hVar.h(str, map, false);
                }
                if (!list.isEmpty()) {
                    hVar.i(str, list);
                }
                break;
            case 3:
                ((DualSurfaceProcessor) obj5).lambda$initGlRenderer$5((DynamicRange) obj4, (Map) obj3, (CallbackToFutureAdapter.Completer) obj2);
                break;
            case 4:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar2 = rd0.c.DEBUG;
                StringBuilder sbM = v0.a.m("onUnsupportedTarget target=", str2, ", country=", str3, ", address=");
                sbM.append(str4);
                rd0.d.b(cVar2, "KontomatikSignInJS", sbM.toString(), null, null, 16);
                ((mc4.g) obj5).d.invoke(str2, str3, str4);
                break;
            case 5:
                NumberlessCardView.Companion aVar = NumberlessCardView.INSTANCE;
                ((NumberlessCardView) obj5).a((AppCompatTextView) obj4, ((Integer) obj3).intValue(), ((Integer) obj2).intValue());
                break;
            case 6:
                ((MlKitAnalyzer) obj5).lambda$detectRecursively$0((Map) obj4, (ImageProxy) obj3, (Map) obj2);
                break;
            case 7:
                Schedulers.lambda$registerRescheduling$0((List) obj5, (WorkGenerationalId) obj4, (Configuration) obj3, (WorkDatabase) obj2);
                break;
            case 8:
                CameraCallbackMap.onComplete_CcXjc1I$lambda$0((CameraUseCaseAdapter.CaptureCallbackContainer) obj5, (CameraCaptureSession) obj4, (CaptureRequest) obj3, (TotalCaptureResult) obj2);
                break;
            case 9:
                CameraCallbackMap.onComplete_CcXjc1I$lambda$1((CameraCaptureCallback) obj5, (CameraCallbackMap) obj4, (RequestMetadata) obj3, (CaptureResultAdapter) obj2);
                break;
            case 10:
                CameraCallbackMap.onFailed_CcXjc1I$lambda$0((CameraUseCaseAdapter.CaptureCallbackContainer) obj5, (CameraCaptureSession) obj4, (CaptureRequest) obj3, (CaptureFailure) obj2);
                break;
            case 11:
                CameraCallbackMap.onFailed_CcXjc1I$lambda$1((CameraCaptureCallback) obj5, (CameraCallbackMap) obj4, (RequestMetadata) obj3, (CameraCaptureFailure) obj2);
                break;
            case 12:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj5;
                RecyclerView.Adapter adapter = (RecyclerView.Adapter) obj4;
                View view = (View) obj3;
                View view2 = (View) obj2;
                boolean z = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
                boolean z3 = linearLayoutManager.findLastCompletelyVisibleItemPosition() == adapter.getItemCount() - 1;
                knm.b.z(view, !z, null, 14);
                knm.b.z(view2, !z3, null, 14);
                break;
            case 13:
                l0 l0Var = (l0) obj5;
                koi.h hVar2 = (koi.h) obj4;
                toh.h hVar3 = new toh.h(l0Var, 2, hVar2, (RecyclerView) obj2);
                l0Var.getClass();
                hVar2.registerAdapterDataObserver(new r0(hVar2, l0Var, hVar3));
                ((nsh.e) obj3).invoke();
                break;
            default:
                final SlidingFromTopViewContainer slidingFromTopViewContainer = (SlidingFromTopViewContainer) obj5;
                final au0.o oVar = (au0.o) obj4;
                RecyclerView recyclerView = (RecyclerView) obj3;
                final j4 j4Var = (j4) obj2;
                slidingFromTopViewContainer.f59472p = null;
                i4 i4Var = slidingFromTopViewContainer.f59471n;
                if (i4Var != null) {
                    oVar.removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) i4Var);
                }
                m4 m4Var = slidingFromTopViewContainer.o;
                if (m4Var != null) {
                    recyclerView.removeOnScrollListener(m4Var);
                }
                slidingFromTopViewContainer.f59471n = null;
                slidingFromTopViewContainer.o = null;
                ?? r06 = new AppBarLayout.OnOffsetChangedListener() { // from class: tx0.i4
                    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                    public final void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
                        int i3 = SlidingFromTopViewContainer.f59462q;
                        int i5 = k4.f275177a[j4Var.ordinal()];
                        if (i5 == 1) {
                            slidingFromTopViewContainer.a(oVar.getExpandRatio() == BitmapDescriptorFactory.HUE_RED);
                        } else if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                };
                oVar.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) r06);
                slidingFromTopViewContainer.f59471n = r06;
                m4 m4Var2 = new m4(oVar, slidingFromTopViewContainer, j4Var);
                recyclerView.addOnScrollListener(m4Var2);
                slidingFromTopViewContainer.o = m4Var2;
                break;
        }
    }
}
