package ip0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ec extends koi.b {
    public final View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(View itemView, Function1 createView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(createView, "createView");
        View viewFindViewById = itemView.findViewById(R$id.view_wrapper_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view = (View) createView.invoke(context);
        this.f = view;
        frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2));
    }
}
