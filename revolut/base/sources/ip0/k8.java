package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k8 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsStandaloneNote_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsStandaloneNote_textStart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f164975g = textView;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsStandaloneNote_textEnd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164976h = (TextView) viewFindViewById3;
        textView.setMovementMethod(ix0.c0.f169220a);
    }
}
