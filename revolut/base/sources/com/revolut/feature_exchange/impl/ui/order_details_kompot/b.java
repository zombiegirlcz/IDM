package com.revolut.feature_exchange.impl.ui.order_details_kompot;

import a07.p;
import a3e.u;
import a3i.l;
import a3i.n;
import a3i.v;
import ang.f;
import b3i.c;
import b9.w2;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import efm.r;
import ffk.t;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements n {
    public final OrderDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w2 f96972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0i.b f96973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f96974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b3i.a f96975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f96976t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(u stateMapper, OrderDetailsScreenContract$InputData inputData, w2 dataStreams, p0i.b fxOrderInteractor, c actionsBottomSheetMapper, b3i.a exchangeFeeClauseMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dataStreams, "dataStreams");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(actionsBottomSheetMapper, "actionsBottomSheetMapper");
        Intrinsics.checkNotNullParameter(exchangeFeeClauseMapper, "exchangeFeeClauseMapper");
        this.o = inputData;
        this.f96972p = dataStreams;
        this.f96973q = fxOrderInteractor;
        this.f96974r = actionsBottomSheetMapper;
        this.f96975s = exchangeFeeClauseMapper;
        this.f96976t = d.b(this, new l(inputData.f96968a, null, null, true), stateMapper, null, false, 12);
        this.u = e.a(this, new a09.b(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        r rVarJust;
        w2 w2Var = this.f96972p;
        r rVarT = ((t) w2Var.d).t(true);
        OrderDetailsScreenContract$InputData orderDetailsScreenContract$InputData = (OrderDetailsScreenContract$InputData) w2Var.f13499b;
        String str = orderDetailsScreenContract$InputData.f96968a.getF72134a().f72138b;
        if (!cp5.d.y(orderDetailsScreenContract$InputData.f96968a.getF72134a().e) || str == null) {
            rVarJust = r.just(new Data(null, null, false, 7, null));
            Intrinsics.h(rVarJust);
        } else {
            rVarJust = ((kgm.c) w2Var.f13501g).e(str);
        }
        r rVarCombineLatest = r.combineLatest(rVarT, rVarJust, new a31.e(new a09.b(w2Var, 9), 21));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(rVarCombineLatest), null, null, new v(this, continuation, 0), 3);
        int i = 1;
        yji.l.a1(this, new p(((f) w2Var.e).j(w4l.h.f294642c), i), null, null, new v(this, continuation, 1), 3);
        l2(new a3i.r(this, continuation, i), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f96976t;
    }
}
