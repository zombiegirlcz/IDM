package p43;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_payment_method.api.declaration.PaymentMethodInfoInputData;
import com.revolut.feature.card_payment_method.impl.R$string;
import ip0.ck0;
import java.util.List;
import jki.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements d {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethodInfoInputData f232809a;

    public i(PaymentMethodInfoInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f232809a = inputData;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        List listB;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PaymentMethodInfoInputData paymentMethodInfoInputData = this.f232809a;
        int i = h.f232808a[paymentMethodInfoInputData.f65241a.ordinal()];
        if (i == 1) {
            AccountId accountId = paymentMethodInfoInputData.f65242b;
            if (accountId instanceof AccountId.Personal) {
                List listB2 = b();
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_FEES_ITEM_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.card_payment_method_info_fees_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                ck0 ck0Var = new ck0(0);
                int i2 = R$attr.uikit_dp0;
                m70.a.t(t0.f186434a);
                List listK = v.k(model, new TextDelegate.Model("LIST_ID_FEES_ITEM", new CompositeClause(v.k(new TextLocalisedClause(R$string.card_payment_method_info_cash_fees_description, null, null, 14), new TextLocalisedClause(R$string.card_payment_method_info_cash_description_link, null, new Click(30, (Integer) null, (Object) null, "LIST_ID_LEARN_MORE_TEXT", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, ck0Var, null, null, i2, 0, 0, 0, 1908));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                listB = d0.E0(listK, listB2);
            } else {
                if (!(accountId instanceof AccountId.Joint)) {
                    throw new NoWhenBranchMatchedException();
                }
                listB = b();
            }
            return new f(listB);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List listK2 = v.k(new ListSubheaderDelegate.Model("LIST_ID_INFO_ITEM_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.card_payment_method_all_accounts_crypto, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), new TextDelegate.Model("LIST_ID_INFO_ITEM", new TextLocalisedClause(R$string.card_payment_method_info_crypto_description, null, null, 14), false, new ck0(0), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("LIST_ID_FEES_ITEM_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.card_payment_method_info_fees_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        ck0 ck0Var2 = new ck0(0);
        int i3 = R$attr.uikit_dp0;
        m70.a.t(t0.f186434a);
        List listK3 = v.k(model2, new TextDelegate.Model("LIST_ID_FEES_ITEM", new CompositeClause(v.k(new TextLocalisedClause(R$string.card_payment_method_info_fees_crypto_description, null, null, 14), new TextLocalisedClause(R$string.card_payment_method_info_cash_description_link, null, new Click(30, (Integer) null, (Object) null, "LIST_ID_LEARN_MORE_TEXT", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, ck0Var2, null, null, i3, 0, 0, 0, 1908));
        yp0.b.k(listK3, 0, 0, 0, 0, 31);
        return new f(d0.E0(listK3, listK2));
    }

    public final List b() {
        int i;
        int i2;
        PaymentMethodInfoInputData paymentMethodInfoInputData = this.f232809a;
        AccountId accountId = paymentMethodInfoInputData.f65242b;
        if (accountId instanceof AccountId.Personal) {
            i = R$string.card_payment_method_all_accounts_cash;
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.card_payment_method_all_accounts_joint;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_INFO_ITEM_HEADER", (Image) null, (Clause) new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        ck0 ck0Var = new ck0(0);
        int i3 = R$attr.uikit_dp0;
        AccountId accountId2 = paymentMethodInfoInputData.f65242b;
        if (accountId2 instanceof AccountId.Personal) {
            i2 = R$string.card_payment_method_info_cash_description;
        } else {
            if (!(accountId2 instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.card_payment_method_info_joint_description;
        }
        List listK = v.k(model, new TextDelegate.Model("LIST_ID_INFO_ITEM", new TextLocalisedClause(i2, null, null, 14), false, ck0Var, null, null, i3, 0, 0, 0, 1908));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final TextLocalisedClause c() {
        int i = h.f232808a[this.f232809a.f65241a.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.card_payment_method_info_screen_title_cash, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.card_payment_method_info_screen_title_crypto, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
