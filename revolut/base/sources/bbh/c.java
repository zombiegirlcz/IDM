package bbh;

import ael.q0;
import bb2.t;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import vkm.y;
import w4l.h;
import ybl.k;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14310a;

    public c(k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f14310a = tradingAccountsInteractor;
    }

    public final y a(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return e.e(mo3.a.f(nim.a.v(((q0) this.f14310a).o(portfolioId, h.f294642c), new a(0)), new t(5), new b0c.a(this, 8), new t(6)), h0.f322473a, new b(3, null));
    }
}
