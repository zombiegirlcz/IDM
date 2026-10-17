package ip0;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.TextSwitcherView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pe extends wn {
    public final TextSwitcherView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.displayCurrencyPreview_textSwitcher);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextSwitcherView textSwitcherView = (TextSwitcherView) viewFindViewById;
        this.f = textSwitcherView;
        textSwitcherView.setInAnimatorFactory(new h35.c(22));
        textSwitcherView.setOutAnimatorFactory(new h35.c(23));
    }

    @Override // ip0.wn
    public final void F(aw0.x8 picturePalette) {
        Intrinsics.checkNotNullParameter(picturePalette, "picturePalette");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f.setTextColor(kli.a.s(picturePalette.f10609a.a(), context));
    }
}
