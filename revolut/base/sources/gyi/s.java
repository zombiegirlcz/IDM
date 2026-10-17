package gyi;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.views.ProfileCardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends ListAdapter {
    public final a76.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gwc.h f147906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a76.c onErrorButtonClick, gwc.h onActionItemClick) {
        super(new p());
        Intrinsics.checkNotNullParameter(onErrorButtonClick, "onErrorButtonClick");
        Intrinsics.checkNotNullParameter(onActionItemClick, "onActionItemClick");
        this.f = onErrorButtonClick;
        this.f147906g = onActionItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        r holder = (r) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ProfileCardModel item = ((o) getItem(i)).f147901b;
        holder.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        holder.e.setModel(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ProfileCardView profileCardView = new ProfileCardView(context, null, 6, 0);
        profileCardView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        return new r(profileCardView, this.f, this.f147906g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        r holder = (r) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.f147905h.d();
        ifm.b bVar = holder.f147905h;
        int i = 0;
        ifm.c[] cVarArr = {holder.e.g().subscribe(new gv5.b(new q(holder, 0), 13)), holder.e.e().subscribe(new gv5.b(new q(holder, 1), 14)), holder.e.f58840x.subscribe(new gv5.b(new q(holder, 2), 15)), holder.e.f58841y.subscribe(new gv5.b(new q(holder, 3), 16))};
        bVar.getClass();
        if (!bVar.f161042b) {
            synchronized (bVar) {
                try {
                    if (!bVar.f161042b) {
                        zfm.n nVar = bVar.f161041a;
                        if (nVar == null) {
                            nVar = new zfm.n(5);
                            bVar.f161041a = nVar;
                        }
                        while (i < 4) {
                            ifm.c cVar = cVarArr[i];
                            mfm.f.b(cVar, "A Disposable in the disposables array is null");
                            nVar.a(cVar);
                            i++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        while (i < 4) {
            cVarArr[i].dispose();
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        r holder = (r) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.f147905h.d();
    }
}
