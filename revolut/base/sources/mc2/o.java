package mc2;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.v5;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements e12.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h12.h f204264a;

    public o(h12.h apmAreaProvider) {
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        this.f204264a = apmAreaProvider;
    }

    @Override // e12.f
    public final vkm.d a() {
        return h12.h.b(this.f204264a, tof.n.GIRO_ALIAS, tof.l.GIRO_ALIAS, v5.GIRO_ALIAS, null, 8);
    }

    @Override // e12.f
    public final Flow b() {
        return ((u12.c) this.f204264a).f(MoneyRequestChannel.Qvik.f60333b);
    }
}
