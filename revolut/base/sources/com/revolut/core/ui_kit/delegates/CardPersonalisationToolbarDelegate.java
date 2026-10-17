package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.delegates.SelectableIconDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CardPersonalisationToolbarDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/a2;", "Lip0/r5;", "<init>", "()V", "ip0/q5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPersonalisationToolbarDelegate extends BaseRecyclerViewDelegate<a2, ip0.r5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SelectableIconDelegate f51779c;
    public final ihm.f d;
    public final ihm.f e;

    public CardPersonalisationToolbarDelegate() {
        super(R$layout.internal_delegate_card_personalisation_toolbar, new ip0.g4(8));
        this.f51779c = new SelectableIconDelegate(false);
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.r5(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_card_personalisation_toolbar), this.f51779c);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.r5 holder, a2 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        z4l.j jVar = holder.k;
        if (payloads.isEmpty()) {
            int i2 = holder.f166121m;
            int i3 = holder.f166120l;
            RecyclerView recyclerView = holder.f;
            if (i3 != recyclerView.getPaddingStart() || i2 != recyclerView.getPaddingEnd()) {
                recyclerView.setPadding(i3, recyclerView.getPaddingTop(), i2, recyclerView.getPaddingBottom());
            }
            jVar.c(data.f53656b);
            q(holder, data);
            r(holder, data);
            return;
        }
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CardPersonalisationToolbarDelegate.Payload");
            ip0.q5 q5Var = (ip0.q5) obj2;
            if (q5Var.f165918a) {
                jVar.c(data.f53656b);
            }
            if (q5Var.f165919b) {
                q(holder, data);
            }
            if (q5Var.f165920c) {
                r(holder, data);
            }
        }
    }

    public final void q(ip0.r5 r5Var, a2 a2Var) {
        if (a2Var.f53657c == null) {
            r5Var.f166118h.setVisibility(8);
            r5Var.f166117g.setVisibility(8);
            r5Var.f166118h.setOnClickListener(null);
        } else {
            r5Var.f166118h.setVisibility(0);
            r5Var.f166117g.setVisibility(0);
            View view = r5Var.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), a2Var.f53657c, r5Var.f166118h, null, null, 12);
            AppCompatImageView appCompatImageView = r5Var.f166118h;
            appCompatImageView.setOnClickListener(new j01.c(new View[]{appCompatImageView}, a2Var, this.d, null, 24));
        }
    }

    public final void r(ip0.r5 r5Var, a2 a2Var) {
        a2Var.getClass();
        r5Var.i.setVisibility(8);
        r5Var.f166119j.setVisibility(8);
        r5Var.i.setOnClickListener(null);
    }
}
