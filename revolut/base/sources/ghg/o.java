package ghg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lig.k f143921b;

    public /* synthetic */ o(oki.h hVar, lig.k kVar, int i) {
        this.f143920a = i;
        this.f143921b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f143920a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, null, null, null, null, com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c.K2(this.f143921b), false, false, LDSFile.EF_DG15_TAG);
            case 1:
                g update2 = (g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g.a(update2, null, null, null, com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c.K2(this.f143921b), null, false, false, LDSFile.EF_SOD_TAG);
            case 2:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update3 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update3, null, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f.K2(this.f143921b), null, null, null, null, null, null, false, null, null, false, null, 8189);
            default:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update4 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update4, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f.K2(this.f143921b), null, null, null, null, null, null, null, false, null, null, false, null, 8190);
        }
    }
}
