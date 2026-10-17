package com.revolut.feature.revolutpay.shared.ui.account_picker;

import cli.y;
import edc.b;
import edc.g;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final y o;

    public a(AccountPickerContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, new edc.a(inputData.f84698a, inputData.f84699b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
