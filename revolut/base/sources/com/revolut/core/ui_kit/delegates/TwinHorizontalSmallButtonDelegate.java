package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.an0;
import ip0.bn0;
import ip0.cn0;
import ip0.dn0;
import ip0.fg0;
import ip0.ri0;
import ip0.xm0;
import ip0.ym0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0006\u0007\b\u0002\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TwinHorizontalSmallButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/an0;", "Lip0/dn0;", "<init>", "()V", "ip0/ym0", "ip0/zm0", "ip0/cn0", "ip0/bn0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwinHorizontalSmallButtonDelegate extends BaseRecyclerViewDelegate<an0, dn0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53573c;
    public final e01.a d;

    public TwinHorizontalSmallButtonDelegate() {
        super(R$layout.internal_delegate_twin_horizontal_small_button, new ri0(26));
        this.f53573c = new e01.a();
        this.d = new e01.a();
    }

    public static void q(SmallActionButton smallActionButton, ym0 ym0Var, ym0 ym0Var2) {
        smallActionButton.i(ym0Var.h());
        smallActionButton.setIcon(ym0Var.getIcon());
        smallActionButton.setText(ym0Var.getText());
        smallActionButton.setTag(ym0Var.getTag());
        smallActionButton.setEnabled(ym0Var.x());
        r(smallActionButton, ym0Var, ym0Var2);
    }

    public static void r(SmallActionButton smallActionButton, ym0 ym0Var, ym0 ym0Var2) {
        int i;
        ms0.l4 l4VarA = ym0Var.a(ym0Var2);
        smallActionButton.k(l4VarA);
        ViewGroup.LayoutParams layoutParams = smallActionButton.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (l4VarA instanceof ms0.k4) {
                i = 0;
            } else {
                if (!(l4VarA instanceof ms0.i4) && !(l4VarA instanceof ms0.j4)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 1;
            }
            layoutParams2.weight = i;
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new dn0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_twin_horizontal_small_button));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(dn0 holder, an0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SmallActionButton smallActionButton = holder.f163934g;
        SmallActionButton smallActionButton2 = holder.f;
        ArrayList<bn0> arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            bn0 bn0Var = next instanceof bn0 ? (bn0) next : null;
            if (bn0Var != null) {
                arrayList.add(bn0Var);
            }
        }
        if (arrayList.isEmpty()) {
            cn0 cn0Var = data.f163473b;
            ym0 ym0Var = data.f163474c;
            q(smallActionButton2, cn0Var, ym0Var);
            q(smallActionButton, ym0Var, data.f163473b);
        } else {
            for (bn0 bn0Var2 : arrayList) {
                if (bn0Var2.f163632a) {
                    smallActionButton2.setIcon(data.f163473b.getIcon());
                }
                if (bn0Var2.f163633b) {
                    smallActionButton2.setText(data.f163473b.getText());
                }
                if (bn0Var2.f163634c) {
                    smallActionButton2.i(data.f163473b.h());
                }
                if (bn0Var2.d) {
                    cn0 cn0Var2 = data.f163473b;
                    smallActionButton2.setEnabled(true);
                }
                if (bn0Var2.e) {
                    cn0 cn0Var3 = data.f163473b;
                    smallActionButton2.setTag(null);
                }
                if (bn0Var2.f163635g) {
                    smallActionButton.setIcon(data.f163474c.getIcon());
                }
                if (bn0Var2.f163636h) {
                    smallActionButton.setText(data.f163474c.getText());
                }
                if (bn0Var2.i) {
                    smallActionButton.i(data.f163474c.h());
                }
                if (bn0Var2.f163637j) {
                    smallActionButton.setEnabled(data.f163474c.x());
                }
                if (bn0Var2.k) {
                    smallActionButton.setTag(data.f163474c.getTag());
                }
                if (bn0Var2.f163638l) {
                    r(smallActionButton, data.f163474c, data.f163473b);
                }
                if (bn0Var2.f) {
                    r(smallActionButton2, data.f163473b, data.f163474c);
                }
            }
        }
        data.getClass();
        smallActionButton2.setAnalyticsContext(null);
        smallActionButton.setAnalyticsContext(null);
        efm.r map = smallActionButton2.f56386h.map(new fg0(new xm0(data, 0), 18));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53573c.a(map, holder);
        efm.r map2 = smallActionButton.f56386h.map(new fg0(new xm0(data, 1), 19));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
