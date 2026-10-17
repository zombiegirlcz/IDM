package ip0;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jf0 extends koi.b {
    public final ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f164833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.smallActionButton_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164833g = (SmallActionButton) viewFindViewById2;
    }

    public final void F(ms0.l4 widthMode) {
        int i;
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        ViewGroup viewGroup = this.f;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (widthMode instanceof ms0.k4) {
            i = -2;
        } else {
            if (!(widthMode instanceof ms0.i4) && !(widthMode instanceof ms0.j4)) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        layoutParams.width = i;
        viewGroup.setLayoutParams(layoutParams);
        this.f164833g.k(widthMode);
    }
}
