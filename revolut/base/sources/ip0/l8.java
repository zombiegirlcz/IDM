package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SwitcherView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l8 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SwitcherView f165145g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.switcher);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        SwitcherView switcherView = (SwitcherView) viewFindViewById2;
        this.f165145g = switcherView;
        switcherView.setLoadingHighlightTarget$ui_kit_components_release(new fu0.l(this));
    }
}
