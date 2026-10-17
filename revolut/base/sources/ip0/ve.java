package ip0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.PickerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ve extends koi.b {
    public final PickerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PickerView f166808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f166809h;
    public final TextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.firstPicker);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (PickerView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.secondPicker);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166808g = (PickerView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.firstPickerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166809h = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.secondPickerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
    }
}
