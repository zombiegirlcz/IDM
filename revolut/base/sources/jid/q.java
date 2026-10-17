package jid;

import ble.c1;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements a39.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4g.g f174450b;

    public q(h4g.g shopsFeatureAvailabilityInteractor, int i) {
        this.f174449a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
                this.f174450b = shopsFeatureAvailabilityInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
                this.f174450b = shopsFeatureAvailabilityInteractor;
                break;
        }
    }

    @Override // a39.a
    public final Flow a() {
        switch (this.f174449a) {
            case 0:
                return rd0.e.b(ue0.e.E(nim.a.w(zi0.c.j(Boolean.valueOf(this.f174450b.b())), new jhi.a(24)), new Data(b39.b.f12015a, null, false, 6, null)));
            default:
                return new c1(new v1(new jec.p(this, null, 9)), 17);
        }
    }
}
