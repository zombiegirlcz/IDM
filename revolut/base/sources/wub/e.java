package wub;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements a39.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f300101b;

    public e(a revPointsBuyingFeatureInteractor, int i) {
        this.f300100a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
                this.f300101b = revPointsBuyingFeatureInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
                this.f300101b = revPointsBuyingFeatureInteractor;
                break;
        }
    }

    @Override // a39.a
    public final Flow a() {
        switch (this.f300100a) {
            case 0:
                return zi0.c.i(this.f300101b.a() ? new b39.a(b39.d.POINTS_BUYING_ONE_OFF) : b39.b.f12015a);
            default:
                return zi0.c.i(this.f300101b.b() ? new b39.a(b39.d.POINTS_BUYING_RECURRING) : b39.b.f12015a);
        }
    }
}
