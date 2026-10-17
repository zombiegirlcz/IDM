package mkh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final htl.g f206389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1h.f f206390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnsettledDialogInputData f206391c;
    public final s d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f206392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f206393h;
    public final e4m.e i;

    public p(s sVar, UnsettledDialogInputData unsettledDialogInputData, htl.g gVar, f1h.f fVar) {
        this.d = sVar;
        this.f206389a = gVar;
        this.f206390b = fVar;
        this.f206391c = unsettledDialogInputData;
        int i = 11;
        this.e = e4m.b.b(new mjl.b(sVar, this, 1, i));
        this.f = e4m.b.b(new mjl.b(sVar, this, 0, i));
        this.f206392g = e4m.b.b(new mjl.b(sVar, this, 3, i));
        this.f206393h = e4m.b.b(new mjl.b(sVar, this, 2, i));
        this.i = e4m.b.b(new mjl.b(sVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f206392g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f206393h.get());
    }
}
