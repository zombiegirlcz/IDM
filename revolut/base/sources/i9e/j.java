package i9e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockFuturePaymentsScreenContract$InputData f159684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseScreen f159685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f159686c;
    public final i d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f159687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f159688h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f159689j;
    public final e4m.e k;

    public j(o oVar, i iVar, BaseScreen baseScreen, BlockFuturePaymentsScreenContract$InputData blockFuturePaymentsScreenContract$InputData) {
        this.f159686c = oVar;
        this.d = iVar;
        this.f159684a = blockFuturePaymentsScreenContract$InputData;
        this.f159685b = baseScreen;
        this.e = e4m.b.b(e4m.c.a(baseScreen));
        int i = 27;
        this.f = e4m.b.b(new ehe.o(oVar, iVar, this, 2, i));
        this.f159687g = e4m.b.b(new ehe.o(oVar, iVar, this, 1, i));
        this.f159688h = e4m.b.b(new ehe.o(oVar, iVar, this, 0, i));
        this.i = e4m.b.b(new ehe.o(oVar, iVar, this, 4, i));
        this.f159689j = e4m.b.b(new ehe.o(oVar, iVar, this, 5, i));
        this.k = e4m.b.b(new ehe.o(oVar, iVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f159688h.get());
    }
}
