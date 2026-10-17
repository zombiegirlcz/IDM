package ba3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.cards_core.impl.data.network.promotions.CardPromotionsService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import le.u1;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements o93.a {

    @NotNull
    public static final c Companion = new c();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardPromotionsService f13885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f13886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f13887c;
    public final w4l.f d;

    static {
        Type type = new TypeToken<List<? extends n93.d>>() { // from class: com.revolut.feature.cards_core.impl.data.repository.CardPromotionsRepositoryImpl$Companion$CARD_PROMOTIONS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public d(CardPromotionsService cardPromotionsService, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(cardPromotionsService, "cardPromotionsService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f13885a = cardPromotionsService;
        this.f13886b = storage;
        this.f13887c = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: ba3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f13882b;

            {
                this.f13882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        d0<List<x93.a>> promotions = this.f13882b.f13885a.getPromotions(walletId);
                        b79.g gVar = new b79.g(new b96.a(8), 17);
                        promotions.getClass();
                        i iVar = new i(promotions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List cardPromotions = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cardPromotions, "cardPromotions");
                        this.f13882b.f13887c.f("CARDS_KEY", cardPromotions);
                        break;
                    default:
                        List cardPromotions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cardPromotions2, "cardPromotions");
                        ue0.c cVar = this.f13882b.f13886b;
                        Intrinsics.checkNotNullParameter(cardPromotions2, "<this>");
                        List list = cardPromotions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new z93.a(u1.g((n93.d) it8.next(), w93.a.f295690a)));
                        }
                        cVar.G(arrayList, "CARDS_KEY", kii.e.o(z93.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: ba3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f13884b;

            {
                this.f13884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it8 = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f13884b.f13887c.get("CARDS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) this.f13884b.f13886b.T2("CARDS_KEY", d.e);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add((n93.d) u1.u(((z93.a) it9.next()).getName(), w93.a.f295690a));
                        }
                        return arrayList;
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: ba3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f13882b;

            {
                this.f13882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        d0<List<x93.a>> promotions = this.f13882b.f13885a.getPromotions(walletId);
                        b79.g gVar = new b79.g(new b96.a(8), 17);
                        promotions.getClass();
                        i iVar = new i(promotions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List cardPromotions = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cardPromotions, "cardPromotions");
                        this.f13882b.f13887c.f("CARDS_KEY", cardPromotions);
                        break;
                    default:
                        List cardPromotions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cardPromotions2, "cardPromotions");
                        ue0.c cVar = this.f13882b.f13886b;
                        Intrinsics.checkNotNullParameter(cardPromotions2, "<this>");
                        List list = cardPromotions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new z93.a(u1.g((n93.d) it8.next(), w93.a.f295690a)));
                        }
                        cVar.G(arrayList, "CARDS_KEY", kii.e.o(z93.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: ba3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f13884b;

            {
                this.f13884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String it8 = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f13884b.f13887c.get("CARDS_KEY");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List list = (List) this.f13884b.f13886b.T2("CARDS_KEY", d.e);
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList.add((n93.d) u1.u(((z93.a) it9.next()).getName(), w93.a.f295690a));
                        }
                        return arrayList;
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: ba3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f13882b;

            {
                this.f13882b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String walletId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(walletId, "walletId");
                        d0<List<x93.a>> promotions = this.f13882b.f13885a.getPromotions(walletId);
                        b79.g gVar = new b79.g(new b96.a(8), 17);
                        promotions.getClass();
                        i iVar = new i(promotions, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        List cardPromotions = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cardPromotions, "cardPromotions");
                        this.f13882b.f13887c.f("CARDS_KEY", cardPromotions);
                        break;
                    default:
                        List cardPromotions2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(cardPromotions2, "cardPromotions");
                        ue0.c cVar = this.f13882b.f13886b;
                        Intrinsics.checkNotNullParameter(cardPromotions2, "<this>");
                        List list = cardPromotions2;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new z93.a(u1.g((n93.d) it8.next(), w93.a.f295690a)));
                        }
                        cVar.G(arrayList, "CARDS_KEY", kii.e.o(z93.a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
