package ip0;

import android.view.View;
import com.revolut.core.ui_kit.views.input.InputText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tr extends koi.b {
    public final InputText f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (InputText) itemView;
    }
}
