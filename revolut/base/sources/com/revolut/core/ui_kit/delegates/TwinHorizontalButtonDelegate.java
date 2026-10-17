package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fg0;
import ip0.ri0;
import ip0.sm0;
import ip0.tm0;
import ip0.um0;
import ip0.vm0;
import ip0.wm0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0002\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/um0;", "Lip0/wm0;", "<init>", "()V", "ip0/tm0", "ip0/vm0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwinHorizontalButtonDelegate extends BaseRecyclerViewDelegate<um0, wm0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53572c;
    public final e01.a d;

    public TwinHorizontalButtonDelegate() {
        super(R$layout.internal_delegate_twin_horizontal_button, new ri0(25));
        this.f53572c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new wm0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_twin_horizontal_button));
    }

    public final efm.r p() {
        return this.f53572c.f121375b;
    }

    public final efm.r q() {
        return this.d.f121375b;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(wm0 holder, um0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        LargeActionButton largeActionButton = holder.f167051g;
        LargeActionButton largeActionButton2 = holder.f;
        ArrayList<vm0> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            vm0 vm0Var = obj2 instanceof vm0 ? (vm0) obj2 : null;
            if (vm0Var != null) {
                arrayList.add(vm0Var);
            }
        }
        if (arrayList.isEmpty()) {
            tm0 tm0Var = data.f166696b;
            largeActionButton2.o(tm0Var.f166539a);
            largeActionButton2.setIcon(tm0Var.f166540b);
            largeActionButton2.setText(tm0Var.f166541c);
            largeActionButton2.setTag(tm0Var.e);
            largeActionButton2.setEnabled(tm0Var.d);
            tm0 tm0Var2 = data.f166697c;
            largeActionButton.o(tm0Var2.f166539a);
            largeActionButton.setIcon(tm0Var2.f166540b);
            largeActionButton.setText(tm0Var2.f166541c);
            largeActionButton.setTag(tm0Var2.e);
            largeActionButton.setEnabled(tm0Var2.d);
        } else {
            for (vm0 vm0Var2 : arrayList) {
                if (vm0Var2.f166849a) {
                    largeActionButton2.setIcon(data.f166696b.f166540b);
                }
                if (vm0Var2.f166850b) {
                    largeActionButton2.setText(data.f166696b.f166541c);
                }
                if (vm0Var2.f166851c) {
                    largeActionButton2.o(data.f166696b.f166539a);
                }
                if (vm0Var2.d) {
                    largeActionButton2.setEnabled(data.f166696b.d);
                }
                if (vm0Var2.e) {
                    largeActionButton2.setTag(data.f166696b.e);
                }
                if (vm0Var2.f) {
                    largeActionButton.setIcon(data.f166697c.f166540b);
                }
                if (vm0Var2.f166852g) {
                    largeActionButton.setText(data.f166697c.f166541c);
                }
                if (vm0Var2.f166853h) {
                    largeActionButton.o(data.f166697c.f166539a);
                }
                if (vm0Var2.i) {
                    largeActionButton.setEnabled(data.f166697c.d);
                }
                if (vm0Var2.f166854j) {
                    largeActionButton.setTag(data.f166697c.e);
                }
            }
        }
        largeActionButton2.setAnalyticsContext(data.e);
        largeActionButton.setAnalyticsContext(data.f);
        efm.r map = largeActionButton2.o.map(new fg0(new sm0(data, 0), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53572c.a(map, holder);
        efm.r map2 = largeActionButton.o.map(new fg0(new sm0(data, 1), 17));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
