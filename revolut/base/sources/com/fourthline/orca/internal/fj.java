package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bn;
import com.fourthline.orca.internal.hi;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.io;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.internal.xf;
import com.fourthline.orca.kyc.internal.error.KycErrorKt;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fj implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f28530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f28531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f28532c;
    private final aq0 d;
    private final boolean e;
    private final c80 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p80 f28533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p80 f28534h;
    private final p80 i;

    public fj(o80 navigationChannel, Function0 didNfcCanUseCase, Function0 showPermissionRationaleUseCase, aq0 popupHandler, boolean z, c80 analyticsContext) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(didNfcCanUseCase, "didNfcCanUseCase");
        Intrinsics.checkNotNullParameter(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        this.f28530a = navigationChannel;
        this.f28531b = didNfcCanUseCase;
        this.f28532c = showPermissionRationaleUseCase;
        this.d = popupHandler;
        this.e = z;
        this.f = analyticsContext;
        this.f28533g = new p80(true, true, false, new sp0(new q80.g.a(null, 1, null), true, false), 4, null);
        this.f28534h = new p80(false, false, false, new sp0(new q80.h.d(null, 1, null), true, false, 4, null), 7, null);
        this.i = new p80(false, false, false, new sp0(new q80.h.b(null, 1, null), true, false, 4, null), 7, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof io.a) {
            return a((io.a) navigationEffect);
        }
        if (navigationEffect instanceof bn) {
            return a((bn) navigationEffect);
        }
        if (navigationEffect instanceof xf) {
            return a((xf) navigationEffect);
        }
        if (navigationEffect instanceof hi) {
            return a((hi) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return ((Boolean) this.f28531b.invoke()).booleanValue() ? q80.h.c.f32254b : new q80.h.d(this.f28533g);
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f28530a.mo3647trySendJP2dKIU(a(navigationEffect));
    }

    private final q80 a(bn bnVar) {
        if (bnVar instanceof bn.a) {
            return new q80.d(null, 1, null);
        }
        if (bnVar instanceof bn.b) {
            q80.h.d dVar = new q80.h.d(this.f28533g);
            if (((bn.b) bnVar).c() || !((Boolean) this.f28532c.invoke()).booleanValue()) {
                return dVar;
            }
            aq0.a(this.d, hq0.a.f29371a, new rj1(this, dVar, 19), null, 4, null);
            return new q80.o(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(fj fjVar, q80.h.d dVar) {
        fjVar.f28530a.mo3647trySendJP2dKIU(dVar);
        return Unit.f186387a;
    }

    private final q80 a(io.a aVar) {
        if (aVar instanceof io.a.C0218a) {
            if (((Boolean) this.f28531b.invoke()).booleanValue()) {
                return new q80.b(null, 1, null);
            }
            return new q80.d(null, 1, null);
        }
        if (aVar instanceof io.a.d) {
            io.a.d dVar = (io.a.d) aVar;
            ky kyVarC = dVar.c();
            if (kyVarC instanceof zi) {
                return new q80.h.b(this.f28534h);
            }
            if (kyVarC instanceof aj) {
                return new q80.h.a(this.f28534h);
            }
            if (kyVarC instanceof yi) {
                return new q80.h.e(this.f28534h);
            }
            if (kyVarC instanceof bj) {
                return new q80.k(this.f28534h, ly.a(dVar.c()));
            }
            throw new IllegalStateException("FL Developer Error. This FlowAction is not supported by DocumentFlowCoordinator.");
        }
        if (aVar instanceof io.a.e) {
            return new q80.d(new p80(false, false, false, new sp0(new q80.i.c(null, 1, null), false, false, 6, null), 7, null));
        }
        if (aVar instanceof io.a.b) {
            return new q80.d(new p80(false, false, false, new sp0(new q80.i.a(null, 1, null), false, false, 6, null), 7, null));
        }
        if (aVar instanceof io.a.c) {
            io.a.c cVar = (io.a.c) aVar;
            if (cVar.c() instanceof si.a) {
                return new q80.l(KycErrorKt.getKycError(cVar.c()));
            }
            return new q80.l(KycErrorKt.getKycError(cVar.c()));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(xf xfVar) {
        if (xfVar instanceof xf.d) {
            ky kyVarC = ((xf.d) xfVar).c();
            if (kyVarC instanceof aj) {
                return new q80.h.a(this.i);
            }
            if (kyVarC instanceof yi) {
                return new q80.h.e(this.i);
            }
            if (kyVarC instanceof bj) {
                return new q80.k(this.i, ((bj) kyVarC).a());
            }
            wz.a("Unsupported FlowAction in DocumentAnalysis: " + kyVarC);
            throw new KotlinNothingValueException();
        }
        if (xfVar instanceof xf.c) {
            return new q80.l(KycErrorKt.documentAnalysisErrorToKycError(((xf.c) xfVar).c()));
        }
        if (xfVar instanceof xf.a) {
            return new q80.b(null, 1, null);
        }
        if (xfVar instanceof xf.b) {
            return new q80.d(new p80(false, false, false, new sp0(new q80.i.a(new p80(false, true, false, null, 13, null)), false, false, 6, null), 7, null));
        }
        if (xfVar instanceof xf.e) {
            return new q80.d(new p80(false, false, false, new sp0(new q80.i.c(null, 1, null), false, false, 6, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final q80 a(hi hiVar) {
        q80 cVar;
        if (Intrinsics.f(hiVar, hi.b.f29267a)) {
            if (this.e) {
                cVar = q80.i.b.f32262b;
            } else {
                cVar = new q80.i.c(null, 1, null);
            }
            return new q80.d(new p80(false, false, false, new sp0(cVar, false, false, 6, null), 7, null));
        }
        if (hiVar instanceof hi.a) {
            hi.a aVar = (hi.a) hiVar;
            if (aVar.c() instanceof yi) {
                return new q80.h.e(null, 1, null);
            }
            ky kyVarC = aVar.c();
            bj bjVar = kyVarC instanceof bj ? (bj) kyVarC : null;
            return new q80.k(null, bjVar != null ? bjVar.a() : null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
