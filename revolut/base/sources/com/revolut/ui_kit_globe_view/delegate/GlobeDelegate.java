package com.revolut.ui_kit_globe_view.delegate;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.ui_kit_globe_view.R$id;
import fyl.b;
import fyl.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/ui_kit_globe_view/delegate/GlobeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lfyl/a;", "Lfyl/c;", "<init>", "()V", "Companion", "fyl/b", "a", "ui_kit_globe_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlobeDelegate extends BaseRecyclerViewDelegate<fyl.a, c> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f107138c;
    public final e01.a d;

    public static final class a {
        private a() {
        }
    }

    public GlobeDelegate() {
        super(R$id.globeView_delegate_view_type, new fv0.c(20));
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        iyl.c cVar = new iyl.c(context, null, 6, 0);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new c(cVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(c holder, fyl.a data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        iyl.c cVar = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof b)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zIsEmpty = zIsEmpty || ((b) payloads.get(i3)).f139062a;
        }
        if (zIsEmpty) {
            cVar.setModel(data.f139061a);
        }
        this.d.a(cVar.f169786h, holder);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(c holder) {
        RecyclerView.RecycledViewPool recycledViewPool;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f107138c) {
            return;
        }
        ViewParent parent = holder.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
            recycledViewPool.setMaxRecycledViews(this.f98535a, 1);
        }
        this.f107138c = true;
    }
}
