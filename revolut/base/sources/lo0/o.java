package lo0;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import ho.e0;
import ho.t;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import no.t1;
import org.jetbrains.annotations.NotNull;
import uo.q0;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo.b f197355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gpk.c f197356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f197357c;
    public final mo.c d;
    public final uo.l e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f197358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0 f197359h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakHashMap f197360j;

    public o(uo.b activeScreenHolder, gpk.c coroutineScopeProvider, e0 disabledTrackingChecker, mo.c ownerProvider, uo.l productMapper, a resourceIdParser, t1 screenEventController, q0 screenNameFinder, t tracker) {
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(disabledTrackingChecker, "disabledTrackingChecker");
        Intrinsics.checkNotNullParameter(ownerProvider, "ownerProvider");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(resourceIdParser, "resourceIdParser");
        Intrinsics.checkNotNullParameter(screenEventController, "screenEventController");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f197355a = activeScreenHolder;
        this.f197356b = coroutineScopeProvider;
        this.f197357c = disabledTrackingChecker;
        this.d = ownerProvider;
        this.e = productMapper;
        this.f = resourceIdParser;
        this.f197358g = screenEventController;
        this.f197359h = screenNameFinder;
        this.i = tracker;
        this.f197360j = new WeakHashMap();
    }

    public static AnalyticsProduct c(Object obj2) {
        AnalyticsProduct analyticsProduct = obj2 instanceof AnalyticsProduct ? (AnalyticsProduct) obj2 : null;
        if (analyticsProduct != null) {
            return analyticsProduct;
        }
        throw new IllegalArgumentException("Wrong type for analyticsProduct: " + obj2.getClass() + ". Expected " + new h0() { // from class: lo0.n
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj3) {
                return obj3.getClass();
            }
        });
    }

    public final Object a(View view) {
        Object objD = this.f197359h.d(view);
        if (objD == null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar = rd0.c.ERROR;
            String simpleName = view.getClass().getSimpleName();
            Object objC = this.f197355a.c();
            rd0.d.a(cVar, "WindowEventHandler", a0.d.s("No screen found for ", simpleName, ", top: ", objC != null ? objC.getClass().getName() : null), null, h0Var);
        }
        return objD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = yhm.m.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        if (r18 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        r0 = c(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
    
        r7 = yhm.m.INSTANCE;
        r0 = yhm.o.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(no.a1 r15, com.revolut.core.ui_kit.models.Clause r16, java.lang.String r17, java.lang.Object r18, java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.o.b(no.a1, com.revolut.core.ui_kit.models.Clause, java.lang.String, java.lang.Object, java.lang.Object):void");
    }
}
