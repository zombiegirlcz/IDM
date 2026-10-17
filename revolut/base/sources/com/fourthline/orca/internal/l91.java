package com.fourthline.orca.internal;

import com.fourthline.orca.internal.i91;
import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.q80;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l91 extends n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o80 f30550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f30551c;
    private final p80 d;
    private final p80 e;

    public l91(o80 navigationChannel) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        this.f30550b = navigationChannel;
        this.f30551c = new c80("tin");
        this.d = new p80(false, false, false, new sp0(q80.x.b.f32342b, false, false, 4, null), 7, null);
        this.e = new p80(true, true, false, new sp0(new q80.x.c(null, 1, null), true, false), 4, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f30551c;
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (!(navigationEffect instanceof io.a)) {
            throw new IllegalStateException("Developer error. Not part of TIN flow");
        }
        this.f30550b.mo3647trySendJP2dKIU(a((io.a) navigationEffect));
    }

    @Override // com.fourthline.orca.internal.n2
    public q80 c() {
        return new q80.x.c(this.e);
    }

    @Override // com.fourthline.orca.internal.n2
    public q80 a(io.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof io.a.C0218a) {
            return new q80.b(null, 1, null);
        }
        if (aVar instanceof io.a.d) {
            io.a.d dVar = (io.a.d) aVar;
            ky kyVarC = dVar.c();
            return kyVarC instanceof i91.c ? new q80.x.a(this.d) : kyVarC instanceof i91.a ? new q80.x.d(null, 1, null) : new q80.k(null, ly.a(dVar.c()), 1, null);
        }
        if ((aVar instanceof io.a.c) || (aVar instanceof io.a.e) || (aVar instanceof io.a.b)) {
            throw new IllegalStateException("Developer error. Not part of TIN flow");
        }
        throw new NoWhenBranchMatchedException();
    }
}
