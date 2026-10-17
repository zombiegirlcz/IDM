package ubi;

import cli.y;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mic.a0;
import qee.s;
import rfm.m;
import rfm.o;
import skm.a2;
import tx0.g4;
import u7k.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends oki.h implements dli.b {
    public final OccupationChooserScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f278908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f278909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f278910r;

    public l(s stateMapper, OccupationChooserScreenContract$InputData inputData, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f278908p = userInteractor;
        f.Companion.getClass();
        this.f278910r = mra.d.b(this, f.f278900c, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f278909q;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        r rVarSwitchIfEmpty = new m(new o(new s2i.i(new eki.e(0, 7, OccupationChooserScreenContract$InputData.class, this.o, "countryCode", "getCountryCode()Lcom/revolut/core/model/country/CountryCode;"), 6)), new a0(15, j.f278907a), 1).n().switchIfEmpty(nim.a.w(this.f278908p.k(false), k.f));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchIfEmpty, "switchIfEmpty(...)");
        this.f278909q = yji.l.a1(this, rd0.e.b(nim.a.w(rVarSwitchIfEmpty, new g4(1, this, l.class, "getOccupations", "getOccupations(Lcom/revolut/core/model/country/CountryCode;)Ljava/util/List;", 0, 10))), null, null, new f0(this, continuation, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f278910r;
    }
}
