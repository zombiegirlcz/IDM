package ix0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m1 {
    private m1() {
    }

    public static void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        vu0.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Object tag2 = recyclerView.getTag(R$id.internal_swipe_item_manager_tag);
        vu0.e eVar = tag2 instanceof vu0.e ? (vu0.e) tag2 : null;
        if (eVar != null) {
            eVar.f292146a = -1;
            Iterator it8 = eVar.f292147b.iterator();
            while (it8.hasNext()) {
                ((SwipeToActionLayout) it8.next()).a(true);
            }
        }
    }
}
