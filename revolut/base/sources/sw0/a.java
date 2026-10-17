package sw0;

import android.view.View;
import com.revolut.core.ui_kit.foundation.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static void a(View view, ControllerContainerFrameLayout controllerContainerFrameLayout) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R$id.internal_tag_dialog_host, controllerContainerFrameLayout);
    }
}
