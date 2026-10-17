package w2k;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.bank_transfer.models.PaymentVendorCorridor;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    private static final C1626a Companion = new C1626a();

    /* JADX INFO: renamed from: w2k.a$a, reason: collision with other inner class name */
    public static final class C1626a {
        private C1626a() {
        }
    }

    public static Clause a(PaymentVendor vendor) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        ArrayList arrayList = vendor.f;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((PaymentVendorCorridor) it8.next()).f64082a);
        }
        List listU = d0.U(arrayList2);
        if (listU.size() > 2) {
            return new TextLocalisedClause(R$string.transfer_vendor_list_countries, v.k(new CountryClause((b) listU.get(0), null), new CountryClause((b) listU.get(1), null), Integer.valueOf(listU.size() - 2)), null, 12);
        }
        List list = listU;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList3.add(new CountryClause((b) it9.next(), null));
        }
        return yoj.b.m(new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList3);
    }
}
