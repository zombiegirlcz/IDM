package xl9;

import cli.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends oki.h implements j {

    @NotNull
    public static final l Companion = new l();
    public final ql9.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f306969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f306970q;

    public o(t stateMapper, ql9.d settingsRepository, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = settingsRepository;
        this.f306969p = userInteractor;
        this.f306970q = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ql9.d dVar = this.o;
        dVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, c8g.a.D(dVar.f247561c.a(Unit.f186387a, loadingStrategy)), null, null, new n(this, null, 0), 3);
        yji.l.a1(this, this.f306969p.j(loadingStrategy), null, null, new n(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f306970q;
    }
}
