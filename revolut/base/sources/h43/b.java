package h43;

import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.data.api.domain.exception.MerchantNotOnboardedException;
import com.revolut.feature.acquiring.card_reader.data.impl.domain.exception.TerminalNeedsUpdateException;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreen;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountController;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list.ReturnCryptoDepositAddressListScreen;
import efm.d0;
import hcl.c1;
import hcl.i1;
import hcl.n1;
import hcl.s1;
import hcl.u1;
import hcl.w0;
import ip0.s7;
import ip0.w40;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import jf7.l1;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import qlm.j1;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149288a;

    public /* synthetic */ b(int i) {
        this.f149288a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f149288a) {
            case 0:
                KProperty[] kPropertyArr = ChooserScreen.Z;
                return new TextDelegate();
            case 1:
                KProperty[] kPropertyArr2 = ChooserScreen.Z;
                return new NotificationCentreItemDelegate();
            case 2:
                KProperty[] kPropertyArr3 = AddExternalAccountController.T;
                return new InputTextDelegate(null);
            case 3:
                KProperty[] kPropertyArr4 = AddExternalAccountController.T;
                return new CellDetailsDelegate();
            case 4:
                Lazy lazy = h55.b.f149505a;
                return ue0.e.b(Json.d, new h3d.a(15));
            case 5:
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_exchanged, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.market_data_exchange_summary_exchange, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.market_data_exchange_summary_exchange, null, null, 14);
            case 8:
                KProperty[] kPropertyArr5 = EnrollmentDetailsScreen.T;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr6 = EnrollmentDetailsScreen.T;
                return new CellDetailsAccountDelegate();
            case 10:
                ufm.c cVarL = d0.l(new MerchantNotOnboardedException());
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            case 11:
                ufm.c cVarL2 = d0.l(new TerminalNeedsUpdateException());
                Intrinsics.checkNotNullExpressionValue(cVarL2, "error(...)");
                return cVarL2;
            case 12:
                return new LargeActionButtonDelegate();
            case 13:
                return new TwinHorizontalButtonDelegate();
            case 14:
                return new RowDelegate(null, null, 7);
            case 15:
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(new w40(a0.d.n("transferRequest_loading_", it8.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 16:
                s7 s7Var = new s7("FEES_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return s7Var;
            case 17:
                List listK = v.k(new s7("FROM_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("TO_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 18:
                s7 s7Var2 = new s7("GET_HELP_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                return s7Var2;
            case 19:
                KProperty[] kPropertyArr7 = ReturnCryptoDepositAddressListScreen.R;
                return new RowDelegate(null, null, 7);
            case 20:
                KProperty[] kPropertyArr8 = ReturnCryptoDepositAddressListScreen.R;
                return new FullScreenStateDelegate();
            case 21:
                return new qlm.e(u1.f151178a);
            case 22:
                return new qlm.e(n1.f151087a);
            case 23:
                return new qlm.e(c1.f150953a);
            case 24:
                return j1.a("com.revolut.shared.feature.wealth.domain.impl.data.database.model.IpoSectionEmbeddedEntity.Type", s1.values(), new String[]{"informative", "chronological"}, new Annotation[][]{null, null});
            case 25:
                return new qlm.e(i1.f151017a);
            case 26:
                return new qlm.e(w0.f151200a);
            case 27:
                return new PromptContentDelegate();
            case 28:
                return new qlm.e(l1.Companion.serializer());
            default:
                return new qlm.e(if7.e.INSTANCE.serializer());
        }
    }
}
