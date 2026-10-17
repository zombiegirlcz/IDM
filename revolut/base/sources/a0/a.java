package a0;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.core.Preview;
import androidx.camera.viewfinder.ViewfinderSurfaceRequest;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import bt0.l;
import bt0.m;
import bt0.n;
import bt0.q;
import bw.p;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.google.android.material.appbar.AppBarLayoutProxy;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.firebase.messaging.u;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.OverlayTextView;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.orhanobut.dialogplus.DialogPlus;
import com.revolut.chat.ui.inbox.InboxScreen;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.internal.views.chart.h;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.feature.commodities.onboarding.impl.ui_kompot.risks.CommoditiesOnboardingRisksController;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import du2.j;
import dw.s;
import elm.f;
import eoi.r;
import io.reactivex.rxjava3.disposables.Disposable;
import ix0.j2;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import mx0.xb;
import skm.e0;
import skm.p0;
import whe.e;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f88b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f87a = i;
        this.f88b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int childAdapterPosition;
        View viewFindViewByPosition;
        Pair pair = 0;
        pair = 0;
        pair = 0;
        boolean z = true;
        switch (this.f87a) {
            case 0:
                CameraBackendsImpl._init_$lambda$0((CameraBackendsImpl) this.f88b);
                return;
            case 1:
                TextInputServiceAndroid.sendInputCommand$lambda$0((TextInputServiceAndroid) this.f88b);
                return;
            case 2:
                ((ViewfinderSurfaceRequest) this.f88b).lambda$new$3();
                return;
            case 3:
                ar0.d dVar = (ar0.d) this.f88b;
                dVar.f8481a.invoke(dVar.d);
                return;
            case 4:
                ((AnimatedVectorDrawableCompat) this.f88b).start();
                return;
            case 5:
                ((Preview) this.f88b).notifyReset();
                return;
            case 6:
                m mVar = (m) this.f88b;
                q qVar = mVar.f18241c;
                int i = qVar.f18246h;
                LineChartView lineChartView = qVar.f18244c;
                h drawingDelegateModel = lineChartView.getDrawingDelegateModel();
                Intrinsics.i(drawingDelegateModel, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.chart.delegates.LineChartTrendViewInteractionDrawingDelegate.Model");
                int i2 = l.f18238a[((n) drawingDelegateModel).f18242a.ordinal()];
                if (i2 == 1) {
                    mVar.f18240b = true;
                    i = qVar.f18246h;
                } else if (i2 == 2) {
                    mVar.f18240b = true;
                    qVar.h(qVar.f18246h, (int) lineChartView.getF56704g().f56719b.width());
                    return;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.f18240b = false;
                }
                if (mVar.f18240b && i >= 0 && i < lineChartView.getChartItems().size()) {
                    qVar.o.invoke(Integer.valueOf(i), Float.valueOf(lineChartView.getChartItems().get(i).f10631b));
                }
                lineChartView.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            case 7:
                ((p) this.f88b).close();
                return;
            case 8:
                AccountsController accountsController = (AccountsController) this.f88b;
                KProperty[] kPropertyArr = AccountsController.O0;
                whe.c cVar = (whe.c) accountsController.B0.getValue();
                e eVar = accountsController.L;
                if (!cVar.e && cVar.d) {
                    cVar.e = true;
                    AtomicReference atomicReference = r.f127969a;
                    r.e("screenDrawn", false);
                }
                if (!cVar.k && cVar.i) {
                    cVar.k = true;
                    AtomicReference atomicReference2 = r.f127969a;
                    r.e("balanceDrawn", false);
                }
                if (!cVar.f297630h && cVar.f) {
                    cVar.f297630h = true;
                    AtomicReference atomicReference3 = r.f127969a;
                    r.e("itemsDrawn", false);
                }
                if (cVar.e && cVar.f297630h && cVar.k) {
                    if (eVar != null) {
                        eVar.cancel();
                    }
                    AtomicReference atomicReference4 = r.f127969a;
                    eoi.q qVar2 = eoi.q.ACTIVE;
                    eoi.q qVar3 = eoi.q.FINISHED;
                    while (true) {
                        if (!atomicReference4.compareAndSet(qVar2, qVar3)) {
                            if (atomicReference4.get() != qVar2) {
                                z = false;
                            }
                        }
                    }
                    if (z) {
                        r.e = SystemClock.uptimeMillis() - r.d;
                    }
                    if (z) {
                        CoroutineScope coroutineScope = cVar.f297626a;
                        p0 p0Var = p0.f264001a;
                        e0.C(coroutineScope, f.f127540b, null, new w65.c(cVar, pair, 22), 2);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = (CommoditiesOnboardingRisksController) this.f88b;
                CommoditiesOnboardingRisksController.a aVar = CommoditiesOnboardingRisksController.Companion;
                RecyclerView.LayoutManager layoutManager = commoditiesOnboardingRisksController.e3().getLayoutManager();
                Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                commoditiesOnboardingRisksController.f3().setCollapsed(!(linearLayoutManager.findLastCompletelyVisibleItemPosition() >= linearLayoutManager.getItemCount() - 1), false);
                commoditiesOnboardingRisksController.f3().setMainButtonVisible(true);
                return;
            case 10:
                ((AFe1vSDK) this.f88b).values();
                return;
            case 11:
                AFd1bSDK.AFInAppEventType((AFd1bSDK) this.f88b);
                return;
            case 12:
                AppBarLayoutProxy.onWindowInsetChanged$lambda$1((AppBarLayoutProxy) this.f88b);
                return;
            case 13:
                ((CarouselLayoutManager) this.f88b).refreshKeylineState();
                return;
            case 14:
                ((MaterialBackOrchestrator) this.f88b).startListeningForBackCallbacksWithPriorityOverlay();
                return;
            case 15:
                u uVar = (u) this.f88b;
                synchronized (((ArrayDeque) uVar.d)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) uVar.f49545a).edit();
                    String str = (String) uVar.f49546b;
                    StringBuilder sb6 = new StringBuilder();
                    Iterator it8 = ((ArrayDeque) uVar.d).iterator();
                    while (it8.hasNext()) {
                        sb6.append((String) it8.next());
                        sb6.append((String) uVar.f49547c);
                    }
                    editorEdit.putString(str, sb6.toString()).commit();
                    break;
                }
                return;
            case 16:
                CaptureActivity.onManualFallbackDelayFinished$lambda$13$lambda$12((OnfidoCaptureValidationBubble) this.f88b);
                return;
            case 17:
                CaptureActivity.glareBubbleRunnable$lambda$0((CaptureActivity) this.f88b);
                return;
            case 18:
                CapturePresenter.stopDocumentVideoRecordingAndCameraFeed$lambda$13((CapturePresenter) this.f88b);
                return;
            case 19:
                OverlayTextView.onSizeChanged$lambda$9((OverlayTextView) this.f88b);
                return;
            case 20:
                ((DialogPlus) this.f88b).c();
                return;
            case 21:
                r7.l.b((InputStream) this.f88b);
                return;
            case 22:
                r7.l.b((ZipInputStream) this.f88b);
                return;
            case 23:
                j jVar = (j) this.f88b;
                ((xb) jVar.i.getValue()).b();
                ViewCompat.setOnApplyWindowInsetsListener(jVar.f117545g, new abf.c(du2.f.HIDE, jVar, 20));
                jVar.e.requestApplyInsets();
                return;
            case 24:
                s sVar = ((dw.u) this.f88b).f118223a;
                if (sVar.f118213c) {
                    return;
                }
                sVar.o = null;
                sVar.d();
                return;
            case 25:
                InboxScreen inboxScreen = (InboxScreen) this.f88b;
                KProperty[] kPropertyArr2 = InboxScreen.f0;
                if (!Intrinsics.f(inboxScreen.d3().d.getItemAnimator(), inboxScreen.K)) {
                    inboxScreen.d3().d.setItemAnimator(inboxScreen.K);
                }
                j2 j2Var = inboxScreen.f51166e0;
                if (j2Var != null) {
                    j2Var.cancel();
                }
                inboxScreen.f51166e0 = null;
                return;
            case 26:
                et0.a aVar2 = (et0.a) this.f88b;
                View view = aVar2.f129001a;
                ViewGroup viewGroup = aVar2.f129003c;
                int iF = (int) knm.b.f(view, viewGroup);
                Integer num = aVar2.f;
                int iIntValue = iF + (num != null ? num.intValue() : view.getMeasuredWidth() / 2);
                int iH = (int) knm.b.h(view, viewGroup);
                Integer num2 = aVar2.f129004g;
                int iIntValue2 = iH + (num2 != null ? num2.intValue() : 0);
                View view2 = aVar2.e;
                if (view2 == null) {
                    return;
                }
                int width = iIntValue - ((view2.getWidth() / 2) + view2.getLeft());
                int bottom = (iIntValue2 - aVar2.f129002b) - view2.getBottom();
                if (width != 0) {
                    view2.offsetLeftAndRight(width);
                }
                if (bottom != 0) {
                    view2.offsetTopAndBottom(bottom);
                    return;
                }
                return;
            case 27:
                ChatBubbleContainer.f0((ChatBubbleContainer) this.f88b);
                return;
            case 28:
                ey0.d dVar2 = ((SpinnerPickerView) this.f88b).f59702n;
                if (dVar2 != null) {
                    RecyclerView recyclerView = dVar2.f130510a;
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                    if (linearLayoutManager2 == null) {
                        return;
                    }
                    View viewFindSnapView = dVar2.f130511b.findSnapView(linearLayoutManager2);
                    if (viewFindSnapView != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView)) != -1 && (viewFindViewByPosition = linearLayoutManager2.findViewByPosition(childAdapterPosition - 1)) != null) {
                        pair = new Pair(viewFindSnapView, viewFindViewByPosition);
                    }
                    if (pair == 0) {
                        return;
                    }
                    View view3 = (View) pair.f186385a;
                    View view4 = (View) pair.f186386b;
                    dVar2.a();
                    dVar2.f130512c = true;
                    dVar2.d = false;
                    new ey0.c(dVar2, view3, view4, new a76.c(0, dVar2, ey0.d.class, "finish", "finish()V", 0, 16)).run();
                    return;
                }
                return;
            default:
                ((Disposable) this.f88b).dispose();
                return;
        }
    }
}
