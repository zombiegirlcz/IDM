package nm6;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements dli.b {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ig6.b f217191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f61.a f217192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f217193r;

    public j(f inputData, ig6.b netBankingInteractor, f61.a indiaNetBankingInitiatorInteractor, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(netBankingInteractor, "netBankingInteractor");
        Intrinsics.checkNotNullParameter(indiaNetBankingInitiatorInteractor, "indiaNetBankingInitiatorInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f217191p = netBankingInteractor;
        this.f217192q = indiaNetBankingInitiatorInteractor;
        this.f217193r = mra.d.b(this, new e(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ig6.b bVar = this.f217191p;
        bVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        zh6.c cVar = bVar.f161082a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, cVar.f322241c.b(Unit.f186387a, loadingStrategy), null, null, new naf.j(this, null, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f217193r;
    }
}
