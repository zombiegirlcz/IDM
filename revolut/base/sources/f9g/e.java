package f9g;

import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f132946b;

    public /* synthetic */ e(m mVar, int i) {
        this.f132945a = i;
        this.f132946b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f132945a) {
            case 0:
                zfi.a appliedFilters = (zfi.a) obj2;
                Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
                return this.f132946b.f.j(appliedFilters);
            default:
                HotelsLocation location = (HotelsLocation) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                return this.f132946b.f.m(ta6.a.X(location));
        }
    }
}
