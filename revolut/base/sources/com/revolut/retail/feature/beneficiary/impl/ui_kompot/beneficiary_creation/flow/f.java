package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$Step;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tp8.l;
import twb.b0;
import v4j.g;
import v4j.i;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends h implements u4j.b {
    public final v4j.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f99754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f99755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rul.e f99756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z4j.e f99757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a5j.b f99758t;
    public final y4j.a u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final BeneficiaryCreationKompotInputData f99759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kz9.a f99760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yki.a f99761y;

    public f(v4j.e beneficiaryValidationDelegate, i copStatePatcher, g cardTokenizationDelegate, rul.e beneficiaryCreationDelegate, z4j.e resultToStatusDialogMapper, a5j.b beneficiaryCreationFlowModelUtils, y4j.a flowFinishingExtension, ang.f userInteractor, BeneficiaryCreationKompotInputData inputData, kz9.a chatNavigationProvider) {
        Intrinsics.checkNotNullParameter(beneficiaryValidationDelegate, "beneficiaryValidationDelegate");
        Intrinsics.checkNotNullParameter(copStatePatcher, "copStatePatcher");
        Intrinsics.checkNotNullParameter(cardTokenizationDelegate, "cardTokenizationDelegate");
        Intrinsics.checkNotNullParameter(beneficiaryCreationDelegate, "beneficiaryCreationDelegate");
        Intrinsics.checkNotNullParameter(resultToStatusDialogMapper, "resultToStatusDialogMapper");
        Intrinsics.checkNotNullParameter(beneficiaryCreationFlowModelUtils, "beneficiaryCreationFlowModelUtils");
        Intrinsics.checkNotNullParameter(flowFinishingExtension, "flowFinishingExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        this.o = beneficiaryValidationDelegate;
        this.f99754p = copStatePatcher;
        this.f99755q = cardTokenizationDelegate;
        this.f99756r = beneficiaryCreationDelegate;
        this.f99757s = resultToStatusDialogMapper;
        this.f99758t = beneficiaryCreationFlowModelUtils;
        this.u = flowFinishingExtension;
        this.v = userInteractor;
        this.f99759w = inputData;
        this.f99760x = chatNavigationProvider;
        this.f99761y = cp5.d.a(this, new BeneficiaryCreationFlowContract$Step.AccountFields(inputData.f99625b), f0.f322471a, new l(this, 27));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a8, code lost:
    
        if (r0 != r7) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f r31, com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState r32, com.revolut.domain.models.beneficiary.ConfirmationResult r33, gim.c r34) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f.I2(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f, com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState, com.revolut.domain.models.beneficiary.ConfirmationResult, gim.c):java.lang.Object");
    }

    public final void J2(String str, Function1 function1) {
        l2(new b0(this, str, (Continuation) null, function1), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f99761y;
    }
}
