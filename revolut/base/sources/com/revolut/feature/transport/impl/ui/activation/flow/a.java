package com.revolut.feature.transport.impl.ui.activation.flow;

import com.revolut.camerakit.core.errors.CameraKitException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.activation.flow.TransitTicketActivationFlowContract$Step;
import com.revolut.feature.transport.impl.validation.TicketQrCodeException;
import com.revolut.feature.transport.models.transit.PurchasedTransportTicketActivationProviderParams;
import com.revolut.feature.transport.models.transit.TransitTicketActivationConfig;
import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;
import jvf.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import nii.y0;
import nii.z;
import nvf.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tp8.l;
import tvf.b;
import tvf.c;
import tvf.e;
import vkm.j2;
import vkm.q;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final TransitTicketActivationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ouf.a f92512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f92513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f92514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f92515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f92516t;
    public final j2 u;

    public a(TransitTicketActivationFlowContract$InputData inputData, ouf.a transportInteractor, f intervalExtension, d ticketQrCodeHintMapper, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(intervalExtension, "intervalExtension");
        Intrinsics.checkNotNullParameter(ticketQrCodeHintMapper, "ticketQrCodeHintMapper");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f92512p = transportInteractor;
        this.f92513q = intervalExtension;
        this.f92514r = ticketQrCodeHintMapper;
        this.f92515s = idempotencyKeyHolder;
        l lVar = new l(this, 12);
        this.f92516t = cp5.d.a(this, TransitTicketActivationFlowContract$Step.QrScanner.f92511a, f0.f322471a, lVar);
        this.u = q.c(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.transport.impl.ui.activation.flow.a r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof tvf.d
            if (r0 == 0) goto L16
            r0 = r5
            tvf.d r0 = (tvf.d) r0
            int r1 = r0.f274759w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f274759w = r1
            goto L1b
        L16:
            tvf.d r0 = new tvf.d
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274759w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L42
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            ouf.a r5 = r4.f92512p
            r0.f274759w = r3
            ivf.r r5 = (ivf.r) r5
            java.lang.Object r5 = r5.d(r3, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r4.B2()
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.transport.impl.ui.activation.flow.a.I2(com.revolut.feature.transport.impl.ui.activation.flow.a, gim.c):java.lang.Object");
    }

    public static z J2(Throwable th10) {
        int i;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "TransitTicketActivationFlowModel", null, th10, h0Var);
        if (th10 instanceof TicketQrCodeException) {
            TicketQrCodeException ticketQrCodeException = (TicketQrCodeException) th10;
            if (ticketQrCodeException instanceof TicketQrCodeException.InvalidQR) {
                i = R$string.transport_ticket_activate_error_invalid_qr_title;
            } else {
                if (!(ticketQrCodeException instanceof TicketQrCodeException.InvalidTicket) && !(ticketQrCodeException instanceof TicketQrCodeException.NoValue) && !(ticketQrCodeException instanceof TicketQrCodeException.UnsupportedResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.transport_ticket_activate_error_generic_title;
            }
        } else {
            i = th10 instanceof CameraKitException ? R$string.transport_ticket_activate_error_generic_title : R$string.transport_ticket_activate_generic_error_title;
        }
        return new z(new TextLocalisedClause(i, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    @Override // yji.l
    public final void I1() {
        this.f92515s.a("TRANSIT_IDEMPOTENCY_TAG");
    }

    public final void K2() {
        j2 j2Var;
        Object value;
        LocalDateTime localDateTime;
        do {
            j2Var = this.u;
            value = j2Var.getValue();
            ((Boolean) value).getClass();
        } while (!j2Var.h(value, Boolean.FALSE));
        TransitTicketActivationFlowContract$InputData transitTicketActivationFlowContract$InputData = this.o;
        TransitTicketActivationConfig transitTicketActivationConfig = transitTicketActivationFlowContract$InputData.f92510b;
        Long lValueOf = (transitTicketActivationConfig == null || (localDateTime = transitTicketActivationConfig.f92719c) == null) ? null : Long.valueOf(oi0.d.R(localDateTime) - ((l80.f) this.f92513q.f178880l).b().toEpochMilli());
        if ((lValueOf != null ? lValueOf.longValue() : 0L) > 0) {
            return;
        }
        PurchasedTransportTicketActivationProviderParams purchasedTransportTicketActivationProviderParams = transitTicketActivationFlowContract$InputData.f92509a.f92695t;
        Long lValueOf2 = purchasedTransportTicketActivationProviderParams != null ? Long.valueOf(purchasedTransportTicketActivationProviderParams.f92705c) : null;
        yji.l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.transport_ticket_activate_error_timeout_title, v.l(lValueOf2 != null ? jvf.a.a(lValueOf2.longValue()) : null), null, 12), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new e(this, null, 0), 3);
    }

    public final void L2(RuntimeException runtimeException) {
        yji.l.a1(this, X1(new y0(null, J2(runtimeException), false, 5)), null, null, new e(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        LocalDateTime localDateTime;
        TransitTicketActivationConfig transitTicketActivationConfig = this.o.f92510b;
        f fVar = this.f92513q;
        Long lValueOf = (transitTicketActivationConfig == null || (localDateTime = transitTicketActivationConfig.f92719c) == null) ? null : Long.valueOf(oi0.d.R(localDateTime) - ((l80.f) fVar.f178880l).b().toEpochMilli());
        if (lValueOf != null) {
            b3.b func = new b3.b(this, lValueOf.longValue(), 3);
            fVar.getClass();
            Intrinsics.checkNotNullParameter(func, "func");
            Job job2 = fVar.f178881m;
            if (job2 != null) {
                job2.f(null);
            }
            fVar.f178881m = (Job) func.invoke();
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f92516t;
    }
}
