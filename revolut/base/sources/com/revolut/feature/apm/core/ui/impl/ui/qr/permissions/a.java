package com.revolut.feature.apm.core.ui.impl.ui.qr.permissions;

import aii.r;
import com.revolut.feature.apm.core.ui.impl.ui.qr.permissions.QrWrapperPermissionsFlowModel$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tp8.l;
import yki.b;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements g {
    public final ViewController o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f62379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s70.a f62380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62381r;

    public a(ViewController controller, r permissionDeniedOutput, y80.a permissionProvider, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(permissionDeniedOutput, "permissionDeniedOutput");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.o = controller;
        this.f62379p = permissionDeniedOutput;
        this.f62380q = intentProvider;
        this.f62381r = d.a(this, permissionProvider.c("android.permission.CAMERA") ? QrWrapperPermissionsFlowModel$Step.PermissionsGranted.f62378a : QrWrapperPermissionsFlowModel$Step.Permissions.f62377a, f0.f322471a, new l(this, 23));
    }

    @Override // yki.g
    public final b s() {
        return this.f62381r;
    }
}
