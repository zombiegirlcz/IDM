package hi6;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.subaccount.api.models.Subaccount;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m35.r;
import org.jetbrains.annotations.NotNull;
import pcd.g0;
import pcd.s;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.b f152508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f152509b;

    public b(t70.b currencyLocalization, r loanUiContentMapper) {
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        this.f152508a = currencyLocalization;
        this.f152509b = loanUiContentMapper;
    }

    public static dj0.d a(dj0.d dVar, n9l.a aVar) {
        if (aVar != null) {
            return pyd.c.K(dVar, aVar.f213663c, aVar.f213662b);
        }
        return null;
    }

    public static SelectableDelegate.Model c(SavingsAccountDetails savingsAccount, LinkedHashSet enabledSavings, n9l.a aVar) {
        Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
        Intrinsics.checkNotNullParameter(enabledSavings, "enabledSavings");
        dj0.d dVarC = savingsAccount.f86460a.c();
        MoneyClause moneyClause = new MoneyClause(dVarC, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        dj0.d dVarA = a(dVarC, aVar);
        s sVar = savingsAccount.f86460a;
        String strQ = j6.a.q("savings_list_item_", sVar.f234885h.getPocketId());
        g0 g0Var = sVar.f234885h;
        return new SelectableDelegate.Model(strQ, new RowDelegate.Model(j6.a.q("savings_list_item_", g0Var.getPocketId()), savingsAccount.f86461b, null, null, new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, new RowDelegate.Model.c.b(moneyClause, h(dVarA), null, false, 124), false, false, null, null, null, null, null, g0Var.getPocketId(), null, 0, 0, 0, 0, 1056958444), i(g0Var.getPocketId(), enabledSavings), null, vd0.CHECKBOX, false, null, g0Var.getPocketId(), null, false, 32488);
    }

    public static SelectableDelegate.Model d(Subaccount subaccount, LinkedHashSet enabledSubaccounts, n9l.a aVar) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        Intrinsics.checkNotNullParameter(enabledSubaccounts, "enabledSubaccounts");
        dj0.d balance = subaccount.getBalance();
        return new SelectableDelegate.Model(j6.a.q("vault_list_item_", subaccount.getF88959a().f234881a), new RowDelegate.Model(j6.a.q("vault_list_item_", subaccount.getF88959a().f234881a), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), null, null, new TextClause(subaccount.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(balance, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), h(a(balance, aVar)), null, false, 124), false, false, null, null, null, null, null, subaccount.getPocketId(), null, 0, 0, 0, 0, 1056958444), i(subaccount.getPocketId(), enabledSubaccounts), null, vd0.CHECKBOX, false, null, subaccount.getPocketId(), null, false, 32488);
    }

    public static ListSubheaderDelegate.Model e(TextLocalisedClause clause, String listId, e0 position) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(position, "position");
        boolean z = position == e0.INSIDE_BOX;
        return new ListSubheaderDelegate.Model(listId, (Image) null, (Clause) clause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, z ? R$attr.uikit_dp12 : R$attr.uikit_dp16, z ? R$attr.uikit_dp4 : R$attr.uikit_dp12, 0, 0, 53242);
    }

    public static /* synthetic */ ListSubheaderDelegate.Model f(b bVar, TextLocalisedClause textLocalisedClause, String str) {
        e0 e0Var = e0.OUTSIDE_BOX;
        bVar.getClass();
        return e(textLocalisedClause, str, e0Var);
    }

    public static MoneyClause g(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        xi0.b.Companion.getClass();
        return new MoneyClause(new dj0.d(j2, xi0.a.a(currency)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public static MoneyClause h(dj0.d dVar) {
        if (dVar != null) {
            return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        return null;
    }

    public static qd0 i(String str, Set set) {
        return d0.T(set, str) ? qd0.SELECTED : qd0.UNSELECTED;
    }

    public static List j(ArrayList items, int i, String subheaderListId, Function1 mapItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subheaderListId, "subheaderListId");
        Intrinsics.checkNotNullParameter(mapItem, "mapItem");
        if (items.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList(w.t(items, 10));
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            arrayList.add(mapItem.invoke(it8.next()));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        e0 e0Var = e0.INSIDE_BOX;
        return yp0.b.g(arrayList, e(textLocalisedClause, subheaderListId, e0Var), e0Var, 0, 0, 124);
    }

    public final SelectableDelegate.Model b(io3.d pocket, LinkedHashSet enabledAccounts, n9l.a aVar) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(enabledAccounts, "enabledAccounts");
        long j2 = pocket.i;
        String str = pocket.f163147c;
        MoneyClause moneyClauseG = g(j2, str);
        dj0.d dVarA = a(moneyClauseG.f57821a, aVar);
        String strConcat = "account_list_item_".concat(str);
        String strConcat2 = "account_list_item_".concat(str);
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        String strB = this.f152508a.b(str);
        if (strB == null) {
            m70.a.c(t0.f186434a);
            strB = "";
        }
        return new SelectableDelegate.Model(strConcat, new RowDelegate.Model(strConcat2, currencyImage, null, null, new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, new RowDelegate.Model.c.b(moneyClauseG, h(dVarA), null, false, 124), false, false, null, null, null, null, null, pocket.f163145a, null, 0, 0, 0, 0, 1056958316), i(pocket.f163145a, enabledAccounts), null, vd0.CHECKBOX, false, null, pocket.f163145a, null, false, 32488);
    }
}
