package com.fourthline.orca.internal;

import com.fourthline.orca.internal.dj0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.internal.z11;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n31 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f31320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c80 f31321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p80 f31322c;
    private final q80 d;

    public n31(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        this.f31320a = navigationChannel;
        this.f31321b = new c80("biometrics");
        p80 p80Var = new p80(true, true, false, new sp0(new q80.v.a(null, 1, null), true, false, 4, null), 4, null);
        this.f31322c = p80Var;
        this.d = new q80.v.a(p80Var);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f31321b;
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof z11.a) {
            return a((z11.a) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f31320a.mo3647trySendJP2dKIU(a(navigationEffect));
    }

    private final q80 a(z11.a aVar) {
        if (aVar instanceof z11.a.C0320a) {
            return new q80.l(ui0.a.f34101a);
        }
        if (aVar instanceof z11.a.d) {
            return b();
        }
        if (aVar instanceof z11.a.c) {
            return new q80.m(new dj0.b(((z11.a.c) aVar).d()));
        }
        if (aVar instanceof z11.a.b) {
            return new q80.l(((z11.a.b) aVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
