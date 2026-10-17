package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class oq extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f165703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rr0.g f165704h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.inputDisclosure_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.inputDisclosure_secondaryText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165703g = (TextView) viewFindViewById2;
        this.f165704h = vc.s.d(this, new nq0.e(itemView), new fu0.l(this), 8);
    }
}
