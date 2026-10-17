package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.RatingBar;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e30;
import ip0.e70;
import ip0.l40;
import ip0.w10;
import ip0.ws;
import ip0.y70;
import ip0.z70;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0002\u0003\u0007\b\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RateDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/y70;", "Lcom/revolut/core/ui_kit/delegates/zd;", "<init>", "()V", "Companion", "ip0/z70", "ip0/v70", "ip0/u70", "ip0/x70", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RateDelegate extends BaseRecyclerViewDelegate<y70, zd> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53140c;
    public final e01.a d;
    public final Object e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f53141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53142b;

        public b() {
            this(BitmapDescriptorFactory.HUE_RED, 63);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Float.compare(this.f53141a, bVar.f53141a) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && this.f53142b == bVar.f53142b;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + j6.a.b(this.f53142b, m72.b.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(this.f53141a) * 31, 31), 29791);
        }

        public b(float f, int i) {
            this.f53141a = (i & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f;
            this.f53142b = 5;
        }
    }

    public RateDelegate() {
        super(R$layout.internal_delegate_rate, new l40(22));
        this.f53140c = v0.a.d("create(...)");
        this.d = new e01.a();
        this.e = yhm.j.c(yhm.k.NONE, new e70(1));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new zd(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(zd holder, y70 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f55692h;
        TextView textView2 = holder.f;
        View itemView = holder.itemView;
        ImageView imageView = holder.k;
        SmallActionButton smallActionButton = holder.f55693j;
        RatingBar ratingBar = holder.i;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f167270c, textView2, null, 12);
            or0.b.e(this, null, textView, null, 12);
            holder.F(data.f167269b);
            ratingBar.setOnRatingChangedListener(new r10.w(this, data));
            ratingBar.setEnabled(true);
            smallActionButton.setEnabled(true);
            imageView.setVisibility(8);
            efm.r map = smallActionButton.f56386h.map(new e30(new w10(data, 8), 14));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            this.d.a(map, holder);
            q(holder, data);
            return;
        }
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RateDelegate.Payload");
            z70 z70Var = (z70) obj2;
            if (z70Var.f167412a) {
                or0.b.e(this, data.f167270c, textView2, null, 12);
            }
            if (z70Var.f167413b) {
                data.getClass();
                or0.b.e(this, null, textView, null, 12);
            }
            if (z70Var.f167414c) {
                holder.F(data.f167269b);
            }
            if (z70Var.d) {
                data.getClass();
                ratingBar.setEnabled(true);
                smallActionButton.setEnabled(true);
            }
            if (z70Var.e) {
                data.getClass();
                imageView.setVisibility(8);
                q(holder, data);
            }
        }
    }

    public final void q(zd zdVar, y70 y70Var) {
        ImageView imageView = zdVar.k;
        if (imageView.getVisibility() == 8) {
            imageView.setOnClickListener(null);
            or0.u.d(imageView);
            return;
        }
        imageView.setOnClickListener(new ws(this, y70Var, 17));
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(R$attr.uikit_dp16, context);
        or0.u.l(imageView, iW, iW, iW, iW);
    }
}
