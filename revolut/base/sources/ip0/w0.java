package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 extends koi.b {
    public final InputText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f166909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SmallActionButton f166910h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.amountInputActions_inputText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (InputText) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.amountInputActions_minusAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166909g = (SmallActionButton) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.amountInputActions_plusAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166910h = (SmallActionButton) viewFindViewById3;
    }
}
