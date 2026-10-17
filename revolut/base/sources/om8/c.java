package om8;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te8.z;
import w4l.i;
import w4l.k;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f226774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm8.b f226775b;

    public c(z juniorProductsInteractor, jm8.b juniorRewardsRepository) {
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorRewardsRepository, "juniorRewardsRepository");
        this.f226774a = juniorProductsInteractor;
        this.f226775b = juniorRewardsRepository;
    }

    public final Flow a(String juniorId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new a9h.a(this, juniorId, loadingStrategy, (Continuation) null, 19), rd0.e.b(z.b(this.f226774a, juniorId, Intrinsics.f(loadingStrategy, i.f294643c), 4)));
    }
}
