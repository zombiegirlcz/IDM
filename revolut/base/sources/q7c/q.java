package q7c;

import k7c.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f242830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f242831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61.a f242832c;
    public final k7c.b d;

    public q(p0 repository, ang.f userInteractor, l61.a userCompanyInteractor, k7c.b emailRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(emailRepository, "emailRepository");
        this.f242830a = repository;
        this.f242831b = userInteractor;
        this.f242832c = userCompanyInteractor;
        this.d = emailRepository;
    }
}
