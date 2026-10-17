package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.customview.poolingcontainer.PoolingContainer;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.nw;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y8 extends koi.b implements ix0.d2, vr0.b {
    public final ix0.f2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f55627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f55628h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f55629j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f55630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ai0.r f55631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f55632n;
    public ai0.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ai0.e f55633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public vr0.d f55634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MapPlainDelegate.c f55635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MapPlainDelegate.b f55636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f55637t;
    public final /* synthetic */ MapPlainDelegate u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(View itemView, MapPlainDelegate mapPlainDelegate) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.u = mapPlainDelegate;
        tw0.r rVar = new tw0.r(this);
        this.f = new ix0.f2(itemView, this);
        this.f55627g = te0.w.y0(new au0.z3(itemView, 7));
        this.f55628h = te0.w.y0(new au0.z3(itemView, 8));
        this.i = te0.w.y0(new au0.z3(itemView, 9));
        this.f55629j = te0.w.y0(new au0.z3(itemView, 10));
        this.k = te0.w.y0(new au0.z3(itemView, 11));
        PoolingContainer.addPoolingContainerListener(itemView, new nw(this, 1));
        ie7.a action = new ie7.a(this, 13);
        Intrinsics.checkNotNullParameter(action, "action");
        LinkedList linkedList = rVar.e;
        linkedList.add(action);
        if (!rVar.f274869c || rVar.f) {
            return;
        }
        Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            ((Function0) it8.next()).invoke();
        }
        linkedList.clear();
    }

    @Override // ix0.d2
    public final void D(boolean z) {
        ai0.r rVar = this.f55631m;
        if (rVar == null) {
            return;
        }
        if (!z) {
            rVar.onPause();
            rVar.onStop();
            return;
        }
        if (this.f55632n) {
            this.f55632n = false;
            View viewA = i26.l.a(rVar, null);
            if (viewA != null) {
                F().addView(viewA);
            }
        }
        rVar.onStart();
        rVar.onResume();
        if (this.f55630l) {
            vr0.d dVar = this.f55634q;
            if (dVar != null) {
                dVar.d();
            } else {
                Intrinsics.r("markersRenderer");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final FrameLayout F() {
        Object value = this.f55627g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void H(MapPlainDelegate.b mapConfig) {
        MapPlainDelegate mapPlainDelegate = this.u;
        ?? r110 = mapPlainDelegate.f52770h;
        Intrinsics.checkNotNullParameter(mapConfig, "mapConfig");
        this.f55636s = mapConfig;
        if (this.f55630l) {
            if (mapConfig instanceof a9) {
                ai0.k kVar = this.o;
                if (kVar == null) {
                    Intrinsics.r("map");
                    throw null;
                }
                ai0.l lVar = (ai0.l) r110.getValue();
                a9 a9Var = (a9) mapConfig;
                ah0.a aVar = new ah0.a(a9Var.f53671b, a9Var.f53672c);
                float f = a9Var.f53670a;
                lVar.getClass();
                kVar.a(ai0.l.b(aVar, f));
                return;
            }
            if (!(mapConfig instanceof z8)) {
                throw new NoWhenBranchMatchedException();
            }
            ai0.k kVar2 = this.o;
            if (kVar2 == null) {
                Intrinsics.r("map");
                throw null;
            }
            ai0.l lVar2 = (ai0.l) r110.getValue();
            z8 z8Var = (z8) mapConfig;
            GmsLatLngBounds gmsLatLngBoundsA = ((com.revolut.core.mobile_services.impl.map.a) ((ah0.c) mapPlainDelegate.f52772l.getValue())).a(new ah0.a(z8Var.d, z8Var.f55682b), new ah0.a(z8Var.f55683c, z8Var.f55681a));
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 8.0f);
            lVar2.getClass();
            kVar2.a(ai0.l.a(gmsLatLngBoundsA, iK));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(com.revolut.core.ui_kit.delegates.MapPlainDelegate.c r15) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.y8.I(com.revolut.core.ui_kit.delegates.MapPlainDelegate$c):void");
    }

    public final void J(boolean z) {
        this.f55637t = z;
        if (this.f55630l) {
            try {
                ai0.k kVar = this.o;
                if (kVar != null) {
                    kVar.f5155a.setMyLocationEnabled(z);
                } else {
                    Intrinsics.r("map");
                    throw null;
                }
            } catch (SecurityException e) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
    }

    @Override // vr0.b
    public final void p(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        MapPlainDelegate.c cVar = this.f55635r;
        b9 b9Var = cVar instanceof b9 ? (b9) cVar : null;
        List<yv0.i> list = b9Var != null ? b9Var.f53716a : null;
        if (list != null) {
            for (yv0.i iVar : list) {
                if (Intrinsics.f(iVar.f317072b.getImage(), image)) {
                    ai0.e eVar = this.f55633p;
                    if (eVar == null) {
                        Intrinsics.r("clusterManager");
                        throw null;
                    }
                    eVar.d(iVar);
                    ai0.e eVar2 = this.f55633p;
                    if (eVar2 == null) {
                        Intrinsics.r("clusterManager");
                        throw null;
                    }
                    eVar2.a(iVar);
                }
            }
        }
        ai0.e eVar3 = this.f55633p;
        if (eVar3 == null) {
            Intrinsics.r("clusterManager");
            throw null;
        }
        eVar3.c();
    }
}
