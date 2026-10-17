package com.fourthline.orca.internal;

import com.fourthline.orca.internal.g11;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fw0 implements yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f28675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f28676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aq0 f28677c;

    public fw0(o80 navigationChannel, Function0 showPermissionRationaleUseCase, aq0 popupHandler) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        this.f28675a = navigationChannel;
        this.f28676b = showPermissionRationaleUseCase;
        this.f28677c = popupHandler;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof g11.a) {
            return new q80.d(null, 1, null);
        }
        if (navigationEffect instanceof g11.b) {
            return a((g11.b) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    private final q80 a(g11.b bVar) {
        q80.u.f fVar = new q80.u.f(null, 1, null);
        if (!((Boolean) this.f28676b.invoke()).booleanValue()) {
            return fVar;
        }
        aq0.a(this.f28677c, hq0.a.f29371a, new ul1(this, 6), null, 4, null);
        return new q80.o(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(fw0 fw0Var) {
        fw0Var.f28675a.mo3647trySendJP2dKIU(new q80.u.f(null, 1, null));
        return Unit.f186387a;
    }
}
