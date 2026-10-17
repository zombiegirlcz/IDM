package ghh;

import ael.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements ozg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f143939a;

    public g(k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f143939a = tradingAccountsInteractor;
    }

    @Override // ozg.b
    public final Object a(String str, Continuation continuation) {
        Object objR = ((q0) this.f143939a).r(true, (gim.c) continuation);
        return objR == fim.a.COROUTINE_SUSPENDED ? objR : Unit.f186387a;
    }
}
