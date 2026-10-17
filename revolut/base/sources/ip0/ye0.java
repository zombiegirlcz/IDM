package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ye0 extends koi.b {
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UiKitMediaView f167308g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f = view;
        View viewFindViewById = this.itemView.findViewById(R$id.simpleMedia_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UiKitMediaView uiKitMediaView = (UiKitMediaView) viewFindViewById;
        this.f167308g = uiKitMediaView;
        uiKitMediaView.setGlyphDisplayOption(new yp0.l(yp0.n.FACTOR_60, 3));
    }
}
