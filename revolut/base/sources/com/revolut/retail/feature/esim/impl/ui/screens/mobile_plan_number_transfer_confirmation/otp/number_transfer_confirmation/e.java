package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation;

import a26.q;
import aw0.o9;
import be7.s;
import blj.j;
import blj.p;
import blj.r;
import blj.w;
import cli.g;
import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep;
import dce.s0;
import dfj.q1;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pfj.i;
import skm.a2;
import vkm.j2;
import vkm.v1;
import wli.x;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends h implements j {

    @NotNull
    public static final p Companion = new p();
    public final EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1 f101302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f101303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f101304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f101305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f101306t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public e(n stateMapper, EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData inputData, q1 phoneNumberPortingInteractor, x deeplinkHandler, w portingStatusDialogConfig) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberPortingInteractor, "phoneNumberPortingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(portingStatusDialogConfig, "portingStatusDialogConfig");
        this.o = inputData;
        this.f101302p = phoneNumberPortingInteractor;
        this.f101303q = deeplinkHandler;
        this.f101304r = portingStatusDialogConfig;
        this.f101306t = mra.d.b(this, new blj.h(null, new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new bhi.c(this, 7));
    }

    public static void J2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanOtpNumberTransferConfirmationScreenModel", null, illegalStateException, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        i iVar = (i) ((blj.h) ((j2) this.f101306t.f22677a).getValue()).f16709b.getContent();
        String portingId = this.o.e;
        q1 q1Var = this.f101302p;
        q1Var.getClass();
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        Continuation continuation = null;
        l.a1(this, t1.E(new v1(new s0(q1Var, portingId, continuation, 2))), null, null, new q(this, iVar, continuation, 20), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    public final void K2(Object obj2) {
        if (obj2 instanceof EsimDescriptorValue.Link) {
            l2(new r(this, obj2, null), new yi5.b(26));
            return;
        }
        if ((obj2 instanceof EsimDescriptorValue.Action) && ((EsimDescriptorValue.Action) obj2).f100252a == dej.s0.TRACK_PORTABILITY) {
            EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.o.d;
            if (esimCheckoutPortingSteps == null) {
                J2("Porting progress is null");
                return;
            }
            TextClause textClause = new TextClause(esimCheckoutPortingSteps.f100193a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = esimCheckoutPortingSteps.f100194b;
            h.v2(this.u, new EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, esimCheckoutPortingSteps.f100195c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    public final void L2(Instant instant) {
        if (instant == null) {
            return;
        }
        a2 a2Var = this.f101305s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f101305s = l2(new s(this, instant, continuation, 13), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f101306t;
    }
}
