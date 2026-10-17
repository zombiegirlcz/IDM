package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferRecallInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferRecallInputData f199053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f199054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199055c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199057h;
    public final e4m.e i;

    public k(i iVar, BaseScreen baseScreen, TransferRecallInputData transferRecallInputData) {
        this.f199054b = iVar;
        this.f199053a = transferRecallInputData;
        this.f199055c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 16;
        this.d = e4m.b.b(new ljl.u(iVar, this, 1, i));
        this.e = e4m.b.b(new ljl.u(iVar, this, 0, i));
        this.f = e4m.b.b(new ljl.u(iVar, this, 3, i));
        this.f199056g = e4m.b.b(new ljl.u(iVar, this, 2, i));
        this.f199057h = e4m.b.b(new ljl.u(iVar, this, 5, i));
        this.i = e4m.b.b(new ljl.u(iVar, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f199056g.get());
    }
}
