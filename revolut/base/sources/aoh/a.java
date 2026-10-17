package aoh;

import ael.h0;
import akg.n;
import an4.f;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import ybl.i;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f7985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f7986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f7987c;

    public a(m wealthAccountsInteractor, i productGroupAvailabilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f7985a = wealthAccountsInteractor;
        this.f7986b = productGroupAvailabilityInteractor;
        this.f7987c = featureToggleInteractor;
    }

    public final n a() {
        return nim.a.v(u0.m(((h0) this.f7986b).d(), m.c(this.f7985a, null, null, 3)), new f(this, 15));
    }
}
