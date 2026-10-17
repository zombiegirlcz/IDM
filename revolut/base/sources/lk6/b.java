package lk6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne6.b f196229a;

    public b(ne6.b detailsFactory) {
        Intrinsics.checkNotNullParameter(detailsFactory, "detailsFactory");
        this.f196229a = detailsFactory;
    }

    public static aim.e b(boolean z) {
        aim.e eVarB = zhm.u.b();
        if (z) {
            pb0 pb0Var = new pb0("ID_MERCHANT_LOADING_ITEM");
            yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(pb0Var);
        }
        IntRange intRange = new IntRange(0, 2, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new s7(a0.d.n("ID_CELL_DETAILS_LOADING_ITEM_", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        IntRange intRange2 = new IntRange(3, 4, 1);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange2, 10));
        vim.f it9 = intRange2.iterator();
        while (it9.f289625c) {
            arrayList2.add(new s7(a0.d.n("ID_CELL_DETAILS_LOADING_ITEM_", it9.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        return zhm.u.a(eVarB);
    }

    public final CellDetailsDelegate.Model a(String listId, String editableItemId, String title, dj0.d dVar, OpenBankingBrazilPayment.EditableMoneyField editableMoneyField) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(editableItemId, "editableItemId");
        Intrinsics.checkNotNullParameter(title, "title");
        return ((hj6.a) this.f196229a).c(listId, editableItemId, title, dVar, editableMoneyField);
    }
}
