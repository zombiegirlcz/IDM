package ks0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private j() {
    }

    public static l a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag2 = view.getTag(R$id.internal_tokenized_transformation_controller);
        l lVar = tag2 instanceof l ? (l) tag2 : null;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(view);
        view.setTag(R$id.internal_tokenized_transformation_controller, lVar2);
        return lVar2;
    }
}
