package o4e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsControllerContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4e.e f222250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4e.c f222251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PerformanceTrackerTermsControllerContract$InputData f222252c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(l lVar, i iVar, PerformanceTrackerTermsControllerContract$InputData performanceTrackerTermsControllerContract$InputData, x4e.e eVar, x4e.c cVar) {
        this.f222250a = eVar;
        this.f222251b = cVar;
        this.f222252c = performanceTrackerTermsControllerContract$InputData;
        this.d = e4m.b.b(new o41.b(lVar, this, 1, 4));
        this.e = e4m.b.b(new o41.b(lVar, this, 0, 4));
        this.f = e4m.b.b(new o41.b(lVar, this, 2, 4));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
