package no;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.retail.analytics.impl.R$id;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements t1 {

    @NotNull
    private static final u1 Companion = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo.b f217873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gpk.c f217874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro.a f217875c;
    public final ho.e0 d;
    public final com.revolut.analytics.tracking.v3.k e;
    public final co.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f217876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4m.a f217877h;
    public final WeakHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakHashMap f217878j;

    public y1(uo.b activeScreenHolder, gpk.c coroutineScopeProvider, ro.a deduplicator, ho.e0 disabledTrackingChecker, com.revolut.analytics.tracking.v3.k eventFactory, co.a nestedControllerEventInteractor, n productType, d4m.a tracker) {
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(deduplicator, "deduplicator");
        Intrinsics.checkNotNullParameter(disabledTrackingChecker, "disabledTrackingChecker");
        Intrinsics.checkNotNullParameter(eventFactory, "eventFactory");
        Intrinsics.checkNotNullParameter(nestedControllerEventInteractor, "nestedControllerEventInteractor");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f217873a = activeScreenHolder;
        this.f217874b = coroutineScopeProvider;
        this.f217875c = deduplicator;
        this.d = disabledTrackingChecker;
        this.e = eventFactory;
        this.f = nestedControllerEventInteractor;
        this.f217876g = productType;
        this.f217877h = tracker;
        this.i = new WeakHashMap();
        this.f217878j = new WeakHashMap();
        v1 listener = new v1(this);
        activeScreenHolder.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        activeScreenHolder.d.add(listener);
    }

    public static AnalyticsContext c(Object obj2) {
        try {
            k kVar = obj2 instanceof k ? (k) obj2 : null;
            if (kVar != null) {
                return kVar.getD0();
            }
            return null;
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    public final void a(Object screen, v2 strategy) {
        co.d dVar;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        View viewK = rd0.e.k(screen);
        if (viewK != null) {
            viewK.setTag(R$id.internal_screen_ref, screen);
            Unit unit = Unit.f186387a;
        }
        View viewK2 = rd0.e.k(screen);
        if (screen instanceof d1) {
            return;
        }
        if (viewK2 == null || !this.d.a(viewK2)) {
            String name = screen.getClass().getName();
            boolean zB = false;
            if (kotlin.text.a0.H(name, "com.bumptech.glide.", false) || kotlin.text.a0.H(name, "com.google.android.gms", false) || kotlin.text.a0.H(name, "androidx.", false) || kotlin.text.a0.H(name, "com.hcaptcha.sdk", false)) {
                return;
            }
            if (((screen instanceof Fragment) && !screen.getClass().equals(Fragment.class)) || (screen instanceof Activity) || (screen instanceof BaseScreen) || (screen instanceof cli.w) || (screen instanceof SimpleViewController) || (screen instanceof BaseBottomSheetController) || (((screen instanceof BaseScrollerFlow) && ((BaseScrollerFlow) screen).getL() != R$layout.flow_scroller) || ((screen instanceof BaseFlow) && ((BaseFlow) screen).getL() != R$layout.base_flow_container))) {
                WeakHashMap weakHashMap = this.i;
                Boolean bool = (Boolean) weakHashMap.get(screen);
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.f(bool, bool2) && strategy == v2.TRACK_ATTACHMENT_ONCE) {
                    return;
                }
                weakHashMap.put(screen, bool2);
                if (screen instanceof com.revolut.kompot.navigable.a) {
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) screen;
                    co.a aVar = this.f;
                    aVar.getClass();
                    WeakHashMap weakHashMap2 = aVar.f25477a;
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    Intrinsics.checkNotNullParameter(this, "callback");
                    com.revolut.kompot.navigable.a aVar2 = controller.f98405m;
                    if (controller instanceof ali.g) {
                        if (!weakHashMap2.containsKey(controller.u2())) {
                            co.d.Companion.getClass();
                            co.d dVarA = co.b.a(controller, this);
                            if (dVarA != null) {
                                weakHashMap2.put(controller.u2(), dVarA);
                            }
                        }
                    } else if ((aVar2 instanceof ali.g) && !weakHashMap2.containsKey(aVar2.u2())) {
                        co.d.Companion.getClass();
                        co.d dVarA2 = co.b.a(aVar2, this);
                        if (dVarA2 != null) {
                            weakHashMap2.put(aVar2.u2(), dVarA2);
                        }
                    }
                    com.revolut.kompot.navigable.a aVar3 = controller.f98405m;
                    if (aVar3 != null && (dVar = (co.d) weakHashMap2.get(aVar3.u2())) != null) {
                        zB = dVar.b(controller);
                    }
                    if (zB) {
                        return;
                    }
                }
                d(screen);
            }
        }
    }

    public final void b(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        uo.b bVar = this.f217873a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        bVar.d(new uo.a(bVar, screen));
        this.i.remove(screen);
        this.f217878j.remove(screen);
        com.revolut.kompot.navigable.a controller = screen instanceof com.revolut.kompot.navigable.a ? (com.revolut.kompot.navigable.a) screen : null;
        if (controller == null) {
            return;
        }
        co.a aVar = this.f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        aVar.f25477a.remove(controller.u2());
    }

    public final void d(Object obj2) {
        this.f217873a.e(obj2);
        AnalyticsContext analyticsContextC = c(obj2);
        CoroutineScope coroutineScopeC = this.f217874b.c();
        skm.p0 p0Var = skm.p0.f264001a;
        skm.e0.C(coroutineScopeC, zkm.o.f323119a.e, null, new x1(this, obj2, analyticsContextC, null), 2);
    }
}
