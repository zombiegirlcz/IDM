package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.h3;
import q90.l3;
import q90.m3;

/* JADX INFO: loaded from: classes19.dex */
public final class s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f278331a;

    public s(n0 optionsMapper) {
        Intrinsics.checkNotNullParameter(optionsMapper, "optionsMapper");
        this.f278331a = optionsMapper;
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        l3 item = (l3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        List options = item.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(options, 10));
        Iterator it8 = options.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f278331a.a((h3) it8.next()));
        }
        String hint = item.getHint();
        if (hint == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String searchHint = item.getSearchHint();
        m3 value = item.getValue();
        return new DropDownItem(id10, hint, arrayList, searchHint, value != null ? value.getOptionId() : null, required);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        DropDownItem item = (DropDownItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63397a;
        boolean z = item.f63398b;
        List list = item.e;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f278331a.b((SelectionItem.Option) it8.next()));
        }
        String str2 = item.d;
        String str3 = item.f;
        return new l3(str, "DROPDOWN", z, arrayList, str2, null, str3 != null ? new m3(str3, null) : null, null, null, null, null, item.f63399c);
    }
}
