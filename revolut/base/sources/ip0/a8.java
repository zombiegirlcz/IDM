package ip0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a8 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f163406h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AppCompatImageView f163407j;
    public final LinearLayout k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsPrice_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsPrice_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163405g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsPrice_strikethroughPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163406h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.cellDetailsPrice_noteText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById4;
        this.i = textView;
        View viewFindViewById5 = itemView.findViewById(R$id.cellDetailsPrice_noteImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163407j = (AppCompatImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.cellDetailsPrice_bottomLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (LinearLayout) viewFindViewById6;
        textView.setMovementMethod(ix0.c0.f169220a);
    }
}
