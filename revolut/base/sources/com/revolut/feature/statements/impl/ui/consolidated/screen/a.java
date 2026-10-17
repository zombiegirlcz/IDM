package com.revolut.feature.statements.impl.ui.consolidated.screen;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.StatementsMode;
import i0e.e;
import i0e.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import n0e.b;
import oki.h;
import pzd.a0;
import pzd.g;
import pzd.o;
import pzd.p;
import pzd.z;
import vkm.j2;
import vkm.q;
import vkm.q0;
import wkm.l;
import zhm.f0;
import zhm.h0;
import zxd.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements o {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f88316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f88317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f88318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vyd.a f88319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hk0.a f88320t;
    public final gte.a u;
    public final j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f88321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f88322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88323y;

    public a(g statementsProvider, c statementsInteractor, e periodSelector, b statementsNaviCommandsFactory, vyd.a dialogModelConfigurationFactory, hk0.a networkFileRepository, gte.a featureToggleInteractor, ConsolidatedStatementScreenContract$InputData inputData, n mapper) {
        boolean z;
        pzd.n nVar;
        Intrinsics.checkNotNullParameter(statementsProvider, "statementsProvider");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(periodSelector, "periodSelector");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = statementsProvider;
        this.f88316p = statementsInteractor;
        this.f88317q = periodSelector;
        this.f88318r = statementsNaviCommandsFactory;
        this.f88319s = dialogModelConfigurationFactory;
        this.f88320t = networkFileRepository;
        this.u = featureToggleInteractor;
        h0 h0Var = h0.f322473a;
        this.v = q.c(h0Var);
        this.f88321w = q.c(h0Var);
        v vVar = new v(f0.f322471a);
        pzd.q qVar = pzd.q.PDF;
        StatementsMode mode = inputData.f88313a.f88295a;
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z3 = mode instanceof StatementsMode.Consolidated;
        StatementsMode.BankIDAnnualStatements bankIDAnnualStatements = StatementsMode.BankIDAnnualStatements.f88212a;
        if (z3) {
            z = true;
        } else {
            if (!(mode instanceof StatementsMode.TaxCertificate) && !(mode instanceof StatementsMode.TaxFiling) && !Intrinsics.f(mode, bankIDAnnualStatements)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        StatementsMode mode2 = inputData.f88313a.f88295a;
        Intrinsics.checkNotNullParameter(mode2, "mode");
        if (mode2 instanceof StatementsMode.Consolidated) {
            nVar = pzd.n.FILTER;
        } else {
            if (!(mode2 instanceof StatementsMode.TaxCertificate) && !(mode2 instanceof StatementsMode.TaxFiling)) {
                if (!Intrinsics.f(mode2, bankIDAnnualStatements)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException(mode2 + " not supported");
            }
            nVar = pzd.n.NONE;
        }
        this.f88322x = d.b(this, new p(h0Var, vVar, null, null, qVar, z, nVar, new Data(null, null, true, 3, null), inputData.f88313a), mapper, null, false, 12);
        this.f88323y = hx7.e.a(this, new pu4.d(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        l lVarQ;
        Continuation continuation = null;
        l2(new pzd.y(1, this, continuation), new yi5.b(26));
        l2(new pzd.y(0, this, continuation), new yi5.b(26));
        if (((jte.d) this.u).c(StatementsApi$FeatureToggles.ConsolidatedStatementV2Period.f88208c)) {
            lVarQ = q.Q(this.f88321w, new z(0, this, continuation));
        } else {
            lVarQ = q.Q(new q0(this.v, new a0(3, this, continuation), 1), new z(1, this, continuation));
        }
        yji.l.a1(this, lVarQ, null, null, new a0(0, this, continuation), 3);
        i0e.q qVar = (i0e.q) this.f88317q;
        yji.l.a1(this, qVar.f157383p, null, null, new a0(1, this, continuation), 3);
        yji.l.a1(this, qVar.f157384q, null, null, new a0(2, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88323y;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f88322x;
    }
}
