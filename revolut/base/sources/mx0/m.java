package mx0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.CircleActionLoadingView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends koi.b {
    public final CircleActionLoadingView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = (CircleActionLoadingView) itemView;
    }
}
