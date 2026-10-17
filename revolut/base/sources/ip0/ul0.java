package ip0;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ul0 extends koi.b {
    public final List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        List listK = zhm.v.k(itemView.findViewById(R$id.transactionSkeletonDelegate_image), itemView.findViewById(R$id.transactionSkeletonDelegate_title), itemView.findViewById(R$id.transactionSkeletonDelegate_value));
        this.f = listK;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorShimmer, context);
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            View view = (View) listK.get(i);
            Context context2 = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view.setBackground(new RoundedBackgroundDrawable(context2, iS, 4));
        }
    }
}
