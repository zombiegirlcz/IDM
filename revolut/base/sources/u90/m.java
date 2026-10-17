package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.ChooserItem;
import com.revolut.feature.backend_flow.domain.models.ChooserOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.q3;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        q90.o0 item = (q90.o0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        String hint = item.getHint();
        String searchHint = item.getSearchHint();
        String searchTitle = item.getSearchTitle();
        List<q90.p0> options = item.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(options, 10));
        for (q90.p0 p0Var : options) {
            arrayList.add(new ChooserOption(p0Var.getId(), p0Var.getText()));
        }
        q3 value = item.getValue();
        return new ChooserItem(id10, hint, arrayList, searchHint, searchTitle, value != null ? value.getValue() : null, pd.b.k(item.getRequired()));
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        ChooserItem item = (ChooserItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63362a;
        String str2 = item.f63363b;
        String str3 = item.f63364c;
        String str4 = item.d;
        List<ChooserOption> list = item.e;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ChooserOption chooserOption : list) {
            arrayList.add(new q90.p0(chooserOption.f63366a, chooserOption.f63367b));
        }
        String str5 = item.f;
        return new q90.o0(str, str2, str3, str4, arrayList, str5 != null ? new q3(str5) : null, Boolean.valueOf(item.f63365g));
    }
}
