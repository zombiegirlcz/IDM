package ip0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.delegates.SelectableIconDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class up extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4l.j f166711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(View view, SelectableIconDelegate iconDelegate) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(iconDelegate, "iconDelegate");
        View viewFindViewById = view.findViewById(R$id.internalDelegateIconSelector_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f = recyclerView;
        View viewFindViewById2 = view.findViewById(R$id.internalDelegateIconSelector_frameLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        koi.c cVar = new koi.c(0);
        cVar.a(iconDelegate);
        z4l.j jVar = new z4l.j(cVar, false, 14);
        this.f166711g = jVar;
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
    }
}
