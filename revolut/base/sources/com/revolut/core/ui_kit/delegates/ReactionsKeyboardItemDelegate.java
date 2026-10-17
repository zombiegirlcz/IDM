package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e70;
import ip0.t90;
import ip0.u90;
import ip0.v90;
import ip0.w90;
import ip0.ws;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ReactionsKeyboardItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/u90;", "Lip0/w90;", "<init>", "()V", "Companion", "ip0/v90", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsKeyboardItemDelegate extends BaseRecyclerViewDelegate<u90, w90> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53148c;

    public ReactionsKeyboardItemDelegate() {
        super(-1, new t90(0));
        this.f53148c = yhm.j.c(yhm.k.NONE, new e70(2));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        lu0.u uVar = new lu0.u(context, null);
        uVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        uVar.setScaleType(ImageView.ScaleType.FIT_XY);
        return new w90(uVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(w90 holder, u90 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        lu0.u uVar = holder.f166965g;
        if (payloads.isEmpty()) {
            uVar.setRatio(((double) data.f166635c) / ((double) data.f166634b));
            holder.F(data.d);
            holder.H(data.e);
            yy0.f.e(or0.u.k(uVar).Q(), data.f166633a, holder.f166965g, null, null, 12);
        } else {
            ArrayList<v90> arrayList = new ArrayList();
            for (Object obj2 : payloads) {
                if (obj2 instanceof v90) {
                    arrayList.add(obj2);
                }
            }
            for (v90 v90Var : arrayList) {
                if (v90Var.f166794a) {
                    uVar.setRatio(((double) data.f166635c) / ((double) data.f166634b));
                }
                if (v90Var.f166796c) {
                    holder.F(data.d);
                }
                if (v90Var.d) {
                    holder.H(data.e);
                }
                if (v90Var.f166795b) {
                    yy0.f.e(or0.u.k(uVar).Q(), data.f166633a, holder.f166965g, null, null, 12);
                }
            }
        }
        holder.f.setOnClickListener(new ws(this, data, 19));
    }
}
