package p72;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements e12.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h12.h f233539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q72.a f233540b;

    public q(h12.h apmAreaProvider, q72.a multibancoTransactionInteractor) {
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        Intrinsics.checkNotNullParameter(multibancoTransactionInteractor, "multibancoTransactionInteractor");
        this.f233539a = apmAreaProvider;
        this.f233540b = multibancoTransactionInteractor;
    }

    @Override // e12.f
    public final vkm.d a() {
        return rd0.e.b(whf.b.a(this.f233540b.f242737a, w.h(q72.a.a()), null, null, null, 14));
    }

    @Override // e12.f
    public final Flow b() {
        return ((u12.c) this.f233539a).f(MoneyRequestChannel.MBWay.f60332b);
    }
}
