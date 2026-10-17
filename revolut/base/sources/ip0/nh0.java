package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nh0 extends koi.b {
    public final z4l.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f165515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public jh0 f165516h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(View itemView, z4l.j adapter) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = adapter;
        View viewFindViewById = itemView.findViewById(R$id.suggestionsBarDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f165515g = (RecyclerView) viewFindViewById;
    }
}
