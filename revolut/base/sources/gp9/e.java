package gp9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillsChooserInputData f145367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f145368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f145369c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f145370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f145371h;

    public e(d dVar, BaseScreen baseScreen, BillsChooserInputData billsChooserInputData) {
        this.f145368b = dVar;
        this.f145367a = billsChooserInputData;
        this.f145369c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 17;
        this.d = e4m.b.b(new e0(dVar, this, 2, i));
        this.e = e4m.b.b(new e0(dVar, this, 1, i));
        this.f = e4m.b.b(new e0(dVar, this, 0, i));
        this.f145370g = e4m.b.b(new e0(dVar, this, 4, i));
        this.f145371h = e4m.b.b(new e0(dVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
