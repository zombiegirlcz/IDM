package v6e;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.cards.models.revolutcard.ReactivationEligibility;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import h93.i0;
import h93.j0;
import h93.k0;
import h93.l0;
import h93.m0;
import h93.n0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import n6l.t;
import p6l.y;
import retrofit2.Response;
import v6l.g0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286349a;

    public /* synthetic */ d(int i) {
        this.f286349a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l0 l0VarA;
        j0 j0VarA;
        p6l.g gVar;
        boolean terminationAllowed = false;
        switch (this.f286349a) {
            case 0:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                ufm.b bVarM = d0.m(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 3:
                v6f.e it8 = (v6f.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8;
            case 4:
                InputTextDelegate.TextData it9 = (InputTextDelegate.TextData) obj2;
                KProperty[] kPropertyArr = OrderSettingsScreen.Q;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f52598b.toString();
            case 5:
                KProperty[] kPropertyArr2 = OrderSettingsScreen.Q;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Unit.f186387a;
            case 6:
                v6i.f it10 = (v6i.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.P(it10.f286393a, false, null, 3);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_LIST_ID", null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new v6i.l(null, u.c(model), false);
            case 8:
                Data orderData = (Data) obj2;
                Intrinsics.checkNotNullParameter(orderData, "orderData");
                return orderData.getContent() == null ? new Data(f0.f322471a, null, false, 6, null) : orderData;
            case 9:
                l0 it11 = (l0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.name();
            case 10:
                l0 it12 = (l0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.name();
            case 11:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13;
            case 12:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14;
            case 13:
                n6l.m it15 = (n6l.m) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Intrinsics.checkNotNullParameter(it15, "<this>");
                String tokenId = it15.getTokenId();
                List options = it15.getOptions();
                ArrayList arrayList = new ArrayList(w.t(options, 10));
                Iterator it16 = options.iterator();
                while (it16.hasNext()) {
                    arrayList.add(hx7.q.d0((t) it16.next()));
                }
                return new e93.c(tokenId, arrayList);
            case 14:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17;
            case 15:
                n6l.u design = (n6l.u) obj2;
                Intrinsics.checkNotNullParameter(design, "it");
                od0.h hVar = od0.i.Companion;
                Intrinsics.checkNotNullParameter(design, "design");
                e93.d dVarB = v6l.e.b(design);
                hVar.getClass();
                return od0.h.a(dVarB);
            case 16:
                p6l.q it18 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return o6l.d.b(it18);
            case 17:
                p6l.q it19 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return o6l.d.b(it19);
            case 18:
                u6l.j it20 = (u6l.j) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return u6l.k.a(it20);
            case 19:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Throwable error = data.getError();
                if (!(error instanceof g0)) {
                    return data;
                }
                h93.l lVar = (h93.l) data.getContent();
                if (lVar == null) {
                    lVar = ((g0) error).f286451a;
                }
                return Data.copy$default(data, lVar, null, false, 4, null);
            case 20:
                p6l.d it21 = (p6l.d) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                Intrinsics.checkNotNullParameter(it21, "<this>");
                boolean refundable = it21.getRefundable();
                jo3.a total = it21.getTotal();
                return new h93.m(total != null ? mo3.a.o(total) : null, refundable);
            case 21:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                List<y> list = cards;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (y yVar : list) {
                    Intrinsics.checkNotNullParameter(yVar, "<this>");
                    String strE = yVar.getId();
                    String strM = yVar.getWalletId();
                    b93.j jVar = new b93.j(new b93.b(yVar.getDesign()), yVar.getBrand());
                    String strG = yVar.getLastFour();
                    LocalDate localDate = LocalDate.parse(yVar.getExpiryDate());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    long jL = yVar.getUpdatedDate();
                    String strF = yVar.getLabel();
                    p6l.n nVarI = yVar.getReactivation();
                    Intrinsics.checkNotNullParameter(nVarI, "<this>");
                    boolean allowed = nVarI.getAllowed();
                    m0 m0Var = n0.Companion;
                    String reason = nVarI.getReason();
                    m0Var.getClass();
                    ReactivationEligibility reactivationEligibility = new ReactivationEligibility(allowed, m0.a(reason));
                    boolean zJ = yVar.getRecentlyTerminated();
                    String strK = yVar.getSubProductType();
                    if (strK != null) {
                        l0.Companion.getClass();
                        l0VarA = k0.a(strK);
                    } else {
                        l0VarA = null;
                    }
                    String strH = yVar.getProductType();
                    if (strH != null) {
                        j0.Companion.getClass();
                        j0VarA = i0.a(strH);
                    } else {
                        j0VarA = null;
                    }
                    arrayList2.add(new TerminatedCard(strE, strM, jVar, strG, localDate, jL, strF, reactivationEligibility, zJ, l0VarA, j0VarA, yVar.getCardName()));
                }
                return arrayList2;
            case 22:
                p6l.q it22 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return o6l.d.b(it22);
            case 23:
                u6l.j it23 = (u6l.j) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return u6l.k.a(it23);
            case 24:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.code() != 204 && (gVar = (p6l.g) response.body()) != null) {
                    terminationAllowed = gVar.getTerminationAllowed();
                }
                return Boolean.valueOf(terminationAllowed);
            case 25:
                p6l.q card = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return o6l.d.b(card);
            case 26:
                p6l.w it24 = (p6l.w) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.getSuggestedNames();
            case 27:
                p6l.e it25 = (p6l.e) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return o6l.d.c(it25);
            case 28:
                p6l.l it26 = (p6l.l) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return g4i.a.D(it26);
            default:
                p6l.q it27 = (p6l.q) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return o6l.d.b(it27);
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f286349a = i;
    }
}
