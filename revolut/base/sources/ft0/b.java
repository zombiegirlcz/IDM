package ft0;

import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends koi.b {
    public final MaskedTextInputEditText f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MaskedTextInputEditText itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "editText");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
    }
}
