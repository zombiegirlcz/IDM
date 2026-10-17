package uyl;

import android.view.View;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.card.ExternalCardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends koi.b {
    public final ExternalCardView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.card);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ExternalCardView) viewFindViewById;
    }
}
