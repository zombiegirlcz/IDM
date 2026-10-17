package wmd;

import g48.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import wk2.x;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f298637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f298638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le3.a f298639c;

    public c(wsg.b walletsInteractor, r0 jointAccountsInteractor, le3.a analyticsCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(analyticsCurrencyInteractor, "analyticsCurrencyInteractor");
        this.f298637a = walletsInteractor;
        this.f298638b = jointAccountsInteractor;
        this.f298639c = analyticsCurrencyInteractor;
    }

    public final Flow a(qzi.i budgetingAccountType, w4l.k loadingStrategy) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = b.f298636a[budgetingAccountType.ordinal()];
        if (i == 1) {
            flowV = nim.a.v(this.f298637a.e(loadingStrategy), new wl3.d(19));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowV = boh.f.e(this.f298638b.h(loadingStrategy), new x(this, 14));
        }
        return q.q(flowV);
    }
}
