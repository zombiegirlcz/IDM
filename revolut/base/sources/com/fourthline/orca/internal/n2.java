package com.fourthline.orca.internal;

import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.q80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class n2 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p80 f31315a = new p80(true, true, false, new sp0(new q80.h.d(null, 1, null), true, false), 4, null);

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof io.a) {
            return a((io.a) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    public abstract q80 a(io.a aVar);

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return c();
    }

    public abstract q80 c();
}
