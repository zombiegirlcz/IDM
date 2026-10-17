package yr0;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4l.j f316066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f316067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f316068c;
    public final LinearLayout d;

    public j(k kVar) {
        z4l.j jVar = new z4l.j(7, zhm.v.k(kVar.f316070b, kVar.f316071c), false);
        this.f316066a = jVar;
        RecyclerView recyclerView = new RecyclerView(kVar.getContext());
        recyclerView.setId(R$id.popupMenuWindow_items);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(kVar.getContext()));
        recyclerView.setRecycledViewPool(kVar.e);
        this.f316067b = recyclerView;
        LinearLayout linearLayout = new LinearLayout(kVar.getContext());
        Context context = kVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 4.0f);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setPadding(0, iK, 0, iK);
        linearLayout.addView(recyclerView);
        this.d = linearLayout;
    }
}
