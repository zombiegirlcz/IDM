package com.revolut.feature.kyc.impl.flow.input_document_id;

import com.revolut.feature.kyc.impl.flow.input_document_id.InputDocumentIdFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import or4.i;
import ov8.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final InputDocumentIdFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f77692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f77693q;

    public a(InputDocumentIdFlowContract$InputData inputData, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = inputData;
        this.f77692p = workflowInteractor;
        i iVar = new i(this, 9);
        this.f77693q = d.a(this, InputDocumentIdFlowContract$Step.KYCDocumentId.f77691a, f0.f322471a, iVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77693q;
    }
}
