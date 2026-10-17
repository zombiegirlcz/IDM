package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalSmallButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dn0 extends koi.b {
    public final SmallActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f163934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.twin_smallButtons);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TwinHorizontalSmallButton twinHorizontalSmallButton = (TwinHorizontalSmallButton) viewFindViewById;
        View viewFindViewById2 = twinHorizontalSmallButton.findViewById(R$id.uikit_twinHorizontalSmallButton_primaryActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (SmallActionButton) viewFindViewById2;
        View viewFindViewById3 = twinHorizontalSmallButton.findViewById(R$id.uikit_twinHorizontalSmallButton_secondaryActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163934g = (SmallActionButton) viewFindViewById3;
    }
}
