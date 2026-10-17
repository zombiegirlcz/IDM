package b9c;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import u80.t;
import wsg.n;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f13711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q7c.c f13712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f13713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f13714s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t amountUtils, q7c.c inStoreInteractor, n walletInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(amountUtils, "amountUtils");
        Intrinsics.checkNotNullParameter(inStoreInteractor, "inStoreInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f13711p = amountUtils;
        this.f13712q = inStoreInteractor;
        this.f13713r = walletInteractor;
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306273h;
        dj0.d.Companion.getClass();
        this.f13714s = new e(bVar, dj0.d.e, f0.f322471a, null, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(zi0.c.q(osg.b.e(this.f13713r, false, null, null, null, null, null, null, 126), f0.f322471a)), null, null, new j(this, null, 0), 3);
        this.f13712q.f242806a.getClass();
        Intrinsics.checkNotNullParameter("Proper Barber", "title");
        Intrinsics.checkNotNullParameter("@ProperBarber", "subtitle");
        l.a1(this, rd0.e.b(zi0.c.j(new t7c.a())), null, null, new j(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f13714s;
    }
}
