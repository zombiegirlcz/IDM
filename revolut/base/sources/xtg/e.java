package xtg;

import com.revolut.feature.wealth.account_closure.impl.data.network.AccountClosureService;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequested;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequestedDetails;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureProgress;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureProgressStep;
import efm.d0;
import ip0.v7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import w4l.f;
import wtg.r;
import wtg.z;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureService f308815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f308816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qtg.c f308817c;
    public final qtg.a d;
    public final ue0.c e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f308818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f308819h;

    public e(AccountClosureService accountClosureService, j memoryCache, qtg.c accountClosureProgressDao, qtg.a accountClosureBackendRequestedDao, ue0.c storage, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(accountClosureService, "accountClosureService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(accountClosureProgressDao, "accountClosureProgressDao");
        Intrinsics.checkNotNullParameter(accountClosureBackendRequestedDao, "accountClosureBackendRequestedDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f308815a = accountClosureService;
        this.f308816b = memoryCache;
        this.f308817c = accountClosureProgressDao;
        this.d = accountClosureBackendRequestedDao;
        this.e = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: xtg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308809b;

            {
                this.f308809b = this;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                e eVar = this.f308809b;
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<z> accountClosureProgress = eVar.f308815a.getAccountClosureProgress(portfolioId);
                        xt1.a aVar = new xt1.a(8, new c(eVar, portfolioId, i3));
                        accountClosureProgress.getClass();
                        ufm.f fVar = new ufm.f(new i(accountClosureProgress, aVar, 1), new xt1.a(9, new c(eVar, portfolioId, i5)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 1:
                        qtg.a aVar2 = eVar.d;
                        String portfolioId2 = (String) obj2;
                        AccountClosureBackendRequested lastOnboardedPortfolioStatus = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "lastOnboardedPortfolioStatus");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "<this>");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        boolean z = lastOnboardedPortfolioStatus.f104483a;
                        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = lastOnboardedPortfolioStatus.f104484b;
                        String str = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104485a : null;
                        String str2 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104486b : null;
                        String str3 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104487c : null;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.a aVarA = aVar2.a(portfolioId2);
                        boolean z3 = aVarA != null && aVarA.f265583g;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        aVar2.b(new stg.a(portfolioId2, str, str2, z, 0, str3, z3));
                        break;
                    case 2:
                        String portfolioId3 = (String) obj2;
                        AccountClosureProgress data = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY" + portfolioId3, data);
                        break;
                    case 3:
                        AccountClosureProgress data2 = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        qtg.c cVar = eVar.f308817c;
                        Object obj4 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        String str4 = data2.f104488a;
                        String strH = u1.h(data2.f104489b, utg.b.f283100a);
                        if (strH == null) {
                            strH = "";
                        }
                        String str5 = strH;
                        String str6 = data2.f104490c;
                        Instant instant = data2.d;
                        Instant instant2 = data2.e;
                        String strG = u1.g(data2.f, utg.b.f283102c);
                        String str7 = data2.f104491g;
                        String str8 = data2.f104492h;
                        boolean z4 = data2.f104494l;
                        stg.c cVarC = utg.b.c(data2.i);
                        ArrayList arrayList = data2.f104493j;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(utg.b.c((AccountClosureProgressStep) it8.next()));
                        }
                        ArrayList arrayList3 = data2.k;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(utg.b.c((AccountClosureProgressStep) it9.next()));
                        }
                        cVar.d(new stg.b(str4, str5, str6, instant, instant2, strG, str7, str8, cVarC, arrayList2, arrayList4, z4, data2.f104495m));
                        break;
                    default:
                        String portfolioId4 = (String) obj2;
                        AccountClosureBackendRequested data3 = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_" + portfolioId4, data3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: xtg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308811b;

            {
                this.f308811b = this;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                String str2;
                int i2 = i;
                int i3 = 10;
                AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = null;
                e eVar = this.f308811b;
                switch (i2) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (AccountClosureProgress) v7.r("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY", portfolioId, eVar.f308816b);
                    case 1:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.b bVarB = eVar.f308817c.b(portfolioId2);
                        if (bVarB == null) {
                            return null;
                        }
                        Object obj3 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        String str3 = bVarB.f265584a;
                        h4l.c cVar = (h4l.c) u1.v(bVarB.f265585b, utg.b.f283100a);
                        if (cVar == null) {
                            cVar = h4l.c.UNKNOWN;
                        }
                        h4l.c cVar2 = cVar;
                        String str4 = bVarB.f265586c;
                        Instant instant = bVarB.d;
                        Instant instant2 = bVarB.e;
                        h4l.b bVar = (h4l.b) u1.v(bVarB.f, utg.b.f283102c);
                        if (bVar == null) {
                            bVar = h4l.b.UNKNOWN;
                        }
                        h4l.b bVar2 = bVar;
                        String str5 = bVarB.f265587g;
                        String str6 = bVarB.f265588h;
                        boolean z = bVarB.f265590l;
                        AccountClosureProgressStep accountClosureProgressStepA = utg.b.a(bVarB.i);
                        List list = bVarB.f265589j;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(utg.b.a((stg.c) it8.next()));
                        }
                        List list2 = bVarB.k;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(utg.b.a((stg.c) it9.next()));
                        }
                        return new AccountClosureProgress(str3, cVar2, str4, instant, instant2, bVar2, str5, str6, accountClosureProgressStepA, arrayList, arrayList2, z, bVarB.f265591m);
                    case 2:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        d0<r> accountClosurePreconditions = eVar.f308815a.getAccountClosurePreconditions(portfolioId3);
                        xt1.a aVar = new xt1.a(i3, new c(eVar, portfolioId3, 2));
                        accountClosurePreconditions.getClass();
                        i iVar = new i(accountClosurePreconditions, aVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 3:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        d0<wtg.f> backendRequestedAccountClosureById = eVar.f308815a.getBackendRequestedAccountClosureById(portfolioId4);
                        xt1.a aVar2 = new xt1.a(7, new xrl.a(19));
                        backendRequestedAccountClosureById.getClass();
                        i iVar2 = new i(backendRequestedAccountClosureById, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        return (AccountClosureBackendRequested) v7.r("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_", portfolioId5, eVar.f308816b);
                    default:
                        String portfolioId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId6, "portfolioId");
                        stg.a aVarA = eVar.d.a(portfolioId6);
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        boolean z3 = aVarA.f265582c;
                        String str7 = aVarA.d;
                        if (str7 != null && (str = aVarA.e) != null && (str2 = aVarA.f) != null) {
                            accountClosureBackendRequestedDetails = new AccountClosureBackendRequestedDetails(str7, str, str2);
                        }
                        return new AccountClosureBackendRequested(z3, accountClosureBackendRequestedDetails);
                }
            }
        };
        final int i2 = 2;
        Function2 function22 = new Function2(this) { // from class: xtg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308809b;

            {
                this.f308809b = this;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                e eVar = this.f308809b;
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<z> accountClosureProgress = eVar.f308815a.getAccountClosureProgress(portfolioId);
                        xt1.a aVar = new xt1.a(8, new c(eVar, portfolioId, i3));
                        accountClosureProgress.getClass();
                        ufm.f fVar = new ufm.f(new i(accountClosureProgress, aVar, 1), new xt1.a(9, new c(eVar, portfolioId, i5)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 1:
                        qtg.a aVar2 = eVar.d;
                        String portfolioId2 = (String) obj2;
                        AccountClosureBackendRequested lastOnboardedPortfolioStatus = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "lastOnboardedPortfolioStatus");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "<this>");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        boolean z = lastOnboardedPortfolioStatus.f104483a;
                        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = lastOnboardedPortfolioStatus.f104484b;
                        String str = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104485a : null;
                        String str2 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104486b : null;
                        String str3 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104487c : null;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.a aVarA = aVar2.a(portfolioId2);
                        boolean z3 = aVarA != null && aVarA.f265583g;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        aVar2.b(new stg.a(portfolioId2, str, str2, z, 0, str3, z3));
                        break;
                    case 2:
                        String portfolioId3 = (String) obj2;
                        AccountClosureProgress data = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY" + portfolioId3, data);
                        break;
                    case 3:
                        AccountClosureProgress data2 = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        qtg.c cVar = eVar.f308817c;
                        Object obj4 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        String str4 = data2.f104488a;
                        String strH = u1.h(data2.f104489b, utg.b.f283100a);
                        if (strH == null) {
                            strH = "";
                        }
                        String str5 = strH;
                        String str6 = data2.f104490c;
                        Instant instant = data2.d;
                        Instant instant2 = data2.e;
                        String strG = u1.g(data2.f, utg.b.f283102c);
                        String str7 = data2.f104491g;
                        String str8 = data2.f104492h;
                        boolean z4 = data2.f104494l;
                        stg.c cVarC = utg.b.c(data2.i);
                        ArrayList arrayList = data2.f104493j;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(utg.b.c((AccountClosureProgressStep) it8.next()));
                        }
                        ArrayList arrayList3 = data2.k;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(utg.b.c((AccountClosureProgressStep) it9.next()));
                        }
                        cVar.d(new stg.b(str4, str5, str6, instant, instant2, strG, str7, str8, cVarC, arrayList2, arrayList4, z4, data2.f104495m));
                        break;
                    default:
                        String portfolioId4 = (String) obj2;
                        AccountClosureBackendRequested data3 = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_" + portfolioId4, data3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 1;
        Function1 function12 = new Function1(this) { // from class: xtg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308811b;

            {
                this.f308811b = this;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                String str2;
                int i22 = i3;
                int i32 = 10;
                AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = null;
                e eVar = this.f308811b;
                switch (i22) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (AccountClosureProgress) v7.r("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY", portfolioId, eVar.f308816b);
                    case 1:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.b bVarB = eVar.f308817c.b(portfolioId2);
                        if (bVarB == null) {
                            return null;
                        }
                        Object obj3 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        String str3 = bVarB.f265584a;
                        h4l.c cVar = (h4l.c) u1.v(bVarB.f265585b, utg.b.f283100a);
                        if (cVar == null) {
                            cVar = h4l.c.UNKNOWN;
                        }
                        h4l.c cVar2 = cVar;
                        String str4 = bVarB.f265586c;
                        Instant instant = bVarB.d;
                        Instant instant2 = bVarB.e;
                        h4l.b bVar = (h4l.b) u1.v(bVarB.f, utg.b.f283102c);
                        if (bVar == null) {
                            bVar = h4l.b.UNKNOWN;
                        }
                        h4l.b bVar2 = bVar;
                        String str5 = bVarB.f265587g;
                        String str6 = bVarB.f265588h;
                        boolean z = bVarB.f265590l;
                        AccountClosureProgressStep accountClosureProgressStepA = utg.b.a(bVarB.i);
                        List list = bVarB.f265589j;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(utg.b.a((stg.c) it8.next()));
                        }
                        List list2 = bVarB.k;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(utg.b.a((stg.c) it9.next()));
                        }
                        return new AccountClosureProgress(str3, cVar2, str4, instant, instant2, bVar2, str5, str6, accountClosureProgressStepA, arrayList, arrayList2, z, bVarB.f265591m);
                    case 2:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        d0<r> accountClosurePreconditions = eVar.f308815a.getAccountClosurePreconditions(portfolioId3);
                        xt1.a aVar = new xt1.a(i32, new c(eVar, portfolioId3, 2));
                        accountClosurePreconditions.getClass();
                        i iVar = new i(accountClosurePreconditions, aVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 3:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        d0<wtg.f> backendRequestedAccountClosureById = eVar.f308815a.getBackendRequestedAccountClosureById(portfolioId4);
                        xt1.a aVar2 = new xt1.a(7, new xrl.a(19));
                        backendRequestedAccountClosureById.getClass();
                        i iVar2 = new i(backendRequestedAccountClosureById, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        return (AccountClosureBackendRequested) v7.r("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_", portfolioId5, eVar.f308816b);
                    default:
                        String portfolioId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId6, "portfolioId");
                        stg.a aVarA = eVar.d.a(portfolioId6);
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        boolean z3 = aVarA.f265582c;
                        String str7 = aVarA.d;
                        if (str7 != null && (str = aVarA.e) != null && (str2 = aVarA.f) != null) {
                            accountClosureBackendRequestedDetails = new AccountClosureBackendRequestedDetails(str7, str, str2);
                        }
                        return new AccountClosureBackendRequested(z3, accountClosureBackendRequestedDetails);
                }
            }
        };
        final int i5 = 3;
        this.f = new f(function2, function1, function22, function12, new Function2(this) { // from class: xtg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308809b;

            {
                this.f308809b = this;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                int i32 = 0;
                int i59 = 1;
                e eVar = this.f308809b;
                switch (i22) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<z> accountClosureProgress = eVar.f308815a.getAccountClosureProgress(portfolioId);
                        xt1.a aVar = new xt1.a(8, new c(eVar, portfolioId, i32));
                        accountClosureProgress.getClass();
                        ufm.f fVar = new ufm.f(new i(accountClosureProgress, aVar, 1), new xt1.a(9, new c(eVar, portfolioId, i59)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 1:
                        qtg.a aVar2 = eVar.d;
                        String portfolioId2 = (String) obj2;
                        AccountClosureBackendRequested lastOnboardedPortfolioStatus = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "lastOnboardedPortfolioStatus");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "<this>");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        boolean z = lastOnboardedPortfolioStatus.f104483a;
                        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = lastOnboardedPortfolioStatus.f104484b;
                        String str = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104485a : null;
                        String str2 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104486b : null;
                        String str3 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104487c : null;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.a aVarA = aVar2.a(portfolioId2);
                        boolean z3 = aVarA != null && aVarA.f265583g;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        aVar2.b(new stg.a(portfolioId2, str, str2, z, 0, str3, z3));
                        break;
                    case 2:
                        String portfolioId3 = (String) obj2;
                        AccountClosureProgress data = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY" + portfolioId3, data);
                        break;
                    case 3:
                        AccountClosureProgress data2 = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        qtg.c cVar = eVar.f308817c;
                        Object obj4 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        String str4 = data2.f104488a;
                        String strH = u1.h(data2.f104489b, utg.b.f283100a);
                        if (strH == null) {
                            strH = "";
                        }
                        String str5 = strH;
                        String str6 = data2.f104490c;
                        Instant instant = data2.d;
                        Instant instant2 = data2.e;
                        String strG = u1.g(data2.f, utg.b.f283102c);
                        String str7 = data2.f104491g;
                        String str8 = data2.f104492h;
                        boolean z4 = data2.f104494l;
                        stg.c cVarC = utg.b.c(data2.i);
                        ArrayList arrayList = data2.f104493j;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(utg.b.c((AccountClosureProgressStep) it8.next()));
                        }
                        ArrayList arrayList3 = data2.k;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(utg.b.c((AccountClosureProgressStep) it9.next()));
                        }
                        cVar.d(new stg.b(str4, str5, str6, instant, instant2, strG, str7, str8, cVarC, arrayList2, arrayList4, z4, data2.f104495m));
                        break;
                    default:
                        String portfolioId4 = (String) obj2;
                        AccountClosureBackendRequested data3 = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_" + portfolioId4, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i6 = 2;
        this.f308818g = new f(te0.w.k0(networkStateRepository, new Function1(this) { // from class: xtg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308811b;

            {
                this.f308811b = this;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                String str2;
                int i22 = i6;
                int i32 = 10;
                AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = null;
                e eVar = this.f308811b;
                switch (i22) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (AccountClosureProgress) v7.r("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY", portfolioId, eVar.f308816b);
                    case 1:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.b bVarB = eVar.f308817c.b(portfolioId2);
                        if (bVarB == null) {
                            return null;
                        }
                        Object obj3 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        String str3 = bVarB.f265584a;
                        h4l.c cVar = (h4l.c) u1.v(bVarB.f265585b, utg.b.f283100a);
                        if (cVar == null) {
                            cVar = h4l.c.UNKNOWN;
                        }
                        h4l.c cVar2 = cVar;
                        String str4 = bVarB.f265586c;
                        Instant instant = bVarB.d;
                        Instant instant2 = bVarB.e;
                        h4l.b bVar = (h4l.b) u1.v(bVarB.f, utg.b.f283102c);
                        if (bVar == null) {
                            bVar = h4l.b.UNKNOWN;
                        }
                        h4l.b bVar2 = bVar;
                        String str5 = bVarB.f265587g;
                        String str6 = bVarB.f265588h;
                        boolean z = bVarB.f265590l;
                        AccountClosureProgressStep accountClosureProgressStepA = utg.b.a(bVarB.i);
                        List list = bVarB.f265589j;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(utg.b.a((stg.c) it8.next()));
                        }
                        List list2 = bVarB.k;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(utg.b.a((stg.c) it9.next()));
                        }
                        return new AccountClosureProgress(str3, cVar2, str4, instant, instant2, bVar2, str5, str6, accountClosureProgressStepA, arrayList, arrayList2, z, bVarB.f265591m);
                    case 2:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        d0<r> accountClosurePreconditions = eVar.f308815a.getAccountClosurePreconditions(portfolioId3);
                        xt1.a aVar = new xt1.a(i32, new c(eVar, portfolioId3, 2));
                        accountClosurePreconditions.getClass();
                        i iVar = new i(accountClosurePreconditions, aVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 3:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        d0<wtg.f> backendRequestedAccountClosureById = eVar.f308815a.getBackendRequestedAccountClosureById(portfolioId4);
                        xt1.a aVar2 = new xt1.a(7, new xrl.a(19));
                        backendRequestedAccountClosureById.getClass();
                        i iVar2 = new i(backendRequestedAccountClosureById, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        return (AccountClosureBackendRequested) v7.r("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_", portfolioId5, eVar.f308816b);
                    default:
                        String portfolioId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId6, "portfolioId");
                        stg.a aVarA = eVar.d.a(portfolioId6);
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        boolean z3 = aVarA.f265582c;
                        String str7 = aVarA.d;
                        if (str7 != null && (str = aVarA.e) != null && (str2 = aVarA.f) != null) {
                            accountClosureBackendRequestedDetails = new AccountClosureBackendRequestedDetails(str7, str, str2);
                        }
                        return new AccountClosureBackendRequested(z3, accountClosureBackendRequestedDetails);
                }
            }
        }), null, null, null, null, null, null, null, 254);
        final int i21 = 3;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: xtg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308811b;

            {
                this.f308811b = this;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                String str2;
                int i22 = i21;
                int i32 = 10;
                AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = null;
                e eVar = this.f308811b;
                switch (i22) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (AccountClosureProgress) v7.r("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY", portfolioId, eVar.f308816b);
                    case 1:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.b bVarB = eVar.f308817c.b(portfolioId2);
                        if (bVarB == null) {
                            return null;
                        }
                        Object obj3 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        String str3 = bVarB.f265584a;
                        h4l.c cVar = (h4l.c) u1.v(bVarB.f265585b, utg.b.f283100a);
                        if (cVar == null) {
                            cVar = h4l.c.UNKNOWN;
                        }
                        h4l.c cVar2 = cVar;
                        String str4 = bVarB.f265586c;
                        Instant instant = bVarB.d;
                        Instant instant2 = bVarB.e;
                        h4l.b bVar = (h4l.b) u1.v(bVarB.f, utg.b.f283102c);
                        if (bVar == null) {
                            bVar = h4l.b.UNKNOWN;
                        }
                        h4l.b bVar2 = bVar;
                        String str5 = bVarB.f265587g;
                        String str6 = bVarB.f265588h;
                        boolean z = bVarB.f265590l;
                        AccountClosureProgressStep accountClosureProgressStepA = utg.b.a(bVarB.i);
                        List list = bVarB.f265589j;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(utg.b.a((stg.c) it8.next()));
                        }
                        List list2 = bVarB.k;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(utg.b.a((stg.c) it9.next()));
                        }
                        return new AccountClosureProgress(str3, cVar2, str4, instant, instant2, bVar2, str5, str6, accountClosureProgressStepA, arrayList, arrayList2, z, bVarB.f265591m);
                    case 2:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        d0<r> accountClosurePreconditions = eVar.f308815a.getAccountClosurePreconditions(portfolioId3);
                        xt1.a aVar = new xt1.a(i32, new c(eVar, portfolioId3, 2));
                        accountClosurePreconditions.getClass();
                        i iVar = new i(accountClosurePreconditions, aVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 3:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        d0<wtg.f> backendRequestedAccountClosureById = eVar.f308815a.getBackendRequestedAccountClosureById(portfolioId4);
                        xt1.a aVar2 = new xt1.a(7, new xrl.a(19));
                        backendRequestedAccountClosureById.getClass();
                        i iVar2 = new i(backendRequestedAccountClosureById, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        return (AccountClosureBackendRequested) v7.r("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_", portfolioId5, eVar.f308816b);
                    default:
                        String portfolioId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId6, "portfolioId");
                        stg.a aVarA = eVar.d.a(portfolioId6);
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        boolean z3 = aVarA.f265582c;
                        String str7 = aVarA.d;
                        if (str7 != null && (str = aVarA.e) != null && (str2 = aVarA.f) != null) {
                            accountClosureBackendRequestedDetails = new AccountClosureBackendRequestedDetails(str7, str, str2);
                        }
                        return new AccountClosureBackendRequested(z3, accountClosureBackendRequestedDetails);
                }
            }
        });
        final int i22 = 4;
        Function1 function13 = new Function1(this) { // from class: xtg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308811b;

            {
                this.f308811b = this;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                String str2;
                int i222 = i22;
                int i32 = 10;
                AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = null;
                e eVar = this.f308811b;
                switch (i222) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (AccountClosureProgress) v7.r("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY", portfolioId, eVar.f308816b);
                    case 1:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.b bVarB = eVar.f308817c.b(portfolioId2);
                        if (bVarB == null) {
                            return null;
                        }
                        Object obj3 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        String str3 = bVarB.f265584a;
                        h4l.c cVar = (h4l.c) u1.v(bVarB.f265585b, utg.b.f283100a);
                        if (cVar == null) {
                            cVar = h4l.c.UNKNOWN;
                        }
                        h4l.c cVar2 = cVar;
                        String str4 = bVarB.f265586c;
                        Instant instant = bVarB.d;
                        Instant instant2 = bVarB.e;
                        h4l.b bVar = (h4l.b) u1.v(bVarB.f, utg.b.f283102c);
                        if (bVar == null) {
                            bVar = h4l.b.UNKNOWN;
                        }
                        h4l.b bVar2 = bVar;
                        String str5 = bVarB.f265587g;
                        String str6 = bVarB.f265588h;
                        boolean z = bVarB.f265590l;
                        AccountClosureProgressStep accountClosureProgressStepA = utg.b.a(bVarB.i);
                        List list = bVarB.f265589j;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(utg.b.a((stg.c) it8.next()));
                        }
                        List list2 = bVarB.k;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(utg.b.a((stg.c) it9.next()));
                        }
                        return new AccountClosureProgress(str3, cVar2, str4, instant, instant2, bVar2, str5, str6, accountClosureProgressStepA, arrayList, arrayList2, z, bVarB.f265591m);
                    case 2:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        d0<r> accountClosurePreconditions = eVar.f308815a.getAccountClosurePreconditions(portfolioId3);
                        xt1.a aVar = new xt1.a(i32, new c(eVar, portfolioId3, 2));
                        accountClosurePreconditions.getClass();
                        i iVar = new i(accountClosurePreconditions, aVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 3:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        d0<wtg.f> backendRequestedAccountClosureById = eVar.f308815a.getBackendRequestedAccountClosureById(portfolioId4);
                        xt1.a aVar2 = new xt1.a(7, new xrl.a(19));
                        backendRequestedAccountClosureById.getClass();
                        i iVar2 = new i(backendRequestedAccountClosureById, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        return (AccountClosureBackendRequested) v7.r("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_", portfolioId5, eVar.f308816b);
                    default:
                        String portfolioId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId6, "portfolioId");
                        stg.a aVarA = eVar.d.a(portfolioId6);
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        boolean z3 = aVarA.f265582c;
                        String str7 = aVarA.d;
                        if (str7 != null && (str = aVarA.e) != null && (str2 = aVarA.f) != null) {
                            accountClosureBackendRequestedDetails = new AccountClosureBackendRequestedDetails(str7, str, str2);
                        }
                        return new AccountClosureBackendRequested(z3, accountClosureBackendRequestedDetails);
                }
            }
        };
        Function2 function23 = new Function2(this) { // from class: xtg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308809b;

            {
                this.f308809b = this;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i22;
                int i32 = 0;
                int i59 = 1;
                e eVar = this.f308809b;
                switch (i222) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<z> accountClosureProgress = eVar.f308815a.getAccountClosureProgress(portfolioId);
                        xt1.a aVar = new xt1.a(8, new c(eVar, portfolioId, i32));
                        accountClosureProgress.getClass();
                        ufm.f fVar = new ufm.f(new i(accountClosureProgress, aVar, 1), new xt1.a(9, new c(eVar, portfolioId, i59)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 1:
                        qtg.a aVar2 = eVar.d;
                        String portfolioId2 = (String) obj2;
                        AccountClosureBackendRequested lastOnboardedPortfolioStatus = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "lastOnboardedPortfolioStatus");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "<this>");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        boolean z = lastOnboardedPortfolioStatus.f104483a;
                        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = lastOnboardedPortfolioStatus.f104484b;
                        String str = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104485a : null;
                        String str2 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104486b : null;
                        String str3 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104487c : null;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.a aVarA = aVar2.a(portfolioId2);
                        boolean z3 = aVarA != null && aVarA.f265583g;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        aVar2.b(new stg.a(portfolioId2, str, str2, z, 0, str3, z3));
                        break;
                    case 2:
                        String portfolioId3 = (String) obj2;
                        AccountClosureProgress data = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY" + portfolioId3, data);
                        break;
                    case 3:
                        AccountClosureProgress data2 = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        qtg.c cVar = eVar.f308817c;
                        Object obj4 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        String str4 = data2.f104488a;
                        String strH = u1.h(data2.f104489b, utg.b.f283100a);
                        if (strH == null) {
                            strH = "";
                        }
                        String str5 = strH;
                        String str6 = data2.f104490c;
                        Instant instant = data2.d;
                        Instant instant2 = data2.e;
                        String strG = u1.g(data2.f, utg.b.f283102c);
                        String str7 = data2.f104491g;
                        String str8 = data2.f104492h;
                        boolean z4 = data2.f104494l;
                        stg.c cVarC = utg.b.c(data2.i);
                        ArrayList arrayList = data2.f104493j;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(utg.b.c((AccountClosureProgressStep) it8.next()));
                        }
                        ArrayList arrayList3 = data2.k;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(utg.b.c((AccountClosureProgressStep) it9.next()));
                        }
                        cVar.d(new stg.b(str4, str5, str6, instant, instant2, strG, str7, str8, cVarC, arrayList2, arrayList4, z4, data2.f104495m));
                        break;
                    default:
                        String portfolioId4 = (String) obj2;
                        AccountClosureBackendRequested data3 = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_" + portfolioId4, data3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i32 = 5;
        Function1 function14 = new Function1(this) { // from class: xtg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308811b;

            {
                this.f308811b = this;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                String str2;
                int i222 = i32;
                int i322 = 10;
                AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = null;
                e eVar = this.f308811b;
                switch (i222) {
                    case 0:
                        String portfolioId = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (AccountClosureProgress) v7.r("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY", portfolioId, eVar.f308816b);
                    case 1:
                        String portfolioId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.b bVarB = eVar.f308817c.b(portfolioId2);
                        if (bVarB == null) {
                            return null;
                        }
                        Object obj3 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(bVarB, "<this>");
                        String str3 = bVarB.f265584a;
                        h4l.c cVar = (h4l.c) u1.v(bVarB.f265585b, utg.b.f283100a);
                        if (cVar == null) {
                            cVar = h4l.c.UNKNOWN;
                        }
                        h4l.c cVar2 = cVar;
                        String str4 = bVarB.f265586c;
                        Instant instant = bVarB.d;
                        Instant instant2 = bVarB.e;
                        h4l.b bVar = (h4l.b) u1.v(bVarB.f, utg.b.f283102c);
                        if (bVar == null) {
                            bVar = h4l.b.UNKNOWN;
                        }
                        h4l.b bVar2 = bVar;
                        String str5 = bVarB.f265587g;
                        String str6 = bVarB.f265588h;
                        boolean z = bVarB.f265590l;
                        AccountClosureProgressStep accountClosureProgressStepA = utg.b.a(bVarB.i);
                        List list = bVarB.f265589j;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(utg.b.a((stg.c) it8.next()));
                        }
                        List list2 = bVarB.k;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(utg.b.a((stg.c) it9.next()));
                        }
                        return new AccountClosureProgress(str3, cVar2, str4, instant, instant2, bVar2, str5, str6, accountClosureProgressStepA, arrayList, arrayList2, z, bVarB.f265591m);
                    case 2:
                        String portfolioId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        d0<r> accountClosurePreconditions = eVar.f308815a.getAccountClosurePreconditions(portfolioId3);
                        xt1.a aVar = new xt1.a(i322, new c(eVar, portfolioId3, 2));
                        accountClosurePreconditions.getClass();
                        i iVar = new i(accountClosurePreconditions, aVar, 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 3:
                        String portfolioId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        d0<wtg.f> backendRequestedAccountClosureById = eVar.f308815a.getBackendRequestedAccountClosureById(portfolioId4);
                        xt1.a aVar2 = new xt1.a(7, new xrl.a(19));
                        backendRequestedAccountClosureById.getClass();
                        i iVar2 = new i(backendRequestedAccountClosureById, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        String portfolioId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId5, "portfolioId");
                        return (AccountClosureBackendRequested) v7.r("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_", portfolioId5, eVar.f308816b);
                    default:
                        String portfolioId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(portfolioId6, "portfolioId");
                        stg.a aVarA = eVar.d.a(portfolioId6);
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        boolean z3 = aVarA.f265582c;
                        String str7 = aVarA.d;
                        if (str7 != null && (str = aVarA.e) != null && (str2 = aVarA.f) != null) {
                            accountClosureBackendRequestedDetails = new AccountClosureBackendRequestedDetails(str7, str, str2);
                        }
                        return new AccountClosureBackendRequested(z3, accountClosureBackendRequestedDetails);
                }
            }
        };
        final int i33 = 1;
        this.f308819h = new f(bVarK0, function13, function23, function14, new Function2(this) { // from class: xtg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f308809b;

            {
                this.f308809b = this;
            }

            /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i222 = i33;
                int i322 = 0;
                int i59 = 1;
                e eVar = this.f308809b;
                switch (i222) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        String portfolioId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        d0<z> accountClosureProgress = eVar.f308815a.getAccountClosureProgress(portfolioId);
                        xt1.a aVar = new xt1.a(8, new c(eVar, portfolioId, i322));
                        accountClosureProgress.getClass();
                        ufm.f fVar = new ufm.f(new i(accountClosureProgress, aVar, 1), new xt1.a(9, new c(eVar, portfolioId, i59)), 1);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
                        break;
                    case 1:
                        qtg.a aVar2 = eVar.d;
                        String portfolioId2 = (String) obj2;
                        AccountClosureBackendRequested lastOnboardedPortfolioStatus = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "lastOnboardedPortfolioStatus");
                        Intrinsics.checkNotNullParameter(lastOnboardedPortfolioStatus, "<this>");
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        boolean z = lastOnboardedPortfolioStatus.f104483a;
                        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = lastOnboardedPortfolioStatus.f104484b;
                        String str = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104485a : null;
                        String str2 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104486b : null;
                        String str3 = accountClosureBackendRequestedDetails != null ? accountClosureBackendRequestedDetails.f104487c : null;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        stg.a aVarA = aVar2.a(portfolioId2);
                        boolean z3 = aVarA != null && aVarA.f265583g;
                        Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                        aVar2.b(new stg.a(portfolioId2, str, str2, z, 0, str3, z3));
                        break;
                    case 2:
                        String portfolioId3 = (String) obj2;
                        AccountClosureProgress data = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_PROGRESS_MEM_KEY" + portfolioId3, data);
                        break;
                    case 3:
                        AccountClosureProgress data2 = (AccountClosureProgress) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        qtg.c cVar = eVar.f308817c;
                        Object obj4 = utg.b.f283100a;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        String str4 = data2.f104488a;
                        String strH = u1.h(data2.f104489b, utg.b.f283100a);
                        if (strH == null) {
                            strH = "";
                        }
                        String str5 = strH;
                        String str6 = data2.f104490c;
                        Instant instant = data2.d;
                        Instant instant2 = data2.e;
                        String strG = u1.g(data2.f, utg.b.f283102c);
                        String str7 = data2.f104491g;
                        String str8 = data2.f104492h;
                        boolean z4 = data2.f104494l;
                        stg.c cVarC = utg.b.c(data2.i);
                        ArrayList arrayList = data2.f104493j;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(utg.b.c((AccountClosureProgressStep) it8.next()));
                        }
                        ArrayList arrayList3 = data2.k;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(utg.b.c((AccountClosureProgressStep) it9.next()));
                        }
                        cVar.d(new stg.b(str4, str5, str6, instant, instant2, strG, str7, str8, cVarC, arrayList2, arrayList4, z4, data2.f104495m));
                        break;
                    default:
                        String portfolioId4 = (String) obj2;
                        AccountClosureBackendRequested data3 = (AccountClosureBackendRequested) obj3;
                        Intrinsics.checkNotNullParameter(portfolioId4, "portfolioId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        eVar.f308816b.f("ACCOUNT_CLOSURE_BACKEND_REQUESTED_MEM_KEY_" + portfolioId4, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
