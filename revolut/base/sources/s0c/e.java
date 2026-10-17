package s0c;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetControllerContract$InputData;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import njf.j;
import nyb.m0;
import oki.h;
import pyb.l;
import rfm.m;
import ryd.i;
import ryd.k;
import s08.g;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends h implements b {
    public final RevPointsRelatedTransactionsBottomSheetControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0 f258931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nhf.a f258932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f258933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wsg.b f258934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f258935t;

    public e(f stateMapper, RevPointsRelatedTransactionsBottomSheetControllerContract$InputData inputData, m0 revPointsTransactionsInteractor, nhf.a unitedWalletInteractor, l transactionContentMapper, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionContentMapper, "transactionContentMapper");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.o = inputData;
        this.f258931p = revPointsTransactionsInteractor;
        this.f258932q = unitedWalletInteractor;
        this.f258933r = transactionContentMapper;
        this.f258934s = newWalletsInteractor;
        this.f258935t = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        e eVar = this;
        yji.l.a1(eVar, mo3.a.g(this.f258934s.e(w4l.h.f294642c), null, null, 3), null, null, new d(this, continuation, 0), 3);
        List<String> list = eVar.o.f83899a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (String str : list) {
            r map = ((j) eVar.f258932q).f().map(new g(2, new k(20)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            vkm.d dVarB = rd0.e.b(map);
            r rVarSwitchMap = new m(eVar.f258931p.b(str, kub.a.NETWORK_IMMEDIATE_AND_FORCE_UPDATE), new g(3, new k(21)), 1).n().switchMap(new g(4, new i(this, 7)));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            arrayList.add(yji.l.a1(eVar, mo3.a.g(rd0.e.n(u0.m(dVarB, rd0.e.b(rVarSwitchMap)), h0.f322473a), null, null, 3), new d(this, continuation, 1), null, new d(this, continuation, 2), 2));
            eVar = this;
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f258935t;
    }
}
