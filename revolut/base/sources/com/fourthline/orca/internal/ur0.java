package com.fourthline.orca.internal;

import com.fourthline.orca.internal.gt0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.qr0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ur0 implements yc {
    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof qr0.b) {
            qr0.b bVar = (qr0.b) navigationEffect;
            gt0 gt0VarC = bVar.c();
            if (gt0VarC instanceof gt0.b) {
                return q80.u.g.f32330b;
            }
            if (gt0VarC instanceof gt0.a) {
                return new q80.k(null, ly.a(bVar.c()), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.f(navigationEffect, qr0.c.f32520a)) {
            return q80.u.d.f32324b;
        }
        if (Intrinsics.f(navigationEffect, qr0.a.f32518a)) {
            return new q80.d(null, 1, null);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
