package fci;

import com.revolut.data.model.Data;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 extends oki.h implements w0 {
    public final eci.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a2 f133827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cli.y f133828q;

    public y0(g0 stateMapper, PurposeOfAccountTilesScreenContract$InputData inputData, eci.b purposeOfAccountRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(purposeOfAccountRepository, "purposeOfAccountRepository");
        this.o = purposeOfAccountRepository;
        this.f133828q = mra.d.b(this, new t0(new Data(null, null, true, 3, null), inputData.f97725b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f133827p;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f133827p = yji.l.a1(this, this.o.f124756c.b(Unit.f186387a, w4l.i.f294643c), null, null, new f9d.c(this, continuation, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f133828q;
    }
}
