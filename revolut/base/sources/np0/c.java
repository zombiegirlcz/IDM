package np0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.TimerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends koi.b {
    public final TimerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f218109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.timerDelegate_timerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TimerView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.timerDelegate_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f218109g = (TextView) viewFindViewById2;
    }
}
