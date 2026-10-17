package ox5;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230572a;

    public /* synthetic */ d0(int i) {
        this.f230572a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean zF;
        switch (this.f230572a) {
            case 0:
                Data data = (Data) obj3;
                List list = (List) org.bouncycastle.jcajce.provider.digest.a.m((Data) obj2, data, "old", "new");
                List list2 = (List) data.getContent();
                if (list == null || list2 == null) {
                    zF = Intrinsics.f(list, list2);
                } else if (list.size() != list2.size()) {
                    zF = false;
                } else {
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((StakingProduct) it8.next()).d);
                    }
                    List list4 = list2;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it9 = list4.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((StakingProduct) it9.next()).d);
                    }
                    zF = arrayList.equals(arrayList2);
                }
                return Boolean.valueOf(zF);
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 3:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 4:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(10, null, true, false, "SEARCH_ERROR_LIST_ITEM_ID"));
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 6:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, false, true, null));
            case 7:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, false, true, null));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 9:
                Throwable error = (Throwable) obj2;
                t61.g gVar = (t61.g) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (gVar == null) {
                    return error;
                }
                return null;
            case 10:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                if (zBooleanValue) {
                    return null;
                }
                return od0.i.f224256b;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 12:
                Function1 mapDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(mapDefaultErrorItems, "mapDefaultErrorItems");
                return (List) mapDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 13:
                Throwable error2 = (Throwable) obj2;
                pwa.m mVar = (pwa.m) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (mVar == null) {
                    return error2;
                }
                return null;
            case 14:
                Throwable error3 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list5 == null) {
                    return error3;
                }
                return null;
            case 15:
                Boolean isInviteFriendPresent = (Boolean) obj2;
                List allActions = (List) obj3;
                Intrinsics.checkNotNullParameter(isInviteFriendPresent, "isInviteFriendPresent");
                Intrinsics.checkNotNullParameter(allActions, "allActions");
                return new Pair(isInviteFriendPresent, allActions);
            case 16:
                Throwable error4 = (Throwable) obj2;
                kyc.t tVar = (kyc.t) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (tVar == null) {
                    return error4;
                }
                return null;
            case 17:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems6.invoke(new iii.d(12, null, false, true, null)), at.r.b());
            case 18:
                Throwable error5 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list6 == null) {
                    return error5;
                }
                return null;
            case 19:
                ali.b PagerCoordinator = (ali.b) obj2;
                TransactionDetailsPagerFlowContract$DetailsPage item = (TransactionDetailsPagerFlowContract$DetailsPage) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof TransactionDetailsPagerFlowContract$DetailsPage.Details) {
                    return new RevPointsTransactionDetailsScreen(new RevPointsTransactionDetailsScreenContract$InputData.TransactionInput(((TransactionDetailsPagerFlowContract$DetailsPage.Details) item).f83861a));
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                Throwable th10 = (Throwable) obj2;
                if (((j0d.q) obj3) == null) {
                    return th10;
                }
                return null;
            case 21:
                ((Boolean) obj2).booleanValue();
                return k4l.m0.SUCCESS;
            case 22:
                return null;
            case 23:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                List listC = zhm.u.c(p2c.y.b());
                List list7 = (List) getDefaultErrorItems7.invoke(new iii.d(12, null, true, true, null));
                yp0.b.k(list7, 0, 0, 0, 0, 31);
                return zhm.d0.E0(list7, listC);
            case 24:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return new cii.b(null, (List) getDefaultErrorItems8.invoke(new iii.d(14, null, true, false, null)), new lw0.a(new TextLocalisedClause(R$string.wealth_margin_cfd_order_confirmation_exposure, null, null, 14), null, null, null, false, 30));
            case 25:
                Function1 getDefaultErrorItems9 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return (List) getDefaultErrorItems9.invoke(new iii.d(14, null, false, false, null));
            case 26:
                Function1 getDefaultErrorItems10 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems10, "getDefaultErrorItems");
                return (List) getDefaultErrorItems10.invoke(new iii.d(14, null, false, false, null));
            case 27:
                Throwable error6 = (Throwable) obj2;
                AgentInfo agentInfo = (AgentInfo) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (agentInfo == null) {
                    return error6;
                }
                return null;
            case 28:
                Throwable error7 = (Throwable) obj2;
                List list8 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list8 == null) {
                    return error7;
                }
                return null;
            default:
                Throwable error8 = (Throwable) obj2;
                TradingAccounts tradingAccounts = (TradingAccounts) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (tradingAccounts == null) {
                    return error8;
                }
                return null;
        }
    }

    public /* synthetic */ d0(cli.n nVar, int i) {
        this.f230572a = i;
    }
}
