package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferCancellationInputData f199030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f199031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199032c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199033g;

    public h(i iVar, BaseScreen baseScreen, TransferCancellationInputData transferCancellationInputData) {
        this.f199030a = transferCancellationInputData;
        this.f199031b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 14;
        this.f199032c = e4m.b.b(new ljl.u(iVar, this, 2, i));
        this.d = e4m.b.b(new ljl.u(iVar, this, 1, i));
        this.e = e4m.b.b(new ljl.u(iVar, this, 0, i));
        this.f = e4m.b.b(new ljl.u(iVar, this, 4, i));
        this.f199033g = e4m.b.b(new ljl.u(iVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
