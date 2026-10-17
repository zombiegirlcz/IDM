package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.y60;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f60 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f28348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f28349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f28350c;
    private final q80 d;

    public f60(o80 navigationChannel, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f28348a = navigationChannel;
        this.f28349b = popupHandler;
        this.f28350c = new c80("geolocation");
        this.d = q80.n.a.f32286b;
    }

    private final q80 c() {
        aq0.a(this.f28349b, hq0.b.f29374a, new gj1(this, 29), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f28350c;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(f60 f60Var) {
        f60Var.f28348a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        q80 kVar;
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof y60.a.C0315a) {
            kVar = c();
        } else if (navigationEffect instanceof y60.a.b) {
            kVar = new q80.k(null, ly.a(((y60.a.b) navigationEffect).c()), 1, null);
        } else {
            throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
        }
        this.f28348a.mo3647trySendJP2dKIU(kVar);
    }
}
