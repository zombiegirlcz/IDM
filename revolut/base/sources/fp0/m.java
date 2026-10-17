package fp0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {
    private m() {
    }

    public static p a(View view, gp0.i animator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object tag2 = view.getTag(R$id.internal_click_handler);
        p pVar = tag2 instanceof p ? (p) tag2 : null;
        if (pVar != null) {
            pVar.c(animator);
            return pVar;
        }
        p pVar2 = new p(view, animator);
        view.setTag(R$id.internal_click_handler, pVar2);
        return pVar2;
    }
}
