package jr0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private f() {
    }

    public static g a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag2 = view.getTag(R$id.glow_highlight_manager);
        g gVar = tag2 instanceof g ? (g) tag2 : null;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(R$id.glow_highlight_manager, gVar2);
        return gVar2;
    }
}
