package hc1;

import efm.d0;
import jki.j;
import jki.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends bji.b implements d {
    public final cfc.b u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f150772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, cfc.b cardReaderUiMerchantInteractor, b mapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cardReaderUiMerchantInteractor, "cardReaderUiMerchantInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.u = cardReaderUiMerchantInteractor;
        this.v = mapper;
        this.f150772w = j.f175191a;
    }

    @Override // yji.l
    public final void I1() {
        d0 d0VarFirstOrError = m70.a.g(this.u.e.f134800c.f(Unit.f186387a, false), null, null, 3).firstOrError();
        cd0.c cVar = new cd0.c(new ccg.c(25), 27);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        A2(ue0.e.F(iVar, Boolean.FALSE), new f(this, 0), new zii.c(4));
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.f150772w;
    }
}
