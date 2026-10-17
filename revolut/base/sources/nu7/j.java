package nu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cu7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hu7.b f219229a;

    public j(hu7.b coverageRepository) {
        Intrinsics.checkNotNullParameter(coverageRepository, "coverageRepository");
        this.f219229a = coverageRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00be -> B:31:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu7.j.a(java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof nu7.h
            if (r0 == 0) goto L13
            r0 = r11
            nu7.h r0 = (nu7.h) r0
            int r1 = r0.f219227w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219227w = r1
            goto L18
        L13:
            nu7.h r0 = new nu7.h
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219227w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L3b
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r11)
            r0.f219227w = r3
            java.lang.Object r11 = r9.a(r10, r0)
            if (r11 != r1) goto L3b
            return r1
        L3b:
            gu7.j4 r11 = (gu7.j4) r11
            r10 = 0
            if (r11 == 0) goto L84
            gu7.a r0 = r11.d
            if (r0 == 0) goto L84
            gu7.m4 r0 = r0.f146708b
            if (r0 != 0) goto L49
            goto L84
        L49:
            java.lang.String r1 = r0.f146795a
            dl7.a r0 = r0.f146796b
            boolean r2 = ta6.a.z(r0)
            if (r2 == 0) goto L65
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig$Details r3 = new com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig$Details
            dl7.b r4 = new dl7.b
            java.lang.String r11 = r11.f146771a
            r4.<init>(r0, r11, r10)
            r3.<init>(r1, r4, r10)
            r2.<init>(r3)
            return r2
        L65:
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            java.lang.String r11 = "insuranceId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r11)
            java.lang.String r11 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r11)
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r2 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations$Detail r4 = new com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations$Detail
            r4.<init>(r1, r0)
            r7 = 0
            r8 = 61
            r3 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.<init>(r2)
        L84:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nu7.j.b(java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nu7.i
            if (r0 == 0) goto L13
            r0 = r7
            nu7.i r0 = (nu7.i) r0
            int r1 = r0.f219228w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219228w = r1
            goto L18
        L13:
            nu7.i r0 = new nu7.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219228w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r0.f219228w = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            gu7.j4 r7 = (gu7.j4) r7
            r6 = 0
            if (r7 == 0) goto L6e
            gu7.a r0 = r7.d
            if (r0 == 0) goto L6e
            gu7.m4 r0 = r0.f146708b
            if (r0 != 0) goto L49
            goto L6e
        L49:
            java.lang.String r1 = r0.f146795a
            dl7.a r0 = r0.f146796b
            boolean r2 = ta6.a.z(r0)
            if (r2 == 0) goto L65
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig$Details r3 = new com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig$Details
            dl7.b r4 = new dl7.b
            java.lang.String r7 = r7.f146771a
            r4.<init>(r0, r7, r6)
            r3.<init>(r1, r4, r6)
            r2.<init>(r3)
            return r2
        L65:
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r7 = com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations.a(r1, r0)
            r6.<init>(r7)
        L6e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nu7.j.c(java.util.List, gim.c):java.lang.Object");
    }
}
