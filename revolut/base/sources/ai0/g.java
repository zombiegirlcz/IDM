package ai0;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.BubbleTooltipView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.o2;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends tg.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vr0.d f5150s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, k gmsMap, e clusterManager, vr0.d msRenderer) {
        super(context, gmsMap.f5155a, clusterManager.f5147a);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gmsMap, "gmsMap");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        Intrinsics.checkNotNullParameter(msRenderer, "msRenderer");
        this.f5150s = msRenderer;
    }

    @Override // tg.m
    public final void d(d clusterItem, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(clusterItem, "clusterItem");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        yv0.k clusterItem2 = clusterItem.f5146a;
        Intrinsics.i(clusterItem2, "null cannot be cast to non-null type T of com.revolut.core.mobile_services.impl.map.GmsClusterRenderer");
        Intrinsics.checkNotNullParameter(markerOptions, "<this>");
        o7.d markerOptions2 = new o7.d(markerOptions);
        vr0.d dVar = this.f5150s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(clusterItem2, "clusterItem");
        Intrinsics.checkNotNullParameter(markerOptions2, "markerOptions");
        if (clusterItem2 instanceof yv0.i) {
            vr0.c cVarB = dVar.b((yv0.i) clusterItem2);
            markerOptions2.l(cVarB.f291449a);
            markerOptions.anchor(cVarB.f291450b, cVarB.f291451c);
        } else {
            if (!(clusterItem2 instanceof yv0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            yv0.l lVar = (yv0.l) clusterItem2;
            Clause clause = lVar.f317079a;
            o2 o2Var = lVar.f317080b;
            BubbleTooltipView bubbleTooltipView = (BubbleTooltipView) dVar.f.getValue();
            bubbleTooltipView.setText(clause);
            bubbleTooltipView.f0(o2Var);
            Bitmap bitmapJ = ((h) dVar.i.getValue()).f5151a.j();
            Intrinsics.checkNotNullExpressionValue(bitmapJ, "makeIcon(...)");
            markerOptions2.l(b.a(bitmapJ));
            markerOptions.zIndex(lVar.d.floatValue());
        }
    }

    @Override // tg.m
    public final void e(rg.a cluster, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        Intrinsics.checkNotNullParameter(cluster, "<this>");
        i4b.f cluster2 = new i4b.f(cluster);
        Intrinsics.checkNotNullParameter(markerOptions, "<this>");
        o7.d markerOptions2 = new o7.d(markerOptions);
        vr0.d dVar = this.f5150s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(cluster2, "cluster");
        Intrinsics.checkNotNullParameter(markerOptions2, "markerOptions");
        vr0.c cVarA = dVar.a(cluster2);
        markerOptions2.l(cVarA.f291449a);
        markerOptions.anchor(cVarA.f291450b, 1.0f);
    }

    @Override // tg.m
    public final void f(d clusterItem, Marker marker) {
        Intrinsics.checkNotNullParameter(clusterItem, "clusterItem");
        Intrinsics.checkNotNullParameter(marker, "marker");
        yv0.k clusterItem2 = clusterItem.f5146a;
        Intrinsics.i(clusterItem2, "null cannot be cast to non-null type T of com.revolut.core.mobile_services.impl.map.GmsClusterRenderer");
        t marker2 = new t(marker);
        vr0.d dVar = this.f5150s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(clusterItem2, "clusterItem");
        Intrinsics.checkNotNullParameter(marker2, "marker");
        if (clusterItem2 instanceof yv0.i) {
            vr0.c cVarB = dVar.b((yv0.i) clusterItem2);
            marker2.a(cVarB.f291449a);
            marker.setAnchor(cVarB.f291450b, cVarB.f291451c);
        } else {
            if (!(clusterItem2 instanceof yv0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            yv0.l lVar = (yv0.l) clusterItem2;
            Clause clause = lVar.f317079a;
            o2 o2Var = lVar.f317080b;
            BubbleTooltipView bubbleTooltipView = (BubbleTooltipView) dVar.f.getValue();
            bubbleTooltipView.setText(clause);
            bubbleTooltipView.f0(o2Var);
            Bitmap bitmapJ = ((h) dVar.i.getValue()).f5151a.j();
            Intrinsics.checkNotNullExpressionValue(bitmapJ, "makeIcon(...)");
            marker2.a(b.a(bitmapJ));
            marker.setZIndex(lVar.d.floatValue());
        }
    }

    @Override // tg.m
    public final void g(rg.a cluster, Marker marker) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(cluster, "<this>");
        i4b.f cluster2 = new i4b.f(cluster);
        Intrinsics.checkNotNullParameter(marker, "<this>");
        t marker2 = new t(marker);
        vr0.d dVar = this.f5150s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(cluster2, "cluster");
        Intrinsics.checkNotNullParameter(marker2, "marker");
        vr0.c cVarA = dVar.a(cluster2);
        marker2.a(cVarA.f291449a);
        marker.setAnchor(cVarA.f291450b, 1.0f);
    }

    @Override // tg.m
    public final boolean h(rg.a cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(cluster, "<this>");
        i4b.f cluster2 = new i4b.f(cluster);
        vr0.d dVar = this.f5150s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(cluster2, "cluster");
        return dVar.f291459m && cluster.getSize() > 1;
    }
}
