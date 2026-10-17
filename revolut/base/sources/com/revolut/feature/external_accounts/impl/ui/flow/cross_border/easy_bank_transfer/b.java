package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ String A;
    public x61.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f72842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f72844y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.f72842w = eVar;
        this.f72843x = str;
        this.f72844y = str2;
        this.z = str3;
        this.A = str4;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f72842w, this.f72843x, this.f72844y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            java.lang.String r5 = r0.f72844y
            java.lang.String r6 = r0.f72843x
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e r7 = r0.f72842w
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            x61.c r1 = r0.u
            yhm.o.b(r17)
            r3 = r17
            goto L7c
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            yhm.o.b(r17)
            r2 = r17
            goto L5e
        L2a:
            yhm.o.b(r17)
            oe6.a r2 = r7.f72852q
            xg6.j r2 = (xg6.j) r2
            r2.getClass()
            java.lang.String r8 = "institutionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            r71.a r2 = r2.f305582a
            w21.o r2 = (w21.o) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            to7.f r8 = new to7.f
            r9 = 23
            r8.<init>(r2, r6, r9)
            rfm.o r2 = new rfm.o
            r2.<init>(r8)
            java.lang.String r8 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            rfm.w r2 = te0.w.h0(r2)
            r0.v = r4
            java.lang.Object r2 = nim.a.i(r2, r0)
            if (r2 != r1) goto L5e
            goto L7a
        L5e:
            x61.c r2 = (x61.c) r2
            if (r2 == 0) goto L6c
            boolean r4 = r2.f303011b
            if (r4 == 0) goto L6c
            java.lang.String r1 = r2.f303010a
            r7.M2(r6, r5, r1)
            goto Lba
        L6c:
            r10.a r4 = r7.f72854s
            r0.u = r2
            r0.v = r3
            java.lang.String r3 = r0.z
            java.lang.Object r3 = r4.a0(r3, r0)
            if (r3 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r1 = r2
        L7c:
            cn6.g r3 = (cn6.g) r3
            r2 = 0
            if (r3 == 0) goto Lb7
            yki.i r8 = r7.f72858y
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$Step$Iban r9 = new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$Step$Iban
            com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData r10 = new com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.external_accounts.impl.R$string.external_institutions_iban_title
            r12 = 14
            r11.<init>(r4, r2, r2, r12)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.external_accounts.impl.R$string.external_institutions_iban_subtitle_with_bank_name
            java.lang.String r13 = r0.A
            java.util.List r13 = zhm.u.c(r13)
            r14 = 12
            r12.<init>(r4, r13, r2, r14)
            wi0.b r13 = r3.f25367a
            com.revolut.domain.models.beneficiary.BankFieldDefinition r14 = r3.f25368b
            if (r1 == 0) goto La7
            java.lang.String r2 = r1.f303010a
        La7:
            r15 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            r9.<init>(r6, r5, r10)
            r12 = 0
            r13 = 12
            r10 = 1
            r11 = 0
            oki.h.t2(r7, r8, r9, r10, r11, r12, r13)
            goto Lba
        Lb7:
            r7.M2(r6, r5, r2)
        Lba:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
