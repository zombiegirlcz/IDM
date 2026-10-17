package ex2;

import cli.n;
import cli.y;
import com.revolut.feature.card_contactless_limit.api.Mode;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaContract$InputData;
import com.revolut.feature.card_screen.api.navigation.RetailCardsScreenFeatureConfig;
import e7l.g;
import efm.d0;
import efm.r;
import et6.m0;
import ewh.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends oki.h implements b {
    public final ResetCardScaContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ha3.d f130348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f130349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fk3.b f130350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f130351s;

    public l(n stateMapper, ResetCardScaContract$InputData inputData, ha3.d cardScaInteractor, l93.f revolutCardsInteractor, fk3.b configurationRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardScaInteractor, "cardScaInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.o = inputData;
        this.f130348p = cardScaInteractor;
        this.f130349q = revolutCardsInteractor;
        this.f130350r = configurationRepository;
        this.f130351s = mra.d.b(this, new c(true, null, inputData.f64519a, inputData.f64520b, inputData.f64521c, inputData.d, inputData.e, inputData.f, inputData.f64522g), stateMapper, new k(), false, 8);
    }

    @Override // yji.l
    public final void I1() {
        r rVarEmpty;
        r map;
        ResetCardScaContract$InputData resetCardScaContract$InputData = this.o;
        if (resetCardScaContract$InputData.f64522g) {
            y yVar = this.f130351s;
            if (((c) ((j2) yVar.f22677a).getValue()).f130336a) {
                H2(yVar, new x(2));
                I2();
            }
        }
        Mode mode = resetCardScaContract$InputData.f64519a;
        boolean z = mode instanceof Mode.SingleCard;
        g.b bVar = g.b.f123407a;
        fk3.b bVar2 = this.f130350r;
        Continuation continuation = null;
        ha3.d dVar = this.f130348p;
        if (z) {
            String str = ((Mode.SingleCard) mode).f64513a;
            r map2 = w.l(dVar.a(), m70.a.g(((ik3.g) bVar2).a(bVar, false), null, new ewh.y(2), 1)).map(new m0(26, new e2j.i(str, 24)));
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            map = map2.onErrorReturn(new m0(23, new x(3)));
        } else {
            if (!(mode instanceof Mode.AllCardsLimitWarning)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = ((Mode.AllCardsLimitWarning) mode).f64510a;
            l93.f fVar = this.f130349q;
            if (str2 != null) {
                d0 d0VarFirstOrError = l93.f.i(fVar).firstOrError();
                m0 m0Var = new m0(22, new e2j.i(str2, 23));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, m0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                rVarEmpty = iVar.x();
            } else {
                rVarEmpty = r.empty();
            }
            r rVarConcatWith = rVarEmpty.concatWith(w.m(l93.f.i(fVar), dVar.a(), m70.a.g(((ik3.g) bVar2).a(bVar, false), null, new ewh.y(2), 1)).map(new m0(25, new x(5))));
            Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "concatWith(...)");
            map = rVarConcatWith.map(new m0(24, new x(4)));
        }
        Intrinsics.h(map);
        yji.l.b1(this, rd0.e.b(map), null, new ew1.d(this, continuation, 8), 3);
    }

    public final void I2() {
        Mode mode = this.o.f64519a;
        Mode.SingleCard singleCard = mode instanceof Mode.SingleCard ? (Mode.SingleCard) mode : null;
        C1(u0.c(new RetailCardsScreenFeatureConfig.ResetContactlessLimit(singleCard != null ? singleCard.f64513a : null, 0)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f130351s;
    }
}
