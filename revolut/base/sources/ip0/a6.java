package ip0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.badge.WarningBadgeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a6 extends koi.b implements rr0.d {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LabelView f163396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatImageView f163397h;
    public final WarningBadgeView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rr0.g f163398j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsAction_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsAction_endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163396g = (LabelView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsAction_titleEndImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163397h = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsActionDelegate_warningBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (WarningBadgeView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsAction_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163398j = vc.s.c(this);
    }

    @Override // rr0.d
    public final void L(boolean z) {
        this.f163396g.setProgressVisible(z);
    }
}
