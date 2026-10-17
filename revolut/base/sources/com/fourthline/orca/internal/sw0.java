package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ow0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.qes.internal.error.QesError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sw0 implements yc {
    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (Intrinsics.f(navigationEffect, ow0.c.b.f31780a)) {
            return new q80.l(QesError.Canceled.INSTANCE);
        }
        if (navigationEffect instanceof ow0.c.C0259c) {
            return new q80.k(null, ly.a(((ow0.c.C0259c) navigationEffect).c()), 1, null);
        }
        if (Intrinsics.f(navigationEffect, ow0.c.a.f31779a)) {
            return new q80.u.a(null, 1, null);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
