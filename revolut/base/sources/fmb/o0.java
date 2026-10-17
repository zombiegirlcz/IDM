package fmb;

import com.revolut.data.model.Data;
import java.util.List;
import kkf.b4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kmb.c f136289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kmb.e f136290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final imb.e f136291c;
    public final imb.b d;
    public final gte.a e;

    public o0(kmb.c itemProvider, kmb.e itemProviderRevamp, imb.e navigationBarDataProviderRevamp, imb.b navigationBarDataProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(itemProviderRevamp, "itemProviderRevamp");
        Intrinsics.checkNotNullParameter(navigationBarDataProviderRevamp, "navigationBarDataProviderRevamp");
        Intrinsics.checkNotNullParameter(navigationBarDataProvider, "navigationBarDataProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f136289a = itemProvider;
        this.f136290b = itemProviderRevamp;
        this.f136291c = navigationBarDataProviderRevamp;
        this.d = navigationBarDataProvider;
        this.e = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        r domainState = (r) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f136297b;
        Data data = domainState.f136296a;
        if (z) {
            Intrinsics.checkNotNullParameter(data, "data");
            kmb.e eVar = this.f136290b;
            list = (List) iii.c.f(data, new kkk.u(eVar, 26), new b4(14), new kcg.j(eVar, 9));
        } else {
            Intrinsics.checkNotNullParameter(data, "data");
            kmb.c cVar = this.f136289a;
            list = (List) iii.c.f(data, new kkk.u(cVar, 25), new b4(13), new kcg.j(cVar, 8));
        }
        return new m0(list, (v) iii.c.f(data, new fkh.f(5), new fk4.r(5), new f0e.i(domainState, this, 14)), (q) iii.c.f(data, new fkh.f(6), new fk4.r(6), new ec8.q(this, 29)));
    }
}
