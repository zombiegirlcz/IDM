package com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship;

import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowInputData;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.SubmitCitizenshipFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import cp5.d;
import i69.p;
import iai.b;
import iai.c;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final SubmitCitizenshipFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ot8.a f97527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f97528r;

    public a(SubmitCitizenshipFlowInputData inputData, jvh.a workflowInteractor, ot8.a kycDocsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(kycDocsInteractor, "kycDocsInteractor");
        this.o = inputData;
        this.f97526p = workflowInteractor;
        this.f97527q = kycDocsInteractor;
        p pVar = new p(this, 8);
        this.f97528r = d.a(this, SubmitCitizenshipFlowContract$Step.OpenCitizenship.f97525a, f0.f322471a, pVar);
    }

    public static final void I2(a aVar, SubmitCitizenshipFlowOutput submitCitizenshipFlowOutput) {
        if (aVar.o.f97497a) {
            aVar.C1(new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("EXTRA_SUBMIT_CITIZENSHIP_RESULT", submitCitizenshipFlowOutput)), null, 4)));
        } else {
            aVar.C2(submitCitizenshipFlowOutput);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97528r;
    }
}
