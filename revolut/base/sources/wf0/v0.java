package wf0;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f296932b;

    public /* synthetic */ v0(z0 z0Var, int i) {
        this.f296931a = i;
        this.f296932b = z0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f296931a) {
            case 0:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                List<cg0.l0> list = items;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (cg0.l0 l0Var : list) {
                    this.f296932b.f296949c.getClass();
                    arrayList.add(bg0.e.a(l0Var));
                }
                return arrayList;
            case 1:
                List items2 = (List) obj2;
                Intrinsics.checkNotNullParameter(items2, "items");
                List<cg0.l0> list2 = items2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (cg0.l0 l0Var2 : list2) {
                    this.f296932b.f296949c.getClass();
                    arrayList2.add(bg0.e.a(l0Var2));
                }
                return arrayList2;
            case 2:
                zf0.c it8 = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                z0 z0Var = this.f296932b;
                efm.d0<cg0.j0> transfersActions = z0Var.f296947a.getTransfersActions(z0.b(it8));
                r rVar = new r(15, new vsl.f(1, z0Var, z0.class, "mapResponse", "mapResponse(Lcom/revolut/core/faq/data/network/model/TroubleshooterActionsDto;)Ljava/util/List;", 0, 23));
                transfersActions.getClass();
                ufm.i iVar = new ufm.i(transfersActions, rVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 3:
                zf0.c it9 = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                z0 z0Var2 = this.f296932b;
                efm.d0<cg0.j0> cardsActions = z0Var2.f296947a.getCardsActions(z0.b(it9));
                r rVar2 = new r(20, new vsl.f(1, z0Var2, z0.class, "mapResponse", "mapResponse(Lcom/revolut/core/faq/data/network/model/TroubleshooterActionsDto;)Ljava/util/List;", 0, 18));
                cardsActions.getClass();
                ufm.i iVar2 = new ufm.i(cardsActions, rVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 4:
                List items3 = (List) obj2;
                Intrinsics.checkNotNullParameter(items3, "items");
                List<cg0.l0> list3 = items3;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (cg0.l0 l0Var3 : list3) {
                    this.f296932b.f296949c.getClass();
                    arrayList3.add(bg0.e.a(l0Var3));
                }
                return arrayList3;
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f296932b.d.get("REFERRALS_TROUBLESHOOTER_KEY");
            case 6:
                zf0.c it10 = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                z0 z0Var3 = this.f296932b;
                efm.d0<cg0.j0> referralsActions = z0Var3.f296947a.getReferralsActions(z0.b(it10));
                r rVar3 = new r(21, new vsl.f(1, z0Var3, z0.class, "mapResponse", "mapResponse(Lcom/revolut/core/faq/data/network/model/TroubleshooterActionsDto;)Ljava/util/List;", 0, 20));
                referralsActions.getClass();
                ufm.i iVar3 = new ufm.i(referralsActions, rVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 7:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f296932b.d.get("REFERRALS_MAIN_TROUBLESHOOTER_KEY");
            case 8:
                String faqKey = (String) obj2;
                Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                return (List) v7.r("REFERRALS_INVITE_TROUBLESHOOTER_KEY_", faqKey, this.f296932b.d);
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f296932b.d.get("TRANSFERS_TROUBLESHOOTER_KEY");
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f296932b.d.get("CARDS_TROUBLESHOOTER_KEY");
            case 11:
                y0 params = (y0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (List) v7.r("CARD_TROUBLESHOOT_KEY-", params.f296942a, this.f296932b.d);
            case 12:
                y0 params2 = (y0) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (List) v7.r("TRANSACTION_TROUBLESHOOT_KEY-", params2.f296942a, this.f296932b.d);
            case 13:
                ig0.a params3 = (ig0.a) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (List) v7.r("RECURRENT_PAYMENT_TROUBLESHOOT_KEY-", com.google.android.gms.internal.mlkit_vision_face.a.o(params3.f161067b, "-", params3.f161066a), this.f296932b.d);
            case 14:
                zf0.c it11 = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                z0 z0Var4 = this.f296932b;
                efm.d0<cg0.j0> referralsMainActions = z0Var4.f296947a.getReferralsMainActions(z0.b(it11));
                r rVar4 = new r(17, new vsl.f(1, z0Var4, z0.class, "mapResponse", "mapResponse(Lcom/revolut/core/faq/data/network/model/TroubleshooterActionsDto;)Ljava/util/List;", 0, 22));
                referralsMainActions.getClass();
                ufm.i iVar4 = new ufm.i(referralsMainActions, rVar4, 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return iVar4;
            case 15:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f296932b.d.get("PAST_TRANSACTIONS_TROUBLESHOOTER_KEY");
            case 16:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f296932b.d.get("UPCOMING_TRANSACTIONS_TROUBLESHOOTER_KEY");
            case 17:
                zf0.c it12 = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                z0 z0Var5 = this.f296932b;
                efm.d0<cg0.j0> upcomingTransactionActions = z0Var5.f296947a.getUpcomingTransactionActions(z0.b(it12));
                r rVar5 = new r(19, new vsl.f(1, z0Var5, z0.class, "mapResponse", "mapResponse(Lcom/revolut/core/faq/data/network/model/TroubleshooterActionsDto;)Ljava/util/List;", 0, 24));
                upcomingTransactionActions.getClass();
                ufm.i iVar5 = new ufm.i(upcomingTransactionActions, rVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                return iVar5;
            default:
                zf0.c it13 = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                z0 z0Var6 = this.f296932b;
                efm.d0<cg0.j0> pastTransactionActions = z0Var6.f296947a.getPastTransactionActions(z0.b(it13));
                r rVar6 = new r(16, new vsl.f(1, z0Var6, z0.class, "mapResponse", "mapResponse(Lcom/revolut/core/faq/data/network/model/TroubleshooterActionsDto;)Ljava/util/List;", 0, 19));
                pastTransactionActions.getClass();
                ufm.i iVar6 = new ufm.i(pastTransactionActions, rVar6, 1);
                Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                return iVar6;
        }
    }
}
