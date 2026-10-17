package ed0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wl2.a f124909a;

    public d(wl2.a backendFlowInteractor) {
        Intrinsics.checkNotNullParameter(backendFlowInteractor, "backendFlowInteractor");
        this.f124909a = backendFlowInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[Catch: Exception -> 0x0032, TryCatch #2 {Exception -> 0x0032, blocks: (B:12:0x002e, B:28:0x0061, B:30:0x0069, B:32:0x006c), top: B:44:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #2 {Exception -> 0x0032, blocks: (B:12:0x002e, B:28:0x0061, B:30:0x0069, B:32:0x006c), top: B:44:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // ed0.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ed0.a r17, com.revolut.feature.backend_flow.domain.models.StringValue r18, com.revolut.feature.backend_flow.domain.models.ExternalValidation r19, gim.c r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r20
            boolean r4 = r3 instanceof ed0.c
            if (r4 == 0) goto L1b
            r4 = r3
            ed0.c r4 = (ed0.c) r4
            int r5 = r4.f124908x
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f124908x = r5
            goto L20
        L1b:
            ed0.c r4 = new ed0.c
            r4.<init>(r1, r3)
        L20:
            java.lang.Object r3 = r4.v
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f124908x
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L3c
            if (r6 != r8) goto L34
            com.revolut.feature.backend_flow.domain.models.ExternalValidation r2 = r4.u
            yhm.o.b(r3)     // Catch: java.lang.Exception -> L32
            goto L61
        L32:
            r0 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3c:
            yhm.o.b(r3)
            java.lang.String r3 = r2.f63666a
            boolean r3 = kotlin.text.d0.W(r3)
            if (r3 == 0) goto L4d
            com.revolut.feature.backend_flow.domain.models.ValidationResult$Error r0 = new com.revolut.feature.backend_flow.domain.models.ValidationResult$Error
            r0.<init>(r7)
            return r0
        L4d:
            wl2.a r3 = r1.f124909a     // Catch: java.lang.Exception -> L83
            java.lang.String r6 = r0.f124905a     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = r0.f124906b     // Catch: java.lang.Exception -> L83
            r9 = r19
            r4.u = r9     // Catch: java.lang.Exception -> L80
            r4.f124908x = r8     // Catch: java.lang.Exception -> L80
            java.lang.Object r3 = r3.a(r6, r0, r2, r4)     // Catch: java.lang.Exception -> L80
            if (r3 != r5) goto L60
            return r5
        L60:
            r2 = r9
        L61:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L32
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L6c
            com.revolut.feature.backend_flow.domain.models.ValidationResult$Valid r0 = com.revolut.feature.backend_flow.domain.models.ValidationResult.Valid.f63719a     // Catch: java.lang.Exception -> L32
            return r0
        L6c:
            com.revolut.feature.backend_flow.domain.models.ValidationResult$Error r0 = new com.revolut.feature.backend_flow.domain.models.ValidationResult$Error     // Catch: java.lang.Exception -> L32
            com.revolut.core.ui_kit.models.TextClause r8 = new com.revolut.core.ui_kit.models.TextClause     // Catch: java.lang.Exception -> L32
            java.lang.String r9 = r2.f63437a     // Catch: java.lang.Exception -> L32
            r14 = 0
            r15 = 126(0x7e, float:1.77E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L32
            r0.<init>(r8)     // Catch: java.lang.Exception -> L32
            return r0
        L80:
            r0 = move-exception
        L81:
            r2 = r9
            goto L87
        L83:
            r0 = move-exception
            r9 = r19
            goto L81
        L87:
            zhm.h0 r3 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r7, r7, r0, r3)
            com.revolut.feature.backend_flow.domain.models.ValidationResult$Error r0 = new com.revolut.feature.backend_flow.domain.models.ValidationResult$Error
            com.revolut.core.ui_kit.models.TextClause r3 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r4 = r2.f63437a
            r9 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ed0.d.a(ed0.a, com.revolut.feature.backend_flow.domain.models.StringValue, com.revolut.feature.backend_flow.domain.models.ExternalValidation, gim.c):java.lang.Object");
    }
}
