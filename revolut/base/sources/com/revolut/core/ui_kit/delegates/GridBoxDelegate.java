package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.wk;
import ip0.xk;
import ip0.yk;
import ip0.zk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0005\u0006\u0002\u0007\u0003¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/GridBoxDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/xk;", "Lip0/zk;", "Companion", "ip0/yk", "a", "ip0/al", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridBoxDelegate extends BaseRecyclerViewDelegate<xk, zk> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f52387c;
    public final int d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f52388g;

    public /* synthetic */ GridBoxDelegate(List list, int i, float f, float f4, int i2) {
        this(list, (i2 & 4) != 0 ? 16.0f : f, (i2 & 8) != 0 ? BitmapDescriptorFactory.HUE_RED : f4, (i2 & 2) != 0 ? 4 : i);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new zk(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_grid_box), this.f52387c, this.d, this.e, this.f);
    }

    public final void p(zk zkVar, xk xkVar) {
        List items = xkVar.f167179b;
        List list = items;
        if ((list instanceof Collection) && list.isEmpty()) {
            zkVar.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            zkVar.f167481l.c(items);
            zkVar.f167480j.invalidateItemDecorations();
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!(((koi.j) it8.next()) instanceof qv0.i)) {
                    zkVar.getClass();
                    Intrinsics.checkNotNullParameter(items, "items");
                    zkVar.f167481l.c(items);
                    break;
                }
            }
            zkVar.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            zkVar.f167481l.c(items);
            zkVar.f167480j.invalidateItemDecorations();
        }
        xv0.w wVar = new xv0.w(new ip0.za(5), new wk(this, xkVar.f167178a, 0));
        xv0.w wVar2 = zkVar.f167483n;
        if (wVar2 != null) {
            wVar2.c();
        }
        zkVar.f167483n = wVar;
        wVar.b(zkVar.f167480j);
    }

    public final void q(boolean z, xk xkVar, zk zkVar) {
        View view = zkVar.itemView;
        View view2 = zkVar.k;
        RecyclerView recyclerView = zkVar.f167480j;
        Context context = view.getContext();
        float f = z ? BitmapDescriptorFactory.HUE_RED : 8.0f;
        Intrinsics.h(context);
        int iK = kli.a.k(context, f);
        if (z) {
            qv0.c cVar = xkVar.f167188q;
            int i = ((cVar instanceof c.f) || (cVar instanceof c.e)) ? iK : 0;
            recyclerView.setPadding(0, 0, 0, 0);
            recyclerView.getContext().setTheme(R$style.internal_GrayWidgetBackgroundTheme);
            view2.setPadding(iK, i, iK, iK);
        } else {
            int iK2 = kli.a.k(context, 12.0f);
            recyclerView.setPadding(iK2, 0, iK2, 0);
            view2.setPadding(0, 0, 0, 0);
            recyclerView.getContext().setTheme(R$style.internal_EmptyTheme);
        }
        Context context2 = zkVar.itemView.getContext();
        qv0.c cVar2 = xkVar.f167188q;
        qv0.c cVar3 = c.d.f249513a;
        if (z) {
            cVar3 = cVar2;
            cVar2 = cVar3;
        }
        qv0.k kVar = qv0.k.OutOfGroup;
        Intrinsics.h(context2);
        view2.setBackground(dr0.b.b(cVar3, kVar, context2, false, null, 48));
        or0.b.j(this, cVar3, view2);
        View itemView = zkVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.b(this, cVar2, itemView, false, context2, null, null, 48);
        or0.b.o(this, xkVar, view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(zk holder, xk data, int i, List payloads) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.k;
        if (payloads != null) {
            arrayList = new ArrayList();
            for (Object obj2 : payloads) {
                if (obj2 instanceof yk) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        Integer num = data.f167180c;
        int iIntValue = num != null ? num.intValue() : this.d;
        Float f = data.e;
        float fFloatValue = f != null ? f.floatValue() : this.e;
        Float f4 = data.d;
        float fFloatValue2 = f4 != null ? f4.floatValue() : this.f;
        boolean z = data.f;
        RecyclerView recyclerView = holder.f167480j;
        List delegates = this.f52387c;
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        if (holder.f != delegates) {
            holder.f = delegates;
            z4l.j jVar = new z4l.j(7, delegates, false);
            holder.f167481l = jVar;
            recyclerView.setAdapter(jVar);
        }
        if (holder.f167478g != iIntValue || holder.f167482m != z) {
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.setLayoutManager(new AdaptiveGridLayoutManager(context, iIntValue, z));
            holder.f167478g = iIntValue;
            holder.f167482m = z;
        }
        if (holder.f167479h != fFloatValue || holder.i != fFloatValue2) {
            holder.f167479h = fFloatValue;
            holder.i = fFloatValue2;
            while (recyclerView.getItemDecorationCount() > 0) {
                recyclerView.removeItemDecorationAt(0);
            }
            recyclerView.addItemDecoration(new tw0.b(com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", fFloatValue2), com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", fFloatValue), 12));
        }
        boolean z3 = !(data.f167188q instanceof c.d);
        if (arrayList.isEmpty()) {
            p(holder, data);
            q(z3, data, holder);
        } else {
            for (yk ykVar : (Iterable) arrayList) {
                if (ykVar.f167326a) {
                    p(holder, data);
                }
                if (ykVar.f167327b) {
                    q(z3, data, holder);
                }
            }
        }
        AnimationRequest animationRequest = data.f167181g;
        if (animationRequest == null || animationRequest.f57724a) {
            if (animationRequest == null) {
                jr0.g.Companion.getClass();
                jr0.f.a(view).a();
                return;
            }
            return;
        }
        animationRequest.f57724a = true;
        jr0.f fVar = jr0.g.Companion;
        fVar.getClass();
        jr0.f.a(view).a();
        fVar.getClass();
        jr0.f.a(view).c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridBoxDelegate(List delegates, float f, float f4, int i) {
        super(R$layout.internal_delegate_grid_box, new dk(4));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f52387c = delegates;
        this.d = i;
        this.e = f;
        this.f = f4;
        this.f52388g = v0.a.d("create(...)");
    }
}
