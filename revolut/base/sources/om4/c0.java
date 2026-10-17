package om4;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements al4.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.q f226537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f226538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.q f226539c;
    public final x1 d;

    public c0(dp4.q repository, a0 availabilityInteractor, al4.q creditCardProductInteractor, x1 reloadInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(reloadInteractor, "reloadInteractor");
        this.f226537a = repository;
        this.f226538b = availabilityInteractor;
        this.f226539c = creditCardProductInteractor;
        this.d = reloadInteractor;
    }

    public final Flow a(wi0.b countryCode, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new an8.a(this, countryCode, loadingStrategy, (Continuation) null, 6), rd0.e.n(this.f226538b.a(), zhm.h0.f322473a));
    }
}
