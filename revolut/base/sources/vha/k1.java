package vha;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class k1 implements pfe.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f289400a;

    public k1(gr6.e freelancerAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        this.f289400a = freelancerAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(vha.k1 r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof vha.i1
            if (r0 == 0) goto L13
            r0 = r9
            vha.i1 r0 = (vha.i1) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            vha.i1 r0 = new vha.i1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            int r4 = r0.z
            com.revolut.feature.tab.accounts.models.spaces.f[] r8 = r0.f289380y
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = r0.f289379x
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier$Pro r2 = r0.f289378w
            pie.l r5 = r0.v
            com.revolut.feature.tab.accounts.models.spaces.f[] r0 = r0.u
            yhm.o.b(r9)
            goto L72
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            yhm.o.b(r9)
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier$Pro r2 = com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier.Pro.f89750c
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.tab.accounts.api.R$string.account_switcher_section_pro_title
            r6 = 14
            r9.<init>(r5, r3, r3, r6)
            r5 = 2
            com.revolut.feature.tab.accounts.models.spaces.f[] r5 = new com.revolut.feature.tab.accounts.models.spaces.f[r5]
            pie.k r6 = pie.k.e
            r7 = 0
            r5[r7] = r6
            pie.l r6 = pie.l.e
            gr6.e r8 = r8.f289400a
            r0.u = r5
            r0.v = r6
            r0.f289378w = r2
            r0.f289379x = r9
            r0.f289380y = r5
            r0.z = r4
            r0.C = r4
            et6.l0 r8 = (et6.l0) r8
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r1 = r9
            r0 = r5
            r9 = r8
            r8 = r0
            r5 = r6
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7b
            r3 = r5
        L7b:
            r8[r4] = r3
            java.util.List r8 = zhm.v.m(r0)
            vfe.a r9 = new vfe.a
            r9.<init>(r1, r2, r8)
            java.util.List r8 = zhm.u.c(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.k1.b(vha.k1, gim.c):java.lang.Object");
    }

    @Override // pfe.h
    public final Flow a() {
        return new v0b.b(((et6.l0) this.f289400a).m(), this, 11);
    }
}
