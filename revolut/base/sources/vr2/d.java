package vr2;

import bnf.r;
import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import thf.m;
import tof.a3;
import tof.j1;
import tof.j5;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ur2.c f291465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f291466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f291467c;

    public d(ur2.c blockedMerchantsInteractor, m transactionTextResourcesMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f291465a = blockedMerchantsInteractor;
        this.f291466b = transactionTextResourcesMapper;
        this.f291467c = featureToggleInteractor;
    }

    public final Object a(a3 a3Var, gim.c cVar) {
        String strG = ((r) this.f291466b).g(a3Var);
        j5 j5Var = a3Var.f272605o1;
        boolean zF = false;
        if (((jte.d) this.f291467c).c(TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked.f91958c)) {
            j1 j1Var = j5Var != null ? j5Var.o : null;
            int i = j1Var == null ? -1 : a.f291460a[j1Var.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    zF = true;
                } else if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (j5Var != null) {
            zF = Intrinsics.f(j5Var.f272856n, Boolean.TRUE);
        }
        return b(a3Var, strG, zF, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(tof.a3 r5, java.lang.String r6, boolean r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof vr2.b
            if (r0 == 0) goto L13
            r0 = r8
            vr2.b r0 = (vr2.b) r0
            int r1 = r0.f291462x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291462x = r1
            goto L18
        L13:
            vr2.b r0 = new vr2.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291462x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L99
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r8)
            r8 = 0
            if (r7 == 0) goto L38
            return r8
        L38:
            boolean r7 = k71.k.P0(r5)
            if (r7 == 0) goto L44
            com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantDisallowedDestination r5 = new com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantDisallowedDestination
            r5.<init>(r6, r8, r3)
            return r5
        L44:
            java.lang.String r5 = r5.f272581b
            ur2.c r7 = r4.f291465a
            r7.getClass()
            java.lang.String r8 = "transactionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r8)
            or2.b r7 = r7.f282237b
            or2.g r7 = (or2.g) r7
            r7.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r8)
            com.revolut.feature.blocked_merchants.impl.data.network.BlockedMerchantsService r7 = r7.f228050c
            efm.k r5 = r7.getBlockDisallowedBottomSheet(r5)
            ood.o0 r7 = new ood.o0
            r8 = 29
            r7.<init>(r8)
            or2.e r8 = new or2.e
            r2 = 0
            r8.<init>(r7, r2)
            r5.getClass()
            rfm.m r7 = new rfm.m
            r2 = 1
            r7.<init>(r5, r8, r2)
            od0.h r5 = od0.i.Companion
            r5.getClass()
            od0.i r5 = od0.i.f224256b
            rfm.f0 r7 = r7.p(r5)
            java.lang.String r8 = "toSingle(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            pfm.z r5 = ue0.e.F(r7, r5)
            ufm.n r5 = te0.w.i0(r5)
            r0.u = r6
            r0.f291462x = r3
            java.lang.Object r8 = nim.a.b(r5, r0)
            if (r8 != r1) goto L99
            return r1
        L99:
            od0.i r8 = (od0.i) r8
            java.lang.Object r5 = r8.f224257a
            kr2.c r5 = (kr2.c) r5
            com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantDisallowedDestination r7 = new com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantDisallowedDestination
            r8 = 0
            r7.<init>(r6, r5, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.d.b(tof.a3, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tof.a3 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vr2.c
            if (r0 == 0) goto L13
            r0 = r6
            vr2.c r0 = (vr2.c) r0
            int r1 = r0.f291464x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291464x = r1
            goto L18
        L13:
            vr2.c r0 = new vr2.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291464x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tof.a3 r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f291464x = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.revolut.kompot.common.ParcelableDestination r6 = (com.revolut.kompot.common.ParcelableDestination) r6
            if (r6 != 0) goto L4a
            com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantTransactionFlowDestination r6 = new com.revolut.feature.blocked_merchants.api.navigation.BlockMerchantTransactionFlowDestination
            java.lang.String r5 = r5.f272581b
            r6.<init>(r5)
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.d.c(tof.a3, gim.c):java.lang.Object");
    }
}
