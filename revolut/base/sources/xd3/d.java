package xd3;

import com.revolut.data.model.Data;
import jki.g;
import jki.h;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bd3.a f304253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f304254q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper, bd3.a cashbackInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        this.f304253p = cashbackInteractor;
        this.f304254q = new b(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(bd3.a.d(this.f304253p)), null, null, new x64.b(this, null, 15), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f304254q;
    }
}
