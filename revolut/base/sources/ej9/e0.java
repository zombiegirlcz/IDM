package ej9;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import dp4.a1;
import egb.m0;
import ej9.d;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements ci9.b {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterApiService f126799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f126800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f126801c;
    public final zjh.j d;
    public final qh4.m e;
    public final re0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f126802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f126803h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final re0.c f126804j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f126805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ao.h f126806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final re0.c f126807n;
    public final re0.c o;

    public e0(PayLaterApiService api2, ne0.d memoryCache, ue0.c storage, zjh.j agreementsDtoMapper, qh4.m serverErrorParser) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(agreementsDtoMapper, "agreementsDtoMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f126799a = api2;
        this.f126800b = memoryCache;
        this.f126801c = storage;
        this.d = agreementsDtoMapper;
        this.e = serverErrorParser;
        re0.d dVar = new re0.d(memoryCache, storage);
        ej6.x xVar = new ej6.x(10);
        eed.a aVar = new eed.a(27);
        t tVar = new t(3);
        Continuation continuation = null;
        a0 a0Var = new a0(this, null);
        Type type = new TypeToken<dj9.a>() { // from class: com.revolut.feature.pay_later.impl.repositories.PayLaterRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f = new re0.c(dVar, xVar, type, aVar, tVar, a0Var);
        final int i = 6;
        final int i2 = 7;
        final int i3 = 8;
        this.f126802g = new w4l.f(new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new q(this, 8), new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new q(this, 9), new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 9;
        final int i6 = 0;
        final int i21 = 1;
        this.f126803h = new w4l.f(new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new q(this, 10), new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new q(this, 3), new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 2;
        final int i32 = 3;
        final int i33 = 4;
        this.i = new w4l.f(new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new q(this, 4), new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new q(this, 5), new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        re0.d dVar2 = new re0.d(memoryCache, storage);
        ej6.x xVar2 = new ej6.x(11);
        eed.a aVar2 = new eed.a(26);
        eed.a aVar3 = new eed.a(28);
        b0 b0Var = new b0(this, continuation, 0);
        Type type2 = new TypeToken<dj9.z>() { // from class: com.revolut.feature.pay_later.impl.repositories.PayLaterRepositoryImpl$special$$inlined$invoke$2
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        this.f126804j = new re0.c(dVar2, xVar2, type2, aVar2, aVar3, b0Var);
        this.k = yhm.j.b(new m0(13));
        final int i43 = 5;
        this.f126805l = new x4l.c(new a1(this, continuation, 16), new q(this, 6), new Function2(this) { // from class: ej9.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f126829b;

            {
                this.f126829b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        e key = (e) obj2;
                        ux4.b agreements = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(agreements, "agreements");
                        this.f126829b.f126800b.f(key.f126797b, agreements);
                        return Unit.f186387a;
                    case 1:
                        e key2 = (e) obj2;
                        ux4.b agreements2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(agreements2, "agreements");
                        this.f126829b.f126801c.G(tx4.a.b(agreements2), key2.f126797b, wim.z.d(o0.b(rx4.b.class)));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f126829b.f126799a.getFeeSettings();
                    case 3:
                        dj9.d feeSettings = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
                        this.f126829b.f126800b.f("FEE_SETTINGS", feeSettings);
                        return Unit.f186387a;
                    case 4:
                        dj9.d feeSettings2 = (dj9.d) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeSettings2, "feeSettings");
                        this.f126829b.f126801c.G(feeSettings2, "FEE_SETTINGS", wim.z.d(o0.b(dj9.d.class)));
                        return Unit.f186387a;
                    case 5:
                        dj9.d0 params = (dj9.d0) obj2;
                        dj9.z feeSettings3 = (dj9.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(feeSettings3, "feeSettings");
                        ne0.n nVar = (ne0.n) this.f126829b.k.getValue();
                        g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        long j2 = params.f115167a;
                        long j3 = params.f115168b;
                        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "PURCHASE_SIMULATION:", ":");
                        sbV.append(j3);
                        nVar.f(sbV.toString(), feeSettings3);
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return this.f126829b.f126799a.getPayLaterState();
                    case 7:
                        dj9.u state = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f126829b.f126800b.f("SWITCHER_STATUS", state);
                        return Unit.f186387a;
                    case 8:
                        dj9.u state2 = (dj9.u) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(state2, "state");
                        this.f126829b.f126801c.G(state2, "SWITCHER_STATUS", wim.z.d(o0.b(dj9.u.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        e key3 = (e) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key3, "key");
                        e0 e0Var = this.f126829b;
                        efm.d0<rx4.b> agreements3 = e0Var.f126799a.getAgreements(key3.f126796a);
                        s sVar = new s(new eed.j(e0Var, key3, 14), 0);
                        agreements3.getClass();
                        ufm.i iVar = new ufm.i(agreements3, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                }
            }
        }, new e31.i(2, 4, continuation), new eci.a(3, 1, continuation));
        this.f126806m = new ao.h(20, new q(this, 7));
        re0.d dVar3 = new re0.d(memoryCache, storage);
        ej6.x xVar3 = new ej6.x(12);
        t tVar2 = new t(0);
        int i59 = 1;
        t tVar3 = new t(i59);
        b0 b0Var2 = new b0(this, continuation, i59);
        Type type3 = new TypeToken<dj9.h>() { // from class: com.revolut.feature.pay_later.impl.repositories.PayLaterRepositoryImpl$special$$inlined$invoke$3
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        this.f126807n = new re0.c(dVar3, xVar3, type3, tVar2, tVar3, b0Var2);
        re0.d dVar4 = new re0.d(memoryCache, storage);
        ej6.x xVar4 = new ej6.x(13);
        t tVar4 = new t(2);
        t tVar5 = new t(4);
        b0 b0Var3 = new b0(this, continuation, 2);
        Type type4 = new TypeToken<dj9.j>() { // from class: com.revolut.feature.pay_later.impl.repositories.PayLaterRepositoryImpl$special$$inlined$invoke$4
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        this.o = new re0.c(dVar4, xVar4, type4, tVar4, tVar5, b0Var3);
    }

    public final akg.n a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(this.f.a(d.a.f126793a, loadingStrategy), v.f);
    }

    public final Object b(gim.c cVar) throws Throwable {
        c0 c0Var = new c0(this, null);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, c0Var, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
