package ip0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ab0 extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4l.j f163416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(RewardsGridLoadingDelegate rewardsGridLoadingDelegate, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.rewardsGridLoading_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f = recyclerView;
        z4l.j jVar = new z4l.j(7, zhm.u.c(rewardsGridLoadingDelegate.f53210c), false);
        this.f163416g = jVar;
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 20.0f);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tw0.b bVar = new tw0.b(((context.getResources().getDisplayMetrics().widthPixels / 4) - kli.a.k(context, 72.0f)) / 2, iA, 12);
        recyclerView.setAdapter(jVar);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.setLayoutManager(new AdaptiveGridLayoutManager(context2));
        recyclerView.addItemDecoration(bVar);
    }
}
