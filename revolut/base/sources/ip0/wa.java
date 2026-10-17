package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wa extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.chatTooltipDelegate_chatTooltip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.chatTooltipDelegate_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166966g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.chatTooltipDelegate_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166967h = (TextView) viewFindViewById3;
    }
}
