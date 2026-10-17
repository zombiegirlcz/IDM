package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.RadialGaugeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BigRadialGaugeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/c4;", "Lip0/e4;", "<init>", "()V", "ip0/d4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BigRadialGaugeDelegate extends BaseRecyclerViewDelegate<ip0.c4, ip0.e4> {
    public BigRadialGaugeDelegate() {
        super(R$layout.internal_delegate_big_radial_gauge, new ip0.c(29));
    }

    public static void p(TextView textView, Clause clause, ip0.e4 e4Var, ip0.c4 c4Var, aw0.n0 n0Var) {
        int i;
        kli.a.b(textView, clause, ty0.f.f275450a);
        if (clause != null) {
            Context context = e4Var.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            aw0.o0 o0Var = c4Var.f163676b;
            if (o0Var.f10448h == n0Var) {
                int i2 = ip0.f4.f164189a[o0Var.f10445b.ordinal()];
                if (i2 == 1) {
                    i = R$attr.uikit_colorPerformancePositive;
                } else if (i2 == 2) {
                    i = R$attr.uikit_colorPerformanceNegative;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$attr.uikit_colorPerformanceStatic;
                }
            } else {
                i = R$attr.uikit_colorGreyTone50;
            }
            textView.setTextColor(kli.a.s(i, context));
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.e4 e4Var = new ip0.e4(kotlin.jvm.internal.s.r(parent, this.f98535a));
        e4Var.f.setChartSize(ms0.q3.BIG);
        return e4Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.e4 holder, ip0.c4 data, int i, List list) {
        List<ip0.d4> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.d4)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        boolean zN8 = ue0.e.n(payloads);
        boolean zN9 = ue0.e.n(payloads);
        if (payloads != null) {
            for (ip0.d4 d4Var : payloads) {
                zN = zN || d4Var.f163836a;
                zN2 = zN2 || d4Var.f163837b;
                zN3 = zN3 || d4Var.f163838c;
                zN4 = zN4 || d4Var.i;
                zN5 = zN5 || d4Var.d;
                zN6 = zN6 || d4Var.e;
                zN7 = zN7 || d4Var.f;
                zN8 = zN8 || d4Var.f163839g;
                zN9 = zN9 || d4Var.f163840h;
            }
        }
        if (zN) {
            RadialGaugeView radialGaugeView = holder.f;
            aw0.o0 o0Var = data.f163676b;
            Intrinsics.checkNotNullParameter(o0Var, "<this>");
            radialGaugeView.setGaugeData(new aw0.c9(o0Var.f10444a, o0Var.f10445b));
        }
        if (zN2) {
            kli.a.b(holder.f164015g, data.f163677c, ty0.f.f275450a);
        }
        if (zN3) {
            TextView textView = holder.f164016h;
            data.getClass();
            kli.a.b(textView, null, ty0.f.f275450a);
        }
        if (zN5) {
            p(holder.i, data.f163676b.f10446c, holder, data, aw0.n0.LEFT);
        }
        if (zN6) {
            p(holder.f164017j, data.f163676b.d, holder, data, aw0.n0.LEFT_TOP);
        }
        if (zN7) {
            p(holder.k, data.f163676b.e, holder, data, aw0.n0.TOP);
        }
        if (zN8) {
            p(holder.f164018l, data.f163676b.f, holder, data, aw0.n0.RIGHT_TOP);
        }
        if (zN9) {
            p(holder.f164019m, data.f163676b.f10447g, holder, data, aw0.n0.RIGHT);
        }
        if (zN4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
