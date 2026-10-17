package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y90 extends koi.b implements rr0.d {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f167289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProgressSwitcher f167290h;
    public final rr0.g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rectangularButton_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.rectangularButton_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f167289g = (ImageView) viewFindViewById2;
        ProgressSwitcher progressSwitcher = (ProgressSwitcher) itemView;
        this.f167290h = progressSwitcher;
        this.i = vc.s.c(this);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressSwitcher.setProgressSize(kli.a.k(context, 24.0f));
    }

    @Override // rr0.d
    public final void L(boolean z) {
        this.f167290h.setProgressVisible(z);
        this.f.setVisibility(z ? 4 : 0);
        this.f167289g.setVisibility(z ? 4 : 0);
    }
}
