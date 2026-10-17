package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.PassCardDetailsContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d00 extends koi.b {
    public final ConstraintLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f163815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163816h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f163817j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f163818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f163819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PassCardDetailsContainer f163820n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.passCard_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.passCard_logo);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163815g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.passCard_headerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163816h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.passCard_headerValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.passCard_headerIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163817j = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.passCard_contentContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.passCard_contentImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f163818l = (ImageView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.passCard_contentNumericCode);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f163819m = (TextView) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.passCard_detailsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f163820n = (PassCardDetailsContainer) viewFindViewById9;
    }
}
