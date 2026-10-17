package com.revolut.feature.pix.impl.flow.refund;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.refund.PixRefundFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import d8l.d;
import eul.f;
import fca.b;
import fca.c;
import java.time.Instant;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.y0;
import nii.z;
import oki.h;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f80735p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f80735p = d.a(this, new f(this, 27));
    }

    @Override // yki.j
    public final void M0() {
        FlowStep review;
        c cVar = this.o;
        dj0.d dVar = cVar.e;
        dj0.d dVar2 = cVar.f133675c;
        xi0.b bVar = dVar.f115083b;
        xi0.b.Companion.getClass();
        xi0.b bVar2 = xi0.b.D;
        Continuation continuation = null;
        if (!Intrinsics.f(bVar, bVar2) || !Intrinsics.f(dVar2.f115083b, bVar2)) {
            l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.pix_refund_dialog_currency_not_supported, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new ev7.b(this, continuation, 24), 3);
            return;
        }
        if (cVar.f133676g) {
            review = new PixRefundFlowContract$Step.Amount(cVar.f133673a, cVar.f133674b, dVar2, cVar.d);
        } else {
            dj0.d dVar3 = cVar.e;
            String str = cVar.f133674b;
            String str2 = cVar.f133673a;
            Instant instant = cVar.f;
            m70.a.c(t0.f186434a);
            review = new PixRefundFlowContract$Step.Review(dVar3, dVar3, str, str2, "", instant);
        }
        h.u2(this, this.f80735p, review, null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80735p;
    }
}
