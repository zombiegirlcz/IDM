package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.TileHeaderView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class iw extends koi.b {
    public final TileHeaderView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OverlappedIconsView f164752g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.logosTile_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TileHeaderView tileHeaderView = (TileHeaderView) viewFindViewById;
        this.f = tileHeaderView;
        View viewFindViewById2 = view.findViewById(R$id.logosTile_logos);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164752g = (OverlappedIconsView) viewFindViewById2;
        tileHeaderView.setTopLabelMaxLines(3);
    }
}
