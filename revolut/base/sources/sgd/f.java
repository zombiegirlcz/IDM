package sgd;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l3d.r;
import oki.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends h implements dli.b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f262647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f262648q;

    public f(d inputData, r multipleWatchlistInteractor, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f262647p = multipleWatchlistInteractor;
        String str = inputData.f262645b.f86896b;
        this.f262648q = mra.d.b(this, new c(str, (d0.W(str) || Intrinsics.f(str, inputData.f262645b.f86896b)) ? false : true), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f262648q;
    }
}
