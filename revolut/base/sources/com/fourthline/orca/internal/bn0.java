package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.jm0;
import com.fourthline.orca.internal.kp0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bn0 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f27172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f27173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f27174c;
    private final c80 d;
    private final q80 e;

    public bn0(o80 navigationChannel, aq0 popupHandler, Function0 showPermissionRationaleUseCase) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        this.f27172a = navigationChannel;
        this.f27173b = popupHandler;
        this.f27174c = showPermissionRationaleUseCase;
        this.d = new c80("poa");
        this.e = q80.t.b.f32310b;
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.d;
    }

    private final q80 c() {
        aq0.a(this.f27173b, hq0.b.f29374a, new gj1(this, 10), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof l30) {
            return c();
        }
        if (navigationEffect instanceof v30) {
            return q80.t.a.f32308b;
        }
        if (navigationEffect instanceof pp0) {
            return new q80.b(null, 1, null);
        }
        if (navigationEffect instanceof jm0.a.C0228a) {
            return new q80.t.c(new p80(true, false, false, new sp0(q80.t.a.f32308b, false, false, 4, null), 6, null));
        }
        if (navigationEffect instanceof jm0.a.c) {
            q80.t.d dVar = new q80.t.d(null, 1, null);
            if (!((Boolean) this.f27174c.invoke()).booleanValue()) {
                return dVar;
            }
            aq0.a(this.f27173b, hq0.a.f29371a, new rj1(this, dVar, 14), null, 4, null);
            return new q80.o(null, 1, null);
        }
        if (navigationEffect instanceof jm0.a.b) {
            return new q80.l(((jm0.a.b) navigationEffect).c());
        }
        if (navigationEffect instanceof xn0) {
            return new q80.b(null, 1, null);
        }
        if (navigationEffect instanceof yn0) {
            yn0 yn0Var = (yn0) navigationEffect;
            return yn0Var.c() instanceof kp0.a ? new q80.t.e(null, 1, null) : new q80.k(null, ly.a(yn0Var.c()), 1, null);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bn0 bn0Var, q80.t.d dVar) {
        bn0Var.f27172a.mo3647trySendJP2dKIU(dVar);
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(cn0 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f27172a.mo3647trySendJP2dKIU(a((ee1) navigationEffect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bn0 bn0Var) {
        bn0Var.f27172a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
