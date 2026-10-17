package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k2 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f164943h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.backgroundSelectionButton_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.backgroundSelectionButton_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164942g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.backgroundSelectionButton_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164943h = viewFindViewById3;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, kli.a.s(R$attr.uikit_colorActionBackground, context2), 4);
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        roundedBackgroundDrawable.f(kli.a.k(context3, 20.0f));
        viewFindViewById3.setBackground(roundedBackgroundDrawable);
    }
}
