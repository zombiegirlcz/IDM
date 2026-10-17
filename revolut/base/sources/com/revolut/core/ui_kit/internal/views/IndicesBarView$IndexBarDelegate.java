package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au0.t1;
import aw0.d6;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.IndexBarModel;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ms0.f1;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/core/ui_kit/internal/views/IndicesBarView$IndexBarDelegate", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/models/IndexBarModel;", "Lms0/f1;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndicesBarView$IndexBarDelegate extends BaseRecyclerViewDelegate<IndexBarModel, f1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f56192c;

    public IndicesBarView$IndexBarDelegate() {
        super(R$layout.internal_delegate_index_bar, new mqg.a(10));
        this.f56192c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f1(s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(f1 holder, IndexBarModel data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f;
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (Object obj2 : payloads) {
            if (obj2 instanceof d6) {
                boolean z4 = true;
                zIsEmpty = zIsEmpty || ((d6) obj2).f10279a;
                z = z || ((d6) obj2).f10280b;
                if (!z3 && !((d6) obj2).f10281c) {
                    z4 = false;
                }
                z3 = z4;
            }
        }
        if (zIsEmpty) {
            Intrinsics.checkNotNullExpressionValue(imageView, "<get-barView>(...)");
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rd0.e.q(imageView, Integer.valueOf(kli.a.s(data.f57792b, context)));
        }
        if (z) {
            TextView textView = holder.f208246g;
            Intrinsics.checkNotNullExpressionValue(textView, "<get-titleView>(...)");
            kli.a.b(textView, data.f57793c, ty0.f.f275450a);
        }
        if (z3) {
            TextView textView2 = holder.f208247h;
            Intrinsics.checkNotNullExpressionValue(textView2, "<get-subtitleView>(...)");
            kli.a.b(textView2, data.d, ty0.f.f275450a);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.m.a(itemView);
        itemView.setOnClickListener(new t1(data, 27, this, data));
    }
}
