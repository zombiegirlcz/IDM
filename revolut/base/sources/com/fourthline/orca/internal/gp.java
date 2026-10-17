package com.fourthline.orca.internal;

import com.fourthline.orca.internal.fp;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.hr;
import com.fourthline.orca.internal.oq;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.xh;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gp implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f28958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f28959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aq0 f28960c;
    private final boolean d;
    private final c80 e;
    private final q80 f;

    public gp(o80 navigationChannel, Function0 showPermissionRationaleUseCase, aq0 popupHandler, boolean z, c80 analyticsContext) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        this.f28958a = navigationChannel;
        this.f28959b = showPermissionRationaleUseCase;
        this.f28960c = popupHandler;
        this.d = z;
        this.e = analyticsContext;
        this.f = z ? new q80.i.a(null, 1, null) : q80.i.b.f32262b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(gp gpVar, q80.k kVar) {
        gpVar.f28958a.mo3647trySendJP2dKIU(kVar);
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.e;
    }

    private final q80 c() {
        aq0.a(this.f28960c, hq0.b.f29374a, new ul1(this, 12), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof o30) {
            return c();
        }
        if (navigationEffect instanceof y30) {
            y30 y30Var = (y30) navigationEffect;
            if (!(y30Var.c() instanceof fp.c)) {
                return new q80.i.a(null, 1, null);
            }
            ny nyVarA = ly.a(y30Var.c());
            q80.k kVar = new q80.k(null, nyVarA, 1, null);
            if (!a(nyVarA) || !((Boolean) this.f28959b.invoke()).booleanValue()) {
                return kVar;
            }
            aq0.a(this.f28960c, hq0.a.f29371a, new om1(this, kVar, 0), null, 4, null);
            return new q80.o(null, 1, null);
        }
        if (navigationEffect instanceof xh) {
            return a((xh) navigationEffect);
        }
        if (navigationEffect instanceof oq) {
            return a((oq) navigationEffect);
        }
        if (navigationEffect instanceof hr) {
            return a((hr) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(gp gpVar, q80.k kVar) {
        gpVar.f28958a.mo3647trySendJP2dKIU(kVar);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gp gpVar, q80.k kVar) {
        gpVar.f28958a.mo3647trySendJP2dKIU(kVar);
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(fq navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f28958a.mo3647trySendJP2dKIU(a((ee1) navigationEffect));
    }

    private final q80 a(xh xhVar) {
        if (xhVar instanceof xh.a) {
            return new q80.b(null, 1, null);
        }
        if (xhVar instanceof xh.c) {
            return new q80.i.c(null, 1, null);
        }
        if (xhVar instanceof xh.b) {
            return new q80.l(((xh.b) xhVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(oq oqVar) {
        if (oqVar instanceof oq.a) {
            return new q80.b(null, 1, null);
        }
        if (oqVar instanceof oq.c) {
            oq.c cVar = (oq.c) oqVar;
            if (cVar.c() instanceof fp.b) {
                return q80.i.d.f32266b;
            }
            ny nyVarA = ly.a(cVar.c());
            q80.k kVar = new q80.k(null, nyVarA, 1, null);
            if (!a(nyVarA) || !((Boolean) this.f28959b.invoke()).booleanValue()) {
                return kVar;
            }
            aq0.a(this.f28960c, hq0.a.f29371a, new om1(this, kVar, 1), null, 4, null);
            return new q80.o(null, 1, null);
        }
        if (oqVar instanceof oq.b) {
            return new q80.l(((oq.b) oqVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(hr hrVar) {
        if (hrVar instanceof hr.a) {
            return new q80.b(null, 1, null);
        }
        if (hrVar instanceof hr.b) {
            q80.k kVar = new q80.k(null, ly.a(((hr.b) hrVar).c()), 1, null);
            if (!((Boolean) this.f28959b.invoke()).booleanValue()) {
                return kVar;
            }
            aq0.a(this.f28960c, hq0.a.f29371a, new om1(this, kVar, 2), null, 4, null);
            return new q80.o(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(gp gpVar) {
        gpVar.f28958a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }

    private final boolean a(ny nyVar) {
        return nyVar instanceof qo;
    }
}
