package com.revolut.core.backend_flow.impl.internal_flow;

import a5h.g;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import la0.i;
import la0.k;
import la0.m;
import ra0.h;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends b implements i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yki.i f51253y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UUID uuid, BackendFlow backendFlow, g controllerProvider, h repository, n60.a keyboardControllerExtension, ga0.a errorHandlerExtension, qa0.b externalNavigationExtension, m statusDialogMapper, la0.b modalScreenExtension, k screenInputDataMapper) {
        super(uuid, backendFlow, controllerProvider, repository, keyboardControllerExtension, errorHandlerExtension, externalNavigationExtension, statusDialogMapper, modalScreenExtension, screenInputDataMapper);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(modalScreenExtension, "modalScreenExtension");
        Intrinsics.checkNotNullParameter(screenInputDataMapper, "screenInputDataMapper");
        this.f51253y = d8l.d.a(this, new v(this, 22));
    }

    @Override // yki.j
    public final void M0() {
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f51253y;
    }
}
