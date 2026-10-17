package ip0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.badge.WarningBadgeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i6 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f164642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f164643h;
    public final WarningBadgeView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.attachmentsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164642g = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.addAttachment);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164643h = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsAttachmentDelegate_warningBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (WarningBadgeView) viewFindViewById4;
    }
}
