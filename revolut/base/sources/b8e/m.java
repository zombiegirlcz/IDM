package b8e;

import au6.a3;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import s6e.z;
import vkm.q;
import vkm.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends oki.h implements g {
    public final g6e.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g6e.g f13219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f13220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f13221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xqe.b f13222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i4b.f f13223t;
    public final SubaccountDetailsScreenContract$InputData u;
    public final y v;

    public m(ac4.g mapper, g6e.d interactor, g6e.g navigationProvider, ang.f userInteractor, hj8.a juniorProfileInteractor, xqe.b teenProfileInteractor, i4b.f legalEntityContextProvider, SubaccountDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f13219p = navigationProvider;
        this.f13220q = userInteractor;
        this.f13221r = juniorProfileInteractor;
        this.f13222s = teenProfileInteractor;
        this.f13223t = legalEntityContextProvider;
        this.u = inputData;
        this.v = mra.d.b(this, new i(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        SubaccountDetailsScreenContract$InputData subaccountDetailsScreenContract$InputData = this.u;
        yji.l.a1(this, boh.f.e(((z) this.o).v(subaccountDetailsScreenContract$InputData.f89057a, subaccountDetailsScreenContract$InputData.f89058b), new b4b.z(this, 25)), null, null, new l(this, null, 0), 3);
        yji.l.a1(this, q.Q(new t0(this.v.B(new b73.h(19)), 1), new a3((Continuation) null, this, 12)), null, null, new l(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
