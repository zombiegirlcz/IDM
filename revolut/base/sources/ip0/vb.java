package ip0;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vb extends koi.b {
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f166803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(View itemView, RecyclerView.ViewHolder viewHolder) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "root");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = viewHolder;
        View viewFindViewById = itemView.findViewById(R$id.complexChartDelegate_headerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.complexChartDelegate_innerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166803g = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.complexChartDelegate_legendView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
    }
}
