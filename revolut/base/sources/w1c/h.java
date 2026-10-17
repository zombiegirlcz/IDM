package w1c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import java.util.Set;
import vtc.n;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeControllerApi$InputData f293838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f293839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293840c;

    public h(a aVar, RevPointsSpareChangeControllerApi$InputData revPointsSpareChangeControllerApi$InputData) {
        this.f293839b = aVar;
        this.f293838a = revPointsSpareChangeControllerApi$InputData;
        this.f293840c = e4m.b.b(new n(aVar, this, 10));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
