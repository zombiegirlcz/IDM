package op0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f227200j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f227201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f227202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f227203n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cardWidget_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227200j = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cardWidget_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cardWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227201l = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cardWidget_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227202m = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.cardWidget_border);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227203n = viewFindViewById5;
    }
}
