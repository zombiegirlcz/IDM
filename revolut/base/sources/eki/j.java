package eki;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends RecyclerView.ViewHolder {
    public PagerItem e;
    public final com.revolut.kompot.navigable.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.kompot.navigable.a parentController, ViewGroup itemView, aki.c controllersCache) {
        super(itemView);
        Intrinsics.checkNotNullParameter(parentController, "parentController");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        com.revolut.kompot.navigable.b bVar = new com.revolut.kompot.navigable.b(yji.g.f314514a, null, controllersCache, new jpf.a(itemView, parentController.y2().f98425m), null, null, null);
        bVar.f98425m = parentController.y2().f98425m;
        this.f = bVar;
    }
}
