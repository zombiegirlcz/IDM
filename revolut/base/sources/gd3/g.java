package gd3;

import android.content.Context;
import atg.m;
import atg.n;
import atg.v;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.cashback.impl.network.CashbackBoxService;
import com.revolut.feature.cashback.impl.network.CashbackService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import gaf.l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements c {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f143053l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashbackBoxService f143054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CashbackService f143055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qsg.b f143056c;
    public final ue0.c d;
    public final ne0.j e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f143057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f143058h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f143059j;
    public final w4l.f k;

    static {
        Type type = new TypeToken<List<? extends wc3.a>>() { // from class: com.revolut.feature.cashback.impl.repository.CashbackRepositoryImpl$Companion$CASHBACK_BOXES_ENTITY_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f143053l = type;
    }

    public g(CashbackBoxService cashbackBoxService, CashbackService cashbackService, qsg.b walletsRepository, ue0.c cashbackStorage, ne0.j memoryCache, Context context) {
        Intrinsics.checkNotNullParameter(cashbackBoxService, "cashbackBoxService");
        Intrinsics.checkNotNullParameter(cashbackService, "cashbackService");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        Intrinsics.checkNotNullParameter(cashbackStorage, "cashbackStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f143054a = cashbackBoxService;
        this.f143055b = cashbackService;
        this.f143056c = walletsRepository;
        this.d = cashbackStorage;
        this.e = memoryCache;
        this.f = context;
        final int i = 0;
        final int i2 = 9;
        final int i3 = 10;
        this.f143057g = new w4l.f(new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i;
                g gVar = this.f143052b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i6 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i6, new m(vVar, i6)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new d(this, 5), new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i2;
                g gVar = this.f143052b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i6 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i6, new m(vVar, i6)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new d(this, 7), new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i3;
                g gVar = this.f143052b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i6 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i6, new m(vVar, i6)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 11;
        final int i6 = 12;
        this.f143058h = new w4l.f(new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i5;
                g gVar = this.f143052b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new d(this, 8), new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i6;
                g gVar = this.f143052b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i21 = 13;
        Function2 function2 = new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i21;
                g gVar = this.f143052b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        d dVar = new d(this, 9);
        final int i22 = 1;
        Function2 function22 = new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i22;
                g gVar = this.f143052b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        };
        d dVar2 = new d(this, i22);
        final int i32 = 2;
        this.i = new w4l.f(function2, dVar, function22, dVar2, new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i59 = i32;
                g gVar = this.f143052b;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i33 = 3;
        final int i43 = 4;
        final int i59 = 5;
        this.f143059j = new w4l.f(new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i592 = i33;
                g gVar = this.f143052b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new d(this, 2), new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i592 = i43;
                g gVar = this.f143052b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new d(this, 3), new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i592 = i59;
                g gVar = this.f143052b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i66 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i66, new m(vVar, i66)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i66 = 6;
        final int i74 = 7;
        final int i92 = 8;
        this.k = new w4l.f(new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i592 = i66;
                g gVar = this.f143052b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i662 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i662, new m(vVar, i662)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new d(this, 4), new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i592 = i74;
                g gVar = this.f143052b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i662 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i662, new m(vVar, i662)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, new d(this, 6), new Function2(this) { // from class: gd3.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f143052b;

            {
                this.f143052b = this;
            }

            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i592 = i92;
                g gVar = this.f143052b;
                switch (i592) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        v vVar = (v) gVar.f143056c;
                        AccountId.Personal accountId = AccountId.Personal.f51414a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        int i662 = 0;
                        pfm.a aVar = new pfm.a(vVar.c(accountId), new n(i662, new m(vVar, i662)), 4);
                        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                        ufm.i iVar = new ufm.i(aVar.f(gVar.f143054a.getCashbackBoxes()), new g9j.v(new d(gVar, 0), 17), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        CashbackBySources cashbackBySources = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_SOURCES", cashbackBySources);
                        return Unit.f186387a;
                    case 2:
                        CashbackBySources cashbackBySources2 = (CashbackBySources) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "cashbackBySources");
                        ue0.c cVar = gVar.d;
                        Object obj4 = cd3.a.f23165a;
                        Intrinsics.checkNotNullParameter(cashbackBySources2, "<this>");
                        jo3.b bVarA = hx7.a.A(cashbackBySources2.f65685a);
                        ArrayList<CashbackSource> arrayList = cashbackBySources2.f65686b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        for (CashbackSource cashbackSource : arrayList) {
                            arrayList2.add(new wc3.e(u1.g(cashbackSource.f65689b, cd3.a.f23165a), hx7.a.A(cashbackSource.f65688a), cashbackSource.f65690c));
                        }
                        cVar.G(new wc3.c(arrayList2, bVarA), "STORAGE_KEY_CASHBACK_BY_SOURCES", z.d(o0.b(wc3.c.class)));
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<fd3.b> totalCashbackByCurrencies = gVar.f143055b.getTotalCashbackByCurrencies();
                        g9j.v vVar2 = new g9j.v(new l(28), 21);
                        totalCashbackByCurrencies.getClass();
                        ufm.i iVar2 = new ufm.i(totalCashbackByCurrencies, vVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        CashbackByCurrencies cashbackByCurrencies = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies, "cashbackByCurrencies");
                        gVar.e.f("MEMORY_KEY_CASHBACK_BY_CURRENCIES", cashbackByCurrencies);
                        return Unit.f186387a;
                    case 5:
                        CashbackByCurrencies cashbackByCurrencies2 = (CashbackByCurrencies) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "cashbackByCurrencies");
                        ue0.c cVar2 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackByCurrencies2, "<this>");
                        ArrayList arrayList3 = cashbackByCurrencies2.f65684a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it10 = arrayList3.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(hx7.a.A((dj0.d) it10.next()));
                        }
                        cVar2.G(new wc3.b(arrayList4), "STORAGE_KEY_CASHBACK_BY_CURRENCIES", z.d(o0.b(wc3.b.class)));
                        return Unit.f186387a;
                    case 6:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it11 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it11, "it");
                        d0<fd3.e> cashbackCurrency = gVar.f143055b.getCashbackCurrency();
                        g9j.v vVar3 = new g9j.v(new l(29), 22);
                        cashbackCurrency.getClass();
                        ufm.i iVar3 = new ufm.i(cashbackCurrency, vVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 7:
                        CashbackCurrency cashbackCurrency2 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency2, "cashbackCurrency");
                        gVar.e.f("MEMORY_KEY_CASHBACK_CURRENCY", cashbackCurrency2);
                        return Unit.f186387a;
                    case 8:
                        CashbackCurrency cashbackCurrency3 = (CashbackCurrency) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "cashbackCurrency");
                        ue0.c cVar3 = gVar.d;
                        Intrinsics.checkNotNullParameter(cashbackCurrency3, "<this>");
                        xi0.b bVar = cashbackCurrency3.f65687a;
                        cVar3.G(new wc3.d(bVar != null ? bVar.f306286a : null), "STORAGE_KEY_CASHBACK_CURRENCY", z.d(o0.b(wc3.d.class)));
                        return Unit.f186387a;
                    case 9:
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        gVar.e.f("MEMORY_KEY_CASHBACK", list);
                        return Unit.f186387a;
                    case 10:
                        List cashbackBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cashbackBoxes, "cashbackBoxes");
                        ue0.c cVar4 = gVar.d;
                        List<uc3.a> list2 = cashbackBoxes;
                        ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
                        for (uc3.a aVar2 : list2) {
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList5.add(new wc3.a(aVar2.f278973a, aVar2.f278974b.f163145a));
                        }
                        cVar4.G(arrayList5, "STORAGE_KEY_CASHBACK_BOXES", kii.e.o(wc3.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        Unit it12 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it12, "it");
                        d0<fd3.f> cashbackLimit = gVar.f143054a.getCashbackLimit();
                        g9j.v vVar4 = new g9j.v(new l(26), 19);
                        cashbackLimit.getClass();
                        ufm.i iVar4 = new ufm.i(new ufm.i(cashbackLimit, vVar4, 1), new g9j.v(new l(27), 20), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
                        return iVar4;
                    case 12:
                        uc3.c limit = (uc3.c) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        gVar.e.f("MEMORY_KEY_CASHBACK_LIMIT", limit);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<fd3.c> totalCashbackBySources = gVar.f143055b.getTotalCashbackBySources(true);
                        g9j.v vVar5 = new g9j.v(new l(25), 18);
                        totalCashbackBySources.getClass();
                        ufm.i iVar5 = new ufm.i(totalCashbackBySources, vVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
