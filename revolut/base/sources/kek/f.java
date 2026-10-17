package kek;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_percentage.PodNomineesPercentageScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineesPercentageScreenContract$InputData f183133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f183134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f183135c;

    public f(c cVar, d dVar, PodNomineesPercentageScreenContract$InputData podNomineesPercentageScreenContract$InputData) {
        this.f183133a = podNomineesPercentageScreenContract$InputData;
        this.f183134b = e4m.b.b(new il8.d(cVar, dVar, this, 1, 18));
        this.f183135c = e4m.b.b(new il8.d(cVar, dVar, this, 0, 18));
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
