package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsActionableIconDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/f6;", "Lip0/g6;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsActionableIconDelegate extends BaseRecyclerViewDelegate<ip0.f6, ip0.g6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51807c;

    public CellDetailsActionableIconDelegate() {
        super(R$layout.internal_delegate_cell_details_actionable_icon, new ip0.g4(12));
        this.f51807c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.g6(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_actionable_icon));
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.g6 holder, final ip0.f6 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        TextView textView = holder.f164349g;
        AppCompatImageView appCompatImageView = holder.f164350h;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        or0.b.e(this, data.f164197b, holder.f, null, 12);
        ?? r132 = data.f164198c;
        or0.b.e(this, r132, textView, null, 12);
        View view = holder.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), data.d, holder.f164350h, null, null, 12);
        boolean z = data.e;
        final int i2 = 1;
        final int i3 = 0;
        if (z) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.e6

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CellDetailsActionableIconDelegate f164024b;

                {
                    this.f164024b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            this.f164024b.f51807c.onNext(data);
                            break;
                        default:
                            this.f164024b.f51807c.onNext(data);
                            break;
                    }
                }
            });
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.e6

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CellDetailsActionableIconDelegate f164024b;

                {
                    this.f164024b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            this.f164024b.f51807c.onNext(data);
                            break;
                        default:
                            this.f164024b.f51807c.onNext(data);
                            break;
                    }
                }
            });
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rd0.e.q(appCompatImageView, Integer.valueOf(kli.a.s(R$attr.uikit_colorAccent, context)));
        } else {
            appCompatImageView.setOnClickListener(null);
            textView.setOnClickListener(null);
        }
        pd.b.q(textView, z);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        hx7.b.u(zhm.v.k(hx7.b.f(data.f164197b), hx7.b.f(r132)), itemView2);
    }
}
