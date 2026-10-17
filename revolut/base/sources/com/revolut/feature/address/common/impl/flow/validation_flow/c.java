package com.revolut.feature.address.common.impl.flow.validation_flow;

import com.revolut.feature.address.common.api.AddressFlowApi$AddressVerification;
import com.revolut.feature.address.common.api.flow.AddressValidationMode;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import gi1.o;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pi1.f;
import vh1.d;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AddAddressScreenContract$InputData f61030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AddressEnhancementAdvisor f61031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f61032n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rh1.b f61033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f61034q;

    public c(AddAddressScreenContract$InputData inputData, AddressEnhancementAdvisor addressEnhancementAdvisor, b addressEnhancementPromptProvider, d addressValidator, rh1.b addressFlowInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressEnhancementAdvisor, "addressEnhancementAdvisor");
        Intrinsics.checkNotNullParameter(addressEnhancementPromptProvider, "addressEnhancementPromptProvider");
        Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f61030l = inputData;
        this.f61031m = addressEnhancementAdvisor;
        this.f61032n = addressEnhancementPromptProvider;
        this.o = addressValidator;
        this.f61033p = addressFlowInteractor;
        this.f61034q = featureToggleInteractor;
    }

    public static final Object Z2(c cVar, Address address, AddressFormat addressFormat, o oVar, o oVar2, i iVar) {
        AddAddressScreenContract$InputData addAddressScreenContract$InputData = cVar.f61030l;
        AddressValidationMode addressValidationMode = addAddressScreenContract$InputData.u;
        boolean zC = ((jte.d) cVar.f61034q).c(AddressFlowApi$AddressVerification.f60925c);
        if ((addAddressScreenContract$InputData.u instanceof AddressValidationMode.Verification) && !zC) {
            Object objB3 = cVar.b3(address, addressFormat, "ADD_ADDRESS_SUBMIT_BUTTON_TAG", oVar, oVar2, iVar);
            return objB3 == fim.a.COROUTINE_SUSPENDED ? objB3 : Unit.f186387a;
        }
        if (Intrinsics.f(addressValidationMode, AddressValidationMode.Validation.f60951a)) {
            Object objB32 = cVar.b3(address, addressFormat, "ADD_ADDRESS_SUBMIT_BUTTON_TAG", oVar, oVar2, iVar);
            return objB32 == fim.a.COROUTINE_SUSPENDED ? objB32 : Unit.f186387a;
        }
        if (!(addressValidationMode instanceof AddressValidationMode.Verification)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objC3 = cVar.c3(address, addressFormat, "ADD_ADDRESS_SUBMIT_BUTTON_TAG", ((AddressValidationMode.Verification) addressValidationMode).f60952a, oVar, iVar);
        return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.address.models.Address r24, com.revolut.feature.address.models.AddressFormat r25, java.lang.String r26, gi1.o r27, gi1.o r28, gim.c r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r29
            boolean r3 = r2 instanceof pi1.a
            if (r3 == 0) goto L19
            r3 = r2
            pi1.a r3 = (pi1.a) r3
            int r4 = r3.z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.z = r4
            goto L1e
        L19:
            pi1.a r3 = new pi1.a
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f236366x
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.z
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            gi1.o r1 = r3.f236365w
            gi1.o r4 = r3.v
            com.revolut.feature.address.models.Address r3 = r3.u
            yhm.o.b(r2)
            r9 = r1
            r1 = r3
            goto L62
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            yhm.o.b(r2)
            tji.f r2 = r0.q2()
            pi1.b r5 = new pi1.b
            r8 = r25
            r5.<init>(r0, r1, r8, r7)
            r3.u = r1
            r8 = r27
            r3.v = r8
            r9 = r28
            r3.f236365w = r9
            r3.z = r6
            r6 = r26
            java.lang.Object r2 = zh9.u0.b0(r2, r6, r5, r3)
            if (r2 != r4) goto L61
            return r4
        L61:
            r4 = r8
        L62:
            vh1.c r2 = (vh1.c) r2
            boolean r3 = r2 instanceof vh1.c.a
            if (r3 == 0) goto L6c
            r4.invoke(r1)
            goto Lab
        L6c:
            boolean r1 = r2 instanceof vh1.b
            if (r1 == 0) goto L78
            vh1.b r2 = (vh1.b) r2
            sh1.h r1 = r2.f289267a
            r9.invoke(r1)
            goto Lab
        L78:
            boolean r1 = r2 instanceof vh1.a
            if (r1 == 0) goto Lae
            vh1.a r2 = (vh1.a) r2
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = r2.f289266a
            nii.y0 r1 = new nii.y0
            nii.z r8 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.kompot.common.R$string.common_action_ok
            r3 = 14
            r11.<init>(r2, r7, r7, r3)
            r21 = 0
            r22 = 32758(0x7ff6, float:4.5904E-41)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 0
            r3 = 5
            r1.<init>(r7, r8, r2, r3)
            r0.L2(r1)
        Lab:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        Lae:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.address.common.impl.flow.validation_flow.c.b3(com.revolut.feature.address.models.Address, com.revolut.feature.address.models.AddressFormat, java.lang.String, gi1.o, gi1.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.feature.address.models.Address r12, com.revolut.feature.address.models.AddressFormat r13, java.lang.String r14, com.revolut.feature.address.models.AddressVerificationUseCase r15, gi1.o r16, gim.c r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof pi1.d
            if (r1 == 0) goto L15
            r1 = r0
            pi1.d r1 = (pi1.d) r1
            int r2 = r1.f236375y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f236375y = r2
            goto L1a
        L15:
            pi1.d r1 = new pi1.d
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.f236373w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f236375y
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            gi1.o r12 = r1.v
            com.revolut.feature.address.models.Address r13 = r1.u
            yhm.o.b(r0)
            r6 = r0
            r0 = r12
            r12 = r6
            r6 = r11
            goto L5c
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            yhm.o.b(r0)
            tji.f r0 = r11.q2()
            pi1.e r5 = new pi1.e
            r10 = 0
            r6 = r11
            r7 = r12
            r9 = r13
            r8 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r1.u = r7
            r13 = r16
            r1.v = r13
            r1.f236375y = r4
            java.lang.Object r0 = zh9.u0.b0(r0, r14, r5, r1)
            if (r0 != r2) goto L59
            return r2
        L59:
            r12 = r0
            r0 = r13
            r13 = r7
        L5c:
            com.revolut.feature.address.models.AddressSuggestion r12 = (com.revolut.feature.address.models.AddressSuggestion) r12
            boolean r15 = r12.getVerified()
            com.revolut.feature.address.models.Address r14 = r12.getAddress()
            com.revolut.feature.address.models.AddressVerificationFailureReason r12 = r12.getFailureReason()
            if (r15 == 0) goto L72
            if (r14 != 0) goto L72
            r0.invoke(r13)
            goto Laa
        L72:
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            if (r14 == 0) goto L96
            com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetController r2 = new com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetController
            com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreenContract$InputData r12 = r6.f61030l
            com.revolut.analytics.tracking.v3.AnalyticsContext r3 = r12.f60988q
            com.revolut.analytics.tracking.v3.AnalyticsProduct r12 = r12.f60987p
            com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData r4 = new com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData
            r16 = r12
            r17 = r3
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            r2.<init>(r12)
            js7.c r12 = new js7.c
            r13 = 14
            r12.<init>(r13, r0)
            r11.N2(r2, r1, r12)
            goto Laa
        L96:
            com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetController r14 = new com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetController
            com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetContract$InputData r15 = new com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetContract$InputData
            r15.<init>(r13, r12)
            r14.<init>(r15)
            p5e.h r12 = new p5e.h
            r15 = 26
            r12.<init>(r0, r13, r15)
            r11.N2(r14, r1, r12)
        Laa:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.address.common.impl.flow.validation_flow.c.c3(com.revolut.feature.address.models.Address, com.revolut.feature.address.models.AddressFormat, java.lang.String, com.revolut.feature.address.models.AddressVerificationUseCase, gi1.o, gim.c):java.lang.Object");
    }
}
