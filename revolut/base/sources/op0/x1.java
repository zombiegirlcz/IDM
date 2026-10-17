package op0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.StatusProgressBarView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x1 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ResizableTileHeaderView f227474j;
    public final StatusProgressBarView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UIKitTextView f227475l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.goalProgressTile_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227474j = (ResizableTileHeaderView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.goalProgressTile_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        StatusProgressBarView statusProgressBarView = (StatusProgressBarView) viewFindViewById2;
        this.k = statusProgressBarView;
        View viewFindViewById3 = itemView.findViewById(R$id.goalProgressTile_bar_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227475l = (UIKitTextView) viewFindViewById3;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        statusProgressBarView.setProgressTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorAccent, context)));
    }
}
