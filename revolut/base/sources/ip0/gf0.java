package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.slider.SliderTitledView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gf0 extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f164410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SliderTitledView f164411h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164410g = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.slider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164411h = (SliderTitledView) viewFindViewById3;
    }
}
