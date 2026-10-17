package fci;

import com.revolut.data.model.Data;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends oki.h implements j {
    public final PurposeOfAccountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aci.a f133796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f133797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zjh.j f133798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f133799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f133800t;

    public o(b stateMapper, PurposeOfAccountScreenContract$InputData inputData, aci.a purposeOfAccountInteractor, ang.f userInteractor, zjh.j purposeOfAccountTeensFilter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(purposeOfAccountInteractor, "purposeOfAccountInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(purposeOfAccountTeensFilter, "purposeOfAccountTeensFilter");
        this.o = inputData;
        this.f133796p = purposeOfAccountInteractor;
        this.f133797q = userInteractor;
        this.f133798r = purposeOfAccountTeensFilter;
        this.f133800t = mra.d.b(this, new g(new Data(null, null, true, 3, null), inputData.f97721c, inputData.f97720b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f133799s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        efm.r rVarSwitchIfEmpty = new rfm.m(new rfm.o(new a31.l(new eki.e(0, 1, PurposeOfAccountScreenContract$InputData.class, this.o, "countryCode", "getCountryCode()Lcom/revolut/core/model/country/CountryCode;"), 23)), new a31.o(17, l.f133789a), 1).n().switchIfEmpty(nim.a.w(this.f133797q.k(false), m.f));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchIfEmpty, "switchIfEmpty(...)");
        this.f133799s = yji.l.a1(this, xam.a.h(new n(this, continuation, 0), rd0.e.b(rVarSwitchIfEmpty)), null, null, new n(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f133800t;
    }
}
