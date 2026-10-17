package udi;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.data.model.Data;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ud3.f0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdi.a f279224a;

    public u(tdi.a revPointsPocketBannerMapper) {
        Intrinsics.checkNotNullParameter(revPointsPocketBannerMapper, "revPointsPocketBannerMapper");
        this.f279224a = revPointsPocketBannerMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f279212a;
        Data data2 = domainState.f279213b;
        List listA = tdi.a.a(this.f279224a, data, data2, false, 4);
        Data data3 = domainState.f279212a;
        ArrayList arrayListE0 = d0.E0((List) iii.c.f(t1.t(data3, data2), new ud3.m(11), new f0(9), new u3b.h(9)), d0.E0((List) iii.c.f(t1.t(data3, data2), new ud3.m(12), new f0(10), new u3b.h(10)), listA));
        RevPointsPocketInfo revPointsPocketInfo = (RevPointsPocketInfo) data3.getContent();
        return new l(arrayListE0, revPointsPocketInfo != null ? new MoneyClause(revPointsPocketInfo.e, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12) : null);
    }
}
