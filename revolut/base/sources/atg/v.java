package atg;

import aqd.h1;
import com.google.gson.reflect.TypeToken;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.feature.wallets.impl.network.WalletsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;
import le.u1;
import mif.e0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements qsg.b {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f9074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f9075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Type f9076n;
    public static final Type o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletsService f9077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f9078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f9079c;
    public final k d;
    public final i e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantReadWriteLock f9080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qe0.s f9081h;
    public final qe0.s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f9082j;
    public final w4l.f k;

    static {
        Type type = new TypeToken<List<? extends ysg.a>>() { // from class: com.revolut.feature.wallets.impl.repository.WalletsRepositoryImpl$Companion$LIST_OF_WALLET_LIMITS_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f9074l = type;
        f9075m = "WALLET_PROFILES_CACHE_KEY_%1$s";
        Type type2 = new TypeToken<List<? extends ysg.b>>() { // from class: com.revolut.feature.wallets.impl.repository.WalletsRepositoryImpl$Companion$WALLET_PROFILE_LIST_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f9076n = type2;
        Type type3 = new TypeToken<Map<String, ? extends Long>>() { // from class: com.revolut.feature.wallets.impl.repository.WalletsRepositoryImpl$Companion$CURRENCY_INFO_LIST_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        o = type3;
    }

    public v(WalletsService walletsService, ne0.d memoryCache, xe0.e storage, k pocketSorter, ze0.a forceReloadStrategyFactory, i allWalletsRepository, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(walletsService, "walletsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(pocketSorter, "pocketSorter");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        Intrinsics.checkNotNullParameter(allWalletsRepository, "allWalletsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f9077a = walletsService;
        this.f9078b = memoryCache;
        this.f9079c = storage;
        this.d = pocketSorter;
        this.e = allWalletsRepository;
        this.f = userInteractor;
        this.f9080g = new ReentrantReadWriteLock();
        ze0.c cVar = (ze0.c) forceReloadStrategyFactory;
        this.f9081h = cVar.b(MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS);
        this.i = cVar.b(MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: atg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f9066b;

            {
                this.f9066b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<zsg.c> walletLimits;
                String str;
                ysg.a aVar;
                int i2 = i;
                String str2 = "<this>";
                int i3 = 1;
                v vVar = this.f9066b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<zsg.d>> walletProfiles = vVar.f9077a.getWalletProfiles(registeredIdentityId);
                        n nVar = new n(i3, new arf.h(13));
                        walletProfiles.getClass();
                        ufm.i iVar = new ufm.i(walletProfiles, nVar, 1);
                        vVar.i.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        vVar.f9078b.f(r.a(v.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    case 2:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = vVar.f9079c;
                        String strA = r.a(v.Companion, registeredIdentityId3);
                        List<psg.a> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (psg.a aVar2 : list) {
                            Object obj4 = xsg.c.f308488a;
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList.add(new ysg.b(aVar2.f239484a, aVar2.f239485b, u1.g(aVar2.f239486c, xsg.c.f308489b), u1.g(aVar2.d, xsg.c.f308488a)));
                        }
                        eVar.G(arrayList, strA, kii.e.o(ysg.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        WalletsService walletsService2 = vVar.f9077a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        AccountId accountId = (AccountId) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        if (accountId instanceof AccountId.Personal) {
                            walletLimits = walletsService2.getWalletLimits(null);
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            walletLimits = walletsService2.getWalletLimits(((AccountId.Joint) accountId).f51413b);
                        }
                        u uVar = u.f;
                        a0.b bVar = new a0.b(16);
                        walletLimits.getClass();
                        ufm.i iVar2 = new ufm.i(walletLimits, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        AccountId accountId2 = (AccountId) obj2;
                        List walletLimits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits2, "walletLimits");
                        ne0.d dVar = vVar.f9078b;
                        v.Companion.getClass();
                        dVar.f(r.b(accountId2, "CACHE_KEY_WALLET_LIMITS"), walletLimits2);
                        return Unit.f186387a;
                    default:
                        AccountId accountId3 = (AccountId) obj2;
                        List walletLimits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId3, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits3, "walletLimits");
                        List<WalletLimit> list2 = walletLimits3;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (WalletLimit walletLimit : list2) {
                            Intrinsics.checkNotNullParameter(walletLimit, str2);
                            if (walletLimit instanceof WalletLimit.CounterLimit) {
                                WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) walletLimit;
                                String strA2 = counterLimit.f94845b.a();
                                String strA3 = counterLimit.f94844a.a();
                                dj0.d dVar2 = counterLimit.f94846c;
                                String str3 = dVar2.f115083b.f306286a;
                                long j2 = dVar2.f115082a;
                                dj0.d dVar3 = counterLimit.d;
                                str = str2;
                                aVar = new ysg.a("counter", strA2, strA3, str3, j2, dVar3 != null ? Long.valueOf(dVar3.f115082a) : null, counterLimit.e.f115082a);
                            } else {
                                str = str2;
                                if (!(walletLimit instanceof WalletLimit.TransactionLimit)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WalletLimit.TransactionLimit transactionLimit = (WalletLimit.TransactionLimit) walletLimit;
                                String strA4 = transactionLimit.f94847a.a();
                                dj0.d dVar4 = transactionLimit.f94848b;
                                aVar = new ysg.a("transaction", "", strA4, dVar4.f115083b.f306286a, 0L, null, dVar4.f115082a);
                            }
                            arrayList2.add(aVar);
                            str2 = str;
                        }
                        xe0.e eVar2 = vVar.f9079c;
                        v.Companion.getClass();
                        eVar2.G(arrayList2, r.b(accountId3, "CACHE_KEY_WALLET_LIMITS"), kii.e.o(ysg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        m mVar = new m(this, i2);
        Function2 function22 = new Function2(this) { // from class: atg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f9066b;

            {
                this.f9066b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<zsg.c> walletLimits;
                String str;
                ysg.a aVar;
                int i22 = i2;
                String str2 = "<this>";
                int i3 = 1;
                v vVar = this.f9066b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<zsg.d>> walletProfiles = vVar.f9077a.getWalletProfiles(registeredIdentityId);
                        n nVar = new n(i3, new arf.h(13));
                        walletProfiles.getClass();
                        ufm.i iVar = new ufm.i(walletProfiles, nVar, 1);
                        vVar.i.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        vVar.f9078b.f(r.a(v.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    case 2:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = vVar.f9079c;
                        String strA = r.a(v.Companion, registeredIdentityId3);
                        List<psg.a> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (psg.a aVar2 : list) {
                            Object obj4 = xsg.c.f308488a;
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList.add(new ysg.b(aVar2.f239484a, aVar2.f239485b, u1.g(aVar2.f239486c, xsg.c.f308489b), u1.g(aVar2.d, xsg.c.f308488a)));
                        }
                        eVar.G(arrayList, strA, kii.e.o(ysg.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        WalletsService walletsService2 = vVar.f9077a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        AccountId accountId = (AccountId) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        if (accountId instanceof AccountId.Personal) {
                            walletLimits = walletsService2.getWalletLimits(null);
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            walletLimits = walletsService2.getWalletLimits(((AccountId.Joint) accountId).f51413b);
                        }
                        u uVar = u.f;
                        a0.b bVar = new a0.b(16);
                        walletLimits.getClass();
                        ufm.i iVar2 = new ufm.i(walletLimits, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        AccountId accountId2 = (AccountId) obj2;
                        List walletLimits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits2, "walletLimits");
                        ne0.d dVar = vVar.f9078b;
                        v.Companion.getClass();
                        dVar.f(r.b(accountId2, "CACHE_KEY_WALLET_LIMITS"), walletLimits2);
                        return Unit.f186387a;
                    default:
                        AccountId accountId3 = (AccountId) obj2;
                        List walletLimits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId3, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits3, "walletLimits");
                        List<WalletLimit> list2 = walletLimits3;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (WalletLimit walletLimit : list2) {
                            Intrinsics.checkNotNullParameter(walletLimit, str2);
                            if (walletLimit instanceof WalletLimit.CounterLimit) {
                                WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) walletLimit;
                                String strA2 = counterLimit.f94845b.a();
                                String strA3 = counterLimit.f94844a.a();
                                dj0.d dVar2 = counterLimit.f94846c;
                                String str3 = dVar2.f115083b.f306286a;
                                long j2 = dVar2.f115082a;
                                dj0.d dVar3 = counterLimit.d;
                                str = str2;
                                aVar = new ysg.a("counter", strA2, strA3, str3, j2, dVar3 != null ? Long.valueOf(dVar3.f115082a) : null, counterLimit.e.f115082a);
                            } else {
                                str = str2;
                                if (!(walletLimit instanceof WalletLimit.TransactionLimit)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WalletLimit.TransactionLimit transactionLimit = (WalletLimit.TransactionLimit) walletLimit;
                                String strA4 = transactionLimit.f94847a.a();
                                dj0.d dVar4 = transactionLimit.f94848b;
                                aVar = new ysg.a("transaction", "", strA4, dVar4.f115083b.f306286a, 0L, null, dVar4.f115082a);
                            }
                            arrayList2.add(aVar);
                            str2 = str;
                        }
                        xe0.e eVar2 = vVar.f9079c;
                        v.Companion.getClass();
                        eVar2.G(arrayList2, r.b(accountId3, "CACHE_KEY_WALLET_LIMITS"), kii.e.o(ysg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        this.f9082j = new w4l.f(function2, mVar, function22, new m(this, i3), new Function2(this) { // from class: atg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f9066b;

            {
                this.f9066b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<zsg.c> walletLimits;
                String str;
                ysg.a aVar;
                int i22 = i3;
                String str2 = "<this>";
                int i32 = 1;
                v vVar = this.f9066b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<zsg.d>> walletProfiles = vVar.f9077a.getWalletProfiles(registeredIdentityId);
                        n nVar = new n(i32, new arf.h(13));
                        walletProfiles.getClass();
                        ufm.i iVar = new ufm.i(walletProfiles, nVar, 1);
                        vVar.i.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        vVar.f9078b.f(r.a(v.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    case 2:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = vVar.f9079c;
                        String strA = r.a(v.Companion, registeredIdentityId3);
                        List<psg.a> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (psg.a aVar2 : list) {
                            Object obj4 = xsg.c.f308488a;
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList.add(new ysg.b(aVar2.f239484a, aVar2.f239485b, u1.g(aVar2.f239486c, xsg.c.f308489b), u1.g(aVar2.d, xsg.c.f308488a)));
                        }
                        eVar.G(arrayList, strA, kii.e.o(ysg.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        WalletsService walletsService2 = vVar.f9077a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        AccountId accountId = (AccountId) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        if (accountId instanceof AccountId.Personal) {
                            walletLimits = walletsService2.getWalletLimits(null);
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            walletLimits = walletsService2.getWalletLimits(((AccountId.Joint) accountId).f51413b);
                        }
                        u uVar = u.f;
                        a0.b bVar = new a0.b(16);
                        walletLimits.getClass();
                        ufm.i iVar2 = new ufm.i(walletLimits, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        AccountId accountId2 = (AccountId) obj2;
                        List walletLimits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits2, "walletLimits");
                        ne0.d dVar = vVar.f9078b;
                        v.Companion.getClass();
                        dVar.f(r.b(accountId2, "CACHE_KEY_WALLET_LIMITS"), walletLimits2);
                        return Unit.f186387a;
                    default:
                        AccountId accountId3 = (AccountId) obj2;
                        List walletLimits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId3, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits3, "walletLimits");
                        List<WalletLimit> list2 = walletLimits3;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (WalletLimit walletLimit : list2) {
                            Intrinsics.checkNotNullParameter(walletLimit, str2);
                            if (walletLimit instanceof WalletLimit.CounterLimit) {
                                WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) walletLimit;
                                String strA2 = counterLimit.f94845b.a();
                                String strA3 = counterLimit.f94844a.a();
                                dj0.d dVar2 = counterLimit.f94846c;
                                String str3 = dVar2.f115083b.f306286a;
                                long j2 = dVar2.f115082a;
                                dj0.d dVar3 = counterLimit.d;
                                str = str2;
                                aVar = new ysg.a("counter", strA2, strA3, str3, j2, dVar3 != null ? Long.valueOf(dVar3.f115082a) : null, counterLimit.e.f115082a);
                            } else {
                                str = str2;
                                if (!(walletLimit instanceof WalletLimit.TransactionLimit)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WalletLimit.TransactionLimit transactionLimit = (WalletLimit.TransactionLimit) walletLimit;
                                String strA4 = transactionLimit.f94847a.a();
                                dj0.d dVar4 = transactionLimit.f94848b;
                                aVar = new ysg.a("transaction", "", strA4, dVar4.f115083b.f306286a, 0L, null, dVar4.f115082a);
                            }
                            arrayList2.add(aVar);
                            str2 = str;
                        }
                        xe0.e eVar2 = vVar.f9079c;
                        v.Companion.getClass();
                        eVar2.G(arrayList2, r.b(accountId3, "CACHE_KEY_WALLET_LIMITS"), kii.e.o(ysg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 3;
        Function2 function23 = new Function2(this) { // from class: atg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f9066b;

            {
                this.f9066b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<zsg.c> walletLimits;
                String str;
                ysg.a aVar;
                int i22 = i5;
                String str2 = "<this>";
                int i32 = 1;
                v vVar = this.f9066b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<zsg.d>> walletProfiles = vVar.f9077a.getWalletProfiles(registeredIdentityId);
                        n nVar = new n(i32, new arf.h(13));
                        walletProfiles.getClass();
                        ufm.i iVar = new ufm.i(walletProfiles, nVar, 1);
                        vVar.i.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        vVar.f9078b.f(r.a(v.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    case 2:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = vVar.f9079c;
                        String strA = r.a(v.Companion, registeredIdentityId3);
                        List<psg.a> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (psg.a aVar2 : list) {
                            Object obj4 = xsg.c.f308488a;
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList.add(new ysg.b(aVar2.f239484a, aVar2.f239485b, u1.g(aVar2.f239486c, xsg.c.f308489b), u1.g(aVar2.d, xsg.c.f308488a)));
                        }
                        eVar.G(arrayList, strA, kii.e.o(ysg.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        WalletsService walletsService2 = vVar.f9077a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        AccountId accountId = (AccountId) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        if (accountId instanceof AccountId.Personal) {
                            walletLimits = walletsService2.getWalletLimits(null);
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            walletLimits = walletsService2.getWalletLimits(((AccountId.Joint) accountId).f51413b);
                        }
                        u uVar = u.f;
                        a0.b bVar = new a0.b(16);
                        walletLimits.getClass();
                        ufm.i iVar2 = new ufm.i(walletLimits, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        AccountId accountId2 = (AccountId) obj2;
                        List walletLimits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits2, "walletLimits");
                        ne0.d dVar = vVar.f9078b;
                        v.Companion.getClass();
                        dVar.f(r.b(accountId2, "CACHE_KEY_WALLET_LIMITS"), walletLimits2);
                        return Unit.f186387a;
                    default:
                        AccountId accountId3 = (AccountId) obj2;
                        List walletLimits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId3, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits3, "walletLimits");
                        List<WalletLimit> list2 = walletLimits3;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (WalletLimit walletLimit : list2) {
                            Intrinsics.checkNotNullParameter(walletLimit, str2);
                            if (walletLimit instanceof WalletLimit.CounterLimit) {
                                WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) walletLimit;
                                String strA2 = counterLimit.f94845b.a();
                                String strA3 = counterLimit.f94844a.a();
                                dj0.d dVar2 = counterLimit.f94846c;
                                String str3 = dVar2.f115083b.f306286a;
                                long j2 = dVar2.f115082a;
                                dj0.d dVar3 = counterLimit.d;
                                str = str2;
                                aVar = new ysg.a("counter", strA2, strA3, str3, j2, dVar3 != null ? Long.valueOf(dVar3.f115082a) : null, counterLimit.e.f115082a);
                            } else {
                                str = str2;
                                if (!(walletLimit instanceof WalletLimit.TransactionLimit)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WalletLimit.TransactionLimit transactionLimit = (WalletLimit.TransactionLimit) walletLimit;
                                String strA4 = transactionLimit.f94847a.a();
                                dj0.d dVar4 = transactionLimit.f94848b;
                                aVar = new ysg.a("transaction", "", strA4, dVar4.f115083b.f306286a, 0L, null, dVar4.f115082a);
                            }
                            arrayList2.add(aVar);
                            str2 = str;
                        }
                        xe0.e eVar2 = vVar.f9079c;
                        v.Companion.getClass();
                        eVar2.G(arrayList2, r.b(accountId3, "CACHE_KEY_WALLET_LIMITS"), kii.e.o(ysg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        m mVar2 = new m(this, i5);
        final int i6 = 4;
        Function2 function24 = new Function2(this) { // from class: atg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f9066b;

            {
                this.f9066b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<zsg.c> walletLimits;
                String str;
                ysg.a aVar;
                int i22 = i6;
                String str2 = "<this>";
                int i32 = 1;
                v vVar = this.f9066b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<zsg.d>> walletProfiles = vVar.f9077a.getWalletProfiles(registeredIdentityId);
                        n nVar = new n(i32, new arf.h(13));
                        walletProfiles.getClass();
                        ufm.i iVar = new ufm.i(walletProfiles, nVar, 1);
                        vVar.i.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        vVar.f9078b.f(r.a(v.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    case 2:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = vVar.f9079c;
                        String strA = r.a(v.Companion, registeredIdentityId3);
                        List<psg.a> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (psg.a aVar2 : list) {
                            Object obj4 = xsg.c.f308488a;
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList.add(new ysg.b(aVar2.f239484a, aVar2.f239485b, u1.g(aVar2.f239486c, xsg.c.f308489b), u1.g(aVar2.d, xsg.c.f308488a)));
                        }
                        eVar.G(arrayList, strA, kii.e.o(ysg.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        WalletsService walletsService2 = vVar.f9077a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        AccountId accountId = (AccountId) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        if (accountId instanceof AccountId.Personal) {
                            walletLimits = walletsService2.getWalletLimits(null);
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            walletLimits = walletsService2.getWalletLimits(((AccountId.Joint) accountId).f51413b);
                        }
                        u uVar = u.f;
                        a0.b bVar = new a0.b(16);
                        walletLimits.getClass();
                        ufm.i iVar2 = new ufm.i(walletLimits, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        AccountId accountId2 = (AccountId) obj2;
                        List walletLimits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits2, "walletLimits");
                        ne0.d dVar = vVar.f9078b;
                        v.Companion.getClass();
                        dVar.f(r.b(accountId2, "CACHE_KEY_WALLET_LIMITS"), walletLimits2);
                        return Unit.f186387a;
                    default:
                        AccountId accountId3 = (AccountId) obj2;
                        List walletLimits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId3, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits3, "walletLimits");
                        List<WalletLimit> list2 = walletLimits3;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (WalletLimit walletLimit : list2) {
                            Intrinsics.checkNotNullParameter(walletLimit, str2);
                            if (walletLimit instanceof WalletLimit.CounterLimit) {
                                WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) walletLimit;
                                String strA2 = counterLimit.f94845b.a();
                                String strA3 = counterLimit.f94844a.a();
                                dj0.d dVar2 = counterLimit.f94846c;
                                String str3 = dVar2.f115083b.f306286a;
                                long j2 = dVar2.f115082a;
                                dj0.d dVar3 = counterLimit.d;
                                str = str2;
                                aVar = new ysg.a("counter", strA2, strA3, str3, j2, dVar3 != null ? Long.valueOf(dVar3.f115082a) : null, counterLimit.e.f115082a);
                            } else {
                                str = str2;
                                if (!(walletLimit instanceof WalletLimit.TransactionLimit)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WalletLimit.TransactionLimit transactionLimit = (WalletLimit.TransactionLimit) walletLimit;
                                String strA4 = transactionLimit.f94847a.a();
                                dj0.d dVar4 = transactionLimit.f94848b;
                                aVar = new ysg.a("transaction", "", strA4, dVar4.f115083b.f306286a, 0L, null, dVar4.f115082a);
                            }
                            arrayList2.add(aVar);
                            str2 = str;
                        }
                        xe0.e eVar2 = vVar.f9079c;
                        v.Companion.getClass();
                        eVar2.G(arrayList2, r.b(accountId3, "CACHE_KEY_WALLET_LIMITS"), kii.e.o(ysg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        m mVar3 = new m(this, i6);
        final int i21 = 5;
        this.k = new w4l.f(function23, mVar2, function24, mVar3, new Function2(this) { // from class: atg.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f9066b;

            {
                this.f9066b = this;
            }

            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0<zsg.c> walletLimits;
                String str;
                ysg.a aVar;
                int i22 = i21;
                String str2 = "<this>";
                int i32 = 1;
                v vVar = this.f9066b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String registeredIdentityId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                        d0<List<zsg.d>> walletProfiles = vVar.f9077a.getWalletProfiles(registeredIdentityId);
                        n nVar = new n(i32, new arf.h(13));
                        walletProfiles.getClass();
                        ufm.i iVar = new ufm.i(walletProfiles, nVar, 1);
                        vVar.i.f(Unit.f186387a);
                        Intrinsics.checkNotNullExpressionValue(iVar, "also(...)");
                        return iVar;
                    case 1:
                        String registeredIdentityId2 = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value, "value");
                        vVar.f9078b.f(r.a(v.Companion, registeredIdentityId2), value);
                        return Unit.f186387a;
                    case 2:
                        String registeredIdentityId3 = (String) obj2;
                        List value2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(registeredIdentityId3, "registeredIdentityId");
                        Intrinsics.checkNotNullParameter(value2, "value");
                        xe0.e eVar = vVar.f9079c;
                        String strA = r.a(v.Companion, registeredIdentityId3);
                        List<psg.a> list = value2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (psg.a aVar2 : list) {
                            Object obj4 = xsg.c.f308488a;
                            Intrinsics.checkNotNullParameter(aVar2, "<this>");
                            arrayList.add(new ysg.b(aVar2.f239484a, aVar2.f239485b, u1.g(aVar2.f239486c, xsg.c.f308489b), u1.g(aVar2.d, xsg.c.f308488a)));
                        }
                        eVar.G(arrayList, strA, kii.e.o(ysg.b.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 3:
                        WalletsService walletsService2 = vVar.f9077a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        AccountId accountId = (AccountId) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        if (accountId instanceof AccountId.Personal) {
                            walletLimits = walletsService2.getWalletLimits(null);
                        } else {
                            if (!(accountId instanceof AccountId.Joint)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            walletLimits = walletsService2.getWalletLimits(((AccountId.Joint) accountId).f51413b);
                        }
                        u uVar = u.f;
                        a0.b bVar = new a0.b(16);
                        walletLimits.getClass();
                        ufm.i iVar2 = new ufm.i(walletLimits, bVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        AccountId accountId2 = (AccountId) obj2;
                        List walletLimits2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId2, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits2, "walletLimits");
                        ne0.d dVar = vVar.f9078b;
                        v.Companion.getClass();
                        dVar.f(r.b(accountId2, "CACHE_KEY_WALLET_LIMITS"), walletLimits2);
                        return Unit.f186387a;
                    default:
                        AccountId accountId3 = (AccountId) obj2;
                        List walletLimits3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(accountId3, "accountId");
                        Intrinsics.checkNotNullParameter(walletLimits3, "walletLimits");
                        List<WalletLimit> list2 = walletLimits3;
                        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                        for (WalletLimit walletLimit : list2) {
                            Intrinsics.checkNotNullParameter(walletLimit, str2);
                            if (walletLimit instanceof WalletLimit.CounterLimit) {
                                WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) walletLimit;
                                String strA2 = counterLimit.f94845b.a();
                                String strA3 = counterLimit.f94844a.a();
                                dj0.d dVar2 = counterLimit.f94846c;
                                String str3 = dVar2.f115083b.f306286a;
                                long j2 = dVar2.f115082a;
                                dj0.d dVar3 = counterLimit.d;
                                str = str2;
                                aVar = new ysg.a("counter", strA2, strA3, str3, j2, dVar3 != null ? Long.valueOf(dVar3.f115082a) : null, counterLimit.e.f115082a);
                            } else {
                                str = str2;
                                if (!(walletLimit instanceof WalletLimit.TransactionLimit)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WalletLimit.TransactionLimit transactionLimit = (WalletLimit.TransactionLimit) walletLimit;
                                String strA4 = transactionLimit.f94847a.a();
                                dj0.d dVar4 = transactionLimit.f94848b;
                                aVar = new ysg.a("transaction", "", strA4, dVar4.f115083b.f306286a, 0L, null, dVar4.f115082a);
                            }
                            arrayList2.add(aVar);
                            str2 = str;
                        }
                        xe0.e eVar2 = vVar.f9079c;
                        v.Companion.getClass();
                        eVar2.G(arrayList2, r.b(accountId3, "CACHE_KEY_WALLET_LIMITS"), kii.e.o(ysg.a.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final d0 c(AccountId accountId) {
        if (!(accountId instanceof AccountId.Personal)) {
            if (accountId instanceof AccountId.Joint) {
                return te0.w.j(((AccountId.Joint) accountId).f51413b);
            }
            throw new NoWhenBranchMatchedException();
        }
        d0 d0VarF = this.f.f(false);
        d0 d0VarFirstOrError = m70.a.g(e0.h(m(fo3.d.PERSONAL, w4l.h.f294642c)), null, new h1(9), 1).firstOrError();
        Intrinsics.h(d0VarFirstOrError);
        return new ufm.i(te0.w.H0(d0VarFirstOrError, d0VarF), new n(6, new q(accountId, 0)), 1);
    }

    public final efm.r d(AccountId accountId, w4l.k kVar) {
        sfm.b bVar = new sfm.b(c(accountId), new n(7, new as9.a(this, kVar, 5)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return ue0.e.y(bVar, h0.f322473a, new arf.h(23));
    }

    public final Map e(AccountId accountId) {
        ReentrantReadWriteLock.ReadLock lock = this.f9080g.readLock();
        lock.lock();
        try {
            xe0.e eVar = this.f9079c;
            Companion.getClass();
            return (Map) eVar.T2(r.b(accountId, "CURRENCY_INFO_KEY"), o);
        } finally {
            lock.unlock();
        }
    }

    public final Sequence f(AccountId accountId) {
        List list;
        Pair pairG = ((h) this.e).g(accountId);
        return (pairG == null || (list = (List) ue8.c.E(pairG).f186386b) == null) ? nkm.t.d() : zhm.d0.Q(list);
    }

    public final pfm.h g(AccountId accountId, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d0 d0VarFirstOrError = m70.a.g(h(accountId, w4l.h.f294642c), null, new h1(7), 1).firstOrError();
        n nVar = new n(2, new as9.a(this, id10, 4));
        d0VarFirstOrError.getClass();
        pfm.h hVar = new pfm.h(new ufm.i(d0VarFirstOrError, nVar, 1), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    public final efm.r h(AccountId accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.w(d(accountId, loadingStrategy), new arf.h(22));
    }

    public final efm.r i(AccountId accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.w(d(accountId, loadingStrategy), new arf.h(21));
    }

    public final efm.r j(String walletId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r map = n(walletId, loadingStrategy).map(new a08.r(5, new t(walletId, walletId, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r k(String registeredIdentityId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f9082j.e(registeredIdentityId, this.f9081h.c(Unit.f186387a, loadingStrategy));
    }

    public final efm.r l(String ownerId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r map = ((h) this.e).i(loadingStrategy).map(new a08.r(5, new t(ownerId, ownerId, 4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r m(fo3.d walletIdentityType, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(nim.a.w(((h) this.e).i(loadingStrategy), new ar1.c(walletIdentityType, 11)), new arf.h(14));
    }

    public final efm.r n(String walletId, w4l.k loadingStrategy) {
        boolean zF = Intrinsics.f(walletId, "PARAM_ALL_WALLETS");
        i iVar = this.e;
        if (zF) {
            return nim.a.w(nim.a.w(((h) iVar).i(loadingStrategy), new ar1.c(fo3.d.YOUTH, 11)), new arf.h(16));
        }
        h hVar = (h) iVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(hVar.f9053g.e(walletId, loadingStrategy), new arf.h(17));
    }
}
