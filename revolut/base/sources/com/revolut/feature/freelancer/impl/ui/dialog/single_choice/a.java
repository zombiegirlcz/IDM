package com.revolut.feature.freelancer.impl.ui.dialog.single_choice;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mw6.f;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements f {
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
