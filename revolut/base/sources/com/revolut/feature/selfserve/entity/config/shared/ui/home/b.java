package com.revolut.feature.selfserve.entity.config.shared.ui.home;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.selfserve.entity.config.shared.models.EntityAction;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import esa.i;
import ewh.x;
import eyc.c;
import eyc.o;
import eyc.p;
import eyc.s;
import h60.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rd0.e;
import rp0.l0;
import skm.a2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements p {
    public final EntityHomeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bal.a f85851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y9l.a f85852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f80.a f85853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f85854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final use.d f85855t;
    public final l0 u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f85856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f85857x;

    public b(EntityHomeScreenContract$InputData inputData, bal.a entityConfigRepository, y9l.a entityConfigActionControllerExtension, f80.a uriHelper, d animationControllerExtension, use.d ticketsInteractor, l0 popupMenuDialogDisplayer, c popupMenuUiMapper, n mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(entityConfigRepository, "entityConfigRepository");
        Intrinsics.checkNotNullParameter(entityConfigActionControllerExtension, "entityConfigActionControllerExtension");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(animationControllerExtension, "animationControllerExtension");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(popupMenuUiMapper, "popupMenuUiMapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f85851p = entityConfigRepository;
        this.f85852q = entityConfigActionControllerExtension;
        this.f85853r = uriHelper;
        this.f85854s = animationControllerExtension;
        this.f85855t = ticketsInteractor;
        this.u = popupMenuDialogDisplayer;
        this.v = popupMenuUiMapper;
        this.f85856w = mra.d.b(this, new eyc.n(new Data(null, null, true, 3, null), inputData.getF85847a(), false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        EntityHomeScreenContract$InputData entityHomeScreenContract$InputData = this.o;
        Continuation continuation = null;
        EntityHomeScreenContract$InputData.Params params = entityHomeScreenContract$InputData instanceof EntityHomeScreenContract$InputData.Params ? (EntityHomeScreenContract$InputData.Params) entityHomeScreenContract$InputData : null;
        EntityConfigRepository$Params entityConfigRepository$Params = params != null ? params.f85846b : null;
        if (entityConfigRepository$Params instanceof EntityConfigRepository$Params.Ticket) {
            l2(new i(this, ((EntityConfigRepository$Params.Ticket) entityConfigRepository$Params).f104894a, continuation, 11), new x(10));
        }
        l.a1(this, this.f85852q.b3(), null, null, new ev7.b(this, continuation, 8), 3);
        l.a1(this, e.b(this.u.f256113c), null, null, new s(this, null), 3);
    }

    public final void I2(Object obj2) {
        FincrimeHomeScreenAction fincrimeHomeScreenAction = obj2 instanceof FincrimeHomeScreenAction ? (FincrimeHomeScreenAction) obj2 : null;
        if (fincrimeHomeScreenAction == null) {
            return;
        }
        this.f85852q.Z2(fincrimeHomeScreenAction);
    }

    public final void J2(Object obj2) {
        if (obj2 instanceof SectionContent.FaqCell) {
            C2(new o(((SectionContent.FaqCell) obj2).f64171b));
            return;
        }
        String str = obj2 instanceof EntityAction ? ((EntityAction) obj2).d : obj2 instanceof SectionContent.TransactionCell ? ((SectionContent.TransactionCell) obj2).f64193j : obj2 instanceof SectionContent.ActionCell ? ((SectionContent.ActionCell) obj2).f : obj2 instanceof SectionContent.NumberedActionCell ? ((SectionContent.NumberedActionCell) obj2).f : obj2 instanceof SectionContent.ButtonCell ? ((SectionContent.ButtonCell) obj2).f64163b : null;
        if (str == null) {
            return;
        }
        C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) this.f85853r).f(str), 0, null, 494));
    }

    public final void K2() {
        a2 a2Var = this.f85857x;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        EntityHomeScreenContract$InputData entityHomeScreenContract$InputData = this.o;
        boolean z = entityHomeScreenContract$InputData instanceof EntityHomeScreenContract$InputData.Params;
        y yVar = this.f85856w;
        if (z) {
            H2(yVar, new x(12));
            this.f85857x = l.a1(this, e.b(ue0.e.p(((ayc.i) this.f85851p).b(((EntityHomeScreenContract$InputData.Params) entityHomeScreenContract$InputData).f85846b, true), h0.f322473a)), null, null, new ew1.d(this, continuation, 12), 3);
        } else {
            if (!(entityHomeScreenContract$InputData instanceof EntityHomeScreenContract$InputData.ScreenContent)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new eu7.c(this, 19));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        K2();
    }

    @Override // cli.z
    public final g getState() {
        return this.f85856w;
    }
}
