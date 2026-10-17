package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.is;
import ip0.js;
import ip0.ks;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LargeSliderLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/is;", "Lip0/ks;", "<init>", "()V", "ip0/js", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LargeSliderLoadingDelegate extends BaseRecyclerViewDelegate<is, ks> {
    public LargeSliderLoadingDelegate() {
        super(R$layout.internal_delegate_large_slider_loading, new hq(10));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ks(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ks holder, is data, int i, List payloads) {
        is isVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        for (Object obj2 : payloads) {
            if (obj2 instanceof js) {
                boolean z = true;
                zN = zN || ((js) obj2).d;
                zN2 = zN2 || ((js) obj2).f164903a;
                zN3 = zN3 || ((js) obj2).f164904b;
                if (!zN4 && !((js) obj2).f164905c) {
                    z = false;
                }
                zN4 = z;
            }
        }
        if (zN) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            isVar = data;
            or0.b.c(this, isVar, itemView, false, null, 28);
        } else {
            isVar = data;
        }
        if (zN2) {
            AppCompatTextView appCompatTextView = holder.f;
            isVar.getClass();
            kli.a.b(appCompatTextView, null, ty0.f.f275450a);
        }
        if (zN3) {
            AppCompatTextView appCompatTextView2 = holder.f165066g;
            isVar.getClass();
            kli.a.b(appCompatTextView2, null, ty0.f.f275450a);
        }
        if (zN4) {
            AppCompatTextView appCompatTextView3 = holder.f165067h;
            isVar.getClass();
            kli.a.b(appCompatTextView3, null, ty0.f.f275450a);
        }
    }
}
