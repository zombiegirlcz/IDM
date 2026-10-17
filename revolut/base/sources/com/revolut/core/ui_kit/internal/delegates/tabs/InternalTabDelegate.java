package com.revolut.core.ui_kit.internal.delegates.tabs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import aqd.h1;
import ar0.b;
import ar0.d;
import ar0.e;
import ar0.f;
import ar0.g;
import ar0.h;
import ar0.i;
import com.revolut.core.ui_kit.R$anim;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.r;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit.views.u;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mx0.i5;
import mx0.l5;
import yy0.j;
import yy0.l;
import zi0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0004\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/tabs/InternalTabDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lar0/e;", "Lar0/h;", "ar0/f", "ar0/g", "ar0/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternalTabDelegate extends BaseRecyclerViewDelegate<e, h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i5 f55880c;
    public final l5 d;
    public final i5 e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalTabDelegate(i5 onTouch, l5 onRelease, i5 onDeleteClick) {
        super(R$layout.internal_delegate_tab, new h1(3));
        Intrinsics.checkNotNullParameter(onTouch, "onTouch");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        this.f55880c = onTouch;
        this.d = onRelease;
        this.e = onDeleteClick;
        this.f = true;
    }

    public static void p(e eVar, h hVar) {
        if (!eVar.d) {
            hVar.itemView.clearAnimation();
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(hVar.itemView.getContext(), R$anim.internal_shake_tab_animation);
        hVar.itemView.setAnimation(animationLoadAnimation);
        animationLoadAnimation.start();
    }

    public static void q(e eVar, h hVar) {
        Context context = hVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = eVar.f8487g + a.w(R$attr.uikit_dp16, context);
        hVar.f8493g.setPadding(iW, 0, iW, 0);
        float f = iW;
        hVar.k.setTranslationX(f);
        hVar.f8496l.setTranslationX(f);
    }

    public static void r(e eVar, h hVar) {
        Context context = hVar.itemView.getContext();
        g gVar = eVar.f8485b;
        Intrinsics.h(context);
        int iS = a.s(gVar.f8491a, context);
        hVar.f8495j.setTextColor(iS);
        rd0.e.q(hVar.f8494h, Integer.valueOf(iS));
        rd0.e.q(hVar.i, Integer.valueOf(iS));
        hVar.f8493g.setBackgroundResource(gVar.f8492b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static void s(e eVar, h hVar) {
        Tabs.c cVar = eVar.f8486c.f59616c;
        if (cVar instanceof t) {
            v(hVar, ((t) cVar).f59744a);
            u(hVar, null);
            t(hVar, null);
            return;
        }
        if (cVar instanceof r) {
            v(hVar, null);
            u(hVar, ((r) cVar).f59617a);
            t(hVar, null);
            return;
        }
        if (!(cVar instanceof u)) {
            if (!(cVar instanceof Tabs.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            v(hVar, null);
            u(hVar, null);
            t(hVar, null);
            return;
        }
        u uVar = (u) cVar;
        j jVar = uVar.f59746b;
        v(hVar, uVar.f59745a);
        int i = i.f8497a[uVar.f59747c.ordinal()];
        if (i == 1) {
            u(hVar, jVar);
            t(hVar, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            u(hVar, null);
            t(hVar, jVar);
        }
    }

    public static void t(h hVar, j jVar) {
        c.h(hVar.i, jVar, true, new b(1), false);
    }

    public static void u(h hVar, l lVar) {
        c.h(hVar.f8494h, lVar, true, new b(0), false);
    }

    public static void v(h hVar, Clause clause) {
        View view = hVar.itemView;
        ty0.c.b(h30.l.x(view, "itemView", view), clause, hVar.f8495j, null, null, 12);
        hVar.f8495j.setVisibility(clause != null ? 0 : 8);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new h(s.r(parent, R$layout.internal_delegate_tab), this.f);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof h) {
            View itemView = holder.itemView;
            if (itemView instanceof ViewGroup) {
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                hx7.i.b(itemView);
                h hVar = (h) holder;
                hx7.i.b(hVar.f8493g);
                Object tag2 = hVar.f8496l.getTag();
                d dVar = tag2 instanceof d ? (d) tag2 : null;
                if (dVar != null) {
                    dVar.d.f8496l.removeCallbacks(dVar.f);
                }
            }
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void p(h holder, e data, int i, List payloads) {
        h hVar;
        e eVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.k;
        View view2 = holder.f8496l;
        Object tag2 = view2.getTag();
        d dVar = tag2 instanceof d ? (d) tag2 : null;
        if (dVar != null) {
            dVar.d.f8496l.removeCallbacks(dVar.f);
        }
        boolean z = data.f;
        if (z) {
            hVar = holder;
            eVar = data;
            d dVar2 = new d(this.f55880c, this.d, this.e, hVar, eVar);
            view2.setOnTouchListener(dVar2);
            view2.setTag(dVar2);
        } else {
            hVar = holder;
            eVar = data;
        }
        ArrayList<f> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof f) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            s(eVar, hVar);
            r(eVar, hVar);
            p(eVar, hVar);
            q(eVar, hVar);
            int i2 = z ? 0 : 8;
            view.setVisibility(i2);
            view2.setVisibility(i2);
            hVar.itemView.setOnTouchListener(new ar0.a(this, hVar, 0));
            return;
        }
        for (f fVar : arrayList) {
            if (fVar.f8489b) {
                s(eVar, hVar);
            }
            if (fVar.f8488a) {
                r(eVar, hVar);
            }
            if (fVar.d) {
                r(eVar, hVar);
            }
            if (fVar.f8490c) {
                p(eVar, hVar);
            }
            if (fVar.f) {
                q(eVar, hVar);
            }
            if (fVar.e) {
                int i3 = z ? 0 : 8;
                view.setVisibility(i3);
                view2.setVisibility(i3);
            }
        }
    }
}
