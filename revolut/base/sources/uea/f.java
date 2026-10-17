package uea;

import com.revolut.feature.pockets.impl.network.PocketDetailsService;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import nd.l;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tx0.g4;
import ud3.m;
import ufm.i;
import w4l.k;
import wim.z;
import xda.u;
import xda.y;
import zda.a0;
import zda.o;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketDetailsService f279325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f279326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uda.a f279327c;
    public final ue0.c d;
    public final l e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f279328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f279329h;

    public f(PocketDetailsService pocketDetailsService, j memoryCache, uda.a mapper, ue0.c storage, l currencyAccountMapper) {
        Intrinsics.checkNotNullParameter(pocketDetailsService, "pocketDetailsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(currencyAccountMapper, "currencyAccountMapper");
        this.f279325a = pocketDetailsService;
        this.f279326b = memoryCache;
        this.f279327c = mapper;
        this.d = storage;
        this.e = currencyAccountMapper;
        final int i = 3;
        Function2 function2 = new Function2(this) { // from class: uea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279319b;

            {
                this.f279319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a0 a0Var;
                String str;
                int i2;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        yda.a requestParams = (yda.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
                        f fVar = this.f279319b;
                        d0<List<yda.d>> allAccountsDetails = fVar.f279325a.getAllAccountsDetails(requestParams.f312666a, requestParams.f312667b.name());
                        ubj.c cVar = new ubj.c(13, new m(fVar, 20));
                        allAccountsDetails.getClass();
                        i iVar = new i(allAccountsDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        yda.a params = (yda.a) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar.f(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"), value);
                        return Unit.f186387a;
                    case 2:
                        yda.a params2 = (yda.a) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        f fVar2 = this.f279319b;
                        ue0.c cVar2 = fVar2.d;
                        f.Companion.getClass();
                        String strB = c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY");
                        List<mda.c> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (mda.c currencyAccountInfo : list) {
                            Intrinsics.checkNotNullParameter(currencyAccountInfo, "currencyAccountInfo");
                            if (currencyAccountInfo instanceof mda.a) {
                                mda.a aVar = (mda.a) currencyAccountInfo;
                                a0Var = new a0(aVar.f204549a.f306286a, aVar.f204550b.f297794a, null);
                            } else {
                                if (!(currencyAccountInfo instanceof mda.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mda.b bVar = (mda.b) currencyAccountInfo;
                                a0Var = new a0(bVar.f204551a.f306286a, bVar.f204552b.f297794a, uda.a.c(bVar.f204553c));
                            }
                            arrayList.add(a0Var);
                        }
                        cVar2.G(arrayList, strB, kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                        String str2 = params2.f312666a;
                        io3.l lVar = params2.f312667b;
                        ArrayList<mda.b> arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof mda.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        for (mda.b bVar2 : arrayList2) {
                            xi0.b bVar3 = bVar2.f204551a;
                            dda.a aVar2 = bVar2.f204553c;
                            y yVar = new y(str2, bVar3, lVar, io3.i.INTERNAL, null, bVar2.f204552b);
                            f.Companion.getClass();
                            o oVar = (o) j6.a.k(o.class, cVar2, c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"));
                            if (!aVar2.equals(oVar != null ? uda.a.b(oVar) : null)) {
                                cVar2.G(uda.a.c(aVar2), c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                                fVar2.f.k(yVar, aVar2);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        y requestParams2 = (y) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
                        f fVar3 = this.f279319b;
                        PocketDetailsService pocketDetailsService2 = fVar3.f279325a;
                        String str3 = requestParams2.f304377a;
                        String str4 = requestParams2.f304378b.f306286a;
                        io3.i iVar2 = requestParams2.d;
                        String strName = iVar2 == io3.i.EXTERNAL ? iVar2.name() : requestParams2.f304379c.name();
                        String str5 = requestParams2.e;
                        wi0.b bVar4 = requestParams2.f;
                        d0<u> accountDetails = pocketDetailsService2.getAccountDetails(str3, str4, strName, str5, bVar4 != null ? bVar4.f297794a : null);
                        ubj.c cVar3 = new ubj.c(12, new g4(1, fVar3.f279327c, uda.a.class, "toDomain", "toDomain(Lcom/revolut/feature/pockets/impl/details_v2/dto/AccountDetailsDto;)Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetails;", 0, 12));
                        accountDetails.getClass();
                        i iVar3 = new i(accountDetails, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f279319b.f279326b.f("SWITCH_ACCOUNT_BANNER_MEMORY_KEY", bool);
                        return Unit.f186387a;
                    case 5:
                        y params3 = (y) obj2;
                        dda.a value3 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        j jVar2 = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar2.f(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"), value3);
                        return Unit.f186387a;
                    default:
                        y params4 = (y) obj2;
                        dda.a value4 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        f fVar4 = this.f279319b;
                        ue0.c cVar4 = fVar4.d;
                        f.Companion.getClass();
                        cVar4.G(uda.a.c(value4), c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                        if (params4.d != io3.i.EXTERNAL) {
                            yda.a aVar3 = new yda.a(params4.f304377a, params4.f304379c);
                            List list2 = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar4, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                o oVarC = uda.a.c(value4);
                                zda.i iVar4 = (zda.i) zhm.d0.d0(oVarC.f321402a);
                                if (iVar4 != null && (str = iVar4.f321384b) != null) {
                                    List<a0> list4 = list2;
                                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                                        i2 = 0;
                                    } else {
                                        Iterator it8 = list4.iterator();
                                        i2 = 0;
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((a0) it8.next()).f321357a, str) && (i2 = i2 + 1) < 0) {
                                                v.r();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z = i2 > 1;
                                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                                    boolean z3 = false;
                                    for (a0 info : list4) {
                                        String str6 = info.f321357a;
                                        String country = info.f321358b;
                                        if (Intrinsics.f(str6, str) && !Intrinsics.f(info.f321359c, oVarC)) {
                                            Intrinsics.checkNotNullParameter(info, "info");
                                            if (!z || Intrinsics.f(country, oVarC.f321403b.f321425b)) {
                                                String currency = info.f321357a;
                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                Intrinsics.checkNotNullParameter(country, "country");
                                                info = new a0(currency, country, oVarC);
                                                z3 = true;
                                            }
                                        }
                                        arrayList3.add(info);
                                    }
                                    if (z3) {
                                        f.Companion.getClass();
                                        cVar4.G(arrayList3, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"), kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                                        w4l.f fVar5 = fVar4.f279328g;
                                        l lVar2 = fVar4.e;
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(lVar2.e((a0) it9.next()));
                                        }
                                        fVar5.k(aVar3, arrayList4);
                                    }
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: uea.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279321b;

            {
                this.f279321b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                ArrayList arrayList = null;
                f fVar = this.f279321b;
                switch (i2) {
                    case 0:
                        yda.a params = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = fVar.f279326b;
                        f.Companion.getClass();
                        return (List) jVar.get(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"));
                    case 1:
                        yda.a params2 = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ue0.c cVar = fVar.d;
                        f.Companion.getClass();
                        List list = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar, c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(fVar.e.e((a0) it8.next()));
                            }
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (Boolean) fVar.f279326b.get("SWITCH_ACCOUNT_BANNER_MEMORY_KEY");
                    case 3:
                        y params3 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar2 = fVar.f279326b;
                        f.Companion.getClass();
                        return (dda.a) jVar2.get(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"));
                    default:
                        y params4 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        try {
                            ue0.c cVar2 = fVar.d;
                            f.Companion.getClass();
                            o oVar = (o) cVar2.T2(c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                            if (oVar != null) {
                                return uda.a.b(oVar);
                            }
                            return null;
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                }
            }
        };
        final int i2 = 5;
        Function2 function22 = new Function2(this) { // from class: uea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279319b;

            {
                this.f279319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a0 a0Var;
                String str;
                int i22;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        yda.a requestParams = (yda.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
                        f fVar = this.f279319b;
                        d0<List<yda.d>> allAccountsDetails = fVar.f279325a.getAllAccountsDetails(requestParams.f312666a, requestParams.f312667b.name());
                        ubj.c cVar = new ubj.c(13, new m(fVar, 20));
                        allAccountsDetails.getClass();
                        i iVar = new i(allAccountsDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        yda.a params = (yda.a) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar.f(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"), value);
                        return Unit.f186387a;
                    case 2:
                        yda.a params2 = (yda.a) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        f fVar2 = this.f279319b;
                        ue0.c cVar2 = fVar2.d;
                        f.Companion.getClass();
                        String strB = c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY");
                        List<mda.c> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (mda.c currencyAccountInfo : list) {
                            Intrinsics.checkNotNullParameter(currencyAccountInfo, "currencyAccountInfo");
                            if (currencyAccountInfo instanceof mda.a) {
                                mda.a aVar = (mda.a) currencyAccountInfo;
                                a0Var = new a0(aVar.f204549a.f306286a, aVar.f204550b.f297794a, null);
                            } else {
                                if (!(currencyAccountInfo instanceof mda.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mda.b bVar = (mda.b) currencyAccountInfo;
                                a0Var = new a0(bVar.f204551a.f306286a, bVar.f204552b.f297794a, uda.a.c(bVar.f204553c));
                            }
                            arrayList.add(a0Var);
                        }
                        cVar2.G(arrayList, strB, kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                        String str2 = params2.f312666a;
                        io3.l lVar = params2.f312667b;
                        ArrayList<mda.b> arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof mda.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        for (mda.b bVar2 : arrayList2) {
                            xi0.b bVar3 = bVar2.f204551a;
                            dda.a aVar2 = bVar2.f204553c;
                            y yVar = new y(str2, bVar3, lVar, io3.i.INTERNAL, null, bVar2.f204552b);
                            f.Companion.getClass();
                            o oVar = (o) j6.a.k(o.class, cVar2, c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"));
                            if (!aVar2.equals(oVar != null ? uda.a.b(oVar) : null)) {
                                cVar2.G(uda.a.c(aVar2), c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                                fVar2.f.k(yVar, aVar2);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        y requestParams2 = (y) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
                        f fVar3 = this.f279319b;
                        PocketDetailsService pocketDetailsService2 = fVar3.f279325a;
                        String str3 = requestParams2.f304377a;
                        String str4 = requestParams2.f304378b.f306286a;
                        io3.i iVar2 = requestParams2.d;
                        String strName = iVar2 == io3.i.EXTERNAL ? iVar2.name() : requestParams2.f304379c.name();
                        String str5 = requestParams2.e;
                        wi0.b bVar4 = requestParams2.f;
                        d0<u> accountDetails = pocketDetailsService2.getAccountDetails(str3, str4, strName, str5, bVar4 != null ? bVar4.f297794a : null);
                        ubj.c cVar3 = new ubj.c(12, new g4(1, fVar3.f279327c, uda.a.class, "toDomain", "toDomain(Lcom/revolut/feature/pockets/impl/details_v2/dto/AccountDetailsDto;)Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetails;", 0, 12));
                        accountDetails.getClass();
                        i iVar3 = new i(accountDetails, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f279319b.f279326b.f("SWITCH_ACCOUNT_BANNER_MEMORY_KEY", bool);
                        return Unit.f186387a;
                    case 5:
                        y params3 = (y) obj2;
                        dda.a value3 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        j jVar2 = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar2.f(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"), value3);
                        return Unit.f186387a;
                    default:
                        y params4 = (y) obj2;
                        dda.a value4 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        f fVar4 = this.f279319b;
                        ue0.c cVar4 = fVar4.d;
                        f.Companion.getClass();
                        cVar4.G(uda.a.c(value4), c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                        if (params4.d != io3.i.EXTERNAL) {
                            yda.a aVar3 = new yda.a(params4.f304377a, params4.f304379c);
                            List list2 = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar4, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                o oVarC = uda.a.c(value4);
                                zda.i iVar4 = (zda.i) zhm.d0.d0(oVarC.f321402a);
                                if (iVar4 != null && (str = iVar4.f321384b) != null) {
                                    List<a0> list4 = list2;
                                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                                        i22 = 0;
                                    } else {
                                        Iterator it8 = list4.iterator();
                                        i22 = 0;
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((a0) it8.next()).f321357a, str) && (i22 = i22 + 1) < 0) {
                                                v.r();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z = i22 > 1;
                                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                                    boolean z3 = false;
                                    for (a0 info : list4) {
                                        String str6 = info.f321357a;
                                        String country = info.f321358b;
                                        if (Intrinsics.f(str6, str) && !Intrinsics.f(info.f321359c, oVarC)) {
                                            Intrinsics.checkNotNullParameter(info, "info");
                                            if (!z || Intrinsics.f(country, oVarC.f321403b.f321425b)) {
                                                String currency = info.f321357a;
                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                Intrinsics.checkNotNullParameter(country, "country");
                                                info = new a0(currency, country, oVarC);
                                                z3 = true;
                                            }
                                        }
                                        arrayList3.add(info);
                                    }
                                    if (z3) {
                                        f.Companion.getClass();
                                        cVar4.G(arrayList3, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"), kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                                        w4l.f fVar5 = fVar4.f279328g;
                                        l lVar2 = fVar4.e;
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(lVar2.e((a0) it9.next()));
                                        }
                                        fVar5.k(aVar3, arrayList4);
                                    }
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 4;
        Function1 function12 = new Function1(this) { // from class: uea.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279321b;

            {
                this.f279321b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                ArrayList arrayList = null;
                f fVar = this.f279321b;
                switch (i22) {
                    case 0:
                        yda.a params = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = fVar.f279326b;
                        f.Companion.getClass();
                        return (List) jVar.get(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"));
                    case 1:
                        yda.a params2 = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ue0.c cVar = fVar.d;
                        f.Companion.getClass();
                        List list = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar, c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(fVar.e.e((a0) it8.next()));
                            }
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (Boolean) fVar.f279326b.get("SWITCH_ACCOUNT_BANNER_MEMORY_KEY");
                    case 3:
                        y params3 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar2 = fVar.f279326b;
                        f.Companion.getClass();
                        return (dda.a) jVar2.get(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"));
                    default:
                        y params4 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        try {
                            ue0.c cVar2 = fVar.d;
                            f.Companion.getClass();
                            o oVar = (o) cVar2.T2(c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                            if (oVar != null) {
                                return uda.a.b(oVar);
                            }
                            return null;
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                }
            }
        };
        final int i5 = 6;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: uea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279319b;

            {
                this.f279319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a0 a0Var;
                String str;
                int i22;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        yda.a requestParams = (yda.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
                        f fVar = this.f279319b;
                        d0<List<yda.d>> allAccountsDetails = fVar.f279325a.getAllAccountsDetails(requestParams.f312666a, requestParams.f312667b.name());
                        ubj.c cVar = new ubj.c(13, new m(fVar, 20));
                        allAccountsDetails.getClass();
                        i iVar = new i(allAccountsDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        yda.a params = (yda.a) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar.f(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"), value);
                        return Unit.f186387a;
                    case 2:
                        yda.a params2 = (yda.a) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        f fVar2 = this.f279319b;
                        ue0.c cVar2 = fVar2.d;
                        f.Companion.getClass();
                        String strB = c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY");
                        List<mda.c> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (mda.c currencyAccountInfo : list) {
                            Intrinsics.checkNotNullParameter(currencyAccountInfo, "currencyAccountInfo");
                            if (currencyAccountInfo instanceof mda.a) {
                                mda.a aVar = (mda.a) currencyAccountInfo;
                                a0Var = new a0(aVar.f204549a.f306286a, aVar.f204550b.f297794a, null);
                            } else {
                                if (!(currencyAccountInfo instanceof mda.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mda.b bVar = (mda.b) currencyAccountInfo;
                                a0Var = new a0(bVar.f204551a.f306286a, bVar.f204552b.f297794a, uda.a.c(bVar.f204553c));
                            }
                            arrayList.add(a0Var);
                        }
                        cVar2.G(arrayList, strB, kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                        String str2 = params2.f312666a;
                        io3.l lVar = params2.f312667b;
                        ArrayList<mda.b> arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof mda.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        for (mda.b bVar2 : arrayList2) {
                            xi0.b bVar3 = bVar2.f204551a;
                            dda.a aVar2 = bVar2.f204553c;
                            y yVar = new y(str2, bVar3, lVar, io3.i.INTERNAL, null, bVar2.f204552b);
                            f.Companion.getClass();
                            o oVar = (o) j6.a.k(o.class, cVar2, c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"));
                            if (!aVar2.equals(oVar != null ? uda.a.b(oVar) : null)) {
                                cVar2.G(uda.a.c(aVar2), c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                                fVar2.f.k(yVar, aVar2);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        y requestParams2 = (y) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
                        f fVar3 = this.f279319b;
                        PocketDetailsService pocketDetailsService2 = fVar3.f279325a;
                        String str3 = requestParams2.f304377a;
                        String str4 = requestParams2.f304378b.f306286a;
                        io3.i iVar2 = requestParams2.d;
                        String strName = iVar2 == io3.i.EXTERNAL ? iVar2.name() : requestParams2.f304379c.name();
                        String str5 = requestParams2.e;
                        wi0.b bVar4 = requestParams2.f;
                        d0<u> accountDetails = pocketDetailsService2.getAccountDetails(str3, str4, strName, str5, bVar4 != null ? bVar4.f297794a : null);
                        ubj.c cVar3 = new ubj.c(12, new g4(1, fVar3.f279327c, uda.a.class, "toDomain", "toDomain(Lcom/revolut/feature/pockets/impl/details_v2/dto/AccountDetailsDto;)Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetails;", 0, 12));
                        accountDetails.getClass();
                        i iVar3 = new i(accountDetails, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f279319b.f279326b.f("SWITCH_ACCOUNT_BANNER_MEMORY_KEY", bool);
                        return Unit.f186387a;
                    case 5:
                        y params3 = (y) obj2;
                        dda.a value3 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        j jVar2 = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar2.f(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"), value3);
                        return Unit.f186387a;
                    default:
                        y params4 = (y) obj2;
                        dda.a value4 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        f fVar4 = this.f279319b;
                        ue0.c cVar4 = fVar4.d;
                        f.Companion.getClass();
                        cVar4.G(uda.a.c(value4), c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                        if (params4.d != io3.i.EXTERNAL) {
                            yda.a aVar3 = new yda.a(params4.f304377a, params4.f304379c);
                            List list2 = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar4, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                o oVarC = uda.a.c(value4);
                                zda.i iVar4 = (zda.i) zhm.d0.d0(oVarC.f321402a);
                                if (iVar4 != null && (str = iVar4.f321384b) != null) {
                                    List<a0> list4 = list2;
                                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                                        i22 = 0;
                                    } else {
                                        Iterator it8 = list4.iterator();
                                        i22 = 0;
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((a0) it8.next()).f321357a, str) && (i22 = i22 + 1) < 0) {
                                                v.r();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z = i22 > 1;
                                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                                    boolean z3 = false;
                                    for (a0 info : list4) {
                                        String str6 = info.f321357a;
                                        String country = info.f321358b;
                                        if (Intrinsics.f(str6, str) && !Intrinsics.f(info.f321359c, oVarC)) {
                                            Intrinsics.checkNotNullParameter(info, "info");
                                            if (!z || Intrinsics.f(country, oVarC.f321403b.f321425b)) {
                                                String currency = info.f321357a;
                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                Intrinsics.checkNotNullParameter(country, "country");
                                                info = new a0(currency, country, oVarC);
                                                z3 = true;
                                            }
                                        }
                                        arrayList3.add(info);
                                    }
                                    if (z3) {
                                        f.Companion.getClass();
                                        cVar4.G(arrayList3, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"), kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                                        w4l.f fVar5 = fVar4.f279328g;
                                        l lVar2 = fVar4.e;
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(lVar2.e((a0) it9.next()));
                                        }
                                        fVar5.k(aVar3, arrayList4);
                                    }
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 0;
        Function2 function23 = new Function2(this) { // from class: uea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279319b;

            {
                this.f279319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a0 a0Var;
                String str;
                int i22;
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        yda.a requestParams = (yda.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
                        f fVar = this.f279319b;
                        d0<List<yda.d>> allAccountsDetails = fVar.f279325a.getAllAccountsDetails(requestParams.f312666a, requestParams.f312667b.name());
                        ubj.c cVar = new ubj.c(13, new m(fVar, 20));
                        allAccountsDetails.getClass();
                        i iVar = new i(allAccountsDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        yda.a params = (yda.a) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar.f(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"), value);
                        return Unit.f186387a;
                    case 2:
                        yda.a params2 = (yda.a) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        f fVar2 = this.f279319b;
                        ue0.c cVar2 = fVar2.d;
                        f.Companion.getClass();
                        String strB = c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY");
                        List<mda.c> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (mda.c currencyAccountInfo : list) {
                            Intrinsics.checkNotNullParameter(currencyAccountInfo, "currencyAccountInfo");
                            if (currencyAccountInfo instanceof mda.a) {
                                mda.a aVar = (mda.a) currencyAccountInfo;
                                a0Var = new a0(aVar.f204549a.f306286a, aVar.f204550b.f297794a, null);
                            } else {
                                if (!(currencyAccountInfo instanceof mda.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mda.b bVar = (mda.b) currencyAccountInfo;
                                a0Var = new a0(bVar.f204551a.f306286a, bVar.f204552b.f297794a, uda.a.c(bVar.f204553c));
                            }
                            arrayList.add(a0Var);
                        }
                        cVar2.G(arrayList, strB, kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                        String str2 = params2.f312666a;
                        io3.l lVar = params2.f312667b;
                        ArrayList<mda.b> arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof mda.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        for (mda.b bVar2 : arrayList2) {
                            xi0.b bVar3 = bVar2.f204551a;
                            dda.a aVar2 = bVar2.f204553c;
                            y yVar = new y(str2, bVar3, lVar, io3.i.INTERNAL, null, bVar2.f204552b);
                            f.Companion.getClass();
                            o oVar = (o) j6.a.k(o.class, cVar2, c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"));
                            if (!aVar2.equals(oVar != null ? uda.a.b(oVar) : null)) {
                                cVar2.G(uda.a.c(aVar2), c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                                fVar2.f.k(yVar, aVar2);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        y requestParams2 = (y) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
                        f fVar3 = this.f279319b;
                        PocketDetailsService pocketDetailsService2 = fVar3.f279325a;
                        String str3 = requestParams2.f304377a;
                        String str4 = requestParams2.f304378b.f306286a;
                        io3.i iVar2 = requestParams2.d;
                        String strName = iVar2 == io3.i.EXTERNAL ? iVar2.name() : requestParams2.f304379c.name();
                        String str5 = requestParams2.e;
                        wi0.b bVar4 = requestParams2.f;
                        d0<u> accountDetails = pocketDetailsService2.getAccountDetails(str3, str4, strName, str5, bVar4 != null ? bVar4.f297794a : null);
                        ubj.c cVar3 = new ubj.c(12, new g4(1, fVar3.f279327c, uda.a.class, "toDomain", "toDomain(Lcom/revolut/feature/pockets/impl/details_v2/dto/AccountDetailsDto;)Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetails;", 0, 12));
                        accountDetails.getClass();
                        i iVar3 = new i(accountDetails, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f279319b.f279326b.f("SWITCH_ACCOUNT_BANNER_MEMORY_KEY", bool);
                        return Unit.f186387a;
                    case 5:
                        y params3 = (y) obj2;
                        dda.a value3 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        j jVar2 = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar2.f(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"), value3);
                        return Unit.f186387a;
                    default:
                        y params4 = (y) obj2;
                        dda.a value4 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        f fVar4 = this.f279319b;
                        ue0.c cVar4 = fVar4.d;
                        f.Companion.getClass();
                        cVar4.G(uda.a.c(value4), c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                        if (params4.d != io3.i.EXTERNAL) {
                            yda.a aVar3 = new yda.a(params4.f304377a, params4.f304379c);
                            List list2 = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar4, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                o oVarC = uda.a.c(value4);
                                zda.i iVar4 = (zda.i) zhm.d0.d0(oVarC.f321402a);
                                if (iVar4 != null && (str = iVar4.f321384b) != null) {
                                    List<a0> list4 = list2;
                                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                                        i22 = 0;
                                    } else {
                                        Iterator it8 = list4.iterator();
                                        i22 = 0;
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((a0) it8.next()).f321357a, str) && (i22 = i22 + 1) < 0) {
                                                v.r();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z = i22 > 1;
                                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                                    boolean z3 = false;
                                    for (a0 info : list4) {
                                        String str6 = info.f321357a;
                                        String country = info.f321358b;
                                        if (Intrinsics.f(str6, str) && !Intrinsics.f(info.f321359c, oVarC)) {
                                            Intrinsics.checkNotNullParameter(info, "info");
                                            if (!z || Intrinsics.f(country, oVarC.f321403b.f321425b)) {
                                                String currency = info.f321357a;
                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                Intrinsics.checkNotNullParameter(country, "country");
                                                info = new a0(currency, country, oVarC);
                                                z3 = true;
                                            }
                                        }
                                        arrayList3.add(info);
                                    }
                                    if (z3) {
                                        f.Companion.getClass();
                                        cVar4.G(arrayList3, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"), kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                                        w4l.f fVar5 = fVar4.f279328g;
                                        l lVar2 = fVar4.e;
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(lVar2.e((a0) it9.next()));
                                        }
                                        fVar5.k(aVar3, arrayList4);
                                    }
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function13 = new Function1(this) { // from class: uea.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279321b;

            {
                this.f279321b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i6;
                ArrayList arrayList = null;
                f fVar = this.f279321b;
                switch (i22) {
                    case 0:
                        yda.a params = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = fVar.f279326b;
                        f.Companion.getClass();
                        return (List) jVar.get(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"));
                    case 1:
                        yda.a params2 = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ue0.c cVar = fVar.d;
                        f.Companion.getClass();
                        List list = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar, c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(fVar.e.e((a0) it8.next()));
                            }
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (Boolean) fVar.f279326b.get("SWITCH_ACCOUNT_BANNER_MEMORY_KEY");
                    case 3:
                        y params3 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar2 = fVar.f279326b;
                        f.Companion.getClass();
                        return (dda.a) jVar2.get(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"));
                    default:
                        y params4 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        try {
                            ue0.c cVar2 = fVar.d;
                            f.Companion.getClass();
                            o oVar = (o) cVar2.T2(c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                            if (oVar != null) {
                                return uda.a.b(oVar);
                            }
                            return null;
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                }
            }
        };
        final int i21 = 1;
        Function2 function24 = new Function2(this) { // from class: uea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279319b;

            {
                this.f279319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a0 a0Var;
                String str;
                int i22;
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        yda.a requestParams = (yda.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
                        f fVar = this.f279319b;
                        d0<List<yda.d>> allAccountsDetails = fVar.f279325a.getAllAccountsDetails(requestParams.f312666a, requestParams.f312667b.name());
                        ubj.c cVar = new ubj.c(13, new m(fVar, 20));
                        allAccountsDetails.getClass();
                        i iVar = new i(allAccountsDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        yda.a params = (yda.a) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar.f(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"), value);
                        return Unit.f186387a;
                    case 2:
                        yda.a params2 = (yda.a) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        f fVar2 = this.f279319b;
                        ue0.c cVar2 = fVar2.d;
                        f.Companion.getClass();
                        String strB = c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY");
                        List<mda.c> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (mda.c currencyAccountInfo : list) {
                            Intrinsics.checkNotNullParameter(currencyAccountInfo, "currencyAccountInfo");
                            if (currencyAccountInfo instanceof mda.a) {
                                mda.a aVar = (mda.a) currencyAccountInfo;
                                a0Var = new a0(aVar.f204549a.f306286a, aVar.f204550b.f297794a, null);
                            } else {
                                if (!(currencyAccountInfo instanceof mda.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mda.b bVar = (mda.b) currencyAccountInfo;
                                a0Var = new a0(bVar.f204551a.f306286a, bVar.f204552b.f297794a, uda.a.c(bVar.f204553c));
                            }
                            arrayList.add(a0Var);
                        }
                        cVar2.G(arrayList, strB, kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                        String str2 = params2.f312666a;
                        io3.l lVar = params2.f312667b;
                        ArrayList<mda.b> arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof mda.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        for (mda.b bVar2 : arrayList2) {
                            xi0.b bVar3 = bVar2.f204551a;
                            dda.a aVar2 = bVar2.f204553c;
                            y yVar = new y(str2, bVar3, lVar, io3.i.INTERNAL, null, bVar2.f204552b);
                            f.Companion.getClass();
                            o oVar = (o) j6.a.k(o.class, cVar2, c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"));
                            if (!aVar2.equals(oVar != null ? uda.a.b(oVar) : null)) {
                                cVar2.G(uda.a.c(aVar2), c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                                fVar2.f.k(yVar, aVar2);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        y requestParams2 = (y) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
                        f fVar3 = this.f279319b;
                        PocketDetailsService pocketDetailsService2 = fVar3.f279325a;
                        String str3 = requestParams2.f304377a;
                        String str4 = requestParams2.f304378b.f306286a;
                        io3.i iVar2 = requestParams2.d;
                        String strName = iVar2 == io3.i.EXTERNAL ? iVar2.name() : requestParams2.f304379c.name();
                        String str5 = requestParams2.e;
                        wi0.b bVar4 = requestParams2.f;
                        d0<u> accountDetails = pocketDetailsService2.getAccountDetails(str3, str4, strName, str5, bVar4 != null ? bVar4.f297794a : null);
                        ubj.c cVar3 = new ubj.c(12, new g4(1, fVar3.f279327c, uda.a.class, "toDomain", "toDomain(Lcom/revolut/feature/pockets/impl/details_v2/dto/AccountDetailsDto;)Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetails;", 0, 12));
                        accountDetails.getClass();
                        i iVar3 = new i(accountDetails, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f279319b.f279326b.f("SWITCH_ACCOUNT_BANNER_MEMORY_KEY", bool);
                        return Unit.f186387a;
                    case 5:
                        y params3 = (y) obj2;
                        dda.a value3 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        j jVar2 = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar2.f(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"), value3);
                        return Unit.f186387a;
                    default:
                        y params4 = (y) obj2;
                        dda.a value4 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        f fVar4 = this.f279319b;
                        ue0.c cVar4 = fVar4.d;
                        f.Companion.getClass();
                        cVar4.G(uda.a.c(value4), c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                        if (params4.d != io3.i.EXTERNAL) {
                            yda.a aVar3 = new yda.a(params4.f304377a, params4.f304379c);
                            List list2 = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar4, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                o oVarC = uda.a.c(value4);
                                zda.i iVar4 = (zda.i) zhm.d0.d0(oVarC.f321402a);
                                if (iVar4 != null && (str = iVar4.f321384b) != null) {
                                    List<a0> list4 = list2;
                                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                                        i22 = 0;
                                    } else {
                                        Iterator it8 = list4.iterator();
                                        i22 = 0;
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((a0) it8.next()).f321357a, str) && (i22 = i22 + 1) < 0) {
                                                v.r();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z = i22 > 1;
                                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                                    boolean z3 = false;
                                    for (a0 info : list4) {
                                        String str6 = info.f321357a;
                                        String country = info.f321358b;
                                        if (Intrinsics.f(str6, str) && !Intrinsics.f(info.f321359c, oVarC)) {
                                            Intrinsics.checkNotNullParameter(info, "info");
                                            if (!z || Intrinsics.f(country, oVarC.f321403b.f321425b)) {
                                                String currency = info.f321357a;
                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                Intrinsics.checkNotNullParameter(country, "country");
                                                info = new a0(currency, country, oVarC);
                                                z3 = true;
                                            }
                                        }
                                        arrayList3.add(info);
                                    }
                                    if (z3) {
                                        f.Companion.getClass();
                                        cVar4.G(arrayList3, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"), kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                                        w4l.f fVar5 = fVar4.f279328g;
                                        l lVar2 = fVar4.e;
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(lVar2.e((a0) it9.next()));
                                        }
                                        fVar5.k(aVar3, arrayList4);
                                    }
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Function1 function14 = new Function1(this) { // from class: uea.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279321b;

            {
                this.f279321b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i21;
                ArrayList arrayList = null;
                f fVar = this.f279321b;
                switch (i22) {
                    case 0:
                        yda.a params = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = fVar.f279326b;
                        f.Companion.getClass();
                        return (List) jVar.get(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"));
                    case 1:
                        yda.a params2 = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ue0.c cVar = fVar.d;
                        f.Companion.getClass();
                        List list = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar, c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(fVar.e.e((a0) it8.next()));
                            }
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (Boolean) fVar.f279326b.get("SWITCH_ACCOUNT_BANNER_MEMORY_KEY");
                    case 3:
                        y params3 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar2 = fVar.f279326b;
                        f.Companion.getClass();
                        return (dda.a) jVar2.get(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"));
                    default:
                        y params4 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        try {
                            ue0.c cVar2 = fVar.d;
                            f.Companion.getClass();
                            o oVar = (o) cVar2.T2(c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                            if (oVar != null) {
                                return uda.a.b(oVar);
                            }
                            return null;
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                }
            }
        };
        final int i22 = 2;
        this.f279328g = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: uea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279319b;

            {
                this.f279319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a0 a0Var;
                String str;
                int i222;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        yda.a requestParams = (yda.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
                        f fVar = this.f279319b;
                        d0<List<yda.d>> allAccountsDetails = fVar.f279325a.getAllAccountsDetails(requestParams.f312666a, requestParams.f312667b.name());
                        ubj.c cVar = new ubj.c(13, new m(fVar, 20));
                        allAccountsDetails.getClass();
                        i iVar = new i(allAccountsDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        yda.a params = (yda.a) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar.f(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"), value);
                        return Unit.f186387a;
                    case 2:
                        yda.a params2 = (yda.a) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        f fVar2 = this.f279319b;
                        ue0.c cVar2 = fVar2.d;
                        f.Companion.getClass();
                        String strB = c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY");
                        List<mda.c> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (mda.c currencyAccountInfo : list) {
                            Intrinsics.checkNotNullParameter(currencyAccountInfo, "currencyAccountInfo");
                            if (currencyAccountInfo instanceof mda.a) {
                                mda.a aVar = (mda.a) currencyAccountInfo;
                                a0Var = new a0(aVar.f204549a.f306286a, aVar.f204550b.f297794a, null);
                            } else {
                                if (!(currencyAccountInfo instanceof mda.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mda.b bVar = (mda.b) currencyAccountInfo;
                                a0Var = new a0(bVar.f204551a.f306286a, bVar.f204552b.f297794a, uda.a.c(bVar.f204553c));
                            }
                            arrayList.add(a0Var);
                        }
                        cVar2.G(arrayList, strB, kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                        String str2 = params2.f312666a;
                        io3.l lVar = params2.f312667b;
                        ArrayList<mda.b> arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof mda.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        for (mda.b bVar2 : arrayList2) {
                            xi0.b bVar3 = bVar2.f204551a;
                            dda.a aVar2 = bVar2.f204553c;
                            y yVar = new y(str2, bVar3, lVar, io3.i.INTERNAL, null, bVar2.f204552b);
                            f.Companion.getClass();
                            o oVar = (o) j6.a.k(o.class, cVar2, c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"));
                            if (!aVar2.equals(oVar != null ? uda.a.b(oVar) : null)) {
                                cVar2.G(uda.a.c(aVar2), c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                                fVar2.f.k(yVar, aVar2);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        y requestParams2 = (y) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
                        f fVar3 = this.f279319b;
                        PocketDetailsService pocketDetailsService2 = fVar3.f279325a;
                        String str3 = requestParams2.f304377a;
                        String str4 = requestParams2.f304378b.f306286a;
                        io3.i iVar2 = requestParams2.d;
                        String strName = iVar2 == io3.i.EXTERNAL ? iVar2.name() : requestParams2.f304379c.name();
                        String str5 = requestParams2.e;
                        wi0.b bVar4 = requestParams2.f;
                        d0<u> accountDetails = pocketDetailsService2.getAccountDetails(str3, str4, strName, str5, bVar4 != null ? bVar4.f297794a : null);
                        ubj.c cVar3 = new ubj.c(12, new g4(1, fVar3.f279327c, uda.a.class, "toDomain", "toDomain(Lcom/revolut/feature/pockets/impl/details_v2/dto/AccountDetailsDto;)Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetails;", 0, 12));
                        accountDetails.getClass();
                        i iVar3 = new i(accountDetails, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f279319b.f279326b.f("SWITCH_ACCOUNT_BANNER_MEMORY_KEY", bool);
                        return Unit.f186387a;
                    case 5:
                        y params3 = (y) obj2;
                        dda.a value3 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        j jVar2 = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar2.f(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"), value3);
                        return Unit.f186387a;
                    default:
                        y params4 = (y) obj2;
                        dda.a value4 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        f fVar4 = this.f279319b;
                        ue0.c cVar4 = fVar4.d;
                        f.Companion.getClass();
                        cVar4.G(uda.a.c(value4), c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                        if (params4.d != io3.i.EXTERNAL) {
                            yda.a aVar3 = new yda.a(params4.f304377a, params4.f304379c);
                            List list2 = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar4, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                o oVarC = uda.a.c(value4);
                                zda.i iVar4 = (zda.i) zhm.d0.d0(oVarC.f321402a);
                                if (iVar4 != null && (str = iVar4.f321384b) != null) {
                                    List<a0> list4 = list2;
                                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                                        i222 = 0;
                                    } else {
                                        Iterator it8 = list4.iterator();
                                        i222 = 0;
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((a0) it8.next()).f321357a, str) && (i222 = i222 + 1) < 0) {
                                                v.r();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z = i222 > 1;
                                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                                    boolean z3 = false;
                                    for (a0 info : list4) {
                                        String str6 = info.f321357a;
                                        String country = info.f321358b;
                                        if (Intrinsics.f(str6, str) && !Intrinsics.f(info.f321359c, oVarC)) {
                                            Intrinsics.checkNotNullParameter(info, "info");
                                            if (!z || Intrinsics.f(country, oVarC.f321403b.f321425b)) {
                                                String currency = info.f321357a;
                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                Intrinsics.checkNotNullParameter(country, "country");
                                                info = new a0(currency, country, oVarC);
                                                z3 = true;
                                            }
                                        }
                                        arrayList3.add(info);
                                    }
                                    if (z3) {
                                        f.Companion.getClass();
                                        cVar4.G(arrayList3, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"), kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                                        w4l.f fVar5 = fVar4.f279328g;
                                        l lVar2 = fVar4.e;
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(lVar2.e((a0) it9.next()));
                                        }
                                        fVar5.k(aVar3, arrayList4);
                                    }
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i32 = 2;
        final int i33 = 4;
        this.f279329h = new x4l.c(new nfj.i(3, 27, continuation), new Function1(this) { // from class: uea.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279321b;

            {
                this.f279321b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i222 = i32;
                ArrayList arrayList = null;
                f fVar = this.f279321b;
                switch (i222) {
                    case 0:
                        yda.a params = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        j jVar = fVar.f279326b;
                        f.Companion.getClass();
                        return (List) jVar.get(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"));
                    case 1:
                        yda.a params2 = (yda.a) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ue0.c cVar = fVar.d;
                        f.Companion.getClass();
                        List list = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar, c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(fVar.e.e((a0) it8.next()));
                            }
                        }
                        return arrayList;
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (Boolean) fVar.f279326b.get("SWITCH_ACCOUNT_BANNER_MEMORY_KEY");
                    case 3:
                        y params3 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        j jVar2 = fVar.f279326b;
                        f.Companion.getClass();
                        return (dda.a) jVar2.get(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"));
                    default:
                        y params4 = (y) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        try {
                            ue0.c cVar2 = fVar.d;
                            f.Companion.getClass();
                            o oVar = (o) cVar2.T2(c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                            if (oVar != null) {
                                return uda.a.b(oVar);
                            }
                            return null;
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                            return null;
                        }
                }
            }
        }, new Function2(this) { // from class: uea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f279319b;

            {
                this.f279319b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a0 a0Var;
                String str;
                int i222;
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        yda.a requestParams = (yda.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
                        f fVar = this.f279319b;
                        d0<List<yda.d>> allAccountsDetails = fVar.f279325a.getAllAccountsDetails(requestParams.f312666a, requestParams.f312667b.name());
                        ubj.c cVar = new ubj.c(13, new m(fVar, 20));
                        allAccountsDetails.getClass();
                        i iVar = new i(allAccountsDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        yda.a params = (yda.a) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        j jVar = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar.f(c.b(params, "ALL_ACCOUNT_DETAILS_MEMORY_KEY"), value);
                        return Unit.f186387a;
                    case 2:
                        yda.a params2 = (yda.a) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        f fVar2 = this.f279319b;
                        ue0.c cVar2 = fVar2.d;
                        f.Companion.getClass();
                        String strB = c.b(params2, "ALL_ACCOUNT_DETAILS_STORAGE_KEY");
                        List<mda.c> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (mda.c currencyAccountInfo : list) {
                            Intrinsics.checkNotNullParameter(currencyAccountInfo, "currencyAccountInfo");
                            if (currencyAccountInfo instanceof mda.a) {
                                mda.a aVar = (mda.a) currencyAccountInfo;
                                a0Var = new a0(aVar.f204549a.f306286a, aVar.f204550b.f297794a, null);
                            } else {
                                if (!(currencyAccountInfo instanceof mda.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mda.b bVar = (mda.b) currencyAccountInfo;
                                a0Var = new a0(bVar.f204551a.f306286a, bVar.f204552b.f297794a, uda.a.c(bVar.f204553c));
                            }
                            arrayList.add(a0Var);
                        }
                        cVar2.G(arrayList, strB, kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                        String str2 = params2.f312666a;
                        io3.l lVar = params2.f312667b;
                        ArrayList<mda.b> arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof mda.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        for (mda.b bVar2 : arrayList2) {
                            xi0.b bVar3 = bVar2.f204551a;
                            dda.a aVar2 = bVar2.f204553c;
                            y yVar = new y(str2, bVar3, lVar, io3.i.INTERNAL, null, bVar2.f204552b);
                            f.Companion.getClass();
                            o oVar = (o) j6.a.k(o.class, cVar2, c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"));
                            if (!aVar2.equals(oVar != null ? uda.a.b(oVar) : null)) {
                                cVar2.G(uda.a.c(aVar2), c.a(yVar, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                                fVar2.f.k(yVar, aVar2);
                            }
                        }
                        return Unit.f186387a;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        y requestParams2 = (y) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(requestParams2, "requestParams");
                        f fVar3 = this.f279319b;
                        PocketDetailsService pocketDetailsService2 = fVar3.f279325a;
                        String str3 = requestParams2.f304377a;
                        String str4 = requestParams2.f304378b.f306286a;
                        io3.i iVar2 = requestParams2.d;
                        String strName = iVar2 == io3.i.EXTERNAL ? iVar2.name() : requestParams2.f304379c.name();
                        String str5 = requestParams2.e;
                        wi0.b bVar4 = requestParams2.f;
                        d0<u> accountDetails = pocketDetailsService2.getAccountDetails(str3, str4, strName, str5, bVar4 != null ? bVar4.f297794a : null);
                        ubj.c cVar3 = new ubj.c(12, new g4(1, fVar3.f279327c, uda.a.class, "toDomain", "toDomain(Lcom/revolut/feature/pockets/impl/details_v2/dto/AccountDetailsDto;)Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetails;", 0, 12));
                        accountDetails.getClass();
                        i iVar3 = new i(accountDetails, cVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f279319b.f279326b.f("SWITCH_ACCOUNT_BANNER_MEMORY_KEY", bool);
                        return Unit.f186387a;
                    case 5:
                        y params3 = (y) obj2;
                        dda.a value3 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(value3, "value");
                        j jVar2 = this.f279319b.f279326b;
                        f.Companion.getClass();
                        jVar2.f(c.a(params3, "ACCOUNT_DETAILS_MEMORY_KEY"), value3);
                        return Unit.f186387a;
                    default:
                        y params4 = (y) obj2;
                        dda.a value4 = (dda.a) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(value4, "value");
                        f fVar4 = this.f279319b;
                        ue0.c cVar4 = fVar4.d;
                        f.Companion.getClass();
                        cVar4.G(uda.a.c(value4), c.a(params4, "ACCOUNT_DETAILS_STORAGE_KEY"), z.d(o0.b(o.class)));
                        if (params4.d != io3.i.EXTERNAL) {
                            yda.a aVar3 = new yda.a(params4.f304377a, params4.f304379c);
                            List list2 = (List) p.a.j(a0.class, KTypeProjection.INSTANCE, List.class, cVar4, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"));
                            List list3 = list2;
                            if (list3 != null && !list3.isEmpty()) {
                                o oVarC = uda.a.c(value4);
                                zda.i iVar4 = (zda.i) zhm.d0.d0(oVarC.f321402a);
                                if (iVar4 != null && (str = iVar4.f321384b) != null) {
                                    List<a0> list4 = list2;
                                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                                        i222 = 0;
                                    } else {
                                        Iterator it8 = list4.iterator();
                                        i222 = 0;
                                        while (it8.hasNext()) {
                                            if (Intrinsics.f(((a0) it8.next()).f321357a, str) && (i222 = i222 + 1) < 0) {
                                                v.r();
                                                throw null;
                                            }
                                        }
                                    }
                                    boolean z = i222 > 1;
                                    ArrayList arrayList3 = new ArrayList(w.t(list4, 10));
                                    boolean z3 = false;
                                    for (a0 info : list4) {
                                        String str6 = info.f321357a;
                                        String country = info.f321358b;
                                        if (Intrinsics.f(str6, str) && !Intrinsics.f(info.f321359c, oVarC)) {
                                            Intrinsics.checkNotNullParameter(info, "info");
                                            if (!z || Intrinsics.f(country, oVarC.f321403b.f321425b)) {
                                                String currency = info.f321357a;
                                                Intrinsics.checkNotNullParameter(currency, "currency");
                                                Intrinsics.checkNotNullParameter(country, "country");
                                                info = new a0(currency, country, oVarC);
                                                z3 = true;
                                            }
                                        }
                                        arrayList3.add(info);
                                    }
                                    if (z3) {
                                        f.Companion.getClass();
                                        cVar4.G(arrayList3, c.b(aVar3, "ALL_ACCOUNT_DETAILS_STORAGE_KEY"), kii.e.o(a0.class, KTypeProjection.INSTANCE, List.class));
                                        w4l.f fVar5 = fVar4.f279328g;
                                        l lVar2 = fVar4.e;
                                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                                        Iterator it9 = arrayList3.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(lVar2.e((a0) it9.next()));
                                        }
                                        fVar5.k(aVar3, arrayList4);
                                    }
                                }
                            }
                        }
                        return Unit.f186387a;
                }
            }
        }, new e(this, continuation, 0), new au6.u(this, continuation, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, xi0.b r14, io3.l r15, wi0.b r16, java.util.List r17, gim.c r18) {
        /*
            r12 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof uea.d
            if (r2 == 0) goto L17
            r2 = r1
            uea.d r2 = (uea.d) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.A = r3
            goto L1c
        L17:
            uea.d r2 = new uea.d
            r2.<init>(r12, r1)
        L1c:
            java.lang.Object r1 = r2.f279324y
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.A
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            wi0.b r13 = r2.f279323x
            io3.l r14 = r2.f279322w
            xi0.b r0 = r2.v
            java.lang.String r2 = r2.u
            yhm.o.b(r1)
            r10 = r13
            r7 = r14
            r6 = r0
            r5 = r2
            goto L77
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3f:
            yhm.o.b(r1)
            xda.c r6 = new xda.c
            java.lang.String r8 = r14.f306286a
            java.lang.String r9 = r15.name()
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.f297794a
        L4e:
            r7 = r13
            r11 = r17
            r10 = r1
            goto L55
        L53:
            r1 = 0
            goto L4e
        L55:
            r6.<init>(r7, r8, r9, r10, r11)
            com.revolut.feature.pockets.impl.network.PocketDetailsService r1 = r12.f279325a
            efm.d0 r1 = r1.createAccount(r6)
            ufm.n r1 = te0.w.i0(r1)
            r2.u = r13
            r2.v = r14
            r2.f279322w = r15
            r2.f279323x = r0
            r2.A = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L73
            return r3
        L73:
            r5 = r13
            r6 = r14
            r7 = r15
            r10 = r0
        L77:
            xda.u r1 = (xda.u) r1
            xda.y r4 = new xda.y
            io3.i r8 = io3.i.INTERNAL
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            kotlin.jvm.internal.Intrinsics.h(r1)
            dda.a r13 = uda.a.a(r1)
            w4l.f r14 = r12.f
            r14.j(r4, r13)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: uea.f.a(java.lang.String, xi0.b, io3.l, wi0.b, java.util.List, gim.c):java.lang.Object");
    }

    public final r b(k loadingStrategy, String walletId, xi0.b currency, io3.l pocketType, io3.i pocketOriginType, String str, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(pocketOriginType, "pocketOriginType");
        return this.f.e(new y(walletId, currency, pocketType, pocketOriginType, str, bVar), loadingStrategy);
    }

    public final r c(k loadingStrategy, String walletId, io3.l pocketType) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return this.f279328g.e(new yda.a(walletId, pocketType), loadingStrategy);
    }
}
