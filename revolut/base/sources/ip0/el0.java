package ip0;

import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.timepicker.TimePickerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class el0 extends koi.b {
    public final TimePickerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.timePicker_picker);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TimePickerView) viewFindViewById;
    }
}
