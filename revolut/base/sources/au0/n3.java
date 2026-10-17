package au0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import aw0.ha;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n3 extends koi.b implements rr0.d, o3, x {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressSwitcher f9283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rr0.g f9284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.delegate_nav_bar_text_menu_item_text_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f = textView;
        ProgressSwitcher progressSwitcher = (ProgressSwitcher) itemView;
        this.f9283g = progressSwitcher;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        progressSwitcher.setProgressSize(kli.a.k(context, 20.0f));
        progressSwitcher.setProgressTintAttr(R$attr.uikit_colorAccentNeutral);
        progressSwitcher.setProgressGravity(8388629);
        pd.b.h(textView, true);
        ((bp0.y) or0.u.k(itemView).b0()).w(textView, ha.IGNORE);
        this.f9284h = vc.s.c(this);
    }

    public final TextView F() {
        return this.f;
    }

    @Override // rr0.d
    public final void L(boolean z) {
        this.f9283g.setProgressVisible(z);
    }

    @Override // au0.o3
    public final void i(int i) {
        this.f9283g.setProgressTintColor(i);
        this.f.setTextColor(i);
    }
}
