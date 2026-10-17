package uyl;

import android.view.View;
import com.revolut.uicomponent.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends koi.b {
    public final View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.spaceView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
    }
}
