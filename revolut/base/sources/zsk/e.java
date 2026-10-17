package zsk;

import ael.k;
import cam.f;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zfd.s;
import zr2.o;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f324948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ybl.b f324949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f324950n;

    public e(b inputData, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f324948l = inputData;
        this.f324949m = instrumentTickerInteractor;
        this.f324950n = pyd.c.a(this, new a(new Data(null, null, false, 7, null)));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, nim.a.v(rd0.e.b(((k) this.f324949m).f(this.f324948l.f324944a)), new o(15)), null, new s(this, (Continuation) null, 28), 3);
    }

    @Override // vki.b
    public final f getState() {
        return this.f324950n;
    }
}
