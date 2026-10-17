package ip0;

import android.content.Context;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nc extends koi.b {
    public final ft0.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft0.r f165490g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(LinearLayout itemView, c64.a aVar) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "rootView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ft0.r rVar = new ft0.r(context, ft0.p.TOP, aVar);
        this.f = rVar;
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ft0.r rVar2 = new ft0.r(context2, ft0.p.BOTTOM, aVar);
        this.f165490g = rVar2;
        rVar.setId(R$id.conditionalAmount_topRow);
        rVar2.setId(R$id.conditionalAmount_bottomRow);
        itemView.addView(rVar, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams.topMargin = kli.a.k(context3, 2.0f);
        itemView.addView(rVar2, layoutParams);
    }
}
