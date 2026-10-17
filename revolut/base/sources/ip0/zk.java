package ip0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zk extends koi.b {
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f167478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f167479h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RecyclerView f167480j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z4l.j f167481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f167482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public xv0.w f167483n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(View itemView, List delegates, int i, float f, float f4) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f = delegates;
        this.f167478g = i;
        this.f167479h = f;
        this.i = f4;
        View viewFindViewById = itemView.findViewById(R$id.gridBox_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f167480j = recyclerView;
        Object parent = recyclerView.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        this.k = (View) parent;
        this.f167481l = new z4l.j(7, this.f, false);
        this.f167482m = true;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new AdaptiveGridLayoutManager(context, this.f167478g, this.f167482m));
        recyclerView.setAdapter(this.f167481l);
        recyclerView.setNestedScrollingEnabled(false);
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, this.f167479h);
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        recyclerView.addItemDecoration(new tw0.b(kli.a.k(context3, this.i), iK, 12));
    }
}
