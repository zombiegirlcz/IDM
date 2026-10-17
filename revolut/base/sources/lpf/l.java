package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferTroubleshooterInputData f199058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f199059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199060c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(i iVar, TransferTroubleshooterInputData transferTroubleshooterInputData) {
        this.f199059b = iVar;
        this.f199058a = transferTroubleshooterInputData;
        int i = 17;
        this.f199060c = e4m.b.b(new ljl.u(iVar, this, 1, i));
        this.d = e4m.b.b(new ljl.u(iVar, this, 0, i));
        this.e = e4m.b.b(new ljl.u(iVar, this, 3, i));
        this.f = e4m.b.b(new ljl.u(iVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
