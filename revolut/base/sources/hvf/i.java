package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transport.impl.ui.timer_dialog.TimerDialogContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimerDialogContract$InputData f155911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f155912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155913c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f155914g;

    public i(q qVar, TimerDialogContract$InputData timerDialogContract$InputData) {
        this.f155912b = qVar;
        this.f155911a = timerDialogContract$InputData;
        this.f155913c = e4m.b.b(new hjg.b(qVar, this, 1, 5));
        this.d = e4m.b.b(new hjg.b(qVar, this, 0, 5));
        this.e = e4m.b.b(new hjg.b(qVar, this, 3, 5));
        this.f = e4m.b.b(new hjg.b(qVar, this, 2, 5));
        this.f155914g = e4m.b.b(new hjg.b(qVar, this, 4, 5));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155912b.f155949n.get(), (yji.n) this.d.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
