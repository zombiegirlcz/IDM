package ip0;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.UiSettings;
import com.revolut.core.ui_kit.R$raw;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class xw implements ah0.h, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.y8 f167221a;

    public xw(com.revolut.core.ui_kit.delegates.y8 y8Var) {
        this.f167221a = y8Var;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ah0.h
    public final void a(ai0.k p0) {
        GoogleMap googleMap = p0.f5155a;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.core.ui_kit.delegates.y8 y8Var = this.f167221a;
        y8Var.o = p0;
        Context context = y8Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MapPlainDelegate mapPlainDelegate = y8Var.u;
        th0.b bVar = mapPlainDelegate.e;
        if (bVar == null) {
            Intrinsics.r("mapServices");
            throw null;
        }
        y8Var.f55634q = new vr0.d(context, bVar, y8Var);
        ai0.f fVar = (ai0.f) mapPlainDelegate.f52773m.getValue();
        Context context2 = y8Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        fVar.getClass();
        ai0.e eVarA = ai0.f.a(context2, p0);
        y8Var.f55633p = eVarA;
        vr0.d dVar = y8Var.f55634q;
        if (dVar == null) {
            Intrinsics.r("markersRenderer");
            throw null;
        }
        eVarA.e(dVar);
        ai0.e listener = y8Var.f55633p;
        if (listener == null) {
            Intrinsics.r("clusterManager");
            throw null;
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        googleMap.setOnCameraIdleListener(new ai0.i(listener));
        ai0.e listener2 = y8Var.f55633p;
        if (listener2 == null) {
            Intrinsics.r("clusterManager");
            throw null;
        }
        Intrinsics.checkNotNullParameter(listener2, "listener");
        googleMap.setOnMarkerClickListener(new aed.f(listener2, 29));
        y8Var.f55630l = true;
        try {
            ai0.m mVar = (ai0.m) mapPlainDelegate.f.getValue();
            Context context3 = y8Var.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            mVar.getClass();
            Intrinsics.checkNotNullParameter(context3, "context");
            MapsInitializer.initialize(context3);
            p0.d(ah0.f.NORMAL);
            ((UiSettings) p0.b().f5156a).setMapToolbarEnabled(false);
            ai0.p pVar = (ai0.p) mapPlainDelegate.f52769g.getValue();
            Context context4 = y8Var.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            int i = R$raw.uikit_common_map_style;
            pVar.getClass();
            p0.c(ai0.p.a(i, context4));
            y8Var.J(y8Var.f55637t);
            MapPlainDelegate.b bVar2 = y8Var.f55636s;
            if (bVar2 != null) {
                y8Var.H(bVar2);
            }
            MapPlainDelegate.c cVar = y8Var.f55635r;
            if (cVar != null) {
                y8Var.I(cVar);
            }
        } catch (Exception e) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            y8Var.F().setVisibility(8);
        }
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof ah0.h) && (obj2 instanceof kotlin.jvm.internal.n)) {
            return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.q(1, 0, com.revolut.core.ui_kit.delegates.y8.class, this.f167221a, "onMapReady", "onMapReady(Lcom/revolut/core/mobile_services/api/map/MsMap;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
