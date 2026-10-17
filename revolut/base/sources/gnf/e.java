package gnf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingTransactionScreenContract$InputData f144985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f144986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f144987c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f144988g;

    public e(a aVar, b bVar, BaseScreen baseScreen, PendingTransactionScreenContract$InputData pendingTransactionScreenContract$InputData) {
        this.f144985a = pendingTransactionScreenContract$InputData;
        this.f144986b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 15;
        this.f144987c = e4m.b.b(new e0(aVar, this, 2, i));
        this.d = e4m.b.b(new e0(aVar, this, 1, i));
        this.e = e4m.b.b(new e0(aVar, this, 0, i));
        this.f = e4m.b.b(new e0(aVar, this, 4, i));
        this.f144988g = e4m.b.b(new e0(aVar, this, 3, i));
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
