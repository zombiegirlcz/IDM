package oda;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountQrCodeScreenContract$InputData f224352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f224353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224354c;
    public final e4m.e d;
    public final e4m.e e;

    public e(o oVar, AccountQrCodeScreenContract$InputData accountQrCodeScreenContract$InputData) {
        this.f224353b = oVar;
        this.f224352a = accountQrCodeScreenContract$InputData;
        int i = 17;
        this.f224354c = e4m.b.b(new o41.b(oVar, this, 1, i));
        this.d = e4m.b.b(new o41.b(oVar, this, 2, i));
        this.e = e4m.b.b(new o41.b(oVar, this, 0, i));
    }

    public final pea.d d() {
        yy0.f fVar = (yy0.f) this.f224354c.get();
        o oVar = this.f224353b;
        zk0.b bVarL = oVar.f224400h.l();
        vc.s.j(bVarL);
        return new pea.d(fVar, bVarL, oVar.f224401j);
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
