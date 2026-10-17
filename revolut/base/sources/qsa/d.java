package qsa;

import aw0.k3;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.push_to_card.api.data.Card;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.impl.R$string;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.y;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PushToCardTransferReviewScreen f248767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PushToCardTransferReviewScreen pushToCardTransferReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f248767w = pushToCardTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f248767w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f248767w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f248767w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((k5k.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((k3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        PushToCardTransferReviewScreen pushToCardTransferReviewScreen = this.f248767w;
        switch (i) {
            case 0:
                k5k.b item = (k5k.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarD = pushToCardTransferReviewScreen.d();
                Intrinsics.h(item);
                u uVar = (u) kVarD;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                String str = item.f181529a;
                int iHashCode = str.hashCode();
                int i2 = 0;
                Continuation continuation = null;
                if (iHashCode != -880299831) {
                    if (iHashCode != 61316904) {
                        if (iHashCode == 1619753652 && str.equals("ID_TRANSFER_REVIEW_REFERENCE")) {
                            yji.l.g2(uVar, ((qpf.h) uVar.f248791s).b(new ReferenceInputData(140, new TextLocalisedClause(R$string.push2card_transfer_reference_title, null, null, 14), new TextLocalisedClause(R$string.push2card_amount_field_note_placeholder, null, null, 14), ((i) ((j2) uVar.C.f22677a).getValue()).f248770b.f81530g)), null, new o(uVar, i2), 1);
                        }
                    } else if (str.equals("ID_TRANSFER_REVIEW_RECIPIENT_NAME")) {
                        j60.a aVar2 = uVar.f248793w;
                        tsa.a aVar3 = uVar.f248790r;
                        CardOwner recipient = uVar.o.f81620a;
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(recipient, "recipient");
                        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ITEM_ACCOUNT_NAME", new TextLocalisedClause(R$string.review_transfer_form_account_name, null, null, 14), new TextClause(recipient.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.push2card_review_subtitle_card, null, null, 14);
                        Card card = recipient.f81493g;
                        Intrinsics.checkNotNullParameter(card, "<this>");
                        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ITEM_CARD", textLocalisedClause, nqa.a.a(card.f81487c, null, card.f81485a), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.push2card_recipient_details_field_country, null, null, 14);
                        wi0.a aVar4 = wi0.b.Companion;
                        String str2 = card.e;
                        aVar4.getClass();
                        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ITEM_COUNTRY", textLocalisedClause2, new CountryClause(wi0.a.a(str2), null), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.push2card_recipient_details_field_currency, null, null, 14);
                        xi0.a aVar5 = xi0.b.Companion;
                        String str3 = card.f81486b;
                        aVar5.getClass();
                        List listK = v.k(model, model2, model3, new CellDetailsDelegate.Model("ITEM_CURRENCY", textLocalisedClause3, new CurrencyClause(xi0.a.a(str3), null, null, 6), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                        yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 28);
                        aVar2.x(new y(listK, new rp0.t(new TextLocalisedClause(R$string.push2card_new_recipient_header, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
                    }
                } else if (str.equals("TRANSFER_REASONS_DECLARATION_ROW_ID")) {
                    uVar.l2(new r(i2, continuation, uVar), new yi5.b(26));
                }
                break;
            case 1:
                ty0.a item2 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarD2 = pushToCardTransferReviewScreen.d();
                Intrinsics.h(item2);
                u uVar2 = (u) kVarD2;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                vrf.h hVar = uVar2.z;
                xrf.b bVar = (xrf.b) hVar;
                bVar.b(item2.d, item2.f275445a);
                break;
            default:
                k3 k3Var = (k3) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = PushToCardTransferReviewScreen.f81615h0;
                pushToCardTransferReviewScreen.d3().f167815c.setLoadingStrategy(k3Var);
                break;
        }
        return Unit.f186387a;
    }
}
