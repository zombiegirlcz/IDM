package off;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshooterDetailScreenContract$InputData f224816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f224817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224818c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f224819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f224820h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f224821j;

    public b(a aVar, c cVar, BaseScreen baseScreen, TroubleshooterDetailScreenContract$InputData troubleshooterDetailScreenContract$InputData) {
        this.f224816a = troubleshooterDetailScreenContract$InputData;
        this.f224817b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 23;
        this.f224818c = e4m.b.b(new o41.b(aVar, this, 2, i));
        this.d = e4m.b.b(new o41.b(aVar, this, 1, i));
        this.e = e4m.b.b(new o41.b(aVar, this, 0, i));
        this.f = e4m.b.b(new o41.b(aVar, this, 5, i));
        this.f224819g = e4m.b.b(new o41.b(aVar, this, 4, i));
        this.f224820h = e4m.b.b(new o41.b(aVar, this, 3, i));
        this.i = e4m.b.b(new o41.b(aVar, this, 7, i));
        this.f224821j = e4m.b.b(new o41.b(aVar, this, 6, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((n) this.f224820h.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
