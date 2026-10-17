package op0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q3 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f227392j;
    public final SmallActionButton k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.qrCodeWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227392j = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.qrCodeWidget_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        SmallActionButton smallActionButton = (SmallActionButton) viewFindViewById2;
        this.k = smallActionButton;
        smallActionButton.i(ms0.h4.SEMIACCENT);
        smallActionButton.setState(ms0.e4.EnabledClickable);
    }
}
