package com.revolut.feature.profile.impl.ui.close_account;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mma.d;
import nii.y0;
import nii.z;
import ofm.q;
import oki.h;
import org.jetbrains.annotations.NotNull;
import v60.e;
import wik.m;
import wli.x;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements mma.b {

    @NotNull
    private static final d Companion = new d();
    public final SelfTerminationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f81358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f81359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f81360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf0.h f81361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f81362t;
    public final i u;

    public c(SelfTerminationFlowContract$InputData inputData, t pricingPlanInteractor, m pricingPlanOffersInteractor, x deeplinkHandler, sf0.h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.o = inputData;
        this.f81358p = pricingPlanInteractor;
        this.f81359q = pricingPlanOffersInteractor;
        this.f81360r = deeplinkHandler;
        this.f81361s = serverErrorParser;
        this.f81362t = serverErrorsProvider;
        this.u = d8l.d.a(this, new m84.e(this, 26));
    }

    public final void I2() {
        l2(new mci.e(this, null, 12), new mm7.h(1, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 13));
    }

    public final Flow J2(Throwable th10) {
        ServerError serverErrorA = this.f81361s.a(th10);
        v60.d dVarB = ((ao0.a) this.f81362t).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
        if (dVarB == null) {
            dVarB = new v60.b();
        }
        return X1(new y0(null, new z(q.O(dVarB), null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new mm7.h(1, this, c.class, "handleInitialisationError", "handleInitialisationError(Ljava/lang/Throwable;)Z", 0, 12));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
