package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CheckboxItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.p2;
import q90.t1;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        p2 item = (p2) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        String title = item.getTitle();
        String description = item.getDescription();
        q90.b0 value = item.getValue();
        boolean zJ = pd.b.j(value != null ? Boolean.valueOf(value.getValue()) : null);
        t1 descriptionHtml = item.getDescriptionHtml();
        return new CheckboxItem(id10, title, description, descriptionHtml != null ? descriptionHtml.getValue() : null, zJ, pd.b.k(item.getRequired()), item.getRequiredAll());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        CheckboxItem item = (CheckboxItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63348a;
        String str2 = item.f63349b;
        String str3 = item.f63350c;
        q90.b0 b0Var = new q90.b0(item.e);
        String str4 = item.d;
        return new p2(str, str2, str3, str4 != null ? new t1(str4, null) : null, b0Var, Boolean.valueOf(item.f), item.f63351g);
    }
}
