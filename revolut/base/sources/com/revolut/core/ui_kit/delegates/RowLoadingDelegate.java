package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import ip0.ob0;
import ip0.pb0;
import ip0.qb0;
import ip0.rb0;
import ip0.sb0;
import ip0.t90;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RowLoadingDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lip0/pb0;", "Lip0/sb0;", "<init>", "()V", "ip0/qb0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RowLoadingDelegate extends BaseGroupRecyclerViewDelegate<pb0, sb0> {
    public final ihm.f d;
    public final ihm.f e;

    public RowLoadingDelegate() {
        super(R$layout.internal_delegate_row_loading, new t90(15));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new sb0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_row_loading));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        List list;
        float f;
        float f4;
        sb0 holder = (sb0) bVar;
        pb0 data = (pb0) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        List list2 = payloads;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            list = payloads;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof qb0)) {
                    list = null;
                    break;
                }
            }
            list = payloads;
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.RowLoadingDelegate.Payload>");
        boolean zIsEmpty = list.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (int i2 = 0; i2 < size; i2++) {
            qb0 qb0Var = (qb0) list.get(i2);
            z = z || qb0Var.f165959a;
            z3 = z3 || qb0Var.f165961c;
        }
        if (z) {
            ob0 imageSize = data.f165805b;
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            View view = holder.f166333g;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int i3 = rb0.f166158a[imageSize.ordinal()];
            if (i3 == 1) {
                f4 = 24.0f;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f4 = 40.0f;
            }
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", f4);
            layoutParams.width = iA;
            layoutParams.height = iA;
            view.setLayoutParams(layoutParams);
        }
        if (zIsEmpty) {
            boolean z4 = data.d;
            holder.i.setVisibility(z4 ? 0 : 8);
            View view2 = holder.f166334h;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (z4) {
                layoutParams3.bottomToBottom = -1;
            } else {
                layoutParams3.bottomToBottom = 0;
            }
            view2.setLayoutParams(layoutParams3);
        }
        if (z || zIsEmpty) {
            ob0 imageSize2 = data.f165805b;
            boolean z6 = data.d;
            Intrinsics.checkNotNullParameter(imageSize2, "imageSize");
            if (z6) {
                int i5 = rb0.f166158a[imageSize2.ordinal()];
                if (i5 == 1) {
                    f = 4.0f;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f;
                }
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            or0.u.y(holder.f166334h, 0, com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", f), 0, 0, 13);
        }
        if (z3) {
            holder.f166335j.setVisibility(data.f165806c ? 0 : 8);
        }
        holder.itemView.setTag(data.f165804a);
        ifk.b.r(holder.f);
        this.d.onNext(Integer.valueOf(i));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void n(sb0 holder) {
        Object obj2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        koi.j jVar = holder.e;
        pb0 pb0Var = jVar instanceof pb0 ? (pb0) jVar : null;
        if (pb0Var == null || (obj2 = pb0Var.e) == null) {
            obj2 = Unit.f186387a;
        }
        this.e.onNext(obj2);
    }
}
