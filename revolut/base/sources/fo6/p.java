package fo6;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends oki.h implements m {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fg6.d f136835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f136836q;

    public p(cli.n stateMapper, j inputData, fg6.d crossBorderOpenBankingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(crossBorderOpenBankingInteractor, "crossBorderOpenBankingInteractor");
        this.o = inputData;
        this.f136835p = crossBorderOpenBankingInteractor;
        this.f136836q = mra.d.b(this, new i(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, I2(), null, null, new o(this, null, 0), 3);
    }

    public final vkm.d I2() {
        String institutionId = this.o.f136830a;
        fg6.d dVar = this.f136835p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        cf6.e eVar = dVar.f134904a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((x4l.c) eVar.k.getValue()).b(institutionId, loadingStrategy);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f136836q;
    }
}
