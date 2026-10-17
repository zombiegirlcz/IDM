package kjd;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.q9;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184392a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q9 f184393b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f184392a) {
            case 0:
                com.revolut.feature.shops.impl.ui.map_view.b update = (com.revolut.feature.shops.impl.ui.map_view.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                GmsLatLngBounds gmsLatLngBounds = this.f184393b.f209962a;
                double d = gmsLatLngBounds.b().f4848b - gmsLatLngBounds.c().f4848b;
                if (d < 0.0d) {
                    d += 360.0d;
                }
                if (d < 0.001d) {
                    d = 0.001d;
                }
                return com.revolut.feature.shops.impl.ui.map_view.b.a(update, null, false, null, (float) rim.d.a(360.0d / d), gmsLatLngBounds, gmsLatLngBounds, null, null, null, 963);
            default:
                com.revolut.feature.shops.impl.ui.map_view.b update2 = (com.revolut.feature.shops.impl.ui.map_view.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                g gVar = update2.f87228c;
                float f = gVar != null ? gVar.f184375c : update2.d;
                GmsLatLngBounds gmsLatLngBounds2 = this.f184393b.f209962a;
                return com.revolut.feature.shops.impl.ui.map_view.b.a(update2, null, false, null, f, gmsLatLngBounds2, gmsLatLngBounds2, null, null, null, 967);
        }
    }
}
