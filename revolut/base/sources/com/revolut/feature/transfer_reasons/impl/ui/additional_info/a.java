package com.revolut.feature.transfer_reasons.impl.ui.additional_info;

import cli.g;
import cli.y;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import g2e.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import xpe.c;
import xsf.m;
import xsf.p;
import xsf.r;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements p {
    public final TransferReasonsAdditionalInfoScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f92380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f92381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f92382r;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(cli.n r11, com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$InputData r12, g2e.t r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.transfer_reasons.impl.ui.additional_info.a.<init>(cli.n, com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$InputData, g2e.t):void");
    }

    public final void I2(AdditionalInfoField field) {
        Intrinsics.checkNotNullParameter(field, "field");
        y yVar = this.f92381q;
        Object rVar = ((m) ((j2) yVar.f22677a).getValue()).f308472c.get(field);
        if (rVar == null) {
            rVar = new r(false);
        }
        H2(yVar, new c(field, new r(!((r) rVar).f308479a), 12));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f92382r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f92381q;
    }
}
