package ip0;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fw extends koi.b {
    public final ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.logos_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ViewGroup) viewFindViewById;
    }
}
