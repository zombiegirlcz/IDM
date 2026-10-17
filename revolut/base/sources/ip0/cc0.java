package ip0;

import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.ScratchView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cc0 extends koi.b {
    public final t4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f163717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScratchView f163718h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(View itemView, t4 bigTileViewHolder) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "view");
        Intrinsics.checkNotNullParameter(bigTileViewHolder, "bigTileViewHolder");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = bigTileViewHolder;
        View viewFindViewById = itemView.findViewById(R$id.bigTileContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f163717g = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.scratchView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163718h = (ScratchView) viewFindViewById2;
    }
}
