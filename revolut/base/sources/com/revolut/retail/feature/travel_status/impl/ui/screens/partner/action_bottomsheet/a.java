package com.revolut.retail.feature.travel_status.impl.ui.screens.partner.action_bottomsheet;

import cli.y;
import j2l.f;
import j2l.g;
import j2l.j;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements g {
    public final y o;

    public a(TravelStatusPartnerActionBottomSheetScreenContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, new f(inputData.f104324a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
