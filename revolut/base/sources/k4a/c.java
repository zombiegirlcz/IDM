package k4a;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static boolean a(int i, ScreenContentRecyclerView recyclerView) throws Throwable {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (!(adapter instanceof koi.h)) {
            hx7.e.n(new IllegalStateException());
            return false;
        }
        if (i != -1) {
            koi.h hVar = (koi.h) adapter;
            if (i < hVar.getItemCount()) {
                koi.j jVarA = hVar.a(i);
                if (jVarA instanceof IconDelegate.Model) {
                    Object obj2 = ((IconDelegate.Model) jVarA).i;
                    if ((obj2 instanceof WhoToTransferActionItem) || Intrinsics.f(obj2, "TRANSFER_METHOD_EXPAND_BUTTON_ID")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
