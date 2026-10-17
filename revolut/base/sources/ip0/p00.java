package ip0;

import android.view.View;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p00 extends koi.b {
    public final PhoneInputTextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (PhoneInputTextView) itemView;
    }
}
