package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.b70;
import ip0.c70;
import ip0.d70;
import ip0.l40;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PropertyCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/b70;", "Lip0/d70;", "<init>", "()V", "Companion", "ip0/c70", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PropertyCardDelegate extends BaseRecyclerViewDelegate<b70, d70> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53119c;

    public PropertyCardDelegate() {
        super(R$layout.internal_delegate_property_card, new l40(16));
        this.f53119c = new e01.a();
    }

    public static void q(b70 b70Var, d70 d70Var) {
        if (b70Var.f == null) {
            d70Var.f163853j.setVisibility(8);
        } else {
            d70Var.f163853j.setVisibility(0);
            d70Var.f163853j.setContent(zhm.d0.V0(b70Var.f, 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(ip0.b70 r4, ip0.d70 r5) {
        /*
            aw0.i9 r0 = r4.e
            if (r0 == 0) goto L2f
            com.revolut.core.ui_kit.internal.views.RatingCell r0 = r5.i
            r1 = 0
            r0.setVisibility(r1)
            com.revolut.core.ui_kit.internal.views.RatingCell r5 = r5.i
            aw0.i9 r4 = r4.e
            java.lang.Float r0 = r4.f10362c
            if (r0 == 0) goto L26
            float r0 = r0.floatValue()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L26
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L26
            java.lang.Float r0 = r4.f10362c
            goto L27
        L26:
            r0 = 0
        L27:
            aw0.i9 r4 = aw0.i9.a(r4, r0)
            r5.setContent(r4)
            return
        L2f:
            com.revolut.core.ui_kit.internal.views.RatingCell r4 = r5.i
            r5 = 8
            r4.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.PropertyCardDelegate.r(ip0.b70, ip0.d70):void");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new d70(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_property_card));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(d70 holder, b70 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f163852h;
        TextView textView = holder.f163851g;
        TextView textView2 = holder.f;
        if (payloads.isEmpty()) {
            kli.a.b(textView2, data.f163546b, ty0.f.f275450a);
            kli.a.b(textView, data.f163547c, ty0.f.f275450a);
            zi0.c.g(imageView, data.d);
            r(data, holder);
            q(data, holder);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<c70> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.PropertyCardDelegate.Payload");
                arrayList.add((c70) obj2);
            }
            for (c70 c70Var : arrayList) {
                if (c70Var.f163691a) {
                    kli.a.b(textView2, data.f163546b, ty0.f.f275450a);
                }
                if (c70Var.f163692b) {
                    kli.a.b(textView, data.f163547c, ty0.f.f275450a);
                }
                if (c70Var.f163693c) {
                    zi0.c.g(imageView, data.d);
                }
                if (c70Var.d) {
                    r(data, holder);
                }
                if (c70Var.e) {
                    q(data, holder);
                }
                if (c70Var.f) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
            }
        }
        this.f53119c.a(holder.f163853j.f56099r, holder);
    }
}
