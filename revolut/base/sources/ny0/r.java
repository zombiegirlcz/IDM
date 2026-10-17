package ny0;

import com.revolut.core.ui_kit.foundation.R$id;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r {
    private r() {
    }

    public static u a(FloatingBottomBarView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag2 = view.getTag(R$id.internal_tokenized_visibility_controller);
        u uVar = tag2 instanceof u ? (u) tag2 : null;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(view);
        view.setTag(R$id.internal_tokenized_visibility_controller, uVar2);
        return uVar2;
    }
}
