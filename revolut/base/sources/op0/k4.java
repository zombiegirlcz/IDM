package op0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SwitcherView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k4 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SwitcherView f227332j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.switcherWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.switcherWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.switcherWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = itemView.findViewById(R$id.switcherWidget_switcher);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        SwitcherView switcherView = (SwitcherView) viewFindViewById4;
        this.f227332j = switcherView;
        switcherView.setLoadingHighlightTarget$ui_kit_components_release(new fu0.l(this));
    }
}
