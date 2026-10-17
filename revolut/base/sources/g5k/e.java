package g5k;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.picker.PickerController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p12.s0;
import s7a.w;
import s7a.x;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f140805a;

    public e(s0 widgetContentProviderFactory) {
        Intrinsics.checkNotNullParameter(widgetContentProviderFactory, "widgetContentProviderFactory");
        this.f140805a = widgetContentProviderFactory;
    }

    public PickerController a(CountrySelectionItem item, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(item, "item");
        w wVar = w.SHOWN;
        TextClause textClause = new TextClause(item.f63370c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        wi0.b bVar = item.e;
        x xVar = new x(clause, new ob0.c(item), null, clause2, false, wVar, textClause, null, null, false, null, bVar != null ? bVar.f297794a : null, null, null, true, null, null, null, null, null, 2138963160);
        Object obj2 = this.f140805a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new PickerController(xVar, (x7a.d) obj2);
    }

    public e(phm.a countryPickerInteractor) {
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        this.f140805a = countryPickerInteractor;
    }
}
