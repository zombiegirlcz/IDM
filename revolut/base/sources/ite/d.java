package ite;

import android.app.ActivityManager;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.view.animation.AnimationUtils;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.w0;
import com.revolut.RevolutApplication;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.l;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$anim;
import com.revolut.feature.toggles.impl.experiment.ValidateRegisteredToggles;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.analytics.tracking.impl.AnalyticsFeatureToggles;
import com.revolut.retail.common.ui.api.Toggles;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import com.revolut.tracking.v3.SettingsAppLifecycleContext;
import com.revolut.tracking.v3.SettingsExtensionsContext;
import com.revolut.tracking.v3.SettingsThemingContext;
import efm.r;
import efm.w;
import grl.ta;
import grl.va;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLPeerUnverifiedException;
import kl.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import lp.q1;
import nii.o0;
import nn3.z;
import no.y2;
import oid.y;
import om0.b;
import uo.r0;
import vkm.q;
import vkm.q0;
import vkm.v1;
import vkm.z1;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f168377b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f168376a = i;
        this.f168377b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Object objA;
        Integer numValueOf;
        RandomAccessFile randomAccessFile;
        Object objA2;
        int i = this.f168376a;
        int i2 = 10;
        int i3 = 8;
        boolean z = true;
        int i5 = 0;
        Continuation continuation = null;
        Object obj2 = this.f168377b;
        switch (i) {
            case 0:
                return (ih0.b) obj2;
            case 1:
                return AnimationUtils.loadAnimation(((iu0.e) obj2).f168432a, R$anim.internal_shake_animation);
            case 2:
                g8.d dVar = ((j70.c) obj2).f171826a;
                od0.a aVar = od0.a.f224253a;
                if (od0.a.e() && !od0.a.i()) {
                    if (!od0.a.e() ? false : g70.a.a()) {
                        return j70.d.HIGH;
                    }
                }
                Object systemService = dVar.f141226a.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                int memoryClass = activityManager != null ? activityManager.getMemoryClass() : -1;
                if (memoryClass == -1) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "DevicePerformance", "Unable to resolve device memory class", null, null, 16);
                    return j70.d.UNDEFINED;
                }
                try {
                    m.Companion aVar2 = m.INSTANCE;
                    objA = Integer.valueOf(Runtime.getRuntime().availableProcessors());
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion aVar3 = m.INSTANCE;
                    objA = o.a(th10);
                }
                Throwable thA = m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof n) {
                    objA = null;
                }
                Integer num = (Integer) objA;
                int iIntValue = num != null ? num.intValue() : -1;
                if (iIntValue == -1) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "DevicePerformance", "Unable to resolve device CPU count", null, null, 16);
                    return j70.d.UNDEFINED;
                }
                int i6 = -1;
                double d = 0.0d;
                int i21 = 0;
                while (i5 < iIntValue) {
                    try {
                        randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_max_freq", "r");
                    } catch (Exception e2) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                        numValueOf = null;
                    }
                    try {
                        String line = randomAccessFile.readLine();
                        if (line == null) {
                            numValueOf = -1;
                        } else {
                            int i22 = Integer.parseInt(line) / 1000;
                            if (i22 == 0) {
                                i22 = -1;
                            }
                            numValueOf = Integer.valueOf(i22);
                        }
                        randomAccessFile.close();
                        int iIntValue2 = numValueOf != null ? numValueOf.intValue() : -1;
                        if (iIntValue2 != -1) {
                            d += (double) iIntValue2;
                            i21++;
                            if (iIntValue2 > i6) {
                                i6 = iIntValue2;
                            }
                        }
                        i5++;
                    } catch (Throwable th11) {
                        try {
                            throw th11;
                        } catch (Throwable th12) {
                            com.bumptech.glide.d.e(randomAccessFile, th11);
                            throw th12;
                        }
                    }
                }
                if (i21 < iIntValue) {
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "DevicePerformance", com.google.android.gms.internal.mlkit_vision_face.a.m("Unable to resolve max frequency for ", iIntValue - i21, iIntValue, " of ", " device CPUs"), null, null, 16);
                }
                int iCeil = i21 == 0 ? -1 : (int) Math.ceil(d / ((double) i21));
                return memoryClass <= 160 ? j70.d.LOW : (iCeil == -1 || iCeil > 2055) ? (i21 != 0 || iIntValue >= 8) ? i6 >= 2800 ? j70.d.HIGH : j70.d.MEDIUM : j70.d.LOW : j70.d.LOW;
            case 3:
                return ((BaseScreen) obj2).S2().g();
            case 4:
                z1 z1VarA = q.a(1, 15, ukm.f.DROP_OLDEST);
                z1VarA.k(((jki.g) obj2).r2());
                return z1VarA;
            case 5:
                return Boolean.valueOf(((jte.d) obj2).d(ValidateRegisteredToggles.f90451a));
            case 6:
                ym.d dVar2 = (ym.d) obj2;
                dVar2.getClass();
                r rVarDefer = r.defer(new af.d(dVar2, 11));
                Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
                r rVarStartWith = dVar2.f255132a.startWith((w) rVarDefer);
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                return rVarStartWith;
            case 7:
                kn.e eVar = (kn.e) obj2;
                List listP0 = d0.P0(eVar.f185962j, new kn.d());
                ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
                Iterator it8 = listP0.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new k79.b(eVar, (ym.c) it8.next(), 25));
                }
                return arrayList;
            case 8:
                kz0.g gVar = (kz0.g) obj2;
                nq0.b bVar = gVar.e;
                if (bVar != null) {
                    bVar.d(gVar.i);
                }
                rr0.f fVar = gVar.f;
                if (fVar != null) {
                    fVar.b(false);
                }
                gVar.e = null;
                gVar.f = null;
                gVar.c();
                return Unit.f186387a;
            case 9:
                RevolutApplication.a aVar4 = RevolutApplication.Companion;
                return new coi.b((RevolutApplication) obj2);
            case 10:
                try {
                    q1 q1VarB = ((ip.a) ue0.e.j(((lte.b) obj2).f199854a.getContext())).b();
                    q1 q1Var = q1VarB.k;
                    q1 q1Var2 = q1VarB.k;
                    ImmutableSet immutableSetL6 = q1Var.f197513b.l6();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : immutableSetL6) {
                        if (obj3 instanceof nte.a) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it9 = arrayList2.iterator();
                    while (it9.hasNext()) {
                        a0.x(((nte.a) it9.next()).e(), arrayList3);
                    }
                    ImmutableSet immutableSetM6 = q1Var2.f197513b.m6();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : immutableSetM6) {
                        if (obj4 instanceof nte.a) {
                            arrayList4.add(obj4);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it10 = arrayList4.iterator();
                    while (it10.hasNext()) {
                        a0.x(((nte.a) it10.next()).e(), arrayList5);
                    }
                    ImmutableMap immutableMapS = q1Var2.f197513b.s();
                    ArrayList arrayList6 = new ArrayList(immutableMapS.size());
                    Iterator it11 = immutableMapS.entrySet().iterator();
                    while (it11.hasNext()) {
                        arrayList6.add((uri.a) ((phm.a) ((Map.Entry) it11.next()).getValue()).get());
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj5 : arrayList6) {
                        if (obj5 instanceof nte.a) {
                            arrayList7.add(obj5);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it12 = arrayList7.iterator();
                    while (it12.hasNext()) {
                        a0.x(((nte.a) it12.next()).e(), arrayList8);
                    }
                    ArrayList arrayList9 = new ArrayList(650);
                    arrayList9.addAll(Toggles.a());
                    return d0.E0(arrayList8, d0.E0(arrayList5, d0.E0(arrayList3, arrayList9)));
                } catch (Exception e4) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, "Unable to retrieve the feature toggles from the feature gateways", e4, h0Var2);
                    return f0.f322471a;
                }
            case 11:
                mk0.o oVar = (mk0.o) obj2;
                q.G(q.Q(new lfg.d0(oVar.f, i2), new mk0.f(continuation, oVar, i5)), oVar.d);
                return Unit.f186387a;
            case 12:
                return ((KType) ((ArrayList) obj2).get(0)).getF186441a();
            case 13:
                return new mp.q((mp.r) obj2);
            case 14:
                com.revolut.analytics.tracking.v3.a aVar5 = (com.revolut.analytics.tracking.v3.a) obj2;
                Duration AGGREGATION_WINDOW = com.revolut.analytics.tracking.v3.a.f;
                Intrinsics.checkNotNullExpressionValue(AGGREGATION_WINDOW, "AGGREGATION_WINDOW");
                Intrinsics.checkNotNullExpressionValue(AGGREGATION_WINDOW, "AGGREGATION_WINDOW");
                q.G(new q0(new v1(new n8a.r(AGGREGATION_WINDOW, AGGREGATION_WINDOW, continuation, 22)), new no.g(aVar5, continuation, i5), 1 == true ? 1 : 0), aVar5.f50308b.c());
                return Unit.f186387a;
            case 15:
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                SettingsAppLifecycleContext.a aVarNewBuilder = SettingsAppLifecycleContext.newBuilder();
                va vaVar = va.App;
                aVarNewBuilder.c();
                ((SettingsAppLifecycleContext) aVarNewBuilder.f49761b).setKind(vaVar);
                aVarNewBuilder.c();
                ((SettingsAppLifecycleContext) aVarNewBuilder.f49761b).setEvent((ta) obj2);
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            case 16:
                r0 r0Var = (r0) ((l) obj2).f50343j.e;
                AppWidgetManager appWidgetManager = r0Var.f281505b;
                m.Companion aVar6 = m.INSTANCE;
                try {
                    List<AppWidgetProviderInfo> installedProviders = appWidgetManager.getInstalledProviders();
                    Intrinsics.checkNotNullExpressionValue(installedProviders, "getInstalledProviders(...)");
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj6 : installedProviders) {
                        if (Intrinsics.f(((AppWidgetProviderInfo) obj6).provider.getPackageName(), r0Var.f281504a.getPackageName())) {
                            arrayList10.add(obj6);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        z = false;
                        objA2 = Boolean.valueOf(z);
                    } else {
                        Iterator it13 = arrayList10.iterator();
                        while (it13.hasNext()) {
                            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(((AppWidgetProviderInfo) it13.next()).provider);
                            if (appWidgetIds != null) {
                                for (int i32 : appWidgetIds) {
                                    if (appWidgetManager.getAppWidgetInfo(i32) != null) {
                                        objA2 = Boolean.valueOf(z);
                                    }
                                    break;
                                }
                            }
                        }
                        z = false;
                        objA2 = Boolean.valueOf(z);
                    }
                    break;
                } catch (Throwable th13) {
                    m.Companion aVar7 = m.INSTANCE;
                    objA2 = o.a(th13);
                }
                Throwable thA2 = m.a(objA2);
                if (thA2 != null) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "SettingsTracker", null, thA2, h0Var3);
                }
                if (objA2 instanceof n) {
                    objA2 = null;
                }
                Boolean bool = (Boolean) objA2;
                if (bool == null) {
                    return null;
                }
                boolean zBooleanValue = bool.booleanValue();
                AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                SettingsExtensionsContext.a aVarNewBuilder2 = SettingsExtensionsContext.newBuilder();
                aVarNewBuilder2.c();
                ((SettingsExtensionsContext) aVarNewBuilder2.f49761b).setWidgets(zBooleanValue);
                w0 w0VarA2 = aVarNewBuilder2.a();
                companion2.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2));
            case 17:
                AnalyticsContext.INSTANCE.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a((SettingsThemingContext) obj2));
            case 18:
                boolean z3 = jo0.m.f176847a;
                z listener = new z((y2) obj2, 17);
                Intrinsics.checkNotNullParameter(listener, "listener");
                jo0.m.f176852j = listener;
                return Unit.f186387a;
            case 19:
                return Boolean.valueOf(((jte.d) ((com.revolut.retail.analytics.tracking.impl.b) obj2).f98546b).c(AnalyticsFeatureToggles.ShowAutomaticAnalyticsEventsToasts.f98544a));
            case 20:
                ((nri.a) obj2).i3();
                return Unit.f186387a;
            case 21:
                return ((BaseMvpFragment) obj2).z();
            case 22:
                return ((om.c) obj2).a();
            case 23:
                om0.b bVar2 = (om0.b) obj2;
                r rVarSwitchMap = bVar2.f226490a.switchMap(new y(new okk.d(14), i3));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                ok7.c cVar = new ok7.c(bVar2, 5);
                r rVarOnErrorResumeNext = rVarSwitchMap.onErrorResumeNext(new t1(new o3l.m(new BreadcrumbException(), 24)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new o0(4, cVar), new o0(4, b.a.f226493a)), "subscribe(...)");
                return Unit.f186387a;
            case 24:
                return ((pjl.c) obj2).f236797a.getContentResolver();
            case 25:
                return ((WorkContinuationImpl) obj2).lambda$enqueue$0();
            case 26:
                return ((WorkManagerImpl) obj2).lambda$rescheduleEligibleWork$0();
            case 27:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ((sf0.f) obj2).f262254a;
                if (uncaughtExceptionHandler != null) {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return Unit.f186387a;
            case 28:
                uk0.a aVar8 = (uk0.a) obj2;
                mk0.a aVar9 = aVar8.f280638a;
                uk0.b bVar3 = aVar8.f280639b;
                if (bVar3.a(aVar9)) {
                    bVar3.b(aVar9);
                }
                return aVar9;
            default:
                try {
                    return (List) ((Function0) obj2).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return f0.f322471a;
                }
        }
    }
}
