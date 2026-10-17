package androidx.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.ui.PlayerView;
import az0.s1;
import ce.j;
import cf.b;
import ch.m;
import com.airbnb.lottie.LottieDrawable;
import com.appsflyer.AFLogger;
import com.bumptech.glide.n;
import com.google.firebase.messaging.f0;
import com.google.firebase.messaging.t;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.i;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import d7.i0;
import ecm.j2;
import eoi.b0;
import fag.m0;
import gcm.l;
import ix0.o2;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import ke.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mf.c;
import mx0.xb;
import nf.a;
import nf.g;
import wf.e;
import xf.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6781b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f6780a = i;
        this.f6781b = obj2;
    }

    private final void a() {
        g gVar;
        String str;
        e eVar = (e) this.f6781b;
        pd.g gVar2 = eVar.d;
        gVar2.a();
        Context context = gVar2.f235023a;
        eVar.f296856j = context;
        eVar.o = context.getPackageName();
        eVar.k = a.e();
        eVar.f296857l = new wf.d(eVar.f296856j, new i(100L, 1L, TimeUnit.MINUTES));
        eVar.f296858m = c.a();
        b bVar = eVar.f296854g;
        a aVar = eVar.k;
        aVar.getClass();
        g gVar3 = g.f214772a;
        synchronized (g.class) {
            try {
                if (g.f214772a == null) {
                    g.f214772a = new g();
                }
                gVar = g.f214772a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        gVar.getClass();
        Long l2 = (Long) aVar.f214765a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
        l2.getClass();
        Map map = g.f214773b;
        if (!map.containsKey(l2) || (str = (String) map.get(l2)) == null) {
            f fVarD = aVar.d(gVar);
            str = fVarD.b() ? (String) fVarD.a() : "FIREPERF";
        } else {
            aVar.f214767c.f("com.google.firebase.perf.LogSourceName", str);
        }
        eVar.f296855h = new wf.a(bVar, str);
        ConcurrentLinkedQueue concurrentLinkedQueue = eVar.f296852b;
        c cVar = eVar.f296858m;
        WeakReference weakReference = new WeakReference(e.f296850s);
        synchronized (cVar.f) {
            cVar.f.add(weakReference);
        }
        xf.i iVarNewBuilder = k.newBuilder();
        eVar.f296859n = iVarNewBuilder;
        pd.g gVar4 = eVar.d;
        gVar4.a();
        String str2 = gVar4.f235025c.f235031b;
        iVarNewBuilder.c();
        ((k) iVarNewBuilder.f49761b).setGoogleAppId(str2);
        xf.b bVarNewBuilder = xf.c.newBuilder();
        String str3 = eVar.o;
        bVarNewBuilder.c();
        ((xf.c) bVarNewBuilder.f49761b).setPackageName(str3);
        bVarNewBuilder.c();
        ((xf.c) bVarNewBuilder.f49761b).setSdkVersion("21.0.5");
        Context context2 = eVar.f296856j;
        String str4 = "";
        try {
            String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
            if (str5 != null) {
                str4 = str5;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        bVarNewBuilder.c();
        ((xf.c) bVarNewBuilder.f49761b).setVersionName(str4);
        iVarNewBuilder.c();
        ((k) iVarNewBuilder.f49761b).setAndroidAppInfo((xf.c) bVarNewBuilder.a());
        eVar.f296853c.set(true);
        while (!concurrentLinkedQueue.isEmpty()) {
            wf.b bVar2 = (wf.b) concurrentLinkedQueue.poll();
            if (bVar2 != null) {
                eVar.i.execute(new j(eVar, bVar2, 22));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        String str = null;
        Map mapUnmodifiableMap = null;
        switch (this.f6780a) {
            case 0:
                ((ComponentActivity) this.f6781b).invalidateMenu();
                return;
            case 1:
                FullyDrawnReporter.reportRunnable$lambda$0((FullyDrawnReporter) this.f6781b);
                return;
            case 2:
                ((Fragment) this.f6781b).lambda$performCreateView$0();
                return;
            case 3:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) this.f6781b);
                return;
            case 4:
                s1 s1Var = (s1) this.f6781b;
                ImageView imageView = s1Var.f11349b;
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Activity activityI = z92.f.i(context);
                if (activityI == null || !activityI.isDestroyed()) {
                    n nVarD = com.bumptech.glide.b.d(imageView.getContext());
                    nVarD.getClass();
                    a0.d.z(imageView, nVarD);
                }
                s1Var.i = false;
                return;
            case 5:
                coi.b bVar = (coi.b) this.f6781b;
                if (!bVar.f25552c || bVar.d) {
                    return;
                }
                bVar.f25551b = true;
                return;
            case 6:
                AFLogger.values((Function1) this.f6781b);
                return;
            case 7:
                f0 f0Var = (f0) this.f6781b;
                String str2 = "Service took too long to process intent: " + f0Var.f49494a.getAction() + " finishing.";
                f0Var.f49495b.trySetResult(null);
                return;
            case 8:
                LottieDrawable lottieDrawable = (LottieDrawable) this.f6781b;
                Semaphore semaphore = lottieDrawable.P;
                n7.d dVar = lottieDrawable.f25598q;
                if (dVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    dVar.p(lottieDrawable.f25589b.a());
                    break;
                } catch (InterruptedException unused) {
                } catch (Throwable th10) {
                    semaphore.release();
                    throw th10;
                }
                semaphore.release();
                return;
            case 9:
                ((i0) this.f6781b).c();
                return;
            case 10:
                ((b0) this.f6781b).f127913a.invoke();
                return;
            case 11:
                t tVar = (t) this.f6781b;
                ((gc.j) ((hc.b) tVar.e)).j(new m0(tVar, 20));
                return;
            case 12:
                l lVar = (l) this.f6781b;
                cpi.g gVar = lVar.d;
                if (gVar != null) {
                    j2 j2Var = (j2) gVar.f107954b;
                    if (!j2Var.f124829c && !j2Var.f124828b) {
                        gVar.k();
                    }
                }
                lVar.f142741c = null;
                return;
            case 13:
                CompletableFuture completableFuture = (CompletableFuture) this.f6781b;
                try {
                    completableFuture.complete(h80.e.f149934a.b());
                    return;
                } catch (Exception e) {
                    completableFuture.completeExceptionally(e);
                    return;
                }
            case 14:
                o2 o2Var = (o2) this.f6781b;
                o2Var.k = false;
                o2Var.a();
                return;
            case 15:
                Application application = (Application) this.f6781b;
                jri.d dVar2 = jri.d.f178020a;
                application.unregisterActivityLifecycleCallbacks(dVar2);
                application.registerActivityLifecycleCallbacks(dVar2);
                return;
            case 16:
                oe.c cVar = (oe.c) this.f6781b;
                synchronized (((AtomicMarkableReference) cVar.f224500g)) {
                    try {
                        if (((AtomicMarkableReference) cVar.f224500g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) cVar.f224500g).getReference();
                            ((AtomicMarkableReference) cVar.f224500g).set(str, false);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th11) {
                        throw th11;
                    }
                    break;
                }
                if (z) {
                    ((h) cVar.f224498b).j((String) cVar.f224497a, str);
                    return;
                }
                return;
            case 17:
                m mVar = (m) this.f6781b;
                ((AtomicReference) mVar.d).set(null);
                synchronized (mVar) {
                    if (((AtomicMarkableReference) mVar.f24042b).isMarked()) {
                        ke.e eVar = (ke.e) ((AtomicMarkableReference) mVar.f24042b).getReference();
                        synchronized (eVar) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.f182929a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f24042b;
                        atomicMarkableReference.set((ke.e) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    oe.c cVar2 = (oe.c) mVar.f24043c;
                    ((h) cVar2.f224498b).h((String) cVar2.f224497a, mapUnmodifiableMap, mVar.f24041a);
                    return;
                }
                return;
            case 18:
                ((ao.a) this.f6781b).invoke();
                return;
            case 19:
                View view = (View) this.f6781b;
                rv0.j jVarA = kli.c.a(view);
                if (jVarA != null) {
                    ((sv0.c) jVarA).p(view);
                    return;
                }
                Object systemService = view.getContext().getSystemService("input_method");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(view, 1);
                return;
            case 20:
                xb xbVar = (xb) this.f6781b;
                xb.a aVar = xb.Companion;
                xbVar.b();
                return;
            case 21:
                ((PlayerView) this.f6781b).invalidate();
                return;
            case 22:
                ((rp0.j) this.f6781b).a();
                return;
            case 23:
                c01.d dVarW = jh.d.f(((rpi.h) this.f6781b).f256393h).W();
                if (dVarW != null) {
                    ((hz0.e) dVarW).e();
                    return;
                }
                return;
            case 24:
                a();
                return;
            case 25:
                ((LoginFragment) this.f6781b).q0();
                return;
            default:
                PinCodeView pinCodeView = (PinCodeView) this.f6781b;
                PinCodeView.Companion bVar2 = PinCodeView.INSTANCE;
                pinCodeView.p0();
                return;
        }
    }
}
