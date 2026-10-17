package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduleTransferInputData f199025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f199026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199027c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199029h;

    public g(i iVar, BaseScreen baseScreen, ScheduleTransferInputData scheduleTransferInputData) {
        this.f199025a = scheduleTransferInputData;
        this.f199026b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 13;
        this.f199027c = e4m.b.b(new ljl.u(iVar, this, 2, i));
        this.d = e4m.b.b(new ljl.u(iVar, this, 1, i));
        this.e = e4m.b.b(new ljl.u(iVar, this, 0, i));
        this.f = e4m.b.b(new ljl.u(iVar, this, 4, i));
        this.f199028g = e4m.b.b(new ljl.u(iVar, this, 5, i));
        this.f199029h = e4m.b.b(new ljl.u(iVar, this, 3, i));
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
