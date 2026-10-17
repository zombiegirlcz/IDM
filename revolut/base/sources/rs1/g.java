package rs1;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import h12.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.l;
import tof.n;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements e12.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f256937a;

    public g(h apmAreaProvider) {
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        this.f256937a = apmAreaProvider;
    }

    @Override // e12.f
    public final vkm.d a() {
        return h.b(this.f256937a, n.BIZUM, l.BIZUM, null, null, 12);
    }

    @Override // e12.f
    public final Flow b() {
        return ((u12.c) this.f256937a).f(MoneyRequestChannel.Bizum.f60331b);
    }
}
