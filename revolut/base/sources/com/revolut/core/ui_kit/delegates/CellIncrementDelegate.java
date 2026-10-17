package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.views.TwoTextSwitcherView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellIncrementDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/u8;", "Lip0/w8;", "<init>", "()V", "ip0/v8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellIncrementDelegate extends BaseRecyclerViewDelegate<ip0.u8, ip0.w8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51948c;
    public final ihm.f d;

    public CellIncrementDelegate() {
        super(R$layout.internal_delegate_cell_increment, new ip0.h8(6));
        this.f51948c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.w8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_increment));
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.revolut.core.ui_kit_core.displayers.image.Image, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.w8 holder, final ip0.u8 data, int i, List list) {
        final CellIncrementDelegate cellIncrementDelegate;
        int i2;
        int i3;
        String str;
        int i5;
        CellIncrementDelegate cellIncrementDelegate2 = this;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TwoTextSwitcherView twoTextSwitcherView = holder.i;
        TextView textView = holder.f166950h;
        TextView textView2 = holder.f166949g;
        ImageView imageView = holder.f;
        SmallActionButton smallActionButton = holder.k;
        SmallActionButton smallActionButton2 = holder.f166951j;
        ?? r152 = 0;
        String str2 = "itemView";
        int i6 = 0;
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            cellIncrementDelegate = this;
            or0.b.c(cellIncrementDelegate, data, itemView, false, null, 28);
            data.getClass();
            or0.b.f(cellIncrementDelegate, null, imageView);
            or0.b.e(cellIncrementDelegate, data.f166618b, textView2, null, 12);
            or0.b.e(cellIncrementDelegate, data.f166619c, textView, null, 12);
            twoTextSwitcherView.setModel(new mx0.yc(data.d, false));
            smallActionButton2.i(data.f166620g);
            smallActionButton2.setIcon(data.e);
            smallActionButton2.setText(null);
            smallActionButton.i(data.f166621h);
            smallActionButton.setIcon(data.f);
            smallActionButton.setText(null);
            smallActionButton2.setEnabled(data.i);
            smallActionButton.setEnabled(data.f166622j);
        } else {
            int size = payloads.size();
            while (i6 < size) {
                Object obj2 = payloads.get(i6);
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CellIncrementDelegate.Payload");
                ip0.v8 v8Var = (ip0.v8) obj2;
                if (v8Var.f166781a) {
                    data.getClass();
                    or0.b.f(cellIncrementDelegate2, r152, imageView);
                }
                if (v8Var.f166782b) {
                    i2 = size;
                    i3 = 12;
                    or0.b.e(cellIncrementDelegate2, data.f166618b, textView2, r152, 12);
                } else {
                    i2 = size;
                    i3 = 12;
                }
                if (v8Var.f166783c) {
                    or0.b.e(cellIncrementDelegate2, data.f166619c, textView, r152, i3);
                }
                if (v8Var.d) {
                    twoTextSwitcherView.setModel(new mx0.yc(data.d, true));
                }
                if (v8Var.i) {
                    View view = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, str2);
                    i5 = i6;
                    str = str2;
                    or0.b.c(cellIncrementDelegate2, data, view, false, null, 28);
                } else {
                    str = str2;
                    i5 = i6;
                }
                if (v8Var.e) {
                    smallActionButton2.i(data.f166620g);
                }
                if (v8Var.f) {
                    smallActionButton.i(data.f166621h);
                }
                if (v8Var.f166784g) {
                    smallActionButton2.setIcon(data.e);
                }
                if (v8Var.f166785h) {
                    smallActionButton.setIcon(data.f);
                }
                if (v8Var.f166786j) {
                    smallActionButton2.setEnabled(data.i);
                }
                if (v8Var.k) {
                    smallActionButton.setEnabled(data.f166622j);
                }
                i6 = i5 + 1;
                r152 = 0;
                cellIncrementDelegate2 = this;
                str2 = str;
                size = i2;
                payloads = list;
            }
            cellIncrementDelegate = this;
        }
        final int i21 = 0;
        smallActionButton2.setOnClickListener(new View.OnClickListener(cellIncrementDelegate) { // from class: ip0.t8

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CellIncrementDelegate f166476b;

            {
                this.f166476b = cellIncrementDelegate;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i21) {
                    case 0:
                        this.f166476b.f51948c.onNext(data);
                        break;
                    default:
                        this.f166476b.d.onNext(data);
                        break;
                }
            }
        });
        final int i22 = 1;
        smallActionButton.setOnClickListener(new View.OnClickListener(cellIncrementDelegate) { // from class: ip0.t8

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CellIncrementDelegate f166476b;

            {
                this.f166476b = cellIncrementDelegate;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i22) {
                    case 0:
                        this.f166476b.f51948c.onNext(data);
                        break;
                    default:
                        this.f166476b.d.onNext(data);
                        break;
                }
            }
        });
    }
}
