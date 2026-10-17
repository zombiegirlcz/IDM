package wt0;

import ah0.e;
import ai0.k;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import mx0.q9;
import mx0.r9;
import mx0.s9;
import mx0.u9;
import mx0.v9;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f299758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f299759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f299760c;
    public volatile u9 d;

    public a(k map, v9 boundariesSupplier, v9 cameraUpdatesSupplier) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(boundariesSupplier, "boundariesSupplier");
        Intrinsics.checkNotNullParameter(cameraUpdatesSupplier, "cameraUpdatesSupplier");
        this.f299758a = map;
        this.f299759b = boundariesSupplier;
        this.f299760c = cameraUpdatesSupplier;
    }

    @Override // ah0.e
    public final void onCameraIdle() {
        if (this.d != null) {
            v9 v9Var = this.f299760c;
            r9 r9Var = r9.IDLE;
            u9 u9Var = this.d;
            if (u9Var == null) {
                Intrinsics.r("reasonForBoundariesUpdate");
                throw null;
            }
            v9Var.invoke(new s9(r9Var, u9Var));
            Projection internal = this.f299758a.f5155a.getProjection();
            Intrinsics.checkNotNullExpressionValue(internal, "getProjection(...)");
            Intrinsics.checkNotNullParameter(internal, "<this>");
            Intrinsics.checkNotNullParameter(internal, "internal");
            VisibleRegion visibleRegion = internal.getVisibleRegion();
            Intrinsics.checkNotNullExpressionValue(visibleRegion, "getVisibleRegion(...)");
            Intrinsics.checkNotNullParameter(visibleRegion, "<this>");
            LatLng farLeft = visibleRegion.farLeft;
            Intrinsics.checkNotNullExpressionValue(farLeft, "farLeft");
            ah0.a farLeft2 = l.L(farLeft);
            LatLng farRight = visibleRegion.farRight;
            Intrinsics.checkNotNullExpressionValue(farRight, "farRight");
            ah0.a farRight2 = l.L(farRight);
            LatLng nearLeft = visibleRegion.nearLeft;
            Intrinsics.checkNotNullExpressionValue(nearLeft, "nearLeft");
            ah0.a nearLeft2 = l.L(nearLeft);
            LatLng nearRight = visibleRegion.nearRight;
            Intrinsics.checkNotNullExpressionValue(nearRight, "nearRight");
            ah0.a nearRight2 = l.L(nearRight);
            LatLngBounds latLngBounds = visibleRegion.latLngBounds;
            Intrinsics.checkNotNullExpressionValue(latLngBounds, "latLngBounds");
            GmsLatLngBounds latLngBounds2 = new GmsLatLngBounds(latLngBounds);
            Intrinsics.checkNotNullParameter(farLeft2, "farLeft");
            Intrinsics.checkNotNullParameter(farRight2, "farRight");
            Intrinsics.checkNotNullParameter(nearLeft2, "nearLeft");
            Intrinsics.checkNotNullParameter(nearRight2, "nearRight");
            Intrinsics.checkNotNullParameter(latLngBounds2, "latLngBounds");
            v9 v9Var2 = this.f299759b;
            u9 u9Var2 = this.d;
            if (u9Var2 != null) {
                v9Var2.invoke(new q9(latLngBounds2, u9Var2));
            } else {
                Intrinsics.r("reasonForBoundariesUpdate");
                throw null;
            }
        }
    }
}
