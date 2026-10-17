package o6;

import android.graphics.Path;
import android.view.View;
import androidx.camera.lifecycle.LifecycleCameraProviderImpl;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0;
import androidx.work.ListenableFutureKt;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.core.ui_kit.delegates.widgets.o4;
import com.revolut.core.ui_kit.internal.views.candlesticks.CandleSticksView;
import com.revolut.core.ui_kit.internal.views.card_design.CardsEmptyStateView;
import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.TransactionCountriesScreen;
import com.revolut.kompot.common.flow.navigation.NavigationFlow;
import com.youTransactor.uCube.connexion.BleService;
import com.youTransactor.uCube.connexion.ConnectionService;
import fp0.l;
import ifm.c;
import ix0.h0;
import ix0.i0;
import java.util.ArrayList;
import java.util.List;
import jq0.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import kt0.e;
import oo0.k;
import ox0.n;
import ox0.o;
import ox0.t;
import ps0.d;
import ro0.p;
import ro0.q;
import rr0.g;
import ru5.h;
import s01.j;
import ss0.b;
import sz5.f;
import zhm.f0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f222486b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f222485a = i;
        this.f222486b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.jvm.functions.Function0, kotlin.jvm.internal.u] */
    @Override // java.lang.Runnable
    public final void run() {
        List listB;
        h0 h0Var;
        i0 cutoutReceiverController;
        int i = 1;
        switch (this.f222485a) {
            case 0:
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0((Consumer) this.f222486b);
                return;
            case 1:
                ((k) this.f222486b).j();
                return;
            case 2:
                o4 o4Var = (o4) this.f222486b;
                o4Var.a(o4Var.f55460m);
                return;
            case 3:
                ((n) this.f222486b).e();
                return;
            case 4:
                t tVar = (t) this.f222486b;
                if (tVar.f230503b.isAttachedToWindow()) {
                    FormsActionButton formsActionButton = tVar.f230504c;
                    formsActionButton.setScaleX(0.5f);
                    formsActionButton.setScaleY(0.5f);
                    formsActionButton.setAlpha(1.0f);
                    SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.5f));
                    SpringForce springForce = new SpringForce(1.0f);
                    springForce.setStiffness(150.0f);
                    springForce.setDampingRatio(a.b.a(12.0f, 150.0f));
                    springAnimation.setSpring(springForce);
                    springAnimation.setMinimumVisibleChange(0.002f);
                    springAnimation.addUpdateListener(new o(tVar, i));
                    tVar.u = springAnimation;
                    springAnimation.start();
                    if (tVar.m()) {
                        formsActionButton.i(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                BleService.a((Runnable) this.f222486b);
                return;
            case 6:
                ((ConnectionService) this.f222486b).a();
                return;
            case 7:
                ChatProfileScreen chatProfileScreen = (ChatProfileScreen) this.f222486b;
                KProperty[] kPropertyArr = ChatProfileScreen.f51125a0;
                chatProfileScreen.d3();
                return;
            case 8:
                e eVar = (e) this.f222486b;
                eVar.d = true;
                d dVar = (d) eVar.f;
                dVar.f239352a.setSelectedPosition(eVar.b());
                dVar.f239352a.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            case 9:
                StackedChartView stackedChartView = (StackedChartView) this.f222486b;
                float f = stackedChartView.f57570l.x;
                stackedChartView.k.set(-999999.0f, -999999.0f);
                stackedChartView.getParent().requestDisallowInterceptTouchEvent(true);
                stackedChartView.invalidate();
                return;
            case 10:
                LifecycleCameraProviderImpl.shutdownAsync$lambda$0((LifecycleCameraProviderImpl) this.f222486b);
                return;
            case 11:
                RevPointsTransactionsListScreen revPointsTransactionsListScreen = (RevPointsTransactionsListScreen) this.f222486b;
                KProperty[] kPropertyArr2 = RevPointsTransactionsListScreen.f83871e0;
                revPointsTransactionsListScreen.d3();
                return;
            case 12:
                ListenableFutureKt.launchFuture$lambda$1$lambda$0((Job) this.f222486b);
                return;
            case 13:
                ((c) this.f222486b).dispose();
                return;
            case 14:
                ?? function = (u) this.f222486b;
                Intrinsics.checkNotNullParameter(function, "$function");
                function.invoke();
                return;
            case 15:
                jii.u uVar = (jii.u) this.f222486b;
                KProperty[] kPropertyArr3 = TransactionCountriesScreen.V;
                NavBarWithToolbar navBarWithToolbar = uVar.f174565c;
                navBarWithToolbar.E0();
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                kli.c.d(navBarWithToolbar, 0L);
                return;
            case 16:
                qu0.a aVar = (qu0.a) this.f222486b;
                l lVar = aVar.f249172g;
                if (lVar != null) {
                    lVar.run();
                }
                aVar.f249173h = null;
                aVar.f249172g = null;
                aVar.e = -1L;
                aVar.f = -1L;
                return;
            case 17:
                ((f) this.f222486b).N();
                return;
            case 18:
                ((HlsSampleStreamWrapper.Callback) this.f222486b).onPrepared();
                return;
            case 19:
                NavigationFlow navigationFlow = (NavigationFlow) this.f222486b;
                zv0.a aVarD3 = navigationFlow.d3();
                if (aVarD3 != null) {
                    ((com.revolut.core.ui_kit.views.o) aVarD3).f59578s.i();
                }
                if (aVarD3 != null) {
                    aVarD3.setNonCancelable(navigationFlow.O, true);
                    return;
                }
                return;
            case 20:
                ArrayList arrayList = ((q) this.f222486b).f255769b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p pVar = (p) arrayList.get(i2);
                    e84.e eVar2 = pVar.f255767n;
                    View view = pVar.f255759a;
                    if (view.isShown()) {
                        if (eVar2 == null || (h0Var = (h0) eVar2.f123570b) == null || (cutoutReceiverController = h0Var.getCutoutReceiverController()) == null || (listB = cutoutReceiverController.b()) == null) {
                            listB = f0.f322471a;
                        }
                        boolean z = (eVar2 == null || Intrinsics.f(listB, (List) eVar2.e)) ? false : true;
                        if (view.getTranslationX() != pVar.k || view.getTranslationY() != pVar.f255764j || z) {
                            e84.e eVar3 = pVar.f255767n;
                            if ((eVar3 != null ? (Path) eVar3.f : null) != null) {
                                pVar.b();
                            } else {
                                pVar.c();
                            }
                        }
                    }
                }
                return;
            case 21:
                g gVar = (g) this.f222486b;
                gVar.f256619j = false;
                int i3 = gVar.f256618h;
                if (i3 == -1) {
                    i3 = gVar.f256617g;
                }
                if (i3 == 1) {
                    gVar.c(2);
                    return;
                }
                return;
            case 22:
                CandleSticksView candleSticksView = (CandleSticksView) this.f222486b;
                candleSticksView.h(candleSticksView.Q.x);
                candleSticksView.invalidate();
                return;
            case 23:
                ActivityScreen activityScreen = (ActivityScreen) this.f222486b;
                ActivityScreen.a aVar2 = ActivityScreen.Companion;
                db.a aVar3 = new db.a(activityScreen, 6);
                h hVar = new h(activityScreen);
                activityScreen.h3().f168518c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) aVar3);
                activityScreen.h3().d.addOnScrollListener(hVar);
                return;
            case 24:
                ((VideoCapture) this.f222486b).notifyReset();
                return;
            case 25:
                ((j) this.f222486b).f258786h.resumeAnimation();
                return;
            case 26:
                throw ((sd0.h) this.f222486b);
            case 27:
                b bVar = (b) this.f222486b;
                List list = CardsEmptyStateView.f56582m;
                bVar.f265255c.b();
                return;
            case 28:
                ((AudioSource) this.f222486b).lambda$stop$3();
                return;
            default:
                ((AudioStream.AudioStreamCallback) this.f222486b).onSilenceStateChanged(true);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(Function0 function0) {
        this.f222485a = 14;
        this.f222486b = (u) function0;
    }
}
