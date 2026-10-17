package tj9;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$SheetPagerItem;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.sheet.CryptoMultichainInfoSheetController;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.vaults.R$string;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tk9.f;
import tm8.h;
import tob.g;
import tph.k;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271613a;

    public /* synthetic */ d(int i) {
        this.f271613a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object first, Object data) {
        switch (this.f271613a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 2:
                List transactions = (List) first;
                q extraData = (q) data;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                Intrinsics.checkNotNullParameter(extraData, "extraData");
                return new Data(new Pair(transactions, extraData), null, false, 6, null);
            case 3:
                Throwable error = (Throwable) first;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) first, "<unused var>");
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) first, "<unused var>");
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) first, "<unused var>");
                return null;
            case 7:
                ((Boolean) first).booleanValue();
                return f0.f322471a;
            case 8:
                ali.b PagerCoordinator = (ali.b) first;
                CryptoMultichainInfoControllerContract$SheetPagerItem scrollerItem = (CryptoMultichainInfoControllerContract$SheetPagerItem) data;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(scrollerItem, "scrollerItem");
                return new CryptoMultichainInfoSheetController(scrollerItem.f70973a);
            case 9:
                Throwable th10 = (Throwable) first;
                if (((dj0.d) data) == null) {
                    return th10;
                }
                return null;
            case 10:
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new f((List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null)));
            case 11:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 12:
                Throwable error2 = (Throwable) first;
                List list2 = (List) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 13:
                Throwable error3 = (Throwable) first;
                Map map = (Map) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (map == null) {
                    return error3;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new h(null, null, iii.c.b(null, null, 6, true));
            case 15:
                Throwable error4 = (Throwable) first;
                l71.d dVar = (l71.d) data;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (dVar == null) {
                    return error4;
                }
                return null;
            case 16:
                Function1 defaultErrorItemsAccessor = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultErrorItemsAccessor, "defaultErrorItemsAccessor");
                return (List) defaultErrorItemsAccessor.invoke(new iii.d(14, null, false, false, null));
            case 17:
                Throwable error5 = (Throwable) first;
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) data;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (savingsAccountDetails == null) {
                    return error5;
                }
                return null;
            case 18:
                Throwable error6 = (Throwable) first;
                SavingsAccountDetails savingsAccountDetails2 = (SavingsAccountDetails) data;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (savingsAccountDetails2 == null) {
                    return error6;
                }
                return null;
            case 19:
                Throwable error7 = (Throwable) first;
                SavingsAccountDetails savingsAccountDetails3 = (SavingsAccountDetails) data;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (savingsAccountDetails3 == null) {
                    return error7;
                }
                return null;
            case 20:
                Throwable error8 = (Throwable) first;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) data;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (juniorBankingProfile == null) {
                    return error8;
                }
                return null;
            case 21:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new g((List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null)), new lw0.a(new TextLocalisedClause(R$string.mmf_info_sheets_capital_at_risk_title, null, null, 14), null, null, null, false, 30));
            case 22:
                Throwable error9 = (Throwable) first;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) data;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (model == null) {
                    return error9;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, false, true, null));
            case 24:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return new k(null, null, null, true);
            case 26:
                Throwable error10 = (Throwable) first;
                ScreenerCollection screenerCollection = (ScreenerCollection) data;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (screenerCollection == null) {
                    return error10;
                }
                return null;
            case 27:
                Integer second = (Integer) data;
                Intrinsics.checkNotNullParameter(first, "first");
                Intrinsics.checkNotNullParameter(second, "second");
                return new Pair(first, second);
            case 28:
                ((Integer) first).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof tq0.a);
            default:
                ((Integer) first).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof tq0.g);
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f271613a = i;
    }
}
