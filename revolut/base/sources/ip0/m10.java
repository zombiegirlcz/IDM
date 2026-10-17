package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m10 extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f165301h;
    public final ImageView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.placeholderRow_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.placeholderRow_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165300g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.placeholderRow_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165301h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.placeholderRow_subtitleIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
    }
}
