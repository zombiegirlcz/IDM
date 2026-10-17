package s1k;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreenContract$InputData;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import rt4.o;
import te0.w;
import wsg.n;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f259153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppg.b f259154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f259155r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, PaymentOptionsScreenContract$InputData inputData, n walletInteractor, ppg.b vaultsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f259153p = walletInteractor;
        this.f259154q = vaultsInteractor;
        this.f259155r = new d(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), inputData.f101888a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        r map = this.f259153p.x(AccountId.Personal.f51414a).x().map(new s08.g(12, new s1c.a(6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        io3.k kVar = io3.k.ACTIVE;
        l.b1(this, rd0.e.b(w.l(nim.a.w(u1.d(map, osg.b.e(this.f259153p, true, io3.l.CURRENT, kVar, null, null, null, null, SyslogConstants.LOG_CLOCK)), new s1c.a(7)), ppg.b.a(this.f259154q, 3))), null, new o(this, null, 22), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f259155r;
    }
}
