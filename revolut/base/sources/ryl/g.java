package ryl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.uicomponent.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f258433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f258434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.dialog_item_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.dialog_item_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f258433g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.dialog_item_checked_tick);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f258434h = (ImageView) viewFindViewById3;
    }
}
