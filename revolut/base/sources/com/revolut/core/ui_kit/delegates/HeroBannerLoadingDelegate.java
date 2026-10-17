package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.fm;
import ip0.gm;
import ip0.im;
import ip0.jm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0004\u0002\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HeroBannerLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/fm;", "Lip0/im;", "<init>", "()V", "ip0/hm", "ip0/gm", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeroBannerLoadingDelegate extends BaseRecyclerViewDelegate<fm, im> {
    public HeroBannerLoadingDelegate() {
        super(R$layout.internal_delegate_hero_banner_loading, new dk(10));
    }

    public static void p(im imVar, ConstraintSet constraintSet) {
        Context context = imVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (jh.d.k(context)) {
            constraintSet.connect(R$id.heroBannerLoading_badge, 6, R$id.heroBannerLoading_contentArea, 6);
            constraintSet.connect(R$id.heroBannerLoading_title, 6, R$id.heroBannerLoading_contentArea, 6);
            constraintSet.connect(R$id.heroBannerLoading_description1, 6, R$id.heroBannerLoading_contentArea, 6);
            constraintSet.connect(R$id.heroBannerLoading_description2, 6, R$id.heroBannerLoading_contentArea, 6);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new im(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_hero_banner_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(im holder, fm data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof gm) {
                arrayList.add(obj2);
            }
        }
        if (payloads.size() != arrayList.size()) {
            arrayList = null;
        }
        boolean z = arrayList == null || arrayList.isEmpty();
        if (arrayList != null) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                z = z || ((gm) it8.next()).f164444a;
            }
        }
        ShimmerFrameLayout shimmerFrameLayout = holder.f;
        ConstraintLayout constraintLayout = holder.i;
        View view = holder.f164714h;
        View view2 = holder.f164713g;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "<get-shimmeringView>(...)");
        ifk.b.r(shimmerFrameLayout);
        if (z) {
            int i2 = jm.f164878a[data.f164284b.ordinal()];
            if (i2 == 1) {
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "<get-shimmeringView>(...)");
                ViewGroup.LayoutParams layoutParams = shimmerFrameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = foh.i.j(LDSFile.EF_DG14_TAG);
                shimmerFrameLayout.setLayoutParams(layoutParams);
                Intrinsics.checkNotNullExpressionValue(view2, "<get-badgeView>(...)");
                view2.setVisibility(8);
                Intrinsics.checkNotNullExpressionValue(view, "<get-titleView>(...)");
                view.setVisibility(0);
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "<get-constraintLayout>(...)");
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.connect(R$id.heroBannerLoading_description1, 3, R$id.heroBannerLoading_title, 4);
                p(holder, constraintSet);
                constraintSet.applyTo(constraintLayout);
                return;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "<get-shimmeringView>(...)");
            ViewGroup.LayoutParams layoutParams2 = shimmerFrameLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = foh.i.j(186);
            shimmerFrameLayout.setLayoutParams(layoutParams2);
            Intrinsics.checkNotNullExpressionValue(view2, "<get-badgeView>(...)");
            view2.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(view, "<get-titleView>(...)");
            view.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "<get-constraintLayout>(...)");
            ConstraintSet constraintSet2 = new ConstraintSet();
            constraintSet2.clone(constraintLayout);
            constraintSet2.connect(R$id.heroBannerLoading_description1, 3, R$id.heroBannerLoading_badge, 4);
            p(holder, constraintSet2);
            constraintSet2.applyTo(constraintLayout);
        }
    }
}
