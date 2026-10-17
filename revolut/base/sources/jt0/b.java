package jt0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import boh.f;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.workflow.WorkflowConfig;
import com.onfido.workflow.internal.network.WorkflowApi;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.wealth.impl.data.network.portfolio_metrics.PortfolioMetricsService;
import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestScreenerRedesignShowAllMetrics;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import com.revolut.kompot.navigable.vc.ViewController;
import do3.n;
import er9.x;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import ix0.u;
import java.io.File;
import java.net.URLEncoder;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import kl.t1;
import klf.h0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import ml.b0;
import n14.e;
import njf.j;
import nl.a0;
import nl.c0;
import nl.k0;
import nl.l0;
import nl.m0;
import nl.p0;
import nl.q0;
import nl.v;
import nl.y;
import nl.z;
import noc.l;
import noc.m;
import retrofit2.HttpException;
import skm.e0;
import skm.r;
import sl.p;
import tfm.n4;
import tl.i;
import u6b.k;
import vc.s;
import vkm.q;
import x08.g;
import x08.h;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.t0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements u, xki.d, igm.b, kv0.a, o, pc.c, el.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f178265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f178266c;
    public Object d;

    public /* synthetic */ b(Object obj2, int i, Object obj3, Object obj4) {
        this.f178264a = i;
        this.f178265b = obj2;
        this.f178266c = obj3;
        this.d = obj4;
    }

    public static String C0(String str) {
        return j6.a.q("PORTFOLIO_METRICS_", str);
    }

    public static final Data J(b bVar, Data data) {
        Integer numM;
        bVar.getClass();
        if (data.getContent() == null) {
            Throwable error = data.getError();
            HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
            if (httpException != null && (numM = e.m(httpException)) != null && numM.intValue() == 403) {
                return new Data(h.f301536a, null, false, 6, null);
            }
        }
        try {
            Object content = data.getContent();
            return new Data(content != null ? new g((List) content) : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    public static List V(PaymentGroup paymentGroup, n nVar, List list) {
        boolean z;
        hr9.a aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            st9.e eVar = (st9.e) it8.next();
            oq9.o oVar = eVar.f;
            oq9.o oVar2 = eVar.f265545g;
            Collection collection = (List) linkedHashMap.get(oVar);
            if (collection == null) {
                collection = f0.f322471a;
            }
            Collection collection2 = (List) linkedHashMap.get(oVar2);
            if (collection2 == null) {
                collection2 = f0.f322471a;
            }
            linkedHashMap.put(eVar.f, d0.F0(eVar, collection));
            linkedHashMap.put(oVar2, d0.F0(eVar, collection2));
        }
        List<Pair> listC = t0.C(linkedHashMap);
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        for (Pair pair : listC) {
            oq9.o member = (oq9.o) pair.f186385a;
            List list2 = (List) pair.f186386b;
            List<st9.e> list3 = list2;
            boolean z3 = list3 instanceof Collection;
            boolean z4 = true;
            if (z3 && list3.isEmpty()) {
                z = false;
            } else {
                for (st9.e eVar2 : list3) {
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(member, "member");
                    if (Intrinsics.f(eVar2.f265545g, member)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z3 && list3.isEmpty()) {
                z4 = false;
            } else {
                for (st9.e eVar3 : list3) {
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(member, "member");
                    if (Intrinsics.f(eVar3.f, member)) {
                        break;
                    }
                }
                z4 = false;
            }
            if (z4 && z) {
                aVar = hr9.a.BOTH;
            } else if (z4) {
                aVar = hr9.a.OWED;
            } else {
                if (!z) {
                    throw new IllegalStateException("Couldn't retrieve type of debt");
                }
                aVar = hr9.a.OWES;
            }
            arrayList.add(new hr9.b(member, aVar, list2));
        }
        return d0.P0(arrayList, new oh3.e(nVar, paymentGroup, 21));
    }

    public static String a0(String str, HashMap map) {
        StringBuilder sb6 = new StringBuilder();
        Iterator it8 = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it8.next();
        sb6.append((String) entry.getKey());
        sb6.append("=");
        sb6.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it8.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it8.next();
            sb6.append("&");
            sb6.append((String) entry2.getKey());
            sb6.append("=");
            sb6.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb6.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return a0.d.r(str, string);
    }

    public static void w0(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public Flow A0(boolean z) {
        h0 h0Var = (h0) this.f178265b;
        return q.q(new ayf.h(yh5.b.g(h0Var.d(), h0Var.e(), h0Var.g(), rd0.e.b(((j) ((nhf.a) this.d)).c())), this, z, 4));
    }

    @Override // ix0.u
    public int B(bw0.h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return S();
    }

    public Flow B0(String standingOrderId) {
        Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        zb8.b bVar = (zb8.b) this.d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return f.e(nim.a.v(bVar.d.b(Unit.f186387a, loadingStrategy), new te8.a(standingOrderId, 22)), new k(this, 19));
    }

    public void D0(String str) {
        if (str == null) {
            throw new NullPointerException("Null arch");
        }
        this.f178265b = str;
    }

    @Override // ix0.u
    public int E(bw0.h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return S();
    }

    public void E0(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildId");
        }
        this.d = str;
    }

    public void F0(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f178266c = str;
    }

    public void G0(KClass subclass, KSerializer serializer) {
        Intrinsics.checkNotNullParameter(subclass, "subclass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        ((ArrayList) this.f178266c).add(new Pair(subclass, serializer));
    }

    public le.f0 M() {
        String str;
        String str2;
        String str3 = (String) this.f178265b;
        if (str3 != null && (str = (String) this.f178266c) != null && (str2 = (String) this.d) != null) {
            return new le.f0(str3, str, str2);
        }
        StringBuilder sb6 = new StringBuilder();
        if (((String) this.f178265b) == null) {
            sb6.append(" arch");
        }
        if (((String) this.f178266c) == null) {
            sb6.append(" libraryName");
        }
        if (((String) this.d) == null) {
            sb6.append(" buildId");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }

    public void O(tlm.f builder) {
        KClass kClass = (KClass) this.f178265b;
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (Pair pair : (ArrayList) this.f178266c) {
            KClass kClass2 = (KClass) pair.f186385a;
            KSerializer kSerializer = (KSerializer) pair.f186386b;
            Intrinsics.i(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.i(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            tlm.f.g(builder, kClass, kClass2, kSerializer);
        }
        Function1 function1 = (Function1) this.d;
        if (function1 != null) {
            builder.e(kClass, function1);
        }
    }

    public int S() {
        String strY;
        AmountForDualEditView amountForDualEditView = (AmountForDualEditView) this.d;
        return kli.a.s(((amountForDualEditView.isSelected() || !amountForDualEditView.isEnabled()) && (strY = ((sz5.f) this.f178266c).y()) != null && (kotlin.text.d0.W(strY) ^ true)) ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50, (Context) this.f178265b);
    }

    public noc.f W() {
        l lVar = new l((m) this.f178265b, (j60.a) this.f178266c);
        return new noc.f(lVar, new noc.j((noc.e) this.d, lVar));
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    @Override // igm.b
    public void accept(Object obj2, Object obj3) {
        Map map = (Map) obj2;
        Object objApply = ((o) this.d).apply(obj3);
        Collection collection = (Collection) map.get(objApply);
        if (collection == null) {
            collection = (Collection) ((o) this.f178265b).apply(objApply);
            map.put(objApply, collection);
        }
        collection.add(((o) this.f178266c).apply(obj3));
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f178264a) {
            case 11:
                CaptureStepDataBundle it8 = (CaptureStepDataBundle) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                c0 c0Var = (c0) this.f178265b;
                p pVar = (p) this.f178266c;
                Observable observable = (Observable) this.d;
                if (c0Var.f.isRefactoredCaptureEnabled()) {
                    ogm.e eVar = new ogm.e(new v(c0Var, 1), 2);
                    Observable observableCast = observable.filter(nl.b.f216881n).cast(b0.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
                    Observable map = eVar.d(observableCast).map(y.f216964a);
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    Observable observableCast2 = map.filter(nl.b.o).cast(SelfieCaptureScreen.SelfieCaptureResult.Completed.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
                    Observable observableSwitchMap = observableCast2.switchMap(new z(c0Var, pVar));
                    Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
                    return observableSwitchMap;
                }
                Observable observableJust = Observable.just(nl.w.f216961c);
                Observable observableCast3 = observable.filter(nl.b.f216883q).cast(ml.q.class);
                Intrinsics.checkNotNullExpressionValue(observableCast3, "cast(...)");
                a0 function = a0.f;
                Intrinsics.checkNotNullParameter(function, "function");
                Observable map2 = observableCast3.map(new p0(7));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                Observable observableCast4 = map2.filter(nl.b.f216884r).cast(tl.h.class);
                Intrinsics.checkNotNullExpressionValue(observableCast4, "cast(...)");
                Observable observableConcat = Observable.concat(observableJust, observableCast4.map(nl.b.f216882p).switchMap(new kge.d(c0Var, pVar, 13)));
                Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(...)");
                return observableConcat;
            default:
                CaptureStepDataBundle it9 = (CaptureStepDataBundle) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                q0 q0Var = (q0) this.f178265b;
                Observable observable2 = (Observable) this.f178266c;
                sl.q qVar = (sl.q) this.d;
                if (q0Var.d.isRefactoredCaptureEnabled()) {
                    ogm.e eVar2 = new ogm.e(new nl.h0(q0Var, 0), 2);
                    Observable observableCast5 = observable2.filter(nl.b.f216887w).cast(ml.z.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast5, "cast(...)");
                    Observable map3 = eVar2.d(observableCast5).map(k0.f216924a);
                    Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                    Observable observableCast6 = map3.filter(nl.b.f216888x).cast(LivenessCaptureScreen.LivenessCaptureResult.Completed.class);
                    Intrinsics.checkNotNullExpressionValue(observableCast6, "cast(...)");
                    Observable observableSwitchMap2 = observableCast6.map(l0.f216926a).switchMap(new k18.c(q0Var, 10, qVar, observable2));
                    Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
                    return observableSwitchMap2;
                }
                Observable observableJust2 = Observable.just(nl.w.f216960b);
                Observable observableCast7 = observable2.filter(nl.b.B).cast(ml.q.class);
                Intrinsics.checkNotNullExpressionValue(observableCast7, "cast(...)");
                Observable map4 = observableCast7.map(new t1(m0.f));
                Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
                Observable observableCast8 = map4.filter(nl.b.C).cast(i.class);
                Intrinsics.checkNotNullExpressionValue(observableCast8, "cast(...)");
                Observable observableConcat2 = Observable.concat(observableJust2, observableCast8.switchMap(new jpc.e(q0Var, 12, qVar, observable2)));
                Intrinsics.checkNotNullExpressionValue(observableConcat2, "concat(...)");
                return observableConcat2;
        }
    }

    @Override // kv0.a
    public void b(int i, int i2) {
        Surface surface = new Surface((SurfaceTexture) this.f178265b);
        ((ExoPlayer) this.f178266c).setVideoSurface(surface);
        this.d = surface;
    }

    public void b0(Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (((Function1) this.d) == null) {
            this.d = defaultDeserializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + ((KClass) this.f178265b) + ": " + ((Function1) this.d)).toString());
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        s.h((ViewController) this.f178266c, ViewController.class);
        s.h((Boolean) this.d, Boolean.class);
        return new jyc.m((jyc.h) this.f178265b, (Boolean) this.d);
    }

    @Override // ix0.u
    public int d() {
        return S();
    }

    @Override // kv0.a
    public r dispose() {
        ((ExoPlayer) this.f178266c).setVideoSurface(null);
        Surface surface = (Surface) this.d;
        if (surface != null) {
            surface.release();
        }
        this.d = null;
        return e0.a(Unit.f186387a);
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new sl.f((WorkflowApi) ((fmc.z) this.f178265b).get(), (WorkflowConfig) ((f4h.a) this.f178266c).get(), (SchedulersProvider) ((il.g) this.d).get());
    }

    @Override // ix0.u
    public int i() {
        return S();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jm.a j0() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            je.d.b()
            r2 = 0
            java.lang.Object r3 = r8.f178265b     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r4 = r8.f178266c     // Catch: java.lang.Throwable -> Lb7
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = a0(r3, r4)     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb2
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb2
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2c
        L28:
            goto L2c
        L29:
            r0 = move-exception
            goto Lb5
        L2c:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb2
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb2
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb2
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6c
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = r8.d     // Catch: java.lang.Throwable -> L6c
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6c
        L50:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6c
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6c
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6c
            goto L50
        L6c:
            r1 = move-exception
            goto Lb9
        L6e:
            r0.connect()     // Catch: java.lang.Throwable -> L6c
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6c
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto La4
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La1
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La1
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La1
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r5.<init>()     // Catch: java.lang.Throwable -> La1
        L90:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La1
            r7 = -1
            if (r6 == r7) goto L9c
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La1
            goto L90
        L9c:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La1
            goto La4
        La1:
            r1 = move-exception
            r2 = r3
            goto Lb9
        La4:
            if (r3 == 0) goto La9
            r3.close()
        La9:
            r0.disconnect()
            jm.a r0 = new jm.a
            r0.<init>(r1, r2)
            return r0
        Lb2:
            r1 = move-exception
        Lb3:
            r0 = r2
            goto Lb9
        Lb5:
            r1 = r0
            goto Lb3
        Lb7:
            r0 = move-exception
            goto Lb5
        Lb9:
            if (r2 == 0) goto Lbe
            r2.close()
        Lbe:
            if (r0 == 0) goto Lc3
            r0.disconnect()
        Lc3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jt0.b.j0():jm.a");
    }

    public pxa.c k0(pwa.n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        return new pxa.c(referralCampaignV4Type, (wwa.f) this.d, (cl3.a) this.f178265b, (wwa.b) this.f178266c);
    }

    public n4 m0(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.r<Long> rVarInterval = efm.r.interval(0L, 30L, TimeUnit.SECONDS);
        r38.a aVar = (r38.a) this.f178266c;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.r rVarG = m70.a.g(osg.b.e(aVar.f251201a, false, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, accountId, 52), null, new qz9.u(17), 1);
        zhm.h0 h0Var = zhm.h0.f322473a;
        efm.r rVarP = rd0.e.p(ue0.e.q(rVarG, h0Var), CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 0L, 29);
        rVarP.map(new r25.c(15, new r2d.d(10))).distinctUntilChanged().replay(1).e();
        qq8.a aVar2 = (qq8.a) this.d;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        wsg.n nVar = aVar2.f248500a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        n4 n4VarE = rd0.e.p(ue0.e.q(m70.a.g(nVar.J(accountId, w4l.h.f294642c), null, new qz9.u(16), 1), h0Var), CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 0L, 29).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        Intrinsics.h(rVarInterval);
        efm.r rVarSwitchMap = te0.w.m(rVarP, n4VarE, rVarInterval).switchMap(new r25.c(21, new r38.m(this, 0)));
        Intrinsics.h(rVarSwitchMap);
        n4 n4VarE2 = rd0.e.p(ue0.e.q(m70.a.g(rVarSwitchMap, null, new qz9.u(18), 1), h0Var), CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, 0L, 29).distinctUntilChanged().replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE2, "refCount(...)");
        return n4VarE2;
    }

    @Override // ix0.u
    public int q(bw0.h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return S();
    }

    public ufm.i r0(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        ang.f fVar = (ang.f) this.d;
        efm.d0 d0VarF = fVar.f(false);
        Intrinsics.checkNotNullParameter(group, "group");
        efm.d0 d0VarF2 = fVar.f(false);
        mq9.f fVar2 = (mq9.f) this.f178265b;
        String groupId = group.f79285a;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        efm.r rVarFilter = ((x) ((mr9.a) fVar2).f208082a).f(groupId, true).filter(new mlk.b0(new mqg.b(6), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ufm.i iVar = new ufm.i(te0.w.H0(d0VarF2, prk.o.l(rVarFilter, null, null, 3, "firstOrError(...)")), new rpi.d(new bs9.d0(this, group, 8), 6), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.H0(d0VarF, iVar), new rpi.d(new bs9.d0(this, group, 7), 5), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public List s0(ScreenerStatsGroup screenerStatsGroup, zel.e eVar) {
        List listC = ((toh.g) this.d).c(screenerStatsGroup);
        if (((jte.d) ((gte.a) this.f178266c)).c(ScreenerApi$Toggles$InvestScreenerRedesignShowAllMetrics.f96093c)) {
            return listC;
        }
        List list = listC;
        Iterable iterable = eVar.f321799b;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        return d0.d1(d0.h0(list, iterable));
    }

    public File t0(Context context, String str) {
        ((nd.o) this.f178266c).getClass();
        return new File(context.getDir("lib", 0), nd.o.g(str));
    }

    public void u0(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public boolean v0(Stack stack, BackendFlow backendFlow) {
        xl2.f fVar = (xl2.f) this.d;
        if (!((Boolean) te0.w.M(((p54.e) this.f178266c).V(), Boolean.FALSE)).booleanValue()) {
            return false;
        }
        if ((backendFlow != null ? backendFlow.f63263a : null) != xl2.c0.INCOMPLETE || stack == null || stack.isEmpty()) {
            return false;
        }
        if (fVar.f306912a) {
            if (!(!stack.isEmpty())) {
                return false;
            }
            if (!Intrinsics.f(stack.lastElement(), backendFlow != null ? backendFlow.f : null)) {
                return false;
            }
            if (fVar.f306914c) {
                if (((Map) te0.w.M(((qc0.k) this.f178265b).g0(), r0.g())).get(backendFlow != null ? backendFlow.f : null) != null) {
                    return false;
                }
            }
        } else if (stack.size() != 1) {
            return false;
        }
        return true;
    }

    public Flow x0(List feedElementTypes, String ref2, Instant instant) {
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k18.c cVar = (k18.c) this.f178266c;
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar2 = (x4l.c) cVar.f180140b;
        f0 f0Var = f0.f322471a;
        List list = feedElementTypes;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(n14.k.E((x08.c) it8.next()));
        }
        return f.e(cVar2.b(new j18.o(f0Var, 50, instant, arrayList, ref2), loadingStrategy), new n1.y(this, 2));
    }

    public Flow y0(List feedElementTypes, Set assetTypeFilter, Instant instant) {
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(assetTypeFilter, "assetTypeFilters");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(assetTypeFilter, "assetTypeFilters");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k18.c cVar = (k18.c) this.f178266c;
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(assetTypeFilter, "assetTypeFilter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar2 = (x4l.c) cVar.f180140b;
        Set set = assetTypeFilter;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(oc.c.A((tdh.a) it8.next()));
        }
        List list = feedElementTypes;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList2.add(n14.k.E((x08.c) it9.next()));
        }
        return f.e(cVar2.b(new j18.o(arrayList, 50, instant, arrayList2, null), loadingStrategy), new n1.y(this, 2));
    }

    public efm.r z0(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        mr9.d dVar = (mr9.d) this.f178266c;
        String groupId = group.f79285a;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        sfm.b bVarG = dVar.a(groupId).g(dVar.f208090c.a(groupId));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        return nim.a.w(bVarG, new mqg.b(8));
    }

    @Override // pc.c
    public Object zza() {
        return new oc.e((oc.i) ((pc.c) this.f178265b).zza(), (oc.d) ((pc.c) this.f178266c).zza(), ((oc.f) ((kl.b0) this.d).f185144b).f224008a);
    }

    public /* synthetic */ b(boolean z) {
        this.f178264a = 5;
    }

    public b(m allocationWidgetDialogMapper, j60.a bottomExpandableDialogControllerExtension, noc.e delegates) {
        this.f178264a = 13;
        Intrinsics.checkNotNullParameter(allocationWidgetDialogMapper, "allocationWidgetDialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f178265b = allocationWidgetDialogMapper;
        this.f178266c = bottomExpandableDialogControllerExtension;
        this.d = delegates;
    }

    public b(cl3.a contactsInteractor, wwa.b inviteCampaignHomeInteractor, wwa.f inviteFriendsMessagingInteractor) {
        this.f178264a = 17;
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(inviteFriendsMessagingInteractor, "inviteFriendsMessagingInteractor");
        this.f178265b = contactsInteractor;
        this.f178266c = inviteCampaignHomeInteractor;
        this.d = inviteFriendsMessagingInteractor;
    }

    public b(SurfaceTexture surfaceTexture, ExoPlayer player) {
        this.f178264a = 6;
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Intrinsics.checkNotNullParameter(player, "player");
        this.f178265b = surfaceTexture;
        this.f178266c = player;
    }

    public b(h0 commonDataSource, ynf.a bankAccountSwitchingWarningMapper, flf.c bankAccountSwitchingWarningClickHandler) {
        this.f178264a = 8;
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(bankAccountSwitchingWarningMapper, "bankAccountSwitchingWarningMapper");
        Intrinsics.checkNotNullParameter(bankAccountSwitchingWarningClickHandler, "bankAccountSwitchingWarningClickHandler");
        this.f178265b = commonDataSource;
        this.f178266c = bankAccountSwitchingWarningMapper;
        this.d = bankAccountSwitchingWarningClickHandler;
    }

    public b(p56.a naviCommandProvider, gte.a featureToggleInteractor, wli.x deeplinkHandler) {
        this.f178264a = 20;
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f178265b = naviCommandProvider;
        this.f178266c = featureToggleInteractor;
        this.d = deeplinkHandler;
    }

    public b(h0 commonDataSource, vlf.b commonUiMapper, nhf.a unitedWalletInteractor) {
        this.f178264a = 15;
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f178265b = commonDataSource;
        this.f178266c = commonUiMapper;
        this.d = unitedWalletInteractor;
    }

    public b(PortfolioMetricsService service, ne0.j memoryCache, ue0.c storage) {
        this.f178264a = 3;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f178265b = service;
        this.f178266c = memoryCache;
        this.d = storage;
    }

    public b(qm.e advisedComponentsInteractor, su9.c widgetDataComposer, ryc.a widgetDefaultStateProvider) {
        this.f178264a = 25;
        Intrinsics.checkNotNullParameter(advisedComponentsInteractor, "advisedComponentsInteractor");
        Intrinsics.checkNotNullParameter(widgetDataComposer, "widgetDataComposer");
        Intrinsics.checkNotNullParameter(widgetDefaultStateProvider, "widgetDefaultStateProvider");
        this.f178265b = advisedComponentsInteractor;
        this.f178266c = widgetDataComposer;
        this.d = widgetDefaultStateProvider;
    }

    public b(ugl.c screenerInteractor, gte.a featureToggleInteractor, sph.o screenerInstrumentTypeMapper, toh.o statsProvider, toh.g screenerEditableMetricsProvider) {
        this.f178264a = 27;
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(screenerInstrumentTypeMapper, "screenerInstrumentTypeMapper");
        Intrinsics.checkNotNullParameter(statsProvider, "statsProvider");
        Intrinsics.checkNotNullParameter(screenerEditableMetricsProvider, "screenerEditableMetricsProvider");
        this.f178265b = screenerInteractor;
        this.f178266c = featureToggleInteractor;
        this.d = screenerEditableMetricsProvider;
    }

    public b(wsg.n walletInteractor, r38.a currentPocketsProvider, qq8.a baseCurrencyProvider) {
        this.f178264a = 19;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currentPocketsProvider, "currentPocketsProvider");
        Intrinsics.checkNotNullParameter(baseCurrencyProvider, "baseCurrencyProvider");
        this.f178265b = walletInteractor;
        this.f178266c = currentPocketsProvider;
        this.d = baseCurrencyProvider;
    }

    public b(KClass baseClass) {
        this.f178264a = 26;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f178265b = baseClass;
        this.f178266c = new ArrayList();
    }

    public b(fnc.s splitBillLinkInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, l1a.i splitBillQrStateProvider) {
        this.f178264a = 28;
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(splitBillQrStateProvider, "splitBillQrStateProvider");
        this.f178265b = splitBillLinkInteractor;
        this.f178266c = transactionsInteractor;
        this.d = splitBillQrStateProvider;
    }

    public b(hj8.a juniorProfileInteractor, wsg.b newWalletInteractor, gte.a featureToggleInteractor, g88.j juniorMulticurrencyProductAccountIdMapper, g88.k juniorProductAccountIdMapper) {
        this.f178264a = 7;
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(newWalletInteractor, "newWalletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorMulticurrencyProductAccountIdMapper, "juniorMulticurrencyProductAccountIdMapper");
        Intrinsics.checkNotNullParameter(juniorProductAccountIdMapper, "juniorProductAccountIdMapper");
        this.f178265b = juniorProfileInteractor;
        this.f178266c = newWalletInteractor;
        this.d = featureToggleInteractor;
    }

    public b(l99.a countriesRestrictionPromptProvider, ryc.a inlineInstaller, z70.a contextProvider, yp.b appStoreNavigationFactory) {
        this.f178264a = 4;
        Intrinsics.checkNotNullParameter(countriesRestrictionPromptProvider, "countriesRestrictionPromptProvider");
        Intrinsics.checkNotNullParameter(inlineInstaller, "inlineInstaller");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        this.f178265b = inlineInstaller;
        this.f178266c = contextProvider;
        this.d = appStoreNavigationFactory;
    }

    public b(hj8.a juniorProfileInteractor, ao.h juniorCoparentInteractor, zb8.b juniorAllowanceStandingOrderRepository) {
        this.f178264a = 29;
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowanceStandingOrderRepository, "juniorAllowanceStandingOrderRepository");
        this.f178265b = juniorProfileInteractor;
        this.f178266c = juniorCoparentInteractor;
        this.d = juniorAllowanceStandingOrderRepository;
    }

    public b(qc0.k state, p54.e cancellationState, xl2.f backendFlowConfiguration) {
        this.f178264a = 18;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cancellationState, "cancellationState");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        this.f178265b = state;
        this.f178266c = cancellationState;
        this.d = backendFlowConfiguration;
    }

    public b(mq9.f groupsInteractor, mr9.d groupsRemindersInteractor, ang.f userInteractor) {
        this.f178264a = 21;
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(groupsRemindersInteractor, "groupsRemindersInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f178265b = groupsInteractor;
        this.f178266c = groupsRemindersInteractor;
        this.d = userInteractor;
    }

    public b(tga.k upgradeEntryPointItemProvider, wif.a userFeaturesChecker, m5k.b breakdownDisclaimerProvider) {
        this.f178264a = 16;
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(breakdownDisclaimerProvider, "breakdownDisclaimerProvider");
        this.f178265b = upgradeEntryPointItemProvider;
        this.f178266c = userFeaturesChecker;
        this.d = breakdownDisclaimerProvider;
    }

    public b(gte.a featureToggleInteractor, k18.c smartNotificationsRepository, ybl.b instrumentTickerInteractor) {
        this.f178264a = 9;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(smartNotificationsRepository, "smartNotificationsRepository");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f178265b = featureToggleInteractor;
        this.f178266c = smartNotificationsRepository;
        this.d = instrumentTickerInteractor;
    }

    public b(String str, HashMap map) {
        this.f178264a = 10;
        this.f178265b = str;
        this.f178266c = map;
        this.d = new HashMap();
    }

    public b(jyc.h hVar) {
        this.f178264a = 1;
        this.f178265b = hVar;
    }

    public b(ryc.b bVar, ryc.c cVar) {
        this.f178264a = 22;
        this.f178265b = cVar;
        int i = 0;
        this.f178266c = e4m.b.b(new ryc.d(bVar, this, 1, i));
        this.d = e4m.b.b(new ryc.d(bVar, this, 0, i));
    }

    public b(AmountForDualEditView amountForDualEditView, Context context, sz5.f arithmeticDelegateCallback) {
        this.f178264a = 0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(arithmeticDelegateCallback, "arithmeticDelegateCallback");
        this.d = amountForDualEditView;
        this.f178265b = context;
        this.f178266c = arithmeticDelegateCallback;
    }

    public b(int i) {
        this.f178264a = i;
        switch (i) {
            case 23:
                nd.o oVar = new nd.o();
                nd.n nVar = new nd.n(11);
                this.f178265b = new HashSet();
                this.f178266c = oVar;
                this.d = nVar;
                break;
        }
    }
}
