package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.internal.views.badge.WarningBadgeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u7 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LabelView f166611h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f166612j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WarningBadgeView f166613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rr0.g f166614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rr0.g f166615n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsNote_startLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsNote_startLabelEndImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166610g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsNote_endLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166611h = (LabelView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsNote_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        this.i = textView;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsNote_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166612j = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.cellDetailsNote_bottomLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.cellDetailsNoteDelegate_warningBadge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166613l = (WarningBadgeView) viewFindViewById7;
        this.f166614m = vc.s.d(this, new nq0.e(itemView), new fu0.l(this), 8);
        this.f166615n = vc.s.d(this, new w(this, 17), new fu0.l(this), 8);
        textView.setMovementMethod(ix0.c0.f169220a);
    }
}
