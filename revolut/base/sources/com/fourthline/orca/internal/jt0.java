package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c60;
import com.fourthline.orca.internal.g11;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.ow0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.y60;
import com.fourthline.orca.internal.z11;
import com.fourthline.orca.qes.internal.error.QesError;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jt0 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f30030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yc f30031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yc f30032c;
    private final yc d;
    private final yc e;
    private final yc f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final aq0 f30033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c80 f30034h;
    private final q80 i;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[sx0.values().length];
            try {
                iArr[sx0.f33154c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sx0.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sx0.f33155g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sx0.f33156h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jt0(o80 navigationChannel, yc qesSelfieIntroCoordinator, yc qesSelfieScannerCoordinator, yc qesAgreementCoordinator, yc qesPdfRendererCoordinator, yc qesSignCoordinator, aq0 popupHandler, sx0 initialQesStatus) {
        q80 aVar;
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(qesSelfieIntroCoordinator, "qesSelfieIntroCoordinator");
        Intrinsics.checkNotNullParameter(qesSelfieScannerCoordinator, "qesSelfieScannerCoordinator");
        Intrinsics.checkNotNullParameter(qesAgreementCoordinator, "qesAgreementCoordinator");
        Intrinsics.checkNotNullParameter(qesPdfRendererCoordinator, "qesPdfRendererCoordinator");
        Intrinsics.checkNotNullParameter(qesSignCoordinator, "qesSignCoordinator");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(initialQesStatus, "initialQesStatus");
        this.f30030a = navigationChannel;
        this.f30031b = qesSelfieIntroCoordinator;
        this.f30032c = qesSelfieScannerCoordinator;
        this.d = qesAgreementCoordinator;
        this.e = qesPdfRendererCoordinator;
        this.f = qesSignCoordinator;
        this.f30033g = popupHandler;
        this.f30034h = new c80("qes");
        int i = a.$EnumSwitchMapping$0[initialQesStatus.ordinal()];
        int i2 = 1;
        if (i == 1) {
            aVar = q80.u.b.f32320b;
        } else if (i == 2) {
            aVar = q80.u.e.f32326b;
        } else {
            if (i != 3 && i != 4) {
                throw new IllegalStateException(("QES flow can not be started with " + initialQesStatus + " status. Please filter it out on WorkflowModulesFilter.kt").toString());
            }
            aVar = new q80.u.a(null, i2, 0 == true ? 1 : 0);
        }
        this.i = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final q80 c() {
        aq0.a(this.f30033g, hq0.b.f29374a, new ul1(this, 29), null, 4, null);
        return new q80.o(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f30034h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof n30) {
            return c();
        }
        if (navigationEffect instanceof x30) {
            return q80.u.c.f32322b;
        }
        if (navigationEffect instanceof b40) {
            return q80.u.e.f32326b;
        }
        int i = 1;
        p80 p80Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (navigationEffect instanceof i30) {
            return new q80.u.a(p80Var, i, objArr3 == true ? 1 : 0);
        }
        if (navigationEffect instanceof y60.a.C0315a) {
            return c();
        }
        if (navigationEffect instanceof y60.a.b) {
            c60 c60VarC = ((y60.a.b) navigationEffect).c();
            if (c60VarC instanceof c60.c) {
                return q80.u.e.f32326b;
            }
            if (c60VarC instanceof c60.b) {
                return new q80.u.a(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            }
            throw new IllegalStateException("FL Developer error. This LocationFlowAction is not supported for Qes.");
        }
        if (navigationEffect instanceof g11.a) {
            return c();
        }
        if (navigationEffect instanceof g11) {
            return this.f30031b.a(navigationEffect);
        }
        if (navigationEffect instanceof z11.a) {
            return this.f30032c.a(navigationEffect);
        }
        if (navigationEffect instanceof qr0) {
            return this.d.a(navigationEffect);
        }
        if (navigationEffect instanceof qv0) {
            return this.e.a(navigationEffect);
        }
        if (navigationEffect instanceof ow0.c) {
            return this.f.a(navigationEffect);
        }
        if (navigationEffect instanceof et0) {
            return new q80.l(((et0) navigationEffect).c());
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.i;
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f30030a.mo3647trySendJP2dKIU(a(navigationEffect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(jt0 jt0Var) {
        jt0Var.f30030a.mo3647trySendJP2dKIU(new q80.l(QesError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
