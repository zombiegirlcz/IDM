package off;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshooterListScreenContract$InputData f224825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f224826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f224827c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f224828g;

    public d(a aVar, c cVar, BaseScreen baseScreen, TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData) {
        this.f224825a = troubleshooterListScreenContract$InputData;
        this.f224826b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 24;
        this.f224827c = e4m.b.b(new o41.b(aVar, this, 2, i));
        this.d = e4m.b.b(new o41.b(aVar, this, 1, i));
        this.e = e4m.b.b(new o41.b(aVar, this, 0, i));
        this.f = e4m.b.b(new o41.b(aVar, this, 4, i));
        this.f224828g = e4m.b.b(new o41.b(aVar, this, 3, i));
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
