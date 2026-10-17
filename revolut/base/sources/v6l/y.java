package v6l;

import com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.RevolutCardService;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import retrofit2.Response;
import v6l.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f286517b;

    public /* synthetic */ y(b1 b1Var, int i) {
        this.f286516a = i;
        this.f286517b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        efm.d0 iVar;
        switch (this.f286516a) {
            case 0:
                b1 b1Var = this.f286517b;
                RevolutCardService revolutCardService = b1Var.f286424a;
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                h0 params = (h0) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(params, "params");
                if (Intrinsics.f(params, h0.a.f286452a)) {
                    efm.d0<List<p6l.q>> allCards = revolutCardService.getAllCards();
                    a0 a0Var = new a0(7, new v(b1Var, 26));
                    allCards.getClass();
                    iVar = new ufm.f(allCards, a0Var, 3);
                } else {
                    if (!(params instanceof i0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    efm.d0<List<p6l.q>> allCards2 = revolutCardService.getAllCards();
                    a0 a0Var2 = new a0(16, new v(b1Var, 29));
                    allCards2.getClass();
                    iVar = new ufm.i(new ufm.f(allCards2, a0Var2, 3), new a0(26, new uyh.k0(b1Var, params, 29)), 0);
                }
                ufm.i iVar2 = new ufm.i(iVar, new e0(5, new b0(11)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 1:
                w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                String cardId = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                efm.d0<p6l.x> terminatedCardChargeback = this.f286517b.f286424a.getTerminatedCardChargeback(cardId);
                a0 a0Var3 = new a0(5, new b0(1));
                terminatedCardChargeback.getClass();
                ufm.i iVar3 = new ufm.i(terminatedCardChargeback, a0Var3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 2:
                String cardId2 = (String) obj2;
                h93.o0 chargeback = (h93.o0) obj3;
                Intrinsics.checkNotNullParameter(cardId2, "cardId");
                Intrinsics.checkNotNullParameter(chargeback, "chargeback");
                this.f286517b.f286426c.f("TERMINATED_CARD_CHARGEBACK_CACHE_KEY" + cardId2, chargeback);
                return Unit.f186387a;
            case 3:
                String cardId3 = (String) obj2;
                h93.o0 chargeback2 = (h93.o0) obj3;
                Intrinsics.checkNotNullParameter(cardId3, "cardId");
                Intrinsics.checkNotNullParameter(chargeback2, "chargeback");
                Intrinsics.checkNotNullParameter(chargeback2, "<this>");
                this.f286517b.f286425b.G(new p6l.x(chargeback2.f150159a), "TERMINATED_CARD_CHARGEBACK_CACHE_KEY" + cardId3, wim.z.d(kotlin.jvm.internal.o0.b(p6l.x.class)));
                return Unit.f186387a;
            case 4:
                w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                String cardId4 = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(cardId4, "cardId");
                b1 b1Var2 = this.f286517b;
                u6l.g gVarA = b1Var2.e.a(cardId4, false);
                efm.d0<Response<r6l.b>> pin = b1Var2.f286424a.getPin("GCM", cardId4, "VIEW_PIN_2FA", Long.valueOf(gVarA != null ? gVarA.f277653b : new Date(0L).getTime()), "no-cache");
                k kVar = new k(27, new u(gVarA, b1Var2, 0));
                pin.getClass();
                ufm.i iVar4 = new ufm.i(pin, kVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return iVar4;
            case 5:
                String cardId5 = (String) obj2;
                h93.l cardPin = (h93.l) obj3;
                Intrinsics.checkNotNullParameter(cardId5, "cardId");
                Intrinsics.checkNotNullParameter(cardPin, "cardPin");
                if (cardPin.f150151b) {
                    return Unit.f186387a;
                }
                this.f286517b.f286426c.f(j6.a.q("CARD_PIN_MEM_CACHE_KEY", cardId5), cardPin.f150150a);
                return Unit.f186387a;
            case 6:
                String cardId6 = (String) obj2;
                h93.l cardPin2 = (h93.l) obj3;
                Intrinsics.checkNotNullParameter(cardId6, "cardId");
                Intrinsics.checkNotNullParameter(cardPin2, "cardPin");
                if (cardPin2.f150151b) {
                    return Unit.f186387a;
                }
                this.f286517b.e.b(cardId6, cardPin2.f150150a, jli.b.d(), false);
                return Unit.f186387a;
            case 7:
                w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                String cardId7 = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(cardId7, "cardId");
                b1 b1Var3 = this.f286517b;
                u6l.g gVarA2 = b1Var3.e.a(cardId7, true);
                efm.d0<Response<r6l.b>> previousPin = b1Var3.f286424a.getPreviousPin("GCM", cardId7, "VIEW_PIN_2FA", Long.valueOf(gVarA2 != null ? gVarA2.f277653b : new Date(0L).getTime()), "no-cache");
                a0 a0Var4 = new a0(0, new u(gVarA2, b1Var3, 1));
                previousPin.getClass();
                ufm.i iVar5 = new ufm.i(previousPin, a0Var4, 1);
                Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                return iVar5;
            case 8:
                String cardId8 = (String) obj2;
                h93.l cardPin3 = (h93.l) obj3;
                Intrinsics.checkNotNullParameter(cardId8, "cardId");
                Intrinsics.checkNotNullParameter(cardPin3, "cardPin");
                if (cardPin3.f150151b) {
                    return Unit.f186387a;
                }
                this.f286517b.f286426c.f(j6.a.q("CARD_PREVIOUS_PIN_MEM_CACHE_KEY", cardId8), cardPin3.f150150a);
                return Unit.f186387a;
            case 9:
                String cardId9 = (String) obj2;
                h93.l cardPin4 = (h93.l) obj3;
                Intrinsics.checkNotNullParameter(cardId9, "cardId");
                Intrinsics.checkNotNullParameter(cardPin4, "cardPin");
                if (cardPin4.f150151b) {
                    return Unit.f186387a;
                }
                this.f286517b.e.b(cardId9, cardPin4.f150150a, jli.b.d(), true);
                return Unit.f186387a;
            case 10:
                w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                String cardId10 = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(cardId10, "cardId");
                efm.d0<p6l.l> pinStatus = this.f286517b.f286424a.getPinStatus(cardId10);
                a0 a0Var5 = new a0(1, new v6e.d(28));
                pinStatus.getClass();
                ufm.i iVar6 = new ufm.i(pinStatus, a0Var5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                return iVar6;
            case 11:
                String cardId11 = (String) obj2;
                h93.y pinStatus2 = (h93.y) obj3;
                Intrinsics.checkNotNullParameter(cardId11, "cardId");
                Intrinsics.checkNotNullParameter(pinStatus2, "pinStatus");
                this.f286517b.f286426c.f("PIN_STATUS_CACHE_KEY" + cardId11, pinStatus2);
                return Unit.f186387a;
            case 12:
                String cardId12 = (String) obj2;
                h93.y pinStatus3 = (h93.y) obj3;
                Intrinsics.checkNotNullParameter(cardId12, "cardId");
                Intrinsics.checkNotNullParameter(pinStatus3, "pinStatus");
                Intrinsics.checkNotNullParameter(pinStatus3, "<this>");
                this.f286517b.f286425b.G(new p6l.l(pinStatus3.f150170a.name()), "PIN_STATUS_CACHE_KEY" + cardId12, wim.z.d(kotlin.jvm.internal.o0.b(p6l.l.class)));
                return Unit.f186387a;
            case 13:
                h0 param = (h0) obj2;
                List cards = (List) obj3;
                Intrinsics.checkNotNullParameter(param, "param");
                Intrinsics.checkNotNullParameter(cards, "cards");
                b1 b1Var4 = this.f286517b;
                b1Var4.f286426c.f("REVOLUT_CARD_MEM_CACHE_KEY", cards);
                b1Var4.f286432n.c(null, (1 & 2) == 0, new v25.k(param, 15));
                return Unit.f186387a;
            case 14:
                w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                String cardId13 = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(cardId13, "cardId");
                efm.d0<Response<p6l.g>> cardTerminationEligibility = this.f286517b.f286424a.getCardTerminationEligibility(cardId13);
                k kVar2 = new k(24, new v6e.d(24));
                cardTerminationEligibility.getClass();
                ufm.i iVar7 = new ufm.i(cardTerminationEligibility, kVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                return iVar7;
            case 15:
                String cardId14 = (String) obj2;
                Boolean bool = (Boolean) obj3;
                bool.booleanValue();
                Intrinsics.checkNotNullParameter(cardId14, "cardId");
                this.f286517b.f286426c.f("TERMINATION_ELIGIBILITY_CACHE_KEY" + cardId14, bool);
                return Unit.f186387a;
            case 16:
                String cardId15 = (String) obj2;
                Boolean bool2 = (Boolean) obj3;
                bool2.getClass();
                Intrinsics.checkNotNullParameter(cardId15, "cardId");
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f286517b.f286425b, j6.a.q("TERMINATION_ELIGIBILITY_CACHE_KEY", cardId15), bool2);
                return Unit.f186387a;
            case 17:
                w4l.f CardDetailsDataObservableDelegate = (w4l.f) obj2;
                String id10 = (String) obj3;
                Intrinsics.checkNotNullParameter(CardDetailsDataObservableDelegate, "$this$CardDetailsDataObservableDelegate");
                Intrinsics.checkNotNullParameter(id10, "id");
                b1 b1Var5 = this.f286517b;
                efm.d0<Response<p6l.p>> cardDetails = b1Var5.f286424a.getCardDetails("GCM", id10);
                k kVar3 = new k(26, new w(b1Var5, id10, 2));
                cardDetails.getClass();
                ufm.i iVar8 = new ufm.i(cardDetails, kVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                return iVar8;
            case 18:
                String id11 = (String) obj2;
                h93.g0 details = (h93.g0) obj3;
                Intrinsics.checkNotNullParameter(id11, "id");
                Intrinsics.checkNotNullParameter(details, "details");
                if (details.d) {
                    return Unit.f186387a;
                }
                this.f286517b.f286426c.f("REVOLUT_CARDS_DETAILS_KEY_" + id11, details);
                return Unit.f186387a;
            case 19:
                h93.g0 details2 = (h93.g0) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "id");
                Intrinsics.checkNotNullParameter(details2, "details");
                boolean z = details2.d;
                String str = details2.f150128a;
                if (z) {
                    return Unit.f186387a;
                }
                t6l.b bVar = this.f286517b.e;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(details2, "details");
                xm0.a aVar = bVar.f268382a;
                aVar.b(j6.a.q("pan_", str), details2.f150129b);
                aVar.b("cvv_" + str, details2.f150130c);
                return Unit.f186387a;
            case 20:
                w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                String design = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(design, "design");
                efm.d0<p6l.e> disposableCardSettings = this.f286517b.f286424a.getDisposableCardSettings(design);
                k kVar4 = new k(29, new v6e.d(27));
                disposableCardSettings.getClass();
                ufm.i iVar9 = new ufm.i(disposableCardSettings, kVar4, 1);
                Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                return iVar9;
            case 21:
                String design2 = (String) obj2;
                i93.c settings = (i93.c) obj3;
                Intrinsics.checkNotNullParameter(design2, "design");
                Intrinsics.checkNotNullParameter(settings, "settings");
                this.f286517b.f286426c.f("DISPOSABLE_CARD_SETTINGS_MEM_KEY" + design2, settings);
                return Unit.f186387a;
            case 22:
                String design3 = (String) obj2;
                i93.c settings2 = (i93.c) obj3;
                Intrinsics.checkNotNullParameter(design3, "design");
                Intrinsics.checkNotNullParameter(settings2, "settings");
                this.f286517b.f286425b.G(u6l.k.d(settings2), j6.a.q("DISPOSABLE_CARD_SETTINGS_STORAGE_KEY", design3), wim.z.d(kotlin.jvm.internal.o0.b(u6l.d.class)));
                return Unit.f186387a;
            case 23:
                w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                Unit it8 = (Unit) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(it8, "it");
                efm.d0<p6l.w> suggestedCardHolderNames = this.f286517b.f286424a.getSuggestedCardHolderNames();
                k kVar5 = new k(28, new v6e.d(26));
                suggestedCardHolderNames.getClass();
                ufm.i iVar10 = new ufm.i(suggestedCardHolderNames, kVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                return iVar10;
            case 24:
                List names = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(names, "names");
                this.f286517b.f286426c.f("SUGGESTED_CARDHOLDER_NAMES_MEM_CACHE_KEY", names);
                return Unit.f186387a;
            case 25:
                List names2 = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(names2, "names");
                this.f286517b.f286425b.G(names2, "SUGGESTED_CARDHOLDER_NAMES_STORAGE_KEY", kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 26:
                List cards2 = (List) obj3;
                Intrinsics.checkNotNullParameter((h0) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(cards2, "cards");
                List list = cards2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(u6l.k.e((h93.f0) it9.next()));
                }
                this.f286517b.p(arrayList, true);
                return Unit.f186387a;
            case 27:
                w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                String token = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(token, "token");
                efm.d0<p6l.q> cardByToken = this.f286517b.f286424a.getCardByToken(token);
                k kVar6 = new k(25, new v6e.d(25));
                cardByToken.getClass();
                ufm.i iVar11 = new ufm.i(cardByToken, kVar6, 1);
                Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                return iVar11;
            case 28:
                String token2 = (String) obj2;
                h93.f0 card = (h93.f0) obj3;
                Intrinsics.checkNotNullParameter(token2, "token");
                Intrinsics.checkNotNullParameter(card, "card");
                this.f286517b.f286426c.f("REVOLUT_CARD_BY_TOKEN_MEM_CACHE_KEY" + token2, card);
                return Unit.f186387a;
            default:
                w4l.f DataObservableDelegate10 = (w4l.f) obj2;
                String cardId16 = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate10, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(cardId16, "cardId");
                efm.d0<p6l.a> cardBanner = this.f286517b.f286424a.getCardBanner(cardId16);
                a0 a0Var6 = new a0(4, new b0(0));
                cardBanner.getClass();
                ufm.i iVar12 = new ufm.i(cardBanner, a0Var6, 1);
                Intrinsics.checkNotNullExpressionValue(iVar12, "map(...)");
                return iVar12;
        }
    }
}
