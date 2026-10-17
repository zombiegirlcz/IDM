package com.fourthline.orca.internal;

import com.fourthline.orca.internal.g11;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j11 implements yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f29786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f29787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aq0 f29788c;

    public j11(o80 navigationChannel, Function0 showPermissionRationaleUseCase, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f29786a = navigationChannel;
        this.f29787b = showPermissionRationaleUseCase;
        this.f29788c = popupHandler;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof g11.a) {
            return c();
        }
        if (navigationEffect instanceof g11.b) {
            return a((g11.b) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    private final q80 c() {
        aq0.a(this.f29788c, hq0.b.f29374a, new ul1(this, 26), null, 4, null);
        return new q80.o(null, 1, null);
    }

    private final q80 a(g11.b bVar) {
        q80.w.b bVar2 = new q80.w.b(null, 1, null);
        if (!((Boolean) this.f29787b.invoke()).booleanValue()) {
            return bVar2;
        }
        aq0.a(this.f29788c, hq0.a.f29371a, new rj1(this, bVar2, 26), null, 4, null);
        return new q80.o(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(j11 j11Var, q80.w.b bVar) {
        j11Var.f29786a.mo3647trySendJP2dKIU(bVar);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(j11 j11Var) {
        j11Var.f29786a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
