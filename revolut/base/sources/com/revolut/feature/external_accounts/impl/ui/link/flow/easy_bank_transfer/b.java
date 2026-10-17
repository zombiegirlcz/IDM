package com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public x61.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f72976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f72978y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f72976w = eVar;
        this.f72977x = str;
        this.f72978y = str2;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f72976w, this.f72977x, this.f72978y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            java.lang.String r4 = r0.f72978y
            r5 = 1
            r6 = 0
            java.lang.String r7 = r0.f72977x
            com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e r8 = r0.f72976w
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L25
            if (r2 != r3) goto L1d
            x61.c r1 = r0.u
            yhm.o.b(r18)
            r3 = r18
            goto L7b
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            yhm.o.b(r18)
            r2 = r18
            goto L5f
        L2b:
            yhm.o.b(r18)
            oe6.a r2 = r8.f72987r
            xg6.j r2 = (xg6.j) r2
            r2.getClass()
            java.lang.String r9 = "institutionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            r71.a r2 = r2.f305582a
            w21.o r2 = (w21.o) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            to7.f r9 = new to7.f
            r10 = 23
            r9.<init>(r2, r7, r10)
            rfm.o r2 = new rfm.o
            r2.<init>(r9)
            java.lang.String r9 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            rfm.w r2 = te0.w.h0(r2)
            r0.v = r5
            java.lang.Object r2 = nim.a.i(r2, r0)
            if (r2 != r1) goto L5f
            goto L79
        L5f:
            x61.c r2 = (x61.c) r2
            if (r2 == 0) goto L6d
            boolean r5 = r2.f303011b
            if (r5 == 0) goto L6d
            java.lang.String r1 = r2.f303010a
            r8.J2(r7, r4, r1)
            goto Lb9
        L6d:
            r10.a r5 = r8.f72989t
            r0.u = r2
            r0.v = r3
            java.lang.Object r3 = r5.a0(r6, r0)
            if (r3 != r1) goto L7a
        L79:
            return r1
        L7a:
            r1 = r2
        L7b:
            cn6.g r3 = (cn6.g) r3
            if (r3 == 0) goto Lb6
            yki.i r9 = r8.v
            com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step$Iban r10 = new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step$Iban
            com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData r11 = new com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.external_accounts.impl.R$string.external_institutions_iban_title
            r5 = 14
            r12.<init>(r2, r6, r6, r5)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.external_accounts.impl.R$string.external_institutions_iban_subtitle_with_bank_name
            java.lang.String r5 = r0.z
            java.util.List r5 = zhm.u.c(r5)
            r14 = 12
            r13.<init>(r2, r5, r6, r14)
            wi0.b r14 = r3.f25367a
            com.revolut.domain.models.beneficiary.BankFieldDefinition r15 = r3.f25368b
            if (r1 == 0) goto La5
            java.lang.String r6 = r1.f303010a
        La5:
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r10.<init>(r7, r4, r11)
            r13 = 0
            r14 = 12
            r11 = 1
            r12 = 0
            oki.h.t2(r8, r9, r10, r11, r12, r13, r14)
            goto Lb9
        Lb6:
            r8.J2(r7, r4, r6)
        Lb9:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
