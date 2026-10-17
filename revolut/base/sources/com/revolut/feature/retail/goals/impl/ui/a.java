package com.revolut.feature.retail.goals.impl.ui;

import android.os.Parcelable;
import c2f.m;
import c65.i;
import c9f.c;
import cab.e;
import cab.f;
import cab.g;
import cab.o;
import cli.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.goals.api.navigation.GoalsContract$Account;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.common.ui.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import oki.h;
import ppg.b;
import rnb.w;
import vkm.j2;
import yji.l;
import ypg.p;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements e {
    public final GoalsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f82654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f82655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f82656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f82657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n60.a f82658t;
    public final Long u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f82659w;

    public a(n stateMapper, GoalsControllerContract$InputData inputData, b vaultsInteractor, w savingsVaultInteractor, w80.b amountFormatter, o goalsDialogConfigProvider, n60.a keyboardControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(goalsDialogConfigProvider, "goalsDialogConfigProvider");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        this.o = inputData;
        this.f82654p = vaultsInteractor;
        this.f82655q = savingsVaultInteractor;
        this.f82656r = amountFormatter;
        this.f82657s = goalsDialogConfigProvider;
        this.f82658t = keyboardControllerExtension;
        this.u = inputData.f82651a.getF82649b();
        this.v = hx7.e.a(this, new c(this, 4));
        m70.a.c(t0.f186434a);
        this.f82659w = d.b(this, new g("", null, new Data(null, null, true, 3, null), v.l(urf.g.f282312a)), stateMapper, null, false, 12);
    }

    public static final void I2(a aVar, Throwable th10) {
        aVar.getClass();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        int i = R$string.common_error_title;
        aVar.f82657s.getClass();
        l.a1(aVar, aVar.X1(new y0("GOALS_UPDATE_ERROR_DIALOG_ID", new z(new TextLocalisedClause(i, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, null, 7);
    }

    public static final void J2(a aVar) {
        aVar.f82658t.Q();
        aVar.f82657s.getClass();
        l.a1(aVar, aVar.X1(new y0("GOALS_UPDATE_SUCCESS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_set_deadline_success_screen_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new i(aVar, null, 6), 3);
    }

    public static final Object K2(a aVar, long j2, Long l2, gim.i iVar) {
        f fVar = (f) zi0.c.I(((g) ((j2) aVar.f82659w.f22677a).getValue()).f22584c);
        GoalsContract$Account goalsContract$Account = aVar.o.f82651a;
        if (!(goalsContract$Account instanceof GoalsContract$Account.Vault)) {
            if (!(goalsContract$Account instanceof GoalsContract$Account.SavingsAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objG = aVar.f82655q.g(fVar.f22579a, fVar.f22580b, j2, l2, iVar);
            return objG == fim.a.COROUTINE_SUSPENDED ? objG : Unit.f186387a;
        }
        b bVar = aVar.f82654p;
        String id10 = fVar.f22579a;
        String name = fVar.f22580b;
        p pVar = (p) bVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Object objA = nim.a.a(((eed.n) pVar.f).d(id10, name, j2, l2), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // yji.l
    public final void I1() {
        Flow flowC;
        GoalsContract$Account goalsContract$Account = this.o.f82651a;
        boolean z = goalsContract$Account instanceof GoalsContract$Account.Vault;
        w4l.h hVar = w4l.h.f294642c;
        if (z) {
            flowC = rd0.e.b(((p) this.f82654p).j(((GoalsContract$Account.Vault) goalsContract$Account).f82648a, hVar));
        } else {
            if (!(goalsContract$Account instanceof GoalsContract$Account.SavingsAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            flowC = this.f82655q.c(((GoalsContract$Account.SavingsAccount) goalsContract$Account).f82646a, hVar);
        }
        l.a1(this, mo3.a.g(c8g.c.c(rd0.e.n(flowC, h0.f322473a), new cab.i(this, 0)), null, new m(24), 1), null, null, new c1i.f(this, (Continuation) null, 25), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f82659w;
    }
}
