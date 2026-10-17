package kjd;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.map_view.e f184397b;

    public /* synthetic */ n(com.revolut.feature.shops.impl.ui.map_view.e eVar, int i) {
        this.f184396a = i;
        this.f184397b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f184396a) {
            case 0:
                com.revolut.feature.shops.impl.ui.map_view.b update = (com.revolut.feature.shops.impl.ui.map_view.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return com.revolut.feature.shops.impl.ui.map_view.b.a(update, new jid.r(this.f184397b.f87237s.f87220a), false, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, 1022);
            default:
                r7a.i permissionFlowOutput = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                if (permissionFlowOutput instanceof r7a.h) {
                    com.revolut.feature.shops.impl.ui.map_view.e eVar = this.f184397b;
                    if (eVar.f87237s.f87220a != null) {
                        eVar.H2(eVar.u, new n(eVar, 0));
                    } else {
                        eVar.l2(new com.revolut.feature.shops.impl.ui.map_view.d(eVar, null), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
        }
    }
}
