package sk4;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import sek.q;
import wsg.n;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends jki.g implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f263772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f263773q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n walletInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f263772p = walletInteractor;
        this.f263773q = new a(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f263773q;
    }

    public final void y2() {
        l.b1(this, rd0.e.b(ue0.e.p(nim.a.w(this.f263772p.X(AccountId.Personal.f51414a, w4l.h.f294642c), new sk2.f(3)), h0.f322473a)), null, new q(this, null, 5), 3);
    }
}
