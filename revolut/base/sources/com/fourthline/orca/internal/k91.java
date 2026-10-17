package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k91 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f30190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f30191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aq0 f30192c;
    private final c80 d;
    private final p80 e;
    private final q80.x.a f;

    public k91(o80 navigationChannel, Function0 skipDocumentScannerUseCase, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(skipDocumentScannerUseCase, "skipDocumentScannerUseCase");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f30190a = navigationChannel;
        this.f30191b = skipDocumentScannerUseCase;
        this.f30192c = popupHandler;
        this.d = new c80("tin");
        p80 p80Var = new p80(false, false, false, new sp0(q80.x.b.f32342b, false, false, 4, null), 7, null);
        this.e = p80Var;
        this.f = new q80.x.a(p80Var);
    }

    private final q80 c() {
        aq0.a(this.f30192c, hq0.b.f29374a, new ko1(this, 6), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (Intrinsics.f(navigationEffect, m30.f30974a)) {
            return c();
        }
        if (Intrinsics.f(navigationEffect, w30.f34500a)) {
            return new q80.x.c(null, 1, null);
        }
        if (Intrinsics.f(navigationEffect, r81.f32646a)) {
            return ((Boolean) this.f30191b.invoke()).booleanValue() ? c() : new q80.b(null, 1, null);
        }
        if (navigationEffect instanceof s81) {
            return new q80.k(null, ly.a(((s81) navigationEffect).c()), 1, null);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        if (((Boolean) this.f30191b.invoke()).booleanValue()) {
            return this.f;
        }
        return q80.x.b.f32342b;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(m91 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f30190a.mo3647trySendJP2dKIU(a((ee1) navigationEffect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(k91 k91Var) {
        k91Var.f30190a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
