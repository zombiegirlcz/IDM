package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cb extends koi.b {
    public final CodeEditor f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.codeInput);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (CodeEditor) viewFindViewById;
    }
}
