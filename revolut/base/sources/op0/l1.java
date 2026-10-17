package op0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l1 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f227340j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f227341l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.errorWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227340j = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.errorWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.errorWidget_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227341l = (TextView) viewFindViewById3;
    }
}
