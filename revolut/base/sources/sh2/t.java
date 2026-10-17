package sh2;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.v5;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements e12.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h12.h f263418a;

    public t(h12.h apmAreaProvider) {
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        this.f263418a = apmAreaProvider;
    }

    @Override // e12.f
    public final vkm.d a() {
        return h12.h.b(this.f263418a, tof.n.WERO, tof.l.WERO, v5.WERO, null, 8);
    }

    @Override // e12.f
    public final Flow b() {
        return ((u12.c) this.f263418a).f(MoneyRequestChannel.Wero.f60336b);
    }
}
