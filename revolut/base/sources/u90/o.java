package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.q3;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        CurrencySelectionOption currencySelectionOption;
        q90.w0 item = (q90.w0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        String searchHint = item.getSearchHint();
        List<q90.v0> currencies = item.getCurrencies();
        ArrayList arrayList = new ArrayList(zhm.w.t(currencies, 10));
        for (q90.v0 v0Var : currencies) {
            xi0.a aVar = xi0.b.Companion;
            String code = v0Var.getCode();
            aVar.getClass();
            arrayList.add(new CurrencySelectionOption(v0Var.getCountryCode(), v0Var.getDescription(), xi0.a.a(code)));
        }
        q3 value = item.getValue();
        if (value != null) {
            xi0.a aVar2 = xi0.b.Companion;
            String value2 = value.getValue();
            aVar2.getClass();
            currencySelectionOption = new CurrencySelectionOption(null, null, xi0.a.a(value2));
        } else {
            currencySelectionOption = null;
        }
        return new CurrencySelectionItem(id10, searchHint, arrayList, currencySelectionOption, item.getRequired());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        CurrencySelectionItem item = (CurrencySelectionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63374a;
        boolean z = item.e;
        String str2 = item.f63375b;
        List<CurrencySelectionOption> list = item.f63376c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (CurrencySelectionOption currencySelectionOption : list) {
            arrayList.add(new q90.v0(currencySelectionOption.f63377a.f306286a, currencySelectionOption.f63378b, currencySelectionOption.f63379c));
        }
        CurrencySelectionOption currencySelectionOption2 = item.d;
        return new q90.w0(str, z, str2, arrayList, currencySelectionOption2 != null ? new q3(currencySelectionOption2.f63377a.f306286a) : null);
    }
}
