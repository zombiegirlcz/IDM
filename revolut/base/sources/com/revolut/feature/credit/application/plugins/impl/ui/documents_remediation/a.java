package com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation;

import aa4.b;
import aa4.c;
import ang.f;
import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlowContract$Step;
import cp5.d;
import e84.e;
import hw3.x;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f67572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f67573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DocumentsRemediationFlowContract$InputData f67574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f67575s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x remediationInteractor, f userInteractor, DocumentsRemediationFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(remediationInteractor, "remediationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67572p = remediationInteractor;
        this.f67573q = userInteractor;
        this.f67574r = inputData;
        a09.b bVar = new a09.b(this, 25);
        this.f67575s = d.a(this, DocumentsRemediationFlowContract$Step.Initial.f67570a, f0.f322471a, bVar);
    }

    @Override // yji.l
    public final void T1(long j2) {
        hs3.x xVar = this.f67574r.f67569b;
        if (xVar != null) {
            h.t2(this, this.f67575s, new DocumentsRemediationFlowContract$Step.RemediationInProgress(xVar), false, null, false, 12);
        } else {
            n2(new c(this, null, 1), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67575s;
    }
}
