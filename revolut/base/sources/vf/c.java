package vf;

import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_artboard.PlainLabelView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vu0.o;
import xf.f0;
import xf.h0;
import xf.i0;
import xf.n;
import xf.x;
import xmd.q;
import xmd.y;
import xv0.p;
import xv0.s;
import xv0.t;
import xv0.v;
import yf1.z;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f288376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f288377c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Object obj2, int i, Object obj3, Object obj4) {
        this.f288375a = i;
        this.f288376b = obj2;
        this.f288377c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f288375a;
        Object obj2 = this.d;
        Object obj3 = this.f288377c;
        Object obj4 = this.f288376b;
        switch (i) {
            case 0:
                ((GaugeManager) obj4).lambda$startCollectingGauges$2((String) obj3, (n) obj2);
                break;
            case 1:
                ((EncoderImpl) obj4).lambda$stopMediaCodec$12((ArrayList) obj3, (Runnable) obj2);
                break;
            case 2:
                wf.e eVar = (wf.e) obj4;
                eVar.getClass();
                h0 h0VarNewBuilder = i0.newBuilder();
                h0VarNewBuilder.c();
                ((i0) h0VarNewBuilder.f49761b).setGaugeMetric((x) obj3);
                eVar.d(h0VarNewBuilder, (n) obj2);
                break;
            case 3:
                wf.e eVar2 = (wf.e) obj4;
                eVar2.getClass();
                h0 h0VarNewBuilder2 = i0.newBuilder();
                h0VarNewBuilder2.c();
                ((i0) h0VarNewBuilder2.f49761b).setNetworkRequestMetric((f0) obj3);
                eVar2.d(h0VarNewBuilder2, (n) obj2);
                break;
            case 4:
                PlainLabelView plainLabelView = (PlainLabelView) obj4;
                KProperty[] kPropertyArr = SetupBudgetController.X;
                plainLabelView.setModel(((q) obj3).f307192a);
                long j2 = SetupBudgetController.Z;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = plainLabelView.animate();
                viewPropertyAnimatorAnimate.cancel();
                ViewPropertyAnimator startAnimation = viewPropertyAnimatorAnimate.setDuration(kotlin.time.b.f(j2));
                Intrinsics.checkNotNullExpressionValue(startAnimation, "setDuration(...)");
                Intrinsics.checkNotNullParameter(startAnimation, "$this$startAnimation");
                startAnimation.alpha(1.0f);
                startAnimation.withEndAction(new y((SetupBudgetController) obj2, 1));
                Unit unit = Unit.f186387a;
                startAnimation.start();
                break;
            case 5:
                SwipeToActionLayout swipeToActionLayout = ((xu0.b) obj4).f308854a;
                swipeToActionLayout.b((o) obj3, (SwipeToActionDelegate.SwipeAction) obj2, swipeToActionLayout.getOnLongSwipeTriggered());
                break;
            case 6:
                p pVar = (p) obj4;
                RecyclerView recyclerView = (RecyclerView) obj2;
                MotionEvent motionEvent = ((xv0.q) ((v) obj3)).f309169a;
                v vVar = pVar.f309168b;
                xv0.q qVar = vVar instanceof xv0.q ? (xv0.q) vVar : null;
                if (qVar != null) {
                    ArrayList arrayList = qVar.f309170b;
                    pVar.f309168b = new s(motionEvent);
                    recyclerView.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        recyclerView.dispatchTouchEvent((MotionEvent) arrayList.get(i2));
                    }
                    pVar.f309168b = new t(p.a(recyclerView), motionEvent);
                }
                break;
            case 7:
                CancelWorkRunnable.forNameInline$lambda$0((WorkDatabase) obj4, (String) obj3, (WorkManagerImpl) obj2);
                break;
            default:
                ((AddNewProductScreen) obj4).O.a((ScreenContentRecyclerView) obj3, ((z) obj2).f313148a);
                break;
        }
    }
}
