package p2m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends RecyclerView.Adapter {
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function1 f232546g;

    public d(ArrayList itemList, Function1 callback) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f = itemList;
        this.f232546g = callback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof c) {
            c cVar = (c) holder;
            g vm7 = (g) this.f.get(i);
            Intrinsics.checkNotNullParameter(vm7, "vm");
            Function1 callback = this.f232546g;
            Intrinsics.checkNotNullParameter(callback, "callback");
            View viewFindViewById = cVar.itemView.findViewById(R.id.thumbnail);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = cVar.itemView.findViewById(R.id.itemTitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            cVar.e = new b(vm7, imageView, (TextView) viewFindViewById2);
            imageView.setImageResource(vm7.f232548l);
            b bVar = cVar.e;
            if (bVar == null) {
                Intrinsics.r("binding");
                throw null;
            }
            bVar.f232545c.setText(vm7.f232549m);
            View itemView = cVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ksj.b.u(itemView, new fbm.c(callback, vm7));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tdcoreekyc__item_identity, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "onCreateViewHolder$inflateView(...)");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new c(itemView);
    }
}
