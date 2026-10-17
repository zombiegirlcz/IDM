package ly0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.delegates.WidgetHeaderDelegate;
import kotlin.jvm.internal.Intrinsics;
import z4l.j;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends koi.b {
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WidgetHeaderDelegate f200627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View itemView, j adapter, WidgetHeaderDelegate headerDelegate) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(headerDelegate, "headerDelegate");
        this.f = adapter;
        this.f200627g = headerDelegate;
        View viewFindViewById = itemView.findViewById(R$id.dashboardBoxViewWidget_widgetRecycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new o31.b());
    }
}
