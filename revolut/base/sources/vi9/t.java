package vi9;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.pay_later.api.R$string;
import ip0.w40;
import java.util.ArrayList;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements yh9.d {
    public final ArrayList a() {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("PAY_LATER_PLAN_DETAILS_INSTALMENT_INFO_MAPPER_LOADING_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pay_later_plan_header_payment_plan, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new w40(a0.d.n("PAY_LATER_PLAN_DETAILS_INSTALMENT_INFO_MAPPER_LOADING_ID", it8.nextInt())));
        }
        return yp0.b.g(arrayList, model, yp0.e0.INSIDE_BOX, 0, 0, 124);
    }
}
