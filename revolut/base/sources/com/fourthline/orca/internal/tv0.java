package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.qv0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tv0 implements yc {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (Intrinsics.f(navigationEffect, qv0.a.f32545a)) {
            return new q80.b(null, 1, 0 == true ? 1 : 0);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
