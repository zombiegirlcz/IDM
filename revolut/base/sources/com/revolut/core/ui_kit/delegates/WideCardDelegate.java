package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.WideCardDelegate;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.kp0;
import ip0.lp0;
import ip0.qn0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WideCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/kp0;", "Lip0/lp0;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WideCardDelegate extends BaseRecyclerViewDelegate<kp0, lp0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xt0.a f53640c;
    public final ihm.f d;
    public final ihm.f e;

    public WideCardDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new lp0(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_wide_card));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((lp0) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((lp0) bVar, i, list);
    }

    public final void p(lp0 holder, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        AppCompatImageView appCompatImageView = holder.f165249h;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            it8.next();
        }
        if (payloads.size() != arrayList.size()) {
            arrayList = null;
        }
        boolean z12 = arrayList == null || arrayList.isEmpty();
        if (arrayList != null) {
            Iterator it9 = arrayList.iterator();
            while (true) {
                z = z12;
                z3 = z;
                z4 = z3;
                z6 = z4;
                z11 = z6;
                if (!it9.hasNext()) {
                    break;
                }
                if (it9.next() != null) {
                    throw new ClassCastException();
                }
                if (!z12) {
                    throw null;
                }
                if (!z) {
                    throw null;
                }
                if (!z3) {
                    throw null;
                }
                if (!z4) {
                    throw null;
                }
                if (!z6) {
                    throw null;
                }
                if (!z11) {
                    throw null;
                }
                z12 = true;
            }
        } else {
            z = z12;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
        }
        if (z12) {
            Intrinsics.checkNotNullExpressionValue(holder.f, "<get-title>(...)");
            throw null;
        }
        if (z) {
            UiKitMediaView uiKitMediaView = holder.f165248g;
            Intrinsics.h(uiKitMediaView);
            or0.u.k(uiKitMediaView).a0();
            throw null;
        }
        if (z3) {
            Intrinsics.checkNotNullExpressionValue(holder.itemView.getContext(), "getContext(...)");
            throw null;
        }
        if (z4) {
            Intrinsics.checkNotNullExpressionValue(holder.itemView.getContext(), "getContext(...)");
            throw null;
        }
        if (z6) {
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "<get-closeButton>(...)");
            throw null;
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, null, itemView, false, null, 28);
        }
        final int i2 = 0;
        holder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.jp0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WideCardDelegate f164901b;

            {
                this.f164901b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f164901b.d.onNext(null);
                        throw null;
                    default:
                        this.f164901b.e.onNext(null);
                        throw null;
                }
            }
        });
        final int i3 = 1;
        appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.jp0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WideCardDelegate f164901b;

            {
                this.f164901b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f164901b.d.onNext(null);
                        throw null;
                    default:
                        this.f164901b.e.onNext(null);
                        throw null;
                }
            }
        });
    }

    public WideCardDelegate(int i) {
        super(R$layout.internal_delegate_wide_card, new qn0(10));
        this.f53640c = null;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }
}
