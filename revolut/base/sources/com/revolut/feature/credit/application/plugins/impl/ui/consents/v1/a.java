package com.revolut.feature.credit.application.plugins.impl.ui.consents.v1;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.ConsentsV1FlowContract$Step;
import cp5.d;
import e84.e;
import eul.f;
import hw3.c;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements f74.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f67290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConsentsV1FlowContract$InputData f67291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67292r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c documentsInteractor, ConsentsV1FlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(documentsInteractor, "documentsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67290p = documentsInteractor;
        this.f67291q = inputData;
        this.f67292r = d.a(this, new ConsentsV1FlowContract$Step.CreditApplicationDocumentViewer(inputData.f67284a, inputData.f67285b, inputData.f67286c), f0.f322471a, new f(this, 19));
    }

    @Override // yki.g
    public final b s() {
        return this.f67292r;
    }
}
