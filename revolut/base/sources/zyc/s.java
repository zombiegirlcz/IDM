package zyc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zul.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends oki.h implements dli.b {
    public final kpj.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f326427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cli.y f326428q;

    public s(boolean z, tyc.l mapper, kpj.f sotInteractor, zq.a sotTransactionsDelegate) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(sotInteractor, "sotInteractor");
        Intrinsics.checkNotNullParameter(sotTransactionsDelegate, "sotTransactionsDelegate");
        this.o = sotInteractor;
        this.f326427p = sotTransactionsDelegate;
        this.f326428q = mra.d.b(this, new k(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), z), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        kpj.f fVar = this.o;
        yji.l.b1(this, rd0.e.b(fVar.l()), null, new r(this, null, 0), 3);
        yji.l.b1(this, rd0.e.b(nim.a.w(fVar.i(), new l0(18))), null, new r(this, null, 1), 3);
        yji.l.b1(this, rd0.e.b(nim.a.w(this.f326427p.o(), new l0(19))), null, new r(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f326428q;
    }
}
