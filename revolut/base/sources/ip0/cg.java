package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cg extends koi.b {
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f163731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.errorChart_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.errorChart_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163731g = (TextView) viewFindViewById2;
    }
}
