package com.revolut.feature.kyc.impl.idnow.eid.flow;

import at8.c;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.idnow.eid.flow.IdnowEidFlowContract$Step;
import cp5.d;
import dt4.p;
import dw8.b;
import dw8.e;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final IdnowEidFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cw8.a f77780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f77781q;

    public a(IdnowEidFlowContract$InputData inputData, cw8.a dialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f77780p = dialogProvider;
        p pVar = new p(this, 7);
        this.f77781q = d.a(this, IdnowEidFlowContract$Step.InstallFeature.f77778a, f0.f322471a, pVar);
    }

    public final void I2(dw8.d dVar) {
        C2(new c(dVar.name()));
    }

    public final void J2(dw8.d dVar) {
        this.f77780p.getClass();
        l.a1(this, X1(new y0("IDNOW_EID_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.kyc_vendors_idnow_eid_error_invalid_card_title, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_idnow_eid_error_invalid_card_description, null, null, 14), new TextLocalisedClause(R$string.common_action_try_again, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_idnow_eid_error_skip, null, null, 14), null, null, false, null, null, null, null, null, null, 32724), false, 4)), null, null, new e(this, dVar, null, 1), 3);
    }

    public final void K2(dw8.d dVar) {
        this.f77780p.getClass();
        l.a1(this, X1(cw8.a.a()), null, null, new e(this, dVar, null, 2), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77781q;
    }
}
