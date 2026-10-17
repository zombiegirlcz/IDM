package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xf0 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f167157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f167158h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f167159j;
    public final SecondaryBackgroundConstraintLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OverlappedIconsView f167160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SmallActionButton f167161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f167162n;
    public final ImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f167163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f167164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rr0.g f167165r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167157g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f167158h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.valuePrimary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.valueSecondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f167159j = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.constraintLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (SecondaryBackgroundConstraintLayout) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.smallStockCard_images);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f167160l = (OverlappedIconsView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.smallStockCard_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f167161m = (SmallActionButton) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.smallStockCard_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f167162n = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.smallStockCard_descriptionIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (ImageView) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.smallStockCard_decorative_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f167163p = (TextView) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.smallStockCard_titleInfoIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f167164q = (ImageView) viewFindViewById12;
        rr0.g gVarD = vc.s.d(this, new nq0.e(itemView, cs0.b.UNMASKED), null, 12);
        gVarD.i = false;
        this.f167165r = gVarD;
    }
}
