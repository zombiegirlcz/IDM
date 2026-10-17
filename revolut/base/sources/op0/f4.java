package op0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f4 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f227250j;
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f227251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f227252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f227253n;
    public final SmallActionButton o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SmallActionButton f227254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SmallActionButton f227255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverlappedIconsView f227256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ix0.h2 f227257s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.simpleTile_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227250j = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.simpleTile_topLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.simpleTile_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227251l = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.simpleTile_labelValueTop);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227252m = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.simpleTile_labelValueBottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227253n = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.simpleTile_startAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        SmallActionButton smallActionButton = (SmallActionButton) viewFindViewById6;
        this.o = smallActionButton;
        View viewFindViewById7 = itemView.findViewById(R$id.simpleTile_endAction);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        SmallActionButton smallActionButton2 = (SmallActionButton) viewFindViewById7;
        this.f227254p = smallActionButton2;
        View viewFindViewById8 = itemView.findViewById(R$id.simpleTile_smallActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f227255q = (SmallActionButton) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.simpleTile_overlappedImages);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f227256r = (OverlappedIconsView) viewFindViewById9;
        this.f227257s = new ix0.h2(smallActionButton, smallActionButton2);
        ms0.h4 h4Var = ms0.h4.SEMIACCENT;
        smallActionButton.i(h4Var);
        smallActionButton2.i(h4Var);
    }
}
