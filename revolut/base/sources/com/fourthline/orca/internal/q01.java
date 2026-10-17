package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.z11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q01 implements oy, fe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f32156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yc f32157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yc f32158c;
    private final c80 d;
    private final q80 e;

    public q01(o80 navigationChannel, yc selfieIntroCoordinator, yc selfieScannerCoordinator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(selfieIntroCoordinator, "selfieIntroCoordinator");
        Intrinsics.checkNotNullParameter(selfieScannerCoordinator, "selfieScannerCoordinator");
        this.f32156a = navigationChannel;
        this.f32157b = selfieIntroCoordinator;
        this.f32158c = selfieScannerCoordinator;
        this.d = new c80("biometrics");
        this.e = q80.w.a.f32334b;
    }

    private final q80 c(ee1 ee1Var) {
        q80 q80VarA = this.f32158c.a(ee1Var);
        return q80VarA instanceof q80.d ? new q80.b(null, 1, null) : q80VarA;
    }

    @Override // com.fourthline.orca.internal.oy
    public c80 a() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.oy
    public q80 b() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.yc
    public q80 a(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof g11) {
            return this.f32157b.a(navigationEffect);
        }
        if (navigationEffect instanceof z11.a) {
            return c(navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    @Override // com.fourthline.orca.internal.fe1
    public void b(ee1 navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f32156a.mo3647trySendJP2dKIU(a(navigationEffect));
    }
}
