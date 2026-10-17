package v6l;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.shared.feature.cards.domain.impl.data.network.card.CardService;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardService f286495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f286496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f286497c;
    public final e d;
    public final ha3.b e;
    public final qe0.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qe0.s f286498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f286499h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f286500j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f286501l;

    public s(CardService cardService, ne0.j memoryCache, xe0.e storage, e cardDesignDtoMapper, f cardDesignStorageMapper, ha3.b experimentsHeaderContributor, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(cardService, "cardService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cardDesignDtoMapper, "cardDesignDtoMapper");
        Intrinsics.checkNotNullParameter(cardDesignStorageMapper, "cardDesignStorageMapper");
        Intrinsics.checkNotNullParameter(experimentsHeaderContributor, "experimentsHeaderContributor");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f286495a = cardService;
        this.f286496b = memoryCache;
        this.f286497c = storage;
        this.d = cardDesignDtoMapper;
        this.e = experimentsHeaderContributor;
        ze0.c cVar = (ze0.c) forceReloadStrategyFactory;
        this.f = cVar.b(180000L);
        this.f286498g = cVar.b(300000L);
        final int i = 0;
        final int i2 = 9;
        final int i3 = 10;
        this.f286499h = new w4l.f(new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, 6), new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, 8), new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 11;
        final int i6 = 12;
        final int i21 = 13;
        this.i = new w4l.f(new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, 9), new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, 10), new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 1;
        Function2 function2 = new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i32 = 2;
        j jVar = new j(this, i32);
        Function2 function22 = new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i33 = 3;
        this.f286500j = new w4l.f(function2, jVar, function22, new j(this, i33), new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 4;
        Function2 function23 = new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        j jVar2 = new j(this, i43);
        final int i59 = 5;
        Function2 function24 = new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        j jVar3 = new j(this, i59);
        final int i66 = 6;
        this.k = new w4l.f(function23, jVar2, function24, jVar3, new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i74 = 7;
        Function2 function25 = new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        j jVar4 = new j(this, i74);
        final int i92 = 8;
        this.f286501l = new w4l.f(function25, jVar4, new Function2(this) { // from class: v6l.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f286464b;

            {
                this.f286464b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        p params = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        s sVar = this.f286464b;
                        CardService cardService2 = sVar.f286495a;
                        String str = params.f286483a;
                        String str2 = params.e;
                        String str3 = params.f;
                        String str4 = params.f286486g;
                        String str5 = params.f286487h;
                        h93.j0 j0Var = params.f286484b;
                        String strName = j0Var != null ? j0Var.name() : null;
                        LinkedHashSet linkedHashSetL = zhm.a1.l(params.d, zhm.v.l(params.f286485c));
                        LinkedHashSet linkedHashSet = !linkedHashSetL.isEmpty() ? linkedHashSetL : null;
                        efm.d0<List<n6l.u>> physicalCardDesigns = cardService2.getPhysicalCardDesigns(str, strName, linkedHashSet != null ? zhm.d0.k0(linkedHashSet, ",", null, null, 0, new v6e.d(9), 30) : null, str2, str3, str4, str5, params.i, params.f286488j, params.k, sVar.c());
                        k kVar = new k(8, new j(sVar, 12));
                        physicalCardDesigns.getClass();
                        ufm.i iVar = new ufm.i(new ufm.f(physicalCardDesigns, kVar, 3), new k(9, new ux7.i(1, sVar.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        n params2 = (n) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        s sVar2 = this.f286464b;
                        efm.d0<List<n6l.u>> physicalCardDesignsLegacy = sVar2.f286495a.getPhysicalCardDesignsLegacy(params2.f286469a, params2.f286470b, params2.f286471c, params2.d, params2.e, params2.f, params2.f286472g, params2.f286473h, params2.i, params2.f286474j, params2.k, params2.f286475l, sVar2.c());
                        k kVar2 = new k(2, new j(sVar2, 0));
                        physicalCardDesignsLegacy.getClass();
                        ufm.i iVar2 = new ufm.i(new ufm.f(physicalCardDesignsLegacy, kVar2, 3), new k(4, new ux7.i(1, sVar2.d, e.class, "toPhysicalDomainList", "toPhysicalDomainList(Ljava/util/List;)Ljava/util/List;", 0, 19)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        n params3 = (n) obj2;
                        List designs = (List) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(designs, "designs");
                        this.f286464b.f286496b.f(s.n(params3), designs);
                        break;
                    case 3:
                        n params4 = (n) obj2;
                        List designs2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(designs2, "designs");
                        xe0.e eVar = this.f286464b.f286497c;
                        String strN = s.n(params4);
                        List list = designs2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(f.a((e93.d) it8.next()));
                        }
                        eVar.G(arrayList, strN, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 4:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        o params5 = (o) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params5, "params");
                        s sVar3 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsLegacy = sVar3.f286495a.getVirtualCardDesignsLegacy(params5.f286477a, params5.f286478b, params5.f286479c, params5.d, params5.e, params5.f286481h, params5.f286480g, params5.i, params5.f, params5.f286482j, sVar3.c());
                        k kVar3 = new k(6, new j(sVar3, 11));
                        virtualCardDesignsLegacy.getClass();
                        ufm.i iVar3 = new ufm.i(new ufm.f(virtualCardDesignsLegacy, kVar3, 3), new k(7, new ux7.i(1, sVar3.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 20)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 5:
                        o params6 = (o) obj2;
                        List designs3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params6, "params");
                        Intrinsics.checkNotNullParameter(designs3, "designs");
                        this.f286464b.f286496b.f(s.o(params6), designs3);
                        break;
                    case 6:
                        o params7 = (o) obj2;
                        List designs4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params7, "params");
                        Intrinsics.checkNotNullParameter(designs4, "designs");
                        xe0.e eVar2 = this.f286464b.f286497c;
                        String strO = s.o(params7);
                        List list2 = designs4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(f.c((e93.e) it9.next()));
                        }
                        eVar2.G(arrayList2, strO, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String cardId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(cardId, "cardId");
                        s sVar4 = this.f286464b;
                        efm.d0<List<n6l.a0>> virtualCardDesignsForCard = sVar4.f286495a.getVirtualCardDesignsForCard(cardId);
                        k kVar4 = new k(5, new ux7.i(1, sVar4.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 23));
                        virtualCardDesignsForCard.getClass();
                        ufm.i iVar4 = new ufm.i(virtualCardDesignsForCard, kVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String cardId2 = (String) obj2;
                        List designs5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardId2, "cardId");
                        Intrinsics.checkNotNullParameter(designs5, "designs");
                        ehe.n.z("VIRTUAL_CARD_DESIGN_FOR_CARD_MEM_CACHE_KEY_", cardId2, this.f286464b.f286496b, designs5);
                        break;
                    case 9:
                        p params8 = (p) obj2;
                        List designs6 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params8, "params");
                        Intrinsics.checkNotNullParameter(designs6, "designs");
                        this.f286464b.f286496b.f(s.l(params8), designs6);
                        break;
                    case 10:
                        p params9 = (p) obj2;
                        List designs7 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params9, "params");
                        Intrinsics.checkNotNullParameter(designs7, "designs");
                        xe0.e eVar3 = this.f286464b.f286497c;
                        String strL = s.l(params9);
                        List list3 = designs7;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(f.a((e93.d) it10.next()));
                        }
                        eVar3.G(arrayList3, strL, kii.e.o(s6l.m.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 11:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        q params10 = (q) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params10, "params");
                        s sVar5 = this.f286464b;
                        CardService cardService3 = sVar5.f286495a;
                        String str6 = params10.f286490a;
                        String str7 = params10.e;
                        h93.j0 j0Var2 = params10.f286491b;
                        String strName2 = j0Var2 != null ? j0Var2.name() : null;
                        LinkedHashSet linkedHashSetL2 = zhm.a1.l(params10.d, zhm.v.l(params10.f286492c));
                        LinkedHashSet linkedHashSet2 = !linkedHashSetL2.isEmpty() ? linkedHashSetL2 : null;
                        efm.d0<List<n6l.a0>> virtualCardDesigns = cardService3.getVirtualCardDesigns(strName2, linkedHashSet2 != null ? zhm.d0.k0(linkedHashSet2, ",", null, null, 0, new v6e.d(10), 30) : null, str6, params10.f, str7, params10.f286493g, sVar5.c());
                        v4a.i iVar5 = new v4a.i(29, new j(sVar5, 1));
                        virtualCardDesigns.getClass();
                        ufm.i iVar6 = new ufm.i(new ufm.f(virtualCardDesigns, iVar5, 3), new k(0, new ux7.i(1, sVar5.d, e.class, "toVirtualDomainList", "toVirtualDomainList(Ljava/util/List;)Ljava/util/List;", 0, 22)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        break;
                    case 12:
                        q params11 = (q) obj2;
                        List designs8 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params11, "params");
                        Intrinsics.checkNotNullParameter(designs8, "designs");
                        this.f286464b.f286496b.f(s.m(params11), designs8);
                        break;
                    default:
                        q params12 = (q) obj2;
                        List designs9 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params12, "params");
                        Intrinsics.checkNotNullParameter(designs9, "designs");
                        xe0.e eVar4 = this.f286464b.f286497c;
                        String strM = s.m(params12);
                        List list4 = designs9;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it11 = list4.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(f.c((e93.e) it11.next()));
                        }
                        eVar4.G(arrayList4, strM, kii.e.o(s6l.q.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String l(p pVar) {
        return a0.d.n("PHYSICAL_CARD_DESIGN_CONFIG_MEM_CACHE_KEY_", pVar.hashCode());
    }

    public static String m(q qVar) {
        return a0.d.n("VIRTUAL_CARD_DESIGN_MEM_CACHE_KEY_", qVar.hashCode());
    }

    public static String n(n nVar) {
        return a0.d.n("PHYSICAL_CARD_DESIGN_CONFIG_MEM_CACHE_KEY_legacy_", nVar.hashCode());
    }

    public static String o(o oVar) {
        return a0.d.n("VIRTUAL_CARD_DESIGN_MEM_CACHE_KEY_legacy_", oVar.hashCode());
    }

    public final void a() {
        this.f.d = true;
        this.f286498g.d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof v6l.r
            if (r0 == 0) goto L13
            r0 = r7
            v6l.r r0 = (v6l.r) r0
            int r1 = r0.f286494w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286494w = r1
            goto L18
        L13:
            v6l.r r0 = new v6l.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286494w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            com.revolut.shared.feature.cards.domain.impl.data.network.card.CardService r7 = r4.f286495a
            efm.d0 r5 = r7.getCardIssueCheckoutQuotes(r5)
            v6e.d r6 = new v6e.d
            r7 = 13
            r6.<init>(r7)
            v6l.k r7 = new v6l.k
            r2 = 1
            r7.<init>(r2, r6)
            r5.getClass()
            ufm.i r6 = new ufm.i
            r6.<init>(r5, r7, r2)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            ufm.n r5 = te0.w.i0(r6)
            r0.f286494w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v6l.s.b(long, gim.c):java.lang.Object");
    }

    public final String c() {
        String[] elements = {"CARDS_BRAZIL_EXPANSION", "CARD_DESIGN_CATALOGUE_SELECTION", "TRANSPARENT_DISPOSABLE_CARD"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListE0 = zhm.d0.E0(zhm.z0.h(((jte.d) this.e.f150396a).c(CardsCoreApi$Toggles.CardPriceIncludingDeliveryFee.f65559c) ? "CARD_PRICE_INCLUDING_DELIVERY_FEE" : null), kotlin.collections.d.L(elements));
        ArrayList arrayList = !arrayListE0.isEmpty() ? arrayListE0 : null;
        if (arrayList != null) {
            return zhm.d0.k0(arrayList, ",", null, null, 0, null, 62);
        }
        return null;
    }

    public final efm.r d(boolean z, String walletId, h93.j0 j0Var, h93.l0 l0Var, String str, String str2, String str3, List list, e93.o entryPoint, e93.b bVar, boolean z3) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return this.f286499h.f(new p(walletId, j0Var, l0Var, str, z3 ? null : str2, z3 ? str2 : null, str3, list, entryPoint.a(), bVar != null ? u1.g(bVar, hx7.l.j()) : null, 8), this.f.a(Unit.f186387a, z));
    }

    public final efm.r f(String walletId, boolean z, boolean z3, boolean z4, String str, String str2, String str3, h93.j0 j0Var, h93.l0 l0Var, List list, e93.o entryPoint, e93.b bVar, boolean z6) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return this.f286500j.f(new n(walletId, (z3 && l0Var == h93.l0.BRAZIL_LOCAL) ? null : Boolean.valueOf(z3), z4, str, z6 ? null : str2, z6 ? str2 : null, str3, j0Var != null ? j0Var.name() : null, l0Var != null ? l0Var.name() : null, list, entryPoint.a(), bVar != null ? u1.g(bVar, hx7.l.j()) : null), this.f.a(Unit.f186387a, z));
    }

    public final efm.r h(boolean z, h93.j0 j0Var, h93.l0 l0Var, String str, String str2, e93.b bVar, List list) {
        return nim.a.w(this.i.f(new q(str, j0Var, l0Var, str2, bVar != null ? u1.g(bVar, hx7.l.j()) : null, list), this.f286498g.a(Unit.f186387a, z)), new v6e.d(12));
    }

    public final efm.r j(boolean z, String str, boolean z3, boolean z4, boolean z6, boolean z11, String str2, h93.j0 j0Var, h93.l0 l0Var, e93.b bVar, List list) {
        return nim.a.w(this.k.f(new o(str, (z3 && l0Var == h93.l0.BRAZIL_LOCAL) ? null : Boolean.valueOf(z3), z4, z6, z11, str2, l0Var != null ? l0Var.name() : null, j0Var != null ? j0Var.name() : null, bVar != null ? u1.g(bVar, hx7.l.j()) : null, list), this.f286498g.a(Unit.f186387a, z)), new v6e.d(11));
    }

    public final pfm.r p(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return te0.w.g0(this.f286495a.verifyAddingCardToGooglePay(cardId));
    }
}
