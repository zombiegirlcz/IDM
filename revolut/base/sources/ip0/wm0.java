package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wm0 extends koi.b {
    public final LargeActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton f167051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = ((TwinHorizontalButton) itemView.findViewById(R$id.buttons)).findViewById(R$id.primaryActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (LargeActionButton) viewFindViewById;
        View viewFindViewById2 = ((TwinHorizontalButton) itemView.findViewById(R$id.buttons)).findViewById(R$id.secondaryActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167051g = (LargeActionButton) viewFindViewById2;
    }
}
