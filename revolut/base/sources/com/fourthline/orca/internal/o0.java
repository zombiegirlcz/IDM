package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o0 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f31520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f31521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f31522c;
    private final q80 d;

    public o0(o80 navigationChannel, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f31520a = navigationChannel;
        this.f31521b = popupHandler;
        this.f31522c = new c80("address");
        this.d = q80.a.C0270a.f32230b;
    }

    private final q80 c() {
        aq0.a(this.f31521b, hq0.b.f29374a, new ko1(this, 21), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f31522c;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(a1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof c0.c) {
            this.f31520a.mo3647trySendJP2dKIU(a((c0.c) navigationEffect));
        } else {
            throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
        }
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.d;
    }

    private final q80 a(c0.c cVar) {
        if (Intrinsics.f(cVar, c0.c.a.f27298a)) {
            return c();
        }
        if (cVar instanceof c0.c.b) {
            return new q80.k(null, ly.a(((c0.c.b) cVar).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(o0 o0Var) {
        o0Var.f31520a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
