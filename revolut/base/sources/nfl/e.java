package nfl;

import ael.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mfl.h;
import mfl.i;
import vdl.w1;
import ybl.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f215093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f215094b;

    public e(o tradingStatementsInteractor, i inputData) {
        Intrinsics.checkNotNullParameter(tradingStatementsInteractor, "tradingStatementsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f215093a = tradingStatementsInteractor;
        this.f215094b = inputData;
    }

    @Override // mfl.h
    public final Flow a() {
        String portfolioId = this.f215094b.f205027a;
        b1 b1Var = (b1) this.f215093a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w1 w1Var = b1Var.f3598a;
        w1Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new mmh.e(rd0.e.b(ue0.e.p(w1Var.f288059h.f(portfolioId, false), h0.f322473a)), 22);
    }
}
