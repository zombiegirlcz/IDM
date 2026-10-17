package iek;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreenContract$InputData;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends oki.h implements i {
    public final PodNomineeDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lek.b f160763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qek.a f160764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f160765r;

    public n(cli.n stateMapper, PodNomineeDetailsScreenContract$InputData inputData, lek.b interactor, qek.a dialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.o = inputData;
        this.f160763p = interactor;
        this.f160764q = dialogMapper;
        this.f160765r = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String id10 = this.o.f102585a;
        lek.m mVar = (lek.m) this.f160763p;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "nomineeId");
        bek.g gVar = mVar.f194586a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        r rVarStartWith = gVar.f14869b.c(id10).map(new bce.e(new bek.a(0), 22)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.e(rd0.e.b(rVarStartWith), h0.f322473a, new im2.b(3, 10, continuation)), null, null, new ibg.g(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f160765r;
    }
}
