package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a2 extends koi.b {
    public final OverlappedIconsView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.avatarGroupDelegate_iconsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (OverlappedIconsView) viewFindViewById;
    }
}
