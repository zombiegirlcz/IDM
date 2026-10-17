package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BackgroundSelectionButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/h2;", "Lip0/k2;", "<init>", "()V", "ip0/i2", "ip0/j2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackgroundSelectionButtonDelegate extends BaseRecyclerViewDelegate<ip0.h2, ip0.k2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51691c;

    public BackgroundSelectionButtonDelegate() {
        super(R$layout.internal_delegate_background_selection_button, new ip0.c(23));
        this.f51691c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.k2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_background_selection_button));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.k2 holder, ip0.h2 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f164943h;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof ip0.i2) {
                zN = zN || ((ip0.i2) next).f164625a;
                zN2 = zN2 || ((ip0.i2) next).f164626b;
                if (!zN3 && !((ip0.i2) next).f164627c) {
                    z = false;
                }
                zN3 = z;
            }
        }
        if (zN) {
            View view2 = holder.itemView;
            yy0.f.e(h30.l.z(view2, "itemView", view2), data.f164493b, holder.f, null, null, 12);
        }
        if (zN2) {
            kli.a.b(holder.f164942g, data.f164494c, ty0.f.f275450a);
        }
        if (zN3) {
            int i2 = ip0.l2.f165112a[data.d.ordinal()];
            if (i2 == 1) {
                view.getLayoutParams().width = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 80.0f);
                holder.itemView.getLayoutParams().width = -2;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                view.getLayoutParams().width = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", BitmapDescriptorFactory.HUE_RED);
                holder.itemView.getLayoutParams().width = -1;
            }
            view.requestLayout();
        }
        view.setOnClickListener(new ap0.f(this, data, 16));
    }
}
