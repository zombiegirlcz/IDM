package com.revolut.biometric_verification.impl.ui.step.document.card_details_edit;

import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.BiometricVerificationMyNumberCardDetailsEditFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vs.f;
import xif.k;
import xs.b;
import xs.e;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends h implements b {
    public final BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f50528p;

    public a(BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData inputData) {
        FlowStep dateOfBirth;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        f fVar = inputData.f50523b;
        BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails biometricVerificationDocumentStepFlowContract$MyNumberCardDetails = inputData.f50522a;
        int i = e.f308381a[fVar.ordinal()];
        if (i == 1) {
            dateOfBirth = new BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.DateOfBirth(biometricVerificationDocumentStepFlowContract$MyNumberCardDetails);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dateOfBirth = new BiometricVerificationMyNumberCardDetailsEditFlowContract$Step.CardDetails(biometricVerificationDocumentStepFlowContract$MyNumberCardDetails, inputData.f50523b);
        }
        this.f50528p = d.a(this, dateOfBirth, f0.f322471a, new k(this, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50528p;
    }
}
