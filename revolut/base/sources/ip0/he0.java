package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class he0 extends koi.b {
    public final AppCompatTextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.showPin_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatTextView) viewFindViewById;
    }
}
