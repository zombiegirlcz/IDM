package com.revolut.core.backend_flow.impl.internal_flow;

import a5h.g;
import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlowContract$Step;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import la0.h;
import la0.k;
import la0.m;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends b implements h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yki.a f51252y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UUID sessionId, BackendFlow backendFlow, g controllerProvider, ra0.h repository, n60.a keyboardControllerExtension, ga0.a errorHandlerExtension, qa0.b externalNavigationExtension, m statusDialogMapper, la0.b modalScreenExtension, k screenInputDataMapper) {
        super(sessionId, backendFlow, controllerProvider, repository, keyboardControllerExtension, errorHandlerExtension, externalNavigationExtension, statusDialogMapper, modalScreenExtension, screenInputDataMapper);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(modalScreenExtension, "modalScreenExtension");
        Intrinsics.checkNotNullParameter(screenInputDataMapper, "screenInputDataMapper");
        this.f51252y = cp5.d.a(this, InternalBackendFlowContract$Step.Init.f51243a, a.a(backendFlow), new v(this, 21));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f51252y;
    }
}
