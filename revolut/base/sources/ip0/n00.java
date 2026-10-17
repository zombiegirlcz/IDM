package ip0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n00 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f165436h;
    public final ActionsView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.permission_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.permission_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165435g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.permission_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165436h = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.permission_actions);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ActionsView) viewFindViewById4;
    }
}
