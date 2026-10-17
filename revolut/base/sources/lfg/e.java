package lfg;

import androidx.room.util.DBUtil;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesProviderSummary;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.feature.travel.miles.api.model.TravelMilesRateDisplay;
import com.revolut.feature.travel.miles.impl.network.TravelMilesService;
import hfg.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesService f194871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f194872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ofg.g f194873c;
    public final w4l.f d;
    public final w4l.f e;

    public e(TravelMilesService service, ne0.j memoryCache, ofg.g travelMilesDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(travelMilesDao, "travelMilesDao");
        this.f194871a = service;
        this.f194872b = memoryCache;
        this.f194873c = travelMilesDao;
        final int i = 2;
        Function2 function2 = new Function2(this) { // from class: lfg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194863b;

            {
                this.f194863b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_ACCOUNTS", accounts);
                        return Unit.f186387a;
                    case 1:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        ofg.g gVar = this.f194863b.f194873c;
                        List<TravelMilesAccountV2> list = accounts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TravelMilesAccountV2 travelMilesAccountV2 : list) {
                            Intrinsics.checkNotNullParameter(travelMilesAccountV2, "<this>");
                            String str = travelMilesAccountV2.f94085a;
                            String str2 = travelMilesAccountV2.f94086b;
                            TravelMilesProviderSummary travelMilesProviderSummary = travelMilesAccountV2.f94087c;
                            Intrinsics.checkNotNullParameter(travelMilesProviderSummary, "<this>");
                            arrayList.add(new qfg.b(str, str2, new qfg.h(travelMilesProviderSummary.f94109a, travelMilesProviderSummary.f94110b, travelMilesProviderSummary.f94111c, travelMilesProviderSummary.d.name()), travelMilesAccountV2.d));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 0));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.w> rate = this.f194863b.f194871a.getRate(request.f194867a, request.f194868b);
                        le3.y yVar = new le3.y(new le3.b(24), 8);
                        rate.getClass();
                        ufm.i iVar = new ufm.i(rate, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        TravelMilesRate rate2 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rate2, "rate");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_RATE" + request2.f194867a + request2.f194868b, rate2);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        TravelMilesRate rate3 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rate3, "rate");
                        ofg.g gVar2 = this.f194863b.f194873c;
                        String accountId = request3.f194867a;
                        String currency = request3.f194868b;
                        Intrinsics.checkNotNullParameter(rate3, "<this>");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        double d = rate3.f94112a;
                        jo3.b bVarA = hx7.a.A(rate3.f94113b);
                        TravelMilesRateDisplay travelMilesRateDisplay = rate3.f94114c;
                        Intrinsics.checkNotNullParameter(travelMilesRateDisplay, "<this>");
                        qfg.j jVar = new qfg.j(accountId, currency, d, bVarA, new qfg.i(travelMilesRateDisplay.f94115a, travelMilesRateDisplay.f94116b));
                        gVar2.getClass();
                        DBUtil.performBlocking(gVar2.f224846a, false, true, new ofg.a(gVar2, jVar, 2));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.d>> accounts3 = this.f194863b.f194871a.getAccounts(true);
                        le3.y yVar2 = new le3.y(new le3.b(25), 9);
                        accounts3.getClass();
                        ufm.i iVar2 = new ufm.i(accounts3, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: lfg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194861b;

            {
                this.f194861b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                t0 t0Var;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f194861b.f194872b.get("CACHE_KEY_MILES_ACCOUNTS");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ofg.g gVar = this.f194861b.f194873c;
                        int i2 = 0;
                        List<qfg.b> list = (List) DBUtil.performBlocking(gVar.f224846a, true, false, new ofg.f(gVar, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qfg.b bVar : list) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f245300a;
                            String str2 = bVar.f245301b;
                            qfg.h hVar = bVar.f245302c;
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String str3 = hVar.f245329a;
                            String str4 = hVar.f245330b;
                            String str5 = hVar.f245331c;
                            String str6 = hVar.d;
                            t0[] t0VarArrValues = t0.values();
                            int length = t0VarArrValues.length;
                            int i3 = i2;
                            while (true) {
                                if (i3 < length) {
                                    t0Var = t0VarArrValues[i3];
                                    if (!kotlin.text.a0.z(t0Var.name(), str6, true)) {
                                        i3++;
                                    }
                                } else {
                                    t0Var = null;
                                }
                            }
                            if (t0Var == null) {
                                t0Var = t0.MILES;
                            }
                            TravelMilesProviderSummary travelMilesProviderSummary = new TravelMilesProviderSummary(str3, str4, str5, t0Var);
                            List list2 = bVar.d;
                            if (list2 == null) {
                                list2 = zhm.f0.f322471a;
                            }
                            arrayList.add(new TravelMilesAccountV2(str, str2, travelMilesProviderSummary, list2));
                            i2 = 0;
                        }
                        return c6d.b.N(arrayList);
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (TravelMilesRate) this.f194861b.f194872b.get("CACHE_KEY_MILES_RATE" + request.f194867a + request.f194868b);
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        ofg.g gVar2 = this.f194861b.f194873c;
                        qfg.j jVar = (qfg.j) DBUtil.performBlocking(gVar2.f224846a, true, false, new neg.q(gVar2, 26, request2.f194867a, request2.f194868b));
                        if (jVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar, "<this>");
                        double d = jVar.f245336c;
                        dj0.d dVarV = hx7.a.v(jVar.d);
                        qfg.i iVar = jVar.e;
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        return new TravelMilesRate(d, dVarV, new TravelMilesRateDisplay(iVar.getPoints(), iVar.getReward()));
                }
            }
        };
        final int i2 = 3;
        Function2 function22 = new Function2(this) { // from class: lfg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194863b;

            {
                this.f194863b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_ACCOUNTS", accounts);
                        return Unit.f186387a;
                    case 1:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        ofg.g gVar = this.f194863b.f194873c;
                        List<TravelMilesAccountV2> list = accounts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TravelMilesAccountV2 travelMilesAccountV2 : list) {
                            Intrinsics.checkNotNullParameter(travelMilesAccountV2, "<this>");
                            String str = travelMilesAccountV2.f94085a;
                            String str2 = travelMilesAccountV2.f94086b;
                            TravelMilesProviderSummary travelMilesProviderSummary = travelMilesAccountV2.f94087c;
                            Intrinsics.checkNotNullParameter(travelMilesProviderSummary, "<this>");
                            arrayList.add(new qfg.b(str, str2, new qfg.h(travelMilesProviderSummary.f94109a, travelMilesProviderSummary.f94110b, travelMilesProviderSummary.f94111c, travelMilesProviderSummary.d.name()), travelMilesAccountV2.d));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 0));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.w> rate = this.f194863b.f194871a.getRate(request.f194867a, request.f194868b);
                        le3.y yVar = new le3.y(new le3.b(24), 8);
                        rate.getClass();
                        ufm.i iVar = new ufm.i(rate, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        TravelMilesRate rate2 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rate2, "rate");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_RATE" + request2.f194867a + request2.f194868b, rate2);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        TravelMilesRate rate3 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rate3, "rate");
                        ofg.g gVar2 = this.f194863b.f194873c;
                        String accountId = request3.f194867a;
                        String currency = request3.f194868b;
                        Intrinsics.checkNotNullParameter(rate3, "<this>");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        double d = rate3.f94112a;
                        jo3.b bVarA = hx7.a.A(rate3.f94113b);
                        TravelMilesRateDisplay travelMilesRateDisplay = rate3.f94114c;
                        Intrinsics.checkNotNullParameter(travelMilesRateDisplay, "<this>");
                        qfg.j jVar = new qfg.j(accountId, currency, d, bVarA, new qfg.i(travelMilesRateDisplay.f94115a, travelMilesRateDisplay.f94116b));
                        gVar2.getClass();
                        DBUtil.performBlocking(gVar2.f224846a, false, true, new ofg.a(gVar2, jVar, 2));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.d>> accounts3 = this.f194863b.f194871a.getAccounts(true);
                        le3.y yVar2 = new le3.y(new le3.b(25), 9);
                        accounts3.getClass();
                        ufm.i iVar2 = new ufm.i(accounts3, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: lfg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194861b;

            {
                this.f194861b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                t0 t0Var;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f194861b.f194872b.get("CACHE_KEY_MILES_ACCOUNTS");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ofg.g gVar = this.f194861b.f194873c;
                        int i22 = 0;
                        List<qfg.b> list = (List) DBUtil.performBlocking(gVar.f224846a, true, false, new ofg.f(gVar, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qfg.b bVar : list) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f245300a;
                            String str2 = bVar.f245301b;
                            qfg.h hVar = bVar.f245302c;
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String str3 = hVar.f245329a;
                            String str4 = hVar.f245330b;
                            String str5 = hVar.f245331c;
                            String str6 = hVar.d;
                            t0[] t0VarArrValues = t0.values();
                            int length = t0VarArrValues.length;
                            int i3 = i22;
                            while (true) {
                                if (i3 < length) {
                                    t0Var = t0VarArrValues[i3];
                                    if (!kotlin.text.a0.z(t0Var.name(), str6, true)) {
                                        i3++;
                                    }
                                } else {
                                    t0Var = null;
                                }
                            }
                            if (t0Var == null) {
                                t0Var = t0.MILES;
                            }
                            TravelMilesProviderSummary travelMilesProviderSummary = new TravelMilesProviderSummary(str3, str4, str5, t0Var);
                            List list2 = bVar.d;
                            if (list2 == null) {
                                list2 = zhm.f0.f322471a;
                            }
                            arrayList.add(new TravelMilesAccountV2(str, str2, travelMilesProviderSummary, list2));
                            i22 = 0;
                        }
                        return c6d.b.N(arrayList);
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (TravelMilesRate) this.f194861b.f194872b.get("CACHE_KEY_MILES_RATE" + request.f194867a + request.f194868b);
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        ofg.g gVar2 = this.f194861b.f194873c;
                        qfg.j jVar = (qfg.j) DBUtil.performBlocking(gVar2.f224846a, true, false, new neg.q(gVar2, 26, request2.f194867a, request2.f194868b));
                        if (jVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar, "<this>");
                        double d = jVar.f245336c;
                        dj0.d dVarV = hx7.a.v(jVar.d);
                        qfg.i iVar = jVar.e;
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        return new TravelMilesRate(d, dVarV, new TravelMilesRateDisplay(iVar.getPoints(), iVar.getReward()));
                }
            }
        };
        final int i3 = 4;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: lfg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194863b;

            {
                this.f194863b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_ACCOUNTS", accounts);
                        return Unit.f186387a;
                    case 1:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        ofg.g gVar = this.f194863b.f194873c;
                        List<TravelMilesAccountV2> list = accounts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TravelMilesAccountV2 travelMilesAccountV2 : list) {
                            Intrinsics.checkNotNullParameter(travelMilesAccountV2, "<this>");
                            String str = travelMilesAccountV2.f94085a;
                            String str2 = travelMilesAccountV2.f94086b;
                            TravelMilesProviderSummary travelMilesProviderSummary = travelMilesAccountV2.f94087c;
                            Intrinsics.checkNotNullParameter(travelMilesProviderSummary, "<this>");
                            arrayList.add(new qfg.b(str, str2, new qfg.h(travelMilesProviderSummary.f94109a, travelMilesProviderSummary.f94110b, travelMilesProviderSummary.f94111c, travelMilesProviderSummary.d.name()), travelMilesAccountV2.d));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 0));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.w> rate = this.f194863b.f194871a.getRate(request.f194867a, request.f194868b);
                        le3.y yVar = new le3.y(new le3.b(24), 8);
                        rate.getClass();
                        ufm.i iVar = new ufm.i(rate, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        TravelMilesRate rate2 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rate2, "rate");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_RATE" + request2.f194867a + request2.f194868b, rate2);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        TravelMilesRate rate3 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rate3, "rate");
                        ofg.g gVar2 = this.f194863b.f194873c;
                        String accountId = request3.f194867a;
                        String currency = request3.f194868b;
                        Intrinsics.checkNotNullParameter(rate3, "<this>");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        double d = rate3.f94112a;
                        jo3.b bVarA = hx7.a.A(rate3.f94113b);
                        TravelMilesRateDisplay travelMilesRateDisplay = rate3.f94114c;
                        Intrinsics.checkNotNullParameter(travelMilesRateDisplay, "<this>");
                        qfg.j jVar = new qfg.j(accountId, currency, d, bVarA, new qfg.i(travelMilesRateDisplay.f94115a, travelMilesRateDisplay.f94116b));
                        gVar2.getClass();
                        DBUtil.performBlocking(gVar2.f224846a, false, true, new ofg.a(gVar2, jVar, 2));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.d>> accounts3 = this.f194863b.f194871a.getAccounts(true);
                        le3.y yVar2 = new le3.y(new le3.b(25), 9);
                        accounts3.getClass();
                        ufm.i iVar2 = new ufm.i(accounts3, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 5;
        Function2 function23 = new Function2(this) { // from class: lfg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194863b;

            {
                this.f194863b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_ACCOUNTS", accounts);
                        return Unit.f186387a;
                    case 1:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        ofg.g gVar = this.f194863b.f194873c;
                        List<TravelMilesAccountV2> list = accounts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TravelMilesAccountV2 travelMilesAccountV2 : list) {
                            Intrinsics.checkNotNullParameter(travelMilesAccountV2, "<this>");
                            String str = travelMilesAccountV2.f94085a;
                            String str2 = travelMilesAccountV2.f94086b;
                            TravelMilesProviderSummary travelMilesProviderSummary = travelMilesAccountV2.f94087c;
                            Intrinsics.checkNotNullParameter(travelMilesProviderSummary, "<this>");
                            arrayList.add(new qfg.b(str, str2, new qfg.h(travelMilesProviderSummary.f94109a, travelMilesProviderSummary.f94110b, travelMilesProviderSummary.f94111c, travelMilesProviderSummary.d.name()), travelMilesAccountV2.d));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 0));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.w> rate = this.f194863b.f194871a.getRate(request.f194867a, request.f194868b);
                        le3.y yVar = new le3.y(new le3.b(24), 8);
                        rate.getClass();
                        ufm.i iVar = new ufm.i(rate, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        TravelMilesRate rate2 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rate2, "rate");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_RATE" + request2.f194867a + request2.f194868b, rate2);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        TravelMilesRate rate3 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rate3, "rate");
                        ofg.g gVar2 = this.f194863b.f194873c;
                        String accountId = request3.f194867a;
                        String currency = request3.f194868b;
                        Intrinsics.checkNotNullParameter(rate3, "<this>");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        double d = rate3.f94112a;
                        jo3.b bVarA = hx7.a.A(rate3.f94113b);
                        TravelMilesRateDisplay travelMilesRateDisplay = rate3.f94114c;
                        Intrinsics.checkNotNullParameter(travelMilesRateDisplay, "<this>");
                        qfg.j jVar = new qfg.j(accountId, currency, d, bVarA, new qfg.i(travelMilesRateDisplay.f94115a, travelMilesRateDisplay.f94116b));
                        gVar2.getClass();
                        DBUtil.performBlocking(gVar2.f224846a, false, true, new ofg.a(gVar2, jVar, 2));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.d>> accounts3 = this.f194863b.f194871a.getAccounts(true);
                        le3.y yVar2 = new le3.y(new le3.b(25), 9);
                        accounts3.getClass();
                        ufm.i iVar2 = new ufm.i(accounts3, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i6 = 0;
        Function1 function13 = new Function1(this) { // from class: lfg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194861b;

            {
                this.f194861b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                t0 t0Var;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f194861b.f194872b.get("CACHE_KEY_MILES_ACCOUNTS");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ofg.g gVar = this.f194861b.f194873c;
                        int i22 = 0;
                        List<qfg.b> list = (List) DBUtil.performBlocking(gVar.f224846a, true, false, new ofg.f(gVar, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qfg.b bVar : list) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f245300a;
                            String str2 = bVar.f245301b;
                            qfg.h hVar = bVar.f245302c;
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String str3 = hVar.f245329a;
                            String str4 = hVar.f245330b;
                            String str5 = hVar.f245331c;
                            String str6 = hVar.d;
                            t0[] t0VarArrValues = t0.values();
                            int length = t0VarArrValues.length;
                            int i32 = i22;
                            while (true) {
                                if (i32 < length) {
                                    t0Var = t0VarArrValues[i32];
                                    if (!kotlin.text.a0.z(t0Var.name(), str6, true)) {
                                        i32++;
                                    }
                                } else {
                                    t0Var = null;
                                }
                            }
                            if (t0Var == null) {
                                t0Var = t0.MILES;
                            }
                            TravelMilesProviderSummary travelMilesProviderSummary = new TravelMilesProviderSummary(str3, str4, str5, t0Var);
                            List list2 = bVar.d;
                            if (list2 == null) {
                                list2 = zhm.f0.f322471a;
                            }
                            arrayList.add(new TravelMilesAccountV2(str, str2, travelMilesProviderSummary, list2));
                            i22 = 0;
                        }
                        return c6d.b.N(arrayList);
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (TravelMilesRate) this.f194861b.f194872b.get("CACHE_KEY_MILES_RATE" + request.f194867a + request.f194868b);
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        ofg.g gVar2 = this.f194861b.f194873c;
                        qfg.j jVar = (qfg.j) DBUtil.performBlocking(gVar2.f224846a, true, false, new neg.q(gVar2, 26, request2.f194867a, request2.f194868b));
                        if (jVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar, "<this>");
                        double d = jVar.f245336c;
                        dj0.d dVarV = hx7.a.v(jVar.d);
                        qfg.i iVar = jVar.e;
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        return new TravelMilesRate(d, dVarV, new TravelMilesRateDisplay(iVar.getPoints(), iVar.getReward()));
                }
            }
        };
        Function2 function24 = new Function2(this) { // from class: lfg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194863b;

            {
                this.f194863b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_ACCOUNTS", accounts);
                        return Unit.f186387a;
                    case 1:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        ofg.g gVar = this.f194863b.f194873c;
                        List<TravelMilesAccountV2> list = accounts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TravelMilesAccountV2 travelMilesAccountV2 : list) {
                            Intrinsics.checkNotNullParameter(travelMilesAccountV2, "<this>");
                            String str = travelMilesAccountV2.f94085a;
                            String str2 = travelMilesAccountV2.f94086b;
                            TravelMilesProviderSummary travelMilesProviderSummary = travelMilesAccountV2.f94087c;
                            Intrinsics.checkNotNullParameter(travelMilesProviderSummary, "<this>");
                            arrayList.add(new qfg.b(str, str2, new qfg.h(travelMilesProviderSummary.f94109a, travelMilesProviderSummary.f94110b, travelMilesProviderSummary.f94111c, travelMilesProviderSummary.d.name()), travelMilesAccountV2.d));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 0));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.w> rate = this.f194863b.f194871a.getRate(request.f194867a, request.f194868b);
                        le3.y yVar = new le3.y(new le3.b(24), 8);
                        rate.getClass();
                        ufm.i iVar = new ufm.i(rate, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        TravelMilesRate rate2 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rate2, "rate");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_RATE" + request2.f194867a + request2.f194868b, rate2);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        TravelMilesRate rate3 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rate3, "rate");
                        ofg.g gVar2 = this.f194863b.f194873c;
                        String accountId = request3.f194867a;
                        String currency = request3.f194868b;
                        Intrinsics.checkNotNullParameter(rate3, "<this>");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        double d = rate3.f94112a;
                        jo3.b bVarA = hx7.a.A(rate3.f94113b);
                        TravelMilesRateDisplay travelMilesRateDisplay = rate3.f94114c;
                        Intrinsics.checkNotNullParameter(travelMilesRateDisplay, "<this>");
                        qfg.j jVar = new qfg.j(accountId, currency, d, bVarA, new qfg.i(travelMilesRateDisplay.f94115a, travelMilesRateDisplay.f94116b));
                        gVar2.getClass();
                        DBUtil.performBlocking(gVar2.f224846a, false, true, new ofg.a(gVar2, jVar, 2));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.d>> accounts3 = this.f194863b.f194871a.getAccounts(true);
                        le3.y yVar2 = new le3.y(new le3.b(25), 9);
                        accounts3.getClass();
                        ufm.i iVar2 = new ufm.i(accounts3, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i21 = 1;
        this.e = new w4l.f(function23, function13, function24, new Function1(this) { // from class: lfg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194861b;

            {
                this.f194861b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                t0 t0Var;
                switch (i21) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (List) this.f194861b.f194872b.get("CACHE_KEY_MILES_ACCOUNTS");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        ofg.g gVar = this.f194861b.f194873c;
                        int i22 = 0;
                        List<qfg.b> list = (List) DBUtil.performBlocking(gVar.f224846a, true, false, new ofg.f(gVar, 1));
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (qfg.b bVar : list) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String str = bVar.f245300a;
                            String str2 = bVar.f245301b;
                            qfg.h hVar = bVar.f245302c;
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String str3 = hVar.f245329a;
                            String str4 = hVar.f245330b;
                            String str5 = hVar.f245331c;
                            String str6 = hVar.d;
                            t0[] t0VarArrValues = t0.values();
                            int length = t0VarArrValues.length;
                            int i32 = i22;
                            while (true) {
                                if (i32 < length) {
                                    t0Var = t0VarArrValues[i32];
                                    if (!kotlin.text.a0.z(t0Var.name(), str6, true)) {
                                        i32++;
                                    }
                                } else {
                                    t0Var = null;
                                }
                            }
                            if (t0Var == null) {
                                t0Var = t0.MILES;
                            }
                            TravelMilesProviderSummary travelMilesProviderSummary = new TravelMilesProviderSummary(str3, str4, str5, t0Var);
                            List list2 = bVar.d;
                            if (list2 == null) {
                                list2 = zhm.f0.f322471a;
                            }
                            arrayList.add(new TravelMilesAccountV2(str, str2, travelMilesProviderSummary, list2));
                            i22 = 0;
                        }
                        return c6d.b.N(arrayList);
                    case 2:
                        d request = (d) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        return (TravelMilesRate) this.f194861b.f194872b.get("CACHE_KEY_MILES_RATE" + request.f194867a + request.f194868b);
                    default:
                        d request2 = (d) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        ofg.g gVar2 = this.f194861b.f194873c;
                        qfg.j jVar = (qfg.j) DBUtil.performBlocking(gVar2.f224846a, true, false, new neg.q(gVar2, 26, request2.f194867a, request2.f194868b));
                        if (jVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(jVar, "<this>");
                        double d = jVar.f245336c;
                        dj0.d dVarV = hx7.a.v(jVar.d);
                        qfg.i iVar = jVar.e;
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        return new TravelMilesRate(d, dVarV, new TravelMilesRateDisplay(iVar.getPoints(), iVar.getReward()));
                }
            }
        }, new Function2(this) { // from class: lfg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f194863b;

            {
                this.f194863b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        List accounts = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts, "accounts");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_ACCOUNTS", accounts);
                        return Unit.f186387a;
                    case 1:
                        List accounts2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        ofg.g gVar = this.f194863b.f194873c;
                        List<TravelMilesAccountV2> list = accounts2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TravelMilesAccountV2 travelMilesAccountV2 : list) {
                            Intrinsics.checkNotNullParameter(travelMilesAccountV2, "<this>");
                            String str = travelMilesAccountV2.f94085a;
                            String str2 = travelMilesAccountV2.f94086b;
                            TravelMilesProviderSummary travelMilesProviderSummary = travelMilesAccountV2.f94087c;
                            Intrinsics.checkNotNullParameter(travelMilesProviderSummary, "<this>");
                            arrayList.add(new qfg.b(str, str2, new qfg.h(travelMilesProviderSummary.f94109a, travelMilesProviderSummary.f94110b, travelMilesProviderSummary.f94111c, travelMilesProviderSummary.d.name()), travelMilesAccountV2.d));
                        }
                        DBUtil.performBlocking(gVar.f224846a, false, true, new ofg.e(gVar, arrayList, 0));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        d request = (d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.w> rate = this.f194863b.f194871a.getRate(request.f194867a, request.f194868b);
                        le3.y yVar = new le3.y(new le3.b(24), 8);
                        rate.getClass();
                        ufm.i iVar = new ufm.i(rate, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        d request2 = (d) obj2;
                        TravelMilesRate rate2 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(rate2, "rate");
                        this.f194863b.f194872b.f("CACHE_KEY_MILES_RATE" + request2.f194867a + request2.f194868b, rate2);
                        return Unit.f186387a;
                    case 4:
                        d request3 = (d) obj2;
                        TravelMilesRate rate3 = (TravelMilesRate) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(rate3, "rate");
                        ofg.g gVar2 = this.f194863b.f194873c;
                        String accountId = request3.f194867a;
                        String currency = request3.f194868b;
                        Intrinsics.checkNotNullParameter(rate3, "<this>");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        double d = rate3.f94112a;
                        jo3.b bVarA = hx7.a.A(rate3.f94113b);
                        TravelMilesRateDisplay travelMilesRateDisplay = rate3.f94114c;
                        Intrinsics.checkNotNullParameter(travelMilesRateDisplay, "<this>");
                        qfg.j jVar = new qfg.j(accountId, currency, d, bVarA, new qfg.i(travelMilesRateDisplay.f94115a, travelMilesRateDisplay.f94116b));
                        gVar2.getClass();
                        DBUtil.performBlocking(gVar2.f224846a, false, true, new ofg.a(gVar2, jVar, 2));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        efm.d0<List<xfg.d>> accounts3 = this.f194863b.f194871a.getAccounts(true);
                        le3.y yVar2 = new le3.y(new le3.b(25), 9);
                        accounts3.getClass();
                        ufm.i iVar2 = new ufm.i(accounts3, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
