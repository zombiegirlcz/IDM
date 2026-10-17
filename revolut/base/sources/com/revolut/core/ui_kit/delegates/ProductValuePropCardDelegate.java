package com.revolut.core.ui_kit.delegates;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.a30;
import ip0.b30;
import ip0.c30;
import ip0.tz;
import ip0.z20;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProductValuePropCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/z20;", "Lip0/b30;", "ip0/y20", "ip0/a30", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductValuePropCardDelegate extends BaseRecyclerViewDelegate<z20, b30> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xt0.a f52986c;

    public ProductValuePropCardDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new b30(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_product_value_prop_card));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(b30 holder, z20 data, int i, List payloads) {
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f163520g;
        TextView textView2 = holder.f;
        UiKitMediaView uiKitMediaView = holder.f163521h;
        List list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof a30)) {
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
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.ProductValuePropCardDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (a30 a30Var : payloads) {
            zIsEmpty = zIsEmpty || a30Var.f163378a;
            z = z || a30Var.f163379b;
            z4 = z4 || a30Var.f163380c;
            z3 = z3 || a30Var.d;
            z6 = z6 || a30Var.e;
        }
        if (zIsEmpty) {
            Intrinsics.checkNotNullExpressionValue(textView2, "<get-title>(...)");
            kli.a.b(textView2, data.f167386b, ty0.f.f275450a);
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(textView, "<get-subtitle>(...)");
            kli.a.b(textView, data.f167387c, ty0.f.f275450a);
        }
        if (z3) {
            int i3 = c30.f163674a[data.e.ordinal()];
            if (i3 != 1) {
                i2 = 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "343:180";
            } else {
                i2 = 3;
                str = "343:280";
            }
            int i5 = i2;
            textView2.setMaxLines(i2);
            textView.setMaxLines(i5);
            Intrinsics.checkNotNullExpressionValue(uiKitMediaView, "<get-media>(...)");
            ViewGroup.LayoutParams layoutParams = uiKitMediaView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.dimensionRatio = str;
            uiKitMediaView.setLayoutParams(layoutParams2);
        }
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            jz0.d dVarA0 = or0.u.k(itemView).a0();
            UrlMedia urlMedia = data.d;
            Intrinsics.checkNotNullExpressionValue(uiKitMediaView, "<get-media>(...)");
            ((jz0.b) dVarA0).b(urlMedia, uiKitMediaView, null);
        }
        if (z6) {
            uiKitMediaView.setForeground(data.f ? new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, ColorUtils.setAlphaComponent(-16777216, CertificateBody.profileType)}) : null);
        }
    }

    public ProductValuePropCardDelegate(int i) {
        super(R$layout.internal_delegate_product_value_prop_card, new tz(23));
        this.f52986c = null;
    }
}
