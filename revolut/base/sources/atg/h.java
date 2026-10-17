package atg;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.wallets.impl.network.WalletsService;
import efm.d0;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;
import wp5.y;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements i {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletsService f9050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final go3.b f9051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f9052c;
    public final xe0.e d;
    public final btg.c e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f9053g;

    public h(WalletsService walletsService, rsg.a walletsEndpointProvider, go3.b mapper, ne0.d memoryCache, xe0.e storage, btg.c walletUpdater) {
        Intrinsics.checkNotNullParameter(walletsService, "walletsService");
        Intrinsics.checkNotNullParameter(walletsEndpointProvider, "walletsEndpointProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(walletUpdater, "walletUpdater");
        this.f9050a = walletsService;
        this.f9051b = mapper;
        this.f9052c = memoryCache;
        this.d = storage;
        this.e = walletUpdater;
        final int i = 4;
        Function2 function2 = new Function2(this) { // from class: atg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9043b;

            {
                this.f9043b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        Map allWalletWithPockets = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets, "allWalletWithPockets");
                        ArrayList arrayList = new ArrayList(allWalletWithPockets.size());
                        Iterator it8 = allWalletWithPockets.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            h hVar = this.f9043b;
                            if (!zHasNext) {
                                hVar.d.G(new uo3.f(r0.t(arrayList)), "IDENTITY_TYPE_TO_WALLET_IDS", z.d(o0.b(uo3.f.class)));
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            fo3.d walletIdentityType = (fo3.d) entry.getKey();
                            List<Pair> list = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                            for (Pair pair : list) {
                                fo3.c cVar = (fo3.c) pair.f186385a;
                                hVar.k(pair);
                                arrayList2.add(cVar.f136801a);
                            }
                            ((go3.d) hVar.f9051b).getClass();
                            Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
                            arrayList.add(new Pair(u1.g(walletIdentityType, r0.k(new Pair("PERSONAL", fo3.d.PERSONAL), new Pair("PERSONAL_JOINT", fo3.d.PERSONAL_JOINT), new Pair("TEEN", fo3.d.TEEN), new Pair("FAMILY_CREDIT_CARD", fo3.d.FAMILY_CREDIT_CARD), new Pair("YOUTH", fo3.d.YOUTH), new Pair("UNKNOWN", fo3.d.UNKNOWN))), arrayList2));
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        h hVar2 = this.f9043b;
                        d0<ro3.k> wallet = hVar2.f9050a.getWallet("/wallet", walletId);
                        aoa.h hVar3 = new aoa.h(new a(hVar2, 0), 28);
                        wallet.getClass();
                        ufm.i iVar = new ufm.i(wallet, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Pair walletWithPockets = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                        this.f9043b.j(walletWithPockets, e.WALLET);
                        return Unit.f186387a;
                    case 3:
                        Pair walletWithPockets2 = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets2, "walletWithPockets");
                        this.f9043b.k(walletWithPockets2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        h hVar4 = this.f9043b;
                        d0<Map<String, List<ro3.k>>> wallets = hVar4.f9050a.getWallets("/wallets");
                        aoa.h hVar5 = new aoa.h(new a(hVar4, 3), 29);
                        wallets.getClass();
                        ufm.i iVar2 = new ufm.i(wallets, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Map allWalletWithPockets2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets2, "allWalletWithPockets");
                        h hVar6 = this.f9043b;
                        ne0.d dVar = hVar6.f9052c;
                        ArrayList arrayList3 = new ArrayList(allWalletWithPockets2.size());
                        for (Map.Entry entry2 : allWalletWithPockets2.entrySet()) {
                            fo3.d dVar2 = (fo3.d) entry2.getKey();
                            List<Pair> list2 = (List) entry2.getValue();
                            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                            for (Pair pair2 : list2) {
                                fo3.c cVar2 = (fo3.c) pair2.f186385a;
                                hVar6.j(pair2, e.ALL_WALLETS);
                                arrayList4.add(cVar2.f136801a);
                            }
                            arrayList3.add(new Pair(dVar2, arrayList4));
                        }
                        dVar.f("IDENTITY_TYPE_TO_WALLET_IDS", r0.t(arrayList3));
                        return Unit.f186387a;
                }
            }
        };
        a aVar = new a(this, i);
        final int i2 = 5;
        final int i3 = 0;
        this.f = new w4l.f(function2, aVar, new Function2(this) { // from class: atg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9043b;

            {
                this.f9043b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        Map allWalletWithPockets = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets, "allWalletWithPockets");
                        ArrayList arrayList = new ArrayList(allWalletWithPockets.size());
                        Iterator it8 = allWalletWithPockets.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            h hVar = this.f9043b;
                            if (!zHasNext) {
                                hVar.d.G(new uo3.f(r0.t(arrayList)), "IDENTITY_TYPE_TO_WALLET_IDS", z.d(o0.b(uo3.f.class)));
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            fo3.d walletIdentityType = (fo3.d) entry.getKey();
                            List<Pair> list = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                            for (Pair pair : list) {
                                fo3.c cVar = (fo3.c) pair.f186385a;
                                hVar.k(pair);
                                arrayList2.add(cVar.f136801a);
                            }
                            ((go3.d) hVar.f9051b).getClass();
                            Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
                            arrayList.add(new Pair(u1.g(walletIdentityType, r0.k(new Pair("PERSONAL", fo3.d.PERSONAL), new Pair("PERSONAL_JOINT", fo3.d.PERSONAL_JOINT), new Pair("TEEN", fo3.d.TEEN), new Pair("FAMILY_CREDIT_CARD", fo3.d.FAMILY_CREDIT_CARD), new Pair("YOUTH", fo3.d.YOUTH), new Pair("UNKNOWN", fo3.d.UNKNOWN))), arrayList2));
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        h hVar2 = this.f9043b;
                        d0<ro3.k> wallet = hVar2.f9050a.getWallet("/wallet", walletId);
                        aoa.h hVar3 = new aoa.h(new a(hVar2, 0), 28);
                        wallet.getClass();
                        ufm.i iVar = new ufm.i(wallet, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Pair walletWithPockets = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                        this.f9043b.j(walletWithPockets, e.WALLET);
                        return Unit.f186387a;
                    case 3:
                        Pair walletWithPockets2 = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets2, "walletWithPockets");
                        this.f9043b.k(walletWithPockets2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        h hVar4 = this.f9043b;
                        d0<Map<String, List<ro3.k>>> wallets = hVar4.f9050a.getWallets("/wallets");
                        aoa.h hVar5 = new aoa.h(new a(hVar4, 3), 29);
                        wallets.getClass();
                        ufm.i iVar2 = new ufm.i(wallets, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Map allWalletWithPockets2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets2, "allWalletWithPockets");
                        h hVar6 = this.f9043b;
                        ne0.d dVar = hVar6.f9052c;
                        ArrayList arrayList3 = new ArrayList(allWalletWithPockets2.size());
                        for (Map.Entry entry2 : allWalletWithPockets2.entrySet()) {
                            fo3.d dVar2 = (fo3.d) entry2.getKey();
                            List<Pair> list2 = (List) entry2.getValue();
                            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                            for (Pair pair2 : list2) {
                                fo3.c cVar2 = (fo3.c) pair2.f186385a;
                                hVar6.j(pair2, e.ALL_WALLETS);
                                arrayList4.add(cVar2.f136801a);
                            }
                            arrayList3.add(new Pair(dVar2, arrayList4));
                        }
                        dVar.f("IDENTITY_TYPE_TO_WALLET_IDS", r0.t(arrayList3));
                        return Unit.f186387a;
                }
            }
        }, new a(this, 1), new Function2(this) { // from class: atg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9043b;

            {
                this.f9043b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        Map allWalletWithPockets = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets, "allWalletWithPockets");
                        ArrayList arrayList = new ArrayList(allWalletWithPockets.size());
                        Iterator it8 = allWalletWithPockets.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            h hVar = this.f9043b;
                            if (!zHasNext) {
                                hVar.d.G(new uo3.f(r0.t(arrayList)), "IDENTITY_TYPE_TO_WALLET_IDS", z.d(o0.b(uo3.f.class)));
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            fo3.d walletIdentityType = (fo3.d) entry.getKey();
                            List<Pair> list = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                            for (Pair pair : list) {
                                fo3.c cVar = (fo3.c) pair.f186385a;
                                hVar.k(pair);
                                arrayList2.add(cVar.f136801a);
                            }
                            ((go3.d) hVar.f9051b).getClass();
                            Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
                            arrayList.add(new Pair(u1.g(walletIdentityType, r0.k(new Pair("PERSONAL", fo3.d.PERSONAL), new Pair("PERSONAL_JOINT", fo3.d.PERSONAL_JOINT), new Pair("TEEN", fo3.d.TEEN), new Pair("FAMILY_CREDIT_CARD", fo3.d.FAMILY_CREDIT_CARD), new Pair("YOUTH", fo3.d.YOUTH), new Pair("UNKNOWN", fo3.d.UNKNOWN))), arrayList2));
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        h hVar2 = this.f9043b;
                        d0<ro3.k> wallet = hVar2.f9050a.getWallet("/wallet", walletId);
                        aoa.h hVar3 = new aoa.h(new a(hVar2, 0), 28);
                        wallet.getClass();
                        ufm.i iVar = new ufm.i(wallet, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Pair walletWithPockets = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                        this.f9043b.j(walletWithPockets, e.WALLET);
                        return Unit.f186387a;
                    case 3:
                        Pair walletWithPockets2 = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets2, "walletWithPockets");
                        this.f9043b.k(walletWithPockets2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        h hVar4 = this.f9043b;
                        d0<Map<String, List<ro3.k>>> wallets = hVar4.f9050a.getWallets("/wallets");
                        aoa.h hVar5 = new aoa.h(new a(hVar4, 3), 29);
                        wallets.getClass();
                        ufm.i iVar2 = new ufm.i(wallets, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Map allWalletWithPockets2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets2, "allWalletWithPockets");
                        h hVar6 = this.f9043b;
                        ne0.d dVar = hVar6.f9052c;
                        ArrayList arrayList3 = new ArrayList(allWalletWithPockets2.size());
                        for (Map.Entry entry2 : allWalletWithPockets2.entrySet()) {
                            fo3.d dVar2 = (fo3.d) entry2.getKey();
                            List<Pair> list2 = (List) entry2.getValue();
                            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                            for (Pair pair2 : list2) {
                                fo3.c cVar2 = (fo3.c) pair2.f186385a;
                                hVar6.j(pair2, e.ALL_WALLETS);
                                arrayList4.add(cVar2.f136801a);
                            }
                            arrayList3.add(new Pair(dVar2, arrayList4));
                        }
                        dVar.f("IDENTITY_TYPE_TO_WALLET_IDS", r0.t(arrayList3));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        int i5 = 0;
        int i6 = 1;
        ald.o oVar = new ald.o(i6, this, h.class, "fromMemory", "fromMemory(Ljava/lang/String;)Lkotlin/Pair;", i5, 1);
        ald.o oVar2 = new ald.o(i6, this, h.class, "fromStorage", "fromStorage(Ljava/lang/String;)Lkotlin/Pair;", i5, 2);
        final int i21 = 1;
        Function2 function22 = new Function2(this) { // from class: atg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9043b;

            {
                this.f9043b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        Map allWalletWithPockets = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets, "allWalletWithPockets");
                        ArrayList arrayList = new ArrayList(allWalletWithPockets.size());
                        Iterator it8 = allWalletWithPockets.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            h hVar = this.f9043b;
                            if (!zHasNext) {
                                hVar.d.G(new uo3.f(r0.t(arrayList)), "IDENTITY_TYPE_TO_WALLET_IDS", z.d(o0.b(uo3.f.class)));
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            fo3.d walletIdentityType = (fo3.d) entry.getKey();
                            List<Pair> list = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                            for (Pair pair : list) {
                                fo3.c cVar = (fo3.c) pair.f186385a;
                                hVar.k(pair);
                                arrayList2.add(cVar.f136801a);
                            }
                            ((go3.d) hVar.f9051b).getClass();
                            Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
                            arrayList.add(new Pair(u1.g(walletIdentityType, r0.k(new Pair("PERSONAL", fo3.d.PERSONAL), new Pair("PERSONAL_JOINT", fo3.d.PERSONAL_JOINT), new Pair("TEEN", fo3.d.TEEN), new Pair("FAMILY_CREDIT_CARD", fo3.d.FAMILY_CREDIT_CARD), new Pair("YOUTH", fo3.d.YOUTH), new Pair("UNKNOWN", fo3.d.UNKNOWN))), arrayList2));
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        h hVar2 = this.f9043b;
                        d0<ro3.k> wallet = hVar2.f9050a.getWallet("/wallet", walletId);
                        aoa.h hVar3 = new aoa.h(new a(hVar2, 0), 28);
                        wallet.getClass();
                        ufm.i iVar = new ufm.i(wallet, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Pair walletWithPockets = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                        this.f9043b.j(walletWithPockets, e.WALLET);
                        return Unit.f186387a;
                    case 3:
                        Pair walletWithPockets2 = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets2, "walletWithPockets");
                        this.f9043b.k(walletWithPockets2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        h hVar4 = this.f9043b;
                        d0<Map<String, List<ro3.k>>> wallets = hVar4.f9050a.getWallets("/wallets");
                        aoa.h hVar5 = new aoa.h(new a(hVar4, 3), 29);
                        wallets.getClass();
                        ufm.i iVar2 = new ufm.i(wallets, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Map allWalletWithPockets2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets2, "allWalletWithPockets");
                        h hVar6 = this.f9043b;
                        ne0.d dVar = hVar6.f9052c;
                        ArrayList arrayList3 = new ArrayList(allWalletWithPockets2.size());
                        for (Map.Entry entry2 : allWalletWithPockets2.entrySet()) {
                            fo3.d dVar2 = (fo3.d) entry2.getKey();
                            List<Pair> list2 = (List) entry2.getValue();
                            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                            for (Pair pair2 : list2) {
                                fo3.c cVar2 = (fo3.c) pair2.f186385a;
                                hVar6.j(pair2, e.ALL_WALLETS);
                                arrayList4.add(cVar2.f136801a);
                            }
                            arrayList3.add(new Pair(dVar2, arrayList4));
                        }
                        dVar.f("IDENTITY_TYPE_TO_WALLET_IDS", r0.t(arrayList3));
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 2;
        Function2 function23 = new Function2(this) { // from class: atg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9043b;

            {
                this.f9043b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        Map allWalletWithPockets = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets, "allWalletWithPockets");
                        ArrayList arrayList = new ArrayList(allWalletWithPockets.size());
                        Iterator it8 = allWalletWithPockets.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            h hVar = this.f9043b;
                            if (!zHasNext) {
                                hVar.d.G(new uo3.f(r0.t(arrayList)), "IDENTITY_TYPE_TO_WALLET_IDS", z.d(o0.b(uo3.f.class)));
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            fo3.d walletIdentityType = (fo3.d) entry.getKey();
                            List<Pair> list = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                            for (Pair pair : list) {
                                fo3.c cVar = (fo3.c) pair.f186385a;
                                hVar.k(pair);
                                arrayList2.add(cVar.f136801a);
                            }
                            ((go3.d) hVar.f9051b).getClass();
                            Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
                            arrayList.add(new Pair(u1.g(walletIdentityType, r0.k(new Pair("PERSONAL", fo3.d.PERSONAL), new Pair("PERSONAL_JOINT", fo3.d.PERSONAL_JOINT), new Pair("TEEN", fo3.d.TEEN), new Pair("FAMILY_CREDIT_CARD", fo3.d.FAMILY_CREDIT_CARD), new Pair("YOUTH", fo3.d.YOUTH), new Pair("UNKNOWN", fo3.d.UNKNOWN))), arrayList2));
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        h hVar2 = this.f9043b;
                        d0<ro3.k> wallet = hVar2.f9050a.getWallet("/wallet", walletId);
                        aoa.h hVar3 = new aoa.h(new a(hVar2, 0), 28);
                        wallet.getClass();
                        ufm.i iVar = new ufm.i(wallet, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Pair walletWithPockets = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                        this.f9043b.j(walletWithPockets, e.WALLET);
                        return Unit.f186387a;
                    case 3:
                        Pair walletWithPockets2 = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets2, "walletWithPockets");
                        this.f9043b.k(walletWithPockets2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        h hVar4 = this.f9043b;
                        d0<Map<String, List<ro3.k>>> wallets = hVar4.f9050a.getWallets("/wallets");
                        aoa.h hVar5 = new aoa.h(new a(hVar4, 3), 29);
                        wallets.getClass();
                        ufm.i iVar2 = new ufm.i(wallets, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Map allWalletWithPockets2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets2, "allWalletWithPockets");
                        h hVar6 = this.f9043b;
                        ne0.d dVar = hVar6.f9052c;
                        ArrayList arrayList3 = new ArrayList(allWalletWithPockets2.size());
                        for (Map.Entry entry2 : allWalletWithPockets2.entrySet()) {
                            fo3.d dVar2 = (fo3.d) entry2.getKey();
                            List<Pair> list2 = (List) entry2.getValue();
                            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                            for (Pair pair2 : list2) {
                                fo3.c cVar2 = (fo3.c) pair2.f186385a;
                                hVar6.j(pair2, e.ALL_WALLETS);
                                arrayList4.add(cVar2.f136801a);
                            }
                            arrayList3.add(new Pair(dVar2, arrayList4));
                        }
                        dVar.f("IDENTITY_TYPE_TO_WALLET_IDS", r0.t(arrayList3));
                        return Unit.f186387a;
                }
            }
        };
        final int i32 = 3;
        this.f9053g = new w4l.f(function22, oVar, function23, oVar2, new Function2(this) { // from class: atg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9043b;

            {
                this.f9043b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        Map allWalletWithPockets = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets, "allWalletWithPockets");
                        ArrayList arrayList = new ArrayList(allWalletWithPockets.size());
                        Iterator it8 = allWalletWithPockets.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            h hVar = this.f9043b;
                            if (!zHasNext) {
                                hVar.d.G(new uo3.f(r0.t(arrayList)), "IDENTITY_TYPE_TO_WALLET_IDS", z.d(o0.b(uo3.f.class)));
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            fo3.d walletIdentityType = (fo3.d) entry.getKey();
                            List<Pair> list = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                            for (Pair pair : list) {
                                fo3.c cVar = (fo3.c) pair.f186385a;
                                hVar.k(pair);
                                arrayList2.add(cVar.f136801a);
                            }
                            ((go3.d) hVar.f9051b).getClass();
                            Intrinsics.checkNotNullParameter(walletIdentityType, "walletIdentityType");
                            arrayList.add(new Pair(u1.g(walletIdentityType, r0.k(new Pair("PERSONAL", fo3.d.PERSONAL), new Pair("PERSONAL_JOINT", fo3.d.PERSONAL_JOINT), new Pair("TEEN", fo3.d.TEEN), new Pair("FAMILY_CREDIT_CARD", fo3.d.FAMILY_CREDIT_CARD), new Pair("YOUTH", fo3.d.YOUTH), new Pair("UNKNOWN", fo3.d.UNKNOWN))), arrayList2));
                        }
                        break;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        h hVar2 = this.f9043b;
                        d0<ro3.k> wallet = hVar2.f9050a.getWallet("/wallet", walletId);
                        aoa.h hVar3 = new aoa.h(new a(hVar2, 0), 28);
                        wallet.getClass();
                        ufm.i iVar = new ufm.i(wallet, hVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        Pair walletWithPockets = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                        this.f9043b.j(walletWithPockets, e.WALLET);
                        return Unit.f186387a;
                    case 3:
                        Pair walletWithPockets2 = (Pair) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(walletWithPockets2, "walletWithPockets");
                        this.f9043b.k(walletWithPockets2);
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                        h hVar4 = this.f9043b;
                        d0<Map<String, List<ro3.k>>> wallets = hVar4.f9050a.getWallets("/wallets");
                        aoa.h hVar5 = new aoa.h(new a(hVar4, 3), 29);
                        wallets.getClass();
                        ufm.i iVar2 = new ufm.i(wallets, hVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        Map allWalletWithPockets2 = (Map) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(allWalletWithPockets2, "allWalletWithPockets");
                        h hVar6 = this.f9043b;
                        ne0.d dVar = hVar6.f9052c;
                        ArrayList arrayList3 = new ArrayList(allWalletWithPockets2.size());
                        for (Map.Entry entry2 : allWalletWithPockets2.entrySet()) {
                            fo3.d dVar2 = (fo3.d) entry2.getKey();
                            List<Pair> list2 = (List) entry2.getValue();
                            ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                            for (Pair pair2 : list2) {
                                fo3.c cVar2 = (fo3.c) pair2.f186385a;
                                hVar6.j(pair2, e.ALL_WALLETS);
                                arrayList4.add(cVar2.f136801a);
                            }
                            arrayList3.add(new Pair(dVar2, arrayList4));
                        }
                        dVar.f("IDENTITY_TYPE_TO_WALLET_IDS", r0.t(arrayList3));
                        return Unit.f186387a;
                }
            }
        }, new a(this, 2), null, null, 192);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(fo3.g r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof atg.g
            if (r0 == 0) goto L13
            r0 = r9
            atg.g r0 = (atg.g) r0
            int r1 = r0.f9049y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9049y = r1
            goto L18
        L13:
            atg.g r0 = new atg.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f9047w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f9049y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r8 = r0.v
            java.util.Iterator r2 = r0.u
            yhm.o.b(r9)
            goto L41
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            java.util.List r8 = r8.a()
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
            r2 = r8
            r8 = r9
        L41:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L6d
            java.lang.Object r9 = r2.next()
            fo3.f r9 = (fo3.f) r9
            r0.u = r2
            r0.v = r8
            r0.f9049y = r3
            akl.s1 r4 = new akl.s1
            r5 = 9
            r6 = 0
            r4.<init>(r7, r9, r6, r5)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r4, r0)
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            if (r9 != r4) goto L68
            goto L6a
        L68:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L6a:
            if (r9 != r1) goto L41
            return r1
        L6d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: atg.h.a(fo3.g, gim.c):java.lang.Object");
    }

    public final Map b() {
        Map map = (Map) this.f9052c.get("IDENTITY_TYPE_TO_WALLET_IDS");
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            fo3.d dVar = (fo3.d) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                Pair pairD = d((String) it8.next());
                if (pairD != null) {
                    arrayList2.add(pairD);
                }
            }
            arrayList.add(new Pair(dVar, arrayList2));
        }
        return r0.t(arrayList);
    }

    public final Map c() {
        Map identities;
        fo3.d dVar;
        uo3.f fVar = (uo3.f) y.t(uo3.f.class, this.d, "IDENTITY_TYPE_TO_WALLET_IDS");
        if (fVar == null || (identities = fVar.getIdentities()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(identities.size());
        for (Map.Entry entry : identities.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            fo3.d[] dVarArrValues = fo3.d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i];
                if (a0.z(dVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (dVar == null) {
                dVar = fo3.d.UNKNOWN;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                Pair pairE = e((String) it8.next());
                if (pairE != null) {
                    arrayList2.add(pairE);
                }
            }
            arrayList.add(new Pair(dVar, arrayList2));
        }
        return r0.t(arrayList);
    }

    public final Pair d(String str) {
        ne0.d dVar = this.f9052c;
        fo3.c cVar = (fo3.c) v1.c.s("WALLET_", str, dVar);
        List list = (List) v1.c.s("POCKETS_", str, dVar);
        if (cVar == null || list == null) {
            return null;
        }
        return new Pair(cVar, list);
    }

    public final Pair e(String str) {
        fo3.c cVar;
        ArrayList arrayList;
        String strQ = j6.a.q("WALLET_", str);
        xe0.e eVar = this.d;
        uo3.g entity = (uo3.g) y.t(uo3.g.class, eVar, strQ);
        go3.b bVar = this.f9051b;
        if (entity != null) {
            ((go3.d) bVar).getClass();
            Intrinsics.checkNotNullParameter(entity, "entity");
            String strB = entity.getId();
            xi0.a aVar = xi0.b.Companion;
            String strA = entity.getBaseCurrency();
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(strA);
            String strD = entity.getRefLink();
            fo3.e eVar2 = (fo3.e) u1.t(entity.getState(), fo3.e.TERMINATED, hb9.b.h());
            long jH = entity.getTotalTopUp();
            Long lF = entity.getTopUpLimit();
            Long lG = entity.getTopUpResetDate();
            cVar = new fo3.c(strB, eVar2, strD, bVarA, jH, lF, lG != null ? oc.c.I(lG.longValue()) : null, entity.getOwnerId());
        } else {
            cVar = null;
        }
        String strQ2 = j6.a.q("POCKETS_", str);
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KType kTypeB = o0.b(uo3.d.class);
        companion.getClass();
        List list = (List) eVar.T2(strQ2, z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((go3.d) bVar).d((uo3.d) it8.next()));
            }
        } else {
            arrayList = null;
        }
        if (cVar == null || arrayList == null) {
            return null;
        }
        return new Pair(cVar, arrayList);
    }

    public final Pair f(String str) {
        try {
            Pair pairD = d(str);
            return pairD == null ? e(str) : pairD;
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            return null;
        }
    }

    public final Pair g(AccountId accountId) {
        List list;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (accountId instanceof AccountId.Joint) {
            return f(((AccountId.Joint) accountId).f51413b);
        }
        if (!(accountId instanceof AccountId.Personal)) {
            throw new NoWhenBranchMatchedException();
        }
        Map mapB = b();
        if (mapB == null) {
            mapB = c();
        }
        if (mapB == null || (list = (List) mapB.get(fo3.d.PERSONAL)) == null) {
            return null;
        }
        return (Pair) zhm.d0.d0(list);
    }

    public final synchronized Pair h(Pair pair) {
        Pair pairF = f(((fo3.c) pair.f186385a).b());
        if (pairF == null) {
            return pair;
        }
        Pair pairA = ((btg.d) this.e).a(pair, ue8.c.a(pairF)).a();
        if (pairA != null) {
            pair = pairA;
        }
        return pair;
    }

    public final efm.r i(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f.e(Unit.f186387a, loadingStrategy);
    }

    public final void j(Pair pair, e eVar) {
        fo3.c cVar = (fo3.c) pair.f186385a;
        List list = (List) pair.f186386b;
        String str = "WALLET_" + cVar.b();
        ne0.d dVar = this.f9052c;
        dVar.f(str, cVar);
        dVar.f("POCKETS_" + cVar.b(), list);
        int i = eVar == null ? -1 : f.f9046a[eVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                this.f9053g.c(null, (1 & 2) == 0, new c(cVar, 0));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f.c(null, (1 & 2) == 0, new arf.h(7));
            }
        }
    }

    public final void k(Pair pair) {
        fo3.c domain = (fo3.c) pair.f186385a;
        List list = (List) pair.f186386b;
        go3.d dVar = (go3.d) this.f9051b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        String strB = domain.b();
        String str = domain.a().f306286a;
        String strD = domain.d();
        String strG = u1.g(domain.e(), hb9.b.h());
        Long lF = domain.f();
        LocalDate localDateG = domain.g();
        uo3.g gVar = new uo3.g(strB, strG, domain.i(), lF, localDateG != null ? Long.valueOf(oc.c.N(localDateG)) : null, str, strD, domain.c());
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(dVar.e((io3.d) it8.next()));
        }
        String strQ = j6.a.q("WALLET_", domain.b());
        Type typeD = z.d(o0.b(uo3.g.class));
        xe0.e eVar = this.d;
        eVar.G(gVar, strQ, typeD);
        eVar.G(arrayList, j6.a.q("POCKETS_", domain.b()), kii.e.o(uo3.d.class, KTypeProjection.INSTANCE, List.class));
    }
}
