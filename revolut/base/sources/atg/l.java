package atg;

import kotlin.jvm.internal.Intrinsics;
import mif.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qsg.b f9057b;

    public l(i allWalletsRepository, qsg.b walletsRepository) {
        Intrinsics.checkNotNullParameter(allWalletsRepository, "allWalletsRepository");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        this.f9056a = allWalletsRepository;
        this.f9057b = walletsRepository;
    }

    public final efm.r a() {
        efm.r rVarDistinctUntilChanged = nim.a.w(b(false), new arf.h(12)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final efm.r b(boolean z) {
        return nim.a.w(e0.h(((h) this.f9056a).i(w4l.h.f294642c)), new a2g.p(z, 14));
    }
}
