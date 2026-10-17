package meg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.iq;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t0;
import zfi.j;
import zfi.n;
import zfi.p;
import zfi.q;
import zfi.r;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f204672a;

    public i(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f204672a = uiKitResources;
    }

    public static a a(boolean z, zfi.g filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new a(filter.f321967a, new zfi.i(filter.f321969c.f321970a, filter.f321968b, !z));
    }

    public static InputChecklistDelegate.Model b(zfi.a appliedFilters, j checkboxFilter, n checkBoxOption) {
        Intrinsics.checkNotNullParameter(checkboxFilter, "checkboxFilter");
        Intrinsics.checkNotNullParameter(checkBoxOption, "checkBoxOption");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        boolean zU = s.u(appliedFilters, checkboxFilter, checkBoxOption);
        return new InputChecklistDelegate.Model(j6.a.q("CHECK_BOX_", checkBoxOption.f321982a), new TextClause(checkBoxOption.f321983b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zU, false, null, iq.CHECK_BUTTON, null, null, c(zU, checkboxFilter, checkBoxOption), null, 0, 0, 0, 523992);
    }

    public static b c(boolean z, j checkboxFilter, n checkBoxOption) {
        Intrinsics.checkNotNullParameter(checkboxFilter, "checkboxFilter");
        Intrinsics.checkNotNullParameter(checkBoxOption, "checkBoxOption");
        return new b(checkboxFilter.f321975a, checkboxFilter.f321977c.f321978a, new efi.a(!z, checkBoxOption));
    }

    public static CompositeClause d(q priceRangeFilterValue) {
        Intrinsics.checkNotNullParameter(priceRangeFilterValue, "priceRangeFilterValue");
        dj0.d dVar = priceRangeFilterValue.f321992b;
        p pVar = priceRangeFilterValue.f321991a;
        dj0.d dVar2 = pVar.d;
        if (dVar == null) {
            dVar = pVar.f321990c;
        }
        dj0.d dVar3 = dVar;
        dj0.d dVar4 = priceRangeFilterValue.f321993c;
        dj0.d dVar5 = dVar4 == null ? dVar2 : dVar4;
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        dj0.d dVar6 = dVar5;
        Object compositeClause = new CompositeClause(v.k(new MoneyClause(dVar5, defaults, null, o9Var, 4), new TextClause("+", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4);
        if (!dVar6.equals(dVar2)) {
            compositeClause = new MoneyClause(dVar6, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4);
        }
        Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
        return new CompositeClause(v.k(moneyClause, new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), compositeClause), null, null, null, 14);
    }

    public static e e(String reference, boolean z, q priceRangeFilterValue) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(priceRangeFilterValue, "priceRangeFilterValue");
        if (z) {
            priceRangeFilterValue = q.a(priceRangeFilterValue, null, null);
        }
        return new e(reference, priceRangeFilterValue);
    }

    public static InputChecklistDelegate.Model f(zfi.a appliedFilters, n radioOption, r radioFilter) {
        Intrinsics.checkNotNullParameter(radioFilter, "radioFilter");
        Intrinsics.checkNotNullParameter(radioOption, "radioOption");
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        return new InputChecklistDelegate.Model(j6.a.q("RADIO_", radioOption.f321982a), new TextClause(radioOption.f321983b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), s.v(appliedFilters, radioOption, radioFilter), false, null, iq.RADIO_BUTTON, null, null, g(radioFilter, radioOption), null, 0, 0, 0, 523992);
    }

    public static f g(r radioFilter, n radioOption) {
        Intrinsics.checkNotNullParameter(radioFilter, "radioFilter");
        Intrinsics.checkNotNullParameter(radioOption, "radioOption");
        String str = radioFilter.f321994a;
        zfi.s sVar = radioFilter.f321996c;
        String str2 = sVar.f321997a;
        if (Intrinsics.f(sVar.f321999c, radioOption.f321982a)) {
            radioOption = null;
        }
        return new f(str, str2, radioOption);
    }
}
