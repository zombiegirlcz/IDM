package com.revolut.feature.kyc.impl.cmd.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.cmd.flow.CmdFlowContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import qki.d;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements pu8.b {
    public final CmdFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ou8.a f77607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f77608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f77609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f77610s;

    public b(CmdFlowContract$InputData inputData, ou8.a dialogProvider, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f77607p = dialogProvider;
        this.f77608q = uriHelper;
        this.f77609r = e.b(this, new CmdFlowContract$State(false));
        pu4.d dVar = new pu4.d(this, 1);
        this.f77610s = cp5.d.a(this, CmdFlowContract$Step.Portal.f77606a, f0.f322471a, dVar);
    }

    public final void I2() {
        this.f77607p.getClass();
        l.a1(this, X1(new y0("CMD_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_cmd_error_unrecoverable_description, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_common_action_continue, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new pnb.b(this, null, 15), 3);
    }

    @Override // qki.e
    public final d getState() {
        return this.f77609r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77610s;
    }
}
