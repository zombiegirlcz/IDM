package com.revolut.core.ui_kit_core.displayers.haptic;

import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r70.e;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements xy0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r70.c f59781a;

    public b(r70.c hapticEngine) {
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        this.f59781a = hapticEngine;
    }

    public final void a(Haptic.Effect haptic) {
        Intrinsics.checkNotNullParameter(haptic, "haptic");
        r70.c cVar = this.f59781a;
        if (haptic == null) {
            if (!Intrinsics.f(haptic, Haptic.OneShot.f59779a)) {
                throw new NoWhenBranchMatchedException();
            }
            r70.c.b(cVar, 3);
            return;
        }
        boolean z = haptic.f59778b;
        int i = a.f59780a[haptic.f59777a.ordinal()];
        if (i == 1) {
            ((e) cVar).c(r70.b.SHORT, z);
        } else if (i == 2) {
            ((e) cVar).c(r70.b.PULSE, z);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ((e) cVar).c(r70.b.DEEP, z);
        }
    }
}
