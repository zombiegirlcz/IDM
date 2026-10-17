package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends koi.b {
    public final ActionsView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f163510g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ActionsView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.actionsView_additionalClickableArea);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163510g = viewFindViewById2;
    }
}
