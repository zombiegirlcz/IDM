package b9d;

import android.net.Uri;
import b8d.l0;
import b8d.m0;
import b8d.n0;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreenContract$InputData;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterSubContent;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterSubContentItem;
import com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination;
import hg0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vge.f1;
import wf0.y0;
import wf0.z0;
import wli.x;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends jki.g implements i {
    public final e A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f13726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CardTroubleshooterScreenContract$InputData f13727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ie.a f13728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f13729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f13730t;
    public final m0 u;
    public final lde.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f13731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mde.e f13732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f13733y;
    public final String z;

    @NotNull
    public static final m Companion = new m();
    public static final String B = f7d.i.CATEGORY_CARDS.a();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x deeplinkHandler, CardTroubleshooterScreenContract$InputData inputData, ie.a sharedCardsTroubleshooterInteractor, p troubleshooterInteractor, l0 uriInlineParamEnricher, m0 urlNeverReceivedCardModeEnricher, lde.n widgetsInteractor, a cardTroubleshooterActionUrlEnricher, mde.e sharedHelpDestinationProvider, o troubleshooterMapper, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedCardsTroubleshooterInteractor, "sharedCardsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(troubleshooterInteractor, "troubleshooterInteractor");
        Intrinsics.checkNotNullParameter(uriInlineParamEnricher, "uriInlineParamEnricher");
        Intrinsics.checkNotNullParameter(urlNeverReceivedCardModeEnricher, "urlNeverReceivedCardModeEnricher");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(cardTroubleshooterActionUrlEnricher, "cardTroubleshooterActionUrlEnricher");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(troubleshooterMapper, "troubleshooterMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f13726p = deeplinkHandler;
        this.f13727q = inputData;
        this.f13728r = sharedCardsTroubleshooterInteractor;
        this.f13729s = troubleshooterInteractor;
        this.f13730t = uriInlineParamEnricher;
        this.u = urlNeverReceivedCardModeEnricher;
        this.v = widgetsInteractor;
        this.f13731w = cardTroubleshooterActionUrlEnricher;
        this.f13732x = sharedHelpDestinationProvider;
        this.f13733y = troubleshooterMapper;
        String str = inputData.f86322a;
        this.z = str;
        this.A = new e(str, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f86323b, inputData.f86324c);
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean z = this.f13727q.d;
        ie.a aVar = this.f13728r;
        String cardId = this.z;
        vkm.d dVarC = ie.a.c(aVar, cardId, z, 4);
        boolean zC = this.v.c();
        p pVar = this.f13729s;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        z0 z0Var = pVar.f152063a;
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        w4l.f fVar = z0Var.f;
        od0.a aVar2 = od0.a.f224253a;
        Continuation continuation = null;
        vkm.d dVarB = rd0.e.b(fVar.f(new y0(cardId, (od0.a.e() && zC) ? Boolean.TRUE : null), true));
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        yji.l.b1(this, new t38.e(dVarC, 24, nim.a.v(u0.m(dVarB, nim.a.A(rd0.e.e(xam.a.h(new w3k.i(aVar, continuation, 15), rd0.e.b(((ha3.x) ((l93.f) aVar.f160499a)).v(cardId))), h0.f322473a, new f1(3, 16, continuation)), new b96.a(5))), new b96.a(6)), new a0e.o(this, continuation, 24)), null, null, 7);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.A;
    }

    public final void y2(Object obj2, String itemId) {
        String str;
        String str2;
        TroubleshooterSubContent troubleshooterSubContent;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (!Intrinsics.f(itemId, "ACTION_ITEM_ID")) {
            if (Intrinsics.f(itemId, "HELP_BUTTON_ITEM_ID")) {
                n2(new aza.g(this, null, 5), new whi.b(6));
                return;
            }
            if (this.f13728r.f(itemId)) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
                String cardId = (String) obj2;
                this.f13732x.getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                C1(new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(cardId, 6, false, false), null, 47));
                return;
            }
            return;
        }
        if (!(obj2 instanceof hj0.e)) {
            if (obj2 instanceof hj0.d) {
                hj0.c cVar = ((hj0.d) obj2).d;
                String str3 = cVar.f152628b;
                x xVar = this.f13726p;
                if (str3 == null || d0.W(str3) || !xVar.y1(str3)) {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = cVar.f152627a;
                }
                boolean zY1 = str3 != null ? xVar.y1(str3) : false;
                String strA = this.f13730t.a(str3, zY1);
                this.f13731w.getClass();
                if (strA != null && !d0.W(strA) && zY1) {
                    strA = Uri.parse(strA).buildUpon().appendQueryParameter("card_troubleshooter_action", "card_selected").appendQueryParameter("can_navigate_to_chat", "false").build().toString();
                    Intrinsics.checkNotNullExpressionValue(strA, "toString(...)");
                }
                this.v.getClass();
                ((n0) this.u).getClass();
                if (strA != null && !d0.W(strA) && zY1) {
                    Uri uri2 = Uri.parse(strA);
                    if (Intrinsics.f(uri2.getEncodedPath(), "/delivery-troubleshooting") && !uri2.getQueryParameterNames().contains("never_received_mode")) {
                        strA = uri2.buildUpon().appendQueryParameter("never_received_mode", "simplified").build().toString();
                        Intrinsics.checkNotNullExpressionValue(strA, "toString(...)");
                    }
                }
                n2(new av7.l(this, strA, null, 24), new whi.b(6));
                return;
            }
            return;
        }
        hj0.e item = (hj0.e) obj2;
        this.f13733y.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        String str4 = item.f152632a;
        String str5 = item.f152633b;
        String str6 = item.f152634c;
        String str7 = item.d;
        String str8 = item.e;
        String str9 = item.f;
        ArrayList arrayList = item.f152635g;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(o.a((hj0.b) it8.next()));
        }
        hj0.h hVar = item.f152636h;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            for (mff.b bVar : mff.b.a()) {
                str = str4;
                if (Intrinsics.f(bVar.name(), hVar.f152637a)) {
                    ArrayList arrayList3 = hVar.f152638b;
                    ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                    Iterator it9 = arrayList3.iterator();
                    while (it9.hasNext()) {
                        hj0.i iVar = (hj0.i) it9.next();
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        Iterator it10 = it9;
                        String str10 = iVar.f152639a;
                        String str11 = str5;
                        String str12 = iVar.f152640b;
                        hj0.b bVar2 = iVar.f152641c;
                        arrayList4.add(new TroubleshooterSubContentItem(str10, str12, bVar2 != null ? o.a(bVar2) : null));
                        it9 = it10;
                        str5 = str11;
                    }
                    str2 = str5;
                    troubleshooterSubContent = new TroubleshooterSubContent(bVar, arrayList4);
                } else {
                    str4 = str;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        str = str4;
        str2 = str5;
        troubleshooterSubContent = null;
        hj0.b bVar3 = item.i;
        C1(new TransactionTroubleshooterDestination(new TransactionTroubleshooterDestination.Details(this.z, new Troubleshooter(str, str2, str6, str7, str8, str9, arrayList2, troubleshooterSubContent, bVar3 != null ? o.a(bVar3) : null, null), mff.a.CARD)));
    }
}
