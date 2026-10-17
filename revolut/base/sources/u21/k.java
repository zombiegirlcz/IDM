package u21;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.database.models.externalcard.ExternalCardEntity;
import com.revolut.data.database.models.externalcard.ExternalCardMappingKt;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.checkout.PaymentMethodResponseDto;
import com.revolut.data.network.models.externalcards.CardDetailsDto;
import com.revolut.data.network.models.externalcards.ExpiryMonthYearDto;
import com.revolut.data.network.models.externalcards.ExternalCardAddRequestDto;
import com.revolut.data.network.models.externalcards.ExternalCardDto;
import com.revolut.data.network.models.externalcards.FirstCardTopupRequestDto;
import com.revolut.data.network.models.externalcards.TopUpRequestMapperKt;
import com.revolut.data.network.models.ideal.IdealIssuersDto;
import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import com.revolut.data.network.services.ExternalCardsService;
import com.revolut.domain.models.externalcards.AddCardParams;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import efm.r;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlin.text.f0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tc7.m0;
import te0.w;
import tx0.p4;
import wim.z;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p71.a {

    @NotNull
    public static final f Companion = new f();
    public static final Type i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f276534j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalCardsService f276535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f276536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f276537c;
    public final wze.b d;
    public final tl0.a e;
    public final w4l.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f276538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v60.i f276539h;

    static {
        Type type = new TypeToken<List<? extends ExternalCardEntity>>() { // from class: com.revolut.data.repositories.externalcard.ExternalCardsRepositoryImpl$Companion$LIST_OF_EXTERNAL_CARDS_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        i = type;
        f276534j = new TypeToken<ExternalCardEntity>() { // from class: com.revolut.data.repositories.externalcard.ExternalCardsRepositoryImpl$Companion$EXTERNAL_CARD_ENTITY_TYPE$1
        }.getType();
    }

    public k(ExternalCardsService externalCardsService, ue0.c externalCardStorage, ne0.j memoryCache, wze.b googlePayRequestMapper, tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(externalCardsService, "externalCardsService");
        Intrinsics.checkNotNullParameter(externalCardStorage, "externalCardStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(googlePayRequestMapper, "googlePayRequestMapper");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f276535a = externalCardsService;
        this.f276536b = externalCardStorage;
        this.f276537c = memoryCache;
        this.d = googlePayRequestMapper;
        this.e = base64Wrapper;
        final int i2 = 0;
        Function2 function2 = new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        Function1 function1 = new Function1(this) { // from class: u21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276530b;

            {
                this.f276530b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f276530b.f276537c.get("ideal_issuers");
                    case 1:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f276530b.f276537c.get("verification_methods");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f276530b.f276537c.get("external_cards");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return k.a(this.f276530b.f276536b);
                    case 4:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        k kVar = this.f276530b;
                        List list = (List) kVar.f276537c.get("external_cards");
                        if (list != null) {
                            Iterator it12 = list.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next = it12.next();
                                    if (Intrinsics.f(((t61.g) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            t61.g gVar = (t61.g) next;
                            if (gVar != null) {
                                return gVar;
                            }
                        }
                        return (t61.g) v7.r("external_cards", id10, kVar.f276537c);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        ue0.c cVar = this.f276530b.f276536b;
                        ArrayList arrayListA = k.a(cVar);
                        if (arrayListA != null) {
                            Iterator it13 = arrayListA.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next2 = it13.next();
                                    if (Intrinsics.f(((t61.g) next2).f268137a, id11)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            t61.g gVar2 = (t61.g) next2;
                            if (gVar2 != null) {
                                return gVar2;
                            }
                        }
                        String strQ = j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id11);
                        Type EXTERNAL_CARD_ENTITY_TYPE = k.f276534j;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CARD_ENTITY_TYPE, "EXTERNAL_CARD_ENTITY_TYPE");
                        ExternalCardEntity externalCardEntity = (ExternalCardEntity) cVar.T2(strQ, EXTERNAL_CARD_ENTITY_TYPE);
                        if (externalCardEntity != null) {
                            return ExternalCardMappingKt.toDomain(externalCardEntity);
                        }
                        return null;
                }
            }
        };
        final int i5 = 5;
        Function2 function22 = new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i6 = 3;
        Function1 function12 = new Function1(this) { // from class: u21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276530b;

            {
                this.f276530b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f276530b.f276537c.get("ideal_issuers");
                    case 1:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f276530b.f276537c.get("verification_methods");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f276530b.f276537c.get("external_cards");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return k.a(this.f276530b.f276536b);
                    case 4:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        k kVar = this.f276530b;
                        List list = (List) kVar.f276537c.get("external_cards");
                        if (list != null) {
                            Iterator it12 = list.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next = it12.next();
                                    if (Intrinsics.f(((t61.g) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            t61.g gVar = (t61.g) next;
                            if (gVar != null) {
                                return gVar;
                            }
                        }
                        return (t61.g) v7.r("external_cards", id10, kVar.f276537c);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        ue0.c cVar = this.f276530b.f276536b;
                        ArrayList arrayListA = k.a(cVar);
                        if (arrayListA != null) {
                            Iterator it13 = arrayListA.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next2 = it13.next();
                                    if (Intrinsics.f(((t61.g) next2).f268137a, id11)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            t61.g gVar2 = (t61.g) next2;
                            if (gVar2 != null) {
                                return gVar2;
                            }
                        }
                        String strQ = j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id11);
                        Type EXTERNAL_CARD_ENTITY_TYPE = k.f276534j;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CARD_ENTITY_TYPE, "EXTERNAL_CARD_ENTITY_TYPE");
                        ExternalCardEntity externalCardEntity = (ExternalCardEntity) cVar.T2(strQ, EXTERNAL_CARD_ENTITY_TYPE);
                        if (externalCardEntity != null) {
                            return ExternalCardMappingKt.toDomain(externalCardEntity);
                        }
                        return null;
                }
            }
        };
        final int i21 = 6;
        this.f = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i22 = 7;
        Function2 function23 = new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i32 = 4;
        Function1 function13 = new Function1(this) { // from class: u21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276530b;

            {
                this.f276530b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i32) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f276530b.f276537c.get("ideal_issuers");
                    case 1:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f276530b.f276537c.get("verification_methods");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f276530b.f276537c.get("external_cards");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return k.a(this.f276530b.f276536b);
                    case 4:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        k kVar = this.f276530b;
                        List list = (List) kVar.f276537c.get("external_cards");
                        if (list != null) {
                            Iterator it12 = list.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next = it12.next();
                                    if (Intrinsics.f(((t61.g) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            t61.g gVar = (t61.g) next;
                            if (gVar != null) {
                                return gVar;
                            }
                        }
                        return (t61.g) v7.r("external_cards", id10, kVar.f276537c);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        ue0.c cVar = this.f276530b.f276536b;
                        ArrayList arrayListA = k.a(cVar);
                        if (arrayListA != null) {
                            Iterator it13 = arrayListA.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next2 = it13.next();
                                    if (Intrinsics.f(((t61.g) next2).f268137a, id11)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            t61.g gVar2 = (t61.g) next2;
                            if (gVar2 != null) {
                                return gVar2;
                            }
                        }
                        String strQ = j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id11);
                        Type EXTERNAL_CARD_ENTITY_TYPE = k.f276534j;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CARD_ENTITY_TYPE, "EXTERNAL_CARD_ENTITY_TYPE");
                        ExternalCardEntity externalCardEntity = (ExternalCardEntity) cVar.T2(strQ, EXTERNAL_CARD_ENTITY_TYPE);
                        if (externalCardEntity != null) {
                            return ExternalCardMappingKt.toDomain(externalCardEntity);
                        }
                        return null;
                }
            }
        };
        final int i33 = 8;
        Function2 function24 = new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i43 = 5;
        Function1 function14 = new Function1(this) { // from class: u21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276530b;

            {
                this.f276530b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i43) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f276530b.f276537c.get("ideal_issuers");
                    case 1:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f276530b.f276537c.get("verification_methods");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f276530b.f276537c.get("external_cards");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return k.a(this.f276530b.f276536b);
                    case 4:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        k kVar = this.f276530b;
                        List list = (List) kVar.f276537c.get("external_cards");
                        if (list != null) {
                            Iterator it12 = list.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next = it12.next();
                                    if (Intrinsics.f(((t61.g) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            t61.g gVar = (t61.g) next;
                            if (gVar != null) {
                                return gVar;
                            }
                        }
                        return (t61.g) v7.r("external_cards", id10, kVar.f276537c);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        ue0.c cVar = this.f276530b.f276536b;
                        ArrayList arrayListA = k.a(cVar);
                        if (arrayListA != null) {
                            Iterator it13 = arrayListA.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next2 = it13.next();
                                    if (Intrinsics.f(((t61.g) next2).f268137a, id11)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            t61.g gVar2 = (t61.g) next2;
                            if (gVar2 != null) {
                                return gVar2;
                            }
                        }
                        String strQ = j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id11);
                        Type EXTERNAL_CARD_ENTITY_TYPE = k.f276534j;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CARD_ENTITY_TYPE, "EXTERNAL_CARD_ENTITY_TYPE");
                        ExternalCardEntity externalCardEntity = (ExternalCardEntity) cVar.T2(strQ, EXTERNAL_CARD_ENTITY_TYPE);
                        if (externalCardEntity != null) {
                            return ExternalCardMappingKt.toDomain(externalCardEntity);
                        }
                        return null;
                }
            }
        };
        final int i59 = 9;
        this.f276538g = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i66 = 1;
        Function2 function25 = new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i74 = 0;
        Function1 function15 = new Function1(this) { // from class: u21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276530b;

            {
                this.f276530b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i74) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f276530b.f276537c.get("ideal_issuers");
                    case 1:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f276530b.f276537c.get("verification_methods");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f276530b.f276537c.get("external_cards");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return k.a(this.f276530b.f276536b);
                    case 4:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        k kVar = this.f276530b;
                        List list = (List) kVar.f276537c.get("external_cards");
                        if (list != null) {
                            Iterator it12 = list.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next = it12.next();
                                    if (Intrinsics.f(((t61.g) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            t61.g gVar = (t61.g) next;
                            if (gVar != null) {
                                return gVar;
                            }
                        }
                        return (t61.g) v7.r("external_cards", id10, kVar.f276537c);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        ue0.c cVar = this.f276530b.f276536b;
                        ArrayList arrayListA = k.a(cVar);
                        if (arrayListA != null) {
                            Iterator it13 = arrayListA.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next2 = it13.next();
                                    if (Intrinsics.f(((t61.g) next2).f268137a, id11)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            t61.g gVar2 = (t61.g) next2;
                            if (gVar2 != null) {
                                return gVar2;
                            }
                        }
                        String strQ = j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id11);
                        Type EXTERNAL_CARD_ENTITY_TYPE = k.f276534j;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CARD_ENTITY_TYPE, "EXTERNAL_CARD_ENTITY_TYPE");
                        ExternalCardEntity externalCardEntity = (ExternalCardEntity) cVar.T2(strQ, EXTERNAL_CARD_ENTITY_TYPE);
                        if (externalCardEntity != null) {
                            return ExternalCardMappingKt.toDomain(externalCardEntity);
                        }
                        return null;
                }
            }
        };
        final int i92 = 2;
        new w4l.f(function25, function15, new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i96 = 3;
        final int i99 = 1;
        final int i100 = 4;
        new w4l.f(new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i96) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: u21.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276530b;

            {
                this.f276530b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i99) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f276530b.f276537c.get("ideal_issuers");
                    case 1:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f276530b.f276537c.get("verification_methods");
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (List) this.f276530b.f276537c.get("external_cards");
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return k.a(this.f276530b.f276536b);
                    case 4:
                        String id10 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        k kVar = this.f276530b;
                        List list = (List) kVar.f276537c.get("external_cards");
                        if (list != null) {
                            Iterator it12 = list.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next = it12.next();
                                    if (Intrinsics.f(((t61.g) next).getId(), id10)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            t61.g gVar = (t61.g) next;
                            if (gVar != null) {
                                return gVar;
                            }
                        }
                        return (t61.g) v7.r("external_cards", id10, kVar.f276537c);
                    default:
                        String id11 = (String) obj2;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        ue0.c cVar = this.f276530b.f276536b;
                        ArrayList arrayListA = k.a(cVar);
                        if (arrayListA != null) {
                            Iterator it13 = arrayListA.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next2 = it13.next();
                                    if (Intrinsics.f(((t61.g) next2).f268137a, id11)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            t61.g gVar2 = (t61.g) next2;
                            if (gVar2 != null) {
                                return gVar2;
                            }
                        }
                        String strQ = j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id11);
                        Type EXTERNAL_CARD_ENTITY_TYPE = k.f276534j;
                        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CARD_ENTITY_TYPE, "EXTERNAL_CARD_ENTITY_TYPE");
                        ExternalCardEntity externalCardEntity = (ExternalCardEntity) cVar.T2(strQ, EXTERNAL_CARD_ENTITY_TYPE);
                        if (externalCardEntity != null) {
                            return ExternalCardMappingKt.toDomain(externalCardEntity);
                        }
                        return null;
                }
            }
        }, new Function2(this) { // from class: u21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f276528b;

            {
                this.f276528b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i100) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<ExternalCardDto>> externalCards = this.f276528b.f276535a.getExternalCards();
                        a aVar = new a(9, new b(9));
                        externalCards.getClass();
                        ufm.i iVar = new ufm.i(externalCards, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        d0<IdealIssuersDto> idealIssuer = this.f276528b.f276535a.getIdealIssuer();
                        a aVar2 = new a(3, new tyg.g(29));
                        idealIssuer.getClass();
                        ufm.i iVar2 = new ufm.i(idealIssuer, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        break;
                    case 2:
                        List issuers = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(issuers, "issuers");
                        this.f276528b.f276537c.f("ideal_issuers", issuers);
                        break;
                    case 3:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        String it10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it10, "it");
                        ufm.i iVar3 = new ufm.i(w.i0(this.f276528b.f276535a.getCardVerificationMethods(it10)), new a(10, new b(10)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        break;
                    case 4:
                        List verificationMethods = (List) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(verificationMethods, "verificationMethods");
                        this.f276528b.f276537c.f("verification_methods", verificationMethods);
                        break;
                    case 5:
                        List externalCards2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards2, "externalCards");
                        this.f276528b.f276537c.f("external_cards", externalCards2);
                        break;
                    case 6:
                        List externalCards3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(externalCards3, "externalCards");
                        ue0.c cVar = this.f276528b.f276536b;
                        List list = externalCards3;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(ExternalCardMappingKt.toEntity((t61.g) it11.next()));
                        }
                        k.g(cVar, arrayList);
                        break;
                    case 7:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        String id10 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        d0<ExternalCardDto> externalCardById = this.f276528b.f276535a.getExternalCardById(id10);
                        a aVar3 = new a(8, new b(6));
                        externalCardById.getClass();
                        ufm.i iVar4 = new ufm.i(externalCardById, aVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        break;
                    case 8:
                        String id11 = (String) obj2;
                        t61.g card = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(card, "card");
                        ne0.j jVar = this.f276528b.f276537c;
                        List list2 = (List) jVar.get("external_cards");
                        List list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                            for (Object obj4 : list4) {
                                if (Intrinsics.f(((t61.g) obj4).getId(), card.getId())) {
                                    obj4 = card;
                                }
                                arrayList2.add(obj4);
                            }
                            jVar.f("external_cards", arrayList2);
                        }
                        jVar.f("external_cards" + id11, card);
                        break;
                    default:
                        String id12 = (String) obj2;
                        t61.g card2 = (t61.g) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(card2, "card");
                        ue0.c cVar2 = this.f276528b.f276536b;
                        ArrayList arrayListA = k.a(cVar2);
                        if (arrayListA != null && !arrayListA.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListA, 10));
                            for (Object obj5 : arrayListA) {
                                if (Intrinsics.f(((t61.g) obj5).f268137a, card2.f268137a)) {
                                    obj5 = card2;
                                }
                                arrayList3.add(obj5);
                            }
                            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                arrayList4.add(ExternalCardMappingKt.toEntity((t61.g) it12.next()));
                            }
                            k.g(cVar2, arrayList4);
                        }
                        cVar2.G(ExternalCardMappingKt.toEntity(card2), j6.a.q("EXTERNAL_CARD_STORAGE_KEY", id12), z.d(o0.b(ExternalCardEntity.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        this.f276539h = new v60.i();
    }

    public static ArrayList a(ue0.c cVar) {
        List list = (List) cVar.T2("EXTERNAL_CARD_STORAGE_KEY", i);
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(ExternalCardMappingKt.toDomain((ExternalCardEntity) it8.next()));
        }
        return arrayList;
    }

    public static void g(ue0.c cVar, ArrayList arrayList) {
        cVar.G(arrayList, "EXTERNAL_CARD_STORAGE_KEY", kii.e.o(ExternalCardEntity.class, KTypeProjection.INSTANCE, List.class));
    }

    public static r h(ufm.i iVar) {
        int i2 = 1;
        r rVarStartWith = new pfm.z(new ufm.i(iVar, new a(2, new b(2)), 1), i2, new m0(15), null).x().startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return w.f0(rVarStartWith);
    }

    public final r b() {
        return this.f.f(Unit.f186387a, false);
    }

    public final efm.b c() {
        return this.f.g(Unit.f186387a, true);
    }

    public final r d(String cardIssuerId, String str, String addCardMode) {
        Intrinsics.checkNotNullParameter(cardIssuerId, "cardIssuerId");
        Intrinsics.checkNotNullParameter(addCardMode, "addCardMode");
        d0<PaymentMethodResponseDto> d0VarRequestAddExternalCard = this.f276535a.requestAddExternalCard(new ExternalCardAddRequestDto(cardIssuerId, addCardMode, str));
        a aVar = new a(1, new b(1));
        d0VarRequestAddExternalCard.getClass();
        ufm.i iVar = new ufm.i(d0VarRequestAddExternalCard, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return h(iVar);
    }

    public final r e(AddCardParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        dj0.d dVarF = params.getF60308c();
        if (dVarF == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jo3.a aVarP = mo3.a.p(dVarF);
        String strJ = params.j();
        String strName = params.getE().name();
        String strA = params.getF60306a();
        String strV0 = f0.V0(4, params.getF60307b().getF90566a());
        ExpiryMonthYearDto expiryMonthYearDto = new ExpiryMonthYearDto(params.getF60307b().getF90567b().getF90569a(), params.getF60307b().getF90567b().getF90570b());
        String strB = params.getD().b();
        if (strB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        d0<PaymentMethodResponseDto> d0VarRequestFirstCardTopup = this.f276535a.requestFirstCardTopup(new FirstCardTopupRequestDto(aVarP, new CardDetailsDto(strA, strV0, expiryMonthYearDto, strB), strJ, strName, TopUpContextMapperKt.toWalletId(params.getF()), TopUpContextMapperKt.toDto(params.getF()), params.getF60309g(), params.getF60310h()), new wj0.b("TOPUP_IDEMPOTENCY_TAG"));
        a aVar = new a(11, new e0f.b(params, 1));
        d0VarRequestFirstCardTopup.getClass();
        ufm.i iVar = new ufm.i(d0VarRequestFirstCardTopup, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return h(iVar);
    }

    public final r f(t61.k params) {
        Intrinsics.checkNotNullParameter(params, "params");
        d0<PaymentMethodResponseDto> d0VarRequestTopUp = this.f276535a.requestTopUp(TopUpRequestMapperKt.toDto(params), new wj0.b("TOPUP_IDEMPOTENCY_TAG"));
        a aVar = new a(0, new p4(params, 16));
        d0VarRequestTopUp.getClass();
        ufm.i iVar = new ufm.i(d0VarRequestTopUp, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        r rVarStartWith = ue0.e.I(iVar, h0.f322473a, new b(0)).x().startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return w.f0(rVarStartWith);
    }
}
