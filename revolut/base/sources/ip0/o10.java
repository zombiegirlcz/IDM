package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o10 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExpandableTextView f165607h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f165608j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f165609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f165610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f165611n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.plainTextDelegate_topImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.plainTextDelegate_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165606g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.plainTextDelegate_expandableText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165607h = (ExpandableTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.plainTextDelegate_topContentSpace);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.plainTextDelegate_startContentSpace);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165608j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.plainTextDelegate_endContentSpace);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.plainTextDelegate_bottomContentSpace);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165609l = viewFindViewById7;
        this.f165610m = R$attr.internal_textAppearanceHeading3;
        this.f165611n = R$attr.internal_textAppearanceBody2;
        this.o = R$attr.uikit_colorForeground;
    }
}
