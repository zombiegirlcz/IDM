package kcc;

import b6c.c;
import gcc.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import q7c.p;
import vkm.d;
import w4l.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f182697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4g.g f182698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f182699c;

    public a(g promotedMerchantsRepository, h4g.g shopsFeatureAvailabilityInteractor, c revolutPayInfoInteractor) {
        Intrinsics.checkNotNullParameter(promotedMerchantsRepository, "promotedMerchantsRepository");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revolutPayInfoInteractor, "revolutPayInfoInteractor");
        this.f182697a = promotedMerchantsRepository;
        this.f182698b = shopsFeatureAvailabilityInteractor;
        this.f182699c = revolutPayInfoInteractor;
    }

    public final d a() {
        boolean zE = this.f182698b.e();
        g gVar = this.f182697a;
        gVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.d.a(Boolean.valueOf(zE), loadingStrategy);
    }

    public final Flow b() {
        return ((p) this.f182699c).f242829b.g() ? nim.a.A(a(), new k9h.d(23)) : zi0.c.i(Boolean.FALSE);
    }
}
