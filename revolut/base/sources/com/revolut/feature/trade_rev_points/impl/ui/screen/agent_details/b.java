package com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.kompot.common.R$string;
import dt4.p;
import e2f.a0;
import e2f.d0;
import e2f.f0;
import e2f.s;
import e2f.u;
import e2f.x;
import java.util.concurrent.CopyOnWriteArrayList;
import jwb.e;
import k18.c;
import kl.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.y0;
import nii.z;
import nyb.m0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qr0.i;
import tsk.t;
import u2f.j;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements x {

    @NotNull
    private static final a0 Companion = new a0();
    public final y A;
    public final com.revolut.kompot.navigable.vc.modal.a B;
    public final TradeRevPointsAgentDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f91148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mub.b f91149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f91150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f91151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nne.b f91152t;
    public final b0 u;
    public final m0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f91153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mre.c f91154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f91155y;
    public final vii.b z;

    public b(n stateMapper, TradeRevPointsAgentDetailsScreenContract$InputData inputData, i agentsInteractor, mub.b revPointsPillControllerModelExtension, e revPointsGiftcardsInteractor, t accountsInteractor, nne.b taxExemptionInteractor, b0 errorDialogFactory, m0 revPointsTransactionsInteractor, c featureInteractor, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(agentsInteractor, "agentsInteractor");
        Intrinsics.checkNotNullParameter(revPointsPillControllerModelExtension, "revPointsPillControllerModelExtension");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(taxExemptionInteractor, "taxExemptionInteractor");
        Intrinsics.checkNotNullParameter(errorDialogFactory, "errorDialogFactory");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = inputData;
        this.f91148p = agentsInteractor;
        this.f91149q = revPointsPillControllerModelExtension;
        this.f91150r = revPointsGiftcardsInteractor;
        this.f91151s = accountsInteractor;
        this.f91152t = taxExemptionInteractor;
        this.u = errorDialogFactory;
        this.v = revPointsTransactionsInteractor;
        this.f91153w = featureInteractor;
        this.f91154x = termsNavigationFactory;
        this.f91155y = new vii.b();
        this.z = new vii.b();
        this.A = d.b(this, new e2f.n(0), stateMapper, null, false, 12);
        this.B = hx7.e.a(this, new p(this, 22));
    }

    public static y0 I2() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Something is not working correctly in TradeRevPointsAgentDetailsScreen, please check the stacktrace");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, true, null, null, null, null, null, null, 32510), false, 5);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f91155y, new d0(2, this, continuation)), null, null, new f0(0, this, null), 3);
        l.a1(this, rd0.e.b(((lzb.a) this.f91149q).Z2()), null, null, new f0(1, this, null), 3);
        if (this.o.f91138b == j.TRAINS_POINTS && this.f91153w.v()) {
            l.a1(this, q.Q(this.z, new d0(1, this, continuation)), null, null, new f0(2, this, null), 3);
        }
    }

    public final void J2() {
        y yVar = this.A;
        Object content = ((e2f.n) ((j2) yVar.f22677a).getValue()).f122075a.getContent();
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        u2f.d dVar = (u2f.d) content;
        Object content2 = ((e2f.n) ((j2) yVar.f22677a).getValue()).d.getContent();
        if (content2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        od0.i iVar = (od0.i) content2;
        if (iVar.d()) {
            C2(new u((TradeRevPointsAccount) iVar.c(), dVar.f276617a));
            return;
        }
        if (e2f.b0.f122057b[dVar.f276624m.f276641g.ordinal()] != 1) {
            C2(new s(dVar));
        } else {
            l2(new ds4.y(this, null, 20), new e2f.z(this, 0));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.B;
    }

    @Override // cli.z
    public final g getState() {
        return this.A;
    }
}
