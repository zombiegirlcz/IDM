package com.fourthline.orca.internal;

import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.kp0;
import com.fourthline.orca.internal.q80;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gm0 extends n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o80 f28934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f28935c;
    private final p80 d;

    public gm0(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        this.f28934b = navigationChannel;
        this.f28935c = new c80("poa");
        this.d = new p80(true, true, false, new sp0(new q80.t.d(null, 1, null), true, false), 4, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f28935c;
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f28934b.mo3647trySendJP2dKIU(a(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.n2
    public q80 c() {
        return new q80.t.d(this.d);
    }

    @Override // com.fourthline.orca.internal.n2
    public q80 a(io.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof io.a.C0218a) {
            return new q80.b(null, 1, null);
        }
        if (aVar instanceof io.a.d) {
            io.a.d dVar = (io.a.d) aVar;
            return dVar.c() instanceof kp0.a ? new q80.t.e(null, 1, null) : new q80.k(null, ly.a(dVar.c()), 1, null);
        }
        if ((aVar instanceof io.a.c) || (aVar instanceof io.a.e) || (aVar instanceof io.a.b)) {
            throw new IllegalStateException("Developer error. Not part of Proof of Address flow");
        }
        throw new NoWhenBranchMatchedException();
    }
}
