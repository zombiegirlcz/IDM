package com.revolut.core.ui_kit.delegates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.internal.views.ScratchView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.bc0;
import ip0.cc0;
import ip0.e30;
import ip0.t90;
import ip0.w10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ScratchTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/cg;", "Lip0/cc0;", "<init>", "()V", "ip0/bc0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScratchTileDelegate extends BaseRecyclerViewDelegate<cg, cc0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53276c;
    public final BigTileDelegate d;

    public ScratchTileDelegate() {
        super(R$layout.internal_delegate_scratch_tile, new t90(18));
        this.f53276c = new e01.a();
        this.d = new BigTileDelegate();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f98535a, parent, false);
        Intrinsics.h(viewInflate);
        this.d.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        cc0 cc0Var = new cc0(viewInflate, new ip0.t4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_big_tile)));
        cc0Var.f163717g.addView(cc0Var.f.itemView);
        return cc0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(cc0 holder, cg data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        BigTileDelegate.Model model = data.f53753b;
        LayeredImage layeredImage = data.f53752a;
        model.j(data.f53754c);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof bc0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Object obj3 = ((bc0) it8.next()).f163580a;
            if (obj3 != null) {
                arrayList2.add(obj3);
            }
        }
        this.d.p(holder.f, data.f53753b, i, arrayList2);
        ScratchView scratchView = holder.f163718h;
        efm.i flowable = scratchView.f56371r.observeOn(hhm.f.f152430b).toFlowable(efm.a.LATEST);
        ms0.j0 j0Var = new ms0.j0(new mqi.a(scratchView, 4), 13);
        flowable.getClass();
        j01.b bVar = new j01.b(new qfm.j1(flowable, j0Var, 0), 7);
        efm.c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        efm.r rVarObserveOn = bVar.observeOn(c0Var);
        Intrinsics.checkNotNullExpressionValue(rVarObserveOn, "observeOn(...)");
        efm.r rVarTake = rVarObserveOn.filter(new e30(new ip0.za(17), 16)).take(1L);
        Intrinsics.checkNotNullExpressionValue(rVarTake, "take(...)");
        efm.r rVarSwitchMap = rVarTake.switchMap(new e30(new w10(holder, 11), 17));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        this.f53276c.a(rVarSwitchMap, holder);
        if (arrayList.isEmpty()) {
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), layeredImage, holder.f163718h, null, null, 12);
            return;
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            if (((bc0) it9.next()).f163581b) {
                View view2 = holder.itemView;
                yy0.f.e(h30.l.z(view2, "itemView", view2), layeredImage, holder.f163718h, null, null, 12);
            }
        }
    }
}
