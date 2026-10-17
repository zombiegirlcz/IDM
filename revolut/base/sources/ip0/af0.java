package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class af0 extends koi.b {
    public final SecondaryBackgroundConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f163436h;
    public final TextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (SecondaryBackgroundConstraintLayout) itemView;
        View viewFindViewById = itemView.findViewById(R$id.singleChoice_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f163435g = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.singleChoice_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163436h = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.singleChoice_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.i = (TextView) viewFindViewById3;
    }
}
