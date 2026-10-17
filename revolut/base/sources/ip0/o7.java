package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o7 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaskedTextInputEditText f165630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f165631h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsInput_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetails_inputString);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165630g = (MaskedTextInputEditText) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetails_suffixLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165631h = (TextView) viewFindViewById3;
    }
}
