package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.PortfolioService;
import com.youTransactor.uCube.rpc.Constants;
import fdl.k;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f288026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f288027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f288028c;
    public final dcl.u0 d;
    public final dcl.m e;
    public final PortfolioService f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final twg.c f288029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f288030h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f288031j;
    public final w4l.f k;

    public p0(ue0.c storage, ne0.d memoryCache, b80.c networkStateRepository, dcl.u0 portfolioDao, dcl.m holdingsDao, PortfolioService service, twg.c deprecatedDatabaseInteractor, x4l.c performanceParametersDod) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(portfolioDao, "portfolioDao");
        Intrinsics.checkNotNullParameter(holdingsDao, "holdingsDao");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(deprecatedDatabaseInteractor, "deprecatedDatabaseInteractor");
        Intrinsics.checkNotNullParameter(performanceParametersDod, "performanceParametersDod");
        this.f288026a = storage;
        this.f288027b = memoryCache;
        this.f288028c = networkStateRepository;
        this.d = portfolioDao;
        this.e = holdingsDao;
        this.f = service;
        this.f288029g = deprecatedDatabaseInteractor;
        final int i = 9;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i2 = i;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i2) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        });
        final int i2 = 4;
        Function1 function1 = new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i22 = i2;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i22) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i3 = 5;
        Function2 function2 = new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i5 = i3;
                p0 p0Var = this.f287985b;
                switch (i5) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i6 = wcl.a.d[hVar2.ordinal()];
                            if (i6 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i22 = i3;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i22) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i5 = 6;
        this.f288030h = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i59 = i5;
                p0 p0Var = this.f287985b;
                switch (i59) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i6 = wcl.a.d[hVar2.ordinal()];
                            if (i6 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 6;
        final int i21 = 7;
        this.i = new w4l.f(te0.w.k0(networkStateRepository, new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i22 = i6;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i22) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }), new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i22 = i21;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i22) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i59 = i21;
                p0 p0Var = this.f287985b;
                switch (i59) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i66 = wcl.a.d[hVar2.ordinal()];
                            if (i66 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i22 = 8;
        Function2 function22 = new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i59 = i22;
                p0 p0Var = this.f287985b;
                switch (i59) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i66 = wcl.a.d[hVar2.ordinal()];
                            if (i66 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        };
        Function1 function13 = new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i222 = i22;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i222) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        };
        final int i32 = 0;
        final int i33 = 1;
        final int i43 = 1;
        this.f288031j = new w4l.f(function22, function13, new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i59 = i32;
                p0 p0Var = this.f287985b;
                switch (i59) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i66 = wcl.a.d[hVar2.ordinal()];
                            if (i66 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        }, new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i222 = i32;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i222) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i59 = i33;
                p0 p0Var = this.f287985b;
                switch (i59) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i66 = wcl.a.d[hVar2.ordinal()];
                            if (i66 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i66 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        }, new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i222 = i43;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i222) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, null, null, 192);
        final int i59 = 2;
        final int i66 = 2;
        final int i74 = 3;
        final int i92 = 3;
        final int i96 = 4;
        this.k = new w4l.f(new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i592 = i59;
                p0 p0Var = this.f287985b;
                switch (i592) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i662 = wcl.a.d[hVar2.ordinal()];
                            if (i662 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i662 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        }, new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i222 = i66;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i222) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i592 = i74;
                p0 p0Var = this.f287985b;
                switch (i592) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i662 = wcl.a.d[hVar2.ordinal()];
                            if (i662 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i662 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        }, new Function1(this) { // from class: vdl.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287990b;

            {
                this.f287990b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List value;
                Object objA;
                int i222 = i92;
                ArrayList arrayList = null;
                arrayList = null;
                p0 p0Var = this.f287990b;
                switch (i222) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        p0Var.c();
                        jcl.e eVarB = p0Var.e.b(holdingId.f288004a, holdingId.f288005b);
                        if (eVarB != null) {
                            return hx7.i.Q(eVarB);
                        }
                        return null;
                    case 1:
                        n0 holdingId2 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        p0Var.f288027b.remove(p0.b(holdingId2));
                        p0Var.e.a(holdingId2.f288004a, holdingId2.f288005b);
                        return Unit.f186387a;
                    case 2:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (List) p0Var.f288027b.get(p0.a(portfolioId));
                    case 3:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        l0 l0Var = (l0) p0Var.f288026a.T2(p0.a(portfolioId2), l0.class);
                        if (l0Var != null && (value = l0Var.getValue()) != null) {
                            List list = value;
                            arrayList = new ArrayList(zhm.w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(tcl.a.a((fdl.l) it8.next()));
                            }
                        }
                        return arrayList;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        return (wel.e) v1.c.s("PORTFOLIO_", portfolioId3, p0Var.f288027b);
                    case 5:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        p0Var.c();
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            kcl.b bVarA = p0Var.d.a(portfolioId4);
                            if (bVarA != null) {
                                List listD = p0Var.e.d(portfolioId4);
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(listD, 10));
                                Iterator it9 = listD.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(hx7.i.Q((jcl.e) it9.next()));
                                }
                                objA = wcl.c.a(bVarA, arrayList2);
                            } else {
                                objA = null;
                            }
                            break;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                        }
                        return (wel.e) (yhm.m.a(objA) == null ? objA : null);
                    case 6:
                        String params = (String) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        efm.d0<fdl.n> brokerageAccountInformation = p0Var.f.getBrokerageAccountInformation(params);
                        s sVar = new s(6, new vch.h0(20));
                        brokerageAccountInformation.getClass();
                        ufm.i iVar = new ufm.i(brokerageAccountInformation, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 7:
                        String it10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (efl.d) p0Var.f288027b.get("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY");
                    case 8:
                        n0 holdingId3 = (n0) obj2;
                        Intrinsics.checkNotNullParameter(holdingId3, "holdingId");
                        return (kel.g) p0Var.f288027b.get(p0.b(holdingId3));
                    default:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        efm.d0<mdl.c> portfolioById = p0Var.f.getPortfolioById(portfolioId5);
                        s sVar2 = new s(8, new vch.h0(21));
                        portfolioById.getClass();
                        ufm.i iVar2 = new ufm.i(portfolioById, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                }
            }
        }, new Function2(this) { // from class: vdl.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f287985b;

            {
                this.f287985b = this;
            }

            /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Object next;
                wel.e eVarA;
                String str;
                String str2;
                Long l2;
                jcl.b bVar;
                jcl.f fVar;
                jcl.e eVar;
                ArrayList arrayList;
                fdl.l jVar;
                kcl.d dVar;
                jcl.d dVar2;
                wi0.b bVar2;
                wi0.b bVar3;
                int i592 = i96;
                p0 p0Var = this.f287985b;
                switch (i592) {
                    case 0:
                        n0 holdingId = (n0) obj2;
                        kel.g holding = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(holding, "holding");
                        ne0.d dVar3 = p0Var.f288027b;
                        dVar3.f(p0.b(holdingId), holding);
                        String str3 = holdingId.f288004a;
                        wel.e eVar2 = (wel.e) v1.c.s("PORTFOLIO_", str3, dVar3);
                        if (eVar2 != null) {
                            ArrayList<kel.g> arrayList2 = eVar2.e;
                            Iterator it8 = arrayList2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((kel.g) next).getId(), holding.getId())) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            kel.g gVar = (kel.g) next;
                            if (gVar == null) {
                                ArrayList arrayListF1 = zhm.d0.f1(arrayList2);
                                arrayListF1.add(holding);
                                Unit unit = Unit.f186387a;
                                eVarA = wel.e.a(eVar2, arrayListF1);
                            } else if (gVar.equals(holding)) {
                                eVarA = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                                for (kel.g gVar2 : arrayList2) {
                                    if (Intrinsics.f(gVar2.getId(), holding.getId())) {
                                        gVar2 = holding;
                                    }
                                    arrayList3.add(gVar2);
                                }
                                eVarA = wel.e.a(eVar2, arrayList3);
                            }
                            if (eVarA != null) {
                                p0Var.f288030h.k(str3, eVarA);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        kel.g holding2 = (kel.g) obj3;
                        Intrinsics.checkNotNullParameter((n0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(holding2, "holding");
                        dcl.m mVar = p0Var.e;
                        Intrinsics.checkNotNullParameter(holding2, "<this>");
                        if (holding2 instanceof kel.b) {
                            kel.b bVar4 = (kel.b) holding2;
                            kel.a aVar = bVar4.f183148a;
                            eVar = new jcl.e(aVar.f183145a, aVar.f183146b, aVar.f183147c, hx7.i.D(aVar.d), aVar.f, aVar.e, new jcl.a(bVar4.f183150c, hx7.a.A(bVar4.f183149b), hx7.a.A(bVar4.d), hx7.a.A(bVar4.e), hx7.a.A(bVar4.f), hx7.a.A(bVar4.f183151g), hx7.a.A(bVar4.f183152h), hx7.a.A(bVar4.i)), null, 128);
                        } else {
                            if (!(holding2 instanceof kel.n)) {
                                throw new IllegalStateException();
                            }
                            kel.n nVar = (kel.n) holding2;
                            kel.a aVar2 = nVar.f183173a;
                            String strD = hx7.i.D(aVar2.d);
                            String str4 = aVar2.f183145a;
                            String str5 = aVar2.f;
                            String str6 = aVar2.e;
                            Long l3 = aVar2.f183147c;
                            String str7 = nVar.e;
                            String str8 = nVar.f;
                            String str9 = nVar.f183176g;
                            String string = nVar.f183174b.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = nVar.f183175c.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            String string3 = nVar.d.toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            dj0.d dVar4 = nVar.f183177h;
                            jo3.b bVarA = dVar4 != null ? hx7.a.A(dVar4) : null;
                            String strB = tbl.a.b(nVar.f183178j);
                            ZonedDateTime zonedDateTime = nVar.f183180m;
                            kel.e eVar3 = nVar.f183179l;
                            if (eVar3 != null) {
                                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                                String string4 = eVar3.f183163a.toString();
                                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                str = str5;
                                String string5 = eVar3.f183164b.toString();
                                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                String string6 = eVar3.f183165c.toString();
                                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                                List list = eVar3.d;
                                if (list != null) {
                                    List list2 = list;
                                    str2 = str6;
                                    l2 = l3;
                                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it9 = list2.iterator();
                                    while (it9.hasNext()) {
                                        arrayList4.add(hx7.i.a0((kel.d) it9.next()));
                                    }
                                    arrayList = arrayList4;
                                } else {
                                    str2 = str6;
                                    l2 = l3;
                                    arrayList = null;
                                }
                                kel.d dVar5 = eVar3.e;
                                bVar = new jcl.b(string4, string5, string6, arrayList, dVar5 != null ? hx7.i.a0(dVar5) : null);
                            } else {
                                str = str5;
                                str2 = str6;
                                l2 = l3;
                                bVar = null;
                            }
                            kel.m mVar2 = nVar.k;
                            if (mVar2 != null) {
                                ko3.b bVarM = cp5.c.M(mVar2.f183170a);
                                jo3.b bVarA2 = hx7.a.A(mVar2.f183171b);
                                jo3.b bVarA3 = hx7.a.A(mVar2.f183172c);
                                String string7 = mVar2.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                                fVar = new jcl.f(bVarM, bVarA2, bVarA3, string7);
                            } else {
                                fVar = null;
                            }
                            eVar = new jcl.e(str4, aVar2.f183146b, l2, strD, str, str2, null, new jcl.g(str7, str8, str9, string, string2, string3, bVarA, strB, zonedDateTime, bVar, fVar), 64);
                        }
                        mVar.e(eVar);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        efm.d0<List<fdl.l>> blockedForWithdrawal = p0Var.f.getBlockedForWithdrawal(portfolioId);
                        s sVar = new s(5, new vch.h0(19));
                        blockedForWithdrawal.getClass();
                        ufm.i iVar = new ufm.i(blockedForWithdrawal, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        String portfolioId2 = (String) obj2;
                        List blockedForWithdrawalList = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList, "blockedForWithdrawalList");
                        p0Var.f288027b.f(p0.a(portfolioId2), blockedForWithdrawalList);
                        return Unit.f186387a;
                    case 4:
                        String portfolioId3 = (String) obj2;
                        List blockedForWithdrawalList2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(blockedForWithdrawalList2, "blockedForWithdrawalList");
                        ue0.c cVar = p0Var.f288026a;
                        String strA = p0.a(portfolioId3);
                        List<efl.c> list3 = blockedForWithdrawalList2;
                        ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                        for (efl.c cVar2 : list3) {
                            Intrinsics.checkNotNullParameter(cVar2, "<this>");
                            if (cVar2 instanceof efl.b) {
                                efl.b bVar5 = (efl.b) cVar2;
                                jVar = new fdl.k(new k.a(bVar5.f125361a), bVar5.f125362b, bVar5.f125363c);
                            } else {
                                if (!(cVar2 instanceof efl.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                efl.a aVar3 = (efl.a) cVar2;
                                jVar = new fdl.j(mo3.a.p(aVar3.f125359a), aVar3.f125360b.f306286a);
                            }
                            arrayList5.add(jVar);
                        }
                        cVar.G(new l0(arrayList5), strA, wim.z.d(kotlin.jvm.internal.o0.b(l0.class)));
                        return Unit.f186387a;
                    case 5:
                        String portfolioId4 = (String) obj2;
                        wel.e portfolio = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                        p0Var.f288027b.f("PORTFOLIO_" + portfolioId4, portfolio);
                        for (kel.g gVar3 : portfolio.e) {
                            p0Var.f288031j.k(new n0(portfolioId4, gVar3.getId()), gVar3);
                        }
                        return Unit.f186387a;
                    case 6:
                        String portfolioId5 = (String) obj2;
                        wel.e portfolio2 = (wel.e) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        Intrinsics.checkNotNullParameter(portfolio2, "portfolio");
                        w4l.f fVar2 = p0Var.f288031j;
                        Object obj4 = wcl.c.f296426a;
                        Intrinsics.checkNotNullParameter(portfolio2, "<this>");
                        String str10 = portfolio2.f296818a;
                        ArrayList<kel.g> arrayList6 = portfolio2.e;
                        wel.i iVar2 = portfolio2.f296819b;
                        dj0.d dVar6 = portfolio2.d;
                        jo3.b bVarA4 = dVar6 != null ? hx7.a.A(dVar6) : null;
                        String strH = le.u1.h(iVar2, wcl.c.f296428c);
                        if (strH == null) {
                            strH = iVar2.name();
                        }
                        String str11 = strH;
                        xel.b bVar6 = portfolio2.f296820c;
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        List list4 = bVar6.f304703b;
                        String str12 = (list4 == null || (bVar3 = (wi0.b) zhm.d0.d0(list4)) == null) ? null : bVar3.f297794a;
                        List list5 = bVar6.f304703b;
                        String str13 = (list5 == null || (bVar2 = (wi0.b) zhm.d0.e0(1, list5)) == null) ? null : bVar2.f297794a;
                        Boolean bool = bVar6.f304704c;
                        Boolean bool2 = bVar6.d;
                        ArrayList<xel.c> arrayList7 = bVar6.f304702a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (xel.c cVar3 : arrayList7) {
                            Intrinsics.checkNotNullParameter(cVar3, "<this>");
                            arrayList8.add(new lcl.a(cVar3.f, cVar3.f304705a.f297794a, cVar3.f304706b, cVar3.f304707c, cVar3.e, cVar3.f304708g, cVar3.d, cVar3.f304709h, cVar3.f304710j, cVar3.i));
                        }
                        lcl.b bVar7 = new lcl.b(bool, bool2, str12, str13, arrayList8);
                        wel.g gVar4 = portfolio2.f;
                        Intrinsics.checkNotNullParameter(gVar4, "<this>");
                        wel.h hVar = gVar4.f296826a;
                        if (hVar != null) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            String strG = le.u1.g(hVar.f296827a, wcl.c.f296426a);
                            String str14 = hVar.f296828b;
                            wel.j jVar2 = hVar.f296829c;
                            dVar = new kcl.d(strG, str14, jVar2 != null ? le.u1.g(jVar2, wcl.c.f296427b) : null, hVar.d);
                        } else {
                            dVar = null;
                        }
                        kcl.c cVar4 = new kcl.c(dVar);
                        wel.f fVar3 = portfolio2.f296821g;
                        Intrinsics.checkNotNullParameter(fVar3, "<this>");
                        kcl.a aVar4 = new kcl.a(fVar3.f296824a, fVar3.f296825b);
                        List<kel.h> list6 = portfolio2.f296822h;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                        for (kel.h hVar2 : list6) {
                            Intrinsics.checkNotNullParameter(hVar2, "<this>");
                            int i662 = wcl.a.d[hVar2.ordinal()];
                            if (i662 == 1) {
                                dVar2 = jcl.d.STOCK;
                            } else {
                                if (i662 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = jcl.d.CASH;
                            }
                            arrayList9.add(dVar2);
                        }
                        p0Var.d.b(new kcl.b(str10, str11, new ArrayList(arrayList9), bVarA4, bVar7, aVar4, cVar4, portfolio2.i, portfolio2.f296823j));
                        for (kel.g gVar5 : arrayList6) {
                            fVar2.l(new n0(portfolioId5, gVar5.getId()), gVar5);
                        }
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((kel.g) it10.next()).getId());
                        }
                        HashSet hashSetB1 = zhm.d0.b1(arrayList10);
                        for (String str15 : p0Var.e.c(portfolioId5)) {
                            if (!hashSetB1.contains(str15)) {
                                fVar2.h(new n0(portfolioId5, str15));
                            }
                        }
                        return Unit.f186387a;
                    case 7:
                        efl.d domain = (efl.d) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        p0Var.f288027b.f("BROKERAGE_ACCOUNT_INFORMATION_MEMORY_KEY", domain);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n0 holdingId2 = (n0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(holdingId2, "holdingId");
                        efm.d0<hdl.e> holding3 = p0Var.f.getHolding(holdingId2.f288004a, holdingId2.f288005b);
                        s sVar2 = new s(7, new a(holdingId2, 6));
                        holding3.getClass();
                        ufm.i iVar3 = new ufm.i(holding3, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return te0.w.n0(iVar3, p0Var.f288028c);
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(String str) {
        return j6.a.q("BLOCKED_FOR_WITHDRAWAL_", str);
    }

    public static String b(n0 n0Var) {
        return a0.d.s("HOLDING_", n0Var.f288004a, "_", n0Var.f288005b);
    }

    public final void c() {
        ue0.c cVar;
        Class cls;
        synchronized (this) {
            try {
                cVar = this.f288026a;
                cls = Boolean.TYPE;
            } catch (Throwable th10) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            }
            if (pd.b.j((Boolean) cVar.T2("PORTFOLIO_DAO_MIGRATED", wim.z.d(kotlin.jvm.internal.o0.b(cls))))) {
                Unit unit = Unit.f186387a;
            } else {
                this.f288026a.G(Boolean.TRUE, "PORTFOLIO_DAO_MIGRATED", wim.z.d(kotlin.jvm.internal.o0.b(cls)));
                ArrayList arrayListT = this.f288029g.t();
                ArrayList arrayList = new ArrayList(zhm.w.t(arrayListT, 10));
                Iterator it8 = arrayListT.iterator();
                while (it8.hasNext()) {
                    arrayList.add(i2b.a.H((ubl.b) it8.next()));
                }
                this.d.c(arrayList);
                ArrayList arrayListS = this.f288029g.s();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListS, 10));
                Iterator it9 = arrayListS.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(i2b.a.G((ubl.a) it9.next()));
                }
                this.e.f(arrayList2);
                Unit unit2 = Unit.f186387a;
            }
        }
    }
}
