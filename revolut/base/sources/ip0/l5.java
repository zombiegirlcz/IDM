package ip0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.card_design.CardDesign2dView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l5 extends koi.b {
    public final CardDesign2dView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f165129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.internalCardDesignCatalogueDelegate_cardDesignView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (CardDesign2dView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.internalCardDesignCatalogueDelegate_centerIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165129g = (ImageView) viewFindViewById2;
    }
}
