package aed;

import a7b.r;
import androidx.room.util.DBUtil;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.retail.savings.api.SavingsAccountApi$Toggles;
import com.revolut.feature.shared.vaults.domain.impl.data.network.VaultsService;
import efm.d0;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import pcd.q;
import pcd.s;
import pcd.v;
import pcd.x;
import pcd.y;
import skm.p0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements qdd.a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Type f3545p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultsService f3546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wdd.a f3547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sdd.a f3548c;
    public final ne0.j d;
    public final com.revolut.feature.shared.savings.impl.core.error.c e;
    public final dqg.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dqg.h f3549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ne0.j f3550h;
    public final ne0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ue0.c f3551j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f3552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f3553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f3554n;
    public final w4l.f o;

    static {
        Type type = new TypeToken<List<? extends vdd.j>>() { // from class: com.revolut.feature.shared.vaults.domain.impl.data.repository.VaultsRepositoryImpl$Companion$PENDING_INTENT_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f3545p = type;
    }

    public o(VaultsService service, wdd.a dataProvider, sdd.a transactionsExtraDao, ne0.j memoryCache, com.revolut.feature.shared.savings.impl.core.error.c savingsErrorInterceptor, dqg.g vaultsAvailabilityProvider, dqg.h vaultsFetchingApiProvider, ne0.j vaultsMemoryCache, ne0.j completeVaultAccountTypesMemoryCache, ue0.c vaultsStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(transactionsExtraDao, "transactionsExtraDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(savingsErrorInterceptor, "savingsErrorInterceptor");
        Intrinsics.checkNotNullParameter(vaultsAvailabilityProvider, "vaultsAvailabilityProvider");
        Intrinsics.checkNotNullParameter(vaultsFetchingApiProvider, "vaultsFetchingApiProvider");
        Intrinsics.checkNotNullParameter(vaultsMemoryCache, "vaultsMemoryCache");
        Intrinsics.checkNotNullParameter(completeVaultAccountTypesMemoryCache, "completeVaultAccountTypesMemoryCache");
        Intrinsics.checkNotNullParameter(vaultsStorage, "vaultsStorage");
        this.f3546a = service;
        this.f3547b = dataProvider;
        this.f3548c = transactionsExtraDao;
        this.d = memoryCache;
        this.e = savingsErrorInterceptor;
        this.f = vaultsAvailabilityProvider;
        this.f3549g = vaultsFetchingApiProvider;
        this.f3550h = vaultsMemoryCache;
        this.i = completeVaultAccountTypesMemoryCache;
        this.f3551j = vaultsStorage;
        this.k = new Object();
        final int i = 0;
        final int i2 = 7;
        final int i3 = 8;
        this.f3552l = new w4l.f(new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i5 = 21;
                int i6 = 0;
                int i21 = 1;
                switch (i) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i5);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i6), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i21);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i5), i6);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 11), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i5 = 21;
                int i6 = 0;
                int i21 = 1;
                switch (i2) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i5);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i6), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i21);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i5), i6);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 12), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i5 = 21;
                int i6 = 0;
                int i21 = 1;
                switch (i3) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i5);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i6), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i21);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i5), i6);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 9;
        final int i6 = 10;
        final int i21 = 11;
        this.f3553m = new w4l.f(new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i59 = 21;
                int i66 = 0;
                int i212 = 1;
                switch (i5) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i59);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i66), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i59), i66);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 13), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i59 = 21;
                int i66 = 0;
                int i212 = 1;
                switch (i6) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i59);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i66), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i59), i66);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 14), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i59 = 21;
                int i66 = 0;
                int i212 = 1;
                switch (i21) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i59);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i66), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i59), i66);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        final int i32 = 2;
        final int i33 = 3;
        this.f3554n = new w4l.f(new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i59 = 21;
                int i66 = 0;
                int i212 = 1;
                switch (i22) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i59);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i66), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i59), i66);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 7), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i59 = 21;
                int i66 = 0;
                int i212 = 1;
                switch (i32) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i59);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i66), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i59), i66);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 8), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i59 = 21;
                int i66 = 0;
                int i212 = 1;
                switch (i33) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i59);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i66), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i59), i66);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 4;
        final int i59 = 5;
        final int i66 = 6;
        this.o = new w4l.f(new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i592 = 21;
                int i662 = 0;
                int i212 = 1;
                switch (i43) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i592);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i662), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i592), i662);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 9), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i592 = 21;
                int i662 = 0;
                int i212 = 1;
                switch (i59) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i592);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i662), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i592), i662);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, new b(this, 10), new Function2(this) { // from class: aed.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f3532b;

            {
                this.f3532b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strName = null;
                int i592 = 21;
                int i662 = 0;
                int i212 = 1;
                switch (i66) {
                    case 0:
                        o oVar = this.f3532b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        i params = (i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        VaultsService vaultsService = oVar.f3546a;
                        pcd.b bVar = params.f3537a;
                        boolean zC = ((jte.d) oVar.f3549g.f116988a).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c);
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        if (ydd.a.f312678c[bVar.ordinal()] != 1 || !zC) {
                            strName = bVar.name();
                        }
                        d0<List<zdd.i>> moneyBoxesByAccountType = vaultsService.getMoneyBoxesByAccountType(strName);
                        a9j.j jVar = new a9j.j(new r(params, 20), i592);
                        moneyBoxesByAccountType.getClass();
                        ufm.i iVar = new ufm.i(moneyBoxesByAccountType, jVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        o oVar2 = this.f3532b;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<zdd.o>> pendingInvites = oVar2.f3546a.getPendingInvites();
                        a9j.j jVar2 = new a9j.j(new a(i662), 16);
                        pendingInvites.getClass();
                        ufm.i iVar2 = new ufm.i(pendingInvites, jVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 2:
                        o oVar3 = this.f3532b;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list, "list");
                        oVar3.d.f("CACHE_KEY_PENDING_INVITE", list);
                        return Unit.f186387a;
                    case 3:
                        o oVar4 = this.f3532b;
                        List list2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list2, "list");
                        ue0.c cVar = oVar4.f3551j;
                        List<v> list3 = list2;
                        ArrayList arrayList = new ArrayList(w.t(list3, 10));
                        for (v vVar : list3) {
                            Intrinsics.checkNotNullParameter(vVar, "<this>");
                            String str = vVar.f234899a;
                            String str2 = vVar.f234900b;
                            vdd.k kVarN = ydd.b.n(vVar.d);
                            String str3 = vVar.f234901c.f306286a;
                            ArrayList arrayList2 = vVar.e;
                            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(ydd.b.n((x) it9.next()));
                            }
                            arrayList.add(new vdd.j(str, str2, str3, kVarN, arrayList3));
                        }
                        cVar.G(arrayList, "STORAGE_KEY_PENDING_INVITE", kii.e.o(vdd.j.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 4:
                        o oVar5 = this.f3532b;
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String txnId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(txnId, "txnId");
                        d0<zdd.c> transactionExtraData = oVar5.f3546a.getTransactionExtraData(txnId);
                        f fVar = new f(new a(2), i212);
                        transactionExtraData.getClass();
                        ufm.i iVar3 = new ufm.i(transactionExtraData, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 5:
                        o oVar6 = this.f3532b;
                        String txnId2 = (String) obj2;
                        q transactionExtra = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId2, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra, "transactionExtra");
                        oVar6.d.f("moneybox_transaction_extra_" + txnId2, transactionExtra);
                        return Unit.f186387a;
                    case 6:
                        o oVar7 = this.f3532b;
                        String txnId3 = (String) obj2;
                        q transactionExtra2 = (q) obj3;
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        Intrinsics.checkNotNullParameter(transactionExtra2, "transactionExtra");
                        sdd.a aVar = oVar7.f3548c;
                        Intrinsics.checkNotNullParameter(transactionExtra2, "<this>");
                        Intrinsics.checkNotNullParameter(txnId3, "txnId");
                        LocalDateTime localDateTime = transactionExtra2.f234878a;
                        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                        LocalDateTime localDateTime2 = transactionExtra2.f234879b;
                        vdd.f fVar2 = new vdd.f(txnId3, lValueOf, localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null);
                        aVar.getClass();
                        DBUtil.performBlocking(aVar.f261854a, false, true, new s31.a(aVar, fVar2, 27));
                        return Unit.f186387a;
                    case 7:
                        o oVar8 = this.f3532b;
                        i params2 = (i) obj2;
                        List newMoneyBoxes = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(newMoneyBoxes, "newMoneyBoxes");
                        pcd.b bVar2 = params2.f3537a;
                        synchronized (oVar8.k) {
                            try {
                                ne0.j jVar3 = oVar8.f3550h;
                                List all2 = jVar3.getAll();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : all2) {
                                    if (((s) obj4).f234889n != bVar2) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                jVar3.t1(zhm.d0.E0(newMoneyBoxes, arrayList4), new h0() { // from class: aed.m
                                    @Override // kotlin.jvm.internal.h0, wim.p
                                    public final Object get(Object obj5) {
                                        return ((s) obj5).f234881a;
                                    }
                                });
                                oVar8.i.f(bVar2.name(), Boolean.TRUE);
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        oVar8.f3553m.c(null, (1 & 2) == 0, new a26.j(newMoneyBoxes, oVar8));
                        return Unit.f186387a;
                    case 8:
                        o oVar9 = this.f3532b;
                        i params3 = (i) obj2;
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        wdd.a aVar2 = oVar9.f3547b;
                        pcd.b accountType = params3.f3537a;
                        List list5 = list4;
                        ArrayList items = new ArrayList(w.t(list5, 10));
                        Iterator it10 = list5.iterator();
                        while (it10.hasNext()) {
                            items.add(ydd.b.m((s) it10.next()));
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(items, "items");
                        aVar2.a().k(accountType, items);
                        return Unit.f186387a;
                    case 9:
                        o oVar10 = this.f3532b;
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        h params4 = (h) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        d0<zdd.i> moneyBoxById = oVar10.f3546a.getMoneyBoxById(params4.f3535a);
                        f fVar3 = new f(new r(params4, i592), i662);
                        moneyBoxById.getClass();
                        ufm.i iVar4 = new ufm.i(moneyBoxById, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 10:
                        o oVar11 = this.f3532b;
                        h params5 = (h) obj2;
                        s vault = (s) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        synchronized (oVar11.k) {
                            oVar11.f3550h.f(vault.f234881a, vault);
                            Unit unit2 = Unit.f186387a;
                        }
                        oVar11.f3552l.c(null, (1 & 2) == 0, new acb.f(vault, oVar11, 12));
                        oVar11.f3553m.c(null, (1 & 2) == 0, new acb.f(params5, 11, oVar11, vault));
                        return Unit.f186387a;
                    default:
                        o oVar12 = this.f3532b;
                        s vault2 = (s) obj3;
                        Intrinsics.checkNotNullParameter((h) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(vault2, "vault");
                        wdd.a aVar3 = oVar12.f3547b;
                        vdd.i item = ydd.b.m(vault2);
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(item, "item");
                        aVar3.a().l(item);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(aed.o r4, pcd.s r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof aed.l
            if (r0 == 0) goto L16
            r0 = r6
            aed.l r0 = (aed.l) r0
            int r1 = r0.f3544w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3544w = r1
            goto L1b
        L16:
            aed.l r0 = new aed.l
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3544w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            pcd.k0 r6 = pcd.l0.Companion
            r6.getClass()
            java.util.Set r6 = pcd.l0.a()
            pcd.l0 r5 = r5.e
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L5e
            dqg.g r4 = r4.f
            r0.f3544w = r3
            gr6.e r4 = r4.f116985a
            et6.l0 r4 = (et6.l0) r4
            java.lang.Object r6 = r4.h(r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 != 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aed.o.a(aed.o, pcd.s, gim.c):java.lang.Object");
    }

    public final pfm.r b(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        return te0.w.g0(this.f3546a.declineInvite(vaultId));
    }

    public final s c(String str) {
        Object next;
        ne0.j jVar = this.f3550h;
        s sVar = (s) jVar.get(str);
        if (sVar != null) {
            return sVar;
        }
        Iterator it8 = jVar.getAll().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((s) next).f234882b, str)) {
                break;
            }
        }
        return (s) next;
    }

    public final d0 d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "vaultId");
        s sVarC = c(id10);
        if (sVarC != null) {
            ufm.i iVar = new ufm.i(te0.w.o0(p0.f264003c, new k(this, sVarC, null, 0)), new a9j.j(new c(sVarC, 0), 18), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        wdd.a aVar = this.f3547b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        ufm.i iVar2 = new ufm.i(te0.w.i0(aVar.a().c(id10)), new a9j.j(new a(1), 19), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        ufm.i iVar3 = new ufm.i(iVar2, new a9j.j(new b(this, 1), 20), 0);
        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
        return te0.w.i0(iVar3);
    }

    public final efm.r e(boolean z) {
        return this.f3554n.f(Unit.f186387a, z);
    }

    public final pfm.r f(String vaultId, String memberId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        return te0.w.g0(this.f3546a.removeMember(vaultId, memberId));
    }

    public final pfm.r g(String vaultId, Map membersPermissions) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(membersPermissions, "membersPermissions");
        Intrinsics.checkNotNullParameter(membersPermissions, "<this>");
        ArrayList arrayList = new ArrayList(membersPermissions.size());
        for (Map.Entry entry : membersPermissions.entrySet()) {
            String str = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            ArrayList arrayList2 = new ArrayList(w.t(set, 10));
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                arrayList2.add(u1.g((y) it8.next(), ydd.b.d()));
            }
            arrayList.add(new zdd.n(str, arrayList2));
        }
        return te0.w.g0(this.f3546a.updatedMembers(vaultId, arrayList));
    }
}
