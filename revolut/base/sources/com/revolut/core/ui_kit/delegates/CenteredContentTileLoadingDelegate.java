package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CenteredContentTileLoadingDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/p9;", "Lip0/r9;", "<init>", "()V", "ip0/q9", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenteredContentTileLoadingDelegate extends BaseBoxRecyclerViewDelegate<ip0.p9, ip0.r9> {
    public CenteredContentTileLoadingDelegate() {
        super(R$layout.internal_delegate_centered_content_tile_loading, false, new ip0.h8(10));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.r9(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_centered_content_tile_loading));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.r9 holder, ip0.p9 data, int i, List list) {
        float f;
        String str;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        List<ip0.q9> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        View view = holder.i;
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof ip0.q9)) {
                        payloads = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.CenteredContentTileLoadingDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (ip0.q9 q9Var : payloads) {
            zIsEmpty = zIsEmpty || q9Var.f165939a;
            z = z || q9Var.f165940b;
        }
        if (zIsEmpty) {
            view.setVisibility(!data.f165784b ? 8 : 0);
        }
        if (z) {
            ip0.m9 m9Var = data.f165785c;
            if (m9Var instanceof ip0.l9) {
                f = 0.5f;
                str = "1:1";
            } else {
                if (!(m9Var instanceof ip0.i9)) {
                    throw new NoWhenBranchMatchedException();
                }
                f = BitmapDescriptorFactory.HUE_RED;
                str = "120:160";
            }
            ConstraintSet constraintSet = new ConstraintSet();
            ConstraintLayout constraintLayout = holder.f;
            View view2 = holder.f166150j;
            constraintSet.clone(constraintLayout);
            constraintSet.setDimensionRatio(constraintLayout.getId(), str);
            constraintSet.setVerticalBias(view2.getId(), f);
            constraintSet.applyTo(constraintLayout);
            if (Intrinsics.f(m9Var, ip0.g9.f164371a)) {
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 16.0f);
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 52.0f);
                iA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 56.0f);
                iA4 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 8.0f);
                iA5 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 20.0f);
            } else if (Intrinsics.f(m9Var, ip0.h9.f164521a)) {
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 14.0f);
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 80.0f);
                iA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 64.0f);
                iA4 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 20.0f);
                iA5 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 12.0f);
            } else if (Intrinsics.f(m9Var, ip0.j9.f164805a)) {
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 12.0f);
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 52.0f);
                iA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 64.0f);
                iA4 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 24.0f);
                iA5 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 20.0f);
            } else {
                if (!Intrinsics.f(m9Var, ip0.k9.f164977a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 16.0f);
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 52.0f);
                iA3 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 56.0f);
                iA4 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 8.0f);
                iA5 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 30.0f);
            }
            or0.u.z(holder.f166149h, 0, iA4, 0, 0, false, 29);
            or0.u.z(holder.f166150j, 0, iA5, 0, 0, false, 29);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
            layoutParams2.matchConstraintMaxWidth = iA2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iA;
            view.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.width = iA3;
            layoutParams3.height = iA3;
            view2.setLayoutParams(layoutParams3);
        }
        ifk.b.r(holder.f166148g);
    }
}
