package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DisplayAmountToggleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ke;", "Lip0/me;", "<init>", "()V", "ip0/le", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DisplayAmountToggleDelegate extends BaseRecyclerViewDelegate<ip0.ke, ip0.me> {
    public DisplayAmountToggleDelegate() {
        super(R$layout.internal_delegate_display_amount_toggle, new ip0.lb(20));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.me(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_display_amount_toggle));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.me holder, ip0.ke data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        float f = holder.f165364j;
        float f4 = holder.k;
        float f5 = holder.i;
        float f6 = holder.f165365l;
        TextView textView = holder.f165362g;
        TextView textView2 = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.le)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            z = zN;
            z3 = z;
            z4 = z3;
            for (int i3 = 0; i3 < size2; i3++) {
                ip0.le leVar = (ip0.le) payloads.get(i3);
                z3 = z3 || leVar.f165189a;
                zN = zN || leVar.f165190b;
                z = z || leVar.f165191c;
                z4 = z4 || leVar.d;
            }
        } else {
            z = zN;
            z3 = z;
            z4 = z3;
        }
        if (zN) {
            ty0.c.b(or0.u.k(textView2).b0(), data.f164999a.f164829b, holder.f, null, null, 8);
        }
        if (z) {
            ty0.c.b(or0.u.k(textView).b0(), data.f165000b.f164829b, holder.f165362g, null, null, 8);
        }
        if (z4 || z3) {
            long j2 = z3 ? 0L : 300L;
            if (Intrinsics.f(data.f165001c, data.f164999a.f164828a)) {
                textView.animate().alpha(f6).translationY(BitmapDescriptorFactory.HUE_RED).scaleX(f5).scaleY(f5).setDuration(j2).start();
                textView2.animate().alpha(f4).translationY(BitmapDescriptorFactory.HUE_RED).scaleX(f).scaleY(f).setDuration(j2).start();
            } else {
                ViewPropertyAnimator viewPropertyAnimatorAlpha = textView2.animate().alpha(f6);
                float f32 = holder.f165363h;
                viewPropertyAnimatorAlpha.translationY(textView2.getTranslationY() + f32).scaleX(f5).scaleY(f5).setDuration(j2).start();
                textView.animate().alpha(f4).translationY((-f32) - textView.getTranslationY()).scaleX(f).scaleY(f).setDuration(j2).start();
            }
        }
    }
}
