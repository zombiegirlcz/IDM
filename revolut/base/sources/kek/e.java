package kek;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineesListScreenContract$InputData f183130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f183131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f183132c;

    public e(c cVar, d dVar, PodNomineesListScreenContract$InputData podNomineesListScreenContract$InputData) {
        this.f183130a = podNomineesListScreenContract$InputData;
        this.f183131b = e4m.b.b(new il8.d(cVar, dVar, this, 1, 17));
        this.f183132c = e4m.b.b(new il8.d(cVar, dVar, this, 0, 17));
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
