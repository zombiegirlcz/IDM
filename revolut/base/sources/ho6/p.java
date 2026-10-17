package ho6;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends oki.h implements l {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fg6.d f154238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f154239q;

    public p(cli.n stateMapper, i inputData, fg6.d crossBorderOpenBankingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(crossBorderOpenBankingInteractor, "crossBorderOpenBankingInteractor");
        this.o = inputData;
        this.f154238p = crossBorderOpenBankingInteractor;
        this.f154239q = mra.d.b(this, new h(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, I2(), null, null, new o(this, null, 0), 3);
    }

    public final vkm.d I2() {
        String globalInstitutionId = this.o.f154231a;
        fg6.d dVar = this.f154238p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(globalInstitutionId, "globalInstitutionId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        cf6.e eVar = dVar.f134904a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(globalInstitutionId, "globalInstitutionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return eVar.f23569j.b(globalInstitutionId, loadingStrategy);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f154239q;
    }
}
