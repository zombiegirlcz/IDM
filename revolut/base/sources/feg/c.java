package feg;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f134603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8g.c f134604b;

    public c(l80.e dateProvider, p8g.c travelHotelsFeatureInteractor, q8g.b campaignsHubMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(campaignsHubMapper, "campaignsHubMapper");
        this.f134603a = dateProvider;
        this.f134604b = travelHotelsFeatureInteractor;
    }

    public static List a(List list, boolean z, Function2 function2) {
        return y.J(y.x(y.H(y.F(y.t(d0.Q(list), new cd0.a(2, function2)), new b()), 2), new cmc.a(z, 23)));
    }
}
