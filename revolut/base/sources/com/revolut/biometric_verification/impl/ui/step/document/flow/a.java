package com.revolut.biometric_verification.impl.ui.step.document.flow;

import com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lr.g;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$InputData f50582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f50583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iy.b f50584c;

    public a(BiometricVerificationDocumentStepFlowContract$InputData inputData, g documentCountriesRepository, iy.b experimentsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentCountriesRepository, "documentCountriesRepository");
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        this.f50582a = inputData;
        this.f50583b = documentCountriesRepository;
        this.f50584c = experimentsInteractor;
    }

    public final BiometricVerificationDocumentStepFlowContract$Step a(ArrayList arrayList, boolean z) {
        if (!this.f50584c.a(px.a.f)) {
            return new BiometricVerificationDocumentStepFlowContract$Step.DocumentSelection(arrayList, z);
        }
        ArrayList arrayList2 = this.f50582a.f50542a.f50404c;
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            a0.x(((BiometricVerificationAcceptedDocument) it8.next()).f50373b, arrayList3);
        }
        List countryCodes = d0.U(arrayList3);
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        this.f50583b.f199343a.f("BIOMETRIC_VERIFICATION_DOCUMENT_COUNTRIES_MEMORY_CACHE_KEY", countryCodes);
        return new BiometricVerificationDocumentStepFlowContract$Step.NewDocumentPicker(arrayList, z);
    }
}
