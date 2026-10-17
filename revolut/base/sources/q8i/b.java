package q8i;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import ej6.d0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import vkm.d;
import w5i.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements i1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p56.a f243084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f243085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f243086c;
    public final /* synthetic */ i1j.a d;

    public b(p56.a aVar, Set set, AccountWrapper accountWrapper, i1j.a aVar2) {
        this.f243084a = aVar;
        this.f243085b = set;
        this.f243086c = accountWrapper;
        this.d = aVar2;
    }

    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        d dVarB = e.b(nim.a.w(c.a((c) this.f243084a.f233024b, this.f243085b, x5i.d.SOURCE, this.f243086c, null, SyslogConstants.LOG_CLOCK), new d0(this.f243086c, 2)));
        i1j.a aVar = this.d;
        return aVar == null ? dVarB : xam.a.h(new a(aVar, null, 0), dVarB);
    }
}
