package ip0;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w6 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f166937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166938h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsBarRating_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsBarRating_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166937g = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsBarRating_endText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166938h = (TextView) viewFindViewById3;
    }
}
