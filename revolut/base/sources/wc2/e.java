package wc2;

import com.revolut.feature.apm.core.models.alias.Alias;
import gim.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends n implements com.revolut.feature.apm.core.ui.api.navigation.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vw1.b f296321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wj0.a f296322m;

    public e(vw1.b repository, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f296321l = repository;
        this.f296322m = idempotencyKeyHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final fim.a Z2(com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wc2.d
            if (r0 == 0) goto L13
            r0 = r8
            wc2.d r0 = (wc2.d) r0
            int r1 = r0.f296320w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296320w = r1
            goto L18
        L13:
            wc2.d r0 = new wc2.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296320w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            return r4
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r8)
            zz1.k r8 = new zz1.k
            com.revolut.feature.apm.core.models.alias.AliasType r2 = r7.f61898a
            java.lang.String r7 = r7.f61899b
            zz1.j r5 = zz1.j.CREATE
            r8.<init>(r2, r7, r5)
            r0.f296320w = r3
            vw1.b r7 = r6.f296321l
            uy1.j r7 = (uy1.j) r7
            java.lang.Object r7 = r7.k(r8, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wc2.e.Z2(com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias, gim.c):fim.a");
    }

    @Override // com.revolut.feature.apm.core.ui.api.navigation.a
    public final Object b1(Alias alias, i iVar) {
        return pu7.a.B(this.e, "ALIAS_OPERATION_TASK_ID", new b(this, alias, null, 0), iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.revolut.feature.apm.core.ui.api.navigation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r22, com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode r23, kotlin.jvm.functions.Function1 r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc2.e.s0(com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias, com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
