package gah;

import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.f f142181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1h.d f142182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f142183c;

    public f(d1h.d clauseDestinationProvider, d1h.f dataProvider, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(clauseDestinationProvider, "clauseDestinationProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f142181a = dataProvider;
        this.f142182b = clauseDestinationProvider;
        this.f142183c = deeplinkHandler;
    }

    public final e a() {
        return new e(this.f142182b, this.f142181a, this.f142183c);
    }
}
