package yu5;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements jki.p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu5.a f316896a;

    public p(xu5.a cryptoTransactionFilterItemMapperDelegate) {
        Intrinsics.checkNotNullParameter(cryptoTransactionFilterItemMapperDelegate, "cryptoTransactionFilterItemMapperDelegate");
        this.f316896a = cryptoTransactionFilterItemMapperDelegate;
    }

    public static ListSubheaderDelegate.Model c(String str, int i, int i2, int i3, boolean z) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new CompositeClause(v.k(new TextLocalisedClause(i, null, null, 14), i2 > 0 ? new TextLocalisedClause(R$string.crypto_transaction_filters_filters_screen_subheader_selected, v.k(Integer.valueOf(i2), Integer.valueOf(i3)), null, 12) : new TextClause(String.valueOf(i3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12), (Image) null, (Clause) ((i3 <= 3 || z) ? null : new TextLocalisedClause(R$string.crypto_transaction_filters_filters_screen_see_all_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10)), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Iterable iterableA;
        int i;
        int i2;
        int i3;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f316886a;
        boolean z = domainState.f316887b;
        aim.e eVarB = u.b();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof CryptoTransactionFilter.AccountTypeFilter) {
                arrayList.add(obj2);
            }
        }
        boolean z3 = false;
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it8 = arrayList.iterator();
                i3 = 0;
                while (it8.hasNext()) {
                    if (((CryptoTransactionFilter.AccountTypeFilter) it8.next()).f71389b && (i3 = i3 + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            eVarB.add(c("LIST_ID_ACCOUNT_TYPE_SUBHEADER", R$string.crypto_transaction_filters_filters_screen_account_types_subheader, i3, arrayList.size(), z));
            List listV0 = arrayList;
            if (!z) {
                listV0 = d0.V0(arrayList, 3);
            }
            eVarB.addAll(b(listV0));
        }
        aim.e eVarA = u.a(eVarB);
        aim.e eVarB2 = u.b();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof CryptoTransactionFilter.TransactionTypeFilter) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it9 = arrayList2.iterator();
                i2 = 0;
                while (it9.hasNext()) {
                    if (((CryptoTransactionFilter.TransactionTypeFilter) it9.next()).f71395b && (i2 = i2 + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            eVarB2.add(c("LIST_ID_TRANSACTION_TYPE_SUBHEADER", R$string.crypto_transaction_filters_filters_screen_transaction_types_subheader, i2, arrayList2.size(), z));
            List listV02 = arrayList2;
            if (!z) {
                listV02 = d0.V0(arrayList2, 3);
            }
            eVarB2.addAll(b(listV02));
        }
        ArrayList arrayListE0 = d0.E0(u.a(eVarB2), eVarA);
        if (z) {
            iterableA = f0.f322471a;
        } else {
            aim.e eVarB3 = u.b();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list2) {
                if (obj4 instanceof CryptoTransactionFilter.CurrencyFilter) {
                    arrayList3.add(obj4);
                }
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it10 = arrayList3.iterator();
                    i = 0;
                    while (it10.hasNext()) {
                        if (((CryptoTransactionFilter.CurrencyFilter) it10.next()).f71392b && (i = i + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                eVarB3.add(c("LIST_ID_CURRENCY_SUBHEADER", R$string.crypto_transaction_filters_filters_screen_currencies_subheader, i, arrayList3.size(), false));
                eVarB3.addAll(b(d0.V0(arrayList3, 3)));
            }
            iterableA = u.a(eVarB3);
        }
        ArrayList arrayListE02 = d0.E0(iterableA, arrayListE0);
        List list3 = domainState.f316886a;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it11 = list3.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    break;
                }
                if (((CryptoTransactionFilter) it11.next()).getF71395b()) {
                    z3 = true;
                    break;
                }
            }
        }
        List listC = z3 ? u.c(new TextNavBarMenuItem("LIST_ID_NAV_BAR_ITEM_RESET", new TextLocalisedClause(R$string.crypto_transaction_filters_filters_screen_reset_action, null, null, 14), null, null, 12)) : null;
        if (listC == null) {
            listC = f0.f322471a;
        }
        return new l(arrayListE02, listC);
    }

    public final List b(List filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        return this.f316896a.a(filters);
    }
}
