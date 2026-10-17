package i9g;

import fag.t0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159846a;

    public y(t0 travelHotelsRepository) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        this.f159846a = travelHotelsRepository;
    }

    public static efm.r b(y yVar, int i) {
        return nim.a.w(yVar.f159846a.f133388w.f(Unit.f186387a, false), new g7b.q((i & 2) == 0, 21));
    }

    public final efm.r a(fgi.a providerId) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        efm.r rVarH = m70.a.h(b(this, 2), new hnc.a(providerId, 22), new i83.m(5), null, 4);
        od0.i.Companion.getClass();
        return ue0.e.E(rVarH, od0.i.f224256b);
    }
}
