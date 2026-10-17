package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.ib;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class dc implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f27697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f27698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f27699c;
    private final q80 d;

    public dc(o80 navigationChannel, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f27697a = navigationChannel;
        this.f27698b = popupHandler;
        this.f27699c = new c80("contact");
        this.d = q80.f.a.f32246b;
    }

    private final q80 c() {
        aq0.a(this.f27698b, hq0.b.f29374a, new gj1(this, 17), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f27699c;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (Intrinsics.f(navigationEffect, ib.c.a.f29550a)) {
            return c();
        }
        if (navigationEffect instanceof ib.c.b) {
            return new q80.k(null, ly.a(((ib.c.b) navigationEffect).c()), 1, null);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(nc navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f27697a.mo3647trySendJP2dKIU(a((ee1) navigationEffect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(dc dcVar) {
        dcVar.f27697a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
