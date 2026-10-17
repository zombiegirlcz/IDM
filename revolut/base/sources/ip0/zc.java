package ip0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zc extends koi.b {
    public final mx0.a5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScreenContentRecyclerView f167442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f167443h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(ContainerDelegate containerDelegate, mx0.a5 itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "root");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = itemView;
        this.f167442g = itemView.getRecyclerView();
        this.f167443h = zhm.f0.f322471a;
        Iterator it8 = containerDelegate.e.iterator();
        while (it8.hasNext()) {
            this.f167442g.addItemDecoration((RecyclerView.ItemDecoration) it8.next());
        }
    }
}
