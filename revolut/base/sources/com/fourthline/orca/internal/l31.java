package com.fourthline.orca.internal;

import com.fourthline.orca.internal.dj0;
import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.internal.tg;
import com.fourthline.orca.internal.xf;
import com.fourthline.vision.document.DocumentScannerResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l31 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f30512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg f30513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f30514c;
    private final p80 d;
    private final q80 e;

    public l31(o80 navigationChannel, bg bundle, c80 analyticsContext) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        this.f30512a = navigationChannel;
        this.f30513b = bundle;
        this.f30514c = analyticsContext;
        p80 p80Var = new p80(true, true, false, new sp0(new q80.g.a(null, 1, null), true, false), 4, null);
        this.d = p80Var;
        this.e = new q80.g.a(p80Var);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f30514c;
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof io.a) {
            return a((io.a) navigationEffect);
        }
        if (navigationEffect instanceof xf) {
            return a((xf) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f30512a.mo3647trySendJP2dKIU(a(navigationEffect));
    }

    private final q80 a(io.a aVar) {
        if (aVar instanceof io.a.C0218a) {
            return new q80.l(si.c.f33020a);
        }
        if (aVar instanceof io.a.d) {
            if (((io.a.d) aVar).c() instanceof zi) {
                return new q80.h.b(new p80(false, false, false, new sp0(new q80.h.d(null, 1, null), true, false, 4, null), 7, null));
            }
            DocumentScannerResult documentScannerResultA = this.f30513b.a();
            if (documentScannerResultA != null) {
                return new q80.m(new dj0.a(new ym(documentScannerResultA, null, 2, null)));
            }
            throw new IllegalStateException("FL developer error. Expected DocumentScannerResult at this moment.");
        }
        if (aVar instanceof io.a.c) {
            return new q80.l(((io.a.c) aVar).c());
        }
        if (!(aVar instanceof io.a.b) && !(aVar instanceof io.a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Such actions are not possible in standalone mode!");
    }

    private final q80 a(xf xfVar) {
        if (Intrinsics.f(xfVar, xf.a.f34969a)) {
            return new q80.l(si.c.f33020a);
        }
        if (xfVar instanceof xf.d) {
            DocumentScannerResult documentScannerResultA = this.f30513b.a();
            if (documentScannerResultA != null) {
                tg tgVarC = this.f30513b.c();
                return new q80.m(new dj0.a(new ym(documentScannerResultA, tgVarC instanceof tg.a ? (tg.a) tgVarC : null)));
            }
            throw new IllegalStateException("FL developer error. Expected DocumentScannerResult at this moment.");
        }
        if (xfVar instanceof xf.c) {
            return new q80.l(new si.a(((xf.c) xfVar).c()));
        }
        if (xfVar instanceof xf.b) {
            return new q80.l(new si.a(((xf.b) xfVar).c()));
        }
        if (xfVar instanceof xf.e) {
            return new q80.l(new si.a(((xf.e) xfVar).c()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
