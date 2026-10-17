package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.DoubleTagView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s6 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DoubleTagView f166306h;
    public final AppCompatTextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsBadge_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsBadge_titleEndImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166305g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsBadge_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166306h = (DoubleTagView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsBadge_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
    }
}
