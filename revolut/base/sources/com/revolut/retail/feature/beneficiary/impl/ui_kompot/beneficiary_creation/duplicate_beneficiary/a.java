package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import t4j.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {
    public final y o;

    public a(b stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
