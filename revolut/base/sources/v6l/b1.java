package v6l;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.cards.models.revolutcard.ReactivationEligibility;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import v6l.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b1 implements j6l.b {
    public static final Type A;
    public static final Type B;
    public static final Type C;

    @NotNull
    public static final f0 Companion = new f0();
    public static final Type D;
    public static final Type E;
    public static final Type z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardService f286424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f286425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f286426c;
    public final kge.d d;
    public final t6l.b e;
    public final mk0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f286427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mg0.a f286428h;
    public final sf0.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kg.o f286429j;
    public final fn2.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qe0.s f286430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f286431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f286432n;
    public final w4l.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w4l.f f286433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w4l.f f286434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w4l.f f286435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w4l.f f286436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w4l.f f286437t;
    public final ryc.a u;
    public final w4l.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w4l.f f286438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w4l.f f286439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w4l.f f286440y;

    static {
        Type type = new TypeToken<List<? extends u6l.j>>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.RevolutCardRepositoryImpl$Companion$LIST_OF_REVOLUT_CARDS_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        z = type;
        Type type2 = new TypeToken<List<? extends u6l.n>>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.RevolutCardRepositoryImpl$Companion$LIST_OF_TERMINATED_CARDS_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        A = type2;
        Type type3 = new TypeToken<p6l.x>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.RevolutCardRepositoryImpl$Companion$TERMINATED_CARD_CHARGEBACK_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        B = type3;
        Type type4 = new TypeToken<p6l.l>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.RevolutCardRepositoryImpl$Companion$PIN_STATUS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
        C = type4;
        Type type5 = new TypeToken<Boolean>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.RevolutCardRepositoryImpl$Companion$BOOLEAN_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
        D = type5;
        Type type6 = new TypeToken<List<? extends String>>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.RevolutCardRepositoryImpl$Companion$LIST_OF_STRINGS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
        E = type6;
    }

    public b1(RevolutCardService cardService, ue0.c revolutCardStorage, ne0.j memoryCache, kge.d encodedDataMapper, t6l.b cardDetailsStorage, mk0.a personalisationStorage, i cardOrderManager, ze0.a forceReloadStrategyFactory, mg0.a cryptoInteractor, sf0.h serverErrorParser, kg.o gson, fn2.c cardsFilter) {
        Intrinsics.checkNotNullParameter(cardService, "cardService");
        Intrinsics.checkNotNullParameter(revolutCardStorage, "revolutCardStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(encodedDataMapper, "encodedDataMapper");
        Intrinsics.checkNotNullParameter(cardDetailsStorage, "cardDetailsStorage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(cardOrderManager, "cardOrderManager");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        Intrinsics.checkNotNullParameter(cryptoInteractor, "cryptoInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(cardsFilter, "cardsFilter");
        this.f286424a = cardService;
        this.f286425b = revolutCardStorage;
        this.f286426c = memoryCache;
        this.d = encodedDataMapper;
        this.e = cardDetailsStorage;
        this.f = personalisationStorage;
        this.f286427g = cardOrderManager;
        this.f286428h = cryptoInteractor;
        this.i = serverErrorParser;
        this.f286429j = gson;
        this.k = cardsFilter;
        this.f286430l = ((ze0.c) forceReloadStrategyFactory).b(180000L);
        h93.r[] elements = {h93.r.ACTIVE, h93.r.BLOCKED, h93.r.LOCKED, h93.r.ORDERED, h93.r.CREATED, h93.r.PENDING, h93.r.EXPIRED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f286431m = kotlin.collections.d.y0(elements);
        this.f286432n = new w4l.f(new y(this, 0), new v(this, 9), new y(this, 13), new v(this, 18), new y(this, 26), null, null, null, BERTags.FLAGS);
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.o = new w4l.f(new Function2(this) { // from class: v6l.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f286520b;

            {
                this.f286520b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i;
                b1 b1Var = this.f286520b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<p6l.y>> allTerminatedCards = b1Var.f286424a.getAllTerminatedCards("CHARGEBACK_REACTIVATION");
                        k kVar = new k(23, new v6e.d(21));
                        allTerminatedCards.getClass();
                        ufm.i iVar = new ufm.i(allTerminatedCards, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        b1Var.f286426c.f("REVOLUT_TERMINATED_CARDS_MEM_CACHE_KEY", cards);
                        break;
                    default:
                        List cards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards2, "cards");
                        ue0.c cVar = b1Var.f286425b;
                        List list = cards2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            TerminatedCard terminatedCard = (TerminatedCard) it9.next();
                            Object obj4 = u6l.k.f277675a;
                            Intrinsics.checkNotNullParameter(terminatedCard, "<this>");
                            String str = terminatedCard.f65547a;
                            String str2 = terminatedCard.f65548b;
                            b93.j jVar = terminatedCard.f65549c;
                            String str3 = jVar.f13639a.f13615a;
                            String str4 = jVar.f13640b;
                            String str5 = terminatedCard.d;
                            String string = terminatedCard.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            long j2 = terminatedCard.f;
                            String str6 = terminatedCard.f65550g;
                            ReactivationEligibility reactivationEligibility = terminatedCard.f65551h;
                            Intrinsics.checkNotNullParameter(reactivationEligibility, "<this>");
                            Iterator it10 = it9;
                            u6l.i iVar2 = new u6l.i(reactivationEligibility.f65542a, reactivationEligibility.f65543b.a());
                            boolean z3 = terminatedCard.i;
                            h93.l0 l0Var = terminatedCard.f65552j;
                            String strName = null;
                            String strName2 = l0Var != null ? l0Var.name() : null;
                            h93.j0 j0Var = terminatedCard.k;
                            if (j0Var != null) {
                                strName = j0Var.name();
                            }
                            arrayList.add(new u6l.n(str, str2, str3, str4, str5, string, j2, str6, iVar2, z3, strName2, strName, terminatedCard.f65553l));
                            it9 = it10;
                        }
                        cVar.G(arrayList, "REVOLUT_TERMINATED_CARDS_STORAGE_KEY", kii.e.o(u6l.n.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new v(this, 24), new Function2(this) { // from class: v6l.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f286520b;

            {
                this.f286520b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i2;
                b1 b1Var = this.f286520b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<p6l.y>> allTerminatedCards = b1Var.f286424a.getAllTerminatedCards("CHARGEBACK_REACTIVATION");
                        k kVar = new k(23, new v6e.d(21));
                        allTerminatedCards.getClass();
                        ufm.i iVar = new ufm.i(allTerminatedCards, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        b1Var.f286426c.f("REVOLUT_TERMINATED_CARDS_MEM_CACHE_KEY", cards);
                        break;
                    default:
                        List cards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards2, "cards");
                        ue0.c cVar = b1Var.f286425b;
                        List list = cards2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            TerminatedCard terminatedCard = (TerminatedCard) it9.next();
                            Object obj4 = u6l.k.f277675a;
                            Intrinsics.checkNotNullParameter(terminatedCard, "<this>");
                            String str = terminatedCard.f65547a;
                            String str2 = terminatedCard.f65548b;
                            b93.j jVar = terminatedCard.f65549c;
                            String str3 = jVar.f13639a.f13615a;
                            String str4 = jVar.f13640b;
                            String str5 = terminatedCard.d;
                            String string = terminatedCard.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            long j2 = terminatedCard.f;
                            String str6 = terminatedCard.f65550g;
                            ReactivationEligibility reactivationEligibility = terminatedCard.f65551h;
                            Intrinsics.checkNotNullParameter(reactivationEligibility, "<this>");
                            Iterator it10 = it9;
                            u6l.i iVar2 = new u6l.i(reactivationEligibility.f65542a, reactivationEligibility.f65543b.a());
                            boolean z3 = terminatedCard.i;
                            h93.l0 l0Var = terminatedCard.f65552j;
                            String strName = null;
                            String strName2 = l0Var != null ? l0Var.name() : null;
                            h93.j0 j0Var = terminatedCard.k;
                            if (j0Var != null) {
                                strName = j0Var.name();
                            }
                            arrayList.add(new u6l.n(str, str2, str3, str4, str5, string, j2, str6, iVar2, z3, strName2, strName, terminatedCard.f65553l));
                            it9 = it10;
                        }
                        cVar.G(arrayList, "REVOLUT_TERMINATED_CARDS_STORAGE_KEY", kii.e.o(u6l.n.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new v(this, 25), new Function2(this) { // from class: v6l.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f286520b;

            {
                this.f286520b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i5 = i3;
                b1 b1Var = this.f286520b;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<List<p6l.y>> allTerminatedCards = b1Var.f286424a.getAllTerminatedCards("CHARGEBACK_REACTIVATION");
                        k kVar = new k(23, new v6e.d(21));
                        allTerminatedCards.getClass();
                        ufm.i iVar = new ufm.i(allTerminatedCards, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List cards = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards, "cards");
                        b1Var.f286426c.f("REVOLUT_TERMINATED_CARDS_MEM_CACHE_KEY", cards);
                        break;
                    default:
                        List cards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cards2, "cards");
                        ue0.c cVar = b1Var.f286425b;
                        List list = cards2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            TerminatedCard terminatedCard = (TerminatedCard) it9.next();
                            Object obj4 = u6l.k.f277675a;
                            Intrinsics.checkNotNullParameter(terminatedCard, "<this>");
                            String str = terminatedCard.f65547a;
                            String str2 = terminatedCard.f65548b;
                            b93.j jVar = terminatedCard.f65549c;
                            String str3 = jVar.f13639a.f13615a;
                            String str4 = jVar.f13640b;
                            String str5 = terminatedCard.d;
                            String string = terminatedCard.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            long j2 = terminatedCard.f;
                            String str6 = terminatedCard.f65550g;
                            ReactivationEligibility reactivationEligibility = terminatedCard.f65551h;
                            Intrinsics.checkNotNullParameter(reactivationEligibility, "<this>");
                            Iterator it10 = it9;
                            u6l.i iVar2 = new u6l.i(reactivationEligibility.f65542a, reactivationEligibility.f65543b.a());
                            boolean z3 = terminatedCard.i;
                            h93.l0 l0Var = terminatedCard.f65552j;
                            String strName = null;
                            String strName2 = l0Var != null ? l0Var.name() : null;
                            h93.j0 j0Var = terminatedCard.k;
                            if (j0Var != null) {
                                strName = j0Var.name();
                            }
                            arrayList.add(new u6l.n(str, str2, str3, str4, str5, string, j2, str6, iVar2, z3, strName2, strName, terminatedCard.f65553l));
                            it9 = it10;
                        }
                        cVar.G(arrayList, "REVOLUT_TERMINATED_CARDS_STORAGE_KEY", kii.e.o(u6l.n.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        this.f286433p = new w4l.f(new y(this, 1), new v(this, 5), new y(this, 2), new v(this, 6), new y(this, 3), null, null, null, BERTags.FLAGS);
        this.f286434q = new w4l.f(new y(this, 4), new v(this, 7), new y(this, 5), new v(this, 8), new y(this, 6), null, null, null, BERTags.FLAGS);
        this.f286435r = new w4l.f(new y(this, 7), new v(this, 10), new y(this, 8), new v(this, 11), new y(this, 9), null, null, null, BERTags.FLAGS);
        this.f286436s = new w4l.f(new y(this, 10), new v(this, 12), new y(this, 11), new v(this, 13), new y(this, 12), null, null, null, BERTags.FLAGS);
        this.f286437t = new w4l.f(new y(this, 14), new v(this, 14), new y(this, 15), new v(this, 15), new y(this, 16), null, null, null, BERTags.FLAGS);
        y fromNetwork = new y(this, 17);
        v fromMemory = new v(this, 16);
        y toMemory = new y(this, 18);
        v fromStorage = new v(this, 17);
        y toStorage = new y(this, 19);
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        Intrinsics.checkNotNullParameter(fromMemory, "fromMemory");
        Intrinsics.checkNotNullParameter(toMemory, "toMemory");
        Intrinsics.checkNotNullParameter(fromStorage, "fromStorage");
        Intrinsics.checkNotNullParameter(toStorage, "toStorage");
        ryc.a aVar = new ryc.a();
        aVar.f258289a = fromStorage;
        aVar.f258290b = new w4l.f(new qce.b(aVar, fromNetwork, 24), fromMemory, toMemory, fromStorage, toStorage, null, null, null, BERTags.FLAGS);
        this.u = aVar;
        this.v = new w4l.f(new y(this, 20), new v(this, 19), new y(this, 21), new v(this, 20), new y(this, 22), null, null, null, BERTags.FLAGS);
        this.f286438w = new w4l.f(new y(this, 23), new v(this, 21), new y(this, 24), new v(this, 22), new y(this, 25), null, null, null, BERTags.FLAGS);
        this.f286439x = new w4l.f(new y(this, 27), new v(this, 23), new y(this, 28), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        this.f286440y = new w4l.f(new y(this, 29), null, null, null, null, null, null, null, 254);
    }

    public static final Object a(b1 b1Var, List list, b93.d dVar, gim.i iVar) {
        return dVar == b93.d.CRYPTO ? b1Var.k.m(list, iVar) : d(list, dVar);
    }

    public static List c(h0 h0Var, List list) {
        if (h0Var instanceof h0.a) {
            return list;
        }
        if (!(h0Var instanceof i0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (list == null) {
            return null;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((h93.f0) it8.next()).f150110a, ((i0) h0Var).f286454a)) {
                return list;
            }
        }
        return null;
    }

    public static List d(List list, b93.d dVar) {
        if (dVar == b93.d.CRYPTO) {
            throw new IllegalArgumentException("Use suspending filterCardsWithScope for CRYPTO");
        }
        switch (j0.f286458b[dVar.ordinal()]) {
            case 1:
            case 2:
                return list;
            case 3:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((h93.f0) obj2).M()) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 4:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    h93.f0 f0Var = (h93.f0) obj3;
                    if ((f0Var.G == h93.l0.BRAZIL_LOCAL) ^ f0Var.C()) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 5:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (((h93.f0) obj4).P()) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 6:
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list) {
                    h93.f0 f0Var2 = (h93.f0) obj5;
                    if (f0Var2.b0() || f0Var2.d0()) {
                        arrayList4.add(obj5);
                    }
                }
                return arrayList4;
            case 7:
                throw new IllegalStateException("unreachable");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static List q(List list, b93.k kVar) {
        int i = j0.f286459c[kVar.ordinal()];
        if (i == 1) {
            return zhm.d0.P0(zhm.d0.P0(zhm.d0.P0(list, new s0()), new t0()), new u0());
        }
        if (i == 2) {
            return zhm.d0.P0(list, new q0());
        }
        if (i == 3) {
            return zhm.d0.P0(list, new r0());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final efm.r b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        efm.r map = this.f286432n.f(new i0(cardId), false).map(new a0(15, new w(this, cardId, 3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final List e(List list) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter("SHOW_MEXICO_MCY_CARD", "id");
        if (((Boolean) oc.c.m(this.f, new tk0.b("SHOW_MEXICO_MCY_CARD"), Boolean.FALSE)).booleanValue()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((h93.f0) obj2).X) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final h93.f0 f(String str) {
        Object next;
        Iterator it8 = g().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((u6l.j) next).getId(), str)) {
                break;
            }
        }
        u6l.j jVar = (u6l.j) next;
        if (jVar != null) {
            return u6l.k.a(jVar);
        }
        return null;
    }

    public final List g() {
        List list = (List) this.f286425b.T2("REVOLUT_CARDS_STORAGE_KEY", z);
        return list == null ? zhm.f0.f322471a : list;
    }

    public final List h() {
        List list = (List) this.f286425b.T2("REVOLUT_CARDS_STORAGE_KEY", z);
        if (list != null) {
            return r(list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v6l.k0
            if (r0 == 0) goto L13
            r0 = r7
            v6l.k0 r0 = (v6l.k0) r0
            int r1 = r0.f286462w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286462w = r1
            goto L18
        L13:
            v6l.k0 r0 = new v6l.k0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286462w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r7 = r5.f286424a
            efm.d0 r7 = r7.getDigitizedCardsByToken(r6)
            uo7.k r2 = new uo7.k
            r4 = 24
            r2.<init>(r6, r4)
            v6l.k r6 = new v6l.k
            r4 = 11
            r6.<init>(r4, r2)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r4 = 1
            r2.<init>(r7, r6, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            ufm.n r6 = te0.w.i0(r2)
            r0.f286462w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.b1.i(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(c93.s r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v6l.l0
            if (r0 == 0) goto L13
            r0 = r7
            v6l.l0 r0 = (v6l.l0) r0
            int r1 = r0.f286465w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286465w = r1
            goto L18
        L13:
            v6l.l0 r0 = new v6l.l0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286465w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L64
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r7 = r5.f286424a
            java.lang.String r6 = r6.a()
            efm.d0 r6 = r7.getExceptionalLimitsEligibility(r6)
            v6l.b0 r7 = new v6l.b0
            r2 = 13
            r7.<init>(r2)
            v6l.e0 r2 = new v6l.e0
            r4 = 4
            r2.<init>(r4, r7)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            ufm.n r6 = te0.w.i0(r7)
            r0.f286465w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.b1.j(c93.s, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof v6l.n0
            if (r0 == 0) goto L13
            r0 = r6
            v6l.n0 r0 = (v6l.n0) r0
            int r1 = r0.f286476w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286476w = r1
            goto L18
        L13:
            v6l.n0 r0 = new v6l.n0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286476w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            s2i.i r6 = new s2i.i
            r2 = 13
            r6.<init>(r5, r2)
            ufm.c r2 = new ufm.c
            r4 = 2
            r2.<init>(r6, r4)
            java.lang.String r6 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            ufm.n r6 = te0.w.i0(r2)
            r0.f286476w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.b1.k(gim.c):java.lang.Object");
    }

    public final ufm.n l(String str, e93.e virtualCardDesign, String str2, String str3, String str4, i93.d dVar, Set set, e93.b bVar) {
        Intrinsics.checkNotNullParameter(virtualCardDesign, "virtualCardDesign");
        String strG = bVar != null ? u1.g(bVar, hx7.l.j()) : null;
        b93.b bVar2 = virtualCardDesign.f123843c;
        q6l.k kVar = (dVar == null || set == null) ? null : new q6l.k(dVar, set);
        String str5 = bVar2.f13615a;
        boolean z3 = virtualCardDesign.f == e93.m0.DISPOSABLE;
        h93.l0 l0VarQ = ce9.m.q(virtualCardDesign);
        q6l.l lVar = new q6l.l(strG, str5, z3, str2, str3, str4, kVar, l0VarQ != null ? l0VarQ.name() : null, virtualCardDesign.v);
        RevolutCardService revolutCardService = this.f286424a;
        efm.d0<p6l.q> d0VarIssuePocketBoundVirtualCard = kVar != null ? revolutCardService.issuePocketBoundVirtualCard(str, lVar) : revolutCardService.issueVirtualCard(str, lVar, "CARDS_BRAZIL_EXPANSION");
        a0 a0Var = new a0(11, new b0(3));
        d0VarIssuePocketBoundVirtualCard.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarIssuePocketBoundVirtualCard, a0Var, 1), new a0(12, new d0(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return te0.w.i0(iVar);
    }

    public final efm.r m(b93.d cardScope, boolean z3, b93.k sortType) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        return pd.b.r(this.f286432n.f(h0.a.f286452a, this.f286430l.a(Unit.f186387a, z3)), new uyh.w(cardScope, 8, this, sortType));
    }

    public final pfm.h n(String str) {
        pfm.h hVar = new pfm.h(new c0(this, str, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.h o(h93.f0 f0Var) {
        pfm.h hVar = new pfm.h(new v3e.t(this, f0Var, 2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final synchronized List p(List list, boolean z3) {
        List listD1;
        try {
            List listG = g();
            int iB = zhm.q0.b(zhm.w.t(listG, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (Object obj2 : listG) {
                linkedHashMap.put(((u6l.j) obj2).getId(), obj2);
            }
            LinkedHashMap linkedHashMapZ = zhm.r0.z(linkedHashMap);
            if (z3) {
                Iterator it8 = zhm.r0.u(linkedHashMapZ).entrySet().iterator();
                while (it8.hasNext()) {
                    String str = (String) ((Map.Entry) it8.next()).getKey();
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            if (Intrinsics.f(((u6l.j) it9.next()).getId(), str)) {
                                break;
                            }
                        }
                    }
                    linkedHashMapZ.remove(str);
                }
            }
            Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                u6l.j jVar = (u6l.j) it10.next();
                u6l.j jVar2 = (u6l.j) linkedHashMapZ.get(jVar.getId());
                if (jVar2 != null) {
                    String strU = jVar.getId();
                    String strB = jVar.getPin();
                    if (strB == null) {
                        strB = jVar2.getPin();
                    }
                    String str2 = strB;
                    String strW = jVar.getLabel();
                    if (strW == null) {
                        strW = jVar2.getLabel();
                    }
                    u6l.d dVarG = jVar.getCardSettings();
                    if (dVarG == null) {
                        dVarG = jVar2.getCardSettings();
                    }
                    linkedHashMapZ.put(strU, u6l.j.a(jVar, strW, str2, dVarG, null, null, -1572869));
                } else {
                    linkedHashMapZ.put(jVar.getId(), jVar);
                }
            }
            listD1 = zhm.d0.d1(linkedHashMapZ.values());
            ue0.c cVar = this.f286425b;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KType kTypeB = kotlin.jvm.internal.o0.b(u6l.j.class);
            companion.getClass();
            cVar.G(listD1, "REVOLUT_CARDS_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
        } catch (Throwable th10) {
            throw th10;
        }
        return listD1;
    }

    public final List r(List list) {
        return nkm.y.J(nkm.y.x(nkm.y.n(zhm.d0.Q(list), new v(this, 1)), new v6e.d(18)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof v6l.x0
            if (r0 == 0) goto L13
            r0 = r8
            v6l.x0 r0 = (v6l.x0) r0
            int r1 = r0.f286515w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286515w = r1
            goto L18
        L13:
            v6l.x0 r0 = new v6l.x0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286515w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            goto L51
        L36:
            yhm.o.b(r8)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r8 = r5.f286424a
            q6l.o r2 = new q6l.o
            r2.<init>(r7)
            efm.b r6 = r8.updateCardDesign(r6, r2)
            pfm.r r6 = te0.w.g0(r6)
            r0.f286515w = r4
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L51
            goto L65
        L51:
            qe0.s r6 = r5.f286430l
            r6.d = r4
            w4l.f r6 = r5.f286432n
            v6l.h0$a r7 = v6l.h0.a.f286452a
            efm.b r6 = r6.g(r7, r4)
            r0.f286515w = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.b1.s(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(h93.y0 r8, gim.c r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof v6l.y0
            if (r0 == 0) goto L13
            r0 = r9
            v6l.y0 r0 = (v6l.y0) r0
            int r1 = r0.f286518w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286518w = r1
            goto L18
        L13:
            v6l.y0 r0 = new v6l.y0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286518w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L27
            goto L58
        L27:
            r8 = move-exception
            goto L5b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r9 = r7.f286424a     // Catch: java.lang.Exception -> L27
            q6l.s r2 = new q6l.s     // Catch: java.lang.Exception -> L27
            h93.u r4 = r8.f150171a     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r4.a()     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r8.f150172b     // Catch: java.lang.Exception -> L27
            java.lang.String r6 = r8.f150173c     // Catch: java.lang.Exception -> L27
            java.lang.String r8 = r8.d     // Catch: java.lang.Exception -> L27
            r2.<init>(r4, r5, r6, r8)     // Catch: java.lang.Exception -> L27
            efm.b r8 = r9.validateCardDesign(r2)     // Catch: java.lang.Exception -> L27
            pfm.r r8 = te0.w.g0(r8)     // Catch: java.lang.Exception -> L27
            r0.f286518w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r8 = nim.a.a(r8, r0)     // Catch: java.lang.Exception -> L27
            if (r8 != r1) goto L58
            return r1
        L58:
            h93.b1$a r8 = h93.b1.a.f150097a     // Catch: java.lang.Exception -> L27
            return r8
        L5b:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto Lc6
            boolean r9 = r8 instanceof com.revolut.core.network.exceptions.HandledNetworkException
            r0 = 0
            if (r9 == 0) goto L68
            r9 = r8
            com.revolut.core.network.exceptions.HandledNetworkException r9 = (com.revolut.core.network.exceptions.HandledNetworkException) r9
            goto L69
        L68:
            r9 = r0
        L69:
            if (r9 == 0) goto L70
            java.lang.Throwable r9 = r9.getCause()
            goto L71
        L70:
            r9 = r0
        L71:
            boolean r1 = r9 instanceof com.revolut.core.error.data.model.ServerErrorException
            if (r1 == 0) goto L7a
            com.revolut.core.error.data.model.ServerErrorException r9 = (com.revolut.core.error.data.model.ServerErrorException) r9
            java.lang.String r9 = r9.f51368g
            goto L84
        L7a:
            boolean r1 = r9 instanceof com.revolut.core.network.exceptions.NetworkException
            if (r1 == 0) goto L83
            com.revolut.core.network.exceptions.NetworkException r9 = (com.revolut.core.network.exceptions.NetworkException) r9
            java.lang.String r9 = r9.d
            goto L84
        L83:
            r9 = r0
        L84:
            if (r9 == 0) goto La2
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L93
            kg.o r1 = r7.f286429j     // Catch: java.lang.Throwable -> L93
            java.lang.Class<r6l.a> r2 = r6l.a.class
            java.lang.Object r9 = r1.c(r9, r2)     // Catch: java.lang.Throwable -> L93
            r6l.a r9 = (r6l.a) r9     // Catch: java.lang.Throwable -> L93
            goto L9a
        L93:
            r9 = move-exception
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L9a:
            boolean r1 = r9 instanceof yhm.n
            if (r1 == 0) goto L9f
            goto La0
        L9f:
            r0 = r9
        La0:
            r6l.a r0 = (r6l.a) r0
        La2:
            if (r0 == 0) goto Lbf
            int r9 = r0.getCode()
            r1 = 90403(0x16123, float:1.26682E-40)
            if (r9 != r1) goto Lbf
            h93.a1 r8 = new h93.a1
            java.lang.String r9 = r0.getTitle()
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = r0.getDeeplink()
            r8.<init>(r9, r1, r0)
            goto Lc5
        Lbf:
            h93.z0 r9 = new h93.z0
            r9.<init>(r8)
            r8 = r9
        Lc5:
            return r8
        Lc6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.b1.t(h93.y0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (nim.a.a(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v6l.z0
            if (r0 == 0) goto L13
            r0 = r7
            v6l.z0 r0 = (v6l.z0) r0
            int r1 = r0.f286522x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286522x = r1
            goto L18
        L13:
            v6l.z0 r0 = new v6l.z0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286522x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2c
            goto L71
        L2c:
            r7 = move-exception
            goto L74
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2c
            goto L52
        L3c:
            yhm.o.b(r7)
            mg0.a r7 = r5.f286428h     // Catch: java.lang.Exception -> L2c
            am0.b r7 = (am0.b) r7     // Catch: java.lang.Exception -> L2c
            ufm.i r7 = r7.a(r6)     // Catch: java.lang.Exception -> L2c
            r0.u = r6     // Catch: java.lang.Exception -> L2c
            r0.f286522x = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = nim.a.b(r7, r0)     // Catch: java.lang.Exception -> L2c
            if (r7 != r1) goto L52
            goto L70
        L52:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2c
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r2 = r5.f286424a     // Catch: java.lang.Exception -> L2c
            q6l.r r4 = new q6l.r     // Catch: java.lang.Exception -> L2c
            kotlin.jvm.internal.Intrinsics.h(r7)     // Catch: java.lang.Exception -> L2c
            r4.<init>(r7)     // Catch: java.lang.Exception -> L2c
            efm.b r7 = r2.validateCardPin(r4)     // Catch: java.lang.Exception -> L2c
            pfm.r r7 = te0.w.g0(r7)     // Catch: java.lang.Exception -> L2c
            r0.u = r6     // Catch: java.lang.Exception -> L2c
            r0.f286522x = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = nim.a.a(r7, r0)     // Catch: java.lang.Exception -> L2c
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            h93.x0$a r6 = h93.x0.a.f150169a     // Catch: java.lang.Exception -> L2c
            return r6
        L74:
            sf0.h r0 = r5.i
            com.revolut.core.error.data.model.ServerError r0 = r0.a(r7)
            if (r0 == 0) goto L88
            int r0 = r0.f51362a
            r1 = 1234(0x4d2, float:1.729E-42)
            if (r0 != r1) goto L88
            h93.w0 r7 = new h93.w0
            r7.<init>(r6)
            goto L8e
        L88:
            h93.v0 r6 = new h93.v0
            r6.<init>(r7)
            r7 = r6
        L8e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.b1.u(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof v6l.a1
            if (r0 == 0) goto L13
            r0 = r8
            v6l.a1 r0 = (v6l.a1) r0
            int r1 = r0.f286420w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286420w = r1
            goto L18
        L13:
            v6l.a1 r0 = new v6l.a1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286420w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L88
        L2a:
            r7 = move-exception
            goto L8e
        L2c:
            r7 = move-exception
            goto La0
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L4e
        L3a:
            yhm.o.b(r8)
            mg0.a r8 = r6.f286428h     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            am0.b r8 = (am0.b) r8     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            ufm.i r7 = r8.a(r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f286420w = r4     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r8 = nim.a.b(r7, r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != r1) goto L4e
            goto L87
        L4e:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService r7 = r6.f286424a     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.String r2 = "GCM"
            q6l.t r5 = new q6l.t     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            kotlin.jvm.internal.Intrinsics.h(r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            efm.d0 r7 = r7.validateLinkCard(r2, r5)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            v6l.b0 r8 = new v6l.b0     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r2 = 8
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            v6l.a0 r2 = new v6l.a0     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r5 = 25
            r2.<init>(r5, r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r7.getClass()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            ufm.i r8 = new ufm.i     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r8.<init>(r7, r2, r4)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            ufm.n r7 = te0.w.i0(r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f286420w = r3     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r8 = nim.a.b(r7, r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.jvm.internal.Intrinsics.h(r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            h93.h1 r8 = (h93.h1) r8     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            return r8
        L8e:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r7, r8)
            h93.g1 r7 = new h93.g1
            java.lang.String r8 = "NETWORK_ERROR"
            r7.<init>(r8)
            return r7
        La0:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.b1.v(java.lang.String, gim.c):java.lang.Object");
    }
}
