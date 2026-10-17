package ip0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g6 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f164350h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsActionableIcon_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsActionableIcon_endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164349g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsActionableIcon_endImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164350h = (AppCompatImageView) viewFindViewById3;
    }
}
