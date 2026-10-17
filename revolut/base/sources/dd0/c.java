package dd0;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f113081a;

    public c(ImmutableMap validators) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        this.f113081a = validators;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, xl2.h0 r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof dd0.b
            if (r0 == 0) goto L13
            r0 = r13
            dd0.b r0 = (dd0.b) r0
            int r1 = r0.f113080x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113080x = r1
            goto L18
        L13:
            dd0.b r0 = new dd0.b
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113080x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.Ref$ObjectRef r11 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L29
            goto L76
        L29:
            r0 = move-exception
            r11 = r0
            goto L7b
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            yhm.o.b(r13)
            java.lang.String r13 = r12.getValue()
            if (r13 != 0) goto L3f
            java.lang.String r13 = ""
        L3f:
            com.revolut.feature.backend_flow.domain.models.StringValue r8 = new com.revolut.feature.backend_flow.domain.models.StringValue
            r8.<init>(r13)
            ed0.a r7 = new ed0.a
            java.lang.String r13 = r12.getF63233a()
            r7.<init>(r11, r13)
            java.util.List r11 = r12.z()     // Catch: java.lang.Exception -> L29
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Exception -> L29
            v0f.p r12 = new v0f.p     // Catch: java.lang.Exception -> L29
            r13 = 6
            r12.<init>(r11, r13)     // Catch: java.lang.Exception -> L29
            com.revolut.feature.backend_flow.domain.models.ValidationResult$Valid r11 = com.revolut.feature.backend_flow.domain.models.ValidationResult.Valid.f63719a     // Catch: java.lang.Exception -> L29
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Exception -> L29
            r5.<init>()     // Catch: java.lang.Exception -> L29
            r5.f186409a = r11     // Catch: java.lang.Exception -> L29
            ard.b0 r4 = new ard.b0     // Catch: java.lang.Exception -> L29
            r9 = 9
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L29
            r0.u = r5     // Catch: java.lang.Exception -> L29
            r0.f113080x = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r11 = r12.collect(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r11 != r1) goto L75
            return r1
        L75:
            r11 = r5
        L76:
            java.lang.Object r11 = r11.f186409a     // Catch: java.lang.Exception -> L29
            com.revolut.feature.backend_flow.domain.models.ValidationResult r11 = (com.revolut.feature.backend_flow.domain.models.ValidationResult) r11     // Catch: java.lang.Exception -> L29
            return r11
        L7b:
            zhm.h0 r12 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r13 = rd0.d.f253311a
            rd0.c r13 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r13, r0, r0, r11, r12)
            com.revolut.feature.backend_flow.domain.models.ValidationResult$Error r11 = new com.revolut.feature.backend_flow.domain.models.ValidationResult$Error
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.retail.common.ui.R$string.general_error_common
            r1 = 14
            r12.<init>(r13, r0, r0, r1)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dd0.c.a(java.lang.String, xl2.h0, gim.c):java.lang.Object");
    }
}
