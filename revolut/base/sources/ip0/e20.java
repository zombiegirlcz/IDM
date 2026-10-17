package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e20 extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f164010h;
    public final ActionsView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f164011j;
    public Float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Image f164012l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.listPlainTextWarning_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.listPlainTextWarning_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164009g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.listPlainTextWarning_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f164010h = textView;
        View viewFindViewById4 = itemView.findViewById(R$id.listPlainTextWarning_actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ActionsView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.listPlainTextWarning_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f164011j = (ImageView) viewFindViewById5;
        textView.setMovementMethod(ix0.c0.f169220a);
        textView.setClickable(false);
    }
}
