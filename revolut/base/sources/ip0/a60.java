package ip0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a60 extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z50 f163399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f163400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.progressTimelineDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f = recyclerView;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f163399g = new z50(context, 0);
        this.f163400h = zhm.f0.f322471a;
        recyclerView.setClipChildren(true);
        recyclerView.setClipToPadding(true);
    }
}
