package xnd;

import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eqj.d f307407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kzi.a f307408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f307409c;
    public final j2 d;

    public j(eqj.d analyticsCustomPeriodInteractor, kzi.a intervalMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(analyticsCustomPeriodInteractor, "analyticsCustomPeriodInteractor");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f307407a = analyticsCustomPeriodInteractor;
        this.f307408b = intervalMapper;
        this.f307409c = dateProvider;
        od0.i.Companion.getClass();
        this.d = vkm.q.c(od0.i.f224256b);
    }
}
