package x;

import android.os.HandlerThread;
import androidx.camera.camera2.pipe.config.ThreadConfigModule;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import iam.e;
import ip0.mc0;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import koi.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xp0.f;
import xu.d;
import xv0.o;
import xv0.w;
import y66.p;
import ybh.g;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f301438b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f301437a = i;
        this.f301438b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int iFindFirstCompletelyVisibleItemPosition;
        ArrayList arrayListD;
        ArrayList arrayListD2;
        int i = this.f301437a;
        Object obj2 = this.f301438b;
        switch (i) {
            case 0:
                ThreadConfigModule.provideThreads$lambda$3((ArrayList) obj2);
                return;
            case 1:
                ThreadConfigModule.provideThreads$lambda$4$1((HandlerThread) obj2);
                return;
            case 2:
                ThreadConfigModule.provideThreads$lambda$5$0((ExecutorService) obj2);
                return;
            case 3:
                PinCodeView pinCodeView = ((LoginFragment) obj2).m0;
                if (pinCodeView != null) {
                    pinCodeView.G0("withPinCodeProgress");
                    return;
                } else {
                    Intrinsics.r("pinCodeView");
                    throw null;
                }
            case 4:
                ((f) obj2).c();
                return;
            case 5:
                xq0.c cVar = (xq0.c) obj2;
                cVar.d = false;
                RecyclerView recyclerView = cVar.f308027b;
                if (Intrinsics.f(cVar.f308028c, mc0.f165357a)) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null && (iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition()) != -1) {
                        recyclerView.smoothScrollToPosition(iFindFirstCompletelyVisibleItemPosition + 1);
                    }
                    cVar.a();
                    return;
                }
                return;
            case 6:
                xq0.f fVar = (xq0.f) obj2;
                fVar.f308038l = false;
                RecyclerView recyclerView2 = fVar.f308035g;
                if (recyclerView2 == null) {
                    Intrinsics.r("recyclerView");
                    throw null;
                }
                if (recyclerView2.getScrollState() == 0) {
                    fVar.k = 0L;
                    fVar.d(0);
                    return;
                }
                return;
            case 7:
                d dVar = (d) obj2;
                ((e) dVar.i.getValue()).a();
                dVar.f = true;
                return;
            case 8:
                ((o) obj2).c();
                return;
            case 9:
                w wVar = (w) obj2;
                wVar.f = false;
                RecyclerView recyclerView3 = wVar.e;
                if (recyclerView3 == null) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
                LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager2 == null) {
                    return;
                }
                RecyclerView.Adapter adapter = recyclerView3.getAdapter();
                h hVar = adapter instanceof h ? (h) adapter : null;
                if (hVar == null) {
                    return;
                }
                Function1 function1 = wVar.f309176a;
                int iFindFirstCompletelyVisibleItemPosition2 = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager2.findLastCompletelyVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition2 != -1 && iFindLastCompletelyVisibleItemPosition != -1 && (arrayListD2 = w.d(hVar, iFindFirstCompletelyVisibleItemPosition2, iFindLastCompletelyVisibleItemPosition)) != null) {
                    function1.invoke(arrayListD2);
                }
                Function1 function12 = wVar.f309177b;
                if (function12 != null) {
                    int iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1 && ((iFindFirstVisibleItemPosition != wVar.f309178c || iFindLastVisibleItemPosition != wVar.d) && (arrayListD = w.d(hVar, iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition)) != null)) {
                        function12.invoke(arrayListD);
                    }
                    wVar.f309178c = iFindFirstVisibleItemPosition;
                    wVar.d = iFindLastVisibleItemPosition;
                    return;
                }
                return;
            case 10:
                ((PlaybackVideoGraphWrapper) obj2).lambda$flush$1();
                return;
            case 11:
                ((com.revolut.feature.card_screen.impl.kompot.cards_list.c) obj2).K2(new dki.h((Function1) new p(5), true));
                return;
            case 12:
                WealthAddMoneyScreen wealthAddMoneyScreen = (WealthAddMoneyScreen) obj2;
                WealthAddMoneyScreen.a aVar = WealthAddMoneyScreen.Companion;
                if (wealthAddMoneyScreen.o) {
                    ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) wealthAddMoneyScreen.f3()).accept(g.f312308a);
                    return;
                }
                return;
            case 13:
                ((RecyclerView) obj2).requestLayout();
                return;
            case 14:
                ((SphericalGLSurfaceView) obj2).lambda$onDetachedFromWindow$0();
                return;
            case 15:
                SignSmsStepFragment.a aVar2 = SignSmsStepFragment.Companion;
                ((SignSmsStepFragment) obj2).E().h0();
                return;
            case 16:
                AnalyticsDetailsController analyticsDetailsController = (AnalyticsDetailsController) obj2;
                AnalyticsDetailsController.Companion aVar3 = AnalyticsDetailsController.INSTANCE;
                RecyclerView.ItemAnimator itemAnimator = analyticsDetailsController.d3().f174540c.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.setMoveDuration(analyticsDetailsController.i0);
                    return;
                }
                return;
            default:
                int i2 = zxl.a.d;
                ((zxl.a) obj2).a(true);
                return;
        }
    }
}
