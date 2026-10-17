package com.revolut.feature.credit.application.plugins.impl.ui.consents_v2;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$Step;
import cp5.d;
import e84.e;
import ft3.h1;
import g74.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kp0.w0;
import org.jetbrains.annotations.NotNull;
import yki.b;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements g74.a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConsentsFlowContract$InputData f67299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lx4.a f67300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sw3.c f67301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sp3.a f67302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f67303t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConsentsFlowContract$InputData inputData, lx4.a creditSignedDocumentsInteractor, sw3.c consentsInteractor, sp3.a creditDataMonitoringFacade, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditSignedDocumentsInteractor, "creditSignedDocumentsInteractor");
        Intrinsics.checkNotNullParameter(consentsInteractor, "consentsInteractor");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67299p = inputData;
        this.f67300q = creditSignedDocumentsInteractor;
        this.f67301r = consentsInteractor;
        this.f67302s = creditDataMonitoringFacade;
        fv1.a aVar = new fv1.a(this, 29);
        this.f67303t = d.a(this, ConsentsFlowContract$Step.Documents.f67298a, f0.f322471a, aVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void K1() {
        ((MutableStateFlow) this.f67300q.f200526a.getValue()).k(h0.f322473a);
        h1 productPayload = w0.F(this.f67299p.f67293a);
        sw3.c cVar = this.f67301r;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        cVar.c(null, productPayload);
    }

    @Override // yki.g
    public final b s() {
        return this.f67303t;
    }
}
