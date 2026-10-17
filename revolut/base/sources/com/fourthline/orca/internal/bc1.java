package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.vb1;
import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bc1 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f27096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq0 f27097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c80 f27098c;
    private final q80 d;

    public bc1(o80 navigationChannel, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f27096a = navigationChannel;
        this.f27097b = popupHandler;
        this.f27098c = new c80("workflow_uploading");
        this.d = q80.y.a.f32348b;
    }

    private final q80 c() {
        aq0.a(this.f27097b, hq0.b.f29374a, new gj1(this, 8), null, 4, null);
        return new q80.o(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.f27098c;
    }

    @Override // com.fourthline.orca.internal.fe1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(vb1 navigationEffect) {
        q80 kVar;
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof vb1.a) {
            kVar = c();
        } else {
            if (!(navigationEffect instanceof vb1.b)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = new q80.k(null, ly.a(((vb1.b) navigationEffect).c()), 1, null);
        }
        this.f27096a.mo3647trySendJP2dKIU(kVar);
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        throw new IllegalStateException("FL developer error. Consume() is not supported by this UploadDataFlowCoordinator.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(bc1 bc1Var) {
        bc1Var.f27096a.mo3647trySendJP2dKIU(new q80.l(KycError.Canceled.INSTANCE));
        return Unit.f186387a;
    }
}
