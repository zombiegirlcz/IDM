package tg;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements GoogleMap.OnMarkerClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f271000a;

    public a(m mVar) {
        this.f271000a = mVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        m mVar = this.f271000a;
        aed.f fVar = mVar.f271037p;
        if (fVar == null) {
            return false;
        }
        ai0.d dVar = (ai0.d) ((HashMap) mVar.i.f264433b).get(marker);
        com.onfido.android.sdk.capture.internal.service.a aVar = (com.onfido.android.sdk.capture.internal.service.a) fVar.f3534b;
        yv0.k it8 = dVar.f5146a;
        Intrinsics.i(it8, "null cannot be cast to non-null type T of com.revolut.core.mobile_services.impl.map.GmsClusterManager");
        a7 a7Var = (a7) aVar.f49960b;
        boolean z = aVar.f49959a;
        Intrinsics.checkNotNullParameter(it8, "it");
        a7Var.invoke(it8);
        return z;
    }
}
