package tq0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends koi.b {
    public final RecyclerView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.gridSelector_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (RecyclerView) viewFindViewById;
    }
}
